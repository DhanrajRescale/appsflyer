package ka;

import b0.i1;
import b0.l1;
import b0.o1;
import b0.q1;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioInfo;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.f1;
import m0.f7;
import okhttp3.HttpUrl;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function2 {
    public final /* synthetic */ g1 A;
    public final /* synthetic */ g1 B;
    public final /* synthetic */ l3 C;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f22878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu.z f22879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f22880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f22881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f22882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f22883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f22884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l3 f22885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f22886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f22887j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f22888k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPageBottomSheetViewModel f22889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l3 f22890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1 f22891n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g1 f22892o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g1 f22893p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g1 f22894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g1 f22895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1 f22896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g1 f22897t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g1 f22898u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22899v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f22900w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g1 f22901x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g1 f22902y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g1 f22903z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g1 g1Var, iu.z zVar, g1 g1Var2, g1 g1Var3, g1 g1Var4, Function2 function2, g1 g1Var5, t0.j0 j0Var, g1 g1Var6, g1 g1Var7, g1 g1Var8, ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel, g1 g1Var9, g1 g1Var10, g1 g1Var11, g1 g1Var12, g1 g1Var13, g1 g1Var14, g1 g1Var15, g1 g1Var16, g1 g1Var17, g1 g1Var18, g1 g1Var19, g1 g1Var20, g1 g1Var21, g1 g1Var22, g1 g1Var23, g1 g1Var24, t0.j0 j0Var2) {
        super(2);
        this.f22878a = g1Var;
        this.f22879b = zVar;
        this.f22880c = g1Var2;
        this.f22881d = g1Var3;
        this.f22882e = g1Var4;
        this.f22883f = function2;
        this.f22884g = g1Var5;
        this.f22885h = j0Var;
        this.f22886i = g1Var6;
        this.f22887j = g1Var7;
        this.f22888k = g1Var8;
        this.f22889l = modifyOrderPageBottomSheetViewModel;
        this.f22890m = g1Var9;
        this.f22891n = g1Var10;
        this.f22892o = g1Var11;
        this.f22893p = g1Var12;
        this.f22894q = g1Var13;
        this.f22895r = g1Var14;
        this.f22896s = g1Var15;
        this.f22897t = g1Var16;
        this.f22898u = g1Var17;
        this.f22899v = g1Var18;
        this.f22900w = g1Var19;
        this.f22901x = g1Var20;
        this.f22902y = g1Var21;
        this.f22903z = g1Var22;
        this.A = g1Var23;
        this.B = g1Var24;
        this.C = j0Var2;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        String str2;
        g1.o e10;
        g1.o b10;
        g1.o e11;
        Object obj;
        g1.o b11;
        boolean z10;
        double d10;
        l3 l3Var;
        float f10;
        float f11;
        b0.d dVar;
        g1 g1Var;
        g1 g1Var2;
        float f12;
        float f13;
        g1 g1Var3;
        l3 l3Var2;
        int i11;
        g1.o e12;
        g1.o e13;
        g1.o b12;
        g1 g1Var4;
        g1 g1Var5;
        g1 g1Var6;
        g1.o c10;
        g1.o b13;
        g1 g1Var7;
        int i12;
        g1 g1Var8;
        String c12;
        String c13;
        g1.o e14;
        g1.o b14;
        PortfolioInfo portfolioInfo;
        String c14;
        PortfolioInfo portfolioInfo2;
        String contractName;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.l lVar = g1.l.f16404b;
        float f14 = 16;
        g1.o o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.r(androidx.compose.foundation.layout.a.t(lVar, f14), androidx.compose.foundation.a.o(nVar)));
        l3 l3Var3 = this.f22881d;
        l3 l3Var4 = this.f22882e;
        Function2 function2 = this.f22883f;
        g1 g1Var9 = this.f22884g;
        g1 g1Var10 = this.f22888k;
        g1 g1Var11 = this.f22892o;
        g1 g1Var12 = this.f22893p;
        g1 g1Var13 = this.f22894q;
        g1 g1Var14 = this.f22900w;
        g1 g1Var15 = this.f22901x;
        g1 g1Var16 = this.f22902y;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        b0.f fVar = b0.n.f2937c;
        g1.e eVar = g1.a.f16391m;
        l1 a10 = b0.y.a(fVar, eVar, rVar2, 0);
        rVar2.b0(-1323940314);
        int o02 = al.d.o0(rVar2);
        r1 C = rVar2.C();
        c2.l.M.getClass();
        c2.j a11 = c2.k.a();
        b1.c j10 = androidx.compose.ui.layout.a.j(o10);
        if (rVar2.B() instanceof t0.f) {
            rVar2.e0();
            if (rVar2.F()) {
                rVar2.n(a11);
            } else {
                rVar2.n0();
            }
            c2.i j11 = jr.h.j(rVar2, a10, rVar2, C);
            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o02))) {
                nn.d.s(o02, rVar2, o02, j11);
            }
            nn.d.q(0, j10, m2.a(rVar2), rVar2, 2058660585);
            float f15 = 8;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
            l3 l3Var5 = this.f22880c;
            FnoOrderInfoResponseDto t02 = yk.j.t0(l3Var5);
            if (t02 != null && (contractName = t02.getContractName()) != null) {
                str = contractName;
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            int i13 = n1.t.f28178j;
            al.d.C(str, null, to.e.c(), yk.j.e1(14), null, null, jh.c.f(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
            pp.b.c(null, androidx.compose.ui.graphics.a.d(4294111986L), s0.g.f34069a, s0.g.f34069a, rVar2, 48, 13);
            float f16 = 12;
            al.d.C(v.e.i(lVar, f16, rVar2, R.string.add_to_text, rVar2), null, d2.w0.e(R.color.grey_text_new, rVar2), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
            FnoOrderInfoResponseDto t03 = yk.j.t0(l3Var5);
            if (t03 == null || (portfolioInfo2 = t03.getPortfolioInfo()) == null || (str2 = portfolioInfo2.getPortfolioName()) == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            yk.j.T(str2, rVar2, 0, 0);
            al.d.C(v.e.i(lVar, f14, rVar2, R.string.order_type, rVar2), null, to.e.c(), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
            float f17 = 10;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar2);
            g1 g1Var17 = this.f22878a;
            yk.j.U(g1Var17, rVar2, 6, 0);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
            e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            rVar2.b0(693286680);
            b0.d dVar2 = b0.n.f2935a;
            g1.f fVar2 = g1.a.f16388j;
            l1 a12 = o1.a(dVar2, fVar2, rVar2, 0);
            rVar2.b0(-1323940314);
            int o03 = al.d.o0(rVar2);
            r1 C2 = rVar2.C();
            c2.j a13 = c2.k.a();
            b1.c j12 = androidx.compose.ui.layout.a.j(e10);
            if (rVar2.B() instanceof t0.f) {
                rVar2.e0();
                if (rVar2.F()) {
                    rVar2.n(a13);
                } else {
                    rVar2.n0();
                }
                c2.i j13 = jr.h.j(rVar2, a12, rVar2, C2);
                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o03))) {
                    nn.d.s(o03, rVar2, o03, j13);
                }
                nn.d.q(0, j12, m2.a(rVar2), rVar2, 2058660585);
                q1 q1Var = q1.f2981a;
                b10 = q1Var.b(lVar, 1.0f, true);
                rVar2.b0(-483455358);
                l1 a14 = b0.y.a(fVar, eVar, rVar2, 0);
                rVar2.b0(-1323940314);
                int o04 = al.d.o0(rVar2);
                r1 C3 = rVar2.C();
                c2.j a15 = c2.k.a();
                b1.c j14 = androidx.compose.ui.layout.a.j(b10);
                if (rVar2.B() instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.F()) {
                        rVar2.n(a15);
                    } else {
                        rVar2.n0();
                    }
                    c2.i j15 = jr.h.j(rVar2, a14, rVar2, C3);
                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o04))) {
                        nn.d.s(o04, rVar2, o04, j15);
                    }
                    nn.d.q(0, j14, m2.a(rVar2), rVar2, 2058660585);
                    e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                    rVar2.b0(693286680);
                    l1 a16 = o1.a(dVar2, fVar2, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int o05 = al.d.o0(rVar2);
                    r1 C4 = rVar2.C();
                    c2.j a17 = c2.k.a();
                    b1.c j16 = androidx.compose.ui.layout.a.j(e11);
                    if (rVar2.B() instanceof t0.f) {
                        rVar2.e0();
                        if (rVar2.F()) {
                            rVar2.n(a17);
                        } else {
                            rVar2.n0();
                        }
                        c2.i j17 = jr.h.j(rVar2, a16, rVar2, C4);
                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o05))) {
                            nn.d.s(o05, rVar2, o05, j17);
                        }
                        nn.d.q(0, j16, m2.a(rVar2), rVar2, 2058660585);
                        al.d.C(hl.f.c1(R.string.lots_text, rVar2), null, to.e.c(), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                        Object[] objArr = new Object[1];
                        FnoOrderInfoResponseDto t04 = yk.j.t0(l3Var5);
                        if (t04 != null) {
                            obj = Integer.valueOf(t04.getLotSize());
                        } else {
                            obj = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        objArr[0] = obj;
                        al.d.C(hl.f.d1(R.string.lot_size_data, objArr, rVar2), null, androidx.compose.ui.graphics.a.d(4288651167L), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                        rVar2.v();
                        rVar2.u();
                        rVar2.v();
                        rVar2.v();
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
                        al.d.f(null, g1Var9, 0, false, rVar2, 48, 13);
                        rVar2.b0(859564726);
                        g1 g1Var18 = this.f22886i;
                        if (((Boolean) g1Var18.getValue()).booleanValue()) {
                            al.d.C(v.e.i(lVar, 4, rVar2, R.string.order_value_exceeds_margin_available_fno, rVar2), null, d2.w0.e(R.color.red_EB3B3B, rVar2), yk.j.e1(10), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                        }
                        rVar2.v();
                        rVar2.b0(859579568);
                        g1 g1Var19 = this.f22887j;
                        if (((Boolean) g1Var19.getValue()).booleanValue() && !yk.j.u0(g1Var18)) {
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 14), rVar2);
                        }
                        rVar2.v();
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f16), rVar2);
                        al.d.C(hl.f.c1(R.string.margin_required_fno, rVar2), null, androidx.compose.ui.graphics.a.d(4282917091L), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
                        al.d.l(((Number) this.f22885h.getValue()).doubleValue(), null, androidx.compose.ui.graphics.a.d(4280427042L), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, false, rVar2, 1576320, 0, 262066);
                        rVar2.v();
                        rVar2.u();
                        rVar2.v();
                        rVar2.v();
                        b11 = q1Var.b(lVar, 1.0f, true);
                        rVar2.b0(-483455358);
                        l1 a18 = b0.y.a(fVar, eVar, rVar2, 0);
                        rVar2.b0(-1323940314);
                        int o06 = al.d.o0(rVar2);
                        r1 C5 = rVar2.C();
                        c2.j a19 = c2.k.a();
                        b1.c j18 = androidx.compose.ui.layout.a.j(b11);
                        if (rVar2.B() instanceof t0.f) {
                            rVar2.e0();
                            if (rVar2.F()) {
                                rVar2.n(a19);
                            } else {
                                rVar2.n0();
                            }
                            c2.i j19 = jr.h.j(rVar2, a18, rVar2, C5);
                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o06))) {
                                nn.d.s(o06, rVar2, o06, j19);
                            }
                            nn.d.q(0, j18, m2.a(rVar2), rVar2, 2058660585);
                            al.d.C(hl.f.c1(R.string.price, rVar2), null, to.e.c(), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
                            if (((Number) g1Var17.getValue()).intValue() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            al.d.F(null, g1Var10, z10, new c.g(27, this.f22889l, g1Var10, l3Var5), rVar2, 48, 1);
                            rVar2.b0(859637034);
                            if (yk.j.v0(g1Var19)) {
                                if (yk.j.z0(l3Var3) == 0.0d) {
                                    rVar2.b0(859640125);
                                    c14 = hl.f.c1(R.string.price_too_low_fno, rVar2);
                                    rVar2.v();
                                } else if (yk.j.A0(this.f22890m)) {
                                    rVar2.b0(859642891);
                                    c14 = hl.f.c1(R.string.can_t_be_less_than_market_price, rVar2);
                                    rVar2.v();
                                } else {
                                    rVar2.b0(859645870);
                                    c14 = hl.f.c1(R.string.can_t_be_greater_than_market_price, rVar2);
                                    rVar2.v();
                                }
                                String str3 = c14;
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar2);
                                al.d.C(str3, null, d2.w0.e(R.color.red_EB3B3B, rVar2), yk.j.e1(10), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                            }
                            rVar2.v();
                            rVar2.b0(859661456);
                            if (yk.j.u0(g1Var18) && !yk.j.v0(g1Var19)) {
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 14), rVar2);
                            }
                            rVar2.v();
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f16), rVar2);
                            al.d.C(hl.f.c1(R.string.margin_available_fno, rVar2), null, androidx.compose.ui.graphics.a.d(4282917091L), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
                            FnoOrderInfoResponseDto t05 = yk.j.t0(l3Var5);
                            if (t05 != null && (portfolioInfo = t05.getPortfolioInfo()) != null) {
                                d10 = kj.f.p(portfolioInfo.getCashBalance());
                            } else {
                                d10 = 0.0d;
                            }
                            al.d.l(d10, null, androidx.compose.ui.graphics.a.d(4280427042L), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, false, rVar2, 1576320, 0, 262066);
                            rVar2.v();
                            rVar2.u();
                            rVar2.v();
                            rVar2.v();
                            rVar2.v();
                            rVar2.u();
                            rVar2.v();
                            rVar2.v();
                            int intValue = ((Number) ((l3) this.f22879b.f20560a).getValue()).intValue();
                            to.e eVar2 = t0.m.f35080a;
                            g1 g1Var20 = this.f22891n;
                            if (intValue > 0) {
                                rVar2.b0(-1100203816);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f15), rVar2);
                                e14 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                g1.f fVar3 = g1.a.f16389k;
                                rVar2.b0(693286680);
                                dVar = dVar2;
                                l1 a20 = o1.a(dVar, fVar3, rVar2, 48);
                                rVar2.b0(-1323940314);
                                int o07 = al.d.o0(rVar2);
                                r1 C6 = rVar2.C();
                                c2.j a21 = c2.k.a();
                                b1.c j20 = androidx.compose.ui.layout.a.j(e14);
                                l3Var = l3Var5;
                                if (rVar2.B() instanceof t0.f) {
                                    rVar2.e0();
                                    if (rVar2.F()) {
                                        rVar2.n(a21);
                                    } else {
                                        rVar2.n0();
                                    }
                                    c2.i j21 = jr.h.j(rVar2, a20, rVar2, C6);
                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o07))) {
                                        nn.d.s(o07, rVar2, o07, j21);
                                    }
                                    nn.d.q(0, j20, m2.a(rVar2), rVar2, 2058660585);
                                    al.d.C(hl.f.c1(R.string.set_a_bracket_order_fno, rVar2), null, d2.w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(12), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                                    b14 = q1Var.b(lVar, 1.0f, true);
                                    androidx.compose.foundation.layout.a.c(b14, rVar2);
                                    boolean booleanValue = ((Boolean) g1Var20.getValue()).booleanValue();
                                    rVar2.b0(1753600818);
                                    Object Q = rVar2.Q();
                                    if (Q == eVar2) {
                                        Q = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var20, 3, rVar2);
                                    }
                                    rVar2.v();
                                    f11 = f16;
                                    f10 = f15;
                                    f7.a(booleanValue, (Function1) Q, null, false, null, yk.o.I(androidx.compose.ui.graphics.a.d(4283048166L), n1.t.c(androidx.compose.ui.graphics.a.d(4283048166L), 0.5f), to.e.f(), n1.t.c(to.e.f(), 0.5f), rVar2, 996), rVar2, 48, 28);
                                    rVar2.v();
                                    rVar2.u();
                                    rVar2.v();
                                    rVar2.v();
                                    rVar2.v();
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                l3Var = l3Var5;
                                f10 = f15;
                                f11 = f16;
                                dVar = dVar2;
                                rVar2.b0(-1099068348);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 56), rVar2);
                                rVar2.v();
                            }
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar2);
                            rVar2.b0(-312537988);
                            if (((Boolean) g1Var20.getValue()).booleanValue()) {
                                e13 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                g1.o m10 = androidx.compose.foundation.layout.a.m(e13);
                                rVar2.b0(693286680);
                                l1 a22 = o1.a(dVar, fVar2, rVar2, 0);
                                rVar2.b0(-1323940314);
                                int o08 = al.d.o0(rVar2);
                                r1 C7 = rVar2.C();
                                c2.j a23 = c2.k.a();
                                b1.c j22 = androidx.compose.ui.layout.a.j(m10);
                                if (rVar2.B() instanceof t0.f) {
                                    rVar2.e0();
                                    if (rVar2.F()) {
                                        rVar2.n(a23);
                                    } else {
                                        rVar2.n0();
                                    }
                                    c2.i j23 = jr.h.j(rVar2, a22, rVar2, C7);
                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o08))) {
                                        nn.d.s(o08, rVar2, o08, j23);
                                    }
                                    nn.d.q(0, j22, m2.a(rVar2), rVar2, 2058660585);
                                    b12 = q1Var.b(androidx.compose.foundation.layout.d.t(lVar), 1.0f, true);
                                    rVar2.b0(733328855);
                                    g1.g gVar = g1.a.f16379a;
                                    b0.v c11 = b0.s.c(gVar, false, rVar2, 0);
                                    rVar2.b0(-1323940314);
                                    int o09 = al.d.o0(rVar2);
                                    r1 C8 = rVar2.C();
                                    c2.j a24 = c2.k.a();
                                    b1.c j24 = androidx.compose.ui.layout.a.j(b12);
                                    if (rVar2.B() instanceof t0.f) {
                                        rVar2.e0();
                                        if (rVar2.F()) {
                                            rVar2.n(a24);
                                        } else {
                                            rVar2.n0();
                                        }
                                        t0.t.v0(rVar2, c11, c2.k.c());
                                        t0.t.v0(rVar2, C8, c2.k.d());
                                        c2.i b15 = c2.k.b();
                                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o09))) {
                                            nn.d.s(o09, rVar2, o09, b15);
                                        }
                                        nn.d.q(0, j24, m2.a(rVar2), rVar2, 2058660585);
                                        float f18 = 32;
                                        f12 = f11;
                                        g1Var2 = g1Var20;
                                        l3Var2 = l3Var;
                                        f13 = f10;
                                        g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, f18, s0.g.f34069a, 11);
                                        rVar2.b0(-483455358);
                                        l1 a25 = b0.y.a(fVar, eVar, rVar2, 0);
                                        rVar2.b0(-1323940314);
                                        int o010 = al.d.o0(rVar2);
                                        r1 C9 = rVar2.C();
                                        c2.j a26 = c2.k.a();
                                        b1.c j25 = androidx.compose.ui.layout.a.j(x10);
                                        if (rVar2.B() instanceof t0.f) {
                                            rVar2.e0();
                                            if (rVar2.F()) {
                                                rVar2.n(a26);
                                            } else {
                                                rVar2.n0();
                                            }
                                            c2.i j26 = jr.h.j(rVar2, a25, rVar2, C9);
                                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o010))) {
                                                nn.d.s(o010, rVar2, o010, j26);
                                            }
                                            nn.d.q(0, j25, m2.a(rVar2), rVar2, 2058660585);
                                            String c15 = hl.f.c1(R.string.stop_loss_fno, rVar2);
                                            rVar2.b0(-369213260);
                                            Object Q2 = rVar2.Q();
                                            if (Q2 == eVar2) {
                                                Q2 = new o(this.f22895r, g1Var11, 0);
                                                rVar2.k0(Q2);
                                            }
                                            rVar2.v();
                                            yk.o.a(null, c15, g1Var11, false, false, false, (Function1) Q2, rVar2, 1573248, 57);
                                            String i14 = v.e.i(lVar, f14, rVar2, R.string.stop_loss_percentage_fno, rVar2);
                                            rVar2.b0(-369198120);
                                            Object Q3 = rVar2.Q();
                                            if (Q3 == eVar2) {
                                                g1Var4 = g1Var12;
                                                Q3 = new o(this.f22896s, g1Var4, 1);
                                                rVar2.k0(Q3);
                                            } else {
                                                g1Var4 = g1Var12;
                                            }
                                            rVar2.v();
                                            yk.o.a(null, i14, g1Var4, false, false, false, (Function1) Q3, rVar2, 1573248, 57);
                                            rVar2.b0(-369191888);
                                            g1 g1Var21 = this.f22897t;
                                            if (((Boolean) g1Var21.getValue()).booleanValue()) {
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
                                            }
                                            rVar2.v();
                                            rVar2.b0(-369186267);
                                            g1 g1Var22 = this.f22898u;
                                            if (((Boolean) g1Var22.getValue()).booleanValue()) {
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar2);
                                                g1Var5 = g1Var22;
                                                if (Float.parseFloat((String) g1Var4.getValue()) > 100.0d) {
                                                    rVar2.b0(-369179601);
                                                    c13 = hl.f.c1(R.string.stop_loss_too_high_fno, rVar2);
                                                    rVar2.v();
                                                } else {
                                                    rVar2.b0(-369175403);
                                                    c13 = hl.f.c1(R.string.stop_loss_cannot_be_negative, rVar2);
                                                    rVar2.v();
                                                }
                                                al.d.C(c13, null, d2.w0.e(R.color.red_EB3B3B, rVar2), yk.j.e1(10), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                                            } else {
                                                g1Var5 = g1Var22;
                                            }
                                            rVar2.v();
                                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
                                            String c16 = hl.f.c1(R.string.stop_loss_price_fno, rVar2);
                                            rVar2.b0(-369151116);
                                            Object Q4 = rVar2.Q();
                                            if (Q4 == eVar2) {
                                                g1Var6 = g1Var13;
                                                Q4 = new o(this.f22899v, g1Var6, 2);
                                                rVar2.k0(Q4);
                                            } else {
                                                g1Var6 = g1Var13;
                                            }
                                            rVar2.v();
                                            yk.o.a(null, c16, g1Var6, false, true, false, (Function1) Q4, rVar2, 1597824, 41);
                                            rVar2.v();
                                            rVar2.u();
                                            rVar2.v();
                                            rVar2.v();
                                            rVar2.v();
                                            rVar2.u();
                                            rVar2.v();
                                            rVar2.v();
                                            long e15 = d2.w0.e(R.color.lightColorSeparator, rVar2);
                                            c10 = androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.d.q(lVar, 1), 1.0f);
                                            pp.b.c(c10, e15, s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
                                            b13 = q1Var.b(androidx.compose.foundation.layout.d.t(lVar), 1.0f, true);
                                            rVar2.b0(733328855);
                                            b0.v c17 = b0.s.c(gVar, false, rVar2, 0);
                                            rVar2.b0(-1323940314);
                                            int o011 = al.d.o0(rVar2);
                                            r1 C10 = rVar2.C();
                                            c2.j a27 = c2.k.a();
                                            b1.c j27 = androidx.compose.ui.layout.a.j(b13);
                                            if (rVar2.B() instanceof t0.f) {
                                                rVar2.e0();
                                                if (rVar2.F()) {
                                                    rVar2.n(a27);
                                                } else {
                                                    rVar2.n0();
                                                }
                                                t0.t.v0(rVar2, c17, c2.k.c());
                                                t0.t.v0(rVar2, C10, c2.k.d());
                                                c2.i b16 = c2.k.b();
                                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o011))) {
                                                    nn.d.s(o011, rVar2, o011, b16);
                                                }
                                                nn.d.q(0, j27, m2.a(rVar2), rVar2, 2058660585);
                                                g1 g1Var23 = g1Var5;
                                                g1Var3 = g1Var4;
                                                i11 = 0;
                                                g1.o x11 = androidx.compose.foundation.layout.a.x(lVar, f18, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                                                rVar2.b0(-483455358);
                                                l1 a28 = b0.y.a(fVar, eVar, rVar2, 0);
                                                rVar2.b0(-1323940314);
                                                int o012 = al.d.o0(rVar2);
                                                r1 C11 = rVar2.C();
                                                c2.j a29 = c2.k.a();
                                                b1.c j28 = androidx.compose.ui.layout.a.j(x11);
                                                if (rVar2.B() instanceof t0.f) {
                                                    rVar2.e0();
                                                    if (rVar2.F()) {
                                                        rVar2.n(a29);
                                                    } else {
                                                        rVar2.n0();
                                                    }
                                                    c2.i j29 = jr.h.j(rVar2, a28, rVar2, C11);
                                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o012))) {
                                                        nn.d.s(o012, rVar2, o012, j29);
                                                    }
                                                    nn.d.q(0, j28, m2.a(rVar2), rVar2, 2058660585);
                                                    String c18 = hl.f.c1(R.string.book_profit_fno, rVar2);
                                                    rVar2.b0(-369117576);
                                                    Object Q5 = rVar2.Q();
                                                    if (Q5 == eVar2) {
                                                        g1Var7 = g1Var14;
                                                        Q5 = new o(this.f22903z, g1Var7, 3);
                                                        rVar2.k0(Q5);
                                                    } else {
                                                        g1Var7 = g1Var14;
                                                    }
                                                    rVar2.v();
                                                    yk.o.a(null, c18, g1Var7, false, false, false, (Function1) Q5, rVar2, 1573248, 57);
                                                    String i15 = v.e.i(lVar, f14, rVar2, R.string.book_profit_percentage_fno, rVar2);
                                                    rVar2.b0(-369102180);
                                                    Object Q6 = rVar2.Q();
                                                    if (Q6 == eVar2) {
                                                        g1Var = g1Var15;
                                                        i12 = 4;
                                                        Q6 = new o(this.A, g1Var, 4);
                                                        rVar2.k0(Q6);
                                                    } else {
                                                        g1Var = g1Var15;
                                                        i12 = 4;
                                                    }
                                                    rVar2.v();
                                                    yk.o.a(null, i15, g1Var, false, false, false, (Function1) Q6, rVar2, 1573248, 57);
                                                    rVar2.b0(-369095826);
                                                    if (yk.j.w0(g1Var23)) {
                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
                                                    }
                                                    rVar2.v();
                                                    rVar2.b0(-369090256);
                                                    if (yk.j.x0(g1Var21)) {
                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, i12), rVar2);
                                                        if (Float.parseFloat((String) g1Var.getValue()) > 100.0d) {
                                                            rVar2.b0(-369083468);
                                                            c12 = hl.f.c1(R.string.profit_percent_too_high_fno, rVar2);
                                                            rVar2.v();
                                                        } else {
                                                            rVar2.b0(-369079113);
                                                            c12 = hl.f.c1(R.string.book_profit_cannot_be_negative, rVar2);
                                                            rVar2.v();
                                                        }
                                                        al.d.C(c12, null, d2.w0.e(R.color.red_EB3B3B, rVar2), yk.j.e1(10), null, null, jh.c.g(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                                                    }
                                                    rVar2.v();
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
                                                    String c19 = hl.f.c1(R.string.book_profit_price_fno, rVar2);
                                                    rVar2.b0(-369054664);
                                                    Object Q7 = rVar2.Q();
                                                    if (Q7 == eVar2) {
                                                        g1Var8 = g1Var16;
                                                        Q7 = new o(this.B, g1Var8, 5);
                                                        rVar2.k0(Q7);
                                                    } else {
                                                        g1Var8 = g1Var16;
                                                    }
                                                    rVar2.v();
                                                    yk.o.a(null, c19, g1Var8, false, true, false, (Function1) Q7, rVar2, 1597824, 41);
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar2);
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
                                    } else {
                                        al.d.v0();
                                        throw null;
                                    }
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                g1Var = g1Var15;
                                g1Var2 = g1Var20;
                                f12 = f11;
                                f13 = f10;
                                g1Var3 = g1Var12;
                                l3Var2 = l3Var;
                                i11 = 0;
                            }
                            rVar2.v();
                            boolean y02 = yk.j.y0(this.C);
                            e12 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                            g1.o b17 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(e12, 48), h0.h.b(f13));
                            i1 i1Var = m0.m0.f26467a;
                            f1 a30 = m0.m0.a(d2.w0.e(R.color.purpleSubmitBackground, rVar2), 0L, rVar2, 0, 14);
                            float f19 = i11;
                            i1 b18 = androidx.compose.foundation.layout.a.b(s0.g.f34069a, f19, s0.g.f34069a, f19, 5);
                            rVar2.b0(-312348457);
                            l3 l3Var6 = l3Var2;
                            boolean h10 = rVar2.h(l3Var6) | rVar2.h(l3Var3) | rVar2.h(l3Var4) | rVar2.h(function2);
                            Object Q8 = rVar2.Q();
                            if (h10 || Q8 == eVar2) {
                                ea.h hVar = new ea.h(g1Var17, g1Var3, g1Var, function2, l3Var6, l3Var3, l3Var4, g1Var2, 2);
                                rVar2.k0(hVar);
                                Q8 = hVar;
                            }
                            rVar2.v();
                            pp.b.a((Function0) Q8, b17, y02, null, null, null, null, a30, b18, d.a(), rVar2, 905969664, 120);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f12), rVar2);
                            rVar2.v();
                            rVar2.u();
                            rVar2.v();
                            rVar2.v();
                            return;
                        }
                        al.d.v0();
                        throw null;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((t0.n) obj, ((Number) obj2).intValue());
        return Unit.f23355a;
    }
}
