package m0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26658a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.d f26660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f26661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hu.d dVar, y yVar, yt.a aVar) {
        super(2, aVar);
        this.f26660c = dVar;
        this.f26661d = yVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q qVar = new q(this.f26660c, this.f26661d, aVar);
        qVar.f26659b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Pair) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26658a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Pair pair = (Pair) this.f26659b;
            y3 y3Var = (y3) pair.f23353a;
            s sVar = this.f26661d.f27127n;
            this.f26658a = 1;
            if (this.f26660c.g(sVar, y3Var, pair.f23354b, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
