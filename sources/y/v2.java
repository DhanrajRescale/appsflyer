package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f40978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f40979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1.t f40980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(hu.c cVar, k1 k1Var, x1.t tVar, yt.a aVar) {
        super(2, aVar);
        this.f40978b = cVar;
        this.f40979c = k1Var;
        this.f40980d = tVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v2(this.f40978b, this.f40979c, this.f40980d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40977a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m1.c cVar = new m1.c(this.f40980d.f39911c);
            this.f40977a = 1;
            if (this.f40978b.b(this.f40979c, cVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
