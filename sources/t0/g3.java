package t0;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35025a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f35026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f35027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu.f f35028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(CoroutineContext coroutineContext, tu.f fVar, yt.a aVar) {
        super(2, aVar);
        this.f35027c = coroutineContext;
        this.f35028d = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g3 g3Var = new g3(this.f35027c, this.f35028d, aVar);
        g3Var.f35026b = obj;
        return g3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((t1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35025a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            t1 t1Var = (t1) this.f35026b;
            kotlin.coroutines.k kVar = kotlin.coroutines.k.f23369a;
            CoroutineContext coroutineContext = this.f35027c;
            boolean a10 = Intrinsics.a(coroutineContext, kVar);
            tu.f fVar = this.f35028d;
            if (a10) {
                e3 e3Var = new e3(t1Var, 0);
                this.f35025a = 1;
                if (fVar.c(e3Var, this) == aVar) {
                    return aVar;
                }
            } else {
                f3 f3Var = new f3(fVar, t1Var, null);
                this.f35025a = 2;
                if (yk.g.e0(coroutineContext, f3Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
