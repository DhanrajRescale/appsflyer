package tc;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function1 {
    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new i(1, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        return Unit.f23355a;
    }
}
