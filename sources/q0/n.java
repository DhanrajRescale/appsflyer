package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, yt.a aVar) {
        super(2, aVar);
        this.f31519b = qVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n nVar = new n(this.f31519b, aVar);
        nVar.f31518a = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        qu.f0 f0Var = (qu.f0) this.f31518a;
        q qVar = this.f31519b;
        yk.g.H(f0Var, null, null, new k(qVar, null), 3);
        yk.g.H(f0Var, null, null, new l(qVar, null), 3);
        return yk.g.H(f0Var, null, null, new m(qVar, null), 3);
    }
}
