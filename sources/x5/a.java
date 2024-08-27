package x5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f39965a;

    /* renamed from: b, reason: collision with root package name */
    public long f39966b;

    /* renamed from: c, reason: collision with root package name */
    public long f39967c;

    /* renamed from: d, reason: collision with root package name */
    public long f39968d;

    /* renamed from: e, reason: collision with root package name */
    public long f39969e;

    /* renamed from: f, reason: collision with root package name */
    public long f39970f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39971g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f39972h;

    public final boolean a() {
        return this.f39968d > 15 && this.f39972h == 0;
    }

    public final void b(long j10) {
        long j11 = this.f39968d;
        if (j11 == 0) {
            this.f39965a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f39965a;
            this.f39966b = j12;
            this.f39970f = j12;
            this.f39969e = 1L;
        } else {
            long j13 = j10 - this.f39967c;
            int i10 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.f39966b);
            boolean[] zArr = this.f39971g;
            if (abs <= 1000000) {
                this.f39969e++;
                this.f39970f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f39972h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f39972h++;
            }
        }
        this.f39968d++;
        this.f39967c = j10;
    }

    public final void c() {
        this.f39968d = 0L;
        this.f39969e = 0L;
        this.f39970f = 0L;
        this.f39972h = 0;
        Arrays.fill(this.f39971g, false);
    }
}
