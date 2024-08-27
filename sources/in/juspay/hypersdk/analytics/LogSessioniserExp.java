package in.juspay.hypersdk.analytics;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.p;
import in.juspay.hyper.core.ExecutorManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LogSessioniserExp {
    private LoggerState loggerState;
    private TimerTask moveToPusher;
    private String rawLogsrequestId = LogUtils.generateUUID().replace("-", HttpUrl.FRAGMENT_ENCODE_SET);
    private Timer moveToPusherTimer = new Timer();
    private final AtomicInteger batchNumber = new AtomicInteger(0);
    private boolean tempFlipDone = false;
    private final AtomicBoolean pushFileCreated = new AtomicBoolean(false);
    private ConcurrentHashMap<String, FileOutputStream> fosMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, ArrayList<String>> currentFilesObj = new ConcurrentHashMap<>();
    private final ArrayList<String> filesObj = new ArrayList<>();
    private final ConcurrentHashMap<String, c4.d> logsCount = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public class LogSessioniserTimerTask extends TimerTask {
        private LogSessioniserTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (LogConstants.shouldPush && LogUtils.isMinMemoryAvailable().booleanValue()) {
                ExecutorManager.runOnLogSessioniserThread(new h(LogSessioniserExp.this, 0));
            }
        }

        public /* synthetic */ LogSessioniserTimerTask(LogSessioniserExp logSessioniserExp, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static /* synthetic */ void access$100(LogSessioniserExp logSessioniserExp) {
        logSessioniserExp.pushToPusher();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee A[Catch: Exception -> 0x01fa, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[Catch: Exception -> 0x01fa, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169 A[Catch: Exception -> 0x01fa, TRY_ENTER, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c9 A[Catch: Exception -> 0x01fa, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e6 A[Catch: Exception -> 0x01fa, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6 A[Catch: Exception -> 0x01fa, TryCatch #0 {Exception -> 0x01fa, blocks: (B:3:0x0008, B:7:0x0019, B:10:0x0029, B:12:0x0033, B:14:0x0046, B:16:0x0050, B:18:0x0054, B:20:0x0061, B:21:0x0089, B:22:0x00e6, B:24:0x00ee, B:26:0x00fa, B:28:0x00fe, B:29:0x0105, B:30:0x0114, B:32:0x012e, B:34:0x0138, B:35:0x0149, B:37:0x0151, B:39:0x0155, B:41:0x013c, B:42:0x010c, B:43:0x015f, B:46:0x0169, B:48:0x0173, B:51:0x017e, B:53:0x0187, B:54:0x018d, B:55:0x01bf, B:57:0x01c9, B:58:0x01da, B:60:0x01e6, B:61:0x01f7, B:65:0x0178, B:66:0x0182, B:67:0x01a6, B:69:0x0091, B:70:0x00b9, B:71:0x00bd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addToLogs(java.lang.String r18, java.lang.String r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogSessioniserExp.addToLogs(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    private void getAllTempFiles(JSONObject jSONObject) {
        Iterator<String> it = this.filesObj.iterator();
        while (it.hasNext()) {
            try {
                jSONObject.put(it.next(), HttpUrl.FRAGMENT_ENCODE_SET);
            } catch (Exception unused) {
            }
        }
        Iterator<Map.Entry<String, ArrayList<String>>> it2 = this.currentFilesObj.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                Iterator<String> it3 = it2.next().getValue().iterator();
                while (it3.hasNext()) {
                    jSONObject.put(it3.next(), HttpUrl.FRAGMENT_ENCODE_SET);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return in.juspay.hypersdk.analytics.LogPusherExp.traverseTheFile(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getLogCount(java.lang.String r2) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, c4.d> r0 = r1.logsCount
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L28
            java.util.concurrent.ConcurrentHashMap<java.lang.String, c4.d> r0 = r1.logsCount
            java.lang.Object r0 = r0.get(r2)
            c4.d r0 = (c4.d) r0
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.f7942a
            if (r0 == 0) goto L1d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            goto L30
        L1d:
            java.io.File r0 = in.juspay.hypersdk.analytics.LogUtils.getFileExp(r2)
            if (r0 == 0) goto L2f
        L23:
            int r2 = in.juspay.hypersdk.analytics.LogPusherExp.traverseTheFile(r2, r0)
            goto L30
        L28:
            java.io.File r0 = in.juspay.hypersdk.analytics.LogUtils.getFileExp(r2)
            if (r0 == 0) goto L2f
            goto L23
        L2f:
            r2 = 0
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogSessioniserExp.getLogCount(java.lang.String):int");
    }

    public /* synthetic */ void lambda$addLogLine$1(JSONObject jSONObject) {
        String str;
        if (!LogConstants.shouldPush) {
            return;
        }
        String optString = jSONObject.optString(AppsFlyerProperties.CHANNEL, LogConstants.DEFAULT_CHANNEL);
        if (LoggerState.BUFFERING.equals(this.loggerState) && shouldAllowLog(jSONObject)) {
            if (LogConstants.fileFormat.equals("ndJson")) {
                str = ".ndjson";
            } else {
                str = ".dat";
            }
            StringBuilder s7 = da.e.s("logs-", optString, "-");
            s7.append(this.rawLogsrequestId);
            s7.append(String.format(Locale.US, "-%03d", Integer.valueOf(this.batchNumber.incrementAndGet())));
            s7.append("-0001");
            s7.append(str);
            String sb2 = s7.toString();
            try {
                jSONObject.put("batch_number", this.batchNumber.get());
            } catch (Exception unused) {
            }
            File fileExp = LogUtils.getFileExp("original/" + sb2);
            LogUtils.writeLogToFileExp(jSONObject, fileExp);
            File fileExp2 = LogUtils.getFileExp(sb2);
            if (fileExp != null && fileExp2 != null) {
                fileExp.renameTo(fileExp2);
            }
            LogPusherExp.addLogLines(optString, sb2);
            return;
        }
        addToLogs(optString, this.rawLogsrequestId, jSONObject);
    }

    public /* synthetic */ void lambda$pushToPusher$3(ConcurrentHashMap concurrentHashMap, boolean z10) {
        StringBuilder sb2;
        File fileExp;
        if (LoggerState.BUFFERING.equals(this.loggerState)) {
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    int lastIndexOf = str.lastIndexOf(46);
                    String str2 = str.substring(0, lastIndexOf) + String.format(Locale.US, "-%04d", Integer.valueOf(getLogCount(str))) + str.substring(lastIndexOf);
                    File fileExp2 = LogUtils.getFileExp("temp/".concat(str));
                    File fileExp3 = LogUtils.getFileExp("temp/" + str2);
                    if (fileExp2 != null && fileExp2.exists()) {
                        if (fileExp3 != null) {
                            fileExp2.renameTo(fileExp3);
                        }
                        arrayList2.add(str2);
                    }
                }
                this.filesObj.addAll(arrayList2);
            }
        }
        if (LoggerState.PUSHING.equals(this.loggerState)) {
            try {
                Iterator<String> it3 = this.filesObj.iterator();
                while (it3.hasNext()) {
                    String next = it3.next();
                    File fileExp4 = LogUtils.getFileExp("temp/" + next);
                    if (fileExp4 != null && fileExp4.exists() && (fileExp = LogUtils.getFileExp(next)) != null) {
                        fileExp4.renameTo(fileExp);
                    }
                }
            } catch (Exception unused) {
            }
            Iterator it4 = concurrentHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                try {
                    Iterator it5 = ((ArrayList) ((Map.Entry) it4.next()).getValue()).iterator();
                    while (it5.hasNext()) {
                        String str3 = (String) it5.next();
                        if (z10) {
                            sb2 = new StringBuilder();
                            sb2.append("temp/");
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append("original/");
                        }
                        sb2.append(str3);
                        File fileExp5 = LogUtils.getFileExp(sb2.toString());
                        if (fileExp5 != null && fileExp5.exists()) {
                            int lastIndexOf2 = str3.lastIndexOf(46);
                            File fileExp6 = LogUtils.getFileExp(str3.substring(0, lastIndexOf2) + String.format(Locale.US, "-%04d", Integer.valueOf(getLogCount(str3))) + str3.substring(lastIndexOf2));
                            if (fileExp6 != null) {
                                fileExp5.renameTo(fileExp6);
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public /* synthetic */ void lambda$startPushing$2() {
        LoggerState loggerState = LoggerState.PUSHING;
        if (loggerState.equals(this.loggerState)) {
            return;
        }
        this.pushFileCreated.set(true);
        updatePushFile();
        synchronized (this.loggerState) {
            this.loggerState = loggerState;
        }
    }

    public /* synthetic */ void lambda$stopLogSessioniserOnTerminate$0() {
        try {
            this.moveToPusher.cancel();
            this.moveToPusherTimer.cancel();
            if (LogConstants.shouldPush) {
                pushToPusher();
            }
            this.loggerState = LoggerState.TERMINATED;
        } catch (Exception unused) {
        }
        ExecutorManager.runOnLogPusherThread(new d(12));
    }

    public void pushToPusher() {
        boolean z10;
        this.rawLogsrequestId = LogUtils.generateUUID().replace("-", HttpUrl.FRAGMENT_ENCODE_SET);
        Iterator<Map.Entry<String, FileOutputStream>> it = this.fosMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().close();
            } catch (Exception unused) {
            }
        }
        this.fosMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, ArrayList<String>> concurrentHashMap = this.currentFilesObj;
        this.currentFilesObj = new ConcurrentHashMap<>();
        synchronized (this.loggerState) {
            try {
                if (!LoggerState.PUSHING.equals(this.loggerState) || this.tempFlipDone) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.tempFlipDone = true;
                }
                ExecutorManager.runOnBackgroundThread(new p(this, concurrentHashMap, z10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean shouldAllowLog(JSONObject jSONObject) {
        JSONArray jSONArray = LogConstants.allowWhileBuffering;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (jSONObject.has(next)) {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(next);
                            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                if (Objects.equals(jSONArray2.get(i11), jSONObject.get(next))) {
                                    break;
                                }
                            }
                        }
                    }
                    return true;
                }
                continue;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void updatePushFile() {
        File fileExp = LogUtils.getFileExp("temp/push.json");
        if (fileExp != null) {
            JSONObject jSONObject = new JSONObject();
            if (fileExp.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileExp);
                    try {
                        byte[] bArr = new byte[(int) fileExp.length()];
                        fileInputStream.read(bArr);
                        JSONObject jSONObject2 = new JSONObject(new String(bArr));
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        jSONObject = jSONObject2;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Exception unused2) {
                }
            }
            getAllTempFiles(jSONObject);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileExp);
                try {
                    fileOutputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception unused3) {
            }
        }
    }

    public void addLogLine(JSONObject jSONObject) {
        ExecutorManager.runOnLogSessioniserThread(new g(0, this, jSONObject));
    }

    public void startLogSessioniser() {
        if (LoggerState.PUSHING.equals(this.loggerState)) {
            return;
        }
        this.loggerState = LoggerState.BUFFERING;
        try {
            LogPusherExp.startLogPusher();
            File fileExp = LogUtils.getFileExp("temp/");
            if (fileExp != null) {
                fileExp.mkdirs();
            }
            File fileExp2 = LogUtils.getFileExp("original/");
            if (fileExp2 != null) {
                fileExp2.mkdirs();
            }
            this.moveToPusherTimer = new Timer();
            LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
            this.moveToPusher = logSessioniserTimerTask;
            this.moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, LogConstants.logSessioniseInterval);
        } catch (Exception unused) {
        }
    }

    public void startPushing() {
        ExecutorManager.runOnBackgroundThread(new h(this, 3));
    }

    public void stopLogSessioniserOnTerminate() {
        ExecutorManager.runOnLogSessioniserThread(new h(this, 1));
    }
}
