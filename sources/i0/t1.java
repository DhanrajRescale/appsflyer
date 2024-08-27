package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(x1.z zVar, a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f19204b = zVar;
        this.f19205c = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t1(this.f19204b, this.f19205c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f19203a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f19203a = 1;
            a2 a2Var = this.f19205c;
            v1 v1Var = new v1(a2Var, 0);
            w1 w1Var = new w1(a2Var, 0);
            w1 w1Var2 = new w1(a2Var, 1);
            androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(a2Var, 2);
            y.d0 d0Var = y.m0.f40854a;
            Object h10 = qu.i0.h(this.f19204b, new y.k0(v1Var, eVar, w1Var2, w1Var, null), this);
            if (h10 != obj2) {
                h10 = Unit.f23355a;
            }
            if (h10 != obj2) {
                h10 = Unit.f23355a;
            }
            if (h10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
