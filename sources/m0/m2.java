package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26475a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26476b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26477c = 400;

    /* renamed from: d, reason: collision with root package name */
    public static final w.x1 f26478d = new w.x1(256, (w.d0) null, 6);

    static {
        float f10 = 56;
        f26475a = f10;
        f26476b = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(hu.c r38, g1.o r39, m0.p2 r40, boolean r41, n1.x0 r42, float r43, long r44, long r46, long r48, kotlin.jvm.functions.Function2 r50, t0.n r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.m2.a(hu.c, g1.o, m0.p2, boolean, n1.x0, float, long, long, long, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void b(boolean z10, Function0 function0, Function0 function02, long j10, t0.n nVar, int i10) {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1983403750);
        if ((i10 & 6) == 0) {
            if (rVar.i(z10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function02)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.g(j10)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) == 1170 && rVar.G()) {
            rVar.V();
        } else {
            String z15 = pp.b.z(1, rVar);
            rVar.b0(1010561083);
            to.e eVar = t0.m.f35080a;
            g1.o oVar = g1.l.f16404b;
            int i16 = 0;
            if (z10) {
                rVar.b0(1010561147);
                int i17 = i11 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object Q = rVar.Q();
                if (z13 || Q == eVar) {
                    Q = new i2(function0, null);
                    rVar.k0(Q);
                }
                rVar.s(false);
                g1.o a10 = x1.h0.a(oVar, function0, (Function2) Q);
                rVar.b0(1010561231);
                boolean h10 = rVar.h(z15);
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z16 = z14 | h10;
                Object Q2 = rVar.Q();
                if (z16 || Q2 == eVar) {
                    Q2 = new k2(i16, z15, function0);
                    rVar.k0(Q2);
                }
                rVar.s(false);
                z11 = true;
                oVar = h2.l.a(a10, true, (Function1) Q2);
            } else {
                z11 = true;
            }
            rVar.s(false);
            g1.o g10 = androidx.compose.foundation.layout.d.f1286c.g(oVar);
            rVar.b0(1010561472);
            if ((i11 & 7168) == 2048) {
                z12 = z11;
            } else {
                z12 = false;
            }
            if ((i11 & 896) != 256) {
                z11 = false;
            }
            boolean z17 = z12 | z11;
            Object Q3 = rVar.Q();
            if (z17 || Q3 == eVar) {
                Q3 = new x.v(function02, 2, j10);
                rVar.k0(Q3);
            }
            rVar.s(false);
            androidx.compose.foundation.a.b(g10, (Function1) Q3, rVar, 0);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new g2(z10, function0, function02, j10, i10);
        }
    }

    public static final p2 c(t0.n nVar) {
        q2 q2Var = q2.f26666a;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1435874229);
        l2 l2Var = l2.f26445a;
        Object[] objArr = new Object[0];
        z0 z0Var = z0.f27196j;
        n2 n2Var = new n2(l2Var);
        d1.r rVar2 = d1.s.f13291a;
        d1.r rVar3 = new d1.r(z0Var, n2Var);
        rVar.b0(-1540944162);
        boolean j10 = rVar.j(l2Var);
        Object Q = rVar.Q();
        if (j10 || Q == t0.m.f35080a) {
            Q = new x(2, q2Var, l2Var);
            rVar.k0(Q);
        }
        rVar.s(false);
        p2 p2Var = (p2) el.l.y0(objArr, rVar3, (Function0) Q, rVar, 0, 4);
        rVar.s(false);
        return p2Var;
    }
}
