package pr;

/* loaded from: classes2.dex */
public abstract class a extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f31312b = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f31313c = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean f0(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }
}
