package pr;

/* loaded from: classes2.dex */
public final class b extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f31314b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f31315c = {'T', 'N', '*', 'E'};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f31316d = {'/', ':', '+', '.'};

    /* renamed from: e, reason: collision with root package name */
    public static final char f31317e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f31314b = cArr;
        f31317e = cArr[0];
    }

    @Override // bl.j
    public final boolean[] x(String str) {
        int i10;
        int length = str.length();
        char c10 = f31317e;
        if (length < 2) {
            str = c10 + str + c10;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f31314b;
            boolean f02 = a.f0(cArr, upperCase);
            boolean f03 = a.f0(cArr, upperCase2);
            char[] cArr2 = f31315c;
            boolean f04 = a.f0(cArr2, upperCase);
            boolean f05 = a.f0(cArr2, upperCase2);
            if (f02) {
                if (!f03) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (f04) {
                if (!f05) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!f03 && !f05) {
                str = c10 + str + c10;
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (!Character.isDigit(str.charAt(i12)) && str.charAt(i12) != '-' && str.charAt(i12) != '$') {
                if (a.f0(f31316d, str.charAt(i12))) {
                    i11 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
            } else {
                i11 += 9;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i11];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = a.f31312b;
                if (i15 < cArr3.length) {
                    if (upperCase3 == cArr3[i15]) {
                        i10 = a.f31313c[i15];
                        break;
                    }
                    i15++;
                } else {
                    i10 = 0;
                    break;
                }
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) != 0 && i17 != 1) {
                    i17++;
                } else {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
