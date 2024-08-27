package ka;

import b0.i1;
import b0.l1;
import b0.o1;
import b0.q1;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.f1;
import m0.f7;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class q0 extends iu.k implements Function2 {
    public final /* synthetic */ g1 A;
    public final /* synthetic */ g1 B;
    public final /* synthetic */ g1 C;
    public final /* synthetic */ g1 D;
    public final /* synthetic */ g1 E;
    public final /* synthetic */ l3 F;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OptionContract f22912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioReviewResponse f22913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f22914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f22915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.c f22917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f22918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f22920i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f22921j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f22922k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l3 f22923l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OptionOverview f22924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1 f22925n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g1 f22926o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l1.o f22927p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g1 f22928q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g1 f22929r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1 f22930s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g1 f22931t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g1 f22932u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22933v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f22934w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g1 f22935x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g1 f22936y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g1 f22937z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(OptionContract optionContract, PortfolioReviewResponse portfolioReviewResponse, Function1 function1, t0.j0 j0Var, boolean z10, hu.c cVar, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, t0.j0 j0Var2, OptionOverview optionOverview, g1 g1Var6, g1 g1Var7, l1.o oVar, g1 g1Var8, g1 g1Var9, g1 g1Var10, g1 g1Var11, g1 g1Var12, g1 g1Var13, g1 g1Var14, g1 g1Var15, g1 g1Var16, g1 g1Var17, g1 g1Var18, g1 g1Var19, g1 g1Var20, g1 g1Var21, g1 g1Var22, t0.j0 j0Var3) {
        super(2);
        this.f22912a = optionContract;
        this.f22913b = portfolioReviewResponse;
        this.f22914c = function1;
        this.f22915d = j0Var;
        this.f22916e = z10;
        this.f22917f = cVar;
        this.f22918g = g1Var;
        this.f22919h = g1Var2;
        this.f22920i = g1Var3;
        this.f22921j = g1Var4;
        this.f22922k = g1Var5;
        this.f22923l = j0Var2;
        this.f22924m = optionOverview;
        this.f22925n = g1Var6;
        this.f22926o = g1Var7;
        this.f22927p = oVar;
        this.f22928q = g1Var8;
        this.f22929r = g1Var9;
        this.f22930s = g1Var10;
        this.f22931t = g1Var11;
        this.f22932u = g1Var12;
        this.f22933v = g1Var13;
        this.f22934w = g1Var14;
        this.f22935x = g1Var15;
        this.f22936y = g1Var16;
        this.f22937z = g1Var17;
        this.A = g1Var18;
        this.B = g1Var19;
        this.C = g1Var20;
        this.D = g1Var21;
        this.E = g1Var22;
        this.F = j0Var3;
    }

    public final void a(t0.n nVar, int i10) {
        g1.o a10;
        g1.o a11;
        g1.o a12;
        float f10;
        g1.o a13;
        g1.o e10;
        g1.o b10;
        g1.o e11;
        g1.o a14;
        g1.o a15;
        g1.o a16;
        g1.o a17;
        g1.o a18;
        g1.o b11;
        g1.o a19;
        g1.o a20;
        g1 g1Var;
        g1.o a21;
        g1.o a22;
        float f11;
        g1 g1Var2;
        q1 q1Var;
        b0.d dVar;
        g1 g1Var3;
        t0.r rVar;
        g1 g1Var4;
        float f12;
        g1 g1Var5;
        g1 g1Var6;
        g1 g1Var7;
        g1 g1Var8;
        Object obj;
        g1.o e12;
        g1.o a23;
        t0.r rVar2;
        g1.o e13;
        g1.o b12;
        g1.o a24;
        g1 g1Var9;
        g1.o a25;
        g1 g1Var10;
        g1.o a26;
        g1 g1Var11;
        g1 g1Var12;
        g1 g1Var13;
        g1.o c10;
        g1.o b13;
        g1.o a27;
        g1 g1Var14;
        g1.o a28;
        g1.o a29;
        g1 g1Var15;
        String c12;
        g1.o a30;
        String c13;
        g1.o a31;
        g1.o e14;
        g1.o a32;
        g1.o b14;
        g1.o a33;
        String c14;
        g1.o a34;
        g1.o a35;
        if ((i10 & 11) == 2) {
            t0.r rVar3 = (t0.r) nVar;
            if (rVar3.G()) {
                rVar3.V();
                return;
            }
        }
        g1.l lVar = g1.l.f16404b;
        float f13 = 16;
        a10 = h2.l.a(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.r(androidx.compose.foundation.layout.a.t(lVar, f13), androidx.compose.foundation.a.o(nVar))), false, a0.f22720g);
        boolean z10 = this.f22916e;
        hu.c cVar = this.f22917f;
        g1 g1Var16 = this.f22919h;
        g1 g1Var17 = this.f22920i;
        g1 g1Var18 = this.f22921j;
        g1 g1Var19 = this.f22922k;
        g1 g1Var20 = this.f22929r;
        g1 g1Var21 = this.f22930s;
        g1 g1Var22 = this.f22931t;
        g1 g1Var23 = this.f22937z;
        g1 g1Var24 = this.A;
        g1 g1Var25 = this.B;
        t0.r rVar4 = (t0.r) nVar;
        rVar4.b0(-483455358);
        b0.f fVar = b0.n.f2937c;
        g1.e eVar = g1.a.f16391m;
        l1 a36 = b0.y.a(fVar, eVar, rVar4, 0);
        rVar4.b0(-1323940314);
        int o02 = al.d.o0(rVar4);
        r1 C = rVar4.C();
        c2.l.M.getClass();
        Function0 a37 = c2.k.a();
        b1.c j10 = androidx.compose.ui.layout.a.j(a10);
        if (rVar4.B() instanceof t0.f) {
            rVar4.e0();
            if (rVar4.F()) {
                rVar4.n(a37);
            } else {
                rVar4.n0();
            }
            c2.i j11 = jr.h.j(rVar4, a36, rVar4, C);
            if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o02))) {
                nn.d.s(o02, rVar4, o02, j11);
            }
            nn.d.q(0, j10, m2.a(rVar4), rVar4, 2058660585);
            float f14 = 8;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar4);
            OptionContract optionContract = this.f22912a;
            String name = optionContract.getName();
            int i11 = n1.t.f28178j;
            long c11 = to.e.c();
            long e15 = yk.j.e1(14);
            o2.v f15 = jh.c.f();
            a11 = h2.l.a(lVar, false, a0.f22721h);
            al.d.C(name, a11, c11, e15, null, null, f15, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar4);
            pp.b.c(null, androidx.compose.ui.graphics.a.d(4294111986L), s0.g.f34069a, s0.g.f34069a, rVar4, 48, 13);
            float f16 = 12;
            String i12 = v.e.i(lVar, f16, rVar4, R.string.add_to_text, rVar4);
            long e16 = d2.w0.e(R.color.grey_text_new, rVar4);
            long e17 = yk.j.e1(12);
            o2.v g10 = jh.c.g();
            a12 = h2.l.a(lVar, false, a0.f22722i);
            al.d.C(i12, a12, e16, e17, null, null, g10, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130992);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f14), rVar4);
            PortfolioReviewResponse portfolioReviewResponse = this.f22913b;
            int size = portfolioReviewResponse.getPortfolios().size();
            Object obj2 = t0.m.f35080a;
            g1 g1Var26 = this.f22918g;
            if (size == 1) {
                rVar4.b0(-772244152);
                yk.j.T(portfolioReviewResponse.getPortfolios().get(0).getPortfolioName(), rVar4, 0, 0);
                rVar4.v();
                f10 = f14;
            } else {
                rVar4.b0(-772087540);
                List<FnoPortfolio> portfolios = portfolioReviewResponse.getPortfolios();
                FnoPortfolio B = yk.o.B(g1Var26);
                rVar4.b0(-301996109);
                Function1 function1 = this.f22914c;
                boolean h10 = rVar4.h(function1);
                f10 = f14;
                Object Q = rVar4.Q();
                if (h10 || Q == obj2) {
                    Q = new i0.t(function1, g1Var26, 2);
                    rVar4.k0(Q);
                }
                rVar4.v();
                yk.o.t(portfolios, B, (Function1) Q, rVar4, 72);
                rVar4.v();
            }
            String i13 = v.e.i(lVar, f13, rVar4, R.string.place_order, rVar4);
            long c15 = to.e.c();
            long e18 = yk.j.e1(12);
            o2.v g11 = jh.c.g();
            a13 = h2.l.a(lVar, false, a0.f22723j);
            al.d.C(i13, a13, c15, e18, null, null, g11, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
            float f17 = 10;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar4);
            rVar4.b0(-301974918);
            boolean h11 = rVar4.h(optionContract);
            Object Q2 = rVar4.Q();
            if (h11 || Q2 == obj2) {
                Q2 = new w.a(g1Var16, optionContract, g1Var17, g1Var18, 10);
                rVar4.k0(Q2);
            }
            rVar4.v();
            yk.o.u((Function1) Q2, rVar4, 0, 0);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar4);
            e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            rVar4.b0(693286680);
            b0.d dVar2 = b0.n.f2935a;
            g1.f fVar2 = g1.a.f16388j;
            l1 a38 = o1.a(dVar2, fVar2, rVar4, 0);
            rVar4.b0(-1323940314);
            int o03 = al.d.o0(rVar4);
            r1 C2 = rVar4.C();
            Function0 a39 = c2.k.a();
            b1.c j12 = androidx.compose.ui.layout.a.j(e10);
            if (rVar4.B() instanceof t0.f) {
                rVar4.e0();
                if (rVar4.F()) {
                    rVar4.n(a39);
                } else {
                    rVar4.n0();
                }
                c2.i j13 = jr.h.j(rVar4, a38, rVar4, C2);
                if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o03))) {
                    nn.d.s(o03, rVar4, o03, j13);
                }
                nn.d.q(0, j12, m2.a(rVar4), rVar4, 2058660585);
                q1 q1Var2 = q1.f2981a;
                b10 = q1Var2.b(lVar, 1.0f, true);
                rVar4.b0(-483455358);
                l1 a40 = b0.y.a(fVar, eVar, rVar4, 0);
                rVar4.b0(-1323940314);
                int o04 = al.d.o0(rVar4);
                r1 C3 = rVar4.C();
                Function0 a41 = c2.k.a();
                b1.c j14 = androidx.compose.ui.layout.a.j(b10);
                if (rVar4.B() instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.F()) {
                        rVar4.n(a41);
                    } else {
                        rVar4.n0();
                    }
                    c2.i j15 = jr.h.j(rVar4, a40, rVar4, C3);
                    if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o04))) {
                        nn.d.s(o04, rVar4, o04, j15);
                    }
                    nn.d.q(0, j14, m2.a(rVar4), rVar4, 2058660585);
                    e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                    rVar4.b0(693286680);
                    l1 a42 = o1.a(dVar2, fVar2, rVar4, 0);
                    rVar4.b0(-1323940314);
                    int o05 = al.d.o0(rVar4);
                    r1 C4 = rVar4.C();
                    Function0 a43 = c2.k.a();
                    b1.c j16 = androidx.compose.ui.layout.a.j(e11);
                    if (rVar4.B() instanceof t0.f) {
                        rVar4.e0();
                        if (rVar4.F()) {
                            rVar4.n(a43);
                        } else {
                            rVar4.n0();
                        }
                        c2.i j17 = jr.h.j(rVar4, a42, rVar4, C4);
                        if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o05))) {
                            nn.d.s(o05, rVar4, o05, j17);
                        }
                        nn.d.q(0, j16, m2.a(rVar4), rVar4, 2058660585);
                        String c16 = hl.f.c1(R.string.lots_text, rVar4);
                        long c17 = to.e.c();
                        o2.v g12 = jh.c.g();
                        long e19 = yk.j.e1(12);
                        a14 = h2.l.a(lVar, false, a0.f22724k);
                        al.d.C(c16, a14, c17, e19, null, null, g12, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
                        String d12 = hl.f.d1(R.string.lot_size_data, new Object[]{Integer.valueOf(this.f22924m.getLotSize())}, rVar4);
                        long d10 = androidx.compose.ui.graphics.a.d(4288651167L);
                        o2.v g13 = jh.c.g();
                        long e110 = yk.j.e1(12);
                        a15 = h2.l.a(lVar, false, a0.f22725l);
                        al.d.C(d12, a15, d10, e110, null, null, g13, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
                        rVar4.v();
                        rVar4.u();
                        rVar4.v();
                        rVar4.v();
                        float f18 = f10;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f18), rVar4);
                        a16 = h2.l.a(lVar, false, a0.f22726m);
                        al.d.f(a16, g1Var19, 0, false, rVar4, 48, 12);
                        rVar4.b0(1408563525);
                        g1 g1Var27 = this.f22925n;
                        if (((Boolean) g1Var27.getValue()).booleanValue()) {
                            String i14 = v.e.i(lVar, 4, rVar4, R.string.order_value_exceeds_margin_available_fno, rVar4);
                            long e20 = d2.w0.e(R.color.red_EB3B3B, rVar4);
                            long e111 = yk.j.e1(8);
                            o2.v g14 = jh.c.g();
                            a35 = h2.l.a(lVar, false, a0.f22727n);
                            al.d.C(i14, a35, e20, e111, null, null, g14, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130992);
                        }
                        rVar4.v();
                        rVar4.b0(1408585249);
                        g1 g1Var28 = this.f22926o;
                        if (((Boolean) g1Var28.getValue()).booleanValue() && !yk.o.z(g1Var27)) {
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 14), rVar4);
                        }
                        rVar4.v();
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f16), rVar4);
                        String c18 = hl.f.c1(R.string.margin_required_fno, rVar4);
                        long d11 = androidx.compose.ui.graphics.a.d(4282917091L);
                        o2.v g15 = jh.c.g();
                        long e112 = yk.j.e1(12);
                        a17 = h2.l.a(lVar, false, a0.f22728o);
                        al.d.C(c18, a17, d11, e112, null, null, g15, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f18), rVar4);
                        double doubleValue = ((Number) this.f22923l.getValue()).doubleValue();
                        long d13 = androidx.compose.ui.graphics.a.d(4280427042L);
                        o2.v g16 = jh.c.g();
                        long e113 = yk.j.e1(12);
                        a18 = h2.l.a(lVar, false, a0.f22729p);
                        al.d.l(doubleValue, a18, d13, e113, null, null, g16, 0L, null, null, 0L, 0, false, 0, 0, null, null, false, rVar4, 1576320, 0, 262064);
                        rVar4.v();
                        rVar4.u();
                        rVar4.v();
                        rVar4.v();
                        b11 = q1Var2.b(lVar, 1.0f, true);
                        rVar4.b0(-483455358);
                        l1 a44 = b0.y.a(fVar, eVar, rVar4, 0);
                        rVar4.b0(-1323940314);
                        int o06 = al.d.o0(rVar4);
                        r1 C5 = rVar4.C();
                        Function0 a45 = c2.k.a();
                        b1.c j18 = androidx.compose.ui.layout.a.j(b11);
                        if (rVar4.B() instanceof t0.f) {
                            rVar4.e0();
                            if (rVar4.F()) {
                                rVar4.n(a45);
                            } else {
                                rVar4.n0();
                            }
                            c2.i j19 = jr.h.j(rVar4, a44, rVar4, C5);
                            if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o06))) {
                                nn.d.s(o06, rVar4, o06, j19);
                            }
                            nn.d.q(0, j18, m2.a(rVar4), rVar4, 2058660585);
                            String c19 = hl.f.c1(R.string.price, rVar4);
                            long c20 = to.e.c();
                            o2.v g17 = jh.c.g();
                            long e114 = yk.j.e1(12);
                            a19 = h2.l.a(lVar, false, a0.f22730q);
                            al.d.C(c19, a19, c20, e114, null, null, g17, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f18), rVar4);
                            boolean booleanValue = ((Boolean) g1Var18.getValue()).booleanValue();
                            a20 = h2.l.a(androidx.compose.ui.focus.a.j(lVar, this.f22927p), false, a0.f22731r);
                            rVar4.b0(1408654362);
                            boolean h12 = rVar4.h(optionContract);
                            Object Q3 = rVar4.Q();
                            if (!h12 && Q3 != obj2) {
                                g1Var = g1Var16;
                            } else {
                                g1Var = g1Var16;
                                Q3 = new d2.y0(16, g1Var, optionContract);
                                rVar4.k0(Q3);
                            }
                            rVar4.v();
                            al.d.F(a20, g1Var17, booleanValue, (Function1) Q3, rVar4, 48, 0);
                            rVar4.b0(1408670275);
                            if (yk.o.A(g1Var28)) {
                                if (((Number) g1Var.getValue()).doubleValue() == 0.0d) {
                                    rVar4.b0(1408674318);
                                    c14 = hl.f.c1(R.string.price_too_low_fno, rVar4);
                                    rVar4.v();
                                } else if (z10) {
                                    rVar4.b0(1408677212);
                                    c14 = hl.f.c1(R.string.can_t_be_less_than_market_price, rVar4);
                                    rVar4.v();
                                } else {
                                    rVar4.b0(1408680319);
                                    c14 = hl.f.c1(R.string.can_t_be_greater_than_market_price, rVar4);
                                    rVar4.v();
                                }
                                String str = c14;
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar4);
                                long e21 = d2.w0.e(R.color.red_EB3B3B, rVar4);
                                long e115 = yk.j.e1(8);
                                o2.v g18 = jh.c.g();
                                a34 = h2.l.a(lVar, false, a0.f22732s);
                                al.d.C(str, a34, e21, e115, null, null, g18, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130992);
                            }
                            rVar4.v();
                            rVar4.b0(1408702881);
                            if (yk.o.z(g1Var27) && !yk.o.A(g1Var28)) {
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 14), rVar4);
                            }
                            rVar4.v();
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f16), rVar4);
                            String c110 = hl.f.c1(R.string.margin_available_fno, rVar4);
                            long d14 = androidx.compose.ui.graphics.a.d(4282917091L);
                            o2.v g19 = jh.c.g();
                            long e116 = yk.j.e1(12);
                            a21 = h2.l.a(lVar, false, a0.f22733t);
                            al.d.C(c110, a21, d14, e116, null, null, g19, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1576320, 0, 130992);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f18), rVar4);
                            double cashBalance = yk.o.B(g1Var26).getCashBalance();
                            long d15 = androidx.compose.ui.graphics.a.d(4280427042L);
                            o2.v g20 = jh.c.g();
                            long e117 = yk.j.e1(12);
                            a22 = h2.l.a(lVar, false, a0.f22734u);
                            al.d.l(cashBalance, a22, d15, e117, null, null, g20, 0L, null, null, 0L, 0, false, 0, 0, null, null, false, rVar4, 1576320, 0, 262064);
                            rVar4.v();
                            rVar4.u();
                            rVar4.v();
                            rVar4.v();
                            rVar4.v();
                            rVar4.u();
                            rVar4.v();
                            rVar4.v();
                            int intValue = ((Number) this.f22915d.getValue()).intValue();
                            g1 g1Var29 = this.f22928q;
                            if (intValue > 0) {
                                rVar4.b0(-763412376);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f18), rVar4);
                                e14 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                g1.f fVar3 = g1.a.f16389k;
                                rVar4.b0(693286680);
                                dVar = dVar2;
                                l1 a46 = o1.a(dVar, fVar3, rVar4, 48);
                                rVar4.b0(-1323940314);
                                int o07 = al.d.o0(rVar4);
                                r1 C6 = rVar4.C();
                                Function0 a47 = c2.k.a();
                                b1.c j20 = androidx.compose.ui.layout.a.j(e14);
                                f11 = f16;
                                if (rVar4.B() instanceof t0.f) {
                                    rVar4.e0();
                                    if (rVar4.F()) {
                                        rVar4.n(a47);
                                    } else {
                                        rVar4.n0();
                                    }
                                    c2.i j21 = jr.h.j(rVar4, a46, rVar4, C6);
                                    if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o07))) {
                                        nn.d.s(o07, rVar4, o07, j21);
                                    }
                                    nn.d.q(0, j20, m2.a(rVar4), rVar4, 2058660585);
                                    String c111 = hl.f.c1(R.string.set_a_bracket_order_fno, rVar4);
                                    o2.v g21 = jh.c.g();
                                    long e22 = d2.w0.e(R.color.black_1A1A1A, rVar4);
                                    long e118 = yk.j.e1(12);
                                    a32 = h2.l.a(lVar, false, a0.f22735v);
                                    al.d.C(c111, a32, e22, e118, null, null, g21, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130992);
                                    q1Var = q1Var2;
                                    b14 = q1Var.b(lVar, 1.0f, true);
                                    androidx.compose.foundation.layout.a.c(b14, rVar4);
                                    boolean booleanValue2 = ((Boolean) g1Var29.getValue()).booleanValue();
                                    g1Var2 = g1Var18;
                                    m0.r1 I = yk.o.I(androidx.compose.ui.graphics.a.d(4283048166L), n1.t.c(androidx.compose.ui.graphics.a.d(4283048166L), 0.5f), to.e.f(), n1.t.c(to.e.f(), 0.5f), rVar4, 996);
                                    a33 = h2.l.a(lVar, false, a0.f22736w);
                                    rVar4.b0(2045681475);
                                    Object Q4 = rVar4.Q();
                                    if (Q4 == obj2) {
                                        Q4 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var29, 4, rVar4);
                                    }
                                    rVar4.v();
                                    f7.a(booleanValue2, (Function1) Q4, a33, false, null, I, rVar4, 48, 24);
                                    rVar4.v();
                                    rVar4.u();
                                    rVar4.v();
                                    rVar4.v();
                                    rVar4.v();
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                f11 = f16;
                                g1Var2 = g1Var18;
                                q1Var = q1Var2;
                                dVar = dVar2;
                                rVar4.b0(-761847341);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 56), rVar4);
                                rVar4.v();
                            }
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f17), rVar4);
                            rVar4.b0(-301657300);
                            if (((Boolean) g1Var29.getValue()).booleanValue()) {
                                e13 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                g1.o m10 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.t(e13));
                                rVar4.b0(693286680);
                                l1 a48 = o1.a(dVar, fVar2, rVar4, 0);
                                rVar4.b0(-1323940314);
                                int o08 = al.d.o0(rVar4);
                                r1 C7 = rVar4.C();
                                Function0 a49 = c2.k.a();
                                b1.c j22 = androidx.compose.ui.layout.a.j(m10);
                                if (rVar4.B() instanceof t0.f) {
                                    rVar4.e0();
                                    if (rVar4.F()) {
                                        rVar4.n(a49);
                                    } else {
                                        rVar4.n0();
                                    }
                                    c2.i j23 = jr.h.j(rVar4, a48, rVar4, C7);
                                    if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o08))) {
                                        nn.d.s(o08, rVar4, o08, j23);
                                    }
                                    nn.d.q(0, j22, m2.a(rVar4), rVar4, 2058660585);
                                    b12 = q1Var.b(androidx.compose.foundation.layout.d.t(lVar), 1.0f, true);
                                    rVar4.b0(733328855);
                                    g1.g gVar = g1.a.f16379a;
                                    b0.v c21 = b0.s.c(gVar, false, rVar4, 0);
                                    rVar4.b0(-1323940314);
                                    int o09 = al.d.o0(rVar4);
                                    r1 C8 = rVar4.C();
                                    Function0 a50 = c2.k.a();
                                    b1.c j24 = androidx.compose.ui.layout.a.j(b12);
                                    if (rVar4.B() instanceof t0.f) {
                                        rVar4.e0();
                                        if (rVar4.F()) {
                                            rVar4.n(a50);
                                        } else {
                                            rVar4.n0();
                                        }
                                        t0.t.v0(rVar4, c21, c2.k.c());
                                        t0.t.v0(rVar4, C8, c2.k.d());
                                        c2.i b15 = c2.k.b();
                                        if (rVar4.F() || !Intrinsics.a(rVar4.Q(), Integer.valueOf(o09))) {
                                            nn.d.s(o09, rVar4, o09, b15);
                                        }
                                        nn.d.q(0, j24, m2.a(rVar4), rVar4, 2058660585);
                                        float f19 = 32;
                                        f12 = f11;
                                        g1Var4 = g1Var29;
                                        g1Var7 = g1Var19;
                                        g1Var8 = g1Var26;
                                        g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, f19, s0.g.f34069a, 11);
                                        rVar = rVar4;
                                        rVar.b0(-483455358);
                                        l1 a51 = b0.y.a(fVar, eVar, rVar, 0);
                                        rVar.b0(-1323940314);
                                        int o010 = al.d.o0(rVar);
                                        r1 C9 = rVar.C();
                                        Function0 a52 = c2.k.a();
                                        b1.c j25 = androidx.compose.ui.layout.a.j(x10);
                                        if (rVar.B() instanceof t0.f) {
                                            rVar.e0();
                                            if (rVar.F()) {
                                                rVar.n(a52);
                                            } else {
                                                rVar.n0();
                                            }
                                            c2.i j26 = jr.h.j(rVar, a51, rVar, C9);
                                            if (rVar.F() || !Intrinsics.a(rVar.Q(), Integer.valueOf(o010))) {
                                                nn.d.s(o010, rVar, o010, j26);
                                            }
                                            nn.d.q(0, j25, m2.a(rVar), rVar, 2058660585);
                                            String c112 = hl.f.c1(R.string.stop_loss_fno, rVar);
                                            a24 = h2.l.a(lVar, false, a0.f22737x);
                                            rVar.b0(1966601125);
                                            Object Q5 = rVar.Q();
                                            obj = obj2;
                                            if (Q5 == obj) {
                                                g1Var9 = g1Var20;
                                                Q5 = new o(this.f22932u, g1Var9, 6);
                                                rVar.k0(Q5);
                                            } else {
                                                g1Var9 = g1Var20;
                                            }
                                            rVar.v();
                                            yk.o.a(a24, c112, g1Var9, false, false, false, (Function1) Q5, rVar, 1573248, 56);
                                            String i15 = v.e.i(lVar, f13, rVar, R.string.stop_loss_percentage_fno, rVar);
                                            a25 = h2.l.a(lVar, false, a0.f22738y);
                                            rVar.b0(1966623657);
                                            Object Q6 = rVar.Q();
                                            if (Q6 == obj) {
                                                g1Var10 = g1Var21;
                                                Q6 = new o(this.f22933v, g1Var10, 7);
                                                rVar.k0(Q6);
                                            } else {
                                                g1Var10 = g1Var21;
                                            }
                                            rVar.v();
                                            yk.o.a(a25, i15, g1Var10, false, false, false, (Function1) Q6, rVar, 1573248, 56);
                                            rVar.b0(1966629889);
                                            g1 g1Var30 = this.f22934w;
                                            if (((Boolean) g1Var30.getValue()).booleanValue()) {
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar);
                                            }
                                            rVar.v();
                                            rVar.b0(1966636005);
                                            g1 g1Var31 = this.f22935x;
                                            if (((Boolean) g1Var31.getValue()).booleanValue()) {
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar);
                                                if (Float.parseFloat((String) g1Var10.getValue()) > 100.0d) {
                                                    rVar.b0(836408249);
                                                    c13 = hl.f.c1(R.string.stop_loss_too_high_fno, rVar);
                                                    rVar.v();
                                                } else {
                                                    rVar.b0(836642547);
                                                    c13 = hl.f.c1(R.string.stop_loss_cannot_be_negative, rVar);
                                                    rVar.v();
                                                }
                                                String str2 = c13;
                                                long e23 = d2.w0.e(R.color.red_EB3B3B, rVar);
                                                long e119 = yk.j.e1(10);
                                                o2.v g22 = jh.c.g();
                                                a31 = h2.l.a(lVar, false, a0.f22739z);
                                                al.d.C(str2, a31, e23, e119, null, null, g22, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                                            }
                                            rVar.v();
                                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar);
                                            String c113 = hl.f.c1(R.string.stop_loss_price_fno, rVar);
                                            a26 = h2.l.a(lVar, false, a0.A);
                                            rVar.b0(1966693797);
                                            Object Q7 = rVar.Q();
                                            if (Q7 == obj) {
                                                g1Var11 = g1Var30;
                                                g1Var12 = g1Var10;
                                                g1Var13 = g1Var22;
                                                Q7 = new o(this.f22936y, g1Var13, 8);
                                                rVar.k0(Q7);
                                            } else {
                                                g1Var11 = g1Var30;
                                                g1Var12 = g1Var10;
                                                g1Var13 = g1Var22;
                                            }
                                            rVar.v();
                                            yk.o.a(a26, c113, g1Var13, false, true, false, (Function1) Q7, rVar, 1597824, 40);
                                            rVar.v();
                                            rVar.u();
                                            rVar.v();
                                            rVar.v();
                                            rVar.v();
                                            rVar.u();
                                            rVar.v();
                                            rVar.v();
                                            long e24 = d2.w0.e(R.color.lightColorSeparator, rVar);
                                            c10 = androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.d.q(lVar, 1), 1.0f);
                                            pp.b.c(c10, e24, s0.g.f34069a, s0.g.f34069a, rVar, 6, 12);
                                            b13 = q1Var.b(androidx.compose.foundation.layout.d.t(lVar), 1.0f, true);
                                            rVar.b0(733328855);
                                            b0.v c22 = b0.s.c(gVar, false, rVar, 0);
                                            rVar.b0(-1323940314);
                                            int o011 = al.d.o0(rVar);
                                            r1 C10 = rVar.C();
                                            Function0 a53 = c2.k.a();
                                            b1.c j27 = androidx.compose.ui.layout.a.j(b13);
                                            if (rVar.B() instanceof t0.f) {
                                                rVar.e0();
                                                if (rVar.F()) {
                                                    rVar.n(a53);
                                                } else {
                                                    rVar.n0();
                                                }
                                                t0.t.v0(rVar, c22, c2.k.c());
                                                t0.t.v0(rVar, C10, c2.k.d());
                                                c2.i b16 = c2.k.b();
                                                if (rVar.F() || !Intrinsics.a(rVar.Q(), Integer.valueOf(o011))) {
                                                    nn.d.s(o011, rVar, o011, b16);
                                                }
                                                nn.d.q(0, j27, m2.a(rVar), rVar, 2058660585);
                                                g1 g1Var32 = g1Var11;
                                                g1Var6 = g1Var12;
                                                g1Var3 = g1Var;
                                                g1.o x11 = androidx.compose.foundation.layout.a.x(lVar, f19, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                                                rVar.b0(-483455358);
                                                l1 a54 = b0.y.a(fVar, eVar, rVar, 0);
                                                rVar.b0(-1323940314);
                                                int o012 = al.d.o0(rVar);
                                                r1 C11 = rVar.C();
                                                Function0 a55 = c2.k.a();
                                                b1.c j28 = androidx.compose.ui.layout.a.j(x11);
                                                if (rVar.B() instanceof t0.f) {
                                                    rVar.e0();
                                                    if (rVar.F()) {
                                                        rVar.n(a55);
                                                    } else {
                                                        rVar.n0();
                                                    }
                                                    c2.i j29 = jr.h.j(rVar, a54, rVar, C11);
                                                    if (rVar.F() || !Intrinsics.a(rVar.Q(), Integer.valueOf(o012))) {
                                                        nn.d.s(o012, rVar, o012, j29);
                                                    }
                                                    nn.d.q(0, j28, m2.a(rVar), rVar, 2058660585);
                                                    String c114 = hl.f.c1(R.string.book_profit_fno, rVar);
                                                    a27 = h2.l.a(lVar, false, a0.B);
                                                    rVar.b0(1966738057);
                                                    Object Q8 = rVar.Q();
                                                    if (Q8 == obj) {
                                                        g1Var14 = g1Var23;
                                                        Q8 = new o(this.C, g1Var14, 9);
                                                        rVar.k0(Q8);
                                                    } else {
                                                        g1Var14 = g1Var23;
                                                    }
                                                    rVar.v();
                                                    yk.o.a(a27, c114, g1Var14, false, false, false, (Function1) Q8, rVar, 1573248, 56);
                                                    String i16 = v.e.i(lVar, f13, rVar, R.string.book_profit_percentage_fno, rVar);
                                                    a28 = h2.l.a(lVar, false, a0.C);
                                                    rVar.b0(1966760909);
                                                    Object Q9 = rVar.Q();
                                                    if (Q9 == obj) {
                                                        g1Var5 = g1Var24;
                                                        Q9 = new o(this.D, g1Var5, 10);
                                                        rVar.k0(Q9);
                                                    } else {
                                                        g1Var5 = g1Var24;
                                                    }
                                                    rVar.v();
                                                    yk.o.a(a28, i16, g1Var5, false, false, false, (Function1) Q9, rVar, 1573248, 56);
                                                    rVar.b0(1966767263);
                                                    if (yk.o.C(g1Var31)) {
                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar);
                                                    }
                                                    rVar.v();
                                                    rVar.b0(1966773330);
                                                    if (yk.o.D(g1Var32)) {
                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar);
                                                        if (Float.parseFloat((String) g1Var5.getValue()) > 100.0d) {
                                                            rVar.b0(840669044);
                                                            c12 = hl.f.c1(R.string.profit_percent_too_high_fno, rVar);
                                                            rVar.v();
                                                        } else {
                                                            rVar.b0(840908209);
                                                            c12 = hl.f.c1(R.string.book_profit_cannot_be_negative, rVar);
                                                            rVar.v();
                                                        }
                                                        String str3 = c12;
                                                        long e25 = d2.w0.e(R.color.red_EB3B3B, rVar);
                                                        long e120 = yk.j.e1(10);
                                                        o2.v g23 = jh.c.g();
                                                        a30 = h2.l.a(lVar, false, a0.D);
                                                        al.d.C(str3, a30, e25, e120, null, null, g23, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                                                    }
                                                    rVar.v();
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar);
                                                    String c115 = hl.f.c1(R.string.book_profit_price_fno, rVar);
                                                    a29 = h2.l.a(lVar, false, a0.E);
                                                    rVar.b0(1966831721);
                                                    Object Q10 = rVar.Q();
                                                    if (Q10 == obj) {
                                                        g1Var15 = g1Var25;
                                                        Q10 = new o(this.E, g1Var15, 11);
                                                        rVar.k0(Q10);
                                                    } else {
                                                        g1Var15 = g1Var25;
                                                    }
                                                    rVar.v();
                                                    yk.o.a(a29, c115, g1Var15, false, true, false, (Function1) Q10, rVar, 1597824, 40);
                                                    rVar.v();
                                                    rVar.u();
                                                    rVar.v();
                                                    rVar.v();
                                                    rVar.v();
                                                    rVar.u();
                                                    rVar.v();
                                                    rVar.v();
                                                    rVar.v();
                                                    rVar.u();
                                                    rVar.v();
                                                    rVar.v();
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f13), rVar);
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
                                g1Var3 = g1Var;
                                rVar = rVar4;
                                g1Var4 = g1Var29;
                                f12 = f11;
                                g1Var5 = g1Var24;
                                g1Var6 = g1Var21;
                                g1Var7 = g1Var19;
                                g1Var8 = g1Var26;
                                obj = obj2;
                            }
                            rVar.v();
                            boolean E = yk.o.E(this.F);
                            e12 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                            a23 = h2.l.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(e12, 48), h0.h.b(f18)), false, p0.f22904b);
                            i1 i1Var = m0.m0.f26467a;
                            f1 a56 = m0.m0.a(d2.w0.e(R.color.purpleSubmitBackground, rVar), 0L, rVar, 0, 14);
                            float f20 = 0;
                            i1 b17 = androidx.compose.foundation.layout.a.b(s0.g.f34069a, f20, s0.g.f34069a, f20, 5);
                            rVar.b0(-301387337);
                            boolean i17 = rVar.i(z10) | rVar.h(optionContract) | rVar.h(cVar);
                            Object Q11 = rVar.Q();
                            if (!i17 && Q11 != obj) {
                                rVar2 = rVar;
                            } else {
                                rVar2 = rVar;
                                Q11 = new o0(z10, g1Var3, optionContract, g1Var7, g1Var6, g1Var5, cVar, g1Var2, g1Var8, g1Var4);
                                rVar2.k0(Q11);
                            }
                            rVar2.v();
                            pp.b.a((Function0) Q11, a23, E, null, null, null, null, a56, b17, e.a(), rVar2, 905969664, 120);
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
