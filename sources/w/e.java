package w;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final p f38462a = new p(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final q f38463b = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final r f38464c = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final s f38465d = new s(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final p f38466e = new p(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final q f38467f = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final r f38468g = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final s f38469h = new s(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Object A(Function1 function1, au.c cVar) {
        k.d(cVar.getContext().g(d2.b2.f13368a));
        return dp.b.q1(cVar.getContext()).U(function1, cVar);
    }

    public static d a(float f10) {
        return new d(Float.valueOf(f10), z1.f38739a, Float.valueOf(0.01f), 8);
    }

    public static o b(float f10, float f11) {
        return new o(z1.f38739a, Float.valueOf(f10), new p(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f10, float f11, float f12, n nVar, Function2 function2, yt.a aVar) {
        y1 y1Var = z1.f38739a;
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        i1 i1Var = i1.f38529g;
        t tVar = (t) i1Var.invoke(f15);
        if (tVar == null) {
            tVar = ((t) i1Var.invoke(f13)).c();
            Intrinsics.d(tVar, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        t tVar2 = tVar;
        Object d10 = d(new o(y1Var, f13, tVar2, 56), new m1(nVar, y1Var, f13, f14, tVar2), Long.MIN_VALUE, new g1(0, function2, y1Var), aVar);
        zt.a aVar2 = zt.a.f42823a;
        if (d10 != aVar2) {
            d10 = Unit.f23355a;
        }
        if (d10 == aVar2) {
            return d10;
        }
        return Unit.f23355a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108 A[Catch: CancellationException -> 0x003f, TryCatch #0 {CancellationException -> 0x003f, blocks: (B:13:0x0037, B:16:0x00f3, B:18:0x0108, B:20:0x012f, B:27:0x0134, B:36:0x0053), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Type inference failed for: r10v0, types: [au.c, w.h1, yt.a] */
    /* JADX WARN: Type inference failed for: r1v32, types: [t0.a1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [iu.z] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9, types: [t0.a1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [w.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(w.o r25, w.j r26, long r27, kotlin.jvm.functions.Function1 r29, yt.a r30) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.d(w.o, w.j, long, kotlin.jvm.functions.Function1, yt.a):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f10, float f11, n nVar, Function2 function2, yt.a aVar, int i10) {
        if ((i10 & 8) != 0) {
            nVar = v(s0.g.f34069a, null, 7);
        }
        return c(f10, f11, s0.g.f34069a, nVar, function2, aVar);
    }

    public static final Object f(o oVar, b0 b0Var, boolean z10, Function1 function1, yt.a aVar) {
        long j10;
        a0 a0Var = new a0(b0Var, oVar.f38621a, oVar.f38622b.getValue(), oVar.f38623c);
        if (z10) {
            j10 = oVar.f38624d;
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object d10 = d(oVar, a0Var, j10, function1, aVar);
        if (d10 == zt.a.f42823a) {
            return d10;
        }
        return Unit.f23355a;
    }

    public static final l0 g(q0 q0Var, float f10, k0 k0Var, String str, t0.n nVar, int i10, int i11) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-644770905);
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        int i12 = i10 << 3;
        l0 j10 = j(q0Var, Float.valueOf(s0.g.f34069a), Float.valueOf(f10), z1.f38739a, k0Var, str, rVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (57344 & i12) | (i12 & 458752), 0);
        rVar.s(false);
        return j10;
    }

    public static final Object h(o oVar, Float f10, n nVar, boolean z10, Function1 function1, yt.a aVar) {
        long j10;
        m1 m1Var = new m1(nVar, oVar.f38621a, oVar.f38622b.getValue(), f10, oVar.f38623c);
        if (z10) {
            j10 = oVar.f38624d;
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object d10 = d(oVar, m1Var, j10, function1, aVar);
        if (d10 == zt.a.f42823a) {
            return d10;
        }
        return Unit.f23355a;
    }

    public static final l0 j(q0 q0Var, Number number, Number number2, y1 y1Var, k0 k0Var, String str, t0.n nVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        t0.r rVar = (t0.r) nVar;
        Object g10 = v.e.g(rVar, -1062847727, 1847702851);
        to.e eVar = t0.m.f35080a;
        if (g10 == eVar) {
            g10 = new l0(q0Var, number, number2, y1Var, k0Var);
            rVar.k0(g10);
        }
        l0 l0Var = (l0) g10;
        rVar.s(false);
        rVar.b0(1847703019);
        int i12 = 1;
        if ((((i10 & 112) ^ 48) > 32 && rVar.j(number)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 896) ^ 384) > 256 && rVar.j(number2)) || (i10 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z10 | z11;
        if ((((57344 & i10) ^ 24576) > 16384 && rVar.j(k0Var)) || (i10 & 24576) == 16384) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z14 = z12 | z13;
        Object Q = rVar.Q();
        if (z14 || Q == eVar) {
            Q = new r0(number, l0Var, number2, k0Var);
            rVar.k0(Q);
        }
        rVar.s(false);
        t0.t.i((Function0) Q, rVar);
        rVar.b0(1847703409);
        boolean j10 = rVar.j(q0Var);
        Object Q2 = rVar.Q();
        if (j10 || Q2 == eVar) {
            Q2 = new g1(i12, q0Var, l0Var);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.c(l0Var, (Function1) Q2, rVar);
        rVar.s(false);
        return l0Var;
    }

    public static final float k(b0 b0Var, float f10) {
        y1 y1Var = z1.f38739a;
        return ((p) new f2(b0Var.f38436a).a(new p(s0.g.f34069a), new p(f10))).f38635a;
    }

    public static final t l(t tVar) {
        t c10 = tVar.c();
        Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        int b10 = c10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            c10.e(i10, tVar.a(i10));
        }
        return c10;
    }

    public static o m(o oVar, float f10, float f11, int i10) {
        float f12;
        float f13;
        long j10;
        boolean z10;
        if ((i10 & 1) != 0) {
            f12 = ((Number) oVar.f38622b.getValue()).floatValue();
        } else {
            f12 = f10;
        }
        if ((i10 & 2) != 0) {
            f13 = ((p) oVar.f38623c).f38635a;
        } else {
            f13 = f11;
        }
        long j11 = 0;
        if ((i10 & 4) != 0) {
            j10 = oVar.f38624d;
        } else {
            j10 = 0;
        }
        if ((i10 & 8) != 0) {
            j11 = oVar.f38625e;
        }
        long j12 = j11;
        if ((i10 & 16) != 0) {
            z10 = oVar.f38626f;
        } else {
            z10 = false;
        }
        return new o(oVar.f38621a, Float.valueOf(f12), new p(f13), j10, j12, z10);
    }

    public static final o1 n(u1 u1Var, y1 y1Var, String str, t0.n nVar, int i10) {
        boolean z10;
        n1 n1Var;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1714122528);
        rVar.b0(-44481272);
        int i11 = (i10 & 14) ^ 6;
        boolean z11 = true;
        if ((i11 > 4 && rVar.h(u1Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (z10 || Q == eVar) {
            Q = new o1(u1Var, y1Var, str);
            rVar.k0(Q);
        }
        o1 o1Var = (o1) Q;
        rVar.s(false);
        rVar.b0(-44481182);
        if ((i11 <= 4 || !rVar.h(u1Var)) && (i10 & 6) != 4) {
            z11 = false;
        }
        boolean j10 = rVar.j(o1Var) | z11;
        Object Q2 = rVar.Q();
        if (j10 || Q2 == eVar) {
            Q2 = new g1(3, u1Var, o1Var);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.c(o1Var, (Function1) Q2, rVar);
        if (u1Var.f() && (n1Var = (n1) o1Var.f38633b.getValue()) != null) {
            Function1 function1 = n1Var.f38619c;
            u1 u1Var2 = o1Var.f38634c;
            n1Var.f38617a.g(function1.invoke(u1Var2.e().f38639a), n1Var.f38619c.invoke(u1Var2.e().f38640b), (f0) n1Var.f38618b.invoke(u1Var2.e()));
        }
        rVar.s(false);
        return o1Var;
    }

    public static final q1 o(u1 u1Var, Object obj, Object obj2, f0 f0Var, y1 y1Var, t0.n nVar, int i10) {
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-304821198);
        rVar.b0(460706473);
        int i11 = (i10 & 14) ^ 6;
        boolean z11 = true;
        int i12 = 4;
        if ((i11 > 4 && rVar.h(u1Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (z10 || Q == eVar) {
            t tVar = (t) y1Var.f38734a.invoke(obj2);
            tVar.d();
            Q = new q1(u1Var, obj, tVar, y1Var);
            rVar.k0(Q);
        }
        q1 q1Var = (q1) Q;
        rVar.s(false);
        if (u1Var.f()) {
            q1Var.g(obj, obj2, f0Var);
        } else {
            q1Var.h(obj2, f0Var);
        }
        rVar.b0(460707356);
        if ((i11 <= 4 || !rVar.h(u1Var)) && (i10 & 6) != 4) {
            z11 = false;
        }
        boolean h10 = rVar.h(q1Var) | z11;
        Object Q2 = rVar.Q();
        if (h10 || Q2 == eVar) {
            Q2 = new g1(i12, u1Var, q1Var);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.c(q1Var, (Function1) Q2, rVar);
        rVar.s(false);
        return q1Var;
    }

    public static final void p(m mVar, long j10, float f10, j jVar, o oVar, Function1 function1) {
        long j11;
        if (f10 == s0.g.f34069a) {
            j11 = jVar.b();
        } else {
            j11 = ((float) (j10 - mVar.f38598c)) / f10;
        }
        mVar.f38602g = j10;
        mVar.f38600e.setValue(jVar.f(j11));
        mVar.f38601f = jVar.d(j11);
        if (jVar.e(j11)) {
            mVar.f38603h = mVar.f38602g;
            mVar.f38604i.setValue(Boolean.FALSE);
        }
        y(mVar, oVar);
        function1.invoke(mVar);
    }

    public static final float q(CoroutineContext coroutineContext) {
        float f10;
        g1.q qVar = (g1.q) coroutineContext.g(g1.a.f16394p);
        if (qVar != null) {
            f10 = qVar.x();
        } else {
            f10 = 1.0f;
        }
        if (f10 >= s0.g.f34069a) {
            return f10;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static k0 r(c0 c0Var, int i10, int i11) {
        long j10;
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if ((i11 & 4) != 0) {
            j10 = 0;
        } else {
            j10 = 0;
        }
        return new k0(c0Var, i10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [w.v0, w.x0, java.lang.Object] */
    public static final w0 s(Function1 function1) {
        ?? x0Var = new x0();
        function1.invoke(x0Var);
        return new w0(x0Var);
    }

    public static final q0 t(String str, t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        Object g10 = v.e.g(rVar, 1013651573, 353816035);
        if (g10 == t0.m.f35080a) {
            g10 = new q0();
            rVar.k0(g10);
        }
        q0 q0Var = (q0) g10;
        rVar.s(false);
        q0Var.a(rVar, 0);
        rVar.s(false);
        return q0Var;
    }

    public static final u1 u(w1 w1Var, String str, t0.n nVar, int i10) {
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1643203617);
        rVar.b0(573122745);
        int i11 = 1;
        if ((((i10 & 14) ^ 6) > 4 && rVar.h(w1Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        Object obj = t0.m.f35080a;
        if (z10 || Q == obj) {
            Q = new u1(w1Var, str);
            rVar.k0(Q);
        }
        u1 u1Var = (u1) Q;
        rVar.s(false);
        u1Var.a(((y0) w1Var).f38733c.getValue(), rVar, 0);
        rVar.b0(573122990);
        boolean h10 = rVar.h(u1Var);
        Object Q2 = rVar.Q();
        if (h10 || Q2 == obj) {
            Q2 = new v.w(u1Var, i11);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.c(u1Var, (Function1) Q2, rVar);
        rVar.s(false);
        return u1Var;
    }

    public static f1 v(float f10, Object obj, int i10) {
        float f11;
        if ((i10 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = s0.g.f34069a;
        }
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new f1(f11, f10, obj);
    }

    public static final void w(String str) {
        throw new IllegalArgumentException(str);
    }

    public static x1 x(int i10, int i11, d0 d0Var, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            d0Var = e0.f38470a;
        }
        return new x1(i10, i11, d0Var);
    }

    public static final void y(m mVar, o oVar) {
        oVar.f38622b.setValue(mVar.f38600e.getValue());
        t tVar = oVar.f38623c;
        t tVar2 = mVar.f38601f;
        int b10 = tVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            tVar.e(i10, tVar2.a(i10));
        }
        oVar.f38625e = mVar.f38603h;
        oVar.f38624d = mVar.f38602g;
        oVar.f38626f = ((Boolean) mVar.f38604i.getValue()).booleanValue();
    }

    public static final u1 z(Object obj, String str, t0.n nVar, int i10, int i11) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(2029166765);
        int i12 = 2;
        if ((i11 & 2) != 0) {
            str = null;
        }
        rVar.b0(1641300136);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = new u1(new y0(obj), str);
            rVar.k0(Q);
        }
        u1 u1Var = (u1) Q;
        rVar.s(false);
        u1Var.a(obj, rVar, (i10 & 14) | (i10 & 8) | 48);
        rVar.b0(1641300259);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = new v.w(u1Var, i12);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.c(u1Var, (Function1) Q2, rVar);
        rVar.s(false);
        return u1Var;
    }
}
