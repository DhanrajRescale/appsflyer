package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.g1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f41451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g1 g1Var) {
        super(1);
        this.f41451a = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f41451a.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.f23355a;
    }
}
