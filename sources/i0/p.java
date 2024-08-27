package i0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t0.g1 g1Var, int i10) {
        super(0);
        this.f19096a = i10;
        this.f19097b = g1Var;
    }

    public final void a() {
        int i10 = this.f19096a;
        t0.g1 g1Var = this.f19097b;
        switch (i10) {
            case 3:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                return;
            case 4:
                g1Var.setValue(Boolean.FALSE);
                return;
            case 5:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                return;
            case 6:
                g1Var.setValue(null);
                return;
            case 7:
                g1Var.setValue(Boolean.TRUE);
                return;
            case 8:
                g1Var.setValue(Boolean.FALSE);
                return;
            case 9:
                g1Var.setValue(Boolean.FALSE);
                return;
            case 10:
                g1Var.setValue(Boolean.TRUE);
                return;
            case 11:
                g1Var.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            case 12:
                g1Var.setValue(Boolean.TRUE);
                return;
            case 13:
                g1Var.setValue(Boolean.TRUE);
                return;
            case 14:
                g1Var.setValue(Boolean.FALSE);
                return;
            case 15:
                g1Var.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            case 16:
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var.setValue(Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                return;
            case 18:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                return;
            case 19:
                g1Var.setValue(Boolean.FALSE);
                return;
            default:
                g1Var.setValue(Boolean.TRUE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        t0.g1 g1Var = this.f19097b;
        int i10 = this.f19096a;
        switch (i10) {
            case 0:
                if (g1Var != null) {
                    return (List) g1Var.getValue();
                }
                return null;
            case 1:
                switch (i10) {
                    case 1:
                        return (Integer) g1Var.getValue();
                    default:
                        return (Integer) g1Var.getValue();
                }
            case 2:
                switch (i10) {
                    case 1:
                        return (Integer) g1Var.getValue();
                    default:
                        return (Integer) g1Var.getValue();
                }
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            case 8:
                a();
                return Unit.f23355a;
            case 9:
                a();
                return Unit.f23355a;
            case 10:
                a();
                return Unit.f23355a;
            case 11:
                a();
                return Unit.f23355a;
            case 12:
                a();
                return Unit.f23355a;
            case 13:
                a();
                return Unit.f23355a;
            case 14:
                a();
                return Unit.f23355a;
            case 15:
                a();
                return Unit.f23355a;
            case 16:
                a();
                return Unit.f23355a;
            case 17:
                a();
                return Unit.f23355a;
            case 18:
                a();
                return Unit.f23355a;
            case 19:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
