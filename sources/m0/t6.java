package m0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t6 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f26851c;

    /* renamed from: f, reason: collision with root package name */
    public static final float f26854f;

    /* renamed from: a, reason: collision with root package name */
    public static final float f26849a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26850b = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26852d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26853e = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final float f26855g = 12;

    /* renamed from: h, reason: collision with root package name */
    public static final float f26856h = 48;

    /* renamed from: i, reason: collision with root package name */
    public static final float f26857i = 68;

    static {
        float f10 = 8;
        f26851c = f10;
        f26854f = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r16, boolean r17, n1.x0 r18, long r19, long r21, long r23, float r25, t0.n r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.t6.a(g1.o, boolean, n1.x0, long, long, long, float, t0.n, int, int):void");
    }

    public static final void b(Function2 function2, Function2 function22, t0.n nVar, int i10) {
        int i11;
        g1.o oVar;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1229075900);
        if ((i10 & 6) == 0) {
            if (rVar.j(function2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function22)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
            i12 = 0;
        } else {
            g1.o oVar2 = g1.l.f16404b;
            g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
            float f10 = f26850b;
            float f11 = f26851c;
            g1.o x10 = androidx.compose.foundation.layout.a.x(e10, f10, s0.g.f34069a, f11, f26852d, 2);
            rVar.b0(-483455358);
            b0.l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar3);
                }
                nn.d.q(0, j10, new t0.m2(rVar), rVar, 2058660585);
                float f12 = f26849a;
                if (!w2.e.a(f12, Float.NaN)) {
                    oVar = androidx.compose.foundation.layout.a.y(a2.d.f47a, f12, s0.g.f34069a, 4);
                } else {
                    oVar = oVar2;
                }
                float f13 = f26855g;
                if (!w2.e.a(f13, Float.NaN)) {
                    oVar2 = androidx.compose.foundation.layout.a.y(a2.d.f48b, s0.g.f34069a, f13, 2);
                }
                g1.o x11 = androidx.compose.foundation.layout.a.x(oVar.g(oVar2), s0.g.f34069a, s0.g.f34069a, f11, s0.g.f34069a, 11);
                rVar.b0(733328855);
                g1.g gVar = g1.a.f16379a;
                b0.v c10 = b0.s.c(gVar, false, rVar, 0);
                rVar.b0(-1323940314);
                int i16 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(x11);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar, i16, iVar3);
                    }
                    nn.d.q(0, j11, new t0.m2(rVar), rVar, 2058660585);
                    com.google.android.gms.internal.p002firebaseauthapi.a.p(i11 & 14, function2, rVar, false, true);
                    rVar.s(false);
                    rVar.s(false);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(g1.a.f16393o);
                    rVar.b0(733328855);
                    b0.v c11 = b0.s.c(gVar, false, rVar, 0);
                    rVar.b0(-1323940314);
                    int i17 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(horizontalAlignElement);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                            nn.d.s(i17, rVar, i17, iVar3);
                        }
                        i12 = 0;
                        nn.d.q(0, j12, new t0.m2(rVar), rVar, 2058660585);
                        com.google.android.gms.internal.p002firebaseauthapi.a.p((i11 >> 3) & 14, function22, rVar, false, true);
                        v.e.y(rVar, false, false, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
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
            w10.f35245d = new m6(function2, function22, i10, i12);
        }
    }

    public static final void c(Function2 function2, Function2 function22, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-534813202);
        if ((i10 & 6) == 0) {
            if (rVar.j(function2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function22)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
            i12 = 1;
        } else {
            g1.o x10 = androidx.compose.foundation.layout.a.x(g1.l.f16404b, f26850b, s0.g.f34069a, f26851c, s0.g.f34069a, 10);
            rVar.b0(-1143068743);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            int i15 = 0;
            String str = "text";
            String str2 = LogCategory.ACTION;
            if (Q == eVar) {
                Q = new o6(i15, str2, str);
                rVar.k0(Q);
            }
            a2.m0 m0Var = (a2.m0) Q;
            rVar.s(false);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, m0Var, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar3);
                }
                nn.d.q(0, j10, new t0.m2(rVar), rVar, 2058660585);
                g1.o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.ui.layout.a.i("text"), s0.g.f34069a, f26853e, 1);
                rVar.b0(733328855);
                g1.g gVar = g1.a.f16379a;
                b0.v c10 = b0.s.c(gVar, false, rVar, 0);
                rVar.b0(-1323940314);
                int i17 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(v10);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                        nn.d.s(i17, rVar, i17, iVar3);
                    }
                    nn.d.q(0, j11, new t0.m2(rVar), rVar, 2058660585);
                    com.google.android.gms.internal.p002firebaseauthapi.a.p(i11 & 14, function2, rVar, false, true);
                    rVar.s(false);
                    rVar.s(false);
                    g1.o i18 = androidx.compose.ui.layout.a.i(LogCategory.ACTION);
                    rVar.b0(733328855);
                    b0.v c11 = b0.s.c(gVar, false, rVar, 0);
                    rVar.b0(-1323940314);
                    int i19 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(i18);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                            nn.d.s(i19, rVar, i19, iVar3);
                        }
                        nn.d.q(0, j12, new t0.m2(rVar), rVar, 2058660585);
                        int i20 = (i11 >> 3) & 14;
                        i12 = 1;
                        com.google.android.gms.internal.p002firebaseauthapi.a.p(i20, function22, rVar, false, true);
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
            } else {
                al.d.v0();
                throw null;
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new m6(function2, function22, i10, i12);
        }
    }

    public static final void d(Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(917397959);
        if ((i10 & 6) == 0) {
            if (rVar.j(function2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            s6 s6Var = s6.f26794a;
            rVar.b0(-1323940314);
            g1.l lVar = g1.l.f16404b;
            int i13 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, s6Var, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar, i13, iVar3);
                }
                nn.d.q(0, j10, new t0.m2(rVar), rVar, 2058660585);
                g1.o u10 = androidx.compose.foundation.layout.a.u(lVar, f26850b, f26853e);
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i14 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(u10);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar, i14, iVar3);
                    }
                    nn.d.q(0, j11, new t0.m2(rVar), rVar, 2058660585);
                    com.google.android.gms.internal.p002firebaseauthapi.a.p(i11 & 14, function2, rVar, false, true);
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
            w10.f35245d = new w.p0(i10, 7, function2);
        }
    }
}
