package in.juspay.hypersdk.analytics;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.search.SearchAuth;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
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
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yk.v;

/* loaded from: classes2.dex */
public class LogPusherExp {
    private static final String TAG = "LogPusher";
    private static TimerTask logPushTimerTask;
    private static final ConcurrentHashMap<String, LogChannelExp> channels = new ConcurrentHashMap<>();

    @NonNull
    private static final AtomicInteger logPusherNumCounter = new AtomicInteger(0);
    private static int logFlushTimerTaskErrorCounter = 0;
    private static int setHeaderParametersErrorCounter = 0;
    private static boolean isSandboxEnv = false;

    @NonNull
    private static Timer logPushTimer = new Timer();
    private static final ConcurrentHashMap<String, Integer> fileCountMap = new ConcurrentHashMap<>();

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
            File fileExp;
            File fileExp2;
            if (LogConstants.shouldPush && LogUtils.isMinMemoryAvailable().booleanValue()) {
                Iterator it = LogPusherExp.channels.entrySet().iterator();
                while (it.hasNext()) {
                    LogChannelExp logChannelExp = (LogChannelExp) ((Map.Entry) it.next()).getValue();
                    LogPusherExp.checkFolderLimit();
                    try {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> it2 = logChannelExp.getLogsQueueExp().iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            if (next.contains(".ndjson") && (fileExp2 = LogUtils.getFileExp(next)) != null && fileExp2.exists()) {
                                arrayList.add(fileExp2);
                            }
                        }
                        LogPusherExp.pushNdJsonFiles(arrayList, logChannelExp, true);
                        arrayList.clear();
                        Iterator<String> it3 = logChannelExp.getLogsQueueExp().iterator();
                        while (it3.hasNext()) {
                            String next2 = it3.next();
                            if (next2.contains(".dat") && (fileExp = LogUtils.getFileExp(next2)) != null && fileExp.exists()) {
                                arrayList.add(fileExp);
                            }
                        }
                        LogPusherExp.pushDatFiles(arrayList, logChannelExp, true);
                    } catch (Exception e10) {
                        if (!isExceptionTracked) {
                            SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Error while creating the payload to post", e10);
                        }
                        isExceptionTracked = true;
                    }
                }
                for (Map.Entry entry : LogPusherExp.channels.entrySet()) {
                    LogPusherExp.pushChannelFiles((String) entry.getKey(), (LogChannelExp) entry.getValue());
                }
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogPusherThread(new d(1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0297 A[SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusherExp.<clinit>():void");
    }

    private static void acknowledgeLogsPushed(ArrayList<String> arrayList, LogChannelExp logChannelExp) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            logChannelExp.pollLogsQueue(it.next());
        }
    }

    private static boolean addChannel(String str, int i10, long j10, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i11, String str4, String str5, JSONArray jSONArray, JSONArray jSONArray2, String str6) {
        ConcurrentHashMap<String, LogChannelExp> concurrentHashMap = channels;
        boolean containsKey = concurrentHashMap.containsKey(str);
        LogChannelExp makeChannel = makeChannel(str, i10, j10, str2, str3, jSONObject, jSONObject2, map, i11, str4, str5, jSONArray, jSONArray2, str6);
        concurrentHashMap.put(str, makeChannel);
        if (!containsKey) {
            String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
            String anyFromSharedPreference = LogUtils.getAnyFromSharedPreference(LogConstants.LOG_CHANNEL_NAMES, HttpUrl.FRAGMENT_ENCODE_SET);
            StringBuilder p10 = da.e.p(anyFromSharedPreference);
            if (anyFromSharedPreference.length() != 0) {
                str7 = ",";
            }
            p10.append(str7);
            p10.append(str);
            LogUtils.writeToSharedPreference(LogConstants.LOG_CHANNEL_NAMES, p10.toString());
        }
        LogUtils.writeToSharedPreference(a3.a.f("LOG_CHANNEL_INFO_", str), makeChannel.toString());
        return true;
    }

    public static boolean addChannelFromJS(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return addChannel(str2, jSONObject.optInt("retryAttempts", LogConstants.maxRetryPerBatch), jSONObject.optLong("batchCount", LogConstants.maxLogsPerPush), jSONObject.optString("endPointProd", LogConstants.prodLogUrl), jSONObject.optString("endpointSBX", LogConstants.sandboxLogUrl), jSONObject.has("keyProd") ? jSONObject.getJSONObject("keyProd") : LogConstants.publicKey, jSONObject.has("keySBX") ? jSONObject.getJSONObject("keySBX") : LogConstants.publicKeySandbox, jSONObject.has("channelHeaders") ? LogUtils.toMap(jSONObject.getJSONObject("channelHeaders")) : new HashMap(), jSONObject.optInt("priority", LogConstants.defaultPriority), jSONObject.optString(PaymentConstants.ENV, "all"), jSONObject.optString("encryptionLevel", LogConstants.encryptionLevel), jSONObject.has("fallBackUrls") ? jSONObject.optJSONArray("fallBackUrls") : LogConstants.fallBackUrl, jSONObject.has("fallBackPublicKeys") ? jSONObject.optJSONArray("fallBackPublicKeys") : LogConstants.fallBackPublicKeys, jSONObject.optString("errorUrl", LogConstants.errorUrl));
        } catch (JSONException unused) {
            return false;
        }
    }

    public static void addLogLines(String str, String str2) {
        ExecutorManager.runOnLogPusherThread(new v(str, str2, 2));
    }

    public static void addLogsToPersistedQueue(JSONObject jSONObject) {
        ExecutorManager.runOnLogSessioniserThread(new c(jSONObject, 1));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Comparator] */
    public static void checkFolderLimit() {
        File[] listFiles;
        File fileExp = LogUtils.getFileExp(HttpUrl.FRAGMENT_ENCODE_SET);
        if (fileExp != null && fileExp.exists() && (listFiles = fileExp.listFiles()) != null) {
            long j10 = 0;
            for (File file : listFiles) {
                if (file != null && file.exists() && file.isFile()) {
                    j10 = file.length() + j10;
                }
            }
            if (j10 < LogConstants.folderSizeLimit) {
                return;
            }
            Arrays.sort(listFiles, new Object());
            long j11 = (long) (LogConstants.folderSizeLimit * 0.8d);
            for (File file2 : listFiles) {
                if (file2 != null && file2.exists() && file2.isFile()) {
                    file2.delete();
                    j10 -= file2.length();
                }
                if (j10 <= j11) {
                    return;
                }
            }
        }
    }

    public static int getBatchNum(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int i10 = lastIndexOf - 5;
        return Integer.parseInt(str.charAt(i10) == '-' ? str.substring(lastIndexOf - 8, i10) : str.substring(lastIndexOf - 3, lastIndexOf));
    }

    private static JSONArray getBatchNumArray(ArrayList<String> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(getBatchNum(it.next()));
        }
        return jSONArray;
    }

    public static String[] getChannelNames() {
        return (String[]) channels.keySet().toArray(new String[0]);
    }

    private static LogChannelExp getChannelObject(String str) {
        ConcurrentHashMap<String, LogChannelExp> concurrentHashMap = channels;
        if (!concurrentHashMap.containsKey(str)) {
            str = LogConstants.DEFAULT_CHANNEL;
        }
        return concurrentHashMap.get(str);
    }

    private static String getEndPoint(LogChannelExp logChannelExp) {
        return isSandboxEnv ? logChannelExp.getEndpointSBX() : logChannelExp.getEndPointProd();
    }

    private static int getFileCount(String str, File file) {
        Integer num;
        ConcurrentHashMap<String, Integer> concurrentHashMap = fileCountMap;
        if (concurrentHashMap.containsKey(str) && (num = concurrentHashMap.get(str)) != null) {
            return num.intValue();
        }
        int lastIndexOf = str.lastIndexOf(46);
        int parseInt = str.charAt(lastIndexOf + (-5)) == '-' ? Integer.parseInt(str.substring(lastIndexOf - 4, lastIndexOf)) : traverseTheFile(str, file);
        concurrentHashMap.put(str, Integer.valueOf(parseInt));
        return parseInt;
    }

    private static c4.d getFilesContent(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            String next = it.next();
            File fileExp = LogUtils.getFileExp(next);
            if (fileExp != null && fileExp.exists() && fileExp.length() > 0) {
                byte[] logsFromFileExp = LogUtils.getLogsFromFileExp(fileExp);
                i10 += logsFromFileExp.length;
                arrayList2.add(logsFromFileExp);
                i11 += getFileCount(next, fileExp);
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            allocate.put((byte[]) it2.next());
        }
        return new c4.d(allocate.array(), Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v9, types: [org.json.JSONObject] */
    private static JSONObject getFirstLog(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.contains(".ndjson")) {
                str = LogUtils.getFileExp(str);
                BufferedReader bufferedReader = new BufferedReader(new FileReader((File) str));
                try {
                    str = new JSONObject(bufferedReader.readLine());
                    bufferedReader.close();
                    return str;
                } catch (Throwable th2) {
                    bufferedReader.close();
                    throw th2;
                }
            }
            if (str.contains(".dat")) {
                byte[] bArr = new byte[4];
                str = LogUtils.getFileExp(str);
                if (str != 0 && str.exists()) {
                    ?? fileInputStream = new FileInputStream((File) str);
                    try {
                        fileInputStream.read(bArr);
                        ByteBuffer allocate = ByteBuffer.allocate(4);
                        allocate.put(bArr);
                        allocate.rewind();
                        int i10 = allocate.getInt();
                        if (i10 < 102400) {
                            str = new byte[i10];
                            fileInputStream.read(str);
                            JSONObject jSONObject2 = new JSONObject(new String((byte[]) str, StandardCharsets.UTF_8));
                            fileInputStream.close();
                            return jSONObject2;
                        }
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        fileInputStream.close();
                        throw th3;
                    }
                }
            }
            return jSONObject;
        } catch (Throwable th4) {
            str.addSuppressed(th4);
            throw str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.interfaces.RSAPublicKey getLogEncryptionKey(in.juspay.hypersdk.analytics.LogChannelExp r2, int r3) {
        /*
            org.json.JSONArray r0 = r2.getFallBackPublicKeys()
            int r0 = r0.length()
            r1 = 0
            if (r0 == 0) goto L18
            if (r3 < 0) goto L18
            org.json.JSONArray r0 = r2.getFallBackPublicKeys()     // Catch: java.lang.Exception -> L18
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L18
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r3 = r1
        L19:
            if (r3 != 0) goto L28
            boolean r3 = in.juspay.hypersdk.analytics.LogPusherExp.isSandboxEnv
            if (r3 == 0) goto L24
            org.json.JSONObject r3 = r2.getKeySBX()
            goto L28
        L24:
            org.json.JSONObject r3 = r2.getKeyProd()
        L28:
            java.security.interfaces.RSAPublicKey r2 = in.juspay.hypersdk.security.JOSEUtils.JWKtoRSAPublicKey(r3)     // Catch: java.lang.Exception -> L2d
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusherExp.getLogEncryptionKey(in.juspay.hypersdk.analytics.LogChannelExp, int):java.security.interfaces.RSAPublicKey");
    }

    private static String getLogEncryptionLevel(LogChannelExp logChannelExp) {
        return logChannelExp.getEncryptionLevel();
    }

    private static void hitErrorUrl(String str, LogChannelExp logChannelExp, int i10) {
        try {
            if (Objects.equals(logChannelExp.getErrorUrl(), HttpUrl.FRAGMENT_ENCODE_SET)) {
                return;
            }
            JSONObject firstLog = getFirstLog(str);
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("session_id", firstLog.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET));
                hashMap.put("start_with", String.valueOf(firstLog.optInt("sn", 0)));
                ConcurrentHashMap<String, Integer> concurrentHashMap = fileCountMap;
                hashMap.put("total_count", concurrentHashMap.containsKey(str) ? String.valueOf(concurrentHashMap.get(str)) : "unknown");
                hashMap.put("channel_name", logChannelExp.getChannelName());
                hashMap.put("response_code", String.valueOf(i10));
            } catch (Exception unused) {
            }
            new NetUtils(30000, 30000).doGet(logChannelExp.getErrorUrl(), new HashMap(), hashMap, new JSONObject()).getResponseCode();
        } catch (Exception unused2) {
        }
    }

    public static /* synthetic */ void lambda$addLogLines$3(String str, String str2) {
        if (LogConstants.shouldPush) {
            try {
                LogChannelExp channelObject = getChannelObject(str);
                if (channelObject == null) {
                    channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
                }
                File fileExp = LogUtils.getFileExp(str2);
                if (fileExp == null || !fileExp.exists() || fileExp.length() <= 0) {
                    return;
                }
                channelObject.addToLogsQueue(str2);
            } catch (Exception e10) {
                int i10 = logFlushTimerTaskErrorCounter + 1;
                logFlushTimerTaskErrorCounter = i10;
                if (i10 <= 2) {
                    SdkTracker.trackAndLogBootException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while flushing the logs to persisted queue file", e10);
                }
            }
        }
    }

    public static /* synthetic */ void lambda$addLogsToPersistedQueue$2(JSONObject jSONObject) {
        if (LogConstants.shouldPush) {
            try {
                LogUtils.writeLogToFileExp(jSONObject, LogUtils.getFileExp(LogConstants.CRASH_LOGS_FILE));
            } catch (Exception e10) {
                JuspayLogger.e(TAG, "addLogsToPersistedQueue failed", e10);
            }
        }
    }

    public static /* synthetic */ int lambda$checkFolderLimit$4(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    public static /* synthetic */ boolean lambda$pushChannelFiles$5(String str, File file, String str2) {
        return str2.contains(str);
    }

    public static /* synthetic */ void lambda$static$0(String str, LogChannelExp logChannelExp) {
        pushChannelFiles(str, logChannelExp);
        LogUtils.removeFromSharedPreference("LOG_CHANNEL_INFO_" + str);
    }

    public static /* synthetic */ void lambda$static$1() {
        pushChannelFiles(LogConstants.DEFAULT_CHANNEL, channels.get(LogConstants.DEFAULT_CHANNEL));
    }

    private static LogChannelExp makeChannel(String str, int i10, long j10, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i11, String str4, String str5, JSONArray jSONArray, JSONArray jSONArray2, String str6) {
        return new LogChannelExp(i10, j10, str, str2, str3, jSONObject, jSONObject2, map, i11, str4, str5, jSONArray, jSONArray2, str6);
    }

    public static void pushChannelFiles(final String str, LogChannelExp logChannelExp) {
        try {
            File fileExp = LogUtils.getFileExp(HttpUrl.FRAGMENT_ENCODE_SET);
            if (fileExp != null && fileExp.exists() && fileExp.isDirectory()) {
                File[] listFiles = fileExp.listFiles(new FilenameFilter() { // from class: in.juspay.hypersdk.analytics.e
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str2) {
                        boolean lambda$pushChannelFiles$5;
                        lambda$pushChannelFiles$5 = LogPusherExp.lambda$pushChannelFiles$5(str, file, str2);
                        return lambda$pushChannelFiles$5;
                    }
                });
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file != null && file.exists() && file.isFile()) {
                            if (file.length() <= 0 || !LogUtils.isFileEligibleToPush(file)) {
                                file.delete();
                            } else if (file.getName().contains(".ndjson")) {
                                arrayList.add(file);
                            } else {
                                arrayList2.add(file);
                            }
                        }
                    }
                }
                pushNdJsonFiles(arrayList, logChannelExp, false);
                pushDatFiles(arrayList2, logChannelExp, false);
            }
        } catch (Exception unused) {
        }
    }

    public static void pushCrashLogFile() {
        if (JuspayCoreLib.getApplicationContext() != null) {
            LogChannelExp channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
            File fileExp = LogUtils.getFileExp(LogConstants.CRASH_LOGS_FILE);
            if (fileExp == null || !fileExp.exists()) {
                return;
            }
            if (fileExp.length() <= 0 || !LogUtils.isFileEligibleToPush(fileExp)) {
                fileExp.delete();
            } else {
                pushFileContentToServer(fileExp, channelObject);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        if (r14 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        r0.add(r1.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r14 != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void pushDatFiles(java.util.ArrayList<java.io.File> r12, in.juspay.hypersdk.analytics.LogChannelExp r13, boolean r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb8
            r0.<init>()     // Catch: java.lang.Exception -> Lb8
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> Lb8
        L9:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Exception -> Lb8
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Exception -> Lb8
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> Lb8
            if (r1 == 0) goto La8
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> Lb8
            if (r2 == 0) goto La8
            long r2 = r1.length()     // Catch: java.lang.Exception -> Lb8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto La8
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Exception -> Lb8
            long r6 = r1.length()     // Catch: java.lang.Exception -> Lb8
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto La0
            byte[] r3 = in.juspay.hypersdk.analytics.LogUtils.getLogsFromFileExp(r1)     // Catch: java.lang.Exception -> Lb8
            int r4 = getFileCount(r2, r1)     // Catch: java.lang.Exception -> Lb8
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lb8
            r5.<init>()     // Catch: java.lang.Exception -> Lb8
            int r6 = getBatchNum(r2)     // Catch: java.lang.Exception -> Lb8
            org.json.JSONArray r5 = r5.put(r6)     // Catch: java.lang.Exception -> Lb8
            r6 = 0
            int r3 = pushLogsToServer(r3, r4, r5, r13, r6)     // Catch: java.lang.Exception -> Lb8
            r4 = -1
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 == r5) goto L7a
            int r7 = r13.getRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            if (r7 == r4) goto L62
            int r7 = r13.getCurrentBatchRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            int r8 = r13.getRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            if (r7 >= r8) goto L7a
        L62:
            java.lang.String r7 = "system"
            java.lang.String r8 = "error"
            java.lang.String r9 = "log_pusher"
            java.lang.String r10 = "error_response"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lb8
            in.juspay.hypersdk.core.SdkTracker.trackBootAction(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lb8
            int r7 = r13.getCurrentBatchRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            int r7 = r7 + 1
            r13.setCurrentBatchRetryAttempts(r7)     // Catch: java.lang.Exception -> Lb8
        L7a:
            int r7 = r13.getRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            if (r7 == r4) goto L95
            int r4 = r13.getCurrentBatchRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            int r7 = r13.getRetryAttempts()     // Catch: java.lang.Exception -> Lb8
            if (r4 < r7) goto L95
            hitErrorUrl(r2, r13, r3)     // Catch: java.lang.Exception -> Lb8
            r13.setCurrentBatchRetryAttempts(r6)     // Catch: java.lang.Exception -> Lb8
            if (r14 == 0) goto L95
            r0.add(r2)     // Catch: java.lang.Exception -> Lb8
        L95:
            if (r3 != r5) goto L9
            r13.setCurrentBatchRetryAttempts(r6)     // Catch: java.lang.Exception -> Lb8
            if (r14 == 0) goto La3
        L9c:
            r0.add(r2)     // Catch: java.lang.Exception -> Lb8
            goto La3
        La0:
            if (r14 == 0) goto La3
            goto L9c
        La3:
            r1.delete()     // Catch: java.lang.Exception -> Lb8
            goto L9
        La8:
            if (r1 == 0) goto L9
            if (r14 == 0) goto L9
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> Lb8
            r0.add(r1)     // Catch: java.lang.Exception -> Lb8
            goto L9
        Lb5:
            acknowledgeLogsPushed(r0, r13)     // Catch: java.lang.Exception -> Lb8
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusherExp.pushDatFiles(java.util.ArrayList, in.juspay.hypersdk.analytics.LogChannelExp, boolean):void");
    }

    private static void pushFileContentToServer(File file, LogChannelExp logChannelExp) {
        try {
            if (pushLogsToServer(LogUtils.getLogsFromFileExp(file), getFileCount(file.getName(), file), new JSONArray().put(1), logChannelExp, false) == 200) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    private static int pushLogsToServer(byte[] bArr, int i10, JSONArray jSONArray, LogChannelExp logChannelExp, boolean z10) {
        JuspayHttpsResponse juspayHttpsResponse;
        int currentBatchRetryAttempts;
        String logEncryptionLevel = getLogEncryptionLevel(logChannelExp);
        RSAPublicKey logEncryptionKey = getLogEncryptionKey(logChannelExp, logChannelExp.getRetryAttempts() - 1);
        NetUtils netUtils = new NetUtils(SearchAuth.StatusCodes.AUTH_DISABLED, SearchAuth.StatusCodes.AUTH_DISABLED);
        Map<String, String> headers = logChannelExp.getHeaders();
        headers.put("x-logscount", String.valueOf(i10));
        headers.put(AppsFlyerProperties.CHANNEL, logChannelExp.getChannelName());
        headers.put("x-log-format", z10 ? "ndjson" : "byte-d-json");
        headers.put("x-batch-no", jSONArray.toString());
        String endPoint = getEndPoint(logChannelExp);
        JSONArray fallBackUrls = logChannelExp.getFallBackUrls();
        if (fallBackUrls.length() != 0 && (currentBatchRetryAttempts = logChannelExp.getCurrentBatchRetryAttempts()) > 0) {
            endPoint = fallBackUrls.getString((currentBatchRetryAttempts - 1) % fallBackUrls.length());
        }
        if ("encryption".equals(logEncryptionLevel) && logEncryptionKey != null) {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), EncryptionHelper.gzipThenEncryptExp(bArr, logEncryptionKey, headers), "application/x-godel-gzip-pubkey-encrypted", headers, new JSONObject()));
        } else if ("gzip".equals(logEncryptionLevel)) {
            byte[] gzipContent = Utils.gzipContent(bArr);
            headers.put("Content-Encoding", "gzip");
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), gzipContent, "application/gzip", headers, new JSONObject()));
        } else {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), bArr, "application/json", headers, new JSONObject()));
        }
        return juspayHttpsResponse.responseCode;
    }

    public static void pushNdJsonFiles(ArrayList<File> arrayList, LogChannelExp logChannelExp, boolean z10) {
        try {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i10 >= arrayList.size()) {
                    acknowledgeLogsPushed(arrayList2, logChannelExp);
                    return;
                }
                long j10 = 0;
                while (i10 < arrayList.size()) {
                    File file = arrayList.get(i10);
                    if (file != null && file.exists()) {
                        int fileCount = getFileCount(file.getName(), file);
                        if (j10 != 0 && fileCount + j10 > logChannelExp.getBatchCount()) {
                            break;
                        } else {
                            j10 += fileCount;
                        }
                    }
                    i10++;
                }
                if (j10 != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = i11; i12 < i10; i12++) {
                        arrayList3.add(arrayList.get(i12).getName());
                    }
                    c4.d filesContent = getFilesContent(arrayList3);
                    JSONArray batchNumArray = getBatchNumArray(arrayList3);
                    Object obj = filesContent.f7942a;
                    if (obj == null || ((byte[]) obj).length <= 0) {
                        while (i11 < i10) {
                            if (z10) {
                                arrayList2.add(arrayList.get(i11).getName());
                            }
                            arrayList.get(i11).delete();
                            i11++;
                        }
                    } else {
                        byte[] bArr = (byte[]) obj;
                        Object obj2 = filesContent.f7943b;
                        int pushLogsToServer = pushLogsToServer(bArr, obj2 == null ? 1 : ((Integer) obj2).intValue(), batchNumArray, logChannelExp, true);
                        if (pushLogsToServer != 200 && (logChannelExp.getRetryAttempts() == -1 || logChannelExp.getCurrentBatchRetryAttempts() < logChannelExp.getRetryAttempts())) {
                            SdkTracker.trackBootAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.LOG_PUSHER, "error_response", Integer.valueOf(pushLogsToServer));
                            logChannelExp.setCurrentBatchRetryAttempts(logChannelExp.getCurrentBatchRetryAttempts() + 1);
                        }
                        if (logChannelExp.getRetryAttempts() != -1 && logChannelExp.getCurrentBatchRetryAttempts() >= logChannelExp.getRetryAttempts()) {
                            for (int i13 = i11; i13 < i10; i13++) {
                                String name = arrayList.get(i13).getName();
                                hitErrorUrl(name, logChannelExp, pushLogsToServer);
                                if (z10) {
                                    arrayList2.add(name);
                                }
                            }
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                        }
                        if (pushLogsToServer == 200) {
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                            while (i11 < i10) {
                                if (z10) {
                                    arrayList2.add(arrayList.get(i11).getName());
                                }
                                arrayList.get(i11).delete();
                                i11++;
                            }
                        }
                    }
                } else {
                    while (i11 < i10) {
                        if (z10) {
                            arrayList2.add(arrayList.get(i11).getName());
                        }
                        arrayList.get(i11).delete();
                        i11++;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void setEndPointSandbox(Boolean bool) {
        isSandboxEnv = bool.booleanValue();
    }

    public static void setHeaders(JSONObject jSONObject, String str) {
        LogChannelExp channelObject = getChannelObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                channelObject.getHeaders().put(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static void setLogHeaderValues(JSONObject jSONObject, String str) {
        LogChannelExp channelObject = getChannelObject(str);
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

    public static void startLogPusher() {
        if (LogConstants.shouldPush) {
            try {
                if (logPusherNumCounter.getAndIncrement() == 0) {
                    logPushTimer = new Timer();
                    LogPushTimerTask logPushTimerTask2 = new LogPushTimerTask();
                    logPushTimerTask = logPushTimerTask2;
                    logPushTimer.scheduleAtFixedRate(logPushTimerTask2, 0L, LogConstants.logPostInterval);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void stopLogPusherOnTerminate() {
        if (LogConstants.shouldPush) {
            AtomicInteger atomicInteger = logPusherNumCounter;
            if (atomicInteger.decrementAndGet() <= 0) {
                atomicInteger.set(0);
                try {
                    logPushTimer.cancel();
                    logPushTimer = new Timer();
                    LogPushTimerTask logPushTimerTask2 = new LogPushTimerTask();
                    logPushTimerTask = logPushTimerTask2;
                    logPushTimerTask2.run();
                } catch (Exception unused) {
                }
            }
        }
    }

    public static int traverseTheFile(String str, File file) {
        int i10 = 0;
        if (!str.contains(".dat")) {
            if (!str.contains(".ndjson")) {
                return 1;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(LogUtils.getFileExp(str)));
                try {
                    byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    boolean z10 = false;
                    int i11 = 0;
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        for (int i12 = 0; i12 < read; i12++) {
                            if (bArr[i12] == 10) {
                                i11++;
                            }
                        }
                        z10 = bArr[read + (-1)] != 10;
                    }
                    if (z10) {
                        i11++;
                    }
                    i10 = i11;
                    bufferedInputStream.close();
                } finally {
                }
            } catch (Exception unused) {
            }
            return i10;
        }
        long length = file.length();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i13 = 0;
            while (i10 < length) {
                try {
                    try {
                        byte[] bArr2 = new byte[4];
                        fileInputStream.read(bArr2);
                        ByteBuffer allocate = ByteBuffer.allocate(4);
                        allocate.put(bArr2);
                        allocate.rewind();
                        int i14 = allocate.getInt();
                        if (i14 > 102400) {
                            fileInputStream.close();
                            return i13;
                        }
                        long j10 = i14;
                        if (fileInputStream.skip(j10) < j10) {
                            fileInputStream.close();
                            return i13;
                        }
                        i10 += i14 + 4;
                        i13++;
                    } catch (Exception unused2) {
                        i10 = i13;
                        return i10;
                    }
                } finally {
                }
            }
            fileInputStream.close();
            return i13;
        } catch (Exception unused3) {
        }
    }
}
