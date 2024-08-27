package sa;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import b3.t;
import ba.rj;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailActivity;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsa/l;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/stocks/asset/MarketAssetInsightsViewModel;", "Lba/rj;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends m<MarketAssetInsightsViewModel, rj> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34421j = 0;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAnalytics f34422g;

    /* renamed from: h, reason: collision with root package name */
    public MainSharedViewModel f34423h;

    /* renamed from: i, reason: collision with root package name */
    public a f34424i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_asset_insights;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        MainSharedViewModel mainSharedViewModel = this.f34423h;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.f9593x.observe(this, new f7.i(17, new j(this, 0)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((rj) q()).p(this);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f34424i = new a(lifecycle, new j(this, 1), new j(this, 2));
        rj rjVar = (rj) q();
        a aVar = this.f34424i;
        if (aVar != null) {
            rjVar.f5975t.setAdapter(aVar);
            rj rjVar2 = (rj) q();
            rjVar2.f5976u.setOnRefreshListener(new t(this, 24));
            ((MarketAssetInsightsViewModel) r()).i(ra.e.f33555b);
            androidx.lifecycle.t viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            yk.g.H(yk.j.X0(viewLifecycleOwner), null, null, new k(this, null), 3);
            return;
        }
        Intrinsics.k("assetInsightAdapter");
        throw null;
    }

    public final void H(String str, List list, InsightListType insightListType) {
        Intent intent = new Intent(getActivity(), (Class<?>) MarketInsightsDetailActivity.class);
        intent.putExtra("TITLE", str);
        Intrinsics.d(list, "null cannot be cast to non-null type java.util.ArrayList<com.assetgro.stockgro.data.model.StockDto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.assetgro.stockgro.data.model.StockDto> }");
        intent.putExtra("LIST_DATA", (ArrayList) list);
        intent.putExtra("TYPE", insightListType);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        ((MarketAssetInsightsViewModel) r()).i(ra.e.f33561h);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((MarketAssetInsightsViewModel) r()).i(ra.e.f33560g);
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
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        ca.c factory = new ca.c(a0.a(MarketAssetInsightsViewModel.class), new ea.a(stockRepository, userRepository, k10, c10));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketAssetInsightsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketAssetInsightsViewModel.class, "<this>", MarketAssetInsightsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketAssetInsightsViewModel marketAssetInsightsViewModel = (MarketAssetInsightsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(marketAssetInsightsViewModel);
            this.f17284b = marketAssetInsightsViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            fragmentComponent.g();
            FirebaseAnalytics d11 = bVar.d();
            yk.g.i(d11);
            this.f34422g = d11;
            this.f34423h = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
