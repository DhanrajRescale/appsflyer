package mr;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final int f27985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27987c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f27988d;

    public b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f27985a = i10;
            this.f27986b = i11;
            int i12 = (i10 + 31) / 32;
            this.f27987c = i12;
            this.f27988d = new int[i12 * i11];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean a(int i10, int i11) {
        if (((this.f27988d[(i10 / 32) + (i11 * this.f27987c)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void b(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f27987c);
        int[] iArr = this.f27988d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 >= 0 && i10 >= 0) {
            if (i13 > 0 && i12 > 0) {
                int i14 = i12 + i10;
                int i15 = i13 + i11;
                if (i15 <= this.f27986b && i14 <= this.f27985a) {
                    while (i11 < i15) {
                        int i16 = this.f27987c * i11;
                        for (int i17 = i10; i17 < i14; i17++) {
                            int i18 = (i17 / 32) + i16;
                            int[] iArr = this.f27988d;
                            iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                        }
                        i11++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f27988d.clone();
        return new b(this.f27985a, this.f27986b, this.f27987c, iArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27985a != bVar.f27985a || this.f27986b != bVar.f27986b || this.f27987c != bVar.f27987c || !Arrays.equals(this.f27988d, bVar.f27988d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f27985a;
        return Arrays.hashCode(this.f27988d) + (((((((i10 * 31) + i10) * 31) + this.f27986b) * 31) + this.f27987c) * 31);
    }

    public final String toString() {
        String str;
        int i10 = this.f27985a;
        int i11 = this.f27986b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                if (a(i13, i12)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f27985a = i10;
        this.f27986b = i11;
        this.f27987c = i12;
        this.f27988d = iArr;
    }
}
