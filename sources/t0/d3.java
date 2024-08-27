package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34980a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f34982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f34983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Function2 function2, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f34982c = function2;
        this.f34983d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d3 d3Var = new d3(this.f34982c, this.f34983d, aVar);
        d3Var.f34981b = obj;
        return d3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34980a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            t1 t1Var = new t1(this.f34983d, ((qu.f0) this.f34981b).H());
            this.f34980a = 1;
            if (this.f34982c.invoke(t1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
