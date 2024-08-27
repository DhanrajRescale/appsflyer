package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class PaymentUtils extends Utils {
    private static final String LOG_TAG = "PaymentUtils";

    public static void clearCookies(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            CookieSyncManager.createInstance(context).sync();
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Failed to clear cookies", e10);
        }
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

    public static String getConfigVariableDeclarations(@NonNull Context context, SessionInfo sessionInfo) {
        String deviceId = sessionInfo.getDeviceId();
        String androidId = sessionInfo.getAndroidId();
        if (deviceId == null || deviceId.isEmpty()) {
            deviceId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "var clientId = '" + sessionInfo.getClientId() + "';var juspayDeviceId = '" + deviceId + "';var juspayAndroidId = '" + androidId + "';var godelRemotesVersion = '" + PaymentSessionInfo.getGodelRemotesVersion(context) + "';var godelVersion = '" + IntegrationUtils.getGodelVersion(context) + "';var buildVersion = '" + IntegrationUtils.getGodelBuildVersion(context) + "';var os_version = '" + SessionInfo.getOSVersion() + "';";
    }

    public static ConnectivityReceiver getConnectivityReceiver(JuspayServices juspayServices) {
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            return new ConnectivityReceiver(juspayServices);
        } catch (Throwable th2) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Failed to register Connectivity receiver (Ignoring)", th2);
            return null;
        }
    }

    public static boolean hasTelephonyService(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Throwable th2) {
            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while trying to get telephony service. Returning false.", th2);
            return false;
        }
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void logMemoryInfo(SdkTracker sdkTracker, ActivityManager.MemoryInfo memoryInfo) {
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "available_memory", Long.valueOf(memoryInfo.availMem));
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "threshold_memory", Long.valueOf(memoryInfo.threshold));
        sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "total_memory", Long.valueOf(memoryInfo.totalMem));
    }

    public static void refreshPage(JuspayWebView juspayWebView) {
        if (juspayWebView != null) {
            juspayWebView.addJsToWebView("window.location.reload(true);");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:3:0x0004, B:13:0x005b, B:15:0x0064, B:16:0x0084, B:24:0x004b), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void switchOffGodelIfLowOnMemory(in.juspay.hypersdk.safe.Godel r11, in.juspay.hypersdk.core.JuspayServices r12, in.juspay.hypersdk.data.PaymentSessionInfo r13) {
        /*
            java.lang.String r0 = " MB"
            java.lang.String r1 = "low on memory - Available memory : "
            android.content.Context r2 = r12.getContext()     // Catch: java.lang.Exception -> La7
            in.juspay.hypersdk.core.SdkTracker r12 = r12.getSdkTracker()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Exception -> La7
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> La7
            android.app.ActivityManager$MemoryInfo r10 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> La7
            r10.<init>()     // Catch: java.lang.Exception -> La7
            r3 = 4
            org.json.JSONObject r11 = r11.getWebLabRules()     // Catch: java.lang.Exception -> L45
            if (r11 == 0) goto L49
            java.lang.String r4 = "shouldUseMemory"
            int r11 = r11.getInt(r4)     // Catch: java.lang.Exception -> L45
            java.lang.String r4 = "system"
            java.lang.String r5 = "info"
            java.lang.String r6 = "util"
            java.lang.String r7 = "weblab_shouldUseMemory"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r3.<init>()     // Catch: java.lang.Exception -> L42
            r3.append(r11)     // Catch: java.lang.Exception -> L42
            r3.append(r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Exception -> L42
            r3 = r12
            r3.trackAction(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L42
            goto L59
        L42:
            r3 = move-exception
            r9 = r3
            goto L4b
        L45:
            r11 = move-exception
            r9 = r11
            r11 = r3
            goto L4b
        L49:
            r11 = r3
            goto L59
        L4b:
            java.lang.String r4 = in.juspay.hypersdk.core.PaymentUtils.LOG_TAG     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = "action"
            java.lang.String r6 = "system"
            java.lang.String r7 = "util"
            java.lang.String r8 = "Exception while fetching shouldUseMemory from config"
            r3 = r12
            r3.trackAndLogException(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> La7
        L59:
            if (r2 == 0) goto La7
            r2.getMemoryInfo(r10)     // Catch: java.lang.Exception -> La7
            int r2 = r2.getMemoryClass()     // Catch: java.lang.Exception -> La7
            if (r2 >= r11) goto L84
            java.lang.String r3 = "LOW_ON_MEMORY"
            r13.setGodelDisabled(r3)     // Catch: java.lang.Exception -> La7
            java.lang.String r4 = "system"
            java.lang.String r5 = "info"
            java.lang.String r6 = "util"
            java.lang.String r7 = "switching_godel_off"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La7
            r13.<init>(r1)     // Catch: java.lang.Exception -> La7
            r13.append(r2)     // Catch: java.lang.Exception -> La7
            r13.append(r0)     // Catch: java.lang.Exception -> La7
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Exception -> La7
            r3 = r12
            r3.trackAction(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La7
        L84:
            logMemoryInfo(r12, r10)     // Catch: java.lang.Exception -> La7
            java.lang.String r4 = "system"
            java.lang.String r5 = "info"
            java.lang.String r6 = "util"
            java.lang.String r7 = "switchoffgodeliflowonmemory"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La7
            r13.<init>()     // Catch: java.lang.Exception -> La7
            r13.append(r2)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = " MB <"
            r13.append(r0)     // Catch: java.lang.Exception -> La7
            r13.append(r11)     // Catch: java.lang.Exception -> La7
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Exception -> La7
            r3 = r12
            r3.trackAction(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La7
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.PaymentUtils.switchOffGodelIfLowOnMemory(in.juspay.hypersdk.safe.Godel, in.juspay.hypersdk.core.JuspayServices, in.juspay.hypersdk.data.PaymentSessionInfo):void");
    }

    @Keep
    public static String toJavascriptArray(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append("\"");
            sb2.append(it.next());
            sb2.append("\"");
            if (it.hasNext()) {
                sb2.append(",");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static boolean validatePinning(X509Certificate[] x509CertificateArr, Set<String> set) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (x509CertificateArr.length <= 0) {
                JuspayLogger.d(LOG_TAG, sb2.toString());
                return true;
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            messageDigest.update(encoded, 0, encoded.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            sb2.append("    sha256/");
            sb2.append(encodeToString);
            sb2.append(" : ");
            sb2.append(x509Certificate.getSubjectDN().toString());
            sb2.append("\n");
            return !set.contains(encodeToString);
        } catch (NoSuchAlgorithmException unused) {
            throw new CertificateException("couldn't create digest");
        }
    }
}
