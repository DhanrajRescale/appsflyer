package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f26404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f26404b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k4(this.f26404b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Object obj2 = zt.a.f42823a;
        int i10 = this.f26403a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f26403a = 1;
            w4 w4Var = this.f26404b;
            y3 d10 = w4Var.f27020b.d();
            x4 x4Var = x4.f27082b;
            if (!d10.f27137a.containsKey(x4Var)) {
                b10 = Unit.f23355a;
            } else {
                b10 = w4.b(w4Var, x4Var, this);
                if (b10 != obj2) {
                    b10 = Unit.f23355a;
                }
            }
            if (b10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
