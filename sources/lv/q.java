package lv;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f25453a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25454b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25455c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25456d;

    public q(long j10, long j11, long j12, long j13) {
        this.f25453a = j10;
        this.f25454b = j11;
        this.f25455c = j12;
        this.f25456d = j13;
    }

    public static q d(long j10, long j11) {
        if (j10 <= j11) {
            return new q(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static q e(long j10, long j11, long j12) {
        if (j10 <= 1) {
            if (j11 <= j12) {
                if (1 <= j12) {
                    return new q(j10, 1L, j11, j12);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public final int a(long j10, m mVar) {
        if (this.f25453a >= -2147483648L && this.f25456d <= 2147483647L && c(j10)) {
            return (int) j10;
        }
        throw new RuntimeException("Invalid int value for " + mVar + ": " + j10);
    }

    public final void b(long j10, m mVar) {
        if (!c(j10)) {
            if (mVar != null) {
                throw new RuntimeException("Invalid value for " + mVar + " (valid values " + this + "): " + j10);
            }
            throw new RuntimeException("Invalid value (valid values " + this + "): " + j10);
        }
    }

    public final boolean c(long j10) {
        return j10 >= this.f25453a && j10 <= this.f25456d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f25453a == qVar.f25453a && this.f25454b == qVar.f25454b && this.f25455c == qVar.f25455c && this.f25456d == qVar.f25456d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25453a;
        long j11 = this.f25454b;
        long j12 = (j10 + j11) << ((int) (j11 + 16));
        long j13 = this.f25455c;
        long j14 = (j12 >> ((int) (j13 + 48))) << ((int) (j13 + 32));
        long j15 = this.f25456d;
        long j16 = ((j14 >> ((int) (32 + j15))) << ((int) (j15 + 48))) >> 16;
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f25453a;
        sb2.append(j10);
        long j11 = this.f25454b;
        if (j10 != j11) {
            sb2.append('/');
            sb2.append(j11);
        }
        sb2.append(" - ");
        long j12 = this.f25455c;
        sb2.append(j12);
        long j13 = this.f25456d;
        if (j12 != j13) {
            sb2.append('/');
            sb2.append(j13);
        }
        return sb2.toString();
    }
}
