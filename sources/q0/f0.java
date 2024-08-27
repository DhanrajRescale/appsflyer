package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f31485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.n f31486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, w.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f31485b = g0Var;
        this.f31486c = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f0(this.f31485b, this.f31486c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31484a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w.d dVar = (w.d) this.f31485b.f31493c;
            Float f10 = new Float(s0.g.f34069a);
            this.f31484a = 1;
            if (w.d.c(dVar, f10, this.f31486c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
