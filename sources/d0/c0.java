package d0;

import t0.l1;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13147a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f13148b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f13149c = al.d.D0(-1);

    /* renamed from: d, reason: collision with root package name */
    public final l1 f13150d = al.d.D0(0);

    /* renamed from: e, reason: collision with root package name */
    public final n1 f13151e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f13152f;

    public c0(Object obj, d0 d0Var) {
        this.f13147a = obj;
        this.f13148b = d0Var;
        o3 o3Var = o3.f35116a;
        this.f13151e = t0.t.n0(null, o3Var);
        this.f13152f = t0.t.n0(null, o3Var);
    }

    public final c0 a() {
        l1 l1Var = this.f13150d;
        if (l1Var.i() == 0) {
            this.f13148b.f13154a.add(this);
            c0 c0Var = (c0) this.f13152f.getValue();
            if (c0Var != null) {
                c0Var.a();
            } else {
                c0Var = null;
            }
            this.f13151e.setValue(c0Var);
        }
        l1Var.j(l1Var.i() + 1);
        return this;
    }

    public final void b() {
        l1 l1Var = this.f13150d;
        if (l1Var.i() > 0) {
            l1Var.j(l1Var.i() - 1);
            if (l1Var.i() == 0) {
                this.f13148b.f13154a.remove(this);
                n1 n1Var = this.f13151e;
                c0 c0Var = (c0) n1Var.getValue();
                if (c0Var != null) {
                    c0Var.b();
                }
                n1Var.setValue(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
