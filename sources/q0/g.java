package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tu.w0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31487a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.k f31489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f31490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a0.k kVar, w wVar, yt.a aVar) {
        super(2, aVar);
        this.f31489c = kVar;
        this.f31490d = wVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g gVar = new g(this.f31489c, this.f31490d, aVar);
        gVar.f31488b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31487a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f31488b;
            w0 w0Var = ((a0.l) this.f31489c).f16a;
            a0.f fVar = new a0.f(2, this.f31490d, f0Var);
            this.f31487a = 1;
            w0Var.getClass();
            if (w0.n(w0Var, fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
