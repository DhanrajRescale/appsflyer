package pa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import b3.t;
import ba.tj;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import ea.n0;
import ea.r;
import gd.i;
import h.m;
import iu.a0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.l;
import qu.i0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpa/c;", "Lgd/i;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/insights/detail/MarketInsightsDetailViewModel;", "Lba/tj;", "Lni/l;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends i<MarketInsightsDetailViewModel, tj> implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f30804j = 0;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAnalytics f30805g;

    /* renamed from: h, reason: collision with root package name */
    public ni.c f30806h;

    /* renamed from: i, reason: collision with root package name */
    public ni.c f30807i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_insights_detail;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MarketInsightsDetailViewModel) r()).f9084g.observe(this, new f7.i(14, new a(this, 0)));
        ((MarketInsightsDetailViewModel) r()).f8663p.observe(this, new f7.i(14, new a(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Object obj;
        ArrayList arrayList;
        String string;
        Serializable serializable;
        m mVar;
        String sectionFilter;
        Intrinsics.checkNotNullParameter(view, "view");
        ((tj) q()).p(this);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f30806h = new ni.c(lifecycle, false, this);
        o lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        this.f30807i = new ni.c(lifecycle2, true, this);
        MarketInsightsDetailViewModel marketInsightsDetailViewModel = (MarketInsightsDetailViewModel) r();
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.getParcelable("LIST_DATA");
        } else {
            obj = null;
        }
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            marketInsightsDetailViewModel.f8663p.postValue(arrayList);
        }
        setHasOptionsMenu(true);
        tj tjVar = (tj) q();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("TITLE")) == null) {
            string = getString(R.string.stocks);
        }
        tjVar.f6200u.setTitle(string);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable = arguments3.getSerializable("TYPE");
        } else {
            serializable = null;
        }
        InsightListType insightListType = (InsightListType) serializable;
        if (insightListType != null) {
            MarketInsightsDetailViewModel marketInsightsDetailViewModel2 = (MarketInsightsDetailViewModel) r();
            Intrinsics.checkNotNullParameter(insightListType, "<set-?>");
            marketInsightsDetailViewModel2.f8664q = insightListType;
        }
        ((MarketInsightsDetailViewModel) r()).h();
        j0 activity = getActivity();
        if (activity instanceof m) {
            mVar = (m) activity;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            mVar.u(((tj) q()).f6200u);
        }
        Toolbar toolbar = ((tj) q()).f6200u;
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new j(this, 9));
        Bundle arguments4 = getArguments();
        if (arguments4 != null && arguments4.getBoolean("CALLED_FROM_HOME_SCREEN")) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                sectionFilter = arguments5.getString("stocks_filter");
            } else {
                sectionFilter = null;
            }
            if (sectionFilter != null) {
                MarketInsightsDetailViewModel marketInsightsDetailViewModel3 = (MarketInsightsDetailViewModel) r();
                Intrinsics.checkNotNullParameter(sectionFilter, "sectionFilter");
                marketInsightsDetailViewModel3.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(marketInsightsDetailViewModel3), null, null, new f(marketInsightsDetailViewModel3, sectionFilter, null), 3);
            }
        }
        ((tj) q()).f6199t.setOnRefreshListener(new t(this, 22));
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
        FirebaseAnalytics firebaseAnalytics = this.f30805g;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a("stock_detail", (Bundle) new ll.o(12, 0).f24937b);
            j0 activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                bundle.putString("STOCK_NAME", stockDto.getCode());
                bundle.putParcelable("STOCK", stockDto);
                bundle.putString("PORTFOLIO_ID", str);
                intent.putExtras(bundle);
                requireActivity().startActivityForResult(intent, 10016);
                jt.e eVar = ((MarketInsightsDetailViewModel) r()).f8662o;
                if (eVar != null) {
                    ft.b.b(eVar);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.k("firebaseAnalytics");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        j0 activity;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10016 && i11 == -1 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((MarketInsightsDetailViewModel) r()).f8662o;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MarketInsightsDetailViewModel marketInsightsDetailViewModel = (MarketInsightsDetailViewModel) r();
        jt.e eVar = marketInsightsDetailViewModel.f8662o;
        if (eVar != null) {
            ft.b.b(eVar);
        }
        mt.f g10 = new mt.c(at.e.a(5L, TimeUnit.SECONDS), new com.assetgro.stockgro.data.a(6, g.f30814a)).g(((kq.e) marketInsightsDetailViewModel.f9079b).J());
        jt.e eVar2 = new jt.e(new com.assetgro.stockgro.data.a(7, new e(marketInsightsDetailViewModel, 2)), gt.e.f17572d);
        g10.e(eVar2);
        marketInsightsDetailViewModel.f8662o = eVar2;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        qf.a maintenanceConfigManager = bVar.g();
        yk.g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MarketInsightsDetailViewModel.class), new r(k10, c10, userRepository, stockRepository, maintenanceConfigManager, 3));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MarketInsightsDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketInsightsDetailViewModel.class, "<this>", MarketInsightsDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketInsightsDetailViewModel marketInsightsDetailViewModel = (MarketInsightsDetailViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(marketInsightsDetailViewModel);
            this.f17284b = marketInsightsDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            fragmentComponent.f();
            FirebaseAnalytics d11 = bVar.d();
            yk.g.i(d11);
            this.f30805g = d11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
