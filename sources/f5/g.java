package f5;

import b5.m;
import b5.n;
import java.util.Arrays;
import yk.j;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15954a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f15955b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15956c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f15957d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.H0(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        if (i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1) : !(bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr[0] = z11;
        if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[1] = z12;
        if (bArr[i13] == 0) {
            z13 = true;
        }
        zArr[2] = z13;
        return i11;
    }

    public static d c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        m mVar = new m(bArr, i10 + 2, i11);
        int i26 = 4;
        mVar.s(4);
        int i27 = mVar.i(3);
        mVar.r();
        int i28 = mVar.i(2);
        boolean h10 = mVar.h();
        int i29 = mVar.i(5);
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i12 = 1;
            if (i31 >= 32) {
                break;
            }
            if (mVar.h()) {
                i30 |= 1 << i31;
            }
            i31++;
        }
        int i32 = 6;
        int[] iArr2 = new int[6];
        for (int i33 = 0; i33 < 6; i33++) {
            iArr2[i33] = mVar.i(8);
        }
        int i34 = mVar.i(8);
        int i35 = 0;
        for (int i36 = 0; i36 < i27; i36++) {
            if (mVar.h()) {
                i35 += 89;
            }
            if (mVar.h()) {
                i35 += 8;
            }
        }
        mVar.s(i35);
        if (i27 > 0) {
            mVar.s((8 - i27) * 2);
        }
        mVar.l();
        int l10 = mVar.l();
        if (l10 == 3) {
            mVar.r();
        }
        int l11 = mVar.l();
        int l12 = mVar.l();
        if (mVar.h()) {
            int l13 = mVar.l();
            int l14 = mVar.l();
            int l15 = mVar.l();
            int l16 = mVar.l();
            if (l10 != 1 && l10 != 2) {
                i24 = 1;
            } else {
                i24 = 2;
            }
            if (l10 == 1) {
                i25 = 2;
            } else {
                i25 = 1;
            }
            l11 -= (l13 + l14) * i24;
            l12 -= (l15 + l16) * i25;
        }
        int i37 = l12;
        int i38 = l11;
        mVar.l();
        mVar.l();
        int l17 = mVar.l();
        if (mVar.h()) {
            i13 = 0;
        } else {
            i13 = i27;
        }
        for (int i39 = i13; i39 <= i27; i39++) {
            mVar.l();
            mVar.l();
            mVar.l();
        }
        mVar.l();
        mVar.l();
        mVar.l();
        mVar.l();
        mVar.l();
        mVar.l();
        if (mVar.h() && mVar.h()) {
            int i40 = 0;
            while (i40 < i26) {
                int i41 = 0;
                while (i41 < i32) {
                    if (!mVar.h()) {
                        mVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i40 << 1) + 4));
                        if (i40 > 1) {
                            mVar.m();
                        }
                        for (int i42 = 0; i42 < min; i42++) {
                            mVar.m();
                        }
                    }
                    if (i40 == 3) {
                        i23 = 3;
                    } else {
                        i23 = 1;
                    }
                    i41 += i23;
                    i32 = 6;
                }
                i40++;
                i26 = 4;
                i32 = 6;
            }
        }
        mVar.s(2);
        if (mVar.h()) {
            mVar.s(8);
            mVar.l();
            mVar.l();
            mVar.r();
        }
        int l18 = mVar.l();
        int i43 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i44 = -1;
        int i45 = -1;
        int i46 = -1;
        while (i43 < l18) {
            if (i43 != 0 && mVar.h()) {
                int i47 = i46 + i45;
                int l19 = (1 - ((mVar.h() ? 1 : 0) * 2)) * (mVar.l() + 1);
                i17 = l18;
                int i48 = i47 + 1;
                i20 = i34;
                boolean[] zArr = new boolean[i48];
                iArr = iArr2;
                for (int i49 = 0; i49 <= i47; i49++) {
                    if (!mVar.h()) {
                        zArr[i49] = mVar.h();
                    } else {
                        zArr[i49] = true;
                    }
                }
                int[] iArr5 = new int[i48];
                int[] iArr6 = new int[i48];
                int i50 = 0;
                for (int i51 = i45 - 1; i51 >= 0; i51--) {
                    int i52 = iArr4[i51] + l19;
                    if (i52 < 0 && zArr[i46 + i51]) {
                        iArr5[i50] = i52;
                        i50++;
                    }
                }
                if (l19 < 0 && zArr[i47]) {
                    iArr5[i50] = l19;
                    i50++;
                }
                i19 = i30;
                int i53 = i50;
                i18 = i29;
                for (int i54 = 0; i54 < i46; i54++) {
                    int i55 = iArr3[i54] + l19;
                    if (i55 < 0 && zArr[i54]) {
                        iArr5[i53] = i55;
                        i53++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i53);
                int i56 = 0;
                for (int i57 = i46 - 1; i57 >= 0; i57--) {
                    int i58 = iArr3[i57] + l19;
                    if (i58 > 0 && zArr[i57]) {
                        iArr6[i56] = i58;
                        i56++;
                    }
                }
                if (l19 > 0 && zArr[i47]) {
                    iArr6[i56] = l19;
                    i56++;
                }
                int i59 = i56;
                for (int i60 = 0; i60 < i45; i60++) {
                    int i61 = iArr4[i60] + l19;
                    if (i61 > 0 && zArr[i46 + i60]) {
                        iArr6[i59] = i61;
                        i59++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i59);
                i46 = i53;
                i45 = i59;
                i12 = 1;
                iArr3 = copyOf;
            } else {
                i17 = l18;
                i18 = i29;
                i19 = i30;
                iArr = iArr2;
                i20 = i34;
                int l20 = mVar.l();
                int l21 = mVar.l();
                int[] iArr7 = new int[l20];
                for (int i62 = 0; i62 < l20; i62++) {
                    if (i62 > 0) {
                        i22 = iArr7[i62 - 1];
                    } else {
                        i22 = 0;
                    }
                    iArr7[i62] = i22 - (mVar.l() + 1);
                    mVar.r();
                }
                int[] iArr8 = new int[l21];
                for (int i63 = 0; i63 < l21; i63++) {
                    if (i63 > 0) {
                        i21 = iArr8[i63 - 1];
                    } else {
                        i21 = 0;
                    }
                    iArr8[i63] = mVar.l() + 1 + i21;
                    mVar.r();
                }
                i12 = 1;
                iArr3 = iArr7;
                iArr4 = iArr8;
                i46 = l20;
                i45 = l21;
            }
            i43++;
            l18 = i17;
            i34 = i20;
            iArr2 = iArr;
            i30 = i19;
            i29 = i18;
        }
        int i64 = i29;
        int i65 = i30;
        int[] iArr9 = iArr2;
        int i66 = i34;
        if (mVar.h()) {
            int l22 = mVar.l();
            for (int i67 = 0; i67 < l22; i67++) {
                mVar.s(l17 + 5);
            }
        }
        int i68 = 2;
        mVar.s(2);
        float f11 = 1.0f;
        if (mVar.h()) {
            if (mVar.h()) {
                int i69 = mVar.i(8);
                if (i69 == 255) {
                    int i70 = mVar.i(16);
                    int i71 = mVar.i(16);
                    if (i70 != 0 && i71 != 0) {
                        f11 = i70 / i71;
                    }
                } else if (i69 < 17) {
                    f11 = f15955b[i69];
                } else {
                    nn.d.u("Unexpected aspect_ratio_idc value: ", i69, "NalUnitUtil");
                }
            }
            if (mVar.h()) {
                mVar.r();
            }
            if (mVar.h()) {
                mVar.s(3);
                if (mVar.h()) {
                    i68 = i12;
                }
                if (mVar.h()) {
                    int i72 = mVar.i(8);
                    int i73 = mVar.i(8);
                    mVar.s(8);
                    i44 = n.b(i72);
                    i16 = n.c(i73);
                } else {
                    i16 = -1;
                }
            } else {
                i68 = -1;
                i16 = -1;
            }
            if (mVar.h()) {
                mVar.l();
                mVar.l();
            }
            mVar.r();
            if (mVar.h()) {
                i37 *= 2;
            }
            f10 = f11;
            i14 = i37;
            i15 = i44;
            i44 = i16;
        } else {
            f10 = 1.0f;
            i14 = i37;
            i68 = -1;
            i15 = -1;
        }
        return new d(i28, h10, i64, i65, iArr9, i66, i38, i14, f10, i15, i68, i44);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f5.f d(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.g.d(byte[], int, int):f5.f");
    }

    public static int e(int i10, byte[] bArr) {
        int i11;
        synchronized (f15956c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        try {
                            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                                break;
                            }
                            i12++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f15957d;
                    if (iArr.length <= i13) {
                        f15957d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f15957d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f15957d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
