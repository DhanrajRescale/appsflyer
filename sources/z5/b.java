package z5;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f42037a;

    /* renamed from: b, reason: collision with root package name */
    public String f42038b;

    /* renamed from: c, reason: collision with root package name */
    public int f42039c;

    /* renamed from: d, reason: collision with root package name */
    public int f42040d;

    /* renamed from: e, reason: collision with root package name */
    public int f42041e;

    /* renamed from: f, reason: collision with root package name */
    public int f42042f;

    /* renamed from: g, reason: collision with root package name */
    public int f42043g;

    public final boolean a(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f42037a = i11;
        this.f42038b = a.f42026m[3 - i12];
        int i17 = a.f42027n[i14];
        this.f42040d = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f42040d = i17 / 2;
        } else if (i11 == 0) {
            this.f42040d = i17 / 4;
        }
        int i19 = (i10 >>> 9) & 1;
        int i20 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i20 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i11 != 3) {
            i20 = 576;
        }
        this.f42043g = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = a.f42028o[i13 - 1];
            } else {
                i16 = a.f42029p[i13 - 1];
            }
            this.f42042f = i16;
            this.f42039c = (((i16 * 12) / this.f42040d) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = a.f42030q[i13 - 1];
                } else {
                    i15 = a.f42031r[i13 - 1];
                }
                this.f42042f = i15;
                this.f42039c = ((i15 * 144) / this.f42040d) + i19;
            } else {
                int i22 = a.f42032s[i13 - 1];
                this.f42042f = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f42039c = ((i21 * i22) / this.f42040d) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.f42041e = i18;
        return true;
    }
}
