package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class z0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f23015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f23016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f23017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f23018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f23019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, yt.a aVar) {
        super(2, aVar);
        this.f23015b = g1Var;
        this.f23016c = g1Var2;
        this.f23017d = g1Var3;
        this.f23018e = g1Var4;
        this.f23019f = g1Var5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z0(this.f23015b, this.f23016c, this.f23017d, this.f23018e, this.f23019f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23014a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f23014a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f23015b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue() / 100;
            g1 g1Var = this.f23017d;
            this.f23016c.setValue(String.valueOf(kj.f.p(((Number) g1Var.getValue()).doubleValue() * doubleValue)));
            this.f23018e.setValue(String.valueOf(kj.f.p((((Number) g1Var.getValue()).doubleValue() * doubleValue) + ((Number) g1Var.getValue()).doubleValue())));
            this.f23019f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r9.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
