package hl;

import android.os.Bundle;
import android.text.TextUtils;
import ek.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt.y;
import xk.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f18611a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f18612b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f18613c = y.g("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d, reason: collision with root package name */
    public static final List f18614d = y.g("none", "address", "health");

    public static final File d() {
        c task = c.f18601b;
        if (sl.a.b(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            d dVar = (d) f18612b.get(task.b());
            if (dVar == null) {
                return null;
            }
            return dVar.f18608f;
        } catch (Throwable th2) {
            sl.a.a(e.class, th2);
            return null;
        }
    }

    public static final String[] f(c task, float[][] denses, String[] texts) {
        b bVar;
        if (sl.a.b(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            d dVar = (d) f18612b.get(task.b());
            if (dVar == null) {
                bVar = null;
            } else {
                bVar = dVar.f18609g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr = dVar.f18607e;
            int length = texts.length;
            int length2 = denses[0].length;
            a aVar = new a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar.f18586c, i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            a a10 = bVar.a(aVar, texts, task.a());
            if (a10 != null && fArr != null && a10.f18586c.length != 0 && fArr.length != 0) {
                int ordinal = task.ordinal();
                e eVar = f18611a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return eVar.h(a10, fArr);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return eVar.g(a10, fArr);
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(e.class, th2);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    d e10 = h.e(jSONObject.getJSONObject(keys.next()));
                    if (e10 != null) {
                        f18612b.put(e10.f18603a, e10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (kotlin.text.w.s(r7, "en", false) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            boolean r0 = sl.a.b(r10)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.ConcurrentHashMap r1 = hl.e.f18612b     // Catch: java.lang.Throwable -> L8d
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = r3
        L1a:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L8d
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L8d
            hl.d r4 = (hl.d) r4     // Catch: java.lang.Throwable -> L8d
            hl.c r7 = hl.c.f18601b     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r7.b()     // Catch: java.lang.Throwable -> L8d
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r5, r7)     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L8f
            java.lang.String r6 = r4.f18604b     // Catch: java.lang.Throwable -> L8d
            int r7 = r4.f18606d     // Catch: java.lang.Throwable -> L8d
            int r8 = java.lang.Math.max(r8, r7)     // Catch: java.lang.Throwable -> L8d
            nl.v r7 = nl.v.f28944a     // Catch: java.lang.Throwable -> L8d
            nl.t r7 = nl.t.SuggestedEvents     // Catch: java.lang.Throwable -> L8d
            boolean r7 = nl.v.b(r7)     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L8f
            boolean r7 = sl.a.b(r10)     // Catch: java.lang.Throwable -> L8d
            if (r7 == 0) goto L57
            goto L8f
        L57:
            android.content.Context r7 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L7b
            goto L67
        L66:
            r7 = r2
        L67:
            if (r7 == 0) goto L80
            java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r9 = "locale.language"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r9 = "en"
            boolean r7 = kotlin.text.w.s(r7, r9, r3)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L8f
            goto L80
        L7b:
            r7 = move-exception
            sl.a.a(r10, r7)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L80:
            com.appsflyer.internal.l r7 = new com.appsflyer.internal.l     // Catch: java.lang.Throwable -> L8d
            r9 = 12
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L8d
            r4.f18610h = r7     // Catch: java.lang.Throwable -> L8d
            r0.add(r4)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r0 = move-exception
            goto Ld3
        L8f:
            hl.c r7 = hl.c.f18600a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r7.b()     // Catch: java.lang.Throwable -> L8d
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r7)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L1a
            java.lang.String r6 = r4.f18604b     // Catch: java.lang.Throwable -> L8d
            int r5 = r4.f18606d     // Catch: java.lang.Throwable -> L8d
            int r8 = java.lang.Math.max(r8, r5)     // Catch: java.lang.Throwable -> L8d
            nl.v r5 = nl.v.f28944a     // Catch: java.lang.Throwable -> L8d
            nl.t r5 = nl.t.IntelligentIntegrity     // Catch: java.lang.Throwable -> L8d
            boolean r5 = nl.v.b(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L1a
            com.appsflyer.internal.l r5 = new com.appsflyer.internal.l     // Catch: java.lang.Throwable -> L8d
            r7 = 13
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L8d
            r4.f18610h = r5     // Catch: java.lang.Throwable -> L8d
            r0.add(r4)     // Catch: java.lang.Throwable -> L8d
            goto L1a
        Lbb:
            if (r6 == 0) goto Ld2
            if (r8 <= 0) goto Ld2
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto Ld2
            hl.d r1 = new hl.d     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8d
            ek.h.m(r1, r0)     // Catch: java.lang.Throwable -> L8d
        Ld2:
            return
        Ld3:
            sl.a.a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.e.b():void");
    }

    public final JSONObject c() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = z.f40475j;
            z w10 = ek.e.w(null, "app/model_asset", null);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            w10.f40482d = bundle;
            JSONObject jSONObject = w10.c().f40343b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                        jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                        jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                        jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                        if (jSONObject3.has("rules_uri")) {
                            jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                        }
                        jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return jSONObject2;
                        }
                    }
                } else {
                    return jSONObject2;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(a aVar, float[] fArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18584a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f18586c;
            if (i11 != fArr.length) {
                return null;
            }
            IntRange k10 = kotlin.ranges.d.k(0, i10);
            ArrayList arrayList = new ArrayList(vt.z.k(k10));
            nu.f it = k10.iterator();
            while (it.f29173c) {
                int b10 = it.b();
                Object obj = "none";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(b10 * i11) + i13] >= fArr[i12]) {
                        obj = f18614d.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final String[] h(a aVar, float[] fArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f18584a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f18586c;
            if (i11 != fArr.length) {
                return null;
            }
            IntRange k10 = kotlin.ranges.d.k(0, i10);
            ArrayList arrayList = new ArrayList(vt.z.k(k10));
            nu.f it = k10.iterator();
            while (it.f29173c) {
                int b10 = it.b();
                Object obj = "other";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(b10 * i11) + i13] >= fArr[i12]) {
                        obj = f18613c.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
