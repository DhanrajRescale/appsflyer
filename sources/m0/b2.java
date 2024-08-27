package m0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class b2 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f25920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f25921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(float f10, p2 p2Var) {
        super(0);
        this.f25920a = f10;
        this.f25921b = p2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        float g10 = this.f25921b.f26627a.g();
        float f10 = m2.f26475a;
        float f11 = this.f25920a;
        float f12 = s0.g.f34069a;
        float f13 = (g10 - f11) / (s0.g.f34069a - f11);
        if (f13 >= s0.g.f34069a) {
            f12 = f13;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        return Float.valueOf(f12);
    }
}
