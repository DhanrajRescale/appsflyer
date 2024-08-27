package l5;

import e5.x;
import lp.j1;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24044a;

    /* renamed from: b, reason: collision with root package name */
    public long f24045b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24046c;

    public /* synthetic */ j(Object obj, int i10, long j10) {
        this.f24044a = i10;
        this.f24046c = obj;
        this.f24045b = j10;
    }

    @Override // l5.i
    public final boolean E() {
        return true;
    }

    @Override // l5.i
    public final long F() {
        return 0L;
    }

    @Override // l5.i
    public final long H(long j10) {
        return ((z5.j) this.f24046c).f42090a;
    }

    @Override // l5.i
    public final long I(long j10, long j11) {
        return ((z5.j) this.f24046c).f42090a;
    }

    public final void a(int i10) {
        if (i10 >= 64) {
            Object obj = this.f24046c;
            if (((j) obj) != null) {
                ((j) obj).a(i10 - 64);
                return;
            }
            return;
        }
        this.f24045b &= ~(1 << i10);
    }

    @Override // l5.i
    public final long b(long j10) {
        return ((z5.j) this.f24046c).f42094e[(int) j10] - this.f24045b;
    }

    public final int c(int i10) {
        Object obj = this.f24046c;
        if (((j) obj) == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f24045b);
            }
            return Long.bitCount(this.f24045b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f24045b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f24045b) + ((j) obj).c(i10 - 64);
    }

    public final void d() {
        if (((j) this.f24046c) == null) {
            this.f24046c = new j(3);
        }
    }

    @Override // l5.i
    public final long e(long j10, long j11) {
        return ((z5.j) this.f24046c).f42093d[(int) j10];
    }

    public final boolean f(int i10) {
        if (i10 >= 64) {
            d();
            return ((j) this.f24046c).f(i10 - 64);
        }
        if ((this.f24045b & (1 << i10)) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            d();
            ((j) this.f24046c).g(i10 - 64, z10);
            return;
        }
        long j10 = this.f24045b;
        if ((Long.MIN_VALUE & j10) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j11 = (1 << i10) - 1;
        this.f24045b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            m(i10);
        } else {
            a(i10);
        }
        if (z11 || ((j) this.f24046c) != null) {
            d();
            ((j) this.f24046c).g(0, z11);
        }
    }

    @Override // l5.i
    public final long h(long j10, long j11) {
        return 0L;
    }

    public final boolean i(int i10) {
        boolean z10;
        if (i10 >= 64) {
            d();
            return ((j) this.f24046c).i(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f24045b;
        if ((j11 & j10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j11 & (~j10);
        this.f24045b = j12;
        long j13 = j10 - 1;
        this.f24045b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        Object obj = this.f24046c;
        if (((j) obj) != null) {
            if (((j) obj).f(0)) {
                m(63);
            }
            ((j) this.f24046c).i(0);
        }
        return z10;
    }

    @Override // l5.i
    public final long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l5.i
    public final m5.j k(long j10) {
        return new m5.j(((z5.j) this.f24046c).f42092c[(int) j10], r0.f42091b[r8], null);
    }

    public final void l() {
        this.f24045b = 0L;
        Object obj = this.f24046c;
        if (((j) obj) != null) {
            ((j) obj).l();
        }
    }

    public final void m(int i10) {
        if (i10 >= 64) {
            d();
            ((j) this.f24046c).m(i10 - 64);
        } else {
            this.f24045b |= 1 << i10;
        }
    }

    @Override // l5.i
    public final long t(long j10, long j11) {
        z5.j jVar = (z5.j) this.f24046c;
        return x.f(jVar.f42094e, j10 + this.f24045b, true);
    }

    public final String toString() {
        switch (this.f24044a) {
            case 3:
                if (((j) this.f24046c) == null) {
                    return Long.toBinaryString(this.f24045b);
                }
                return ((j) this.f24046c).toString() + "xx" + Long.toBinaryString(this.f24045b);
            default:
                return super.toString();
        }
    }

    public j(long j10, j1 j1Var) {
        this.f24044a = 1;
        this.f24045b = j10;
        this.f24046c = j1Var;
    }

    public j(int i10) {
        this.f24044a = i10;
        if (i10 != 4) {
            this.f24045b = 0L;
        } else {
            this.f24045b = 0L;
            this.f24046c = mn.c.REASON_UNKNOWN;
        }
    }
}
