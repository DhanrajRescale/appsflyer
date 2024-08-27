package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class y extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f23000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f23001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f23002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g1 g1Var, g1 g1Var2, g1 g1Var3, l3 l3Var, g1 g1Var4, yt.a aVar) {
        super(2, aVar);
        this.f22998b = g1Var;
        this.f22999c = g1Var2;
        this.f23000d = g1Var3;
        this.f23001e = l3Var;
        this.f23002f = g1Var4;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y(this.f22998b, this.f22999c, this.f23000d, this.f23001e, this.f23002f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22997a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22997a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22998b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            l3 l3Var = this.f23001e;
            double z02 = doubleValue - yk.j.z0(l3Var);
            g1 g1Var = this.f22999c;
            if (z02 > 0.0d) {
                g1Var.setValue(String.valueOf(kj.f.p((doubleValue / ((Number) l3Var.getValue()).doubleValue()) * 100)));
            }
            this.f23000d.setValue(String.valueOf(kj.f.p(((Number) l3Var.getValue()).doubleValue() + doubleValue)));
            g1Var.setValue(String.valueOf(kj.f.p((doubleValue / ((Number) l3Var.getValue()).doubleValue()) * 100)));
            this.f23002f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) g1Var.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
