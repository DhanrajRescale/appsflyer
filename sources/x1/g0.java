package x1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public c0 f39853a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c0 c0Var = this.f39853a;
        if (c0Var != null) {
            c0Var.f39834d = booleanValue;
        }
        return Unit.f23355a;
    }
}
