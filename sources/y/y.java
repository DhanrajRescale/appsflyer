package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.o3;

/* loaded from: classes.dex */
public final class y implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f40992a;

    /* renamed from: b, reason: collision with root package name */
    public final x f40993b = new x(this);

    /* renamed from: c, reason: collision with root package name */
    public final x.w1 f40994c = new x.w1();

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f40995d = t0.t.n0(Boolean.FALSE, o3.f35116a);

    public y(Function1 function1) {
        this.f40992a = function1;
    }

    @Override // y.d2
    public final boolean a() {
        return ((Boolean) this.f40995d.getValue()).booleanValue();
    }

    @Override // y.d2
    public final Object b(x.s1 s1Var, Function2 function2, yt.a aVar) {
        Object P = hl.f.P(new w(this, s1Var, function2, null), aVar);
        if (P == zt.a.f42823a) {
            return P;
        }
        return Unit.f23355a;
    }

    @Override // y.d2
    public final float e(float f10) {
        return ((Number) this.f40992a.invoke(Float.valueOf(f10))).floatValue();
    }
}
