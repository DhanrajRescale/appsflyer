package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x1.z zVar, a2 a2Var, l0.v0 v0Var, yt.a aVar) {
        super(2, aVar);
        this.f19220b = zVar;
        this.f19221c = a2Var;
        this.f19222d = v0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u0 u0Var = new u0(this.f19220b, this.f19221c, this.f19222d, aVar);
        u0Var.f19219a = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        qu.f0 f0Var = (qu.f0) this.f19219a;
        qu.g0 g0Var = qu.g0.f32208d;
        x1.z zVar = this.f19220b;
        yk.g.H(f0Var, null, g0Var, new s0(zVar, this.f19221c, null), 1);
        yk.g.H(f0Var, null, g0Var, new t0(zVar, this.f19222d, null), 1);
        return Unit.f23355a;
    }
}
