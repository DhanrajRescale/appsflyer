package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f19243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(a2 a2Var, int i10) {
        super(0);
        this.f19242a = i10;
        this.f19243b = a2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        a2 a2Var = this.f19243b;
        int i10 = this.f19242a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        a2Var.onStop();
                        break;
                    default:
                        a2Var.a();
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        a2Var.onStop();
                        break;
                    default:
                        a2Var.a();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
