package bv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7322a = new h();

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
    }

    public static final int c(m mVar, int i10) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i10 == -1234567890) {
            return mVar.d();
        }
        return i10;
    }

    public static final String d(byte b10) {
        char[] cArr = cv.b.f13080a;
        char[] cArr2 = {cArr[(b10 >> 4) & 15], cArr[b10 & 15]};
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        return new String(cArr2);
    }

    public static final String e(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = cv.b.f13080a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        vt.d.INSTANCE.getClass();
        if (i11 >= 0) {
            if (i11 <= 8) {
                return new String(cArr2, i11, 8 - i11);
            }
            throw new IllegalArgumentException(jr.h.o("startIndex: ", i11, " > endIndex: 8"));
        }
        throw new IndexOutOfBoundsException(jr.h.o("startIndex: ", i11, ", endIndex: 8, size: 8"));
    }
}
