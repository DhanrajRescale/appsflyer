package o8;

import g7.a2;
import g7.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f29806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f29807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, yt.a aVar) {
        super(2, aVar);
        this.f29807b = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f29807b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f29806a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            n nVar = this.f29807b;
            tu.j z02 = t0.t.z0(new androidx.activity.c(nVar, 1));
            j jVar = new j(nVar, null);
            int i12 = tu.a0.f36404a;
            uu.n nVar2 = new uu.n(new a2(i11, jVar, null), z02, kotlin.coroutines.k.f23369a, -2, su.a.f34776a);
            q1 q1Var = new q1(nVar, i11);
            this.f29806a = 1;
            if (nVar2.c(q1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
