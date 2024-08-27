package v;

import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.MarketStocks;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.a4;
import t0.g1;
import w.u1;
import w.y0;
import x.o2;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.d f37616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f37619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f37620h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SocialChatListViewModel socialChatListViewModel, c0.m0 m0Var, int i10, Function1 function1, Function2 function2, Function0 function0, int i11) {
        super(2);
        this.f37613a = 5;
        this.f37619g = socialChatListViewModel;
        this.f37614b = m0Var;
        this.f37617e = i10;
        this.f37615c = function1;
        this.f37620h = function2;
        this.f37616d = function0;
        this.f37618f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f37617e;
        Object obj = this.f37619g;
        int i12 = this.f37613a;
        ut.d dVar = this.f37616d;
        Object obj2 = this.f37620h;
        Object obj3 = this.f37615c;
        Object obj4 = this.f37614b;
        switch (i12) {
            case 0:
                qu.i0.a(obj, (g1.o) obj4, (w.f0) obj3, (String) obj2, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 1:
                qu.i0.b((u1) obj, (g1.o) obj4, (w.f0) obj3, (Function1) obj2, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 2:
                a4.a((y0) obj, (g1) obj3, (o2) obj2, (g1.o) obj4, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 3:
                yk.j.c((hu.c) dVar, (g1.o) obj4, (Function1) obj, (Function1) obj3, (Function1) obj2, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 4:
                y2.m.a((Function1) obj, (g1.o) obj4, (Function1) obj3, (Function1) obj2, (Function1) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 5:
                kp.j.c((SocialChatListViewModel) obj, (c0.m0) obj4, i11, (Function1) obj3, (Function2) obj2, (Function0) dVar, nVar, t0.t.H0(this.f37618f | 1));
                return;
            case 6:
                hf.z.i((g1.o) obj4, (MarketStocks) obj, (Integer) obj3, (String) obj2, (Function2) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            case 7:
                dp.b.Q((PortfolioFnoHoldingsViewModel) obj, (PortfolioDetailViewModel) obj4, (Function0) obj3, (Function2) obj2, (Function1) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
            default:
                dp.b.Y((g1.o) obj4, (uh.i) obj, (th.b) obj3, (Function0) obj2, (Function1) dVar, nVar, t0.t.H0(i11 | 1), this.f37618f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37613a) {
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
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(g1.o oVar, Object obj, Object obj2, Object obj3, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f37613a = i12;
        this.f37614b = oVar;
        this.f37619g = obj;
        this.f37615c = obj2;
        this.f37620h = obj3;
        this.f37616d = dVar;
        this.f37617e = i10;
        this.f37618f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu.c cVar, g1.o oVar, Function1 function1, Function1 function12, Function1 function13, int i10, int i11) {
        super(2);
        this.f37613a = 3;
        this.f37616d = cVar;
        this.f37614b = oVar;
        this.f37619g = function1;
        this.f37615c = function12;
        this.f37620h = function13;
        this.f37617e = i10;
        this.f37618f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f37613a = i12;
        this.f37619g = obj;
        this.f37614b = obj2;
        this.f37615c = obj3;
        this.f37620h = obj4;
        this.f37616d = dVar;
        this.f37617e = i10;
        this.f37618f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y0 y0Var, g1 g1Var, o2 o2Var, g1.o oVar, hu.c cVar, int i10, int i11) {
        super(2);
        this.f37613a = 2;
        this.f37619g = y0Var;
        this.f37615c = g1Var;
        this.f37620h = o2Var;
        this.f37614b = oVar;
        this.f37616d = cVar;
        this.f37617e = i10;
        this.f37618f = i11;
    }
}
