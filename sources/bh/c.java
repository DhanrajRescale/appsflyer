package bh;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.p9;
import ba.q9;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.v2.presentation.LeaguePortfolioCardViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbh/c;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/v2/presentation/LeaguePortfolioCardViewModel;", "Lba/p9;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends m<LeaguePortfolioCardViewModel, p9> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6974g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.cell_league_portfolio;
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        ((p9) q()).p(this);
        Bundle arguments = getArguments();
        if (arguments != null && (portfolio = (Portfolio) arguments.getParcelable("DATA")) != null) {
            q9 q9Var = (q9) ((p9) q());
            q9Var.H = portfolio;
            synchronized (q9Var) {
                q9Var.J |= 1;
            }
            q9Var.a(6);
            q9Var.m();
            ((p9) q()).f5733s.setOnClickListener(new bb.a(16, this, portfolio));
            if (kj.a.f23207b) {
                ((p9) q()).D.setVisibility(8);
                return;
            }
            ((p9) q()).D.setVisibility(0);
            if (s.j(portfolio.getPortfolioStatus(), "Active", false)) {
                TextView textView = ((p9) q()).D;
                textView.setText(getString(R.string.portfolio_data_disclaimer_one));
                textView.setTextColor(textView.getResources().getColor(R.color.black_1A1A1A));
            } else if (s.j(portfolio.getPortfolioStatus(), "Inactive", false)) {
                TextView textView2 = ((p9) q()).D;
                textView2.setText(getString(R.string.portfolio_data_disclaimer_two));
                textView2.setTextColor(textView2.getResources().getColor(R.color.black_1A1A1A));
            } else {
                TextView textView3 = ((p9) q()).D;
                textView3.setText(getString(R.string.portfolio_data_disclaimer_two));
                textView3.setTextColor(textView3.getResources().getColor(R.color.white));
            }
            ((p9) q()).D.setOnClickListener(new p004if.c(this, 22));
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(LeaguePortfolioCardViewModel.class), new ea.j0(k10, c10, userRepository, 0));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, LeaguePortfolioCardViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeaguePortfolioCardViewModel.class, "<this>", LeaguePortfolioCardViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeaguePortfolioCardViewModel leaguePortfolioCardViewModel = (LeaguePortfolioCardViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(leaguePortfolioCardViewModel);
            this.f17284b = leaguePortfolioCardViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
