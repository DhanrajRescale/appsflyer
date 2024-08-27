package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f26908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f26911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(float f10, Function2 function2, Function2 function22, hu.c cVar, int i10) {
        super(2);
        this.f26908a = f10;
        this.f26909b = function2;
        this.f26910c = function22;
        this.f26911d = cVar;
        this.f26912e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        x.o2 o10 = androidx.compose.foundation.a.o(nVar);
        t0.r rVar2 = (t0.r) nVar;
        Object g10 = v.e.g(rVar2, 773894976, -723523240);
        Object obj3 = t0.m.f35080a;
        if (g10 == obj3) {
            g10 = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar2), rVar2);
        }
        rVar2.s(false);
        qu.f0 f0Var = ((t0.d0) g10).f34970a;
        rVar2.s(false);
        rVar2.b0(1483971703);
        boolean h10 = rVar2.h(o10) | rVar2.h(f0Var);
        Object Q = rVar2.Q();
        if (h10 || Q == obj3) {
            Q = new d6(o10, f0Var);
            rVar2.k0(Q);
        }
        Object obj4 = (d6) Q;
        rVar2.s(false);
        g1.o c10 = androidx.compose.ui.draw.a.c(h2.l.a(androidx.compose.foundation.a.n(androidx.compose.foundation.layout.d.u(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), g1.a.f16382d, 2), o10), false, g0.a.f16375a));
        rVar2.b0(1483972139);
        boolean e10 = rVar2.e(this.f26908a) | rVar2.j(this.f26909b) | rVar2.j(this.f26910c) | rVar2.j(this.f26911d) | rVar2.j(obj4) | rVar2.f(this.f26912e);
        float f10 = this.f26908a;
        Function2 function2 = this.f26909b;
        Function2 function22 = this.f26910c;
        int i10 = this.f26912e;
        hu.c cVar = this.f26911d;
        Object Q2 = rVar2.Q();
        if (e10 || Q2 == obj3) {
            Q2 = new t7(f10, function2, function22, obj4, i10, cVar, 0);
            rVar2.k0(Q2);
        }
        rVar2.s(false);
        a2.g1.b(c10, (Function2) Q2, rVar2, 0, 0);
        return Unit.f23355a;
    }
}
