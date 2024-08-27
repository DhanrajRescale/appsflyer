package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class v0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f22968b = g1Var;
        this.f22969c = g1Var2;
        this.f22970d = g1Var3;
        this.f22971e = g1Var4;
        this.f22972f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v0(this.f22968b, this.f22969c, this.f22970d, this.f22971e, this.f22972f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22967a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22967a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22968b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            g1 g1Var = this.f22970d;
            String valueOf = String.valueOf(kj.f.p((doubleValue / ((Number) g1Var.getValue()).doubleValue()) * 100));
            this.f22969c.setValue(valueOf);
            this.f22971e.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() - doubleValue)));
            this.f22972f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r4.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
