package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40967a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f40969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f40970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Function2 function2, v0 v0Var, yt.a aVar) {
        super(2, aVar);
        this.f40969c = function2;
        this.f40970d = v0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u0 u0Var = new u0(this.f40969c, this.f40970d, aVar);
        u0Var.f40968b = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((n0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40967a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x.z zVar = new x.z(4, (n0) this.f40968b, this.f40970d);
            this.f40967a = 1;
            if (this.f40969c.invoke(zVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
