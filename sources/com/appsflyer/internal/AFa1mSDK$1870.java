package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
public final class AFa1mSDK$1870 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventParameterName = 54024;
    private static char AFInAppEventType = 47497;
    private static char AFKeystoreWrapper = 46270;
    private static int unregisterClient = 1;
    private static char valueOf = 54878;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] AFInAppEventType(com.appsflyer.internal.AFa1qSDK r11, java.lang.String r12, com.appsflyer.internal.AFd1lSDK r13) {
        /*
            java.util.Map r0 = r11.AFInAppEventParameterName()
            r1 = 0
            r2 = 1
            if (r12 == 0) goto La
            r3 = 0
            goto Lb
        La:
            r3 = 1
        Lb:
            r4 = 0
            if (r3 == 0) goto Lf
            goto L19
        Lf:
            java.lang.String r3 = r12.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L1f
        L19:
            java.lang.String r11 = "AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.afWarnLog(r11)
            return r4
        L1f:
            if (r0 != 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            r5 = 2
            if (r3 == 0) goto L3f
            int r11 = com.appsflyer.internal.AFa1mSDK$1870.values
            int r11 = r11 + 85
            int r12 = r11 % 128
            com.appsflyer.internal.AFa1mSDK$1870.unregisterClient = r12
            int r11 = r11 % r5
            java.lang.String r11 = "Invalid payload"
            com.appsflyer.AFLogger.afWarnLog(r11)
            int r11 = com.appsflyer.internal.AFa1mSDK$1870.values
            int r11 = r11 + 37
            int r12 = r11 % 128
            com.appsflyer.internal.AFa1mSDK$1870.unregisterClient = r12
            int r11 = r11 % r5
            return r4
        L3f:
            boolean r3 = r11.AFLogger()
            if (r3 == 0) goto L9b
            boolean r3 = r11.valueOf()
            r4 = 5
            if (r3 == 0) goto L4f
            r3 = 62
            goto L50
        L4f:
            r3 = 5
        L50:
            if (r3 == r4) goto L9b
            int r3 = r11.AFLogger
            if (r3 > r5) goto L9b
            com.appsflyer.internal.AFa1zSDK$19360 r3 = com.appsflyer.internal.AFa1zSDK$19360.AFInAppEventParameterName()     // Catch: java.lang.Throwable -> L8e
            android.content.Context r13 = r13.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "￥佬硫ຒ賧䊉禆횋䒽뾉⊑\uf86b"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L8e
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r10 = r10 + 11
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8e
            a(r4, r10, r2)     // Catch: java.lang.Throwable -> L8e
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r13 = r3.AFInAppEventType(r13, r1)     // Catch: java.lang.Throwable -> L8e
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "p_receipt"
            r1.put(r0, r13)     // Catch: java.lang.Throwable -> L8b
            r0 = r1
            goto L9b
        L8b:
            r13 = move-exception
            r0 = r1
            goto L8f
        L8e:
            r13 = move-exception
        L8f:
            java.lang.Throwable r1 = r13.getCause()
            if (r1 == 0) goto L96
            r13 = r1
        L96:
            java.lang.String r1 = "AFFinalizer: error to get AntiFraud data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r1, r13)
        L9b:
            boolean r11 = r11.valueOf()
            if (r11 == 0) goto Laf
            int r11 = com.appsflyer.internal.AFa1mSDK$1870.values
            int r11 = r11 + 37
            int r13 = r11 % 128
            com.appsflyer.internal.AFa1mSDK$1870.unregisterClient = r13
            int r11 = r11 % r5
            byte[] r11 = AFKeystoreWrapper(r0, r12)
            return r11
        Laf:
            byte[] r11 = AFKeystoreWrapper(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1mSDK$1870.AFInAppEventType(com.appsflyer.internal.AFa1qSDK, java.lang.String, com.appsflyer.internal.AFd1lSDK):byte[]");
    }

    public static byte[] AFKeystoreWrapper(@NonNull Map<String, Object> map, String str) {
        int i10 = unregisterClient + 11;
        values = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = null;
        try {
            byte[] AFKeystoreWrapper2 = AFa1vSDK$9249.AFInAppEventType(str).AFKeystoreWrapper(AFKeystoreWrapper(map));
            int i12 = values + 77;
            unregisterClient = i12 % 128;
            if ((i12 % 2 == 0 ? 'D' : 'M') != 'D') {
                return AFKeystoreWrapper2;
            }
            int length = objArr.length;
            return AFKeystoreWrapper2;
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("Message encryption failed", e10);
            AFLogger.afRDLog("Message encryption failed with exception:".concat(String.valueOf(e10)));
            return null;
        }
    }

    public static String AFInAppEventParameterName(Map<String, ?> map) {
        int i10 = unregisterClient + 43;
        values = i10 % 128;
        int i11 = i10 % 2;
        String obj = AFa1mSDK$1870$AFa1vSDK$2774.valueOf(map).toString();
        int i12 = unregisterClient + 107;
        values = i12 % 128;
        int i13 = i12 % 2;
        return obj;
    }

    private static byte[] AFKeystoreWrapper(Map<String, ?> map) {
        int i10 = unregisterClient + 51;
        values = i10 % 128;
        if (i10 % 2 == 0) {
            return AFa1mSDK$1870$AFa1vSDK$2774.valueOf(map).toString().getBytes(Charset.defaultCharset());
        }
        byte[] bytes = AFa1mSDK$1870$AFa1vSDK$2774.valueOf(map).toString().getBytes(Charset.defaultCharset());
        Object[] objArr = null;
        int length = objArr.length;
        return bytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0024, code lost:
    
        r0 = r16.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0022, code lost:
    
        if (r16 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r16 == null) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r0 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r16, int r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1mSDK$1870.a(java.lang.String, int, java.lang.Object[]):void");
    }
}
