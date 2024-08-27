package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static final g8 f26217a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f26218b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26219c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26220d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26221e = 2;

    public static g1.o d(g1.o oVar, boolean z10, boolean z11, a0.l lVar, s1 s1Var) {
        return t0.t.H(oVar, d2.s.f13613k, new f8(z10, z11, lVar, s1Var, f26221e, f26220d));
    }

    public static s1 e(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1762667317);
        long c10 = n1.t.c(((n1.t) rVar.m(e1.f26084a)).f28179a, ((Number) rVar.m(d1.f26028a)).floatValue());
        long c11 = n1.t.c(c10, vl.b.r(rVar));
        long j10 = n1.t.f28176h;
        t0.m3 m3Var = x0.f27075a;
        long c12 = ((v0) rVar.m(m3Var)).c();
        long a10 = ((v0) rVar.m(m3Var)).a();
        long c13 = n1.t.c(((v0) rVar.m(m3Var)).c(), vl.b.u(rVar));
        long c14 = n1.t.c(((v0) rVar.m(m3Var)).b(), vl.b.r(rVar));
        long c15 = n1.t.c(c14, vl.b.r(rVar));
        long a11 = ((v0) rVar.m(m3Var)).a();
        long c16 = n1.t.c(((v0) rVar.m(m3Var)).b(), 0.54f);
        long c17 = n1.t.c(c16, vl.b.r(rVar));
        long c18 = n1.t.c(((v0) rVar.m(m3Var)).b(), 0.54f);
        long c19 = n1.t.c(c18, vl.b.r(rVar));
        long a12 = ((v0) rVar.m(m3Var)).a();
        long c20 = n1.t.c(((v0) rVar.m(m3Var)).c(), vl.b.u(rVar));
        long c21 = n1.t.c(((v0) rVar.m(m3Var)).b(), vl.b.w(rVar));
        long c22 = n1.t.c(c21, vl.b.r(rVar));
        long a13 = ((v0) rVar.m(m3Var)).a();
        long c23 = n1.t.c(((v0) rVar.m(m3Var)).b(), vl.b.w(rVar));
        s1 s1Var = new s1(c10, c11, c12, a10, c13, c14, a11, c15, c16, c17, c16, c18, c19, a12, j10, c20, c21, c22, a13, c23, n1.t.c(c23, vl.b.r(rVar)));
        rVar.s(false);
        return s1Var;
    }

    public static s1 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, t0.n nVar, int i10) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(231892599);
        if ((i10 & 1) != 0) {
            j17 = n1.t.c(((n1.t) rVar.m(e1.f26084a)).f28179a, ((Number) rVar.m(d1.f26028a)).floatValue());
        } else {
            j17 = j10;
        }
        if ((i10 & 2) != 0) {
            j18 = n1.t.c(j17, vl.b.r(rVar));
        } else {
            j18 = 0;
        }
        if ((i10 & 4) != 0) {
            j19 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), 0.12f);
        } else {
            j19 = j11;
        }
        if ((i10 & 8) != 0) {
            j20 = ((v0) rVar.m(x0.f27075a)).c();
        } else {
            j20 = j12;
        }
        if ((i10 & 16) != 0) {
            j21 = ((v0) rVar.m(x0.f27075a)).a();
        } else {
            j21 = 0;
        }
        if ((i10 & 32) != 0) {
            j22 = n1.t.c(((v0) rVar.m(x0.f27075a)).c(), vl.b.u(rVar));
        } else {
            j22 = j13;
        }
        if ((i10 & 64) != 0) {
            j23 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), 0.42f);
        } else {
            j23 = j14;
        }
        if ((i10 & 128) != 0) {
            j24 = n1.t.c(j23, vl.b.r(rVar));
        } else {
            j24 = j15;
        }
        if ((i10 & 256) != 0) {
            j25 = ((v0) rVar.m(x0.f27075a)).a();
        } else {
            j25 = 0;
        }
        if ((i10 & 512) != 0) {
            j26 = j23;
            j27 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), 0.54f);
        } else {
            j26 = j23;
            j27 = 0;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            j28 = n1.t.c(j27, vl.b.r(rVar));
        } else {
            j28 = 0;
        }
        if ((i10 & 2048) != 0) {
            j29 = j27;
        } else {
            j29 = 0;
        }
        if ((i10 & 4096) != 0) {
            j30 = j27;
            j31 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), 0.54f);
        } else {
            j30 = j27;
            j31 = 0;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            j32 = n1.t.c(j31, vl.b.r(rVar));
        } else {
            j32 = 0;
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            j33 = ((v0) rVar.m(x0.f27075a)).a();
        } else {
            j33 = 0;
        }
        if ((32768 & i10) != 0) {
            j34 = j31;
            j35 = n1.t.c(((v0) rVar.m(x0.f27075a)).c(), vl.b.u(rVar));
        } else {
            j34 = j31;
            j35 = 0;
        }
        if ((65536 & i10) != 0) {
            j36 = j35;
            j37 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), vl.b.w(rVar));
        } else {
            j36 = j35;
            j37 = 0;
        }
        if ((131072 & i10) != 0) {
            j38 = n1.t.c(j37, vl.b.r(rVar));
        } else {
            j38 = 0;
        }
        if ((262144 & i10) != 0) {
            j39 = ((v0) rVar.m(x0.f27075a)).a();
        } else {
            j39 = 0;
        }
        if ((524288 & i10) != 0) {
            j40 = j37;
            j41 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), vl.b.w(rVar));
        } else {
            j40 = j37;
            j41 = j16;
        }
        if ((i10 & 1048576) != 0) {
            j42 = n1.t.c(j41, vl.b.r(rVar));
        } else {
            j42 = 0;
        }
        s1 s1Var = new s1(j17, j18, j20, j21, j22, j26, j25, j24, j30, j28, j29, j34, j32, j33, j19, j36, j40, j38, j39, j41, j42);
        rVar.s(false);
        return s1Var;
    }

    public final void a(boolean z10, boolean z11, a0.k kVar, s1 s1Var, n1.x0 x0Var, float f10, float f11, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n1.x0 x0Var2;
        float f12;
        float f13;
        int i17;
        float f14;
        n1.x0 x0Var3;
        float f15;
        int i18;
        int i19;
        int i20;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(943754022);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.i(z11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.h(kVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.h(s1Var)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                x0Var2 = x0Var;
                if (rVar.h(x0Var2)) {
                    i20 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i12 |= i20;
                }
            } else {
                x0Var2 = x0Var;
            }
            i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i20;
        } else {
            x0Var2 = x0Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f12 = f10;
                if (rVar.e(f12)) {
                    i19 = 131072;
                    i12 |= i19;
                }
            } else {
                f12 = f10;
            }
            i19 = 65536;
            i12 |= i19;
        } else {
            f12 = f10;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f13 = f11;
                if (rVar.e(f13)) {
                    i18 = 1048576;
                    i12 |= i18;
                }
            } else {
                f13 = f11;
            }
            i18 = 524288;
            i12 |= i18;
        } else {
            f13 = f11;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (rVar.h(this)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((4793491 & i12) == 4793490 && rVar.G()) {
            rVar.V();
            x0Var3 = x0Var2;
            f15 = f12;
            f14 = f13;
        } else {
            rVar.X();
            if ((i10 & 1) != 0 && !rVar.E()) {
                rVar.V();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
            } else {
                if ((i11 & 16) != 0) {
                    x0Var2 = ((e6) rVar.m(f6.f26169a)).f26103a;
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f12 = f26221e;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    f13 = f26220d;
                }
            }
            n1.x0 x0Var4 = x0Var2;
            float f16 = f12;
            f14 = f13;
            rVar.t();
            int i21 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i22 = i12 >> 3;
            x.d0 d0Var = (x.d0) pp.b.m(z10, z11, kVar, s1Var, f16, f14, rVar, i21 | (57344 & i22) | (i22 & 458752)).getValue();
            b0.s.a(androidx.compose.foundation.a.h(d0Var.f39525a, g1.l.f16404b, d0Var.f39526b, x0Var4), rVar, 0);
            x0Var3 = x0Var4;
            f15 = f16;
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b8(this, z10, z11, kVar, s1Var, x0Var3, f15, f14, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r31, kotlin.jvm.functions.Function2 r32, boolean r33, boolean r34, p2.l0 r35, a0.k r36, boolean r37, kotlin.jvm.functions.Function2 r38, kotlin.jvm.functions.Function2 r39, kotlin.jvm.functions.Function2 r40, kotlin.jvm.functions.Function2 r41, m0.s1 r42, b0.h1 r43, kotlin.jvm.functions.Function2 r44, t0.n r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g8.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, p2.l0, a0.k, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m0.s1, b0.h1, kotlin.jvm.functions.Function2, t0.n, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r38, kotlin.jvm.functions.Function2 r39, boolean r40, boolean r41, p2.l0 r42, a0.k r43, boolean r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, m0.s1 r49, b0.h1 r50, t0.n r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g8.c(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, p2.l0, a0.k, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m0.s1, b0.h1, t0.n, int, int, int):void");
    }
}
