package c2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7882a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7883b;

    /* renamed from: c, reason: collision with root package name */
    public int f7884c;

    public y() {
        this.f7882a = 2;
        this.f7883b = new int[256];
        this.f7884c = 0;
    }

    public final int a(int i10) {
        switch (this.f7882a) {
            case 0:
                return this.f7883b[i10];
            default:
                return this.f7883b[i10 + this.f7884c];
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13 = this.f7884c;
        int i14 = i13 + 3;
        int[] iArr = this.f7883b;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f7883b = copyOf;
        }
        int[] iArr2 = this.f7883b;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f7884c = i14;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        int i14 = this.f7884c;
        int i15 = i14 + 4;
        int[] iArr = this.f7883b;
        if (i15 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f7883b = copyOf;
        }
        int[] iArr2 = this.f7883b;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f7884c = i15;
    }

    public final void d(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f7883b;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    e(i12, i13);
                }
            }
            e(i12 + 3, i11);
            d(i10, i12);
            d(i12 + 6, i11);
        }
    }

    public final void e(int i10, int i11) {
        int[] iArr = this.f7883b;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public y(int i10) {
        this.f7882a = 0;
        this.f7883b = new int[i10];
    }
}
