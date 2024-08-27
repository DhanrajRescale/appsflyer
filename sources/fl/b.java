package fl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16166b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f16167c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f16165a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f16168d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:6:0x000d, B:10:0x002e, B:13:0x0043, B:16:0x0054, B:19:0x006a, B:22:0x007e, B:26:0x003c, B:29:0x0027), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.os.Bundle r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<fl.b> r2 = fl.b.class
            boolean r3 = sl.a.b(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)     // Catch: java.lang.Throwable -> La3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch: java.lang.Throwable -> La3
            r5.putString(r1, r6)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Locale r3 = nl.n0.f28891i     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = ""
            if (r3 != 0) goto L27
        L25:
            r3 = r4
            goto L2e
        L27:
            java.lang.String r3 = r3.getLanguage()     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L2e
            goto L25
        L2e:
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            r3 = 95
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.util.Locale r3 = nl.n0.f28891i     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L3c
        L3a:
            r3 = r4
            goto L43
        L3c:
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Throwable -> La3
            if (r3 != 0) goto L43
            goto L3a
        L43:
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_appVersion"
            java.lang.String r1 = nl.n0.f28890h     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L54
            r1 = r4
        L54:
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOS"
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_platform"
            java.lang.String r1 = "mobile"
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceModel"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L6a
            r1 = r4
        L6a:
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_nativeAppID"
            java.lang.String r1 = com.facebook.FacebookSdk.getApplicationId()     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_nativeAppShortVersion"
            java.lang.String r1 = nl.n0.f28890h     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L7d
            goto L7e
        L7d:
            r4 = r1
        L7e:
            r5.putString(r6, r4)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_timezone"
            java.lang.String r1 = nl.n0.f28888f     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_carrier"
            java.lang.String r1 = nl.n0.f28889g     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSTypeName"
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> La3
            r5.putString(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "_remainingDiskGB"
            long r0 = nl.n0.f28886d     // Catch: java.lang.Throwable -> La3
            r5.putLong(r6, r0)     // Catch: java.lang.Throwable -> La3
            return
        La3:
            r5 = move-exception
            sl.a.a(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.b.a(android.os.Bundle, java.lang.String):void");
    }

    public static final String b(JSONObject logic) {
        if (sl.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys = logic.keys();
            if (!keys.hasNext()) {
                return null;
            }
            return keys.next();
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
            return null;
        }
    }

    public static final String c(Bundle bundle) {
        Integer valueOf;
        String optString;
        if (sl.a.b(b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f16167c;
            if (jSONArray != null) {
                if (jSONArray == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(jSONArray.length());
                }
                if (valueOf != null && valueOf.intValue() == 0) {
                    return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                JSONArray jSONArray2 = f16167c;
                if (jSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            String optString2 = jSONArray2.optString(i10);
                            if (optString2 != null) {
                                JSONObject jSONObject = new JSONObject(optString2);
                                long optLong = jSONObject.optLong("id");
                                if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && d(bundle, optString)) {
                                    arrayList.add(Long.valueOf(optLong));
                                }
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String jSONArray3 = new JSONArray((Collection) arrayList).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
                    return jSONArray3;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean d(Bundle bundle, String str) {
        int length;
        if (!sl.a.b(b.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String b10 = b(jSONObject);
                if (b10 == null) {
                    return false;
                }
                Object obj = jSONObject.get(b10);
                int hashCode = b10.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && b10.equals("not")) {
                            return !d(bundle, obj.toString());
                        }
                    } else if (b10.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (!d(bundle, jSONArray.get(i10).toString())) {
                                    return false;
                                }
                                if (i11 >= length2) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return true;
                    }
                } else if (b10.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (d(bundle, jSONArray2.get(i12).toString())) {
                                return true;
                            }
                            if (i13 >= length) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return g(b10, jSONObject2, bundle);
            } catch (Throwable th2) {
                sl.a.a(b.class, th2);
            }
        }
        return false;
    }

    public static final void e(Bundle bundle, String event) {
        if (sl.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (f16166b && bundle != null) {
                try {
                    a(bundle, event);
                    bundle.putString("_audiencePropertyIds", c(bundle));
                    bundle.putString("cs_maca", "1");
                    f(bundle);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
        }
    }

    public static final void f(Bundle params) {
        if (sl.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = f16168d;
            int i10 = 0;
            while (i10 < 13) {
                String str = strArr[i10];
                i10++;
                params.remove(str);
            }
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e5 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x0056, B:17:0x0069, B:19:0x0061, B:29:0x0091, B:30:0x0099, B:33:0x00a5, B:37:0x00af, B:39:0x00b5, B:41:0x00c0, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:46:0x00d8, B:47:0x00d9, B:51:0x00e3, B:56:0x00f0, B:62:0x0281, B:65:0x0289, B:66:0x028d, B:68:0x0293, B:70:0x029b, B:72:0x02aa, B:79:0x02ba, B:80:0x02bf, B:82:0x02c0, B:83:0x02c5, B:85:0x00fa, B:89:0x0104, B:91:0x010a, B:93:0x0115, B:95:0x0122, B:96:0x0127, B:97:0x0128, B:98:0x012d, B:99:0x012e, B:105:0x02d3, B:109:0x02db, B:110:0x02df, B:112:0x02e5, B:114:0x02ed, B:116:0x02fc, B:122:0x030b, B:123:0x0310, B:125:0x0311, B:126:0x0316, B:129:0x0138, B:133:0x0142, B:135:0x0148, B:137:0x0153, B:139:0x0160, B:140:0x0165, B:141:0x0166, B:142:0x016b, B:143:0x016c, B:147:0x021c, B:151:0x0176, B:155:0x0200, B:159:0x0180, B:163:0x01da, B:167:0x018a, B:171:0x0194, B:175:0x0262, B:179:0x019e, B:183:0x01a8, B:189:0x03b7, B:191:0x01b2, B:195:0x0232, B:199:0x01bc, B:203:0x01c6, B:207:0x024e, B:209:0x01d0, B:213:0x01ec, B:217:0x01f6, B:221:0x0212, B:225:0x0228, B:229:0x0244, B:233:0x0258, B:237:0x0274, B:241:0x02c6, B:245:0x0317, B:249:0x0321, B:251:0x0327, B:253:0x0332, B:257:0x0341, B:258:0x0346, B:259:0x0347, B:260:0x034c, B:261:0x034d, B:265:0x0357, B:267:0x0361, B:273:0x03a2, B:275:0x036b, B:279:0x0375, B:281:0x0384, B:285:0x038d, B:287:0x0396, B:291:0x03ab, B:295:0x03c0, B:299:0x03c9, B:301:0x03cf, B:303:0x03da, B:307:0x03ea, B:308:0x03ef, B:309:0x03f0, B:310:0x03f5, B:312:0x007f, B:324:0x0052, B:315:0x0033, B:318:0x003f), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x0056, B:17:0x0069, B:19:0x0061, B:29:0x0091, B:30:0x0099, B:33:0x00a5, B:37:0x00af, B:39:0x00b5, B:41:0x00c0, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:46:0x00d8, B:47:0x00d9, B:51:0x00e3, B:56:0x00f0, B:62:0x0281, B:65:0x0289, B:66:0x028d, B:68:0x0293, B:70:0x029b, B:72:0x02aa, B:79:0x02ba, B:80:0x02bf, B:82:0x02c0, B:83:0x02c5, B:85:0x00fa, B:89:0x0104, B:91:0x010a, B:93:0x0115, B:95:0x0122, B:96:0x0127, B:97:0x0128, B:98:0x012d, B:99:0x012e, B:105:0x02d3, B:109:0x02db, B:110:0x02df, B:112:0x02e5, B:114:0x02ed, B:116:0x02fc, B:122:0x030b, B:123:0x0310, B:125:0x0311, B:126:0x0316, B:129:0x0138, B:133:0x0142, B:135:0x0148, B:137:0x0153, B:139:0x0160, B:140:0x0165, B:141:0x0166, B:142:0x016b, B:143:0x016c, B:147:0x021c, B:151:0x0176, B:155:0x0200, B:159:0x0180, B:163:0x01da, B:167:0x018a, B:171:0x0194, B:175:0x0262, B:179:0x019e, B:183:0x01a8, B:189:0x03b7, B:191:0x01b2, B:195:0x0232, B:199:0x01bc, B:203:0x01c6, B:207:0x024e, B:209:0x01d0, B:213:0x01ec, B:217:0x01f6, B:221:0x0212, B:225:0x0228, B:229:0x0244, B:233:0x0258, B:237:0x0274, B:241:0x02c6, B:245:0x0317, B:249:0x0321, B:251:0x0327, B:253:0x0332, B:257:0x0341, B:258:0x0346, B:259:0x0347, B:260:0x034c, B:261:0x034d, B:265:0x0357, B:267:0x0361, B:273:0x03a2, B:275:0x036b, B:279:0x0375, B:281:0x0384, B:285:0x038d, B:287:0x0396, B:291:0x03ab, B:295:0x03c0, B:299:0x03c9, B:301:0x03cf, B:303:0x03da, B:307:0x03ea, B:308:0x03ef, B:309:0x03f0, B:310:0x03f5, B:312:0x007f, B:324:0x0052, B:315:0x0033, B:318:0x003f), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a2 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x0056, B:17:0x0069, B:19:0x0061, B:29:0x0091, B:30:0x0099, B:33:0x00a5, B:37:0x00af, B:39:0x00b5, B:41:0x00c0, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:46:0x00d8, B:47:0x00d9, B:51:0x00e3, B:56:0x00f0, B:62:0x0281, B:65:0x0289, B:66:0x028d, B:68:0x0293, B:70:0x029b, B:72:0x02aa, B:79:0x02ba, B:80:0x02bf, B:82:0x02c0, B:83:0x02c5, B:85:0x00fa, B:89:0x0104, B:91:0x010a, B:93:0x0115, B:95:0x0122, B:96:0x0127, B:97:0x0128, B:98:0x012d, B:99:0x012e, B:105:0x02d3, B:109:0x02db, B:110:0x02df, B:112:0x02e5, B:114:0x02ed, B:116:0x02fc, B:122:0x030b, B:123:0x0310, B:125:0x0311, B:126:0x0316, B:129:0x0138, B:133:0x0142, B:135:0x0148, B:137:0x0153, B:139:0x0160, B:140:0x0165, B:141:0x0166, B:142:0x016b, B:143:0x016c, B:147:0x021c, B:151:0x0176, B:155:0x0200, B:159:0x0180, B:163:0x01da, B:167:0x018a, B:171:0x0194, B:175:0x0262, B:179:0x019e, B:183:0x01a8, B:189:0x03b7, B:191:0x01b2, B:195:0x0232, B:199:0x01bc, B:203:0x01c6, B:207:0x024e, B:209:0x01d0, B:213:0x01ec, B:217:0x01f6, B:221:0x0212, B:225:0x0228, B:229:0x0244, B:233:0x0258, B:237:0x0274, B:241:0x02c6, B:245:0x0317, B:249:0x0321, B:251:0x0327, B:253:0x0332, B:257:0x0341, B:258:0x0346, B:259:0x0347, B:260:0x034c, B:261:0x034d, B:265:0x0357, B:267:0x0361, B:273:0x03a2, B:275:0x036b, B:279:0x0375, B:281:0x0384, B:285:0x038d, B:287:0x0396, B:291:0x03ab, B:295:0x03c0, B:299:0x03c9, B:301:0x03cf, B:303:0x03da, B:307:0x03ea, B:308:0x03ef, B:309:0x03f0, B:310:0x03f5, B:312:0x007f, B:324:0x0052, B:315:0x0033, B:318:0x003f), top: B:5:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0281 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x0056, B:17:0x0069, B:19:0x0061, B:29:0x0091, B:30:0x0099, B:33:0x00a5, B:37:0x00af, B:39:0x00b5, B:41:0x00c0, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:46:0x00d8, B:47:0x00d9, B:51:0x00e3, B:56:0x00f0, B:62:0x0281, B:65:0x0289, B:66:0x028d, B:68:0x0293, B:70:0x029b, B:72:0x02aa, B:79:0x02ba, B:80:0x02bf, B:82:0x02c0, B:83:0x02c5, B:85:0x00fa, B:89:0x0104, B:91:0x010a, B:93:0x0115, B:95:0x0122, B:96:0x0127, B:97:0x0128, B:98:0x012d, B:99:0x012e, B:105:0x02d3, B:109:0x02db, B:110:0x02df, B:112:0x02e5, B:114:0x02ed, B:116:0x02fc, B:122:0x030b, B:123:0x0310, B:125:0x0311, B:126:0x0316, B:129:0x0138, B:133:0x0142, B:135:0x0148, B:137:0x0153, B:139:0x0160, B:140:0x0165, B:141:0x0166, B:142:0x016b, B:143:0x016c, B:147:0x021c, B:151:0x0176, B:155:0x0200, B:159:0x0180, B:163:0x01da, B:167:0x018a, B:171:0x0194, B:175:0x0262, B:179:0x019e, B:183:0x01a8, B:189:0x03b7, B:191:0x01b2, B:195:0x0232, B:199:0x01bc, B:203:0x01c6, B:207:0x024e, B:209:0x01d0, B:213:0x01ec, B:217:0x01f6, B:221:0x0212, B:225:0x0228, B:229:0x0244, B:233:0x0258, B:237:0x0274, B:241:0x02c6, B:245:0x0317, B:249:0x0321, B:251:0x0327, B:253:0x0332, B:257:0x0341, B:258:0x0346, B:259:0x0347, B:260:0x034c, B:261:0x034d, B:265:0x0357, B:267:0x0361, B:273:0x03a2, B:275:0x036b, B:279:0x0375, B:281:0x0384, B:285:0x038d, B:287:0x0396, B:291:0x03ab, B:295:0x03c0, B:299:0x03c9, B:301:0x03cf, B:303:0x03da, B:307:0x03ea, B:308:0x03ef, B:309:0x03f0, B:310:0x03f5, B:312:0x007f, B:324:0x0052, B:315:0x0033, B:318:0x003f), top: B:5:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.b.g(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
