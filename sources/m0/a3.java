package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a3 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.e1 f25867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(t0.e1 e1Var, int i10) {
        super(1);
        this.f25866a = i10;
        this.f25867b = e1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t0.e1 e1Var = this.f25867b;
        int i10 = this.f25866a;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        ((t0.u2) e1Var).j(intValue);
                        break;
                    default:
                        ((t0.u2) e1Var).j(intValue);
                        break;
                }
                return Unit.f23355a;
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        ((t0.u2) e1Var).j(intValue2);
                        break;
                    default:
                        ((t0.u2) e1Var).j(intValue2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
