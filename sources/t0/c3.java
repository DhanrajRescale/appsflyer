package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34965a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f34967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f34968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Function2 function2, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f34967c = function2;
        this.f34968d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c3 c3Var = new c3(this.f34967c, this.f34968d, aVar);
        c3Var.f34966b = obj;
        return c3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34965a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            t1 t1Var = new t1(this.f34968d, ((qu.f0) this.f34966b).H());
            this.f34965a = 1;
            if (this.f34967c.invoke(t1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
