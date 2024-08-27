package r5;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f33332a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f33333b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f33334c;

    public y0() {
        this(new Random());
    }

    public final y0 a(int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f33333b;
            random = this.f33332a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 < i10 && i14 == iArr2[i13]) {
                iArr4[i15] = iArr3[i13];
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new y0(iArr4, new Random(random.nextLong()));
    }

    public y0(Random random) {
        this(new int[0], random);
    }

    public y0(int[] iArr, Random random) {
        this.f33333b = iArr;
        this.f33332a = random;
        this.f33334c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f33334c[iArr[i10]] = i10;
        }
    }
}
