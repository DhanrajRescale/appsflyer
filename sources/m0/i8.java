package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i8 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f26295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f26296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(float f10, s1 s1Var, boolean z10, Function2 function2) {
        super(3);
        this.f26295a = f10;
        this.f26296b = s1Var;
        this.f26297c = z10;
        this.f26298d = function2;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j10;
        int i10;
        g1.o oVar = (g1.o) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((t0.r) nVar).h(oVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 19) == 18) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.o a10 = androidx.compose.ui.draw.a.a(oVar, this.f26295a);
        Function2 function2 = this.f26298d;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(a10);
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
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
            s1 s1Var = this.f26296b;
            s1Var.getClass();
            rVar2.b0(264799724);
            if (this.f26297c) {
                j10 = s1Var.f26776t;
            } else {
                j10 = s1Var.f26777u;
            }
            t0.g1 r02 = t0.t.r0(new n1.t(j10), rVar2);
            rVar2.s(false);
            m8.b(((n1.t) r02.getValue()).f28179a, ((c9) rVar2.m(d9.f26076b)).f26016g, null, function2, rVar2, 0, 4);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
