package og;

import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import ba.oh;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Log/j;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/portfolio/holdings/PortfolioFnoHoldingsViewModel;", "Lba/oh;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends gd.i<PortfolioFnoHoldingsViewModel, oh> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f30049h = 0;

    /* renamed from: g, reason: collision with root package name */
    public PortfolioDetailViewModel f30050g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_fno_portfolio_holdings;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        j0 owner = getActivity();
        if (owner != null) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            h1 viewModelStore = owner.getViewModelStore();
            Intrinsics.checkNotNullParameter(owner, "owner");
            d1 factory = owner.getDefaultViewModelProviderFactory();
            y4.c defaultCreationExtras = da.e.u(owner, "owner", viewModelStore, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            h.c cVar = new h.c(viewModelStore, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(PortfolioDetailViewModel.class, "modelClass");
            iu.e b10 = a3.a.b(PortfolioDetailViewModel.class, "<this>", PortfolioDetailViewModel.class, "modelClass", "modelClass");
            String s7 = i0.s(b10);
            if (s7 != null) {
                PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                if (portfolioDetailViewModel != null) {
                    this.f30050g = portfolioDetailViewModel;
                    ((PortfolioFnoHoldingsViewModel) r()).f9831t.observe(this, new v(12, new i(this, 1)));
                    return;
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
        }
        throw new Exception("Invalid Activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if ((r0 instanceof com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio) != false) goto L14;
     */
    @Override // gd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            m4.m r4 = r3.q()
            ba.oh r4 = (ba.oh) r4
            com.assetgro.stockgro.ui.base.BaseViewModel r4 = r3.r()
            com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel r4 = (com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel) r4
            m4.m r4 = r3.q()
            ba.oh r4 = (ba.oh) r4
            r4.p(r3)
            com.assetgro.stockgro.ui.base.BaseViewModel r4 = r3.r()
            com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel r4 = (com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel) r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L36
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L34
            java.lang.Object r0 = androidx.activity.n.D(r0)
            com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio r0 = (com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio) r0
            goto L4a
        L34:
            r0 = r2
            goto L4a
        L36:
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L45
            java.lang.String r1 = "PORTFOLIO"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio r0 = (com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio) r0
            goto L46
        L45:
            r0 = r2
        L46:
            boolean r1 = r0 instanceof com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio
            if (r1 == 0) goto L34
        L4a:
            if (r0 == 0) goto L7d
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r4.f9833v = r0
            com.assetgro.stockgro.ui.base.BaseViewModel r4 = r3.r()
            com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel r4 = (com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel) r4
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r3.r()
            com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel r0 = (com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel) r0
            com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio r0 = r0.f9833v
            if (r0 == 0) goto L77
            java.lang.String r0 = r0.getPortfolioId()
            r4.f9827p = r0
            m4.m r4 = r3.q()
            ba.oh r4 = (ba.oh) r4
            b1.c r0 = og.b.f30010a
            androidx.compose.ui.platform.ComposeView r4 = r4.f5666s
            r4.setContent(r0)
            return
        L77:
            java.lang.String r4 = "portfolioData"
            kotlin.jvm.internal.Intrinsics.k(r4)
            throw r2
        L7d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required Portfolio Details Screen not supplied"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: og.j.E(android.view.View):void");
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((PortfolioFnoHoldingsViewModel) r()).i();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PortfolioRepository portfolioRepository = bVar.j();
        yk.g.i(portfolioRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(PortfolioFnoHoldingsViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 3));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioFnoHoldingsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioFnoHoldingsViewModel.class, "<this>", PortfolioFnoHoldingsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = (PortfolioFnoHoldingsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioFnoHoldingsViewModel);
            this.f17284b = portfolioFnoHoldingsViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
