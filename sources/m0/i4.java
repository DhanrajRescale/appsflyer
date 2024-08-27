package m0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i4 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f26285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(w4 w4Var, int i10) {
        super(1);
        this.f26284a = i10;
        this.f26285b = w4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f26284a;
        w4 w4Var = this.f26285b;
        switch (i10) {
            case 0:
                return new w2.h(hl.f.j(0, ku.c.b(w4Var.f27020b.g())));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(w4.a(w4Var).c0(v4.f26945a));
        }
    }
}
