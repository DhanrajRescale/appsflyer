package p1;

import n1.r;
import t0.t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f30504a;

    public d(b bVar) {
        this.f30504a = bVar;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        b bVar = this.f30504a;
        r a10 = bVar.a();
        long j10 = t.j(m1.f.e(bVar.b()) - (f12 + f10), m1.f.c(bVar.b()) - (f13 + f11));
        if (m1.f.e(j10) >= s0.g.f34069a && m1.f.c(j10) >= s0.g.f34069a) {
            bVar.c(j10);
            a10.r(f10, f11);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
    }

    public final void b(long j10, float f10) {
        r a10 = this.f30504a.a();
        a10.r(m1.c.d(j10), m1.c.e(j10));
        a10.c(f10);
        a10.r(-m1.c.d(j10), -m1.c.e(j10));
    }

    public final void c(float f10, float f11, long j10) {
        r a10 = this.f30504a.a();
        a10.r(m1.c.d(j10), m1.c.e(j10));
        a10.b(f10, f11);
        a10.r(-m1.c.d(j10), -m1.c.e(j10));
    }

    public final void d(float f10, float f11) {
        this.f30504a.a().r(f10, f11);
    }
}
