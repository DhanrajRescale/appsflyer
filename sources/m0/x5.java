package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x5 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y4 f27085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f27086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f27091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu.c f27092h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f27093i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f27094j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hu.c f27095k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b6 f27096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(y4 y4Var, b0.x1 x1Var, long j10, long j11, boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, hu.c cVar2, b6 b6Var) {
        super(3);
        this.f27085a = y4Var;
        this.f27086b = x1Var;
        this.f27087c = j10;
        this.f27088d = j11;
        this.f27089e = z10;
        this.f27090f = i10;
        this.f27091g = function2;
        this.f27092h = cVar;
        this.f27093i = function22;
        this.f27094j = function23;
        this.f27095k = cVar2;
        this.f27096l = b6Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        g1.o oVar = (g1.o) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        int i11 = 2;
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
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(1257871267);
        y4 y4Var = this.f27085a;
        boolean h10 = rVar2.h(y4Var);
        b0.x1 x1Var = this.f27086b;
        boolean h11 = h10 | rVar2.h(x1Var);
        Object Q = rVar2.Q();
        if (h11 || Q == t0.m.f35080a) {
            Q = new m4(1, y4Var, x1Var);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        b2.i iVar = b0.a2.f2821a;
        pp.b.j(t0.t.H(oVar, d2.s.f13613k, new v.g((Function1) Q, i11)), null, this.f27087c, this.f27088d, null, s0.g.f34069a, b1.d.b(rVar2, 1772955108, new w5(this.f27089e, this.f27090f, this.f27091g, this.f27092h, this.f27093i, this.f27085a, this.f27094j, this.f27095k, this.f27096l)), rVar2, 1572864, 50);
        return Unit.f23355a;
    }
}
