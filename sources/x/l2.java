package x;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l2 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f39629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(o2 o2Var, int i10) {
        super(0);
        this.f39628a = i10;
        this.f39629b = o2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f39628a;
        o2 o2Var = this.f39629b;
        switch (i10) {
            case 2:
                return Boolean.valueOf(o2Var.f39653a.i() > 0);
            default:
                return Boolean.valueOf(o2Var.f39653a.i() < o2Var.f39656d.i());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        o2 o2Var = this.f39629b;
        int i10 = this.f39628a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Float.valueOf(o2Var.f39653a.i());
                    default:
                        return Float.valueOf(o2Var.f39656d.i());
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Float.valueOf(o2Var.f39653a.i());
                    default:
                        return Float.valueOf(o2Var.f39656d.i());
                }
            case 2:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }
}
