package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f22804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g1 g1Var, g1 g1Var2, g1 g1Var3, l3 l3Var, g1 g1Var4, yt.a aVar) {
        super(2, aVar);
        this.f22801b = g1Var;
        this.f22802c = g1Var2;
        this.f22803d = g1Var3;
        this.f22804e = l3Var;
        this.f22805f = g1Var4;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f22801b, this.f22802c, this.f22803d, this.f22804e, this.f22805f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22800a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f22800a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        Double e10 = kotlin.text.q.e((String) this.f22801b.getValue());
        if (e10 != null) {
            double doubleValue = e10.doubleValue() / 100;
            l3 l3Var = this.f22804e;
            this.f22802c.setValue(String.valueOf(kj.f.p(yk.j.z0(l3Var) * doubleValue)));
            this.f22803d.setValue(String.valueOf(kj.f.p((((Number) l3Var.getValue()).doubleValue() * doubleValue) + ((Number) l3Var.getValue()).doubleValue())));
            this.f22805f.setValue(Boolean.valueOf(!kotlin.ranges.d.i(new nu.b(), Float.parseFloat((String) r9.getValue()))));
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
