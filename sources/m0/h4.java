package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h4 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f26239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f26240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(int i10, w4 w4Var, qu.f0 f0Var) {
        super(0);
        this.f26238a = i10;
        this.f26239b = w4Var;
        this.f26240c = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        qu.f0 f0Var = this.f26240c;
        int i10 = this.f26238a;
        w4 w4Var = this.f26239b;
        switch (i10) {
            case 1:
                if (((Boolean) w4Var.f27020b.f27117d.invoke(x4.f27081a)).booleanValue()) {
                    yk.g.H(f0Var, null, null, new j4(w4Var, null), 3);
                }
                return Boolean.TRUE;
            case 2:
                if (((Boolean) w4Var.f27020b.f27117d.invoke(x4.f27082b)).booleanValue()) {
                    yk.g.H(f0Var, null, null, new k4(w4Var, null), 3);
                }
                return Boolean.TRUE;
            default:
                if (((Boolean) w4Var.f27020b.f27117d.invoke(x4.f27083c)).booleanValue()) {
                    yk.g.H(f0Var, null, null, new l4(w4Var, null), 3);
                }
                return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f26238a) {
            case 0:
                w4 w4Var = this.f26239b;
                if (((Boolean) w4Var.f27020b.f27117d.invoke(x4.f27081a)).booleanValue()) {
                    yk.g.H(this.f26240c, null, null, new g4(w4Var, null), 3);
                }
                return Unit.f23355a;
            case 1:
                return mo2invoke();
            case 2:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }
}
