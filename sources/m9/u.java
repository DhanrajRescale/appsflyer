package m9;

import java.util.Collections;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f27692i;

    public u(x9.c cVar, Object obj) {
        super(Collections.emptyList());
        k(cVar);
        this.f27692i = obj;
    }

    @Override // m9.e
    public final float c() {
        return 1.0f;
    }

    @Override // m9.e
    public final Object f() {
        x9.c cVar = this.f27643e;
        Object obj = this.f27692i;
        float f10 = this.f27642d;
        return cVar.n(s0.g.f34069a, s0.g.f34069a, obj, obj, f10, f10, f10);
    }

    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        return f();
    }

    @Override // m9.e
    public final void i() {
        if (this.f27643e != null) {
            super.i();
        }
    }

    @Override // m9.e
    public final void j(float f10) {
        this.f27642d = f10;
    }
}
