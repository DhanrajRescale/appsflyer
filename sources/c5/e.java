package c5;

import java.util.Arrays;
import yk.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f7964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7965b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7966c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7967d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7968e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7969f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7970g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7971h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f7972i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f7973j;

    /* renamed from: k, reason: collision with root package name */
    public int f7974k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f7975l;

    /* renamed from: m, reason: collision with root package name */
    public int f7976m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f7977n;

    /* renamed from: o, reason: collision with root package name */
    public int f7978o;

    /* renamed from: p, reason: collision with root package name */
    public int f7979p;

    /* renamed from: q, reason: collision with root package name */
    public int f7980q;

    /* renamed from: r, reason: collision with root package name */
    public int f7981r;

    /* renamed from: s, reason: collision with root package name */
    public int f7982s;

    /* renamed from: t, reason: collision with root package name */
    public int f7983t;

    /* renamed from: u, reason: collision with root package name */
    public int f7984u;

    /* renamed from: v, reason: collision with root package name */
    public int f7985v;

    public e(float f10, float f11, int i10, int i11, int i12) {
        this.f7964a = i10;
        this.f7965b = i11;
        this.f7966c = f10;
        this.f7967d = f11;
        this.f7968e = i10 / i12;
        this.f7969f = i10 / 400;
        int i13 = i10 / 65;
        this.f7970g = i13;
        int i14 = i13 * 2;
        this.f7971h = i14;
        this.f7972i = new short[i14];
        this.f7973j = new short[i14 * i11];
        this.f7975l = new short[i14 * i11];
        this.f7977n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f7975l, this.f7976m, i11);
        this.f7975l = c10;
        int i12 = this.f7965b;
        System.arraycopy(sArr, i10 * i12, c10, this.f7976m * i12, i12 * i11);
        this.f7976m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f7971h / i11;
        int i13 = this.f7965b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f7972i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f7965b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f7965b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f7984u = i15 / i16;
        this.f7985v = i17 / i14;
        return i16;
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22 = this.f7976m;
        float f11 = this.f7966c;
        float f12 = this.f7967d;
        float f13 = f11 / f12;
        float f14 = this.f7968e * f12;
        double d10 = f13;
        int i23 = this.f7964a;
        int i24 = this.f7965b;
        int i25 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f7973j, 0, this.f7974k);
            this.f7974k = 0;
        } else {
            int i26 = this.f7974k;
            int i27 = this.f7971h;
            if (i26 >= i27) {
                int i28 = 0;
                while (true) {
                    int i29 = this.f7981r;
                    if (i29 > 0) {
                        int min = Math.min(i27, i29);
                        a(this.f7973j, i28, min);
                        this.f7981r -= min;
                        i28 += min;
                        i12 = i22;
                        f10 = f14;
                        i11 = i23;
                    } else {
                        short[] sArr = this.f7973j;
                        if (i23 > 4000) {
                            i10 = i23 / 4000;
                        } else {
                            i10 = i25;
                        }
                        int i30 = this.f7970g;
                        int i31 = this.f7969f;
                        if (i24 == i25 && i10 == i25) {
                            i13 = d(sArr, i28, i31, i30);
                            i12 = i22;
                            f10 = f14;
                            i11 = i23;
                        } else {
                            b(sArr, i28, i10);
                            i11 = i23;
                            i12 = i22;
                            short[] sArr2 = this.f7972i;
                            f10 = f14;
                            int d11 = d(sArr2, 0, i31 / i10, i30 / i10);
                            if (i10 != 1) {
                                int i32 = d11 * i10;
                                int i33 = i10 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                if (i34 >= i31) {
                                    i31 = i34;
                                }
                                if (i35 <= i30) {
                                    i30 = i35;
                                }
                                if (i24 == 1) {
                                    i13 = d(sArr, i28, i31, i30);
                                } else {
                                    b(sArr, i28, 1);
                                    i13 = d(sArr2, 0, i31, i30);
                                }
                            } else {
                                i13 = d11;
                            }
                        }
                        int i36 = this.f7984u;
                        int i37 = this.f7985v;
                        if (i36 == 0 || (i14 = this.f7982s) == 0 || i37 > i36 * 3 || i36 * 2 <= this.f7983t * 3) {
                            i14 = i13;
                        }
                        this.f7983t = i36;
                        this.f7982s = i13;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f7973j;
                            if (f13 >= 2.0f) {
                                i16 = (int) (i14 / (f13 - 1.0f));
                            } else {
                                this.f7981r = (int) (((2.0f - f13) * i14) / (f13 - 1.0f));
                                i16 = i14;
                            }
                            short[] c10 = c(this.f7975l, this.f7976m, i16);
                            this.f7975l = c10;
                            int i38 = i28;
                            e(i16, this.f7965b, c10, this.f7976m, sArr3, i38, sArr3, i28 + i14);
                            this.f7976m += i16;
                            i28 = i14 + i16 + i38;
                        } else {
                            int i39 = i28;
                            short[] sArr4 = this.f7973j;
                            if (f13 < 0.5f) {
                                i15 = (int) ((i14 * f13) / (1.0f - f13));
                            } else {
                                this.f7981r = (int) ((((2.0f * f13) - 1.0f) * i14) / (1.0f - f13));
                                i15 = i14;
                            }
                            int i40 = i14 + i15;
                            short[] c11 = c(this.f7975l, this.f7976m, i40);
                            this.f7975l = c11;
                            System.arraycopy(sArr4, i39 * i24, c11, this.f7976m * i24, i14 * i24);
                            e(i15, this.f7965b, this.f7975l, this.f7976m + i14, sArr4, i39 + i14, sArr4, i39);
                            this.f7976m += i40;
                            i28 = i39 + i15;
                        }
                    }
                    if (i28 + i27 > i26) {
                        break;
                    }
                    i23 = i11;
                    i22 = i12;
                    f14 = f10;
                    i25 = 1;
                }
                int i41 = this.f7974k - i28;
                short[] sArr5 = this.f7973j;
                System.arraycopy(sArr5, i28 * i24, sArr5, 0, i41 * i24);
                this.f7974k = i41;
                if (f10 == 1.0f && this.f7976m != (i17 = i12)) {
                    int i42 = i11;
                    int i43 = (int) (i42 / f10);
                    int i44 = i42;
                    while (true) {
                        if (i43 <= 16384 && i44 <= 16384) {
                            break;
                        }
                        i43 /= 2;
                        i44 /= 2;
                    }
                    int i45 = this.f7976m - i17;
                    short[] c12 = c(this.f7977n, this.f7978o, i45);
                    this.f7977n = c12;
                    System.arraycopy(this.f7975l, i17 * i24, c12, this.f7978o * i24, i45 * i24);
                    this.f7976m = i17;
                    this.f7978o += i45;
                    int i46 = 0;
                    while (true) {
                        i18 = this.f7978o;
                        i19 = i18 - 1;
                        if (i46 >= i19) {
                            break;
                        }
                        while (true) {
                            i20 = this.f7979p + 1;
                            int i47 = i20 * i43;
                            i21 = this.f7980q;
                            if (i47 <= i21 * i44) {
                                break;
                            }
                            this.f7975l = c(this.f7975l, this.f7976m, 1);
                            for (int i48 = 0; i48 < i24; i48++) {
                                short[] sArr6 = this.f7975l;
                                int i49 = (this.f7976m * i24) + i48;
                                short[] sArr7 = this.f7977n;
                                int i50 = (i46 * i24) + i48;
                                short s7 = sArr7[i50];
                                short s10 = sArr7[i50 + i24];
                                int i51 = this.f7980q * i44;
                                int i52 = this.f7979p;
                                int i53 = i52 * i43;
                                int i54 = (i52 + 1) * i43;
                                int i55 = i54 - i51;
                                int i56 = i54 - i53;
                                sArr6[i49] = (short) ((((i56 - i55) * s10) + (s7 * i55)) / i56);
                            }
                            this.f7980q++;
                            this.f7976m++;
                        }
                        this.f7979p = i20;
                        if (i20 == i44) {
                            this.f7979p = 0;
                            if (i21 == i43) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            j.H0(z10);
                            this.f7980q = 0;
                        }
                        i46++;
                    }
                    if (i19 != 0) {
                        short[] sArr8 = this.f7977n;
                        System.arraycopy(sArr8, i19 * i24, sArr8, 0, (i18 - i19) * i24);
                        this.f7978o -= i19;
                        return;
                    }
                    return;
                }
            }
        }
        i12 = i22;
        f10 = f14;
        i11 = i23;
        if (f10 == 1.0f) {
        }
    }
}
