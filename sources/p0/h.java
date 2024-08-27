package p0;

import kotlin.jvm.functions.Function1;
import n1.p0;
import t0.l3;
import t0.r;
import t0.t;
import w.e0;
import w.x1;
import x.a0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final float f30458a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final h0.g f30459b = h0.h.f17801a;

    /* renamed from: c, reason: collision with root package name */
    public static final float f30460c = (float) 7.5d;

    /* renamed from: d, reason: collision with root package name */
    public static final float f30461d = (float) 2.5d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f30462e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final float f30463f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final float f30464g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final x1 f30465h = w.e.x(300, 0, e0.f38472c, 2);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r20, p0.o r21, g1.o r22, long r23, long r25, boolean r27, t0.n r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.a(boolean, p0.o, g1.o, long, long, boolean, t0.n, int, int):void");
    }

    public static final void b(o oVar, long j10, g1.o oVar2, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        g1.o oVar3;
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(-486016981);
        if ((i10 & 6) == 0) {
            if (rVar.j(oVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.g(j10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(oVar2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-298368415);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            Object obj = Q;
            if (Q == eVar) {
                n1.h h10 = androidx.compose.ui.graphics.a.h();
                h10.i(1);
                rVar.k0(h10);
                obj = h10;
            }
            p0 p0Var = (p0) obj;
            rVar.s(false);
            rVar.b0(-298368329);
            boolean h11 = rVar.h(oVar);
            Object Q2 = rVar.Q();
            if (h11 || Q2 == eVar) {
                Q2 = t.N(new e(oVar, 0));
                rVar.k0(Q2);
            }
            rVar.s(false);
            l3 b10 = w.i.b(((Number) ((l3) Q2).getValue()).floatValue(), f30465h, null, rVar, 48, 28);
            g1.o a10 = h2.l.a(oVar2, false, c.f30438b);
            rVar.b0(-298368044);
            boolean j11 = rVar.j(oVar) | rVar.h(b10);
            if ((i15 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean j12 = j11 | z10 | rVar.j(p0Var);
            Object Q3 = rVar.Q();
            if (!j12 && Q3 != eVar) {
                oVar3 = a10;
            } else {
                oVar3 = a10;
                a0 a0Var = new a0(oVar, b10, j10, p0Var, 1);
                rVar.k0(a0Var);
                Q3 = a0Var;
            }
            rVar.s(false);
            androidx.compose.foundation.a.b(oVar3, (Function1) Q3, rVar, 0);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d(oVar, j10, oVar2, i10);
        }
    }
}
