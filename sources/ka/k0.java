package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f22818b = g1Var;
        this.f22819c = g1Var2;
        this.f22820d = g1Var3;
        this.f22821e = g1Var4;
        this.f22822f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k0(this.f22818b, this.f22819c, this.f22820d, this.f22821e, this.f22822f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22817a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22817a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22818b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue();
            g1 g1Var = this.f22820d;
            this.f22819c.setValue(String.valueOf(kj.f.p(doubleValue - ((Number) g1Var.getValue()).doubleValue())));
            String valueOf = String.valueOf(kj.f.p(((doubleValue - ((Number) g1Var.getValue()).doubleValue()) / ((Number) g1Var.getValue()).doubleValue()) * 100));
            this.f22821e.setValue(valueOf);
            this.f22822f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r0.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
