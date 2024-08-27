package com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import c2.e1;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.r;
import ea.v;
import f7.i;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import pa.c;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/asset/insights/detail/MarketInsightsDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/insights/detail/MarketInsightsDetailViewModel;", "Lba/s1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketInsightsDetailActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f8659k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_list_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((MarketInsightsDetailViewModel) x()).f8665r.observe(this, new i(13, new e1(this, 22)));
    }

    @Override // gd.b
    public final void I() {
        d1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        int i10 = c.f30804j;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ADD_TO_PORTFOLIO", getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
        bundle.putBoolean("CALL_FROM_PORTFOLIO", getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
        String stringExtra = getIntent().getStringExtra("TITLE");
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("TITLE", stringExtra);
        bundle.putSerializable("TYPE", getIntent().getSerializableExtra("TYPE"));
        bundle.putBoolean("CALLED_FROM_HOME_SCREEN", getIntent().getBooleanExtra("CALLED_FROM_HOME_SCREEN", false));
        bundle.putString("stocks_filter", getIntent().getStringExtra("stocks_filter"));
        String stringExtra2 = getIntent().getStringExtra("SELECTED_INDEX");
        if (stringExtra2 == null) {
            stringExtra2 = "nifty_50";
        }
        bundle.putString("SELECTED_INDEX", stringExtra2);
        bundle.putBoolean("SHOW_INDEX_MENU", getIntent().getBooleanExtra("SHOW_INDEX_MENU", true));
        bundle.putBoolean("DATA", true);
        bundle.putParcelable("LIST_DATA", getIntent().getParcelableExtra("LIST_DATA"));
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        c cVar = new c();
        cVar.setArguments(bundle2);
        aVar.e(R.id.container_fragment, cVar, "MarketInsightsDetailFragment", 1);
        aVar.h(false);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10016 && i11 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        StockRepository stockRepository = activityComponent.f14246a.l();
        g.i(stockRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(MarketInsightsDetailViewModel.class), new r(schedulerProvider, compositeDisposable, userRepository, stockRepository, maintenanceConfigManager, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MarketInsightsDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketInsightsDetailViewModel.class, "<this>", MarketInsightsDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketInsightsDetailViewModel marketInsightsDetailViewModel = (MarketInsightsDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketInsightsDetailViewModel);
            this.f17254b = marketInsightsDetailViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
