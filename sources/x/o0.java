package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f39649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, yt.a aVar) {
        super(2, aVar);
        this.f39649b = p0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o0(this.f39649b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39648a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            iu.x xVar = new iu.x();
            iu.x xVar2 = new iu.x();
            iu.x xVar3 = new iu.x();
            p0 p0Var = this.f39649b;
            tu.w0 w0Var = ((a0.l) p0Var.f39670n).f16a;
            n0 n0Var = new n0(xVar, xVar2, xVar3, p0Var);
            this.f39648a = 1;
            w0Var.getClass();
            if (tu.w0.n(w0Var, n0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
