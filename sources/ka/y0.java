package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class y0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f23004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f23005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f23006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f23007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f23008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f23004b = g1Var;
        this.f23005c = g1Var2;
        this.f23006d = g1Var3;
        this.f23007e = g1Var4;
        this.f23008f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y0(this.f23004b, this.f23005c, this.f23006d, this.f23007e, this.f23008f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23003a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f23003a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f23004b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            g1 g1Var = this.f23005c;
            double doubleValue2 = doubleValue - ((Number) g1Var.getValue()).doubleValue();
            g1 g1Var2 = this.f23006d;
            if (doubleValue2 > 0.0d) {
                g1Var2.setValue(String.valueOf(kj.f.p((doubleValue / ((Number) g1Var.getValue()).doubleValue()) * 100)));
            }
            this.f23007e.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() + doubleValue)));
            g1Var2.setValue(String.valueOf(kj.f.p((doubleValue / ((Number) g1Var.getValue()).doubleValue()) * 100)));
            this.f23008f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) g1Var2.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
