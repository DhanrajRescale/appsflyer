package m0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26945a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26946b = 125;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26947c = 640;

    /* JADX WARN: Removed duplicated region for block: B:101:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(hu.c r32, g1.o r33, m0.w4 r34, boolean r35, n1.x0 r36, float r37, long r38, long r40, long r42, kotlin.jvm.functions.Function2 r44, t0.n r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.v4.a(hu.c, g1.o, m0.w4, boolean, n1.x0, float, long, long, long, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final void b(long j10, Function0 function0, boolean z10, t0.n nVar, int i10) {
        int i11;
        float f10;
        boolean z11;
        ?? r12;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-526532668);
        if ((i10 & 6) == 0) {
            if (rVar.g(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.i(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else if (j10 != 16) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = s0.g.f34069a;
            }
            t0.l3 b10 = w.i.b(f10, new w.x1(0, (w.d0) null, 7), null, rVar, 48, 28);
            String z15 = pp.b.z(2, rVar);
            rVar.b0(1010559845);
            Object obj = t0.m.f35080a;
            g1.o oVar = g1.l.f16404b;
            if (z10) {
                rVar.b0(1010559922);
                int i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object Q = rVar.Q();
                if (z13 || Q == obj) {
                    Q = new q4(function0, null);
                    rVar.k0(Q);
                }
                r12 = 0;
                rVar.s(false);
                g1.o a10 = x1.h0.a(oVar, function0, (Function2) Q);
                rVar.b0(1010560012);
                boolean h10 = rVar.h(z15);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z16 = z14 | h10;
                Object Q2 = rVar.Q();
                if (z16 || Q2 == obj) {
                    Q2 = new k2(2, z15, function0);
                    rVar.k0(Q2);
                }
                rVar.s(false);
                z11 = true;
                oVar = h2.l.a(a10, true, (Function1) Q2);
            } else {
                z11 = true;
                r12 = 0;
            }
            rVar.s(r12);
            g1.o g10 = androidx.compose.foundation.layout.d.f1286c.g(oVar);
            rVar.b0(1010560300);
            if ((i15 & 14) == 4) {
                z12 = z11;
            } else {
                z12 = r12;
            }
            boolean h11 = rVar.h(b10) | z12;
            Object Q3 = rVar.Q();
            if (h11 || Q3 == obj) {
                Q3 = new o4(j10, b10, r12);
                rVar.k0(Q3);
            }
            rVar.s(r12);
            androidx.compose.foundation.a.b(g10, (Function1) Q3, rVar, r12);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p4(j10, function0, z10, i10, 0);
        }
    }

    public static final w4 c(w.n nVar, Function1 function1, t0.n nVar2, int i10, int i11) {
        boolean z10;
        boolean z11;
        Object obj = x4.f27081a;
        t0.r rVar = (t0.r) nVar2;
        rVar.b0(-126412120);
        if ((i11 & 2) != 0) {
            nVar = b.f25916a;
        }
        if ((i11 & 4) != 0) {
            function1 = t4.f26838a;
        }
        w2.b bVar = (w2.b) rVar.m(d2.s1.f13620e);
        rVar.Z(170051256, obj);
        Object[] objArr = {obj, nVar, false, function1, bVar};
        z0 z0Var = z0.f27197k;
        c0.z zVar = new c0.z(nVar, bVar, function1, false);
        d1.r rVar2 = d1.s.f13291a;
        d1.r rVar3 = new d1.r(z0Var, zVar);
        rVar.b0(170051632);
        boolean z12 = true;
        if ((((i10 & 14) ^ 6) > 4 && rVar.h(obj)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = z10 | rVar.h(bVar) | rVar.j(nVar);
        if ((((i10 & 896) ^ 384) > 256 && rVar.j(function1)) || (i10 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = h10 | z11;
        if ((((i10 & 7168) ^ 3072) <= 2048 || !rVar.i(false)) && (i10 & 3072) != 2048) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object Q = rVar.Q();
        if (z14 || Q == t0.m.f35080a) {
            Q = new u4(bVar, nVar, function1, false);
            rVar.k0(Q);
        }
        rVar.s(false);
        w4 w4Var = (w4) el.l.y0(objArr, rVar3, (Function0) Q, rVar, 0, 4);
        rVar.s(false);
        rVar.s(false);
        return w4Var;
    }
}
