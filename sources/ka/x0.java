package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class x0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f22992b = g1Var;
        this.f22993c = g1Var2;
        this.f22994d = g1Var3;
        this.f22995e = g1Var4;
        this.f22996f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x0(this.f22992b, this.f22993c, this.f22994d, this.f22995e, this.f22996f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22991a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22991a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22992b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            g1 g1Var = this.f22994d;
            this.f22993c.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() - doubleValue)));
            String valueOf = String.valueOf(kj.f.p(((((Number) g1Var.getValue()).doubleValue() - doubleValue) / ((Number) g1Var.getValue()).doubleValue()) * 100));
            this.f22995e.setValue(valueOf);
            this.f22996f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r0.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
