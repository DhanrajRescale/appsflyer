package vh;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f38071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f38074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th.b f38075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g1 g1Var, g1 g1Var2, g1 g1Var3, Function1 function1, th.b bVar, yt.a aVar) {
        super(2, aVar);
        this.f38071a = g1Var;
        this.f38072b = g1Var2;
        this.f38073c = g1Var3;
        this.f38074d = function1;
        this.f38075e = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f38071a, this.f38072b, this.f38073c, this.f38074d, this.f38075e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        if (((Number) this.f38071a.getValue()).floatValue() / ((Number) this.f38072b.getValue()).floatValue() > 0.4d) {
            g1 g1Var = this.f38073c;
            if (!((Boolean) g1Var.getValue()).booleanValue()) {
                this.f38074d.invoke(this.f38075e.f36080a);
                g1Var.setValue(Boolean.TRUE);
            }
        }
        return Unit.f23355a;
    }
}
