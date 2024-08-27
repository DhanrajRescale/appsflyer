package b7;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f3816v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3817a;

    /* renamed from: d, reason: collision with root package name */
    public final String f3820d;

    /* renamed from: e, reason: collision with root package name */
    public String f3821e;

    /* renamed from: f, reason: collision with root package name */
    public z5.b0 f3822f;

    /* renamed from: g, reason: collision with root package name */
    public z5.b0 f3823g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3827k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3828l;

    /* renamed from: o, reason: collision with root package name */
    public int f3831o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3832p;

    /* renamed from: r, reason: collision with root package name */
    public int f3834r;

    /* renamed from: t, reason: collision with root package name */
    public z5.b0 f3836t;

    /* renamed from: u, reason: collision with root package name */
    public long f3837u;

    /* renamed from: b, reason: collision with root package name */
    public final b5.m f3818b = new b5.m(new byte[7], 1, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f3819c = new e5.p(Arrays.copyOf(f3816v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f3824h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f3825i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f3826j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f3829m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f3830n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f3833q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f3835s = -9223372036854775807L;

    public f(boolean z10, String str) {
        this.f3817a = z10;
        this.f3820d = str;
    }

    @Override // b7.j
    public final void b(e5.p pVar) {
        int i10;
        int i11;
        byte b10;
        char c10;
        int i12;
        char c11;
        char c12;
        char c13;
        int i13;
        boolean z10;
        int i14;
        this.f3822f.getClass();
        int i15 = e5.x.f15050a;
        while (pVar.a() > 0) {
            int i16 = this.f3824h;
            char c14 = 65535;
            int i17 = 4;
            int i18 = 1;
            int i19 = 0;
            e5.p pVar2 = this.f3819c;
            b5.m mVar = this.f3818b;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                int min = Math.min(pVar.a(), this.f3834r - this.f3825i);
                                this.f3836t.c(min, pVar);
                                int i20 = this.f3825i + min;
                                this.f3825i = i20;
                                int i21 = this.f3834r;
                                if (i20 == i21) {
                                    long j10 = this.f3835s;
                                    if (j10 != -9223372036854775807L) {
                                        this.f3836t.b(j10, 1, i21, 0, null);
                                        this.f3835s += this.f3837u;
                                    }
                                    this.f3824h = 0;
                                    this.f3825i = 0;
                                    this.f3826j = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f3827k) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = mVar.f3433b;
                            int min2 = Math.min(pVar.a(), i10 - this.f3825i);
                            pVar.e(bArr, this.f3825i, min2);
                            int i22 = this.f3825i + min2;
                            this.f3825i = i22;
                            if (i22 == i10) {
                                mVar.p(0);
                                if (!this.f3832p) {
                                    int i23 = mVar.i(2) + 1;
                                    if (i23 != 2) {
                                        e5.m.f("AdtsReader", "Detected audio object type: " + i23 + ", but assuming AAC LC.");
                                        i23 = 2;
                                    }
                                    mVar.s(5);
                                    int i24 = mVar.i(3);
                                    int i25 = this.f3830n;
                                    byte[] bArr2 = {(byte) (((i23 << 3) & 248) | ((i25 >> 1) & 7)), (byte) (((i25 << 7) & 128) | ((i24 << 3) & 120))};
                                    e5.g f10 = z5.a.f(new b5.m(bArr2, 1, (Object) null), false);
                                    b5.u uVar = new b5.u();
                                    uVar.f3590a = this.f3821e;
                                    uVar.f3600k = "audio/mp4a-latm";
                                    uVar.f3597h = f10.f15019c;
                                    uVar.f3613x = f10.f15018b;
                                    uVar.f3614y = f10.f15017a;
                                    uVar.f3602m = Collections.singletonList(bArr2);
                                    uVar.f3592c = this.f3820d;
                                    b5.v vVar = new b5.v(uVar);
                                    this.f3833q = 1024000000 / vVar.f3666z;
                                    this.f3822f.e(vVar);
                                    this.f3832p = true;
                                } else {
                                    mVar.s(10);
                                }
                                mVar.s(4);
                                int i26 = mVar.i(13);
                                int i27 = i26 - 7;
                                if (this.f3827k) {
                                    i27 = i26 - 9;
                                }
                                z5.b0 b0Var = this.f3822f;
                                long j11 = this.f3833q;
                                this.f3824h = 4;
                                this.f3825i = 0;
                                this.f3836t = b0Var;
                                this.f3837u = j11;
                                this.f3834r = i27;
                            }
                        }
                    } else {
                        byte[] bArr3 = pVar2.f15036a;
                        int min3 = Math.min(pVar.a(), 10 - this.f3825i);
                        pVar.e(bArr3, this.f3825i, min3);
                        int i28 = this.f3825i + min3;
                        this.f3825i = i28;
                        if (i28 == 10) {
                            this.f3823g.c(10, pVar2);
                            pVar2.F(6);
                            z5.b0 b0Var2 = this.f3823g;
                            int t10 = pVar2.t() + 10;
                            this.f3824h = 4;
                            this.f3825i = 10;
                            this.f3836t = b0Var2;
                            this.f3837u = 0L;
                            this.f3834r = t10;
                        }
                    }
                } else if (pVar.a() != 0) {
                    mVar.f3433b[0] = pVar.f15036a[pVar.f15037b];
                    mVar.p(2);
                    int i29 = mVar.i(4);
                    int i30 = this.f3830n;
                    if (i30 != -1 && i29 != i30) {
                        this.f3828l = false;
                        this.f3824h = 0;
                        this.f3825i = 0;
                        this.f3826j = 256;
                    } else {
                        if (!this.f3828l) {
                            this.f3828l = true;
                            this.f3829m = this.f3831o;
                            this.f3830n = i29;
                        }
                        this.f3824h = 3;
                        this.f3825i = 0;
                    }
                }
            } else {
                byte[] bArr4 = pVar.f15036a;
                int i31 = pVar.f15037b;
                int i32 = pVar.f15038c;
                while (true) {
                    if (i31 < i32) {
                        i11 = i31 + 1;
                        b10 = bArr4[i31];
                        int i33 = b10 & 255;
                        if (this.f3826j == 512 && ((65280 | (((byte) i33) & 255)) & 65526) == 65520) {
                            if (this.f3828l) {
                                break;
                            }
                            int i34 = i31 - 1;
                            pVar.F(i31);
                            byte[] bArr5 = mVar.f3433b;
                            if (pVar.a() >= i18) {
                                pVar.e(bArr5, i19, i18);
                                mVar.p(i17);
                                int i35 = mVar.i(i18);
                                int i36 = this.f3829m;
                                if (i36 != -1 && i35 != i36) {
                                    c10 = 65535;
                                } else {
                                    if (this.f3830n != -1) {
                                        byte[] bArr6 = mVar.f3433b;
                                        if (pVar.a() < i18) {
                                            break;
                                        }
                                        pVar.e(bArr6, i19, i18);
                                        mVar.p(2);
                                        i14 = 4;
                                        if (mVar.i(4) == this.f3830n) {
                                            pVar.F(i11);
                                        }
                                    } else {
                                        i14 = 4;
                                    }
                                    byte[] bArr7 = mVar.f3433b;
                                    if (pVar.a() >= i14) {
                                        pVar.e(bArr7, i19, i14);
                                        mVar.p(14);
                                        int i37 = mVar.i(13);
                                        if (i37 >= 7) {
                                            byte[] bArr8 = pVar.f15036a;
                                            int i38 = pVar.f15038c;
                                            int i39 = i34 + i37;
                                            if (i39 < i38) {
                                                byte b11 = bArr8[i39];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i40 = i39 + 1;
                                                    if (i40 != i38) {
                                                        byte b12 = bArr8[i40];
                                                        if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i35) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i41 = i39 + 1;
                                                    if (i41 != i38) {
                                                        if (bArr8[i41] == 68) {
                                                            int i42 = i39 + 2;
                                                            if (i42 != i38) {
                                                                if (bArr8[i42] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i12 = 1;
                            }
                            c10 = 65535;
                            i12 = 1;
                        } else {
                            c10 = c14;
                            i12 = i18;
                        }
                        int i43 = this.f3826j;
                        int i44 = i33 | i43;
                        if (i44 != 329) {
                            if (i44 != 511) {
                                if (i44 != 836) {
                                    if (i44 != 1075) {
                                        c11 = 256;
                                        if (i43 != 256) {
                                            this.f3826j = 256;
                                            c12 = 2;
                                            c13 = 3;
                                            i13 = 0;
                                            i18 = i12;
                                            c14 = c10;
                                            i19 = i13;
                                            i17 = 4;
                                        } else {
                                            c12 = 2;
                                            c13 = 3;
                                            i13 = 0;
                                        }
                                    } else {
                                        this.f3824h = 2;
                                        this.f3825i = 3;
                                        this.f3834r = 0;
                                        pVar2.F(0);
                                        pVar.F(i11);
                                        break;
                                    }
                                } else {
                                    c11 = 256;
                                    c12 = 2;
                                    c13 = 3;
                                    i13 = 0;
                                    this.f3826j = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                }
                            } else {
                                c11 = 256;
                                c12 = 2;
                                c13 = 3;
                                i13 = 0;
                                this.f3826j = 512;
                            }
                        } else {
                            c11 = 256;
                            c12 = 2;
                            c13 = 3;
                            i13 = 0;
                            this.f3826j = 768;
                        }
                        i31 = i11;
                        i18 = i12;
                        c14 = c10;
                        i19 = i13;
                        i17 = 4;
                    } else {
                        pVar.F(i31);
                        break;
                    }
                }
                this.f3831o = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f3827k = z10;
                if (!this.f3828l) {
                    this.f3824h = 1;
                    this.f3825i = 0;
                } else {
                    this.f3824h = 3;
                    this.f3825i = 0;
                }
                pVar.F(i11);
            }
        }
    }

    @Override // b7.j
    public final void d() {
        this.f3835s = -9223372036854775807L;
        this.f3828l = false;
        this.f3824h = 0;
        this.f3825i = 0;
        this.f3826j = 256;
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f3835s = j10;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3821e = h0Var.f3873e;
        h0Var.b();
        z5.b0 f10 = rVar.f(h0Var.f3872d, 1);
        this.f3822f = f10;
        this.f3836t = f10;
        if (this.f3817a) {
            h0Var.a();
            h0Var.b();
            z5.b0 f11 = rVar.f(h0Var.f3872d, 5);
            this.f3823g = f11;
            b5.u uVar = new b5.u();
            h0Var.b();
            uVar.f3590a = h0Var.f3873e;
            uVar.f3600k = "application/id3";
            f11.e(new b5.v(uVar));
            return;
        }
        this.f3823g = new z5.o();
    }
}
