package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.s f30883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Function1 function1, e1.s sVar, int i10) {
        super(2);
        this.f30881a = i10;
        this.f30882b = function1;
        this.f30883c = sVar;
    }

    public final void a(t0.n nVar, int i10) {
        to.e eVar = t0.m.f35080a;
        int i11 = this.f30881a;
        e1.s sVar = this.f30883c;
        Function1 function1 = this.f30882b;
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
                rVar2.b0(-1904159843);
                boolean h10 = rVar2.h(function1);
                Object Q = rVar2.Q();
                if (h10 || Q == eVar) {
                    Q = new f(function1, sVar, 0);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                kp.j.g(false, (Function0) Q, rVar2, 0, 1);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-68320060);
                boolean h11 = rVar4.h(function1);
                Object Q2 = rVar4.Q();
                if (h11 || Q2 == eVar) {
                    Q2 = new f(function1, sVar, 1);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                kp.j.g(true, (Function0) Q2, rVar4, 6, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30881a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
