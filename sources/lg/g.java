package lg;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import ba.em;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llg/g;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/portfolio/history/PortfolioFnoHistoryViewModel;", "Lba/em;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends gd.i<PortfolioFnoHistoryViewModel, em> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24832h = 0;

    /* renamed from: g, reason: collision with root package name */
    public Portfolio f24833g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio_fno_history;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((PortfolioFnoHistoryViewModel) r()).f9815r.observe(this, new v(9, new ub.f(this, 28)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.os.Parcelable] */
    @Override // gd.m
    public final void E(View view) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        Portfolio portfolio = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("PORTFOLIO", Portfolio.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable("PORTFOLIO");
                if (parcelable3 instanceof Portfolio) {
                    portfolio = parcelable3;
                }
                parcelable = portfolio;
            }
            portfolio = (Portfolio) parcelable;
        }
        this.f24833g = portfolio;
        ComposeView fnoComposeView = ((em) q()).f4627s;
        Intrinsics.checkNotNullExpressionValue(fnoComposeView, "fnoComposeView");
        zq.f.m0(fnoComposeView);
        ((em) q()).f4627s.setContent(b.f24813a);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        Portfolio portfolio = this.f24833g;
        if (portfolio != null) {
            ((PortfolioFnoHistoryViewModel) r()).f9813p = portfolio;
            ((PortfolioFnoHistoryViewModel) r()).f9812o = portfolio.getPortfolioId();
            ((PortfolioFnoHistoryViewModel) r()).h(null, null, null, null);
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
        ca.c factory = new ca.c(a0.a(PortfolioFnoHistoryViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 2));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioFnoHistoryViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioFnoHistoryViewModel.class, "<this>", PortfolioFnoHistoryViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel = (PortfolioFnoHistoryViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioFnoHistoryViewModel);
            this.f17284b = portfolioFnoHistoryViewModel;
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
