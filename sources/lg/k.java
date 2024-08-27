package lg;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.im;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioSharedViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.c2;
import qu.i0;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llg/k;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/portfolio/history/PortfolioHistoryViewModel;", "Lba/im;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends gd.i<PortfolioHistoryViewModel, im> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24839h = 0;

    /* renamed from: g, reason: collision with root package name */
    public h f24840g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio_stock_history;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((PortfolioHistoryViewModel) r()).f9819o.observe(this, new v(10, new j(this, 0)));
        ((PortfolioHistoryViewModel) r()).f9084g.observe(this, new v(10, new j(this, 1)));
        ((PortfolioHistoryViewModel) r()).f9820p.observe(this, new v(10, new j(this, 2)));
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
                    portfolioSharedViewModel.f9790b.observe(this, new v(10, new j(this, 3)));
                    return;
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
        }
        throw new Exception("Invalid Activity");
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            portfolio = (Portfolio) arguments.getParcelable("PORTFOLIO");
        } else {
            portfolio = null;
        }
        if (!(portfolio instanceof Portfolio)) {
            portfolio = null;
        }
        if (portfolio != null) {
            ((PortfolioHistoryViewModel) r()).f9824t = portfolio.getPortfolioId();
            ((PortfolioHistoryViewModel) r()).h(portfolio.getPortfolioId());
        }
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f24840g = new h(lifecycle, new j(this, 4));
        im imVar = (im) q();
        h hVar = this.f24840g;
        if (hVar != null) {
            imVar.f5060t.setAdapter(hVar);
            final int i10 = 0;
            ((im) q()).f5063w.setOnClickListener(new View.OnClickListener(this) { // from class: lg.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f24836b;

                {
                    this.f24836b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = i10;
                    k this$0 = this.f24836b;
                    switch (i11) {
                        case 0:
                            int i12 = k.f24839h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            ng.e eVar = new ng.e();
                            eVar.setArguments(bundle);
                            eVar.show(this$0.getChildFragmentManager(), "HistoryFilterBottomSheetDialogFragment");
                            return;
                        default:
                            int i13 = k.f24839h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i14 = lf.i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            ((im) q()).f5064x.setOnRefreshListener(new vc.b(this, 19));
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, ((PortfolioHistoryViewModel) r()).f9821q);
            arrayAdapter.setDropDownViewResource(R.layout.layout_custom_spinner);
            ((im) q()).f5059s.setAdapter((SpinnerAdapter) arrayAdapter);
            ((im) q()).f5059s.setSelection(0, false);
            ((im) q()).f5059s.setOnTouchListener(new ha.g(this, 3));
            ((im) q()).f5059s.setOnItemSelectedListener(new c2(this, 2));
            if (kj.a.f23207b) {
                ((im) q()).f5062v.setVisibility(8);
            } else {
                ((im) q()).f5062v.setVisibility(0);
            }
            final int i11 = 1;
            ((im) q()).f5062v.setOnClickListener(new View.OnClickListener(this) { // from class: lg.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f24836b;

                {
                    this.f24836b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = i11;
                    k this$0 = this.f24836b;
                    switch (i112) {
                        case 0:
                            int i12 = k.f24839h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            ng.e eVar = new ng.e();
                            eVar.setArguments(bundle);
                            eVar.show(this$0.getChildFragmentManager(), "HistoryFilterBottomSheetDialogFragment");
                            return;
                        default:
                            int i13 = k.f24839h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i14 = lf.i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("portfolioStockHistoryAdapter");
        throw null;
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
        ca.c factory = new ca.c(a0.a(PortfolioHistoryViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 5));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioHistoryViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioHistoryViewModel.class, "<this>", PortfolioHistoryViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioHistoryViewModel portfolioHistoryViewModel = (PortfolioHistoryViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioHistoryViewModel);
            this.f17284b = portfolioHistoryViewModel;
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
