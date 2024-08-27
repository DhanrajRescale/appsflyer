package o2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f29478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f29479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f29480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, q qVar, yt.a aVar) {
        super(1, aVar);
        this.f29479b = iVar;
        this.f29480c = qVar;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new f(this.f29479b, this.f29480c, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f29478a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f29478a = 1;
            obj = this.f29479b.d(this.f29480c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
