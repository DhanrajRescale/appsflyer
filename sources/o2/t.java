package o2;

import c2.e1;
import d2.y0;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class t implements r {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f29527a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f29528b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f29529c;

    /* renamed from: d, reason: collision with root package name */
    public final y f29530d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f29531e;

    /* renamed from: f, reason: collision with root package name */
    public final e1 f29532f;

    public t(b bVar, d dVar) {
        q0 q0Var = u.f29533a;
        y yVar = new y(u.f29534b);
        f0 f0Var = new f0();
        this.f29527a = bVar;
        this.f29528b = dVar;
        this.f29529c = q0Var;
        this.f29530d = yVar;
        this.f29531e = f0Var;
        this.f29532f = new e1(this, 6);
    }

    public final t0 a(p0 p0Var) {
        t0 t0Var;
        q0 q0Var = this.f29529c;
        y0 y0Var = new y0(5, this, p0Var);
        synchronized (q0Var.f29520a) {
            t0Var = (t0) q0Var.f29521b.a(p0Var);
            if (t0Var != null) {
                if (!t0Var.a()) {
                }
            }
            try {
                t0Var = (t0) y0Var.invoke(new y0(6, q0Var, p0Var));
                synchronized (q0Var.f29520a) {
                    try {
                        if (q0Var.f29521b.a(p0Var) == null && t0Var.a()) {
                            q0Var.f29521b.b(p0Var, t0Var);
                        }
                        Unit unit = Unit.f23355a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
        return t0Var;
    }

    public final t0 b(s sVar, d0 d0Var, int i10, int i11) {
        j0 j0Var = this.f29528b;
        j0Var.getClass();
        d0 a10 = j0Var.a(d0Var);
        this.f29527a.getClass();
        return a(new p0(sVar, a10, i10, i11, null));
    }
}
