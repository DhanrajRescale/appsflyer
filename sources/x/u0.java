package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.l f39728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.j f39729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a0.l lVar, a0.j jVar, yt.a aVar) {
        super(2, aVar);
        this.f39728b = lVar;
        this.f39729c = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u0(this.f39728b, this.f39729c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39727a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f39727a = 1;
            if (this.f39728b.a(this.f39729c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
