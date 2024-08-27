package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32496a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f32498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f32499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, yt.a aVar, hu.c cVar) {
        super(2, aVar);
        this.f32498c = cVar;
        this.f32499d = tVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        k kVar = new k(this.f32499d, aVar, this.f32498c);
        kVar.f32497b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32496a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            f1 f1Var = (f1) this.f32497b;
            p pVar = this.f32499d.f32728m;
            this.f32496a = 1;
            if (this.f32498c.b(pVar, f1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
