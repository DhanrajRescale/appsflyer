package i0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f19080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w2 w2Var, int i10) {
        super(0);
        this.f19079a = i10;
        this.f19080b = w2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        j2.d0 d0Var;
        int i10 = 2;
        int i11 = this.f19079a;
        w2 w2Var = this.f19080b;
        switch (i11) {
            case 0:
                return Boolean.valueOf(w2Var != null ? ((Boolean) new o(w2Var, i10).mo2invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(w2Var != null ? ((Boolean) new o(w2Var, i10).mo2invoke()).booleanValue() : false);
            default:
                j2.e eVar = w2Var.f19244a;
                j2.e0 e0Var = (j2.e0) w2Var.f19245b.getValue();
                return Boolean.valueOf(Intrinsics.a(eVar, (e0Var == null || (d0Var = e0Var.f20703a) == null) ? null : d0Var.f20689a));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f19079a) {
            case 0:
                return mo2invoke();
            case 1:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }
}
