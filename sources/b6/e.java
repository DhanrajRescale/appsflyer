package b6;

import yk.j;
import z5.b0;
import z5.x;
import z5.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3729c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3730d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3731e;

    /* renamed from: f, reason: collision with root package name */
    public int f3732f;

    /* renamed from: g, reason: collision with root package name */
    public int f3733g;

    /* renamed from: h, reason: collision with root package name */
    public int f3734h;

    /* renamed from: i, reason: collision with root package name */
    public int f3735i;

    /* renamed from: j, reason: collision with root package name */
    public int f3736j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f3737k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f3738l;

    public e(int i10, int i11, long j10, int i12, b0 b0Var) {
        int i13;
        int i14;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        j.E0(z10);
        this.f3730d = j10;
        this.f3731e = i12;
        this.f3727a = b0Var;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f3728b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f3729c = i14;
        this.f3737k = new long[512];
        this.f3738l = new int[512];
    }

    public final z a(int i10) {
        return new z(((this.f3730d * 1) / this.f3731e) * this.f3738l[i10], this.f3737k[i10]);
    }

    public final x b(long j10) {
        int i10 = (int) (j10 / ((this.f3730d * 1) / this.f3731e));
        int e10 = e5.x.e(this.f3738l, i10, true, true);
        if (this.f3738l[e10] == i10) {
            z a10 = a(e10);
            return new x(a10, a10);
        }
        z a11 = a(e10);
        int i11 = e10 + 1;
        if (i11 < this.f3737k.length) {
            return new x(a11, a(i11));
        }
        return new x(a11, a11);
    }
}
