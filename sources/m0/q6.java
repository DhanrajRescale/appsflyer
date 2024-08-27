package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q6 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(Object obj, int i10) {
        super(3);
        this.f26682a = i10;
        this.f26683b = obj;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f26682a;
        Object obj4 = this.f26683b;
        switch (i10) {
            case 0:
                t0.n nVar = (t0.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                b9.b((String) obj4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 0, 0, 131070);
                return Unit.f23355a;
            default:
                ((Number) obj3).intValue();
                t0.r rVar2 = (t0.r) ((t0.n) obj2);
                rVar2.b0(-398757863);
                n7 n7Var = (n7) obj4;
                float f10 = n7Var.f26547b;
                w.z zVar = w.e0.f38470a;
                t0.l3 a10 = w.i.a(f10, w.e.x(250, 0, zVar, 2), rVar2, 0);
                t0.l3 a11 = w.i.a(n7Var.f26546a, w.e.x(250, 0, zVar, 2), rVar2, 0);
                g1.o u10 = androidx.compose.foundation.layout.d.u(androidx.compose.foundation.layout.d.e((g1.o) obj, 1.0f), g1.a.f16385g, 2);
                rVar2.b0(321937115);
                boolean h10 = rVar2.h(a11);
                Object Q = rVar2.Q();
                if (h10 || Q == t0.m.f35080a) {
                    Q = new d7(a11, 1);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                g1.o q10 = androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.p(u10, (Function1) Q), ((w2.e) a10.getValue()).f38783a);
                rVar2.s(false);
                return q10;
        }
    }
}
