package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u6 extends au.i implements Function2 {
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new au.i(2, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u6) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        return Unit.f23355a;
    }
}
