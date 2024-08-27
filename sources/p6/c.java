package p6;

import android.util.Pair;
import e5.x;
import z5.z;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f30687a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f30688b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30689c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f30687a = jArr;
        this.f30688b = jArr2;
        this.f30689c = j10 == -9223372036854775807L ? x.F(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long[] jArr, long[] jArr2, long j10) {
        double d10;
        int f10 = x.f(jArr, j10, true);
        long j11 = jArr[f10];
        long j12 = jArr2[f10];
        int i10 = f10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * (j14 - j12))) + j12));
    }

    @Override // p6.f
    public final long a() {
        return -1L;
    }

    @Override // p6.f
    public final long b(long j10) {
        return x.F(((Long) d(this.f30687a, this.f30688b, j10).second).longValue());
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        Pair d10 = d(this.f30688b, this.f30687a, x.P(x.j(j10, 0L, this.f30689c)));
        z zVar = new z(x.F(((Long) d10.first).longValue()), ((Long) d10.second).longValue());
        return new z5.x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f30689c;
    }
}
