package in.juspay.hypersdk.analytics;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.search.SearchAuth;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LogPusher {
    private static final String TAG = "LogPusher";
    private static TimerTask logPushTimerTask;
    private static final Map<String, LogChannel> channels = new HashMap();

    @NonNull
    private static final AtomicInteger logPusherNumCounter = new AtomicInteger(0);

    @NonNull
    private static final AtomicInteger logPushIteration = new AtomicInteger(1);
    private static int getLogsToPushErrorCounter = 0;
    private static int logFlushTimerTaskErrorCounter = 0;
    private static int logPushTimerTaskErrorCounter = 0;
    private static int setHeaderParametersErrorCounter = 0;
    private static boolean isSandboxEnv = false;
    private static boolean stopPushingLogs = false;

    @NonNull
    private static JSONObject channelsFromSdkConfig = new JSONObject();

    @NonNull
    private static JSONArray logChannelsConfig = new JSONArray();

    @NonNull
    private static Timer logPushTimer = new Timer();

    /* loaded from: classes2.dex */
    public static class IterableJSONArray implements Iterable<JSONObject> {
        JSONArray original;

        /* renamed from: in.juspay.hypersdk.analytics.LogPusher$IterableJSONArray$1 */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Iterator<JSONObject> {
            int curr = 0;

            public AnonymousClass1() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.curr < IterableJSONArray.this.original.length();
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            public JSONObject next() {
                try {
                    JSONArray jSONArray = IterableJSONArray.this.original;
                    int i10 = this.curr;
                    this.curr = i10 + 1;
                    return jSONArray.optJSONObject(i10);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return null;
                }
            }
        }

        public IterableJSONArray(JSONArray jSONArray) {
            this.original = jSONArray;
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<JSONObject> iterator() {
            return new Iterator<JSONObject>() { // from class: in.juspay.hypersdk.analytics.LogPusher.IterableJSONArray.1
                int curr = 0;

                public AnonymousClass1() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.curr < IterableJSONArray.this.original.length();
                }

                @Override // java.util.Iterator
                public void remove() {
                }

                @Override // java.util.Iterator
                public JSONObject next() {
                    try {
                        JSONArray jSONArray = IterableJSONArray.this.original;
                        int i10 = this.curr;
                        this.curr = i10 + 1;
                        return jSONArray.optJSONObject(i10);
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return null;
                    }
                }
            };
        }
    }

    /* loaded from: classes2.dex */
    public static class LogPushTimerTask extends TimerTask {
        private static final String TAG = "LogPushTimerTask";
        private static boolean isExceptionTracked = false;

        private LogPushTimerTask() {
        }

        public /* synthetic */ LogPushTimerTask(AnonymousClass1 anonymousClass1) {
            this();
        }

        public static /* synthetic */ void lambda$run$0() {
            if (LogConstants.shouldPush && LogUtils.isMinMemoryAvailable().booleanValue()) {
                int andIncrement = LogPusher.logPushIteration.getAndIncrement();
                for (Map.Entry entry : LogPusher.channels.entrySet()) {
                    LogChannel logChannel = (LogChannel) entry.getValue();
                    String str = (String) entry.getKey();
                    if (andIncrement % logChannel.getPriority() == 0) {
                        int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE + str);
                        int fromSharedPreference2 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + str);
                        if (JuspayCoreLib.getApplicationContext() != null && (fromSharedPreference2 - fromSharedPreference) + 1 > LogConstants.maxFilesAllowed) {
                            while ((fromSharedPreference2 - fromSharedPreference) + 1 > LogConstants.numFilesToLeaveIfMaxFilesExceeded) {
                                File file = LogUtils.getFile(LogConstants.PERSISTENT_LOGS_FILE + str + fromSharedPreference + ".dat");
                                if (file != null) {
                                    try {
                                        file.delete();
                                    } catch (Exception unused) {
                                    }
                                }
                                fromSharedPreference++;
                            }
                            LogUtils.writeToSharedPreference(a3.a.f(LogConstants.PERSISTENT_LOGS_READING_FILE, str), String.valueOf(fromSharedPreference));
                        }
                        while (logChannel.getLogsQueue().size() > 0) {
                            try {
                                JSONArray logsToPush = LogPusher.getLogsToPush(logChannel);
                                if (logsToPush.length() > 0) {
                                    int pushLogsToServer = LogPusher.pushLogsToServer(logsToPush, logChannel);
                                    if (pushLogsToServer == 200 || (logChannel.getRetryAttempts() != -1 && logChannel.getCurrentBatchRetryAttempts() >= logChannel.getRetryAttempts())) {
                                        logChannel.setCurrentBatchRetryAttempts(0);
                                        LogPusher.acknowledgeLogsPushed(logsToPush.length(), logChannel);
                                    }
                                    SdkTracker.trackBootAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.LOG_PUSHER, "error_response", HttpUrl.FRAGMENT_ENCODE_SET + pushLogsToServer);
                                    logChannel.setCurrentBatchRetryAttempts(logChannel.getCurrentBatchRetryAttempts() + 1);
                                    break;
                                }
                            } catch (Exception e10) {
                                if (!isExceptionTracked) {
                                    SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Error while creating the payload to post", e10);
                                }
                                isExceptionTracked = true;
                            }
                        }
                        int fromSharedPreference3 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + str);
                        if (JuspayCoreLib.getApplicationContext() != null) {
                            for (int fromSharedPreference4 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE + str); fromSharedPreference4 <= fromSharedPreference3; fromSharedPreference4++) {
                                new File(JuspayCoreLib.getApplicationContext().getCacheDir(), LogConstants.PERSISTENT_LOGS_FILE + str + fromSharedPreference4 + ".dat").delete();
                            }
                        }
                        LogUtils.writeToSharedPreference(a3.a.f(LogConstants.PERSISTENT_LOGS_READING_FILE, str), String.valueOf(0));
                        LogUtils.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + str, String.valueOf(0));
                    }
                }
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogsPool(new d(0));
        }
    }

    static {
        ExecutorManager.runOnLogsPool(new d(3));
    }

    public static void acknowledgeLogsPushed(int i10, LogChannel logChannel) {
        while (i10 > 0) {
            try {
                logChannel.pollLogsQueue();
                i10--;
            } catch (Exception e10) {
                logPushTimerTaskErrorCounter++;
                if (logPushTimerTaskErrorCounter <= 2) {
                    SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception in removal of logs from persisted Queue file", e10);
                    return;
                } else {
                    JuspayLogger.e(TAG, "Exception in removal of logs from persisted Queue file", e10);
                    return;
                }
            }
        }
    }

    private static boolean addChannel(String str, int i10, long j10, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i11, String str4, String str5) {
        Map<String, LogChannel> map2 = channels;
        boolean containsKey = map2.containsKey(str);
        LogChannel makeChannel = makeChannel(str, i10, j10, str2, str3, jSONObject, jSONObject2, map, i11, str4, str5);
        map2.put(str, makeChannel);
        if (!containsKey) {
            String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
            String anyFromSharedPreference = LogUtils.getAnyFromSharedPreference(LogConstants.LOG_CHANNEL_NAMES, HttpUrl.FRAGMENT_ENCODE_SET);
            StringBuilder p10 = da.e.p(anyFromSharedPreference);
            if (anyFromSharedPreference.length() != 0) {
                str6 = ",";
            }
            p10.append(str6);
            p10.append(str);
            LogUtils.writeToSharedPreference(LogConstants.LOG_CHANNEL_NAMES, p10.toString());
        }
        LogUtils.writeToSharedPreference(a3.a.f("LOG_CHANNEL_INFO_", str), makeChannel.toString());
        return true;
    }

    public static boolean addChannelFromJS(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return addChannel(str2, jSONObject.optInt("retryAttempts", LogConstants.maxRetryPerBatch), jSONObject.optLong("batchCount", LogConstants.maxLogsPerPush), jSONObject.optString("logsUrlKey", LogConstants.prodLogUrl), jSONObject.optString("logsUrlKeySandbox", LogConstants.sandboxLogUrl), jSONObject.has("publicKey") ? jSONObject.getJSONObject("publicKey") : LogConstants.publicKey, jSONObject.has("publicKeySandbox") ? jSONObject.getJSONObject("publicKeySandbox") : LogConstants.publicKeySandbox, jSONObject.has("channelHeaders") ? LogUtils.toMap(jSONObject.getJSONObject("channelHeaders")) : new HashMap(), jSONObject.optInt("priority", LogConstants.defaultPriority), jSONObject.optString(PaymentConstants.ENV, "all"), jSONObject.optString("encryptionLevelKey", LogConstants.encryptionLevel));
        } catch (JSONException unused) {
            return false;
        }
    }

    public static void addLogLines(Iterable<JSONObject> iterable) {
        if (stopPushingLogs) {
            return;
        }
        ExecutorManager.runOnLogsPool(new b(iterable, 0));
    }

    public static void addLogsFromSessioniser(Queue<JSONObject> queue) {
        ExecutorManager.runOnLogsPool(new b(queue, 1));
    }

    public static void addLogsToPersistedQueue(JSONObject jSONObject) {
        ExecutorManager.runOnLogsPool(new c(jSONObject, 0));
    }

    public static String[] getChannelNames() {
        return (String[]) channels.keySet().toArray(new String[0]);
    }

    private static LogChannel getChannelObject(String str) {
        Map<String, LogChannel> map = channels;
        if (!map.containsKey(str)) {
            str = LogConstants.DEFAULT_CHANNEL;
        }
        return map.get(str);
    }

    private static String getEndPoint(LogChannel logChannel) {
        return isSandboxEnv ? logChannel.getEndpointSBX() : logChannel.getEndPointProd();
    }

    private static JSONArray getLogChannels(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        if (jSONObject.has("channels")) {
            jSONArray = jSONObject.optJSONArray("channels");
        }
        if ((jSONArray == null || jSONArray.length() == 0) && jSONObject.has(AppsFlyerProperties.CHANNEL)) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObject.optString(AppsFlyerProperties.CHANNEL, LogConstants.DEFAULT_CHANNEL));
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            jSONArray = LogConstants.defaultChannels != null ? new JSONArray(LogConstants.defaultChannels.toString()) : new JSONArray();
            jSONArray.put(LogConstants.DEFAULT_CHANNEL);
        }
        return jSONArray;
    }

    private static RSAPublicKey getLogEncryptionKey(LogChannel logChannel) {
        try {
            return JOSEUtils.JWKtoRSAPublicKey(isSandboxEnv ? logChannel.getKeySBX() : logChannel.getKeyProd());
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getLogEncryptionLevel(LogChannel logChannel) {
        return logChannel.getEncryptionLevel();
    }

    public static JSONArray getLogsToPush(LogChannel logChannel) {
        JSONArray jSONArray = new JSONArray();
        Iterator<byte[]> it = logChannel.getLogsQueue().iterator();
        while (true) {
            if ((logChannel.getBatchCount() == -1 || jSONArray.length() < logChannel.getBatchCount()) && it.hasNext()) {
                try {
                    jSONArray.put(new JSONObject(new String(it.next())));
                } catch (JSONException e10) {
                    it.remove();
                    int i10 = getLogsToPushErrorCounter + 1;
                    getLogsToPushErrorCounter = i10;
                    if (i10 <= 2) {
                        SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Bad JSON while reading the Persisted Queue for Logs", e10);
                    } else {
                        JuspayLogger.e(TAG, "Bad JSON while reading the Persisted Queue for Logs", e10);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static /* synthetic */ void lambda$addLogLines$5(Iterable iterable) {
        FileOutputStream fileOutputStream;
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                try {
                    if (!shouldDropLog(jSONObject)) {
                        JSONArray logChannels = getLogChannels(jSONObject);
                        for (int i10 = 0; i10 < logChannels.length(); i10++) {
                            String string = logChannels.getString(i10);
                            if (channels.containsKey(string)) {
                                LogChannel channelObject = getChannelObject(string);
                                int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + string);
                                if (fromSharedPreference == -1) {
                                    fromSharedPreference = 0;
                                }
                                if (channelObject != null) {
                                    String str = jSONObject + LogConstants.LOG_DELIMITER;
                                    Charset charset = StandardCharsets.UTF_8;
                                    byte[] bytes = str.getBytes(charset);
                                    long fileLength = LogUtils.getFileLength(LogConstants.PERSISTENT_LOGS_FILE + string + fromSharedPreference + ".dat");
                                    channelObject.addToLogsQueue(jSONObject.toString().getBytes(charset));
                                    if (fileLength + bytes.length <= LogConstants.maxLogFileSize) {
                                        fileOutputStream = new FileOutputStream(LogUtils.getFile(LogConstants.PERSISTENT_LOGS_FILE + string + fromSharedPreference + ".dat"), true);
                                    } else if (bytes.length <= LogConstants.maxLogLineSize) {
                                        LogUtils.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + string, String.valueOf(fromSharedPreference));
                                        fileOutputStream = new FileOutputStream(LogUtils.getFile(LogConstants.PERSISTENT_LOGS_FILE + string + fromSharedPreference + ".dat"), true);
                                    }
                                    fileOutputStream.write(bytes);
                                    fileOutputStream.close();
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    int i11 = logFlushTimerTaskErrorCounter + 1;
                    logFlushTimerTaskErrorCounter = i11;
                    if (i11 <= 2) {
                        SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while flushing the logs to persisted queue file", e10);
                    }
                }
            }
        } catch (Exception e11) {
            int i12 = logFlushTimerTaskErrorCounter + 1;
            logFlushTimerTaskErrorCounter = i12;
            if (i12 <= 2) {
                SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while flushing the logs to persisted queue file", e11);
            }
        }
    }

    public static /* synthetic */ void lambda$addLogsFromSessioniser$4(Queue queue) {
        try {
            if (LogConstants.shouldPush) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    if (!shouldDropLog(jSONObject)) {
                        JSONArray logChannels = getLogChannels(jSONObject);
                        for (int i10 = 0; i10 < logChannels.length(); i10++) {
                            String string = logChannels.getString(i10);
                            if (channels.containsKey(string)) {
                                LogChannel channelObject = getChannelObject(string);
                                byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
                                if (bytes.length <= LogConstants.maxLogLineSize) {
                                    channelObject.addToLogsQueue(bytes);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void lambda$addLogsToPersistedQueue$3(JSONObject jSONObject) {
        if (LogConstants.shouldPush) {
            try {
                if (JuspayCoreLib.getApplicationContext() != null) {
                    File file = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), LogConstants.CRASH_LOGS_FILE);
                    byte[] bytes = (jSONObject.toString() + LogConstants.LOG_DELIMITER).getBytes(StandardCharsets.UTF_8);
                    if (bytes.length < LogConstants.maxLogLineSize) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        fileOutputStream.write(bytes);
                        fileOutputStream.close();
                    }
                }
            } catch (Exception e10) {
                JuspayLogger.e(TAG, "addLogsToPersistedQueue failed", e10);
            }
        }
    }

    public static /* synthetic */ void lambda$setHeaders$6(String str, JSONObject jSONObject) {
        LogChannel channelObject = getChannelObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                channelObject.getHeaders().put(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static /* synthetic */ void lambda$setLogHeaderValues$7(String str, JSONObject jSONObject) {
        LogChannel channelObject = getChannelObject(str);
        JSONObject jSONObject2 = LogConstants.logHeaders;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                String optString = jSONObject2.optString(next);
                int indexOf = optString.indexOf(36);
                int indexOf2 = optString.indexOf(123);
                int lastIndexOf = optString.lastIndexOf(125);
                if (indexOf != -1 && indexOf2 != -1 && lastIndexOf != -1 && indexOf2 - indexOf == 1 && indexOf2 < lastIndexOf) {
                    String substring = optString.substring(indexOf2 + 1, lastIndexOf);
                    String str2 = "${" + substring + UrlTreeKt.componentParamSuffix;
                    if (jSONObject.has(substring)) {
                        optString = optString.replace(str2, jSONObject.optString(substring));
                    }
                }
                channelObject.getHeaders().put(next, optString);
            } catch (Exception unused) {
                int i10 = setHeaderParametersErrorCounter + 1;
                setHeaderParametersErrorCounter = i10;
                if (i10 <= 2) {
                    SdkTracker.trackBootAction(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.WARNING, Labels.System.LOG_PUSHER, "sdk_config", "Unable log header properties in log headers");
                    return;
                }
                return;
            }
        }
    }

    public static /* synthetic */ void lambda$startLogPusherTimer$1() {
        if (LogConstants.shouldPush) {
            try {
                if (logPusherNumCounter.getAndIncrement() == 0) {
                    stopPushingLogs = false;
                    LogSessioniser.startLogSessioniser();
                    logPushTimer = new Timer();
                    LogPushTimerTask logPushTimerTask2 = new LogPushTimerTask();
                    logPushTimerTask = logPushTimerTask2;
                    Timer timer = logPushTimer;
                    long j10 = LogConstants.logPostInterval;
                    timer.scheduleAtFixedRate(logPushTimerTask2, j10, j10);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void lambda$static$0() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusher.lambda$static$0():void");
    }

    public static /* synthetic */ void lambda$stopLogPusherOnTerminate$2() {
        if (LogConstants.shouldPush) {
            AtomicInteger atomicInteger = logPusherNumCounter;
            if (atomicInteger.decrementAndGet() <= 0) {
                atomicInteger.set(0);
                try {
                    LogSessioniser.stopLogSessioniserOnTerminate();
                    logPushTimer.cancel();
                    logPushTimer = new Timer();
                    LogPushTimerTask logPushTimerTask2 = new LogPushTimerTask();
                    logPushTimerTask = logPushTimerTask2;
                    logPushTimerTask2.run();
                    stopPushingLogs = true;
                } catch (Exception unused) {
                }
            }
        }
    }

    private static LogChannel makeChannel(String str, int i10, long j10, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i11, String str4, String str5) {
        return new LogChannel(i10, j10, str, str2, str3, jSONObject, jSONObject2, map, i11, str4, str5);
    }

    private static void pushAllFiles(int i10, int i11, LogChannel logChannel) {
        while (i10 <= i11) {
            File file = LogUtils.getFile(LogConstants.PERSISTENT_LOGS_FILE + logChannel.getChannelName() + i10 + ".dat");
            if (file != null) {
                if (file.exists() && LogUtils.isFileEligibleToPush(file)) {
                    pushFileContentToServer(file, logChannel);
                } else {
                    file.delete();
                }
            }
            i10++;
        }
        if (JuspayCoreLib.getApplicationContext() != null) {
            LogChannel channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
            File file2 = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), LogConstants.CRASH_LOGS_FILE);
            if (file2.exists() && LogUtils.isFileEligibleToPush(file2)) {
                pushFileContentToServer(file2, channelObject);
            } else {
                file2.delete();
            }
        }
    }

    private static void pushFileContentToServer(File file, LogChannel logChannel) {
        if (file != null) {
            Queue<JSONObject> logsFromFile = LogUtils.getLogsFromFile(file);
            try {
                JSONArray jSONArray = new JSONArray();
                boolean z10 = true;
                while (logsFromFile.size() > 0) {
                    while (true) {
                        if ((logChannel.getBatchCount() == -1 || jSONArray.length() < logChannel.getBatchCount()) && logsFromFile.size() > 0) {
                            jSONArray.put(logsFromFile.poll());
                        }
                    }
                    if (pushLogsToServer(jSONArray, logChannel) != 200) {
                        z10 = false;
                    }
                    jSONArray = new JSONArray();
                }
                if (z10) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static int pushLogsToServer(JSONArray jSONArray, LogChannel logChannel) {
        JuspayHttpsResponse juspayHttpsResponse;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", jSONArray);
        byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        String logEncryptionLevel = getLogEncryptionLevel(logChannel);
        RSAPublicKey logEncryptionKey = getLogEncryptionKey(logChannel);
        NetUtils netUtils = new NetUtils(SearchAuth.StatusCodes.AUTH_DISABLED, SearchAuth.StatusCodes.AUTH_DISABLED);
        Map<String, String> headers = logChannel.getHeaders();
        headers.put("x-logscount", String.valueOf(jSONArray.length()));
        headers.put(AppsFlyerProperties.CHANNEL, logChannel.getChannelName());
        if ("encryption".equals(logEncryptionLevel) && logEncryptionKey != null) {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), EncryptionHelper.gzipThenEncrypt(bytes, logEncryptionKey), "application/x-godel-gzip-pubkey-encrypted", headers, new JSONObject()));
        } else if ("gzip".equals(logEncryptionLevel)) {
            byte[] gzipContent = Utils.gzipContent(bytes);
            headers.put("Content-Encoding", "gzip");
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), gzipContent, "application/gzip", headers, new JSONObject()));
        } else {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), bytes, "application/json", headers, new JSONObject()));
        }
        return juspayHttpsResponse.responseCode;
    }

    private static void pushOldChannelLogs(LogChannel logChannel) {
        int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE + logChannel.getChannelName());
        int i10 = 0;
        if (fromSharedPreference == -1) {
            LogUtils.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE + logChannel.getChannelName(), String.valueOf(0));
            fromSharedPreference = 0;
        }
        int fromSharedPreference2 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + logChannel.getChannelName());
        if (fromSharedPreference2 == -1) {
            LogUtils.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE + logChannel.getChannelName(), String.valueOf(0));
        } else {
            i10 = fromSharedPreference2;
        }
        pushAllFiles(fromSharedPreference, i10, logChannel);
    }

    public static void setEndPointSandbox(Boolean bool) {
        isSandboxEnv = bool.booleanValue();
    }

    public static void setHeaders(JSONObject jSONObject, String str) {
        ExecutorManager.runOnLogsPool(new a(str, jSONObject, 0));
    }

    public static void setLogHeaderValues(JSONObject jSONObject, String str) {
        ExecutorManager.runOnLogsPool(new a(str, jSONObject, 1));
    }

    private static boolean shouldDropLog(JSONObject jSONObject) {
        try {
            if (jSONObject.has(AppsFlyerProperties.CHANNEL)) {
                return !channels.containsKey(jSONObject.getString(AppsFlyerProperties.CHANNEL));
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static void startLogPusherTimer() {
        ExecutorManager.runOnLogsPool(new d(5));
    }

    public static void stopLogPusherOnTerminate() {
        ExecutorManager.runOnLogsPool(new d(4));
    }

    public static void addLogLines(JSONArray jSONArray) {
        if (stopPushingLogs || !LogConstants.shouldPush) {
            return;
        }
        addLogLines(new IterableJSONArray(jSONArray));
    }
}
