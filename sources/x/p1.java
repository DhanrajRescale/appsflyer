package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f39675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, yt.a aVar) {
        super(2, aVar);
        this.f39675b = q1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p1(this.f39675b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39674a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y yVar = y.f39779d;
            this.f39674a = 1;
            if (dp.b.q1(getContext()).U(new v.c0(10, yVar), this) == aVar) {
                return aVar;
            }
        }
        b2 b2Var = this.f39675b.f39696z;
        if (b2Var != null) {
            ((d2) b2Var).d();
        }
        return Unit.f23355a;
    }
}
