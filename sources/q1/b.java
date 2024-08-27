package q1;

import kotlin.jvm.internal.Intrinsics;
import n1.f;
import n1.u;
import p1.h;
import s0.g;
import w2.k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public f f31570a;

    /* renamed from: b, reason: collision with root package name */
    public u f31571b;

    /* renamed from: c, reason: collision with root package name */
    public float f31572c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public k f31573d = k.f38799a;

    public abstract void c(float f10);

    public abstract void e(u uVar);

    public void f(k kVar) {
    }

    public final void g(h hVar, long j10, float f10, u uVar) {
        if (this.f31572c != f10) {
            c(f10);
            this.f31572c = f10;
        }
        if (!Intrinsics.a(this.f31571b, uVar)) {
            e(uVar);
            this.f31571b = uVar;
        }
        k layoutDirection = hVar.getLayoutDirection();
        if (this.f31573d != layoutDirection) {
            f(layoutDirection);
            this.f31573d = layoutDirection;
        }
        float e10 = m1.f.e(hVar.d()) - m1.f.e(j10);
        float c10 = m1.f.c(hVar.d()) - m1.f.c(j10);
        hVar.f0().f30498a.a(g.f34069a, g.f34069a, e10, c10);
        if (f10 > g.f34069a && m1.f.e(j10) > g.f34069a && m1.f.c(j10) > g.f34069a) {
            i(hVar);
        }
        hVar.f0().f30498a.a(-0.0f, -0.0f, -e10, -c10);
    }

    public abstract long h();

    public abstract void i(h hVar);
}
