package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l {
    public static n a(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Context context) {
        Map<String, Object> map4;
        String str2;
        Map<String, Object> map5;
        Map<String, Object> map6 = null;
        if (str == null) {
            return null;
        }
        n nVar = new n();
        nVar.c(WebEngageUtils.a(str, 50));
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sdk_id", 2);
        map.put("sdk_version", Double.valueOf(40000.0d));
        map.put("app_id", context.getApplicationContext().getPackageName());
        try {
            map4 = (Map) DataType.cloneExternal(str, map);
        } catch (Exception unused) {
            map4 = null;
        }
        nVar.c(map4);
        if (map2 == null) {
            map2 = new HashMap<>();
            str2 = "Processing event: ".concat(str);
        } else {
            str2 = "Processing event: " + str + ", data: " + map2;
        }
        Logger.d("WebEngage", str2);
        try {
            map5 = (Map) DataType.cloneExternal(str, map2);
        } catch (Exception unused2) {
            map5 = null;
        }
        if (map3 != null) {
            try {
                map6 = (Map) DataType.cloneExternal(str, map3);
            } catch (Exception unused3) {
            }
        }
        nVar.a(map5);
        nVar.b("application");
        nVar.b(map6);
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.webengage.sdk.android.n b(java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.util.Map<java.lang.String, java.lang.Object> r9, android.content.Context r10) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.webengage.sdk.android.n r1 = new com.webengage.sdk.android.n
            r1.<init>()
            r2 = 50
            java.lang.String r2 = com.webengage.sdk.android.utils.WebEngageUtils.a(r6, r2)
            r1.c(r2)
            java.lang.String r2 = ", data: "
            java.lang.String r3 = "WebEngage"
            java.lang.String r4 = "Processing event: "
            if (r7 != 0) goto L43
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r8 == 0) goto L3e
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L28
            goto L3e
        L28:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r6)
            r5.append(r2)
            r5.append(r8)
        L36:
            java.lang.String r2 = r5.toString()
        L3a:
            com.webengage.sdk.android.Logger.d(r3, r2)
            goto L78
        L3e:
            java.lang.String r2 = r4.concat(r6)
            goto L3a
        L43:
            if (r8 == 0) goto L69
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L4c
            goto L69
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r4 = ", system-data: "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = ", event-data: "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            goto L3a
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r6)
            r5.append(r2)
            r5.append(r7)
            goto L36
        L78:
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "sdk_id"
            r7.put(r3, r2)
            r2 = 4675730371722084352(0x40e3880000000000, double:40000.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "sdk_version"
            r7.put(r3, r2)
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r2 = "app_id"
            r7.put(r2, r10)
            java.lang.Object r7 = com.webengage.sdk.android.utils.DataType.cloneExternal(r6, r7)     // Catch: java.lang.Exception -> La4
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> La4
            goto La5
        La4:
            r7 = r0
        La5:
            r1.c(r7)
            if (r8 != 0) goto Laf
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        Laf:
            java.lang.Object r6 = com.webengage.sdk.android.utils.DataType.cloneExternal(r6, r8)     // Catch: java.lang.Exception -> Lb6
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> Lb6
            r0 = r6
        Lb6:
            r1.a(r0)
            java.lang.String r6 = "system"
            r1.b(r6)
            r1.b(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.l.b(java.lang.String, java.util.Map, java.util.Map, java.util.Map, android.content.Context):com.webengage.sdk.android.n");
    }
}
