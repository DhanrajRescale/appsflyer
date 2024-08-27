package pr;

import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31320b;

    public /* synthetic */ d(int i10) {
        this.f31320b = i10;
    }

    public static void a0(boolean[] zArr, int i10, int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            if (iArr[i11] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i10] = z10;
            i11++;
            i10 = i12;
        }
    }

    public static int b0(int i10, String str) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    public static int c0(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 1;
        if (i10 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i12 = i10 + 1;
            i11 = 2;
            if (i12 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return 3;
            }
        }
        return i11;
    }

    public static void d0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    public static void e0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // bl.j, kr.b
    public final mr.b e(String str, int i10, int i11, int i12, Map map) {
        switch (this.f31320b) {
            case 0:
                if (i10 == 5) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(jr.h.A(i10)));
            case 1:
                if (i10 == 3) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(jr.h.A(i10)));
            default:
                if (i10 == 4) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(jr.h.A(i10)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x026c, code lost:
    
        if (r14 < '`') goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029b, code lost:
    
        if (c0(r5 + 3, r0) == 3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x029d, code lost:
    
        r10 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02ab, code lost:
    
        if (r12 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02b6, code lost:
    
        if (r14 == 3) goto L136;
     */
    @Override // bl.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] x(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pr.d.x(java.lang.String):boolean[]");
    }
}
