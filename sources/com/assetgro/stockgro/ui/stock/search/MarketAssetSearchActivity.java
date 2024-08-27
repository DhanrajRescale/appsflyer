package com.assetgro.stockgro.ui.stock.search;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.p3;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import ls.n0;
import qu.i0;
import ut.a;
import yk.g;
import yo.n;
import z7.e;

@a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/search/MarketAssetSearchActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/search/MarketAssetSearchViewModel;", "Lba/p3;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAssetSearchActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10385k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_search_asset;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((MarketAssetSearchViewModel) x()).f10389q.observe(this, new c(22, new qg.a(this, 18)));
    }

    @Override // gd.b
    public final void I() {
        ((p3) w()).f5716u.setTitle("Search");
        Toolbar toolbar = ((p3) w()).f5716u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((p3) w()).f5716u);
        p3 p3Var = (p3) w();
        d1 fragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        p3Var.f5717v.setAdapter(new e(fragmentManager, lifecycle));
        p3 p3Var2 = (p3) w();
        p3 p3Var3 = (p3) w();
        new n(p3Var2.f5715t, p3Var3.f5717v, new vc.b(this, 29)).a();
        if (kj.a.f23207b) {
            ((p3) w()).f5717v.setUserInputEnabled(false);
            ((p3) w()).f5714s.setVisibility(8);
        } else {
            ((p3) w()).f5717v.setUserInputEnabled(false);
            ((p3) w()).f5715t.setVisibility(8);
            ((p3) w()).f5714s.setVisibility(0);
        }
        p3 p3Var4 = (p3) w();
        p3Var4.f5715t.a(new nc.c(this, 11));
    }

    public final void K() {
        if (((p3) w()).f5715t.getSelectedTabPosition() == 0) {
            ((MarketAssetSearchViewModel) x()).i();
        } else {
            ((MarketAssetSearchViewModel) x()).i();
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10016 && i11 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.toolbar_menu_search, menu);
        Intrinsics.c(menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setVisible(true);
        findItem.expandActionView();
        findItem.setOnActionExpandListener(new la.a(this, 6));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            ((MarketAssetSearchViewModel) x()).j();
            finish();
            return true;
        }
        return false;
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((MarketAssetSearchViewModel) x()).j();
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        K();
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        StockRepository stockRepository = activityComponent.f14246a.l();
        g.i(stockRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(MarketAssetSearchViewModel.class), new ea.a(k10, compositeDisposable, stockRepository, userRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MarketAssetSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketAssetSearchViewModel.class, "<this>", MarketAssetSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketAssetSearchViewModel marketAssetSearchViewModel = (MarketAssetSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketAssetSearchViewModel);
            this.f17254b = marketAssetSearchViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            g.i(activityComponent.f14246a.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
