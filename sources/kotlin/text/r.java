package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class r extends q {
    public static Integer g(String str) {
        boolean z10;
        int i10;
        Integer valueOf;
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        if (Intrinsics.f(charAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + digit) {
                return null;
            }
            i12 = i11 - digit;
            i10++;
        }
        if (z10) {
            valueOf = Integer.valueOf(i12);
        } else {
            valueOf = Integer.valueOf(-i12);
        }
        return valueOf;
    }

    public static Long h(String str) {
        boolean z10;
        Long valueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (Intrinsics.f(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j10 = Long.MIN_VALUE;
                i10 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 != j11) {
                    return null;
                }
                j13 = j10 / 10;
                if (j12 < j13) {
                    return null;
                }
            }
            long j14 = j12 * 10;
            long j15 = digit;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i10++;
            j11 = -256204778801521550L;
        }
        if (z10) {
            valueOf = Long.valueOf(j12);
        } else {
            valueOf = Long.valueOf(-j12);
        }
        return valueOf;
    }
}
