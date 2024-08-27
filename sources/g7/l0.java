package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16881a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.f f16883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f16884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(tu.f fVar, hu.c cVar, yt.a aVar) {
        super(2, aVar);
        this.f16883c = fVar;
        this.f16884d = cVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l0 l0Var = new l0(this.f16883c, this.f16884d, aVar);
        l0Var.f16882b = obj;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16881a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.g gVar = (tu.g) this.f16882b;
            iu.z zVar = new iu.z();
            zVar.f20560a = r0.f17029a;
            k0 k0Var = new k0(zVar, this.f16884d, gVar);
            this.f16881a = 1;
            if (this.f16883c.c(k0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
