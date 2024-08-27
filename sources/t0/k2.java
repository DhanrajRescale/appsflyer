package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f35075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f35075b = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k2(this.f35075b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35074a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f35074a = 1;
            if (kp.j.K(16L, this) == aVar) {
                return aVar;
            }
        }
        return this.f35075b.invoke(new Long(System.nanoTime()));
    }
}
