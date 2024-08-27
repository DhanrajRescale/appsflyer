package og;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import ba.km;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioSharedViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Log/o;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/portfolio/holdings/PortfolioHoldingsViewModel;", "Lba/km;", "Lni/l;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends gd.i<PortfolioHoldingsViewModel, km> implements ni.l {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f30062j = 0;

    /* renamed from: g, reason: collision with root package name */
    public k f30063g;

    /* renamed from: h, reason: collision with root package name */
    public xg.b f30064h;

    /* renamed from: i, reason: collision with root package name */
    public PortfolioSharedViewModel f30065i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio_stock_holding;
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
            Intrinsics.checkNotNullParameter(PortfolioSharedViewModel.class, "modelClass");
            iu.e b10 = a3.a.b(PortfolioSharedViewModel.class, "<this>", PortfolioSharedViewModel.class, "modelClass", "modelClass");
            String s7 = i0.s(b10);
            if (s7 != null) {
                PortfolioSharedViewModel portfolioSharedViewModel = (PortfolioSharedViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                if (portfolioSharedViewModel != null) {
                    this.f30065i = portfolioSharedViewModel;
                    ((PortfolioHoldingsViewModel) r()).f9835o.observe(this, new v(13, new n(this, 15)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel.D.observe(this, new v(13, new n(this, 16)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel2 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel2.L.observe(this, new v(13, new n(this, 17)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel3 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel3.N.observe(this, new v(13, new n(this, 18)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel4 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel4.M.observe(this, new v(13, new n(this, 19)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel5 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel5.G.observe(this, new v(13, new n(this, 20)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel6 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel6.E.observe(this, new v(13, new n(this, 21)));
                    PortfolioHoldingsViewModel portfolioHoldingsViewModel7 = (PortfolioHoldingsViewModel) r();
                    portfolioHoldingsViewModel7.F.observe(this, new v(13, new n(this, 22)));
                    ((PortfolioHoldingsViewModel) r()).f9084g.observe(this, new v(13, new n(this, 0)));
                    PortfolioSharedViewModel portfolioSharedViewModel2 = this.f30065i;
                    if (portfolioSharedViewModel2 != null) {
                        portfolioSharedViewModel2.f9791c.observe(this, new v(13, new n(this, 1)));
                        PortfolioSharedViewModel portfolioSharedViewModel3 = this.f30065i;
                        if (portfolioSharedViewModel3 != null) {
                            portfolioSharedViewModel3.f9790b.observe(this, new v(13, new n(this, 2)));
                            ((PortfolioHoldingsViewModel) r()).f9846z.observe(this, new v(13, new n(this, 3)));
                            ((PortfolioHoldingsViewModel) r()).A.observe(this, new v(13, new n(this, 4)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel8 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel8.H.observe(this, new v(13, new n(this, 5)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel9 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel9.I.observe(this, new v(13, new n(this, 6)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel10 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel10.P.observe(this, new v(13, new n(this, 7)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel11 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel11.Q.observe(this, new v(13, new n(this, 8)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel12 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel12.J.observe(this, new v(13, new n(this, 9)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel13 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel13.K.observe(this, new v(13, new n(this, 10)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel14 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel14.O.observe(this, new v(13, new n(this, 11)));
                            PortfolioHoldingsViewModel portfolioHoldingsViewModel15 = (PortfolioHoldingsViewModel) r();
                            portfolioHoldingsViewModel15.R.observe(this, new v(13, new n(this, 12)));
                            ((PortfolioHoldingsViewModel) r()).f9836p.observe(this, new v(13, new n(this, 13)));
                            ((PortfolioHoldingsViewModel) r()).B.observe(this, new v(13, new n(this, 14)));
                            return;
                        }
                        Intrinsics.k("model");
                        throw null;
                    }
                    Intrinsics.k("model");
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
        }
        throw new Exception("Invalid Activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if ((r0 instanceof com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio) != false) goto L14;
     */
    @Override // gd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o.E(android.view.View):void");
    }

    @Override // ni.l
    public final void c(StockDto stockDto) {
        String str;
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        j0 activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
            bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
            bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
            bundle.putString("STOCK_NAME", stockDto.getCode());
            bundle.putString("PORTFOLIO_ID", str);
            intent.putExtras(bundle);
            requireActivity().startActivityForResult(intent, 10016);
        }
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
        ca.c factory = new ca.c(a0.a(PortfolioHoldingsViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 6));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioHoldingsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioHoldingsViewModel.class, "<this>", PortfolioHoldingsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioHoldingsViewModel);
            this.f17284b = portfolioHoldingsViewModel;
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
