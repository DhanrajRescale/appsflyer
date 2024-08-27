package ta;

import ba.dk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, yt.a aVar) {
        super(2, aVar);
        this.f35646b = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f35646b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35645a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f35645a = 1;
            if (kp.j.K(200L, this) == aVar) {
                return aVar;
            }
        }
        h hVar = this.f35646b;
        if (((dk) hVar.q()).f4501y.f2444c) {
            ((dk) hVar.q()).f4501y.setRefreshing(false);
        }
        return Unit.f23355a;
    }
}
