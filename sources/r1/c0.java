package r1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f32863a;

    public abstract void a(p1.h hVar);

    public Function1 b() {
        return this.f32863a;
    }

    public final void c() {
        Function1 b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(t.g0 g0Var) {
        this.f32863a = g0Var;
    }
}
