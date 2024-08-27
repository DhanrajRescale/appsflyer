package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22755a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i10, g1 g1Var) {
        super(0);
        this.f22756b = i10;
        this.f22757c = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f22756b;
        g1 g1Var = this.f22757c;
        int i11 = this.f22755a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        g1Var.setValue(Integer.valueOf(i10));
                        break;
                    default:
                        g1Var.setValue(Integer.valueOf(i10));
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i11) {
                    case 0:
                        g1Var.setValue(Integer.valueOf(i10));
                        break;
                    default:
                        g1Var.setValue(Integer.valueOf(i10));
                        break;
                }
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g1 g1Var, int i10) {
        super(0);
        this.f22757c = g1Var;
        this.f22756b = i10;
    }
}
