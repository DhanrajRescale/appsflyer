package pg;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b0.l1;
import b0.o1;
import b0.v;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class l extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f31048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f31049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f31050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f31051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f31052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f31053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f31054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f31055h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f31056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l3 l3Var, g1 g1Var, l3 l3Var2, g1 g1Var2, Context context, g1 g1Var3, g1 g1Var4, Function0 function0, g1 g1Var5) {
        super(3);
        this.f31048a = l3Var;
        this.f31049b = g1Var;
        this.f31050c = l3Var2;
        this.f31051d = g1Var2;
        this.f31052e = context;
        this.f31053f = g1Var3;
        this.f31054g = g1Var4;
        this.f31055h = function0;
        this.f31056i = g1Var5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, boolean] */
    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        ?? r62;
        boolean z10;
        c0.c item = (c0.c) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((intValue & 81) == 16) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.l lVar = g1.l.f16404b;
        float f10 = 16;
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), nVar);
        g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
        float f11 = 4;
        float f12 = 12;
        h0.g b10 = h0.h.b(f12);
        g1 g1Var = this.f31049b;
        l3 l3Var = this.f31048a;
        pp.b.b(e10, b10, 0L, null, f11, b1.d.c(-1629105577, new i(0, g1Var, l3Var), nVar), nVar, 1769478, 28);
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1433186225);
        l3 l3Var2 = this.f31050c;
        boolean a10 = Intrinsics.a((Boolean) l3Var2.getValue(), Boolean.TRUE);
        Context context = this.f31052e;
        if (a10) {
            r62 = 0;
            pp.b.b(v.e.f(lVar, f10, rVar2, lVar, 1.0f), h0.h.b(f12), 0L, null, f11, b1.d.c(910347676, new k(this.f31051d, context, l3Var, 0), rVar2), rVar2, 1769478, 28);
        } else {
            r62 = 0;
        }
        rVar2.s(r62);
        rVar2.b0(-1433138888);
        Boolean bool = (Boolean) l3Var2.getValue();
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.a(bool, bool2)) {
            pp.b.b(v.e.f(lVar, f10, rVar2, lVar, 1.0f), h0.h.b(f12), 0L, null, f11, b1.d.c(1556289093, new i(1, this.f31053f, l3Var), rVar2), rVar2, 1769478, 28);
        }
        rVar2.s(r62);
        rVar2.b0(-1433069558);
        if (Intrinsics.a((Boolean) l3Var2.getValue(), bool2)) {
            pp.b.b(v.e.f(lVar, f10, rVar2, lVar, 1.0f), h0.h.b(f12), 0L, null, f11, b1.d.c(-2006502748, new k(this.f31054g, context, l3Var, 1), rVar2), rVar2, 1769478, 28);
        }
        rVar2.s(r62);
        if (Intrinsics.a((Boolean) l3Var2.getValue(), bool2)) {
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
            rVar2.b0(-1432997614);
            FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) l3Var.getValue();
            if (fnoPortfolioHolding != null && fnoPortfolioHolding.isModel()) {
                al.d.C(hl.f.c1(R.string.text_returns, rVar2), null, n1.t.f28170b, yk.j.e1(16), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
                pp.b.b(androidx.compose.foundation.layout.d.e(lVar, 1.0f), h0.h.b(f12), n1.t.f28173e, null, f11, b1.d.c(-501708088, new o0.g(l3Var, 4), rVar2), rVar2, 1769862, 24);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
            }
            rVar2.s(r62);
            g1.o e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            g1.f fVar = g1.a.f16389k;
            rVar2.b0(693286680);
            l1 a11 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i10 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e11);
            boolean z11 = rVar2.f35166a instanceof t0.f;
            if (z11) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                    nn.d.s(i10, rVar2, i10, iVar3);
                }
                nn.d.q(r62, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.C(hl.f.c1(R.string.options_text, rVar2), null, n1.t.f28170b, yk.j.e1(16), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1576320, 0, 130994);
                if (1.0f > 0.0d) {
                    androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar2);
                    rVar2.b0(1074954820);
                    Object Q = rVar2.Q();
                    Object obj4 = t0.m.f35080a;
                    g1 g1Var2 = this.f31056i;
                    if (Q == obj4) {
                        Q = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var2, 18, rVar2);
                    }
                    rVar2.s(false);
                    g1.o k10 = androidx.compose.foundation.a.k(lVar, (Function0) Q, 7);
                    rVar2.b0(733328855);
                    v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int i11 = rVar2.P;
                    r1 o11 = rVar2.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(k10);
                    if (z11) {
                        rVar2.e0();
                        if (rVar2.O) {
                            rVar2.n(jVar);
                        } else {
                            rVar2.n0();
                        }
                        t0.t.v0(rVar2, c10, iVar);
                        t0.t.v0(rVar2, o11, iVar2);
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                            nn.d.s(i11, rVar2, i11, iVar3);
                        }
                        nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                        if (!((Boolean) g1Var2.getValue()).booleanValue()) {
                            rVar2.b0(571130671);
                            androidx.compose.foundation.a.c(w0.u(R.drawable.ic_chart, rVar2, 6), null, null, null, null, s0.g.f34069a, null, rVar2, 56, 124);
                            rVar2.s(false);
                            z10 = false;
                        } else {
                            rVar2.b0(571364752);
                            androidx.compose.foundation.a.c(w0.u(R.drawable.ic_list, rVar2, 6), null, null, null, null, s0.g.f34069a, null, rVar2, 56, 124);
                            z10 = false;
                            rVar2.s(false);
                        }
                        v.e.y(rVar2, z10, true, z10, z10);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                        q1.b u10 = w0.u(R.drawable.ic_filter_list, rVar2, 6);
                        rVar2.b0(1074984087);
                        Function0 function0 = this.f31055h;
                        boolean h10 = rVar2.h(function0);
                        Object Q2 = rVar2.Q();
                        if (h10 || Q2 == obj4) {
                            Q2 = v.e.n(function0, 6, rVar2);
                        }
                        rVar2.s(false);
                        androidx.compose.foundation.a.c(u10, null, androidx.compose.foundation.a.k(lVar, (Function0) Q2, 7), null, null, s0.g.f34069a, null, rVar2, 56, 120);
                        v.e.y(rVar2, false, true, false, false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
