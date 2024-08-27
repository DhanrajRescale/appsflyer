package e5;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long f15045a;

    /* renamed from: b, reason: collision with root package name */
    public long f15046b;

    /* renamed from: c, reason: collision with root package name */
    public long f15047c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f15048d = new ThreadLocal();

    public u(long j10) {
        d(j10);
    }

    public final synchronized long a(long j10) {
        boolean z10;
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (this.f15046b != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    long j12 = this.f15045a;
                    if (j12 == 9223372036854775806L) {
                        Long l10 = (Long) this.f15048d.get();
                        l10.getClass();
                        j12 = l10.longValue();
                    }
                    this.f15046b = j12 - j10;
                    notifyAll();
                }
                this.f15047c = j10;
                j11 = j10 + this.f15046b;
            }
            return j11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f15047c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                if (Math.abs(j14 - j12) < Math.abs(j15 - j12)) {
                    j10 = j14;
                } else {
                    j10 = j15;
                }
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c() {
        long j10;
        j10 = this.f15045a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized void d(long j10) {
        long j11;
        this.f15045a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f15046b = j11;
        this.f15047c = -9223372036854775807L;
    }
}
