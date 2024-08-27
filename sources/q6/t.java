package q6;

import e5.x;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q f31797a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31798b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31799c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f31800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31801e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f31802f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f31803g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31804h;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        yk.j.E0(iArr2.length == jArr2.length);
        this.f31797a = qVar;
        this.f31799c = jArr;
        this.f31800d = iArr;
        this.f31801e = i10;
        this.f31802f = jArr2;
        this.f31803g = iArr2;
        this.f31804h = j10;
        this.f31798b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f31802f;
        for (int b10 = x.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f31803g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
