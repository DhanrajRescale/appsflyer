package v;

import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import r0.e2;
import r0.p2;
import t0.g1;
import w.u1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f37596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f37597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, e2 e2Var, Function2 function24) {
        super(2);
        this.f37590a = 1;
        this.f37591b = i10;
        this.f37593d = function2;
        this.f37592c = cVar;
        this.f37594e = function22;
        this.f37595f = function23;
        this.f37596g = e2Var;
        this.f37597h = function24;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f37590a;
        int i12 = this.f37591b;
        Object obj = this.f37595f;
        Object obj2 = this.f37592c;
        Object obj3 = this.f37594e;
        Object obj4 = this.f37597h;
        Object obj5 = this.f37596g;
        Object obj6 = this.f37593d;
        switch (i11) {
            case 0:
                iu.j.e((u1) obj6, (Function1) obj3, (g1.o) obj, (h0) obj5, (i0) obj4, (hu.c) obj2, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                p2.d(this.f37591b, (Function2) obj6, (hu.c) obj2, (Function2) obj3, (Function2) obj, (e2) obj5, (Function2) obj4, nVar, 0);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                ((g1) obj6).setValue(Unit.f23355a);
                b3.l lVar = (b3.l) obj3;
                lVar.getClass();
                lVar.f3123a.f15909e.clear();
                lVar.f3130c = 0;
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-1652855396);
                t9.c cVar = lVar.f3129b;
                if (cVar == null) {
                    cVar = new t9.c(lVar, 9);
                    lVar.f3129b = cVar;
                }
                Object obj7 = cVar.f35633b;
                b3.e c10 = ((b3.l) obj7).c();
                b3.e c11 = ((b3.l) obj7).c();
                b3.e c12 = ((b3.l) obj7).c();
                g1.l lVar2 = g1.l.f16404b;
                GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) obj5;
                yk.j.I(b3.l.b(lVar2, c10, pd.h.f30892d), groupCreateViewModel, rVar3, 64, 0);
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar2, 18, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                rVar3.b0(-1023121510);
                boolean h10 = rVar3.h(c10);
                Object Q = rVar3.Q();
                Object obj8 = t0.m.f35080a;
                if (h10 || Q == obj8) {
                    Q = new pd.i(c10, 0);
                    rVar3.k0(Q);
                }
                rVar3.s(false);
                yk.j.J(b3.l.b(x10, c11, (Function1) Q), groupCreateViewModel, rVar3, 64, 0);
                rVar3.b0(-1023102070);
                boolean h11 = rVar3.h(c11);
                Object Q2 = rVar3.Q();
                if (h11 || Q2 == obj8) {
                    Q2 = new pd.i(c11, 1);
                    rVar3.k0(Q2);
                }
                rVar3.s(false);
                g1.o b10 = b3.l.b(lVar2, c12, (Function1) Q2);
                g1 g1Var = (g1) obj4;
                boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
                rVar3.b0(-1023088516);
                Object Q3 = rVar3.Q();
                if (Q3 == obj8) {
                    Q3 = new ka.o((g1) obj2, g1Var, 13);
                    rVar3.k0(Q3);
                }
                rVar3.s(false);
                yk.j.L(b10, booleanValue, (Function1) Q3, rVar3, 384, 0);
                rVar3.s(false);
                return;
            default:
                dp.b.O((PortfolioFnoHoldingsViewModel) obj6, (PortfolioDetailViewModel) obj, (pg.c) obj5, (Function2) obj4, (Function1) obj3, (Function0) obj2, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37590a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel, PortfolioDetailViewModel portfolioDetailViewModel, pg.c cVar, Function2 function2, Function1 function1, Function0 function0, int i10) {
        super(2);
        this.f37590a = 3;
        this.f37593d = portfolioFnoHoldingsViewModel;
        this.f37595f = portfolioDetailViewModel;
        this.f37596g = cVar;
        this.f37597h = function2;
        this.f37594e = function1;
        this.f37592c = function0;
        this.f37591b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g1 g1Var, b3.l lVar, pd.l lVar2, GroupCreateViewModel groupCreateViewModel, g1 g1Var2, g1 g1Var3) {
        super(2);
        this.f37590a = 2;
        this.f37593d = g1Var;
        this.f37594e = lVar;
        this.f37595f = lVar2;
        this.f37596g = groupCreateViewModel;
        this.f37597h = g1Var2;
        this.f37592c = g1Var3;
        this.f37591b = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u1 u1Var, Function1 function1, g1.o oVar, h0 h0Var, i0 i0Var, hu.c cVar, int i10) {
        super(2);
        this.f37590a = 0;
        this.f37593d = u1Var;
        this.f37594e = function1;
        this.f37595f = oVar;
        this.f37596g = h0Var;
        this.f37597h = i0Var;
        this.f37592c = cVar;
        this.f37591b = i10;
    }
}
