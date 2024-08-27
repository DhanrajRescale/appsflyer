package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class w0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f22980b = g1Var;
        this.f22981c = g1Var2;
        this.f22982d = g1Var3;
        this.f22983e = g1Var4;
        this.f22984f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w0(this.f22980b, this.f22981c, this.f22982d, this.f22983e, this.f22984f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22979a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22979a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22980b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue() / 100;
            g1 g1Var = this.f22982d;
            this.f22981c.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() * doubleValue)));
            this.f22983e.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() - (((Number) g1Var.getValue()).doubleValue() * doubleValue))));
            this.f22984f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r9.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
