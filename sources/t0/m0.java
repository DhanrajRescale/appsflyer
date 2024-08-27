package t0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f35082a;

    /* renamed from: b, reason: collision with root package name */
    public n0 f35083b;

    public m0(Function1 function1) {
        this.f35082a = function1;
    }

    @Override // t0.h2
    public final void a() {
    }

    @Override // t0.h2
    public final void b() {
        n0 n0Var = this.f35083b;
        if (n0Var != null) {
            n0Var.a();
        }
        this.f35083b = null;
    }

    @Override // t0.h2
    public final void d() {
        this.f35083b = (n0) this.f35082a.invoke(t.f35207g);
    }
}
