package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class f7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26170a;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26172c;

    /* renamed from: f, reason: collision with root package name */
    public static final float f26175f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f26176g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f26177h;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26171b = 14;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26173d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26174e = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final w.x1 f26178i = new w.x1(100, (w.d0) null, 6);

    /* renamed from: j, reason: collision with root package name */
    public static final float f26179j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final float f26180k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final float f26181l = 125;

    static {
        float f10 = 34;
        f26170a = f10;
        float f11 = 20;
        f26172c = f11;
        f26175f = f10;
        f26176g = f11;
        f26177h = f10 - f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ba  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [yt.a, x.j1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r34, kotlin.jvm.functions.Function1 r35, g1.o r36, boolean r37, a0.l r38, m0.r1 r39, t0.n r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f7.a(boolean, kotlin.jvm.functions.Function1, g1.o, boolean, a0.l, m0.r1, t0.n, int, int):void");
    }

    public static final void b(b0.w wVar, boolean z10, boolean z11, r1 r1Var, Function0 function0, a0.k kVar, t0.n nVar, int i10) {
        int i11;
        boolean z12;
        float f10;
        long j10;
        long j11;
        g1.l lVar;
        float f11;
        to.e eVar;
        boolean z13;
        long j12;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(70908914);
        if ((i10 & 6) == 0) {
            if (rVar.h(wVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.i(z10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (rVar.i(z11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.h(r1Var)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.j(function0)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (rVar.h(kVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        int i18 = i11;
        if ((i18 & 74899) == 74898 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-539244885);
            Object Q = rVar.Q();
            to.e eVar2 = t0.m.f35080a;
            if (Q == eVar2) {
                Q = new e1.s();
                rVar.k0(Q);
            }
            e1.s sVar = (e1.s) Q;
            int i19 = 0;
            rVar.s(false);
            rVar.b0(-539244799);
            if ((i18 & 458752) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object Q2 = rVar.Q();
            if (z12 || Q2 == eVar2) {
                Q2 = new c7(kVar, sVar, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t0.t.e(kVar, (Function2) Q2, rVar);
            if (!sVar.isEmpty()) {
                f10 = f26180k;
            } else {
                f10 = f26179j;
            }
            float f12 = f10;
            r1Var.getClass();
            rVar.b0(-1176343362);
            if (z11) {
                if (z10) {
                    j10 = r1Var.f26713b;
                } else {
                    j10 = r1Var.f26715d;
                }
            } else if (z10) {
                j10 = r1Var.f26717f;
            } else {
                j10 = r1Var.f26719h;
            }
            t0.g1 r02 = t0.t.r0(new n1.t(j10), rVar);
            rVar.s(false);
            g1.l lVar2 = g1.l.f16404b;
            g1.o g10 = wVar.a(lVar2, g1.a.f16383e).g(androidx.compose.foundation.layout.d.f1286c);
            rVar.b0(-539243859);
            boolean h10 = rVar.h(r02);
            Object Q3 = rVar.Q();
            if (h10 || Q3 == eVar2) {
                Q3 = new d7(r02, i19);
                rVar.k0(Q3);
            }
            rVar.s(false);
            androidx.compose.foundation.a.b(g10, (Function1) Q3, rVar, 0);
            rVar.b0(-66424183);
            if (z11) {
                if (z10) {
                    j11 = r1Var.f26712a;
                } else {
                    j11 = r1Var.f26714c;
                }
            } else if (z10) {
                j11 = r1Var.f26716e;
            } else {
                j11 = r1Var.f26718g;
            }
            t0.g1 r03 = t0.t.r0(new n1.t(j11), rVar);
            rVar.s(false);
            t2 t2Var = (t2) rVar.m(u2.f26875a);
            float f13 = ((w2.e) rVar.m(u2.f26876b)).f38783a + f12;
            rVar.b0(-539243532);
            if (n1.t.d(((n1.t) r03.getValue()).f28179a, ((v0) rVar.m(x0.f27075a)).d()) && t2Var != null) {
                lVar = lVar2;
                f11 = f12;
                z13 = false;
                eVar = eVar2;
                j12 = ((l1) t2Var).a(((n1.t) r03.getValue()).f28179a, f13, rVar, 0);
            } else {
                lVar = lVar2;
                f11 = f12;
                eVar = eVar2;
                z13 = false;
                j12 = ((n1.t) r03.getValue()).f28179a;
            }
            rVar.s(z13);
            t0.l3 a10 = v.n0.a(j12, null, rVar, 0, 14);
            g1.o a11 = wVar.a(lVar, g1.a.f16382d);
            rVar.b0(-539243241);
            if ((i18 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = z13;
            }
            Object Q4 = rVar.Q();
            if (z14 || Q4 == eVar) {
                Q4 = new h2(function0, 2);
                rVar.k0(Q4);
            }
            rVar.s(z13);
            g1.o j13 = androidx.compose.foundation.layout.d.j(androidx.compose.foundation.e.a(androidx.compose.foundation.layout.a.p(a11, (Function1) Q4), kVar, n5.c(false, f26173d, 0L, rVar, 54, 4)), f26172c);
            h0.g gVar = h0.h.f17801a;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.i(j13, f11, gVar, z13, 24), ((n1.t) a10.getValue()).f28179a, gVar), rVar);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new e7(wVar, z10, z11, r1Var, function0, kVar, i10);
        }
    }
}
