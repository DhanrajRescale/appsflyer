package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y6 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f27150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f27151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f27152c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f27153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(t0.l3 l3Var, t0.l3 l3Var2, t0.g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f27151b = l3Var;
        this.f27152c = l3Var2;
        this.f27153d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        y6 y6Var = new y6(this.f27151b, this.f27152c, this.f27153d, aVar);
        y6Var.f27150a = ((Boolean) obj).booleanValue();
        return y6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        boolean z10 = this.f27150a;
        float f10 = f7.f26170a;
        if (((Boolean) this.f27151b.getValue()).booleanValue() != z10) {
            Function1 function1 = (Function1) this.f27152c.getValue();
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z10));
            }
            this.f27153d.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
        }
        return Unit.f23355a;
    }
}
