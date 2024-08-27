package i0;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e0 f19194a;

    /* renamed from: b, reason: collision with root package name */
    public a2.u f19195b;

    /* renamed from: c, reason: collision with root package name */
    public a2.u f19196c;

    public s2(j2.e0 e0Var) {
        this.f19194a = e0Var;
    }

    public final long a(long j10) {
        m1.d dVar;
        a2.u uVar = this.f19195b;
        m1.d dVar2 = m1.d.f27238e;
        if (uVar != null) {
            if (uVar.m()) {
                a2.u uVar2 = this.f19196c;
                if (uVar2 != null) {
                    dVar = uVar2.i(uVar, true);
                } else {
                    dVar = null;
                }
            } else {
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar2 = dVar;
            }
        }
        float d10 = m1.c.d(j10);
        float f10 = dVar2.f27239a;
        if (d10 >= f10) {
            float d11 = m1.c.d(j10);
            f10 = dVar2.f27241c;
            if (d11 <= f10) {
                f10 = m1.c.d(j10);
            }
        }
        float e10 = m1.c.e(j10);
        float f11 = dVar2.f27240b;
        if (e10 >= f11) {
            float e11 = m1.c.e(j10);
            f11 = dVar2.f27242d;
            if (e11 <= f11) {
                f11 = m1.c.e(j10);
            }
        }
        return t0.t.g(f10, f11);
    }

    public final int b(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f19194a.l(d(j10));
    }

    public final boolean c(long j10) {
        long d10 = d(a(j10));
        float e10 = m1.c.e(d10);
        j2.e0 e0Var = this.f19194a;
        int g10 = e0Var.g(e10);
        if (m1.c.d(d10) >= e0Var.h(g10) && m1.c.d(d10) <= e0Var.i(g10)) {
            return true;
        }
        return false;
    }

    public final long d(long j10) {
        a2.u uVar;
        a2.u uVar2 = this.f19195b;
        if (uVar2 != null) {
            a2.u uVar3 = null;
            if (!uVar2.m()) {
                uVar2 = null;
            }
            if (uVar2 != null && (uVar = this.f19196c) != null) {
                if (uVar.m()) {
                    uVar3 = uVar;
                }
                if (uVar3 != null) {
                    return uVar2.O(uVar3, j10);
                }
                return j10;
            }
            return j10;
        }
        return j10;
    }

    public final long e(long j10) {
        a2.u uVar;
        a2.u uVar2 = this.f19195b;
        if (uVar2 != null) {
            a2.u uVar3 = null;
            if (!uVar2.m()) {
                uVar2 = null;
            }
            if (uVar2 != null && (uVar = this.f19196c) != null) {
                if (uVar.m()) {
                    uVar3 = uVar;
                }
                if (uVar3 != null) {
                    return uVar3.O(uVar2, j10);
                }
                return j10;
            }
            return j10;
        }
        return j10;
    }
}
