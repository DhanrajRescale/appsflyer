package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c7 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.k f26004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.s f26005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(a0.k kVar, e1.s sVar, yt.a aVar) {
        super(2, aVar);
        this.f26004b = kVar;
        this.f26005c = sVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c7(this.f26004b, this.f26005c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c7) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26003a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.w0 w0Var = ((a0.l) this.f26004b).f16a;
            g1 g1Var = new g1(this.f26005c, 1);
            this.f26003a = 1;
            w0Var.getClass();
            if (tu.w0.n(w0Var, g1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
