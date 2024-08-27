package pg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f31038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f31039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, g1 g1Var, l3 l3Var) {
        super(2);
        this.f31037a = i10;
        this.f31038b = l3Var;
        this.f31039c = g1Var;
    }

    public final void a(t0.n nVar, int i10) {
        to.e eVar = t0.m.f35080a;
        int i11 = this.f31037a;
        l3 l3Var = this.f31038b;
        g1 g1Var = this.f31039c;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(1074679104);
                Object Q = rVar2.Q();
                if (Q == eVar) {
                    Q = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 21, rVar2);
                }
                Function1 function1 = (Function1) Q;
                rVar2.s(false);
                rVar2.b0(1074688895);
                boolean h10 = rVar2.h(l3Var);
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == eVar) {
                    Q2 = new h(0, g1Var, l3Var);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                y2.m.b(function1, null, (Function1) Q2, rVar2, 6, 2);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1.o e10 = androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(1074758408);
                Object Q3 = rVar4.Q();
                if (Q3 == eVar) {
                    Q3 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 23, rVar4);
                }
                Function1 function12 = (Function1) Q3;
                rVar4.s(false);
                rVar4.b0(1074768003);
                boolean h11 = rVar4.h(l3Var);
                Object Q4 = rVar4.Q();
                if (h11 || Q4 == eVar) {
                    Q4 = new h(1, g1Var, l3Var);
                    rVar4.k0(Q4);
                }
                rVar4.s(false);
                y2.m.b(function12, e10, (Function1) Q4, rVar4, 54, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f31037a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
