package l0;

import b0.l1;
import b0.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f23712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f23713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, boolean z10, g1.o oVar, n nVar) {
        super(2);
        this.f23710a = j10;
        this.f23711b = z10;
        this.f23712c = oVar;
        this.f23713d = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0.d dVar;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        long j10 = this.f23710a;
        to.e eVar = t0.m.f35080a;
        g1.o oVar = this.f23712c;
        n nVar2 = this.f23713d;
        boolean z10 = this.f23711b;
        if (j10 != 9205357640488583168L) {
            t0.r rVar2 = (t0.r) nVar;
            rVar2.b0(-215396356);
            if (z10) {
                dVar = b0.e.f2851b;
            } else {
                dVar = b0.e.f2850a;
            }
            g1.o l10 = androidx.compose.foundation.layout.d.l(oVar, w2.g.b(j10), w2.g.a(j10));
            rVar2.b0(693286680);
            l1 a10 = o1.a(dVar, g1.a.f16388j, rVar2, 0);
            rVar2.b0(-1323940314);
            int i10 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(l10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                    nn.d.s(i10, rVar2, i10, iVar);
                }
                nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                g1.l lVar = g1.l.f16404b;
                rVar2.b0(-985380218);
                boolean j12 = rVar2.j(nVar2);
                Object Q = rVar2.Q();
                if (j12 || Q == eVar) {
                    Q = new a(nVar2, 0);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                dp.b.d0(lVar, (Function0) Q, z10, rVar2, 6);
                v.e.y(rVar2, false, true, false, false);
                rVar2.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        } else {
            t0.r rVar3 = (t0.r) nVar;
            rVar3.b0(-215395469);
            rVar3.b0(-215395346);
            boolean j13 = rVar3.j(nVar2);
            Object Q2 = rVar3.Q();
            if (j13 || Q2 == eVar) {
                Q2 = new a(nVar2, 1);
                rVar3.k0(Q2);
            }
            rVar3.s(false);
            dp.b.d0(oVar, (Function0) Q2, z10, rVar3, 0);
            rVar3.s(false);
        }
        return Unit.f23355a;
    }
}
