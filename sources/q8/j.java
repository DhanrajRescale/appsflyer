package q8;

import n5.b0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f31863a;

    public j(b0 b0Var) {
        this.f31863a = b0Var;
    }

    public final k a() {
        e d10;
        b0 b0Var = this.f31863a;
        h hVar = (h) b0Var.f28250e;
        synchronized (hVar) {
            switch (b0Var.f28246a) {
                case 3:
                    b0Var.c(true);
                    break;
                default:
                    vj.e.a((vj.e) b0Var.f28250e, b0Var, true);
                    b0Var.f28247b = true;
                    break;
            }
            d10 = hVar.d(((d) b0Var.f28248c).f31830a);
        }
        if (d10 != null) {
            return new k(d10);
        }
        return null;
    }
}
