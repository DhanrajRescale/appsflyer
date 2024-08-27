package mr;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int f27984b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int[] f27983a = new int[1];

    public final void a(boolean z10) {
        c(this.f27984b + 1);
        if (z10) {
            int[] iArr = this.f27983a;
            int i10 = this.f27984b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f27984b++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            c(this.f27984b + i11);
            while (i11 > 0) {
                boolean z10 = true;
                if (((i10 >> (i11 - 1)) & 1) != 1) {
                    z10 = false;
                }
                a(z10);
                i11--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        int[] iArr = this.f27983a;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f27983a = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mr.a] */
    public final Object clone() {
        int[] iArr = (int[]) this.f27983a.clone();
        int i10 = this.f27984b;
        ?? obj = new Object();
        obj.f27983a = iArr;
        obj.f27984b = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f27983a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f27984b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f27984b != aVar.f27984b || !Arrays.equals(this.f27983a, aVar.f27983a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27983a) + (this.f27984b * 31);
    }

    public final String toString() {
        char c10;
        int i10 = this.f27984b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f27984b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i11)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
