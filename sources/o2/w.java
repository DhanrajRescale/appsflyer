package o2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f29537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f29538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i iVar, yt.a aVar) {
        super(2, aVar);
        this.f29538b = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f29538b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f29537a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f29537a = 1;
            if (this.f29538b.b(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
