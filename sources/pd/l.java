package pd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f30929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3.n f30930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g1 g1Var, b3.n nVar, int i10) {
        super(0);
        this.f30928a = i10;
        this.f30929b = g1Var;
        this.f30930c = nVar;
    }

    public final void a() {
        int i10 = this.f30928a;
        b3.n nVar = this.f30930c;
        g1 g1Var = this.f30929b;
        switch (i10) {
            case 0:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                nVar.f3137d = true;
                return;
            case 1:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                nVar.f3137d = true;
                return;
            default:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                nVar.f3137d = true;
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f30928a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
