package c4;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7945a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f7946b = new char[24];

    public static void a(long j10, PrintWriter printWriter) {
        synchronized (f7945a) {
            printWriter.print(new String(f7946b, 0, b(j10)));
        }
    }

    public static int b(long j10) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        if (f7946b.length < 0) {
            f7946b = new char[0];
        }
        char[] cArr = f7946b;
        if (j10 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j10 > 0) {
            c10 = '+';
        } else {
            j10 = -j10;
            c10 = '-';
        }
        int i14 = (int) (j10 % 1000);
        int floor = (int) Math.floor(j10 / 1000);
        if (floor > 86400) {
            i10 = floor / 86400;
            floor -= 86400 * i10;
        } else {
            i10 = 0;
        }
        if (floor > 3600) {
            i11 = floor / 3600;
            floor -= i11 * 3600;
        } else {
            i11 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i12 = floor - (i15 * 60);
            i13 = i15;
        } else {
            i12 = floor;
            i13 = 0;
        }
        cArr[0] = c10;
        int c11 = c(cArr, i10, 'd', 1, false, 0);
        if (c11 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int c12 = c(cArr, i11, 'h', c11, z10, 0);
        if (c12 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int c13 = c(cArr, i13, 'm', c12, z11, 0);
        if (c13 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int c14 = c(cArr, i14, 'm', c(cArr, i12, 's', c13, z12, 0), true, 0);
        cArr[c14] = 's';
        return c14 + 1;
    }

    public static int c(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (z10 || i10 > 0) {
            if ((z10 && i12 >= 3) || i10 > 99) {
                int i14 = i10 / 100;
                cArr[i11] = (char) (i14 + 48);
                i13 = i11 + 1;
                i10 -= i14 * 100;
            } else {
                i13 = i11;
            }
            if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
                int i15 = i10 / 10;
                cArr[i13] = (char) (i15 + 48);
                i13++;
                i10 -= i15 * 10;
            }
            cArr[i13] = (char) (i10 + 48);
            cArr[i13 + 1] = c10;
            return i13 + 2;
        }
        return i11;
    }
}
