package m0;

import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w6 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27031a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f27032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f27033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f27035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.d0 f27036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.l f27037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f27038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f27039i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f27040j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f27041k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(g1.o oVar, n1.x0 x0Var, long j10, float f10, x.d0 d0Var, float f11, a0.l lVar, boolean z10, Function0 function0, Function2 function2) {
        super(2);
        this.f27032b = oVar;
        this.f27033c = x0Var;
        this.f27034d = j10;
        this.f27035e = f10;
        this.f27036f = d0Var;
        this.f27040j = f11;
        this.f27037g = lVar;
        this.f27038h = z10;
        this.f27039i = function0;
        this.f27041k = function2;
    }

    public final void a(t0.n nVar, int i10) {
        g1.g gVar = g1.a.f16379a;
        float f10 = this.f27035e;
        long j10 = this.f27034d;
        int i11 = this.f27031a;
        Function2 function2 = this.f27041k;
        g1.o oVar = this.f27032b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.m3 m3Var = u3.f26877a;
                t0.r rVar2 = (t0.r) nVar;
                g1.o j11 = androidx.compose.foundation.a.j(pp.b.o(oVar.g(MinimumInteractiveModifier.f1342b), this.f27033c, pp.b.p(j10, (t2) rVar2.m(u2.f26875a), f10, rVar2), this.f27036f, this.f27040j), this.f27037g, n5.c(false, s0.g.f34069a, 0L, rVar2, 0, 7), this.f27038h, null, this.f27039i, 24);
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(gVar, true, rVar2, 48);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j12 = androidx.compose.ui.layout.a.j(j11);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, c10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    v.e.w(rVar2, j12, rVar2, 0, 2058660585);
                    function2.invoke(rVar2, 0);
                    rVar2.s(false);
                    rVar2.s(true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.m3 m3Var2 = r0.b1.f32335a;
                t0.r rVar4 = (t0.r) nVar;
                g1.o j13 = androidx.compose.foundation.a.j(r0.c3.c(oVar.g(androidx.compose.material3.MinimumInteractiveModifier.f1343b), this.f27033c, r0.c3.d(j10, f10, nVar), this.f27036f, ((w2.b) rVar4.m(d2.s1.f13620e)).c0(this.f27040j)), this.f27037g, q0.x.a(false, s0.g.f34069a, 0L, rVar4, 0, 7), this.f27038h, null, this.f27039i, 24);
                rVar4.b0(733328855);
                b0.v c11 = b0.s.c(gVar, true, rVar4, 48);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                t0.r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j14 = androidx.compose.ui.layout.a.j(j13);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, c11, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar2);
                    }
                    v.e.w(rVar4, j14, rVar4, 0, 2058660585);
                    function2.invoke(rVar4, 0);
                    rVar4.s(false);
                    rVar4.s(true);
                    rVar4.s(false);
                    rVar4.s(false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27031a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(g1.o oVar, n1.x0 x0Var, long j10, float f10, x.d0 d0Var, a0.l lVar, boolean z10, Function0 function0, float f11, b1.c cVar) {
        super(2);
        this.f27032b = oVar;
        this.f27033c = x0Var;
        this.f27034d = j10;
        this.f27035e = f10;
        this.f27036f = d0Var;
        this.f27037g = lVar;
        this.f27038h = z10;
        this.f27039i = function0;
        this.f27040j = f11;
        this.f27041k = cVar;
    }
}
