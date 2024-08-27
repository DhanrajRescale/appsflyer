package t0;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.ComposeRuntimeError;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f35201a = new j1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f35202b = new j1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f35203c = new j1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f35204d = new j1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final j1 f35205e = new j1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final s f35206f = new s(0);

    /* renamed from: g, reason: collision with root package name */
    public static final o0 f35207g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f35208h = 0;

    public static final boolean A(x1.t tVar) {
        if (tVar.f39916h && !tVar.f39912d) {
            return true;
        }
        return false;
    }

    public static final void A0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final float[] B(float[] fArr, float[] fArr2, float[] fArr3) {
        m0(fArr, fArr2);
        m0(fArr, fArr3);
        return k0(X(fArr), l0(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final void B0(String str) {
        throw new IllegalStateException(str);
    }

    public static final g1 C(tu.i1 i1Var, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-1439883919);
        kotlin.coroutines.k kVar = kotlin.coroutines.k.f23369a;
        Object value = i1Var.getValue();
        rVar.b0(-606625098);
        rVar.b0(2062127227);
        boolean j10 = rVar.j(kVar) | rVar.j(i1Var);
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        if (j10 || Q == eVar) {
            Q = new g3(kVar, i1Var, null);
            rVar.k0(Q);
        }
        Function2 function2 = (Function2) Q;
        rVar.s(false);
        rVar.b0(-1703169085);
        rVar.b0(-1870531045);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = n0(value, o3.f35116a);
            rVar.k0(Q2);
        }
        g1 g1Var = (g1) Q2;
        rVar.s(false);
        rVar.b0(-1870530972);
        boolean j11 = rVar.j(function2);
        Object Q3 = rVar.Q();
        if (j11 || Q3 == eVar) {
            Q3 = new c3(function2, g1Var, null);
            rVar.k0(Q3);
        }
        rVar.s(false);
        d(i1Var, kVar, (Function2) Q3, rVar);
        v.e.x(rVar, false, false, false);
        return g1Var;
    }

    public static final void C0(String str) {
        throw new IllegalStateException(str);
    }

    public static final void D(n2 n2Var, ArrayList arrayList, int i10) {
        int[] iArr = n2Var.f35086b;
        if (dp.b.G0(iArr, i10)) {
            arrayList.add(n2Var.i(i10));
            return;
        }
        int D0 = dp.b.D0(iArr, i10) + i10;
        for (int i11 = i10 + 1; i11 < D0; i11 += iArr[(i11 * 5) + 3]) {
            D(n2Var, arrayList, i11);
        }
    }

    public static final void D0(String str) {
        throw new IllegalStateException(str);
    }

    public static final boolean E(o1.t tVar, o1.t tVar2) {
        if (tVar == tVar2) {
            return true;
        }
        if (Math.abs(tVar.f29446a - tVar2.f29446a) < 0.001f && Math.abs(tVar.f29447b - tVar2.f29447b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final void E0(x1.k kVar, long j10, Function1 function1, boolean z10) {
        MotionEvent motionEvent;
        x1.f fVar = kVar.f39871b;
        if (fVar != null) {
            motionEvent = fVar.f39845b.f39926b;
        } else {
            motionEvent = null;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z10) {
                motionEvent.setAction(3);
            }
            motionEvent.offsetLocation(-m1.c.d(j10), -m1.c.e(j10));
            function1.invoke(motionEvent);
            motionEvent.offsetLocation(m1.c.d(j10), m1.c.e(j10));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }

    public static final void F(String str) {
        throw new ComposeRuntimeError(nn.d.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final m1.d F0(long j10) {
        int i10 = m1.c.f27236e;
        return h(m1.c.f27233b, j10);
    }

    public static final void G(String str) {
        throw new ComposeRuntimeError(nn.d.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final String G0(float f10) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f11 = f10 * pow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / pow;
        if (max > 0) {
            return String.valueOf(f12);
        }
        return String.valueOf((int) f12);
    }

    public static final g1.o H(g1.o oVar, Function1 function1, hu.c cVar) {
        return oVar.g(new g1.j(function1, cVar));
    }

    public static final int H0(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final vu.f I(kotlin.coroutines.k kVar, n nVar) {
        qu.c0 key = qu.c0.f32192b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext h10 = ((r) nVar).f35167b.h();
        return hl.f.d(h10.l(new qu.q1((qu.o1) h10.g(key))).l(kVar));
    }

    public static final g1.o I0(g1.o oVar, float f10) {
        return oVar.g(new ZIndexElement(f10));
    }

    public static final o1.h J(o1.d dVar, o1.d dVar2, int i10) {
        o1.h hVar;
        if (dVar == dVar2) {
            return new o1.h(dVar, dVar, 1);
        }
        long j10 = o1.c.f29370a;
        if (o1.c.a(dVar.f29376b, j10) && o1.c.a(dVar2.f29376b, j10)) {
            hVar = new o1.g((o1.r) dVar, (o1.r) dVar2, i10);
        } else {
            hVar = new o1.h(dVar, dVar2, i10);
        }
        return hVar;
    }

    public static final void K(r1.c cVar, r1.g0 g0Var) {
        int size = g0Var.f32925j.size();
        for (int i10 = 0; i10 < size; i10++) {
            r1.i0 i0Var = (r1.i0) g0Var.f32925j.get(i10);
            if (i0Var instanceof r1.k0) {
                r1.h hVar = new r1.h();
                r1.k0 k0Var = (r1.k0) i0Var;
                hVar.f32928d = k0Var.f32968b;
                hVar.f32938n = true;
                hVar.c();
                hVar.f32943s.i(k0Var.f32969c);
                hVar.c();
                hVar.c();
                hVar.f32926b = k0Var.f32970d;
                hVar.c();
                hVar.f32927c = k0Var.f32971e;
                hVar.c();
                hVar.f32931g = k0Var.f32972f;
                hVar.c();
                hVar.f32929e = k0Var.f32973g;
                hVar.c();
                hVar.f32930f = k0Var.f32974h;
                hVar.f32939o = true;
                hVar.c();
                hVar.f32932h = k0Var.f32975i;
                hVar.f32939o = true;
                hVar.c();
                hVar.f32933i = k0Var.f32976j;
                hVar.f32939o = true;
                hVar.c();
                hVar.f32934j = k0Var.f32977k;
                hVar.f32939o = true;
                hVar.c();
                hVar.f32935k = k0Var.f32978l;
                hVar.f32940p = true;
                hVar.c();
                hVar.f32936l = k0Var.f32979m;
                hVar.f32940p = true;
                hVar.c();
                hVar.f32937m = k0Var.f32980n;
                hVar.f32940p = true;
                hVar.c();
                cVar.e(i10, hVar);
            } else if (i0Var instanceof r1.g0) {
                r1.c cVar2 = new r1.c();
                r1.g0 g0Var2 = (r1.g0) i0Var;
                cVar2.f32854k = g0Var2.f32916a;
                cVar2.c();
                cVar2.f32855l = g0Var2.f32917b;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32858o = g0Var2.f32920e;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32859p = g0Var2.f32921f;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32860q = g0Var2.f32922g;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32861r = g0Var2.f32923h;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32856m = g0Var2.f32918c;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32857n = g0Var2.f32919d;
                cVar2.f32862s = true;
                cVar2.c();
                cVar2.f32849f = g0Var2.f32924i;
                cVar2.f32850g = true;
                cVar2.c();
                K(cVar2, g0Var2);
                cVar.e(i10, cVar2);
            }
        }
    }

    public static final void L(q2 q2Var, x xVar) {
        int i10;
        int i11;
        int i12 = q2Var.f35161s;
        int i13 = q2Var.f35162t;
        while (i12 < i13) {
            Object x10 = q2Var.x(i12);
            if (x10 instanceof l) {
                xVar.f35232c.add((l) x10);
            }
            int G = q2Var.G(q2Var.f35144b, q2Var.o(i12));
            int i14 = i12 + 1;
            int f10 = q2Var.f(q2Var.f35144b, q2Var.o(i14));
            for (int i15 = G; i15 < f10; i15++) {
                int i16 = i15 - G;
                Object obj = q2Var.f35145c[q2Var.g(i15)];
                boolean z10 = obj instanceof i2;
                to.e eVar = m.f35080a;
                if (z10) {
                    i2 i2Var = (i2) obj;
                    h2 h2Var = i2Var.f35056a;
                    if (h2Var instanceof o) {
                        continue;
                    } else if (obj == q2Var.D(i12, i16, eVar)) {
                        d dVar = i2Var.f35057b;
                        if (dVar != null && dVar.a()) {
                            i10 = q2Var.c(dVar);
                            i11 = q2Var.H(i10);
                        } else {
                            i10 = -1;
                            i11 = -1;
                        }
                        xVar.d(h2Var, i16, i10, i11);
                    } else {
                        F("Slot table is out of sync");
                        throw null;
                    }
                } else if (!(obj instanceof x1)) {
                    continue;
                } else if (obj == q2Var.D(i12, i16, eVar)) {
                    ((x1) obj).c();
                } else {
                    F("Slot table is out of sync");
                    throw null;
                }
            }
            i12 = i14;
        }
    }

    public static final v0.h M() {
        i3 i3Var = a3.f34944b;
        v0.h hVar = (v0.h) i3Var.a();
        if (hVar == null) {
            v0.h hVar2 = new v0.h(new l0[0]);
            i3Var.b(hVar2);
            return hVar2;
        }
        return hVar;
    }

    public static final j0 N(Function0 function0) {
        i3 i3Var = a3.f34943a;
        return new j0(null, function0);
    }

    public static final j0 O(z2 z2Var, Function0 function0) {
        i3 i3Var = a3.f34943a;
        return new j0(z2Var, function0);
    }

    public static final boolean P(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean Q(int i10, int i11) {
        return i10 == i11;
    }

    public static final androidx.compose.ui.node.a R(androidx.compose.ui.node.a aVar, d2.s sVar) {
        for (androidx.compose.ui.node.a q10 = aVar.q(); q10 != null; q10 = q10.q()) {
            if (((Boolean) sVar.invoke(q10)).booleanValue()) {
                return q10;
            }
        }
        return null;
    }

    public static final int S(int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int f10 = Intrinsics.f(((u0) arrayList.get(i12)).f35215b, i10);
            if (f10 < 0) {
                i11 = i12 + 1;
            } else if (f10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static e4.k T(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new e4.k(f2.e.a(view));
        }
        return null;
    }

    public static final long U(long j10) {
        if (j10 != 9205357640488583168L) {
            return g(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f);
        }
        B0("Size is unspecified");
        throw null;
    }

    public static final int V(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final int W(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final float[] X(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final boolean Y(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == s0.g.f34069a) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    public static final boolean Z(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = (j10 >> 32) & 2139095040;
            long j12 = j10 & 2139095040;
            if (j11 == 2139095040 || j12 == 2139095040) {
                return false;
            }
            return true;
        }
        B0("Offset is unspecified");
        throw null;
    }

    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m1.a.f27228b;
        return floatToRawIntBits;
    }

    public static final boolean a0(n1.p0 p0Var, float f10, float f11) {
        m1.d dVar = new m1.d(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        n1.h h10 = androidx.compose.ui.graphics.a.h();
        n1.p0.a(h10, dVar);
        n1.h h11 = androidx.compose.ui.graphics.a.h();
        h11.g(p0Var, h10, 1);
        boolean isEmpty = h11.f28138a.isEmpty();
        h11.h();
        h10.h();
        return !isEmpty;
    }

    public static final void b(Object obj, Object obj2, Function1 function1, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(1429097729);
        rVar.b0(592133115);
        boolean h10 = rVar.h(obj) | rVar.h(obj2);
        Object Q = rVar.Q();
        if (h10 || Q == m.f35080a) {
            Q = new m0(function1);
            rVar.k0(Q);
        }
        rVar.s(false);
        rVar.s(false);
    }

    public static final boolean b0(x1.t tVar, long j10) {
        long j11 = tVar.f39911c;
        float d10 = m1.c.d(j11);
        float e10 = m1.c.e(j11);
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (d10 >= s0.g.f34069a && d10 <= i10 && e10 >= s0.g.f34069a && e10 <= i11) {
            return false;
        }
        return true;
    }

    public static final void c(Object obj, Function1 function1, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-1371986847);
        rVar.b0(592131229);
        boolean h10 = rVar.h(obj);
        Object Q = rVar.Q();
        if (h10 || Q == m.f35080a) {
            Q = new m0(function1);
            rVar.k0(Q);
        }
        rVar.s(false);
        rVar.s(false);
    }

    public static final boolean c0(x1.t tVar, long j10, long j11) {
        if (!x1.r.b(tVar.f39917i, 1)) {
            return b0(tVar, j10);
        }
        long j12 = tVar.f39911c;
        float d10 = m1.c.d(j12);
        float e10 = m1.c.e(j12);
        float f10 = -m1.f.e(j11);
        float e11 = m1.f.e(j11) + ((int) (j10 >> 32));
        float f11 = -m1.f.c(j11);
        float c10 = m1.f.c(j11) + ((int) (j10 & 4294967295L));
        if (d10 < f10 || d10 > e11 || e10 < f11 || e10 > c10) {
            return true;
        }
        return false;
    }

    public static final void d(Object obj, Object obj2, Function2 function2, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(590241125);
        CoroutineContext h10 = rVar.f35167b.h();
        rVar.b0(1036443617);
        boolean h11 = rVar.h(obj) | rVar.h(obj2);
        Object Q = rVar.Q();
        if (h11 || Q == m.f35080a) {
            Q = new y0(h10, function2);
            rVar.k0(Q);
        }
        rVar.s(false);
        rVar.s(false);
    }

    public static final boolean d0(m1.e eVar) {
        float b10 = m1.a.b(eVar.f27247e);
        long j10 = eVar.f27247e;
        if (b10 == m1.a.c(j10)) {
            float b11 = m1.a.b(j10);
            long j11 = eVar.f27248f;
            if (b11 == m1.a.b(j11) && m1.a.b(j10) == m1.a.c(j11)) {
                float b12 = m1.a.b(j10);
                long j12 = eVar.f27249g;
                if (b12 == m1.a.b(j12) && m1.a.b(j10) == m1.a.c(j12)) {
                    float b13 = m1.a.b(j10);
                    long j13 = eVar.f27250h;
                    if (b13 == m1.a.b(j13) && m1.a.b(j10) == m1.a.c(j13)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void e(Object obj, Function2 function2, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(1179185413);
        CoroutineContext h10 = rVar.f35167b.h();
        rVar.b0(1036442609);
        boolean h11 = rVar.h(obj);
        Object Q = rVar.Q();
        if (h11 || Q == m.f35080a) {
            Q = new y0(h10, function2);
            rVar.k0(Q);
        }
        rVar.s(false);
        rVar.s(false);
    }

    public static final boolean e0(long j10) {
        return j10 != 9205357640488583168L;
    }

    public static final void f(Object[] objArr, Function2 function2, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-139560008);
        CoroutineContext h10 = rVar.f35167b.h();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        rVar.b0(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= rVar.h(obj);
        }
        Object Q = rVar.Q();
        if (z10 || Q == m.f35080a) {
            rVar.k0(new y0(h10, function2));
        }
        rVar.s(false);
        rVar.s(false);
    }

    public static final boolean f0(float f10, float f11, float f12, float f13, long j10) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float b10 = m1.a.b(j10);
        float c10 = m1.a.c(j10);
        if (((f15 * f15) / (c10 * c10)) + ((f14 * f14) / (b10 * b10)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final long g(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m1.c.f27236e;
        return floatToRawIntBits;
    }

    public static final d1.r g0(Function2 function2, Function1 function1) {
        d1.a aVar = new d1.a(function2);
        zq.f.z(1, function1);
        d1.r rVar = d1.s.f13291a;
        return new d1.r(aVar, function1);
    }

    public static final m1.d h(long j10, long j11) {
        return new m1.d(m1.c.d(j10), m1.c.e(j10), m1.f.e(j11) + m1.c.d(j10), m1.f.c(j11) + m1.c.e(j10));
    }

    public static final g1.o h0(n nVar, g1.o oVar) {
        if (oVar.c(g1.k.f16403a)) {
            return oVar;
        }
        r rVar = (r) nVar;
        rVar.b0(1219399079);
        g1.o oVar2 = (g1.o) oVar.b(g1.l.f16404b, new androidx.compose.foundation.layout.e(rVar, 7));
        rVar.s(false);
        return oVar2;
    }

    public static final void i(Function0 function0, n nVar) {
        u0.a aVar = ((r) nVar).L.f36606b;
        aVar.getClass();
        u0.a0 a0Var = u0.a0.f36604c;
        u0.l0 l0Var = aVar.f36603b;
        l0Var.h0(a0Var);
        x0(l0Var, 0, function0);
        int i10 = l0Var.f36648h;
        int i11 = a0Var.f36634a;
        int a02 = u0.l0.a0(l0Var, i11);
        int i12 = a0Var.f36635b;
        if (i10 == a02 && l0Var.f36649i == u0.l0.a0(l0Var, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & l0Var.f36648h) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a0Var.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & l0Var.f36649i) != 0) {
                if (i13 > 0) {
                    p10.append(", ");
                }
                p10.append(a0Var.c(i16));
                i15++;
            }
        }
        String sb4 = p10.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(a0Var);
        sb5.append(". Not all arguments were provided. Missing ");
        nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
        nn.d.x(sb5, i15, " object arguments (", sb4, ").");
        throw null;
    }

    public static final b2.j i0(Pair pair) {
        Object obj = pair.f23353a;
        b2.c cVar = (b2.c) obj;
        b2.j jVar = new b2.j(cVar);
        if (((b2.c) obj) == cVar) {
            jVar.f3097f.setValue(pair.f23354b);
            return jVar;
        }
        C0("Check failed.");
        throw null;
    }

    public static final long j(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = m1.f.f27253d;
        return floatToRawIntBits;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.i, b2.c] */
    public static final b2.i j0(Function0 function0) {
        return new b2.c(function0);
    }

    public static final void k(int i10, List list) {
        int size = list.size();
        if (i10 >= 0 && i10 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
    }

    public static final float[] k0(float[] fArr, float[] fArr2) {
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = f13 * f14;
        float f16 = fArr[1];
        float f17 = fArr2[0];
        float f18 = fArr[4];
        float f19 = f12 * f18;
        float f20 = fArr[7];
        float f21 = f20 * f14;
        float f22 = fArr[2] * f17;
        float f23 = fArr[5];
        float f24 = (fArr2[1] * f23) + f22;
        float f25 = fArr[8];
        float f26 = fArr[0];
        float f27 = fArr2[3] * f26;
        float f28 = fArr2[4];
        float f29 = (f11 * f28) + f27;
        float f30 = fArr2[5];
        float f31 = fArr[1];
        float f32 = fArr2[3];
        float f33 = f18 * f28;
        float f34 = fArr[2];
        float f35 = f23 * fArr2[4];
        float f36 = f26 * fArr2[6];
        float f37 = fArr[3];
        float f38 = fArr2[7];
        float f39 = (f37 * f38) + f36;
        float f40 = fArr2[8];
        float f41 = fArr2[6];
        return new float[]{f15 + (f11 * f12) + f10, f21 + f19 + (f16 * f17), (f14 * f25) + f24, (f13 * f30) + f29, (f20 * f30) + f33 + (f31 * f32), (f30 * f25) + f35 + (f32 * f34), (f13 * f40) + f39, (f20 * f40) + (fArr[4] * f38) + (f31 * f41), (f25 * f40) + (fArr[5] * fArr2[7]) + (f34 * f41)};
    }

    public static final void l(int i10, int i11, List list) {
        int size = list.size();
        if (i10 <= i11) {
            if (i10 >= 0) {
                if (i11 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException(jr.h.o("fromIndex (", i10, ") is less than 0."));
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }

    public static final float[] l0(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f10, fArr2[4] * f11, fArr2[5] * f12, f10 * fArr2[6], f11 * fArr2[7], f12 * fArr2[8]};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean m(j1.c cVar, long j10) {
        if (!((g1.n) cVar).f16405a.f16417m) {
            return false;
        }
        c2.x xVar = c2.g.y(cVar).f1422w.f7655b;
        if (!xVar.W0().f16417m) {
            return false;
        }
        long j11 = xVar.f31c;
        long m10 = androidx.compose.ui.layout.a.m(xVar);
        float d10 = m1.c.d(m10);
        float e10 = m1.c.e(m10);
        float f10 = ((int) (j11 >> 32)) + d10;
        float f11 = ((int) (j11 & 4294967295L)) + e10;
        float d11 = m1.c.d(j10);
        if (d10 > d11 || d11 > f10) {
            return false;
        }
        float e11 = m1.c.e(j10);
        if (e10 > e11 || e11 > f11) {
            return false;
        }
        return true;
    }

    public static final void m0(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
    }

    public static final void n(j1.c cVar, j1.a aVar) {
        j1.e eVar = (j1.e) cVar;
        eVar.T0(aVar);
        eVar.V0(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t0.y2, t0.n1] */
    public static final n1 n0(Object obj, z2 z2Var) {
        int i10 = c.f34957b;
        return new y2(obj, z2Var);
    }

    public static final boolean o(h2.o oVar) {
        h2.j h10 = oVar.h();
        return !h10.f17850a.containsKey(h2.r.f17890j);
    }

    public static final g1 o0(androidx.lifecycle.e0 e0Var, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-2027206144);
        Object value = e0Var.getValue();
        rVar.b0(411178300);
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) rVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        rVar.b0(-2027639108);
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        if (Q == eVar) {
            if (e0Var.isInitialized()) {
                value = e0Var.getValue();
            }
            Q = n0(value, o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        rVar.b0(-2027638891);
        boolean j10 = rVar.j(e0Var) | rVar.j(tVar);
        Object Q2 = rVar.Q();
        if (j10 || Q2 == eVar) {
            Q2 = new c.g(17, e0Var, tVar, g1Var);
            rVar.k0(Q2);
        }
        rVar.s(false);
        b(e0Var, tVar, (Function1) Q2, rVar);
        rVar.s(false);
        rVar.s(false);
        return g1Var;
    }

    public static final boolean p(h2.o oVar) {
        h2.u uVar = h2.i.f17832h;
        h2.j jVar = oVar.f17862d;
        if (jVar.f17850a.containsKey(uVar) && !Intrinsics.a(hl.f.m0(jVar, h2.r.f17892l), Boolean.TRUE)) {
            return true;
        }
        androidx.compose.ui.node.a R = R(oVar.f17861c, d2.s.f13609g);
        if (R != null) {
            h2.j n10 = R.n();
            if (n10 == null) {
                return true;
            }
            Object obj = n10.f17850a.get(h2.r.f17892l);
            if (obj == null) {
                obj = null;
            }
            if (!Intrinsics.a(obj, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static final long p0(x1.t tVar, boolean z10) {
        long g10 = m1.c.g(tVar.f39911c, tVar.f39915g);
        if (!z10 && tVar.b()) {
            int i10 = m1.c.f27236e;
            return m1.c.f27233b;
        }
        return g10;
    }

    public static final Object[] q(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        vt.t.h(objArr, objArr2, 0, i10, 6);
        vt.t.f(objArr, i10 + 2, objArr2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final void q0(q2 q2Var, f fVar, int i10) {
        while (true) {
            int i11 = q2Var.f35163u;
            if (i10 <= i11 || i10 >= q2Var.f35162t) {
                if (i11 == 0 && i10 == 0) {
                    return;
                }
                q2Var.F();
                if (dp.b.G0(q2Var.f35144b, q2Var.o(q2Var.f35163u))) {
                    fVar.e();
                }
                q2Var.i();
            } else {
                return;
            }
        }
    }

    public static final boolean r(h2.o oVar) {
        if (oVar.f17861c.f1418s == w2.k.f38800b) {
            return true;
        }
        return false;
    }

    public static final g1 r0(Object obj, n nVar) {
        r rVar = (r) nVar;
        Object g10 = v.e.g(rVar, -1058319986, -1519466170);
        if (g10 == m.f35080a) {
            g10 = n0(obj, o3.f35116a);
            rVar.k0(g10);
        }
        g1 g1Var = (g1) g10;
        rVar.s(false);
        g1Var.setValue(obj);
        rVar.s(false);
        return g1Var;
    }

    public static final Object[] s(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        vt.t.h(objArr, objArr2, 0, i10, 6);
        vt.t.f(objArr, i10, objArr2, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final r1.j0 s0(r1.f fVar, n nVar) {
        n1.m mVar;
        r rVar = (r) nVar;
        rVar.b0(1413834416);
        w2.b bVar = (w2.b) rVar.m(d2.s1.f13620e);
        float f10 = fVar.f32910j;
        float b10 = bVar.b();
        long floatToRawIntBits = Float.floatToRawIntBits(f10);
        rVar.b0(-1998936238);
        boolean g10 = rVar.g((Float.floatToRawIntBits(b10) & 4294967295L) | (floatToRawIntBits << 32));
        Object Q = rVar.Q();
        if (g10 || Q == m.f35080a) {
            r1.c cVar = new r1.c();
            K(cVar, fVar.f32906f);
            Unit unit = Unit.f23355a;
            long j10 = j(bVar.c0(fVar.f32902b), bVar.c0(fVar.f32903c));
            float f11 = fVar.f32904d;
            if (Float.isNaN(f11)) {
                f11 = m1.f.e(j10);
            }
            float f12 = fVar.f32905e;
            if (Float.isNaN(f12)) {
                f12 = m1.f.c(j10);
            }
            long j11 = j(f11, f12);
            r1.j0 j0Var = new r1.j0(cVar);
            long j12 = fVar.f32907g;
            if (j12 != 16) {
                mVar = kq.e.P(fVar.f32908h, j12);
            } else {
                mVar = null;
            }
            j0Var.f32954e.setValue(new m1.f(j10));
            j0Var.f32955f.setValue(Boolean.valueOf(fVar.f32909i));
            r1.e0 e0Var = j0Var.f32956g;
            e0Var.f32892g.setValue(mVar);
            e0Var.f32894i.setValue(new m1.f(j11));
            e0Var.f32888c = fVar.f32901a;
            rVar.k0(j0Var);
            Q = j0Var;
        }
        r1.j0 j0Var2 = (r1.j0) Q;
        rVar.s(false);
        rVar.s(false);
        return j0Var2;
    }

    public static final Object[] t(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        vt.t.h(objArr, objArr2, 0, i10, 6);
        vt.t.f(objArr, i10, objArr2, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final void t0(q2 q2Var, x xVar) {
        int i10;
        int i11;
        int[] iArr = q2Var.f35144b;
        int i12 = q2Var.f35161s;
        int f10 = q2Var.f(iArr, q2Var.o(q2Var.p(i12) + i12));
        for (int f11 = q2Var.f(q2Var.f35144b, q2Var.o(q2Var.f35161s)); f11 < f10; f11++) {
            Object obj = q2Var.f35145c[q2Var.g(f11)];
            if (obj instanceof l) {
                l lVar = (l) obj;
                t.d0 d0Var = xVar.f35234e;
                if (d0Var == null) {
                    int i13 = t.i0.f34869a;
                    d0Var = new t.d0();
                    xVar.f35234e = d0Var;
                }
                d0Var.f34863b[d0Var.f(lVar)] = lVar;
                xVar.f35232c.add(lVar);
            }
            if (obj instanceof i2) {
                i2 i2Var = (i2) obj;
                d dVar = i2Var.f35057b;
                if (dVar != null && dVar.a()) {
                    i10 = q2Var.c(dVar);
                    i11 = q2Var.H(i10);
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                xVar.d(i2Var.f35056a, f11, i10, i11);
            }
            if (obj instanceof x1) {
                ((x1) obj).c();
            }
        }
        q2Var.A();
    }

    public static final void u(int i10, int i11, ArrayList arrayList) {
        int S = S(i10, arrayList);
        if (S < 0) {
            S = -(S + 1);
        }
        while (S < arrayList.size() && ((u0) arrayList.get(S)).f35215b < i11) {
            arrayList.remove(S);
        }
    }

    public static final void u0(boolean z10) {
        if (z10) {
            return;
        }
        F("Check failed");
        throw null;
    }

    public static o1.d v(o1.d dVar) {
        o1.t tVar = o1.k.f29408b;
        o1.a aVar = o1.b.f29368b;
        if (o1.c.a(dVar.f29376b, o1.c.f29370a)) {
            o1.r rVar = (o1.r) dVar;
            o1.t tVar2 = rVar.f29425d;
            if (!E(tVar2, tVar)) {
                float[] a10 = tVar.a();
                return new o1.r(rVar.f29375a, rVar.f29429h, tVar, k0(B(aVar.f29369a, tVar2.a(), a10), rVar.f29430i), rVar.f29432k, rVar.f29435n, rVar.f29426e, rVar.f29427f, rVar.f29428g, -1);
            }
            return dVar;
        }
        return dVar;
    }

    public static final void v0(n nVar, Object obj, Function2 function2) {
        r rVar = (r) nVar;
        if (rVar.O || !Intrinsics.a(rVar.Q(), obj)) {
            rVar.k0(obj);
            rVar.c(obj, function2);
        }
    }

    public static final boolean w(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static final void w0(u0.l0 l0Var, int i10, int i11) {
        int i12 = 1 << i10;
        int i13 = l0Var.f36648h;
        if ((i13 & i12) == 0) {
            l0Var.f36648h = i12 | i13;
            l0Var.f36644d[(l0Var.f36645e - l0Var.f0().f36634a) + i10] = i11;
        } else {
            al.d.f1("Already pushed argument " + l0Var.f0().b(i10));
            throw null;
        }
    }

    public static final int x(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else if (i10 < i13) {
                length = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void x0(u0.l0 l0Var, int i10, Object obj) {
        int i11 = 1 << i10;
        int i12 = l0Var.f36649i;
        if ((i12 & i11) == 0) {
            l0Var.f36649i = i11 | i12;
            l0Var.f36646f[(l0Var.f36647g - l0Var.f0().f36635b) + i10] = obj;
        } else {
            al.d.f1("Already pushed argument " + l0Var.f0().c(i10));
            throw null;
        }
    }

    public static final boolean y(x1.t tVar) {
        if (!tVar.f39916h && tVar.f39912d) {
            return true;
        }
        return false;
    }

    public static final String y0(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(simpleName);
        sb2.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }

    public static final boolean z(x1.t tVar) {
        if (!tVar.b() && tVar.f39916h && !tVar.f39912d) {
            return true;
        }
        return false;
    }

    public static final tu.j z0(Function0 function0) {
        return new tu.j((Function2) new h3(function0, null));
    }
}
