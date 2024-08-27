package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        super(1);
        this.f32828a = i10;
        this.f32829b = obj;
        this.f32830c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f32828a;
        Object obj2 = this.f32830c;
        Object obj3 = this.f32829b;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) obj3;
                j1Var.f32478m.addView(j1Var, j1Var.f32479n);
                j1Var.h((w2.k) obj2);
                return new c.c(j1Var, 8);
            default:
                ((e2) obj3).f32385a.setValue(new b0.f0((b0.x1) obj2, (b0.x1) obj));
                return Unit.f23355a;
        }
    }
}
