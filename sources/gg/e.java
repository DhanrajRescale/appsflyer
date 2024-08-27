package gg;

import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.t;
import ba.cm;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.v;
import yk.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgg/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/PortfolioViewModel;", "Lba/cm;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends m<PortfolioViewModel, cm> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f17391j = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f17392g;

    /* renamed from: h, reason: collision with root package name */
    public bh.d f17393h;

    /* renamed from: i, reason: collision with root package name */
    public bh.b f17394i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        MainSharedViewModel mainSharedViewModel = this.f17392g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.P.observe(this, new v(6, new ub.f(this, 27)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        final int i10 = 1;
        setHasOptionsMenu(true);
        cm cmVar = (cm) q();
        String string = getString(R.string.portfolio);
        Toolbar toolbar = cmVar.E;
        toolbar.setTitle(string);
        p(toolbar);
        toolbar.n(R.menu.menu_portfolio_fragment);
        final int i11 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: gg.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f17388b;

            {
                this.f17388b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                e this$0 = this.f17388b;
                switch (i12) {
                    case 0:
                        int i13 = e.f17391j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        MainSharedViewModel mainSharedViewModel = this$0.f17392g;
                        if (mainSharedViewModel != null) {
                            mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                            return;
                        } else {
                            Intrinsics.k("mainSharedViewModel");
                            throw null;
                        }
                    default:
                        int i14 = e.f17391j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        MainSharedViewModel mainSharedViewModel2 = this$0.f17392g;
                        if (mainSharedViewModel2 != null) {
                            mainSharedViewModel2.j();
                            return;
                        } else {
                            Intrinsics.k("mainSharedViewModel");
                            throw null;
                        }
                }
            }
        });
        Menu menu = toolbar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.menu_item_notifications).getActionView();
        if (actionView != null && (constraintLayout = (ConstraintLayout) actionView.findViewById(R.id.menu_notification_layout)) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gg.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f17388b;

                {
                    this.f17388b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    e this$0 = this.f17388b;
                    switch (i12) {
                        case 0:
                            int i13 = e.f17391j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f17392g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        default:
                            int i14 = e.f17391j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel2 = this$0.f17392g;
                            if (mainSharedViewModel2 != null) {
                                mainSharedViewModel2.j();
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                    }
                }
            });
        }
        ((cm) q()).D.setRefreshing(false);
        ((cm) q()).D.setOnRefreshListener(new vc.b(this, 17));
        ((PortfolioViewModel) r()).i(h.f17402i);
        t viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        yk.g.H(j.X0(viewLifecycleOwner), null, null, new d(this, null), 3);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((PortfolioViewModel) r()).h();
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
        ca.c factory = new ca.c(a0.a(PortfolioViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioViewModel.class, "<this>", PortfolioViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioViewModel portfolioViewModel = (PortfolioViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioViewModel);
            this.f17284b = portfolioViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f17392g = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
