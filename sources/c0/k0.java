package c0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w.f1;
import w.i1;

/* loaded from: classes.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f7517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, yt.a aVar) {
        super(2, aVar);
        this.f7517b = m0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k0(this.f7517b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object h10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f7516a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w.o oVar = this.f7517b.f7550u;
            Float f10 = new Float(s0.g.f34069a);
            f1 v10 = w.e.v(400.0f, new Float(0.5f), 1);
            this.f7516a = 1;
            h10 = w.e.h(oVar, f10, v10, true, i1.f38524b, this);
            if (h10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
