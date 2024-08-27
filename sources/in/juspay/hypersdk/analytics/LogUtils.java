package in.juspay.hypersdk.analytics;

import android.app.ActivityManager;
import android.content.Context;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LogUtils {
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getAnyFromSharedPreference(String str, String str2) {
        Context applicationContext = JuspayCoreLib.getApplicationContext();
        return applicationContext != null ? KeyValueStore.read(applicationContext, IntegrationUtils.getAppName(applicationContext), str, str2) : str2;
    }

    public static File getFile(String str) {
        if (JuspayCoreLib.getApplicationContext() == null) {
            return null;
        }
        return new File(JuspayCoreLib.getApplicationContext().getCacheDir(), str);
    }

    public static File getFileExp(String str) {
        if (JuspayCoreLib.getApplicationContext() == null) {
            return null;
        }
        return new File(JuspayCoreLib.getApplicationContext().getCacheDir(), a3.a.f("juspay_logs/", str));
    }

    public static long getFileLength(String str) {
        if (JuspayCoreLib.getApplicationContext() != null) {
            return new File(JuspayCoreLib.getApplicationContext().getCacheDir(), str).length();
        }
        return 0L;
    }

    public static int getFromSharedPreference(String str) {
        Context applicationContext = JuspayCoreLib.getApplicationContext();
        if (applicationContext != null) {
            return Integer.parseInt(KeyValueStore.read(applicationContext, IntegrationUtils.getAppName(applicationContext), str, "-1"));
        }
        return -1;
    }

    public static Queue<JSONObject> getLogsFromFile(File file) {
        LinkedList linkedList = new LinkedList();
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            for (String str : new String(bArr, StandardCharsets.UTF_8).split(LogConstants.LOG_DELIMITER)) {
                try {
                    linkedList.add(new JSONObject(str));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return linkedList;
    }

    public static byte[] getLogsFromFileExp(File file) {
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
        } catch (Exception unused) {
        }
        return bArr;
    }

    public static boolean isFileEligibleToPush(File file) {
        if (file != null) {
            return ((System.currentTimeMillis() - file.lastModified()) / 1000) / 3600 < LogConstants.dontPushIfFileIsLastModifiedBeforeInHours;
        }
        return false;
    }

    public static Boolean isMinMemoryAvailable() {
        Context applicationContext = JuspayCoreLib.getApplicationContext();
        if (applicationContext != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = Utils.getMemoryInfo(applicationContext);
                if (memoryInfo != null) {
                    return Boolean.valueOf(memoryInfo.availMem >= LogConstants.minMemoryRequired);
                }
            } catch (Exception unused) {
            }
        }
        return Boolean.TRUE;
    }

    public static void removeFromSharedPreference(String str) {
        Context applicationContext = JuspayCoreLib.getApplicationContext();
        if (applicationContext != null) {
            KeyValueStore.remove(applicationContext, IntegrationUtils.getAppName(applicationContext), str);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    public static void writeLogToFileExp(JSONObject jSONObject, File file) {
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
                    fileOutputStream.write(ByteBuffer.allocate(4).putInt(bytes.length).array());
                    fileOutputStream.write(bytes);
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void writeToSharedPreference(String str, String str2) {
        Context applicationContext = JuspayCoreLib.getApplicationContext();
        if (applicationContext != null) {
            KeyValueStore.write(applicationContext, IntegrationUtils.getAppName(applicationContext), str, str2, false);
        }
    }
}
