package tg;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.gm;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltg/h;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/orders/PortfolioFnoOrdersViewModel;", "Lba/gm;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends gd.m<PortfolioFnoOrdersViewModel, gm> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f36055g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio_fno_orders;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((PortfolioFnoOrdersViewModel) r()).f9911q.observe(this, new v(18, new f(this, 1)));
        ((PortfolioFnoOrdersViewModel) r()).f9914t.observe(this, new c1.a(this, 3));
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        Portfolio portfolio2 = null;
        if (arguments != null) {
            portfolio = (Portfolio) arguments.getParcelable("PORTFOLIO");
        } else {
            portfolio = null;
        }
        if (portfolio instanceof Portfolio) {
            portfolio2 = portfolio;
        }
        if (portfolio2 != null) {
            ((PortfolioFnoOrdersViewModel) r()).f9909o = portfolio2;
        }
        ((gm) q()).f4829s.setContent(b.f36024a);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((PortfolioFnoOrdersViewModel) r()).i(null);
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
        ca.c factory = new ca.c(a0.a(PortfolioFnoOrdersViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 4));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioFnoOrdersViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioFnoOrdersViewModel.class, "<this>", PortfolioFnoOrdersViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel = (PortfolioFnoOrdersViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioFnoOrdersViewModel);
            this.f17284b = portfolioFnoOrdersViewModel;
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
