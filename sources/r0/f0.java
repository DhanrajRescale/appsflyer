package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.k f32394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.s f32395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a0.k kVar, e1.s sVar, yt.a aVar) {
        super(2, aVar);
        this.f32394b = kVar;
        this.f32395c = sVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f0(this.f32394b, this.f32395c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32393a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.w0 w0Var = ((a0.l) this.f32394b).f16a;
            m0.g1 g1Var = new m0.g1(this.f32395c, 3);
            this.f32393a = 1;
            w0Var.getClass();
            if (tu.w0.n(w0Var, g1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
