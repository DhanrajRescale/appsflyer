package y1;

import hl.f;
import s0.g;
import t0.t;
import w2.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f41062a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final c f41063b = new c();

    /* renamed from: c, reason: collision with root package name */
    public long f41064c;

    public d() {
        int i10 = m1.c.f27236e;
    }

    public final long a(long j10) {
        boolean z10;
        if (o.b(j10) > g.f34069a && o.c(j10) > g.f34069a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return f.n(this.f41062a.b(o.b(j10)), this.f41063b.b(o.c(j10)));
        }
        t.C0("maximumVelocity should be a positive value. You specified=" + ((Object) o.f(j10)));
        throw null;
    }

    public final void b() {
        c cVar = this.f41062a;
        vt.t.m(cVar.f41057d);
        cVar.f41058e = 0;
        c cVar2 = this.f41063b;
        vt.t.m(cVar2.f41057d);
        cVar2.f41058e = 0;
        this.f41064c = 0L;
    }
}
