package v;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.homepage.data.HomeMarketDto;
import d2.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.m7;
import m0.n5;
import t0.g1;
import t0.m2;
import t0.r1;
import w.q1;
import w.u1;
import w.y1;
import w.z1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f37631a = i10;
        this.f37632b = obj;
        this.f37633c = obj2;
        this.f37634d = obj3;
        this.f37635e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void a(t0.n nVar, int i10) {
        float f10;
        float f11;
        ?? r32;
        j2.c cVar;
        o2.v vVar;
        int h10;
        j2.e i11;
        float f12;
        boolean z10;
        o2.v vVar2;
        long j10;
        g1.g gVar = g1.a.f16379a;
        Object obj = t0.m.f35080a;
        g1.e eVar = g1.a.f16391m;
        g1.l lVar = g1.l.f16404b;
        int i12 = this.f37631a;
        Object obj2 = this.f37635e;
        Object obj3 = this.f37634d;
        Object obj4 = this.f37633c;
        Object obj5 = this.f37632b;
        switch (i12) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                u1 u1Var = (u1) obj5;
                g gVar2 = new g((w.f0) obj4, 1);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1338768149);
                y1 y1Var = z1.f38739a;
                rVar2.b0(-142660079);
                Object c10 = u1Var.c();
                rVar2.b0(-438678252);
                if (Intrinsics.a(c10, obj3)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar2.s(false);
                Float valueOf = Float.valueOf(f10);
                Object value = u1Var.f38689c.getValue();
                rVar2.b0(-438678252);
                if (Intrinsics.a(value, obj3)) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                rVar2.s(false);
                q1 o10 = w.e.o(u1Var, valueOf, Float.valueOf(f11), (w.f0) gVar2.b(u1Var.e(), rVar2, 0), y1Var, rVar2, 0);
                rVar2.s(false);
                rVar2.s(false);
                rVar2.b0(-450541522);
                boolean h11 = rVar2.h(o10);
                Object Q = rVar2.Q();
                if (!h11 && Q != obj) {
                    r32 = 0;
                } else {
                    r32 = 0;
                    Q = new x(o10, 0);
                    rVar2.k0(Q);
                }
                rVar2.s(r32);
                g1.o q10 = androidx.compose.ui.graphics.a.q(lVar, (Function1) Q);
                hu.c cVar2 = (hu.c) obj2;
                rVar2.b0(733328855);
                b0.v c11 = b0.s.c(gVar, r32, rVar2, r32);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                r1 o11 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(q10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, c11, c2.k.f7749e);
                    t0.t.v0(rVar2, o11, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar2, i13, iVar);
                    }
                    e.w(rVar2, j11, rVar2, 0, 2058660585);
                    cVar2.b(obj3, rVar2, 0);
                    e.y(rVar2, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1 g1Var = (g1) obj4;
                b0.w wVar = (b0.w) obj3;
                Function1 function1 = (Function1) obj2;
                int i14 = 0;
                for (Object obj6 : (List) obj5) {
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        hb.v vVar3 = (hb.v) obj6;
                        String str = vVar3.f18232b;
                        long j12 = 4288908031L;
                        String str2 = vVar3.f18231a;
                        if (str != null && str.length() != 0) {
                            t0.r rVar4 = (t0.r) nVar;
                            rVar4.b0(-1863519392);
                            cVar = new j2.c();
                            long S = kp.j.S(15, rVar4, 6);
                            if (((Number) g1Var.getValue()).intValue() == i14) {
                                vVar2 = jh.c.f21373b;
                            } else {
                                vVar2 = jh.c.f21372a;
                            }
                            o2.v vVar4 = vVar2;
                            if (((Number) g1Var.getValue()).intValue() == i14) {
                                j12 = 4283048166L;
                            }
                            h10 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j12), S, null, null, null, vVar4, null, 0L, null, null, null, 0L, null, null, 65500));
                            try {
                                cVar.d(str2 + "\n");
                                Unit unit = Unit.f23355a;
                                cVar.f(h10);
                                rVar4.b0(-1307021994);
                                String str3 = vVar3.f18232b;
                                if (str3.length() != 0) {
                                    o2.d0 d0Var = o2.d0.f29465g;
                                    long S2 = kp.j.S(10, rVar4, 6);
                                    o2.v vVar5 = jh.c.f21372a;
                                    if (((Number) g1Var.getValue()).intValue() == i14) {
                                        j10 = 2568624666L;
                                    } else {
                                        j10 = 4291151301L;
                                    }
                                    h10 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j10), S2, d0Var, null, null, vVar5, null, 0L, null, null, null, 0L, null, null, 65496));
                                    try {
                                        cVar.d(str3);
                                    } finally {
                                    }
                                }
                                rVar4.s(false);
                                i11 = cVar.i();
                                rVar4.s(false);
                            } finally {
                            }
                        } else {
                            t0.r rVar5 = (t0.r) nVar;
                            rVar5.b0(-1864185334);
                            cVar = new j2.c();
                            long S3 = kp.j.S(15, rVar5, 6);
                            if (((Number) g1Var.getValue()).intValue() == i14) {
                                vVar = jh.c.f21373b;
                            } else {
                                vVar = jh.c.f21372a;
                            }
                            o2.v vVar6 = vVar;
                            if (((Number) g1Var.getValue()).intValue() == i14) {
                                j12 = 4283048166L;
                            }
                            h10 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j12), S3, null, null, null, vVar6, null, 0L, null, null, null, 0L, null, null, 65500));
                            try {
                                cVar.d(str2 + "\n");
                                Unit unit2 = Unit.f23355a;
                                cVar.f(h10);
                                i11 = cVar.i();
                                rVar5.s(false);
                            } finally {
                            }
                        }
                        if (((Number) g1Var.getValue()).intValue() == i14) {
                            f12 = 1.0f;
                            z10 = true;
                        } else {
                            f12 = 1.0f;
                            z10 = false;
                        }
                        g1.o a10 = h2.l.a(wVar.a(androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(lVar, f12), kp.j.R(4, nVar), s0.g.f34069a, 2), f12), g1.a.f16383e), false, ac.h.f334c);
                        t0.r rVar6 = (t0.r) nVar;
                        rVar6.b0(-1306981304);
                        boolean h12 = rVar6.h(function1) | rVar6.f(i14);
                        Object Q2 = rVar6.Q();
                        if (h12 || Q2 == obj) {
                            Q2 = new l0.v(i14, 1, function1);
                            rVar6.k0(Q2);
                        }
                        rVar6.s(false);
                        m7.a(z10, (Function0) Q2, a10, false, b1.d.c(1000566745, new m0.o0(5, wVar, vVar3, i11), rVar6), null, null, 0L, 0L, rVar6, 24576, 488);
                        i14 = i15;
                    } else {
                        vt.y.j();
                        throw null;
                    }
                }
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar7 = (t0.r) nVar;
                    if (rVar7.G()) {
                        rVar7.V();
                        return;
                    }
                }
                g1.o e10 = androidx.compose.foundation.layout.d.e((g1.o) obj5, 1.0f);
                b0.f fVar = b0.n.f2937c;
                HomeMarketDto homeMarketDto = (HomeMarketDto) obj4;
                e0.j0 j0Var = (e0.j0) obj3;
                Function2 function2 = (Function2) obj2;
                t0.r rVar8 = (t0.r) nVar;
                rVar8.b0(-483455358);
                l1 a11 = b0.y.a(fVar, eVar, rVar8, 6);
                rVar8.b0(-1323940314);
                int i16 = rVar8.P;
                r1 o12 = rVar8.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j13 = androidx.compose.ui.layout.a.j(e10);
                boolean z11 = rVar8.f35166a instanceof t0.f;
                if (z11) {
                    rVar8.e0();
                    if (rVar8.O) {
                        rVar8.n(jVar2);
                    } else {
                        rVar8.n0();
                    }
                    c2.i iVar2 = c2.k.f7749e;
                    t0.t.v0(rVar8, a11, iVar2);
                    c2.i iVar3 = c2.k.f7748d;
                    t0.t.v0(rVar8, o12, iVar3);
                    c2.i iVar4 = c2.k.f7750f;
                    if (rVar8.O || !Intrinsics.a(rVar8.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar8, i16, iVar4);
                    }
                    e.w(rVar8, j13, rVar8, 0, 2058660585);
                    float f13 = 24;
                    g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f13, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                    g1.f fVar2 = g1.a.f16390l;
                    rVar8.b0(693286680);
                    l1 a12 = o1.a(b0.n.f2935a, fVar2, rVar8, 48);
                    rVar8.b0(-1323940314);
                    int i17 = rVar8.P;
                    r1 o13 = rVar8.o();
                    b1.c j14 = androidx.compose.ui.layout.a.j(x10);
                    if (z11) {
                        rVar8.e0();
                        if (rVar8.O) {
                            rVar8.n(jVar2);
                        } else {
                            rVar8.n0();
                        }
                        t0.t.v0(rVar8, a12, iVar2);
                        t0.t.v0(rVar8, o13, iVar3);
                        if (rVar8.O || !Intrinsics.a(rVar8.Q(), Integer.valueOf(i17))) {
                            nn.d.s(i17, rVar8, i17, iVar4);
                        }
                        e.w(rVar8, j14, rVar8, 0, 2058660585);
                        float f14 = 20;
                        al.d.C(homeMarketDto.getTitle(), h2.l.a(androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.a(lVar, 0.1f), s0.g.f34069a, f14, 1), false, hf.b.f18343p), w0.e(R.color.grey_323232, rVar8), yk.j.e1(36), null, null, jh.c.f21390s, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar8, 1575936, 0, 130992);
                        if (1.0f > 0.0d) {
                            androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar8);
                            androidx.compose.foundation.a.c(w0.u(R.drawable.ic_market_home_icon, rVar8, 6), null, h2.l.a(androidx.compose.ui.draw.a.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, f13), 22), 0.5f), false, hf.b.f18344q), null, null, s0.g.f34069a, null, rVar8, 56, 120);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f14), rVar8);
                            rVar8.s(false);
                            rVar8.s(true);
                            rVar8.s(false);
                            rVar8.s(false);
                            al.d.C(homeMarketDto.getSubTitle(), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, f13, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), false, hf.b.f18345r), w0.e(R.color.grey_323232, rVar8), yk.j.e1(16), null, null, jh.c.f21380i, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar8, 1575936, 0, 130992);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 14), rVar8);
                            hf.z.f(h2.l.a(lVar, false, hf.b.f18346s), homeMarketDto.getMarketCategories(), j0Var, function2, rVar8, 64, 0);
                            pp.b.c(e.f(lVar, 16, rVar8, lVar, 1.0f), w0.e(R.color.separator_color_new, rVar8), s0.g.f34069a, s0.g.f34069a, rVar8, 6, 12);
                            hf.z.g(null, homeMarketDto.getMarketCategories(), j0Var, function2, rVar8, 64, 1);
                            e.y(rVar8, false, true, false, false);
                            return;
                        }
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
            case 3:
                if ((i10 & 11) == 2) {
                    t0.r rVar9 = (t0.r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                t0.r rVar10 = (t0.r) nVar;
                rVar10.b0(2105165038);
                Object Q3 = rVar10.Q();
                if (Q3 == obj) {
                    Q3 = e.e(rVar10);
                }
                rVar10.s(false);
                ListItem listItem = (ListItem) obj4;
                g1.o a13 = h2.l.a(androidx.compose.foundation.a.j(lVar, (a0.l) Q3, n5.b(w0.e(R.color.purple_663549E3, rVar10)), false, null, new lf.r(1, (AnalyticEvent) obj3, listItem, (Function2) obj5), 28), false, lf.d.f24678x);
                g1.o oVar = (g1.o) obj2;
                rVar10.b0(733328855);
                b0.v c12 = b0.s.c(gVar, false, rVar10, 0);
                rVar10.b0(-1323940314);
                int i18 = rVar10.P;
                r1 o14 = rVar10.o();
                c2.l.M.getClass();
                c2.j jVar3 = c2.k.f7746b;
                b1.c j15 = androidx.compose.ui.layout.a.j(a13);
                boolean z12 = rVar10.f35166a instanceof t0.f;
                if (z12) {
                    rVar10.e0();
                    if (rVar10.O) {
                        rVar10.n(jVar3);
                    } else {
                        rVar10.n0();
                    }
                    c2.i iVar5 = c2.k.f7749e;
                    t0.t.v0(rVar10, c12, iVar5);
                    c2.i iVar6 = c2.k.f7748d;
                    t0.t.v0(rVar10, o14, iVar6);
                    c2.i iVar7 = c2.k.f7750f;
                    if (rVar10.O || !Intrinsics.a(rVar10.Q(), Integer.valueOf(i18))) {
                        nn.d.s(i18, rVar10, i18, iVar7);
                    }
                    e.w(rVar10, j15, rVar10, 0, 2058660585);
                    rVar10.b0(-483455358);
                    l1 a14 = b0.y.a(b0.n.f2937c, eVar, rVar10, 48);
                    rVar10.b0(-1323940314);
                    int i19 = rVar10.P;
                    r1 o15 = rVar10.o();
                    b1.c j16 = androidx.compose.ui.layout.a.j(lVar);
                    if (z12) {
                        rVar10.e0();
                        if (rVar10.O) {
                            rVar10.n(jVar3);
                        } else {
                            rVar10.n0();
                        }
                        t0.t.v0(rVar10, a14, iVar5);
                        t0.t.v0(rVar10, o15, iVar6);
                        if (rVar10.O || !Intrinsics.a(rVar10.Q(), Integer.valueOf(i19))) {
                            nn.d.s(i19, rVar10, i19, iVar7);
                        }
                        j16.b(new m2(rVar10), rVar10, 0);
                        rVar10.b0(2058660585);
                        y8.h hVar = new y8.h((Context) rVar10.m(AndroidCompositionLocals_androidKt.f1428b));
                        hVar.f41338c = listItem.getImageUrl();
                        hVar.b();
                        q6.l.d(hVar.a(), "User photo", h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(oVar, 260), 300), false, lf.d.f24679y), a2.k.f101f, rVar10, 1572920, 4024);
                        e.y(rVar10, false, true, false, false);
                        e.y(rVar10, false, true, false, false);
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar11 = (t0.r) nVar;
                    if (rVar11.G()) {
                        rVar11.V();
                        return;
                    }
                }
                g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, 24);
                Context context = (Context) obj5;
                List list = (List) obj4;
                pg.c cVar3 = (pg.c) obj3;
                Function1 function12 = (Function1) obj2;
                t0.r rVar12 = (t0.r) nVar;
                rVar12.b0(-483455358);
                l1 a15 = b0.y.a(b0.n.f2937c, eVar, rVar12, 0);
                rVar12.b0(-1323940314);
                int i20 = rVar12.P;
                r1 o16 = rVar12.o();
                c2.l.M.getClass();
                c2.j jVar4 = c2.k.f7746b;
                b1.c j17 = androidx.compose.ui.layout.a.j(t10);
                if (rVar12.f35166a instanceof t0.f) {
                    rVar12.e0();
                    if (rVar12.O) {
                        rVar12.n(jVar4);
                    } else {
                        rVar12.n0();
                    }
                    t0.t.v0(rVar12, a15, c2.k.f7749e);
                    t0.t.v0(rVar12, o16, c2.k.f7748d);
                    c2.i iVar8 = c2.k.f7750f;
                    if (rVar12.O || !Intrinsics.a(rVar12.Q(), Integer.valueOf(i20))) {
                        nn.d.s(i20, rVar12, i20, iVar8);
                    }
                    e.w(rVar12, j17, rVar12, 0, 2058660585);
                    String string = context.getString(R.string.filter);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    al.d.C(string, null, w0.e(R.color.black_1A1A1A, rVar12), yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar12, 1575936, 0, 130994);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar12);
                    qu.i0.c(null, null, null, false, null, null, null, false, new rb.f(9, (Object) cVar3, list, (ut.d) function12), rVar12, 0, 255);
                    e.y(rVar12, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37631a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
