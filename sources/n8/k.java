package n8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f28379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.j f28380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, y8.j jVar, yt.a aVar) {
        super(2, aVar);
        this.f28379b = oVar;
        this.f28380c = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f28379b, this.f28380c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28378a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f28378a = 1;
            obj = o.a(this.f28379b, this.f28380c, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
