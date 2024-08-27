package pr;

import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f31325b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f31326c = {3, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f31327d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // bl.j, kr.b
    public final mr.b e(String str, int i10, int i11, int i12, Map map) {
        if (i10 == 9) {
            return super.e(str, i10, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(jr.h.A(i10)));
    }

    @Override // bl.j
    public final boolean[] x(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int j10 = bl.j.j(zArr, 0, f31325b, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = f31327d;
                        iArr[i12] = iArr2[digit][i11];
                        iArr[i12 + 1] = iArr2[digit2][i11];
                    }
                    j10 += bl.j.j(zArr, j10, iArr, true);
                }
                bl.j.j(zArr, j10, f31326c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
