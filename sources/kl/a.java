package kl;

import android.util.Patterns;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.g;
import vt.p0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23237a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Map f23238b;

    /* renamed from: c, reason: collision with root package name */
    public static Map f23239c;

    /* renamed from: d, reason: collision with root package name */
    public static Map f23240d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONObject f23241e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f23242f;

    public static final float[] a(String appName, JSONObject viewHierarchy) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b10;
        if (sl.a.b(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f23242f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f23237a;
                aVar.h(jSONObject, jSONArray);
                aVar.k(fArr, aVar.g(jSONObject));
                b10 = aVar.b(jSONObject);
            } catch (JSONException unused) {
            }
            if (b10 == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            aVar.k(fArr, aVar.f(b10, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            sl.a.a(a.class, th2);
            return null;
        }
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (sl.a.b(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            sl.a.a(a.class, th2);
            return null;
        }
    }

    public static final void d(File file) {
        if (sl.a.b(a.class)) {
            return;
        }
        try {
            try {
                f23241e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f23241e = new JSONObject(new String(bArr, Charsets.UTF_8));
                f23238b = p0.g(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                f23239c = p0.g(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                f23240d = p0.g(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f23242f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            sl.a.a(a.class, th2);
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        int length;
        if (sl.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (w.s(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }

    public final float[] f(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f10 = length - 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (!sl.a.b(this)) {
                            try {
                                if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                    fArr[9] = fArr[9] + 1.0f;
                                }
                            } catch (Throwable th2) {
                                sl.a.a(this, th2);
                            }
                        }
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            l(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "textSB.toString()");
            if (j("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5)) {
                f11 = 1.0f;
            } else {
                f11 = g.f34069a;
            }
            fArr[15] = f11;
            if (j("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f12 = 1.0f;
            } else {
                f12 = g.f34069a;
            }
            fArr[16] = f12;
            if (j("COMPLETE_REGISTRATION", "BUTTON_ID", sb4)) {
                f13 = 1.0f;
            } else {
                f13 = g.f34069a;
            }
            fArr[17] = f13;
            if (w.s(str2, "password", false)) {
                f14 = 1.0f;
            } else {
                f14 = g.f34069a;
            }
            fArr[18] = f14;
            if (i("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f15 = 1.0f;
            } else {
                f15 = g.f34069a;
            }
            fArr[19] = f15;
            if (i("(?i)(sign in)|login|signIn", str2)) {
                f16 = 1.0f;
            } else {
                f16 = g.f34069a;
            }
            fArr[20] = f16;
            if (i("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f17 = 1.0f;
            } else {
                f17 = g.f34069a;
            }
            fArr[21] = f17;
            if (j("PURCHASE", "BUTTON_TEXT", sb5)) {
                f18 = 1.0f;
            } else {
                f18 = g.f34069a;
            }
            fArr[22] = f18;
            if (j("PURCHASE", "PAGE_TITLE", str4)) {
                f19 = 1.0f;
            } else {
                f19 = g.f34069a;
            }
            fArr[24] = f19;
            if (i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5)) {
                f20 = 1.0f;
            } else {
                f20 = g.f34069a;
            }
            fArr[25] = f20;
            if (i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f21 = 1.0f;
            } else {
                f21 = g.f34069a;
            }
            fArr[27] = f21;
            if (j("LEAD", "BUTTON_TEXT", sb5)) {
                f22 = 1.0f;
            } else {
                f22 = g.f34069a;
            }
            fArr[28] = f22;
            if (j("LEAD", "PAGE_TITLE", str4)) {
                f23 = 1.0f;
            } else {
                f23 = g.f34069a;
            }
            fArr[29] = f23;
            return fArr;
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return null;
        }
    }

    public final float[] g(JSONObject jSONObject) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (e(new String[]{"$", PaymentConstants.AMOUNT, "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (w.s(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (w.s(lowerCase3, "radio", false) && w.s(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        k(fArr, g(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final boolean h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (sl.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            z10 = false;
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i14);
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (h(child, jSONArray)) {
                            jSONArray2.put(child);
                            z11 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }

    public final boolean i(String str, String str2) {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x000a, B:8:0x000f, B:18:0x005f, B:20:0x0045, B:23:0x004e, B:25:0x0052, B:26:0x0066, B:27:0x006b, B:28:0x002b, B:31:0x0034, B:33:0x0038, B:34:0x006c, B:35:0x0071, B:36:0x0019, B:38:0x001d, B:39:0x0072, B:40:0x0077, B:41:0x0078, B:42:0x007d), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ENGLISH"
            boolean r1 = sl.a.b(r5)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = kl.a.f23241e     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r1 == 0) goto L78
            java.lang.String r4 = "rulesForLanguage"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L19
            r0 = r3
            goto L27
        L19:
            java.util.Map r4 = kl.a.f23238b     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L72
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L64
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L64
        L27:
            if (r0 != 0) goto L2b
        L29:
            r6 = r3
            goto L42
        L2b:
            java.lang.String r1 = "rulesForEvent"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L34
            goto L29
        L34:
            java.util.Map r1 = kl.a.f23239c     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L6c
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L64
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L64
        L42:
            if (r6 != 0) goto L45
            goto L5c
        L45:
            java.lang.String r0 = "positiveRules"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L64
            if (r6 != 0) goto L4e
            goto L5c
        L4e:
            java.util.Map r0 = kl.a.f23240d     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L66
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r6.optString(r7)     // Catch: java.lang.Throwable -> L64
        L5c:
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            boolean r2 = r5.i(r3, r8)     // Catch: java.lang.Throwable -> L64
        L63:
            return r2
        L64:
            r6 = move-exception
            goto L7e
        L66:
            java.lang.String r6 = "textTypeInfo"
            kotlin.jvm.internal.Intrinsics.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L6c:
            java.lang.String r6 = "eventInfo"
            kotlin.jvm.internal.Intrinsics.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L72:
            java.lang.String r6 = "languageInfo"
            kotlin.jvm.internal.Intrinsics.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L78:
            java.lang.String r6 = "rules"
            kotlin.jvm.internal.Intrinsics.k(r6)     // Catch: java.lang.Throwable -> L64
            throw r3     // Catch: java.lang.Throwable -> L64
        L7e:
            sl.a.a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.a.j(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void k(float[] fArr, float[] fArr2) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    fArr[i10] = fArr[i10] + fArr2[i10];
                    if (i11 <= length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void l(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (sl.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", HttpUrl.FRAGMENT_ENCODE_SET);
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", HttpUrl.FRAGMENT_ENCODE_SET);
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject currentChildView = optJSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                        l(currentChildView, sb2, sb3);
                    } catch (JSONException unused) {
                    }
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
