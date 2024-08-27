package i0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m2 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f19058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(q2 q2Var, int i10) {
        super(0);
        this.f19057a = i10;
        this.f19058b = q2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f19057a) {
            case 0:
                return mo2invoke();
            default:
                return mo2invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Boolean mo2invoke() {
        int i10 = this.f19057a;
        q2 q2Var = this.f19058b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(q2Var.f19157a.i() > s0.g.f34069a);
            default:
                return Boolean.valueOf(q2Var.f19157a.i() < q2Var.f19158b.i());
        }
    }
}
