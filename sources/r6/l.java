package r6;

import androidx.media3.common.ParserException;
import b5.m;
import b5.q0;
import b5.u;
import b5.v;
import e5.p;
import java.util.ArrayList;
import java.util.Arrays;
import lp.o0;
import z5.d0;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: n, reason: collision with root package name */
    public k f33401n;

    /* renamed from: o, reason: collision with root package name */
    public int f33402o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33403p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f33404q;

    /* renamed from: r, reason: collision with root package name */
    public l0.j f33405r;

    @Override // r6.j
    public final void a(long j10) {
        boolean z10;
        this.f33389g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33403p = z10;
        d0 d0Var = this.f33404q;
        if (d0Var != null) {
            i10 = d0Var.f42071e;
        }
        this.f33402o = i10;
    }

    @Override // r6.j
    public final long b(p pVar) {
        int i10;
        int i11 = 0;
        byte b10 = pVar.f15036a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f33401n;
        yk.j.I0(kVar);
        boolean z10 = kVar.f33399d[(b10 >> 1) & (255 >>> (8 - kVar.f33400e))].f14236a;
        d0 d0Var = kVar.f33396a;
        if (!z10) {
            i10 = d0Var.f42071e;
        } else {
            i10 = d0Var.f42072f;
        }
        if (this.f33403p) {
            i11 = (this.f33402o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = pVar.f15036a;
        int length = bArr.length;
        int i12 = pVar.f15038c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            pVar.D(copyOf.length, copyOf);
        } else {
            pVar.E(i12);
        }
        byte[] bArr2 = pVar.f15036a;
        int i13 = pVar.f15038c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f33403p = true;
        this.f33402o = i10;
        return j10;
    }

    @Override // r6.j
    public final boolean c(p pVar, long j10, tr.e eVar) {
        int i10;
        int i11;
        long j11;
        int i12;
        int i13;
        if (this.f33401n != null) {
            ((v) eVar.f36361b).getClass();
            return false;
        }
        d0 d0Var = this.f33404q;
        k kVar = null;
        int i14 = 4;
        if (d0Var == null) {
            e5.a.u(1, pVar, false);
            pVar.m();
            int u10 = pVar.u();
            int m10 = pVar.m();
            int i15 = pVar.i();
            if (i15 <= 0) {
                i12 = -1;
            } else {
                i12 = i15;
            }
            int i16 = pVar.i();
            if (i16 <= 0) {
                i13 = -1;
            } else {
                i13 = i16;
            }
            pVar.i();
            int u11 = pVar.u();
            int pow = (int) Math.pow(2.0d, u11 & 15);
            int pow2 = (int) Math.pow(2.0d, (u11 & 240) >> 4);
            pVar.u();
            this.f33404q = new d0(u10, m10, i12, i13, pow, pow2, Arrays.copyOf(pVar.f15036a, pVar.f15038c));
        } else {
            l0.j jVar = this.f33405r;
            if (jVar == null) {
                this.f33405r = e5.a.t(pVar, true, true);
            } else {
                int i17 = pVar.f15038c;
                byte[] bArr = new byte[i17];
                System.arraycopy(pVar.f15036a, 0, bArr, 0, i17);
                int i18 = 5;
                e5.a.u(5, pVar, false);
                int u12 = pVar.u() + 1;
                m mVar = new m(pVar.f15036a, 3, (Object) null);
                mVar.s(pVar.f15037b * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = 16;
                    if (i19 < u12) {
                        if (mVar.i(24) == 5653314) {
                            int i22 = mVar.i(16);
                            int i23 = mVar.i(24);
                            if (!mVar.h()) {
                                boolean h10 = mVar.h();
                                for (int i24 = 0; i24 < i23; i24++) {
                                    if (h10) {
                                        if (mVar.h()) {
                                            mVar.s(5);
                                        }
                                    } else {
                                        mVar.s(5);
                                    }
                                }
                            } else {
                                mVar.s(5);
                                for (int i25 = 0; i25 < i23; i25 += mVar.i(e5.a.l(i23 - i25))) {
                                }
                            }
                            int i26 = mVar.i(4);
                            if (i26 <= 2) {
                                if (i26 == 1 || i26 == 2) {
                                    mVar.s(32);
                                    mVar.s(32);
                                    int i27 = mVar.i(4) + 1;
                                    mVar.s(1);
                                    if (i26 == 1) {
                                        if (i22 != 0) {
                                            j11 = (long) Math.floor(Math.pow(i23, 1.0d / i22));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = i22 * i23;
                                    }
                                    mVar.s((int) (j11 * i27));
                                }
                                i19++;
                            } else {
                                throw ParserException.a("lookup type greater than 2 not decodable: " + i26, null);
                            }
                        } else {
                            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + mVar.g(), null);
                        }
                    } else {
                        int i28 = 6;
                        int i29 = mVar.i(6) + 1;
                        for (int i30 = 0; i30 < i29; i30++) {
                            if (mVar.i(16) != 0) {
                                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i31 = mVar.i(6) + 1;
                        int i32 = 0;
                        while (i32 < i31) {
                            int i33 = mVar.i(i21);
                            if (i33 != 0) {
                                if (i33 == 1) {
                                    int i34 = mVar.i(i18);
                                    int[] iArr = new int[i34];
                                    int i35 = -1;
                                    for (int i36 = 0; i36 < i34; i36++) {
                                        int i37 = mVar.i(i14);
                                        iArr[i36] = i37;
                                        if (i37 > i35) {
                                            i35 = i37;
                                        }
                                    }
                                    int i38 = i35 + 1;
                                    int[] iArr2 = new int[i38];
                                    int i39 = 0;
                                    while (i39 < i38) {
                                        iArr2[i39] = mVar.i(3) + 1;
                                        int i40 = mVar.i(i20);
                                        if (i40 > 0) {
                                            mVar.s(8);
                                        }
                                        int i41 = i38;
                                        for (int i42 = 0; i42 < (1 << i40); i42++) {
                                            mVar.s(8);
                                        }
                                        i39++;
                                        i38 = i41;
                                        i20 = 2;
                                    }
                                    mVar.s(i20);
                                    int i43 = mVar.i(4);
                                    int i44 = 0;
                                    int i45 = 0;
                                    for (int i46 = 0; i46 < i34; i46++) {
                                        i44 += iArr2[iArr[i46]];
                                        while (i45 < i44) {
                                            mVar.s(i43);
                                            i45++;
                                        }
                                    }
                                } else {
                                    throw ParserException.a("floor type greater than 1 not decodable: " + i33, null);
                                }
                            } else {
                                int i47 = 8;
                                mVar.s(8);
                                mVar.s(16);
                                mVar.s(16);
                                mVar.s(6);
                                mVar.s(8);
                                int i48 = mVar.i(4) + 1;
                                int i49 = 0;
                                while (i49 < i48) {
                                    mVar.s(i47);
                                    i49++;
                                    i47 = 8;
                                }
                            }
                            i32++;
                            i28 = 6;
                            i14 = 4;
                            i20 = 2;
                            i18 = 5;
                            i21 = 16;
                        }
                        int i50 = mVar.i(i28) + 1;
                        int i51 = 0;
                        while (i51 < i50) {
                            if (mVar.i(16) <= 2) {
                                mVar.s(24);
                                mVar.s(24);
                                mVar.s(24);
                                int i52 = mVar.i(i28) + 1;
                                int i53 = 8;
                                mVar.s(8);
                                int[] iArr3 = new int[i52];
                                for (int i54 = 0; i54 < i52; i54++) {
                                    int i55 = mVar.i(3);
                                    if (mVar.h()) {
                                        i11 = mVar.i(5);
                                    } else {
                                        i11 = 0;
                                    }
                                    iArr3[i54] = (i11 * 8) + i55;
                                }
                                int i56 = 0;
                                while (i56 < i52) {
                                    int i57 = 0;
                                    while (i57 < i53) {
                                        if ((iArr3[i56] & (1 << i57)) != 0) {
                                            mVar.s(i53);
                                        }
                                        i57++;
                                        i53 = 8;
                                    }
                                    i56++;
                                    i53 = 8;
                                }
                                i51++;
                                i28 = 6;
                            } else {
                                throw ParserException.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int i58 = mVar.i(i28) + 1;
                        for (int i59 = 0; i59 < i58; i59++) {
                            int i60 = mVar.i(16);
                            if (i60 != 0) {
                                e5.m.c("VorbisUtil", "mapping type other than 0 not supported: " + i60);
                            } else {
                                if (mVar.h()) {
                                    i10 = mVar.i(4) + 1;
                                } else {
                                    i10 = 1;
                                }
                                boolean h11 = mVar.h();
                                int i61 = d0Var.f42067a;
                                if (h11) {
                                    int i62 = mVar.i(8) + 1;
                                    for (int i63 = 0; i63 < i62; i63++) {
                                        int i64 = i61 - 1;
                                        mVar.s(e5.a.l(i64));
                                        mVar.s(e5.a.l(i64));
                                    }
                                }
                                if (mVar.i(2) == 0) {
                                    if (i10 > 1) {
                                        for (int i65 = 0; i65 < i61; i65++) {
                                            mVar.s(4);
                                        }
                                    }
                                    for (int i66 = 0; i66 < i10; i66++) {
                                        mVar.s(8);
                                        mVar.s(8);
                                        mVar.s(8);
                                    }
                                } else {
                                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                        }
                        int i67 = mVar.i(6);
                        int i68 = i67 + 1;
                        d9.j[] jVarArr = new d9.j[i68];
                        for (int i69 = 0; i69 < i68; i69++) {
                            boolean h12 = mVar.h();
                            mVar.i(16);
                            mVar.i(16);
                            mVar.i(8);
                            jVarArr[i69] = new d9.j(h12);
                        }
                        if (mVar.h()) {
                            kVar = new k(d0Var, jVar, bArr, jVarArr, e5.a.l(i67));
                        } else {
                            throw ParserException.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        this.f33401n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        d0 d0Var2 = kVar.f33396a;
        arrayList.add(d0Var2.f42073g);
        arrayList.add(kVar.f33398c);
        q0 r10 = e5.a.r(o0.r((String[]) kVar.f33397b.f23775c));
        u uVar = new u();
        uVar.f3600k = "audio/vorbis";
        uVar.f3595f = d0Var2.f42070d;
        uVar.f3596g = d0Var2.f42069c;
        uVar.f3613x = d0Var2.f42067a;
        uVar.f3614y = d0Var2.f42068b;
        uVar.f3602m = arrayList;
        uVar.f3598i = r10;
        eVar.f36361b = new v(uVar);
        return true;
    }

    @Override // r6.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f33401n = null;
            this.f33404q = null;
            this.f33405r = null;
        }
        this.f33402o = 0;
        this.f33403p = false;
    }
}
