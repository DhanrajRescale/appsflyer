package i0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n2 implements y.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y.d2 f19076a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.j0 f19077b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.j0 f19078c;

    public n2(y.d2 d2Var, q2 q2Var) {
        this.f19076a = d2Var;
        this.f19077b = t0.t.N(new m2(q2Var, 1));
        this.f19078c = t0.t.N(new m2(q2Var, 0));
    }

    @Override // y.d2
    public final boolean a() {
        return this.f19076a.a();
    }

    @Override // y.d2
    public final Object b(x.s1 s1Var, Function2 function2, yt.a aVar) {
        return this.f19076a.b(s1Var, function2, aVar);
    }

    @Override // y.d2
    public final boolean c() {
        return ((Boolean) this.f19078c.getValue()).booleanValue();
    }

    @Override // y.d2
    public final boolean d() {
        return ((Boolean) this.f19077b.getValue()).booleanValue();
    }

    @Override // y.d2
    public final float e(float f10) {
        return this.f19076a.e(f10);
    }
}
