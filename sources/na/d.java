package na;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import b3.t;
import ba.pj;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketAssetHostViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import ea.o;
import f7.i;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lna/d;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/MarketAssetHostViewModel;", "Lba/pj;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends m<MarketAssetHostViewModel, pj> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28560i = 0;

    /* renamed from: g, reason: collision with root package name */
    public m f28561g;

    /* renamed from: h, reason: collision with root package name */
    public MainSharedViewModel f28562h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_asset_host;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        H().f9593x.observe(this, new i(11, new c(this, 0)));
        H().P.observe(this, new i(11, new c(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(view, "view");
        ((pj) q()).p(this);
        final int i10 = 1;
        setHasOptionsMenu(true);
        pj pjVar = (pj) q();
        String string = getString(R.string.text_market);
        Toolbar toolbar = pjVar.f5774v;
        toolbar.setTitle(string);
        p(toolbar);
        toolbar.n(R.menu.menu_market);
        final int i11 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: na.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28555b;

            {
                this.f28555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z10;
                String str;
                int i12 = i11;
                d this$0 = this.f28555b;
                switch (i12) {
                    case 0:
                        int i13 = d.f28560i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i14 = d.f28560i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.getActivity() != null) {
                            Intent intent = new Intent(this$0.requireContext(), (Class<?>) MarketAdvancedSearchActivity.class);
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                z10 = extras.getBoolean("CALL_FROM_PORTFOLIO");
                            } else {
                                z10 = false;
                            }
                            intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                            Bundle extras2 = intent.getExtras();
                            String str2 = null;
                            if (extras2 != null) {
                                str = extras2.getString("PORTFOLIO_ID");
                            } else {
                                str = null;
                            }
                            intent.putExtra("PORTFOLIO_ID", str);
                            Bundle extras3 = intent.getExtras();
                            if (extras3 != null) {
                                str2 = extras3.getString("IS_MODEL");
                            }
                            intent.putExtra("IS_MODEL", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        int i15 = d.f28560i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H().j();
                        return;
                }
            }
        });
        Menu menu = toolbar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.menu_item_search).getActionView();
        if (actionView != null && (constraintLayout2 = (ConstraintLayout) actionView.findViewById(R.id.menu_search_layout)) != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: na.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f28555b;

                {
                    this.f28555b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    String str;
                    int i12 = i10;
                    d this$0 = this.f28555b;
                    switch (i12) {
                        case 0:
                            int i13 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i14 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getActivity() != null) {
                                Intent intent = new Intent(this$0.requireContext(), (Class<?>) MarketAdvancedSearchActivity.class);
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    z10 = extras.getBoolean("CALL_FROM_PORTFOLIO");
                                } else {
                                    z10 = false;
                                }
                                intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                                Bundle extras2 = intent.getExtras();
                                String str2 = null;
                                if (extras2 != null) {
                                    str = extras2.getString("PORTFOLIO_ID");
                                } else {
                                    str = null;
                                }
                                intent.putExtra("PORTFOLIO_ID", str);
                                Bundle extras3 = intent.getExtras();
                                if (extras3 != null) {
                                    str2 = extras3.getString("IS_MODEL");
                                }
                                intent.putExtra("IS_MODEL", str2);
                                this$0.startActivity(intent);
                                return;
                            }
                            return;
                        default:
                            int i15 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().j();
                            return;
                    }
                }
            });
        }
        View actionView2 = menu.findItem(R.id.menu_item_notifications).getActionView();
        if (actionView2 != null && (constraintLayout = (ConstraintLayout) actionView2.findViewById(R.id.menu_notification_layout)) != null) {
            final int i12 = 2;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: na.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f28555b;

                {
                    this.f28555b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    String str;
                    int i122 = i12;
                    d this$0 = this.f28555b;
                    switch (i122) {
                        case 0:
                            int i13 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i14 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getActivity() != null) {
                                Intent intent = new Intent(this$0.requireContext(), (Class<?>) MarketAdvancedSearchActivity.class);
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    z10 = extras.getBoolean("CALL_FROM_PORTFOLIO");
                                } else {
                                    z10 = false;
                                }
                                intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                                Bundle extras2 = intent.getExtras();
                                String str2 = null;
                                if (extras2 != null) {
                                    str = extras2.getString("PORTFOLIO_ID");
                                } else {
                                    str = null;
                                }
                                intent.putExtra("PORTFOLIO_ID", str);
                                Bundle extras3 = intent.getExtras();
                                if (extras3 != null) {
                                    str2 = extras3.getString("IS_MODEL");
                                }
                                intent.putExtra("IS_MODEL", str2);
                                this$0.startActivity(intent);
                                return;
                            }
                            return;
                        default:
                            int i15 = d.f28560i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H().j();
                            return;
                    }
                }
            });
        }
        ((pj) q()).f5772t.setVisibility(8);
        ((pj) q()).f5772t.setItemIconTintList(null);
        ((pj) q()).f5772t.setOnNavigationItemSelectedListener(new t(this, 21));
        ((pj) q()).f5771s.a(new b(this, 0));
        MarketAssetHostViewModel marketAssetHostViewModel = (MarketAssetHostViewModel) r();
        qf.b bVar = qf.b.f31939n;
        qf.a aVar = marketAssetHostViewModel.f8653n;
        if (!aVar.b(bVar) && !aVar.b(qf.b.f31938m)) {
            J();
        } else {
            I();
        }
    }

    public final MainSharedViewModel H() {
        MainSharedViewModel mainSharedViewModel = this.f28562h;
        if (mainSharedViewModel != null) {
            return mainSharedViewModel;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    public final void I() {
        H().f9592w.postValue(Boolean.FALSE);
        if (this.f28561g instanceof qf.c) {
            return;
        }
        d1 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        qf.c cVar = (qf.c) getParentFragmentManager().C("MaintenanceV2Fragment");
        if (cVar == null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("DATA", qf.b.f31938m);
            cVar = de.d.m(bundle);
            aVar.e(R.id.market_asset_container, cVar, "MaintenanceV2Fragment", 1);
        } else {
            aVar.o(cVar);
        }
        m mVar = this.f28561g;
        if (mVar != null) {
            aVar.k(mVar);
        }
        aVar.h(false);
        this.f28561g = cVar;
    }

    public final void J() {
        if (this.f28561g instanceof qa.b) {
            return;
        }
        s().screenNavigated("market-stocks");
        d1 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        qa.b bVar = (qa.b) getParentFragmentManager().C("MarketStocksHostFragment");
        if (bVar == null) {
            Bundle bundle = new Bundle();
            qa.b bVar2 = new qa.b();
            bVar2.setArguments(bundle);
            aVar.e(R.id.market_asset_container, bVar2, "MarketStocksHostFragment", 1);
            bVar = bVar2;
        } else {
            aVar.o(bVar);
        }
        m mVar = this.f28561g;
        if (mVar != null) {
            aVar.k(mVar);
        }
        aVar.h(false);
        this.f28561g = bVar;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(MarketAssetHostViewModel.class), new o(k10, c10, userRepository, maintenanceConfigManager, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketAssetHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketAssetHostViewModel.class, "<this>", MarketAssetHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketAssetHostViewModel marketAssetHostViewModel = (MarketAssetHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketAssetHostViewModel);
            this.f17284b = marketAssetHostViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f28562h = fragmentComponent.f();
            g.i(bVar.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
