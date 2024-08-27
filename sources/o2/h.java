package o2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f29486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f29487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f29488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, q qVar, yt.a aVar) {
        super(2, aVar);
        this.f29487b = iVar;
        this.f29488c = qVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f29487b, this.f29488c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f29486a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            g0 g0Var = this.f29487b.f29493e;
            this.f29486a = 1;
            obj = ((b) g0Var).a(this.f29488c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
