package e0;

import kotlin.jvm.functions.Function0;
import y.g1;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f14759a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final z f14760b = new z(vt.i0.f38321a, 0, 0, 0, g1.f40724b, 0, 0, 0, z.m.f41889a, new c0.n0(1));

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f14761c = new Object();

    public static final e a(Function0 function0, t0.n nVar, int i10) {
        d1.r rVar;
        boolean z10;
        boolean z11;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1210768637);
        Object[] objArr = new Object[0];
        switch (e.F.f41804a) {
            case 8:
                rVar = e.G;
                break;
            default:
                rVar = d1.k.f13275e;
                break;
        }
        rVar2.b0(-2077657836);
        boolean z12 = true;
        if ((((i10 & 14) ^ 6) > 4 && rVar2.f(0)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && rVar2.e(s0.g.f34069a)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z10 | z11;
        if ((((i10 & 896) ^ 384) <= 256 || !rVar2.j(function0)) && (i10 & 384) != 256) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object Q = rVar2.Q();
        if (z14 || Q == t0.m.f35080a) {
            Q = new l0(0, s0.g.f34069a, function0);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        e eVar = (e) el.l.y0(objArr, rVar, (Function0) Q, rVar2, 0, 4);
        eVar.E.setValue(function0);
        rVar2.s(false);
        return eVar;
    }
}
