package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40898a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f40900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu.o1 f40901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, qu.o1 o1Var, yt.a aVar) {
        super(2, aVar);
        this.f40900c = sVar;
        this.f40901d = o1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q qVar = new q(this.f40900c, this.f40901d, aVar);
        qVar.f40899b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40898a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            q1 q1Var = (q1) this.f40899b;
            s sVar = this.f40900c;
            sVar.f40933y.f40852e = s.Q0(sVar);
            c.g gVar = new c.g(3, sVar, q1Var, this.f40901d);
            x.a aVar2 = new x.a(sVar, 4);
            this.f40898a = 1;
            if (sVar.f40933y.a(gVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
