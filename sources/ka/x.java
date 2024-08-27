package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f22989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g1 g1Var, g1 g1Var2, g1 g1Var3, l3 l3Var, g1 g1Var4, yt.a aVar) {
        super(2, aVar);
        this.f22986b = g1Var;
        this.f22987c = g1Var2;
        this.f22988d = g1Var3;
        this.f22989e = l3Var;
        this.f22990f = g1Var4;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f22986b, this.f22987c, this.f22988d, this.f22989e, this.f22990f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22985a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22985a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22986b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            l3 l3Var = this.f22989e;
            this.f22987c.setValue(String.valueOf(kj.f.p(yk.j.z0(l3Var) - doubleValue)));
            String valueOf = String.valueOf(kj.f.p(((((Number) l3Var.getValue()).doubleValue() - doubleValue) / ((Number) l3Var.getValue()).doubleValue()) * 100));
            this.f22988d.setValue(valueOf);
            this.f22990f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r0.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
