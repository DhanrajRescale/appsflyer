package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26366a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Function0 function0, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f26368c = function0;
        this.f26369d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        k kVar = new k(this.f26368c, this.f26369d, aVar);
        kVar.f26367b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26366a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f26367b;
            iu.z zVar = new iu.z();
            tu.j z02 = t0.t.z0(this.f26368c);
            j jVar = new j(zVar, f0Var, this.f26369d);
            this.f26366a = 1;
            if (z02.c(jVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
