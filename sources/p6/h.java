package p6;

import e5.x;
import yk.j;
import z5.z;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f30714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30715b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30716c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30717d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30718e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f30719f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f30714a = j10;
        this.f30715b = i10;
        this.f30716c = j11;
        this.f30719f = jArr;
        this.f30717d = j12;
        this.f30718e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // p6.f
    public final long a() {
        return this.f30718e;
    }

    @Override // p6.f
    public final long b(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f30714a;
        if (c() && j12 > this.f30715b) {
            long[] jArr = this.f30719f;
            j.I0(jArr);
            double d11 = (j12 * 256.0d) / this.f30717d;
            int f10 = x.f(jArr, (long) d11, true);
            long j13 = this.f30716c;
            long j14 = (f10 * j13) / 100;
            long j15 = jArr[f10];
            int i10 = f10 + 1;
            long j16 = (j13 * i10) / 100;
            if (f10 == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i10];
            }
            if (j15 == j11) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j15) / (j11 - j15);
            }
            return Math.round(d10 * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override // z5.y
    public final boolean c() {
        return this.f30719f != null;
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        double d10;
        double d11;
        boolean c10 = c();
        int i10 = this.f30715b;
        long j11 = this.f30714a;
        if (!c10) {
            z zVar = new z(0L, j11 + i10);
            return new z5.x(zVar, zVar);
        }
        long j12 = x.j(j10, 0L, this.f30716c);
        double d12 = (j12 * 100.0d) / this.f30716c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d11 = 256.0d;
                d13 = 256.0d;
                double d14 = d13 / d11;
                long j13 = this.f30717d;
                z zVar2 = new z(j12, j11 + x.j(Math.round(d14 * j13), i10, j13 - 1));
                return new z5.x(zVar2, zVar2);
            }
            int i11 = (int) d12;
            long[] jArr = this.f30719f;
            j.I0(jArr);
            double d15 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
            } else {
                d10 = jArr[i11 + 1];
            }
            d13 = ((d10 - d15) * (d12 - i11)) + d15;
        }
        d11 = 256.0d;
        double d142 = d13 / d11;
        long j132 = this.f30717d;
        z zVar22 = new z(j12, j11 + x.j(Math.round(d142 * j132), i10, j132 - 1));
        return new z5.x(zVar22, zVar22);
    }

    @Override // z5.y
    public final long i() {
        return this.f30716c;
    }
}
