package r0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.n1 f32669a = t0.t.n0(Boolean.TRUE, t0.o3.f35116a);

    /* renamed from: b, reason: collision with root package name */
    public static final t0.m3 f32670b = new t0.a0(m0.f32578g);

    /* renamed from: c, reason: collision with root package name */
    public static final float f32671c = 16;

    public static final void a(int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1307205667);
        if ((i11 & 6) == 0) {
            if (rVar.f(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.j(function2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(cVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(function22)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function23)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.j(function24)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((i12 & 599187) == 599186 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(1646578117);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z10 | z11;
            if ((458752 & i12) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((57344 & i12) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((i12 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            if ((3670016 & i12) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z20 | z15;
            if ((i12 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z22 = z21 | z16;
            Object Q = rVar.Q();
            if (z22 || Q == t0.m.f35080a) {
                Q = new l2(function2, function22, function23, i10, x1Var, function24, cVar, 0);
                rVar.k0(Q);
            }
            rVar.s(false);
            a2.g1.b(null, (Function2) Q, rVar, 0, 1);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new m2(i10, function2, cVar, function22, function23, x1Var, function24, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(g1.o r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function2 r33, int r34, long r35, long r37, b0.x1 r39, hu.c r40, t0.n r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.p2.b(g1.o, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, b0.x1, hu.c, t0.n, int, int):void");
    }

    public static final void c(int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2037614249);
        if ((i11 & 6) == 0) {
            if (rVar.f(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.j(function2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(cVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(function22)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function23)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.j(function24)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((i12 & 599187) == 599186 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-273325894);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z10 | z11;
            if ((458752 & i12) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((57344 & i12) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((i12 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            if ((3670016 & i12) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z20 | z15;
            if ((i12 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z22 = z21 | z16;
            Object Q = rVar.Q();
            if (z22 || Q == t0.m.f35080a) {
                Q = new l2(function2, function22, function23, i10, x1Var, function24, cVar, 1);
                rVar.k0(Q);
            }
            rVar.s(false);
            a2.g1.b(null, (Function2) Q, rVar, 0, 1);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new m2(i10, function2, cVar, function22, function23, x1Var, function24, i11, 2);
        }
    }

    public static final void d(int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-975511942);
        if ((i11 & 6) == 0) {
            if (rVar.f(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.j(function2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(cVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(function22)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function23)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.j(function24)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((599187 & i12) == 599186 && rVar.G()) {
            rVar.V();
        } else if (((Boolean) f32669a.getValue()).booleanValue()) {
            rVar.b0(-915303637);
            c(i10, function2, cVar, function22, function23, x1Var, function24, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            rVar.s(false);
        } else {
            rVar.b0(-915303332);
            a(i10, function2, cVar, function22, function23, x1Var, function24, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
            rVar.s(false);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new m2(i10, function2, cVar, function22, function23, x1Var, function24, i11, 1);
        }
    }
}
