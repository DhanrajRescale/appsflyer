package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.f f35020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f35021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(tu.f fVar, t1 t1Var, yt.a aVar) {
        super(2, aVar);
        this.f35020b = fVar;
        this.f35021c = t1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f3(this.f35020b, this.f35021c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35019a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            e3 e3Var = new e3(this.f35021c, 1);
            this.f35019a = 1;
            if (this.f35020b.c(e3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
