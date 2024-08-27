package o8;

import android.os.SystemClock;
import t0.k1;
import t0.l1;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class v extends q1.b {

    /* renamed from: e, reason: collision with root package name */
    public q1.b f29844e;

    /* renamed from: f, reason: collision with root package name */
    public final q1.b f29845f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.l f29846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29847h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29848i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29849j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29852m;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f29850k = al.d.D0(0);

    /* renamed from: l, reason: collision with root package name */
    public long f29851l = -1;

    /* renamed from: n, reason: collision with root package name */
    public final k1 f29853n = dp.b.y1(1.0f);

    /* renamed from: o, reason: collision with root package name */
    public final n1 f29854o = t0.t.n0(null, o3.f35116a);

    public v(q1.b bVar, q1.b bVar2, a2.l lVar, int i10, boolean z10, boolean z11) {
        this.f29844e = bVar;
        this.f29845f = bVar2;
        this.f29846g = lVar;
        this.f29847h = i10;
        this.f29848i = z10;
        this.f29849j = z11;
    }

    @Override // q1.b
    public final void c(float f10) {
        this.f29853n.j(f10);
    }

    @Override // q1.b
    public final void e(n1.u uVar) {
        this.f29854o.setValue(uVar);
    }

    @Override // q1.b
    public final long h() {
        long j10;
        long j11;
        boolean z10;
        q1.b bVar = this.f29844e;
        if (bVar != null) {
            j10 = bVar.h();
        } else {
            j10 = m1.f.f27251b;
        }
        q1.b bVar2 = this.f29845f;
        if (bVar2 != null) {
            j11 = bVar2.h();
        } else {
            j11 = m1.f.f27251b;
        }
        long j12 = m1.f.f27252c;
        boolean z11 = false;
        if (j10 != j12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j11 != j12) {
            z11 = true;
        }
        if (z10 && z11) {
            return t0.t.j(Math.max(m1.f.e(j10), m1.f.e(j11)), Math.max(m1.f.c(j10), m1.f.c(j11)));
        }
        if (this.f29849j) {
            if (!z10) {
                if (z11) {
                    return j11;
                }
            } else {
                return j10;
            }
        }
        return j12;
    }

    @Override // q1.b
    public final void i(p1.h hVar) {
        float i10;
        boolean z10;
        boolean z11 = this.f29852m;
        k1 k1Var = this.f29853n;
        q1.b bVar = this.f29845f;
        if (z11) {
            j(hVar, bVar, k1Var.i());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f29851l == -1) {
            this.f29851l = uptimeMillis;
        }
        float f10 = ((float) (uptimeMillis - this.f29851l)) / this.f29847h;
        float i11 = k1Var.i() * kotlin.ranges.d.e(f10, s0.g.f34069a, 1.0f);
        if (this.f29848i) {
            i10 = k1Var.i() - i11;
        } else {
            i10 = k1Var.i();
        }
        if (f10 >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29852m = z10;
        j(hVar, this.f29844e, i10);
        j(hVar, bVar, i11);
        if (this.f29852m) {
            this.f29844e = null;
        } else {
            l1 l1Var = this.f29850k;
            l1Var.j(l1Var.i() + 1);
        }
    }

    public final void j(p1.h hVar, q1.b bVar, float f10) {
        long j10;
        if (bVar != null && f10 > s0.g.f34069a) {
            long d10 = hVar.d();
            long h10 = bVar.h();
            long j11 = m1.f.f27252c;
            if (h10 == j11 || m1.f.f(h10) || d10 == j11 || m1.f.f(d10)) {
                j10 = d10;
            } else {
                j10 = androidx.compose.ui.layout.a.n(h10, this.f29846g.b(h10, d10));
            }
            n1 n1Var = this.f29854o;
            if (d10 == j11 || m1.f.f(d10)) {
                bVar.g(hVar, j10, f10, (n1.u) n1Var.getValue());
                return;
            }
            float f11 = 2;
            float e10 = (m1.f.e(d10) - m1.f.e(j10)) / f11;
            float c10 = (m1.f.c(d10) - m1.f.c(j10)) / f11;
            hVar.f0().f30498a.a(e10, c10, e10, c10);
            bVar.g(hVar, j10, f10, (n1.u) n1Var.getValue());
            float f12 = -e10;
            float f13 = -c10;
            hVar.f0().f30498a.a(f12, f13, f12, f13);
        }
    }
}
