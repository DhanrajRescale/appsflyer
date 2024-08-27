package pr;

import com.google.zxing.FormatException;

/* loaded from: classes2.dex */
public abstract class i extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f31328b = {1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f31329c = {1, 1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f31330d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f31331e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f31332f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f31331e = iArr;
        int[][] iArr2 = new int[20];
        f31332f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f31331e[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f31332f[i10] = iArr4;
        }
    }

    public static boolean f0(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        if (g0(charSequence.subSequence(0, i10)) != Character.digit(charSequence.charAt(i10), 10)) {
            return false;
        }
        return true;
    }

    public static int g0(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i10 += charAt;
            } else {
                throw FormatException.a();
            }
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i12 += charAt2;
            } else {
                throw FormatException.a();
            }
        }
        return (1000 - i12) % 10;
    }
}
