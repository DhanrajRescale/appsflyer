package in.juspay.hypersdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import hl.f;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.services.SdkConfigService;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Utils {
    private static final String LOG_TAG = "Utils";

    public static boolean checkIfGranted(JuspayServices juspayServices, String str) {
        return f.D(juspayServices.getContext(), str) == 0;
    }

    public static boolean contains(@NonNull JSONArray jSONArray, Object obj) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (jSONArray.get(i10).equals(obj)) {
                    return true;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public static JSONArray defaultNonNull(JSONArray jSONArray) {
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public static void deleteRecursive(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                for (File file2 : listFiles) {
                    deleteRecursive(file2);
                }
            }
            file.delete();
        }
    }

    public static String getIPAddress(JuspayServices juspayServices) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && inetAddress.getHostAddress() != null) {
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        if (isIPv4Address(upperCase)) {
                            return upperCase;
                        }
                    }
                }
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception e10) {
            juspayServices.getSdkTracker().trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Failed to Retreive IP address", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static String getLogLevelFromThrowable(Throwable th2) {
        return th2 instanceof Error ? LogLevel.CRITICAL : th2 instanceof Exception ? "error" : LogLevel.WARNING;
    }

    public static ActivityManager.MemoryInfo getMemoryInfo(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = context != null ? (ActivityManager) context.getSystemService("activity") : null;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static byte[] gzipContent(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                JuspayLogger.d(LOG_TAG, "Gzipping complete");
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static <T> boolean includes(JSONArray jSONArray, T t10) {
        if (jSONArray == null) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (t10.equals(jSONArray.opt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIPv4Address(String str) {
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (String str2 : split) {
            try {
                int parseInt = Integer.parseInt(str2);
                int i10 = (parseInt >= 0 && parseInt <= 255) ? i10 + 1 : 0;
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    public static boolean isUiFeatureEnabled(JuspayServices juspayServices, String str) {
        JSONObject cachedSdkConfig = juspayServices == null ? SdkConfigService.getCachedSdkConfig() : juspayServices.getSdkConfigService().getSdkConfig();
        if (cachedSdkConfig == null) {
            cachedSdkConfig = SdkConfigService.getCachedSdkConfig();
        }
        if (cachedSdkConfig == null) {
            return true;
        }
        if (!optJSONObject(optJSONObject(cachedSdkConfig, "uiFeatures"), str).optBoolean("enabled")) {
            return false;
        }
        if (juspayServices == null) {
            return true;
        }
        return !includes(optJSONArray(r4, "blacklistedClientIds"), juspayServices.getSessionInfo().getClientId());
    }

    public static JSONArray optJSONArray(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    public static JSONObject optJSONObject(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    public static JSONObject toJSON(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    jSONObject.put(str, obj == null ? JSONObject.NULL : obj instanceof ArrayList ? toJSONArray((ArrayList) obj) : obj instanceof Bundle ? toJSON((Bundle) obj) : String.valueOf(obj));
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONArray toJSONArray(ArrayList<Object> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ArrayList) {
                next = toJSONArray((ArrayList) next);
            } else if (!(next instanceof JSONObject)) {
                next = String.valueOf(next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static JSONObject defaultNonNull(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
