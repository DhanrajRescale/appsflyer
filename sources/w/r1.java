package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f38668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f38669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(u1 u1Var, float f10) {
        super(1);
        this.f38668a = u1Var;
        this.f38669b = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        u1 u1Var = this.f38668a;
        if (!u1Var.f()) {
            u1Var.g(longValue, this.f38669b);
        }
        return Unit.f23355a;
    }
}
