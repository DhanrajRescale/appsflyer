package in.juspay.hypersdk.analytics;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LogSessioniser {
    private static TimerTask moveToPusher;
    private static JSONObject logs = new JSONObject();
    private static JSONObject rawLogs = new JSONObject();
    private static final ArrayList<String> activeRequestIDs = new ArrayList<>();
    private static int timerModulus = 0;
    private static Timer moveToPusherTimer = new Timer();
    private static boolean stopPushingLogs = false;
    private static boolean timerStopped = false;

    /* loaded from: classes2.dex */
    public static class LogSessioniserTimerTask extends TimerTask {
        private LogSessioniserTimerTask() {
        }

        public /* synthetic */ LogSessioniserTimerTask(AnonymousClass1 anonymousClass1) {
            this();
        }

        public static /* synthetic */ void lambda$run$0() {
            if (LogConstants.shouldPush && LogUtils.isMinMemoryAvailable().booleanValue()) {
                boolean z10 = LogSessioniser.timerModulus == 1;
                LogSessioniser.deleteOldFileIfNecessary(LogConstants.LOGS_READING_FILE, LogConstants.LOGS_WRITING_FILE, LogConstants.LOGS_FILE, ".dat");
                LogSessioniser.deleteOldFileIfNecessary(LogConstants.TEMP_LOGS_READING_FILE, LogConstants.TEMP_LOGS_WRITING_FILE, LogConstants.TEMP_LOGS_FILE, ".dat");
                if (z10) {
                    LogSessioniser.activeRequestIDs.clear();
                    LogSessioniser.pushLogsFromJsonToPusher(LogSessioniser.logs);
                    LogSessioniser.clearAllLogFiles(LogConstants.TEMP_LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE), LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE));
                    LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, String.valueOf(0));
                    LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, String.valueOf(0));
                }
                if (z10) {
                    JSONObject unused = LogSessioniser.logs = LogSessioniser.rawLogs;
                    JSONObject unused2 = LogSessioniser.rawLogs = new JSONObject();
                } else {
                    LogSessioniser.clearAllLogFiles(LogConstants.LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE), LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE));
                    LogUtils.writeToSharedPreference(LogConstants.LOGS_READING_FILE, String.valueOf(0));
                    LogUtils.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, String.valueOf(0));
                    try {
                        LogSessioniser.pushJsonToFile(LogSessioniser.rawLogs, LogConstants.LOGS_FILE, ".dat", LogConstants.LOGS_WRITING_FILE, 0);
                    } catch (Exception unused3) {
                    }
                }
                if (z10) {
                    int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE);
                    try {
                        LogSessioniser.pushJsonToFile(LogSessioniser.logs, LogConstants.TEMP_LOGS_FILE, ".dat", LogConstants.TEMP_LOGS_WRITING_FILE, fromSharedPreference != -1 ? fromSharedPreference : 0);
                    } catch (Exception unused4) {
                    }
                }
                if (LogSessioniser.logs.length() == 0 && LogSessioniser.rawLogs.length() == 0) {
                    LogSessioniser.moveToPusherTimer.cancel();
                    boolean unused5 = LogSessioniser.timerStopped = true;
                }
                LogSessioniser.access$004();
                LogSessioniser.access$044(5);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogsPool(new d(2));
        }
    }

    static {
        ExecutorManager.runOnLogsPool(new d(10));
    }

    public static /* synthetic */ int access$004() {
        int i10 = timerModulus + 1;
        timerModulus = i10;
        return i10;
    }

    public static /* synthetic */ int access$044(int i10) {
        int i11 = timerModulus % i10;
        timerModulus = i11;
        return i11;
    }

    public static void addLogLine(String str, JSONObject jSONObject) {
        if (stopPushingLogs || !LogConstants.shouldPush) {
            return;
        }
        ExecutorManager.runOnLogsPool(new a(str, jSONObject));
    }

    public static void clearAllLogFiles(String str, String str2, int i10, int i11) {
        while (i10 <= i11) {
            try {
                File file = LogUtils.getFile(str + i10 + str2);
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            i10++;
        }
    }

    private static String constructErrorMessage(String str, String str2) {
        return jr.h.s("{\"requestId\":\"", str2, "\",\"error\":true,\"logs\":{},\"errorMessage\":\"", str, "\"}");
    }

    public static void deleteOldFileIfNecessary(String str, String str2, String str3, String str4) {
        int fromSharedPreference = LogUtils.getFromSharedPreference(str);
        int fromSharedPreference2 = LogUtils.getFromSharedPreference(str2);
        if (JuspayCoreLib.getApplicationContext() == null || (fromSharedPreference2 - fromSharedPreference) + 1 <= LogConstants.maxFilesAllowed) {
            return;
        }
        while ((fromSharedPreference2 - fromSharedPreference) + 1 > LogConstants.numFilesToLeaveIfMaxFilesExceeded) {
            File file = LogUtils.getFile(str3 + fromSharedPreference + str4);
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
            }
            fromSharedPreference++;
        }
        LogUtils.writeToSharedPreference(str, String.valueOf(fromSharedPreference));
    }

    public static String getLogsFromSessionId(JSONObject jSONObject) {
        String str;
        String str2;
        if (jSONObject == null) {
            return constructErrorMessage("Request Invalid", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        try {
            str2 = jSONObject.getString("requestId");
            try {
                str = jSONObject.getString("sessionId");
            } catch (JSONException unused) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                activeRequestIDs.add(str2);
                JSONArray optJSONArray = logs.optJSONArray(str);
                return optJSONArray != null ? new JSONObject().put("requestId", str2).put("error", false).put("logs", optJSONArray).toString() : constructErrorMessage("No logs saved to file", str2);
            } catch (JSONException unused2) {
                return constructErrorMessage(str2.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? "RequestId not sent" : str.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? "SessionId not sent" : "Request invalid", str2);
            }
        } catch (JSONException unused3) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            str2 = str;
        }
    }

    public static /* synthetic */ void lambda$addLogLine$4(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE).toString().getBytes().length > LogConstants.maxLogValueSize) {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "Filtered");
                JuspayLogger.i("LogSessioniser", "Filtering the value of log as the size of value is greater than 32 KB");
            }
            startLogSessioniserOnLogCount();
            if (rawLogs.has(str)) {
                rawLogs.accumulate(str, jSONObject);
                return;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            rawLogs.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void lambda$sessioniseLogs$5(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("sessionId");
            String string2 = jSONObject.getString("requestId");
            JSONArray jSONArray = jSONObject.getJSONArray("logs");
            if (!activeRequestIDs.contains(string2) || jSONArray.toString().getBytes().length > LogConstants.maxLogLineSize) {
                return;
            }
            startLogSessioniserOnLogCount();
            logs.put(string, jSONArray);
        } catch (JSONException unused) {
        }
    }

    public static /* synthetic */ void lambda$startLogSessioniser$1() {
        try {
            stopPushingLogs = false;
            moveToPusherTimer = new Timer();
            LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
            moveToPusher = logSessioniserTimerTask;
            moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, LogConstants.logSessioniseInterval);
            timerStopped = false;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void lambda$startLogSessioniserOnLogCount$2() {
        try {
            if (timerStopped) {
                moveToPusherTimer = new Timer();
                LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
                moveToPusher = logSessioniserTimerTask;
                moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, LogConstants.logSessioniseInterval);
                timerStopped = false;
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void lambda$static$0() {
        if (LogConstants.shouldPush) {
            ExecutorManager.setLogsThreadId(Thread.currentThread().getId());
            int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE);
            int fromSharedPreference2 = LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE);
            if (fromSharedPreference == -1) {
                LogUtils.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, String.valueOf(0));
                fromSharedPreference = 0;
            }
            if (fromSharedPreference2 == -1) {
                LogUtils.writeToSharedPreference(LogConstants.LOGS_READING_FILE, String.valueOf(0));
                fromSharedPreference2 = 0;
            }
            int fromSharedPreference3 = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE);
            int fromSharedPreference4 = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE);
            if (fromSharedPreference3 == -1) {
                LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, String.valueOf(0));
                fromSharedPreference3 = 0;
            }
            if (fromSharedPreference4 == -1) {
                LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, String.valueOf(0));
                fromSharedPreference4 = 0;
            }
            deleteOldFileIfNecessary(LogConstants.LOGS_READING_FILE, LogConstants.LOGS_WRITING_FILE, LogConstants.LOGS_FILE, ".dat");
            deleteOldFileIfNecessary(LogConstants.TEMP_LOGS_READING_FILE, LogConstants.TEMP_LOGS_WRITING_FILE, LogConstants.TEMP_LOGS_FILE, ".dat");
            while (fromSharedPreference4 <= fromSharedPreference3) {
                try {
                    String str = LogConstants.TEMP_LOGS_FILE + fromSharedPreference4 + ".dat";
                    if (JuspayCoreLib.getApplicationContext() != null) {
                        File file = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), str);
                        if (file.length() <= LogConstants.maxLogFileSize && file.exists() && LogUtils.isFileEligibleToPush(file)) {
                            LogPusher.addLogsFromSessioniser(LogUtils.getLogsFromFile(file));
                        }
                        file.delete();
                    }
                } catch (Exception unused) {
                }
                fromSharedPreference4++;
            }
            LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, String.valueOf(0));
            LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, String.valueOf(0));
            while (fromSharedPreference2 <= fromSharedPreference) {
                try {
                    String str2 = LogConstants.LOGS_FILE + fromSharedPreference2 + ".dat";
                    if (JuspayCoreLib.getApplicationContext() != null) {
                        File file2 = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), str2);
                        if (file2.length() <= LogConstants.maxLogFileSize && file2.exists() && LogUtils.isFileEligibleToPush(file2)) {
                            LogPusher.addLogsFromSessioniser(LogUtils.getLogsFromFile(file2));
                        }
                        file2.delete();
                    }
                } catch (Exception unused2) {
                }
                fromSharedPreference2++;
            }
            LogUtils.writeToSharedPreference(LogConstants.LOGS_READING_FILE, String.valueOf(0));
            LogUtils.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, String.valueOf(0));
        }
    }

    public static /* synthetic */ void lambda$stopLogSessioniserOnTerminate$3() {
        try {
            moveToPusherTimer.cancel();
            if (pushLogsFromJsonToPusher(logs)) {
                logs = new JSONObject();
                clearAllLogFiles(LogConstants.TEMP_LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE), LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE));
                LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, String.valueOf(0));
                LogUtils.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, String.valueOf(0));
            }
            if (pushLogsFromJsonToPusher(rawLogs)) {
                rawLogs = new JSONObject();
                clearAllLogFiles(LogConstants.LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE), LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE));
                LogUtils.writeToSharedPreference(LogConstants.LOGS_READING_FILE, String.valueOf(0));
                LogUtils.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, String.valueOf(0));
            }
            timerStopped = true;
            stopPushingLogs = true;
        } catch (Exception unused) {
        }
    }

    public static void pushJsonToFile(JSONObject jSONObject, String str, String str2, String str3, int i10) {
        Iterator<String> keys = jSONObject.keys();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        int i11 = i10;
        sb2.append(i11);
        sb2.append(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(LogUtils.getFile(sb2.toString()), true);
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                byte[] bytes = (jSONArray.getJSONObject(i12).toString() + LogConstants.LOG_DELIMITER).getBytes(StandardCharsets.UTF_8);
                long length = (long) bytes.length;
                if (LogUtils.getFileLength(str + i11 + str2) + length <= LogConstants.maxLogFileSize) {
                    fileOutputStream.write(bytes);
                } else if (length <= LogConstants.maxLogLineSize) {
                    i11++;
                    LogUtils.writeToSharedPreference(str3, String.valueOf(i11));
                    FileOutputStream fileOutputStream2 = new FileOutputStream(LogUtils.getFile(str + i11 + str2), true);
                    fileOutputStream2.write(bytes);
                    fileOutputStream = fileOutputStream2;
                }
            }
        }
        fileOutputStream.close();
    }

    public static boolean pushLogsFromJsonToPusher(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                LogPusher.addLogLines(jSONObject.getJSONArray(keys.next()));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void sessioniseLogs(JSONObject jSONObject) {
        if (stopPushingLogs || !LogConstants.shouldPush) {
            return;
        }
        ExecutorManager.runOnLogsPool(new c(jSONObject, 2));
    }

    public static void startLogSessioniser() {
        ExecutorManager.runOnLogsPool(new d(11));
    }

    private static void startLogSessioniserOnLogCount() {
        ExecutorManager.runOnLogsPool(new d(8));
    }

    public static void stopLogSessioniserOnTerminate() {
        ExecutorManager.runOnLogsPool(new d(9));
    }
}
