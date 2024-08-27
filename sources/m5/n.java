package m5;

import e5.x;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f27571d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27572e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27573f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27574g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27575h;

    /* renamed from: i, reason: collision with root package name */
    public final long f27576i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.f27571d = j12;
        this.f27572e = j13;
        this.f27573f = list;
        this.f27576i = j14;
        this.f27574g = j15;
        this.f27575h = j16;
    }

    public final long b(long j10, long j11) {
        long d10 = d(j10);
        if (d10 != -1) {
            return d10;
        }
        return (int) (f((j11 - this.f27575h) + this.f27576i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long d10 = d(j10);
        long j12 = this.f27571d;
        if (d10 == -1) {
            long j13 = this.f27574g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.f27575h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f27586b;
        long j13 = this.f27571d;
        List list = this.f27573f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f27582b * 1000000) / j12;
        }
        long d10 = d(j11);
        if (d10 != -1 && j10 == (j13 + d10) - 1) {
            return j11 - g(j10);
        }
        return (this.f27572e * 1000000) / j12;
    }

    public final long f(long j10, long j11) {
        long d10 = d(j11);
        long j12 = this.f27571d;
        if (d10 == 0) {
            return j12;
        }
        if (this.f27573f == null) {
            long j13 = (j10 / ((this.f27572e * 1000000) / this.f27586b)) + j12;
            if (j13 >= j12) {
                if (d10 == -1) {
                    return j13;
                }
                return Math.min(j13, (j12 + d10) - 1);
            }
            return j12;
        }
        long j14 = (d10 + j12) - 1;
        long j15 = j12;
        while (j15 <= j14) {
            long j16 = ((j14 - j15) / 2) + j15;
            long g10 = g(j16);
            if (g10 < j10) {
                j15 = j16 + 1;
            } else if (g10 > j10) {
                j14 = j16 - 1;
            } else {
                return j16;
            }
        }
        if (j15 == j12) {
            return j15;
        }
        return j14;
    }

    public final long g(long j10) {
        long j11;
        long j12 = this.f27571d;
        List list = this.f27573f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f27581a - this.f27587c;
        } else {
            j11 = (j10 - j12) * this.f27572e;
        }
        return x.L(j11, 1000000L, this.f27586b);
    }

    public abstract j h(long j10, m mVar);

    public boolean i() {
        return this.f27573f != null;
    }
}
