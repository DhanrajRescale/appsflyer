package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class p8 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26655a = 20;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26656b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26657c = 2;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r42, kotlin.jvm.functions.Function1 r43, g1.o r44, boolean r45, boolean r46, j2.g0 r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, boolean r52, p2.l0 r53, i0.p1 r54, i0.o1 r55, boolean r56, int r57, int r58, a0.l r59, n1.x0 r60, m0.s1 r61, t0.n r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.p8.a(java.lang.String, kotlin.jvm.functions.Function1, g1.o, boolean, boolean, j2.g0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, p2.l0, i0.p1, i0.o1, boolean, int, int, a0.l, n1.x0, m0.s1, t0.n, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    public static final void b(g1.o oVar, Function2 function2, Function2 function22, hu.c cVar, Function2 function23, Function2 function24, boolean z10, float f10, b0.h1 h1Var, t0.n nVar, int i10) {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r82;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2112507061);
        if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function22)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.j(cVar)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.j(function23)) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (rVar.j(function24)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        }
        if ((1572864 & i10) == 0) {
            if (rVar.i(z10)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((12582912 & i10) == 0) {
            if (rVar.e(f10)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        }
        if ((100663296 & i10) == 0) {
            if (rVar.h(h1Var)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((38347923 & i11) == 38347922 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(2075847260);
            if ((3670016 & i11) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((29360128 & i11) == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z11 | z12;
            if ((234881024 & i11) == 67108864) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = z16 | z13;
            Object Q = rVar.Q();
            if (z17 || Q == t0.m.f35080a) {
                Q = new r8(z10, f10, h1Var);
                rVar.k0(Q);
            }
            r8 r8Var = (r8) Q;
            rVar.s(false);
            w2.k kVar = (w2.k) rVar.m(d2.s1.f13626k);
            rVar.b0(-1323940314);
            int i21 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar);
            int i22 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            boolean z18 = rVar.f35166a instanceof t0.f;
            if (z18) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, r8Var, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i21))) {
                    nn.d.s(i21, rVar, i21, iVar3);
                }
                nn.d.q((i22 >> 3) & 112, j10, new t0.m2(rVar), rVar, 2058660585);
                rVar.b0(254820105);
                g1.g gVar = g1.a.f16383e;
                if (function23 != null) {
                    g1.o g10 = androidx.compose.ui.layout.a.i("Leading").g(m8.f26508d);
                    rVar.b0(733328855);
                    b0.v c10 = b0.s.c(gVar, false, rVar, 6);
                    rVar.b0(-1323940314);
                    int i23 = rVar.P;
                    t0.r1 o11 = rVar.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(g10);
                    if (z18) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c10, iVar);
                        t0.t.v0(rVar, o11, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i23))) {
                            nn.d.s(i23, rVar, i23, iVar3);
                        }
                        z14 = false;
                        nn.d.q(0, j11, new t0.m2(rVar), rVar, 2058660585);
                        com.google.android.gms.internal.p002firebaseauthapi.a.p((i11 >> 12) & 14, function23, rVar, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    z14 = false;
                }
                rVar.s(z14);
                rVar.b0(254820390);
                if (function24 != null) {
                    g1.o g11 = androidx.compose.ui.layout.a.i("Trailing").g(m8.f26508d);
                    rVar.b0(733328855);
                    b0.v c11 = b0.s.c(gVar, false, rVar, 6);
                    rVar.b0(-1323940314);
                    int i24 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(g11);
                    if (z18) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i24))) {
                            nn.d.s(i24, rVar, i24, iVar3);
                        }
                        r82 = 0;
                        nn.d.q(0, j12, new t0.m2(rVar), rVar, 2058660585);
                        com.google.android.gms.internal.p002firebaseauthapi.a.p((i11 >> 15) & 14, function24, rVar, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    r82 = 0;
                }
                rVar.s(r82);
                float h10 = androidx.compose.foundation.layout.a.h(h1Var, kVar);
                float g12 = androidx.compose.foundation.layout.a.g(h1Var, kVar);
                g1.l lVar = g1.l.f16404b;
                if (function23 != null) {
                    h10 = kotlin.ranges.d.a(h10 - m8.f26507c, (float) r82);
                }
                float f11 = h10;
                if (function24 != null) {
                    g12 = kotlin.ranges.d.a(g12 - m8.f26507c, 0);
                }
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f11, s0.g.f34069a, g12, s0.g.f34069a, 10);
                rVar.b0(254821401);
                if (cVar != null) {
                    cVar.b(androidx.compose.ui.layout.a.i("Hint").g(x10), rVar, Integer.valueOf((i11 >> 6) & 112));
                }
                rVar.s(false);
                rVar.b0(254821530);
                g1.g gVar2 = g1.a.f16379a;
                if (function22 != null) {
                    g1.o g13 = androidx.compose.ui.layout.a.i("Label").g(x10);
                    rVar.b0(733328855);
                    b0.v c12 = b0.s.c(gVar2, false, rVar, 0);
                    rVar.b0(-1323940314);
                    int i25 = rVar.P;
                    t0.r1 o13 = rVar.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(g13);
                    if (z18) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c12, iVar);
                        t0.t.v0(rVar, o13, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i25))) {
                            nn.d.s(i25, rVar, i25, iVar3);
                        }
                        z15 = false;
                        nn.d.q(0, j13, new t0.m2(rVar), rVar, 2058660585);
                        com.google.android.gms.internal.p002firebaseauthapi.a.p((i11 >> 6) & 14, function22, rVar, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    z15 = false;
                }
                rVar.s(z15);
                g1.o g14 = androidx.compose.ui.layout.a.i("TextField").g(x10);
                rVar.b0(733328855);
                b0.v c13 = b0.s.c(gVar2, true, rVar, 48);
                rVar.b0(-1323940314);
                int i26 = rVar.P;
                t0.r1 o14 = rVar.o();
                b1.c j14 = androidx.compose.ui.layout.a.j(g14);
                if (z18) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c13, iVar);
                    t0.t.v0(rVar, o14, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i26))) {
                        nn.d.s(i26, rVar, i26, iVar3);
                    }
                    nn.d.q(0, j14, new t0.m2(rVar), rVar, 2058660585);
                    com.google.android.gms.internal.p002firebaseauthapi.a.p((i11 >> 3) & 14, function2, rVar, false, true);
                    v.e.y(rVar, false, false, false, true);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new o8(oVar, function2, function22, cVar, function23, function24, z10, f10, h1Var, i10);
        }
    }

    public static final int c(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, b0.h1 h1Var) {
        float f11;
        float f12 = f26657c * f10;
        float c10 = h1Var.c() * f10;
        float a10 = h1Var.a() * f10;
        int max = Math.max(i10, i14);
        if (z10) {
            f11 = i11 + f12 + max + a10;
        } else {
            f11 = c10 + max + a10;
        }
        return Math.max(ku.c.b(f11), Math.max(Math.max(i12, i13), w2.a.i(j10)));
    }
}
