package r9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f33466a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33467b;

    public c(float[] fArr, int[] iArr) {
        this.f33466a = fArr;
        this.f33467b = iArr;
    }

    public final c a(float[] fArr) {
        int y10;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f10 = fArr[i10];
            float[] fArr2 = this.f33466a;
            int binarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f33467b;
            if (binarySearch >= 0) {
                y10 = iArr2[binarySearch];
            } else {
                int i11 = -(binarySearch + 1);
                if (i11 == 0) {
                    y10 = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    y10 = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f11 = fArr2[i12];
                    y10 = bl.j.y(iArr2[i12], (f10 - f11) / (fArr2[i11] - f11), iArr2[i11]);
                }
            }
            iArr[i10] = y10;
        }
        return new c(fArr, iArr);
    }
}
