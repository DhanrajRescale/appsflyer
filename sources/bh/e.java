package bh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.la;
import ba.ma;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.v2.presentation.ModelPortfolioCardViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbh/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/v2/presentation/ModelPortfolioCardViewModel;", "Lba/la;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends m<ModelPortfolioCardViewModel, la> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6976g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.cell_model_portfolio;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ModelPortfolioCardViewModel) r()).f9975n.observe(this, new v(28, new qg.a(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        ((la) q()).p(this);
        Bundle arguments = getArguments();
        if (arguments != null && (portfolio = (Portfolio) arguments.getParcelable("DATA")) != null) {
            Intrinsics.checkNotNullParameter(portfolio, "<set-?>");
            ma maVar = (ma) ((la) q());
            maVar.E = portfolio;
            synchronized (maVar) {
                maVar.F |= 1;
            }
            maVar.a(6);
            maVar.m();
            if (Intrinsics.a(portfolio.getAssetClass(), "OPTIONS")) {
                ((la) q()).f5340y.setText(getString(R.string.margin_utilised));
                ((la) q()).f5335t.setText(getString(R.string.margin_avaliable));
            } else {
                ((la) q()).f5340y.setText(getString(R.string.invested_amount));
                ((la) q()).f5335t.setText(getString(R.string.cash_balance));
            }
            ((la) q()).f5334s.setOnClickListener(new bb.a(17, portfolio, this));
            byte[] bArr = kj.a.f23206a;
            if (kj.a.f23207b) {
                ((la) q()).B.setVisibility(8);
            } else {
                ((la) q()).B.setVisibility(0);
            }
        }
    }

    public final void H(Portfolio portfolio) {
        j0 requireActivity = requireActivity();
        if (portfolio != null) {
            portfolio.setModelPortfolio(true);
        }
        Intent intent = new Intent(requireActivity, (Class<?>) PortfolioDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("PORTFOLIO", portfolio);
        intent.putExtras(bundle);
        requireActivity.startActivity(intent);
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
        ca.c factory = new ca.c(a0.a(ModelPortfolioCardViewModel.class), new ea.j0(k10, c10, userRepository, 5));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, ModelPortfolioCardViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModelPortfolioCardViewModel.class, "<this>", ModelPortfolioCardViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModelPortfolioCardViewModel modelPortfolioCardViewModel = (ModelPortfolioCardViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(modelPortfolioCardViewModel);
            this.f17284b = modelPortfolioCardViewModel;
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
