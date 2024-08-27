package com.assetgro.stockgro.feature_market.presentation.market.search;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.a2;
import ca.c;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.q;
import ea.v;
import f7.i;
import gd.b;
import iu.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import r3.k;
import va.d;
import va.e;
import wa.a;
import wa.f;
import yk.g;
import z9.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/search/MarketAdvancedSearchActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_market/presentation/market/search/MarketAdvancedSearchViewModel;", "Lba/a2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAdvancedSearchActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8684m = 0;

    /* renamed from: k, reason: collision with root package name */
    public f f8685k;

    /* renamed from: l, reason: collision with root package name */
    public a f8686l;

    public static final void K(MarketAdvancedSearchActivity marketAdvancedSearchActivity, TextView textView) {
        marketAdvancedSearchActivity.getClass();
        textView.setBackground(k.getDrawable(marketAdvancedSearchActivity, R.drawable.background_social_search_chip_unselected));
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_market_advanced_search;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((MarketAdvancedSearchViewModel) x()).f8690q.observe(this, new i(19, new d(this, 0)));
        ((MarketAdvancedSearchViewModel) x()).f8691r.observe(this, new i(19, new d(this, 1)));
        ((MarketAdvancedSearchViewModel) x()).f8689p.observe(this, new i(19, new d(this, 2)));
    }

    @Override // gd.b
    public final void I() {
        Toolbar toolbar = ((a2) w()).f4158x;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((a2) w()).f4158x);
        if (kj.a.f23207b) {
            LinearLayout searchOptionLayoutContainer = ((a2) w()).f4154t.B;
            Intrinsics.checkNotNullExpressionValue(searchOptionLayoutContainer, "searchOptionLayoutContainer");
            zq.f.M(searchOptionLayoutContainer);
            MaterialCardView stockDisclaimer = ((a2) w()).f4154t.J;
            Intrinsics.checkNotNullExpressionValue(stockDisclaimer, "stockDisclaimer");
            zq.f.M(stockDisclaimer);
        } else {
            LinearLayout searchOptionLayoutContainer2 = ((a2) w()).f4154t.B;
            Intrinsics.checkNotNullExpressionValue(searchOptionLayoutContainer2, "searchOptionLayoutContainer");
            zq.f.M(searchOptionLayoutContainer2);
            MaterialCardView stockDisclaimer2 = ((a2) w()).f4154t.J;
            Intrinsics.checkNotNullExpressionValue(stockDisclaimer2, "stockDisclaimer");
            zq.f.m0(stockDisclaimer2);
        }
        ((a2) w()).f4154t.J.setOnClickListener(new va.a(this, 0));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        int i10 = 4;
        this.f8685k = new f(lifecycle, new d(this, i10));
        RecyclerView recyclerView = ((a2) w()).f4154t.E;
        f fVar = this.f8685k;
        if (fVar != null) {
            recyclerView.setAdapter(fVar);
            o lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
            int i11 = 5;
            this.f8686l = new a(lifecycle2, new d(this, i11));
            RecyclerView recyclerView2 = ((a2) w()).f4154t.H;
            a aVar = this.f8686l;
            if (aVar != null) {
                recyclerView2.setAdapter(aVar);
                ((MarketAdvancedSearchViewModel) x()).h(e.f37823c);
                ((a2) w()).f4154t.f5079t.setOnClickListener(new va.a(this, 1));
                ((a2) w()).f4154t.f5081v.setOnClickListener(new va.a(this, 2));
                ((a2) w()).f4154t.f5080u.setOnClickListener(new va.a(this, 3));
                ((a2) w()).f4154t.L.setOnClickListener(new va.a(this, i10));
                ((a2) w()).f4154t.M.setOnClickListener(new va.a(this, i11));
                ((MarketAdvancedSearchViewModel) x()).i();
                return;
            }
            Intrinsics.k("advancedSearchOptionsAdapter");
            throw null;
        }
        Intrinsics.k("advancedSearchStocksAdapter");
        throw null;
    }

    public final void L(String searchString) {
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        MarketAdvancedSearchViewModel marketAdvancedSearchViewModel = (MarketAdvancedSearchViewModel) x();
        Intrinsics.checkNotNullParameter(searchString, "<set-?>");
        marketAdvancedSearchViewModel.f8693t = searchString;
        MarketAdvancedSearchViewModel marketAdvancedSearchViewModel2 = (MarketAdvancedSearchViewModel) x();
        marketAdvancedSearchViewModel2.f8694u = false;
        marketAdvancedSearchViewModel2.f8695v = 0;
        ((MarketAdvancedSearchViewModel) x()).i();
        ((MarketAdvancedSearchViewModel) x()).f9084g.postValue(Boolean.TRUE);
    }

    public final void M() {
        ((a2) w()).f4154t.f5085z.setVisibility(8);
        ((a2) w()).f4154t.A.setVisibility(8);
        ((a2) w()).f4154t.C.setVisibility(0);
        ((a2) w()).f4154t.F.setVisibility(8);
        ((a2) w()).f4154t.L.setVisibility(8);
    }

    public final void N(List list) {
        if (((MarketAdvancedSearchViewModel) x()).f8695v == 0) {
            a aVar = this.f8686l;
            if (aVar != null) {
                aVar.u(list);
                return;
            } else {
                Intrinsics.k("advancedSearchOptionsAdapter");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        a aVar2 = this.f8686l;
        if (aVar2 != null) {
            List p10 = aVar2.p();
            Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
            arrayList.addAll(p10);
            arrayList.addAll(list);
            a aVar3 = this.f8686l;
            if (aVar3 != null) {
                aVar3.u(arrayList);
                return;
            } else {
                Intrinsics.k("advancedSearchOptionsAdapter");
                throw null;
            }
        }
        Intrinsics.k("advancedSearchOptionsAdapter");
        throw null;
    }

    public final void O(List list) {
        if (((MarketAdvancedSearchViewModel) x()).f8695v == 0) {
            f fVar = this.f8685k;
            if (fVar != null) {
                fVar.u(list);
                return;
            } else {
                Intrinsics.k("advancedSearchStocksAdapter");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        f fVar2 = this.f8685k;
        if (fVar2 != null) {
            List p10 = fVar2.p();
            Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
            arrayList.addAll(p10);
            arrayList.addAll(list);
            f fVar3 = this.f8685k;
            if (fVar3 != null) {
                fVar3.u(arrayList);
                return;
            } else {
                Intrinsics.k("advancedSearchStocksAdapter");
                throw null;
            }
        }
        Intrinsics.k("advancedSearchStocksAdapter");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        h hVar;
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.toolbar_menu_search_market, menu);
        if (menu != null) {
            MenuItem findItem = menu.findItem(R.id.action_search);
            findItem.setVisible(true);
            findItem.expandActionView();
            findItem.setOnActionExpandListener(new la.a(this, 2));
            SearchView searchView = (SearchView) findItem.getActionView();
            if (searchView != null) {
                if (kj.a.f23207b) {
                    hVar = new h(R.string.search_for_stock_hint, new Object[0]);
                } else {
                    hVar = new h(R.string.search_for_stock_hint, new Object[0]);
                }
                searchView.setQueryHint(hVar.a(this));
                searchView.setOnSearchClickListener(new va.a(this, 6));
                o lifecycle = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                searchView.setOnQueryTextListener(new ge.f(lifecycle, new d(this, 3)));
            } else {
                Toast.makeText(this, getString(R.string.generic_error), 0).show();
                finish();
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        FnoRepository fnoRepository = activityComponent.f14246a.e();
        g.i(fnoRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        c factory = new c(a0.a(MarketAdvancedSearchViewModel.class), new q(schedulerProvider, compositeDisposable, userRepository, fnoRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MarketAdvancedSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketAdvancedSearchViewModel.class, "<this>", MarketAdvancedSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketAdvancedSearchViewModel marketAdvancedSearchViewModel = (MarketAdvancedSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketAdvancedSearchViewModel);
            this.f17254b = marketAdvancedSearchViewModel;
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
