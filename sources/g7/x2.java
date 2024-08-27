package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f17125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, yt.a aVar) {
        super(2, aVar);
        this.f17125a = y2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x2(this.f17125a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x2) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        y2 y2Var = this.f17125a;
        y2Var.f17144i.o(new Integer(y2Var.f17142g));
        return Unit.f23355a;
    }
}
