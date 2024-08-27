package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x1.z zVar, a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f19224b = zVar;
        this.f19225c = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u1 u1Var = new u1(this.f19224b, this.f19225c, aVar);
        u1Var.f19223a = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        qu.f0 f0Var = (qu.f0) this.f19223a;
        qu.g0 g0Var = qu.g0.f32208d;
        x1.z zVar = this.f19224b;
        a2 a2Var = this.f19225c;
        yk.g.H(f0Var, null, g0Var, new s1(zVar, a2Var, null), 1);
        return yk.g.H(f0Var, null, g0Var, new t1(zVar, a2Var, null), 1);
    }
}
