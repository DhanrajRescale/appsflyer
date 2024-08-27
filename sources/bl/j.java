package bl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import c2.p0;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.q;
import j9.g0;
import j9.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.s;
import kotlin.text.w;
import lp.e1;
import m0.b7;
import nl.n0;
import nv.e0;
import nv.s0;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.g1;
import t0.n;
import t0.o3;
import t0.t;
import t0.x1;
import t3.p;
import u9.o;
import u9.r;
import xk.v;
import xk.z;

/* loaded from: classes.dex */
public abstract class j implements kr.b, xs.b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f7114a = true;

    public static Drawable C(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f7114a) {
                if (theme != null) {
                    context3 = new k.e(context2, theme);
                } else {
                    context3 = context2;
                }
                return iu.j.m(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return r3.k.getDrawable(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f7114a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = p.f35324a;
        return t3.i.a(resources, i10, theme);
    }

    public static final File D() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final boolean H(StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (!s.r(className, "com.facebook", false)) {
            String className2 = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            if (!s.r(className2, "com.meta", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean I(View isRtl) {
        Intrinsics.e(isRtl, "$this$isRtl");
        Resources resources = isRtl.getResources();
        Intrinsics.b(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.b(configuration, "resources.configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean J(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (H(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!s.r(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!s.r(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (s.r(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (s.r(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!s.r(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean K(View isVisible) {
        Intrinsics.e(isVisible, "$this$isVisible");
        if (isVisible instanceof Button) {
            Button button = (Button) isVisible;
            if (button.getVisibility() != 0) {
                return false;
            }
            Intrinsics.b(button.getText(), "this.text");
            if (!(!w.C(w.X(r3)))) {
                return false;
            }
        } else if (isVisible.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static ad.g M(String imageUrl, String shareText) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        Bundle bundle = new Bundle();
        bundle.putString("SHARE_ACHIEVEMENT_IMAGE_URL", imageUrl);
        bundle.putString("SHARE_ACHIEVEMENT_SHARE_TEXT", shareText);
        ad.g gVar = new ad.g();
        gVar.setArguments(bundle);
        return gVar;
    }

    public static bk.c P(v9.d dVar, j9.i iVar) {
        return new bk.c(0, r.a(dVar, iVar, 1.0f, u9.f.f36995a, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b4.l, q9.a] */
    public static q9.a Q(v9.c cVar, j9.i iVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = w9.f.c();
        } else {
            f10 = 1.0f;
        }
        return new b4.l(r.a(cVar, iVar, f10, u9.j.f37010a, false), 5);
    }

    public static bk.c R(v9.d dVar, j9.i iVar) {
        return new bk.c(2, r.a(dVar, iVar, 1.0f, o.f37019a, false));
    }

    public static bk.c S(v9.d dVar, j9.i iVar) {
        return new bk.c(3, r.a(dVar, iVar, w9.f.c(), u9.w.f37034a, true));
    }

    public static final JSONObject X(String str) {
        File D = D();
        if (D != null && str != null) {
            try {
                return new JSONObject(n0.P(new FileInputStream(new File(D, str))));
            } catch (Exception unused) {
                w(str);
            }
        }
        return null;
    }

    public static final void Y(String str, JSONArray reports, v vVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject o10 = n0.o();
            if (o10 != null) {
                Iterator<String> keys = o10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o10.get(next));
                }
            }
            String str2 = z.f40475j;
            ek.e.y(null, a3.a.m(new Object[]{FacebookSdk.getApplicationId()}, 1, "%s/instruments", "java.lang.String.format(format, *args)"), jSONObject, vVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final void Z(String str, String str2) {
        File D = D();
        if (D != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(D, str));
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static float c(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final void d(j9.i iVar, float f10, g1.o oVar, boolean z10, boolean z11, boolean z12, g0 g0Var, boolean z13, g1.d dVar, a2.l lVar, boolean z14, n nVar, int i10, int i11, int i12) {
        g1.o oVar2;
        boolean z15;
        boolean z16;
        boolean z17;
        g0 g0Var2;
        boolean z18;
        g1.d dVar2;
        a2.l lVar2;
        boolean z19;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(185153540);
        if ((i12 & 4) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        if ((i12 & 8) != 0) {
            z15 = false;
        } else {
            z15 = z10;
        }
        if ((i12 & 16) != 0) {
            z16 = false;
        } else {
            z16 = z11;
        }
        if ((i12 & 32) != 0) {
            z17 = false;
        } else {
            z17 = z12;
        }
        if ((i12 & 64) != 0) {
            g0Var2 = g0.f21155a;
        } else {
            g0Var2 = g0Var;
        }
        if ((i12 & 128) != 0) {
            z18 = false;
        } else {
            z18 = z13;
        }
        if ((i12 & 512) != 0) {
            dVar2 = g1.a.f16383e;
        } else {
            dVar2 = dVar;
        }
        if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            lVar2 = a2.k.f97b;
        } else {
            lVar2 = lVar;
        }
        if ((i12 & 2048) != 0) {
            z19 = true;
        } else {
            z19 = z14;
        }
        Float valueOf = Float.valueOf(f10);
        rVar.b0(-3686930);
        boolean h10 = rVar.h(valueOf);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            Q = new b7(1, f10);
            rVar.k0(Q);
        }
        rVar.s(false);
        g(iVar, (Function0) Q, oVar2, z15, z16, z17, g0Var2, z18, dVar2, lVar2, z19, null, rVar, (i10 & 896) | 134217736 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (1879048192 & i10), (i11 & 14) | (i11 & 112), 4096);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n9.l(iVar, f10, oVar2, z15, z16, z17, g0Var2, z18, dVar2, lVar2, z19, i10, i11, i12);
        }
    }

    public static final void f(j9.i iVar, g1.o oVar, boolean z10, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14, g0 g0Var, boolean z15, boolean z16, g1.d dVar, a2.l lVar, boolean z17, Map map, n nVar, int i11, int i12, int i13) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(185154698);
        g1.o oVar2 = (i13 & 2) != 0 ? g1.l.f16404b : oVar;
        boolean z18 = (i13 & 4) != 0 ? true : z10;
        boolean z19 = (i13 & 8) != 0 ? true : z11;
        float f11 = (i13 & 32) != 0 ? 1.0f : f10;
        int i14 = (i13 & 64) != 0 ? 1 : i10;
        boolean z20 = (i13 & 128) != 0 ? false : z12;
        boolean z21 = (i13 & 256) != 0 ? false : z13;
        boolean z22 = (i13 & 512) != 0 ? false : z14;
        g0 g0Var2 = (i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? g0.f21155a : g0Var;
        boolean z23 = (i13 & 2048) != 0 ? false : z15;
        boolean z24 = (i13 & 4096) != 0 ? false : z16;
        g1.d dVar2 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? g1.a.f16383e : dVar;
        a2.l lVar2 = (32768 & i13) != 0 ? a2.k.f97b : lVar;
        boolean z25 = (65536 & i13) != 0 ? true : z17;
        Map map2 = (131072 & i13) != 0 ? null : map;
        n9.b H = yk.o.H(iVar, z18, z19, z23, f11, i14, rVar, 896);
        rVar.b0(-3686930);
        boolean h10 = rVar.h(H);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            Q = new p0(H, 15);
            rVar.k0(Q);
        }
        rVar.s(false);
        Function0 function0 = (Function0) Q;
        int i15 = i11 >> 12;
        int i16 = ((i11 << 3) & 896) | 134217736 | (i15 & 7168) | (57344 & i15) | (i15 & 458752) | ((i12 << 18) & 3670016);
        int i17 = i12 << 15;
        int i18 = i16 | (29360128 & i17) | (i17 & 1879048192);
        int i19 = i12 >> 15;
        g(iVar, function0, oVar2, z20, z21, z22, g0Var2, z24, dVar2, lVar2, z25, map2, rVar, i18, (i19 & 112) | (i19 & 14) | 512, 0);
        x1 w10 = rVar.w();
        if (w10 == null) {
            return;
        }
        w10.f35245d = new n9.m(iVar, oVar2, z18, z19, f11, i14, z20, z21, z22, g0Var2, z23, z24, dVar2, lVar2, z25, map2, i11, i12, i13);
    }

    public static final void g(j9.i iVar, Function0 progress, g1.o oVar, boolean z10, boolean z11, boolean z12, g0 g0Var, boolean z13, g1.d dVar, a2.l lVar, boolean z14, Map map, n nVar, int i10, int i11, int i12) {
        t0.r rVar;
        Intrinsics.checkNotNullParameter(progress, "progress");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(185150686);
        g1.o oVar2 = (i12 & 4) != 0 ? g1.l.f16404b : oVar;
        boolean z15 = (i12 & 8) != 0 ? false : z10;
        boolean z16 = (i12 & 16) != 0 ? false : z11;
        boolean z17 = (i12 & 32) != 0 ? false : z12;
        g0 g0Var2 = (i12 & 64) != 0 ? g0.f21155a : g0Var;
        boolean z18 = (i12 & 128) != 0 ? false : z13;
        g1.d dVar2 = (i12 & 512) != 0 ? g1.a.f16383e : dVar;
        a2.l lVar2 = (i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? a2.k.f97b : lVar;
        boolean z19 = (i12 & 2048) != 0 ? true : z14;
        Map map2 = (i12 & 4096) != 0 ? null : map;
        rVar2.b0(-3687241);
        Object Q = rVar2.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = new y();
            rVar2.k0(Q);
        }
        rVar2.s(false);
        y yVar = (y) Q;
        rVar2.b0(-3687241);
        Object Q2 = rVar2.Q();
        if (Q2 == eVar) {
            Q2 = new Matrix();
            rVar2.k0(Q2);
        }
        rVar2.s(false);
        Matrix matrix = (Matrix) Q2;
        rVar2.b0(-3687241);
        Object Q3 = rVar2.Q();
        if (Q3 == eVar) {
            Q3 = t.n0(null, o3.f35116a);
            rVar2.k0(Q3);
        }
        rVar2.s(false);
        g1 g1Var = (g1) Q3;
        rVar2.b0(185151463);
        if (iVar != null && iVar.b() != s0.g.f34069a) {
            rVar2.s(false);
            float c10 = w9.f.c();
            g1.o oVar3 = oVar2;
            androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.n(oVar2, iVar.f21175j.width() / c10, iVar.f21175j.height() / c10), new n9.k(iVar, lVar2, dVar2, matrix, yVar, z17, g0Var2, map2, z15, z16, z18, z19, progress, g1Var), rVar2, 0);
            x1 w10 = rVar2.w();
            if (w10 == null) {
                return;
            }
            w10.f35245d = new n9.j(iVar, progress, oVar3, z15, z16, z17, g0Var2, z18, dVar2, lVar2, z19, map2, i10, i11, i12, 1);
            return;
        }
        g1.o oVar4 = oVar2;
        rVar2.s(false);
        x1 w11 = rVar2.w();
        if (w11 == null) {
            rVar = rVar2;
        } else {
            rVar = rVar2;
            w11.f35245d = new n9.j(iVar, progress, oVar4, z15, z16, z17, g0Var2, z18, dVar2, lVar2, z19, map2, i10, i11, i12, 0);
        }
        b0.s.a(oVar4, rVar, (i10 >> 6) & 14);
    }

    public static float h(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int j(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(androidx.lifecycle.o r6, yt.a r7) {
        /*
            boolean r0 = r7 instanceof d9.b
            if (r0 == 0) goto L13
            r0 = r7
            d9.b r0 = (d9.b) r0
            int r1 = r0.f14218d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14218d = r1
            goto L18
        L13:
            d9.b r0 = new d9.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14217c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f14218d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            iu.z r6 = r0.f14216b
            androidx.lifecycle.o r0 = r0.f14215a
            ut.n.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L7e
        L2b:
            r7 = move-exception
            goto L8c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ut.n.b(r7)
            androidx.lifecycle.n r7 = r6.b()
            androidx.lifecycle.n r2 = androidx.lifecycle.n.f1950d
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L47
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        L47:
            iu.z r7 = new iu.z
            r7.<init>()
            r0.f14215a = r6     // Catch: java.lang.Throwable -> L8a
            r0.f14216b = r7     // Catch: java.lang.Throwable -> L8a
            r0.f14218d = r3     // Catch: java.lang.Throwable -> L8a
            qu.i r2 = new qu.i     // Catch: java.lang.Throwable -> L8a
            yt.a r4 = zt.f.b(r0)     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8a
            r2.s()     // Catch: java.lang.Throwable -> L8a
            d9.c r3 = new d9.c     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8a
            r7.f20560a = r3     // Catch: java.lang.Throwable -> L8a
            r6.a(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.p()     // Catch: java.lang.Throwable -> L8a
            if (r2 != r1) goto L79
            java.lang.String r3 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)     // Catch: java.lang.Throwable -> L8a
            goto L79
        L74:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L8c
        L79:
            if (r2 != r1) goto L7c
            return r1
        L7c:
            r0 = r6
            r6 = r7
        L7e:
            java.lang.Object r6 = r6.f20560a
            androidx.lifecycle.s r6 = (androidx.lifecycle.s) r6
            if (r6 == 0) goto L87
            r0.c(r6)
        L87:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        L8a:
            r0 = move-exception
            goto L74
        L8c:
            java.lang.Object r6 = r6.f20560a
            androidx.lifecycle.s r6 = (androidx.lifecycle.s) r6
            if (r6 == 0) goto L95
            r0.c(r6)
        L95:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.j.n(androidx.lifecycle.o, yt.a):java.lang.Object");
    }

    public static g5.i o(m5.m mVar, String str, m5.j jVar, int i10) {
        g5.h hVar = new g5.h();
        hVar.f16558a = vl.b.f0(str, jVar.f27558c);
        hVar.f16563f = jVar.f27556a;
        hVar.f16564g = jVar.f27557b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = jVar.b(((m5.b) mVar.f27565b.get(0)).f27509a).toString();
        }
        hVar.d(a10);
        hVar.b(i10);
        hVar.c();
        return hVar.a();
    }

    public static final void w(String str) {
        File D = D();
        if (D != null && str != null) {
            new File(D, str).delete();
        }
    }

    public static int y(int i10, float f10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float c10 = c(((i10 >> 16) & 255) / 255.0f);
        float c11 = c(((i10 >> 8) & 255) / 255.0f);
        float c12 = c((i10 & 255) / 255.0f);
        float c13 = c(((i11 >> 16) & 255) / 255.0f);
        float c14 = c(((i11 >> 8) & 255) / 255.0f);
        float c15 = c((i11 & 255) / 255.0f);
        float b10 = nn.d.b(f12, f11, f10, f11);
        float b11 = nn.d.b(c13, c10, f10, c10);
        float b12 = nn.d.b(c14, c11, f10, c11);
        float b13 = nn.d.b(c15, c12, f10, c12);
        float h10 = h(b11) * 255.0f;
        float h11 = h(b12) * 255.0f;
        return Math.round(h(b13) * 255.0f) | (Math.round(h10) << 16) | (Math.round(b10 * 255.0f) << 24) | (Math.round(h11) << 8);
    }

    public static int z(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public int A() {
        return 10;
    }

    public String B() {
        return null;
    }

    public abstract d0.p0 E();

    public Object F(int i10) {
        Object invoke;
        d0.f c10 = E().c(i10);
        int i11 = i10 - c10.f13157a;
        Function1 key = ((q) c10.f13159c).getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(i11))) == null) {
            return new d0.d(i10);
        }
        return invoke;
    }

    public String G() {
        return null;
    }

    public e0 L() {
        return new e0(this, 0);
    }

    public abstract void N(int i10);

    public abstract void O(Typeface typeface, boolean z10);

    public abstract void T(a3.h hVar, a3.h hVar2);

    public abstract void U(l8.g gVar, l8.g gVar2);

    public abstract void V(a3.h hVar, Thread thread);

    public abstract void W(l8.g gVar, Thread thread);

    @Override // kr.b
    public mr.b e(String str, int i10, int i11, int i12, Map map) {
        if (!str.isEmpty()) {
            if (i11 >= 0 && i12 >= 0) {
                int A = A();
                if (map != null) {
                    kr.a aVar = kr.a.f23472f;
                    if (map.containsKey(aVar)) {
                        A = Integer.parseInt(map.get(aVar).toString());
                    }
                }
                boolean[] x10 = x(str);
                int length = x10.length;
                int i13 = A + length;
                int max = Math.max(i11, i13);
                int max2 = Math.max(1, i12);
                int i14 = max / i13;
                int i15 = (max - (length * i14)) / 2;
                mr.b bVar = new mr.b(max, max2);
                int i16 = 0;
                while (i16 < length) {
                    if (x10[i16]) {
                        bVar.c(i15, 0, i14, max2);
                    }
                    i16++;
                    i15 += i14;
                }
                return bVar;
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i11 + 'x' + i12);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract j i(Object obj);

    public abstract void k(s0 s0Var, Object obj);

    public e0 l() {
        return new e0(this, 1);
    }

    public e1 m() {
        kp.j.A(2, "expectedValuesPerKey");
        return new e1(this);
    }

    public abstract boolean p(a3.i iVar, a3.e eVar, a3.e eVar2);

    public abstract boolean q(l8.h hVar, l8.c cVar, l8.c cVar2);

    public abstract boolean r(a3.i iVar, Object obj, Object obj2);

    public abstract boolean s(l8.h hVar, Object obj, Object obj2);

    public abstract boolean t(a3.i iVar, a3.h hVar, a3.h hVar2);

    public abstract boolean u(l8.h hVar, l8.g gVar, l8.g gVar2);

    public abstract Map v();

    public abstract boolean[] x(String str);
}
