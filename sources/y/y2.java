package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f41004a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(k1 k1Var, yt.a aVar) {
        super(2, aVar);
        this.f41004a = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y2(this.f41004a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        k1 k1Var = this.f41004a;
        k1Var.f40819b = true;
        k1Var.f40821d.a(null);
        return Unit.f23355a;
    }
}
