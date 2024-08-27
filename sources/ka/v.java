package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22963c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f22965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g1 g1Var, g1 g1Var2, g1 g1Var3, l3 l3Var, g1 g1Var4, yt.a aVar) {
        super(2, aVar);
        this.f22962b = g1Var;
        this.f22963c = g1Var2;
        this.f22964d = g1Var3;
        this.f22965e = l3Var;
        this.f22966f = g1Var4;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f22962b, this.f22963c, this.f22964d, this.f22965e, this.f22966f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22961a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22961a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22962b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            l3 l3Var = this.f22965e;
            String valueOf = String.valueOf(kj.f.p((doubleValue / yk.j.z0(l3Var)) * 100));
            this.f22963c.setValue(valueOf);
            this.f22964d.setValue(String.valueOf(kj.f.p(((Number) l3Var.getValue()).doubleValue() - doubleValue)));
            this.f22966f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r4.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
