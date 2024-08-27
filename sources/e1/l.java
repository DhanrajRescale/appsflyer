package e1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f14885a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14886b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f14887c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14888d;

    /* renamed from: e, reason: collision with root package name */
    public int f14889e;

    public final int a(int i10) {
        int i11 = this.f14885a + 1;
        int[] iArr = this.f14886b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            vt.t.g(iArr, iArr2, 0, 0, 14);
            vt.t.g(this.f14887c, iArr3, 0, 0, 14);
            this.f14886b = iArr2;
            this.f14887c = iArr3;
        }
        int i13 = this.f14885a;
        this.f14885a = i13 + 1;
        int length2 = this.f14888d.length;
        if (this.f14889e >= length2) {
            int i14 = length2 * 2;
            int[] iArr4 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr4[i15] = i16;
                i15 = i16;
            }
            vt.t.g(this.f14888d, iArr4, 0, 0, 14);
            this.f14888d = iArr4;
        }
        int i17 = this.f14889e;
        int[] iArr5 = this.f14888d;
        this.f14889e = iArr5[i17];
        int[] iArr6 = this.f14886b;
        iArr6[i13] = i10;
        this.f14887c[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            b(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    public final void b(int i10, int i11) {
        int[] iArr = this.f14886b;
        int[] iArr2 = this.f14887c;
        int[] iArr3 = this.f14888d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
