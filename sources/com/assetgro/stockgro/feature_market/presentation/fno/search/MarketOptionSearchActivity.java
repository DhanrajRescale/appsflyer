package com.assetgro.stockgro.feature_market.presentation.fno.search;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import ba.c2;
import c2.e1;
import ca.c;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.q;
import ea.v;
import f7.i;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import la.d;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/search/MarketOptionSearchActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/search/MarketOptionSearchViewModel;", "Lba/c2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketOptionSearchActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public d f8647k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_market_option_search;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((MarketOptionSearchViewModel) x()).f8650p.observe(this, new i(9, new e1(this, 21)));
    }

    @Override // gd.b
    public final void I() {
        ((c2) w()).f4335s.setTitle("Search");
        Toolbar toolbar = ((c2) w()).f4335s;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((c2) w()).f4335s);
        if (!(this.f8647k instanceof d)) {
            y().screenNavigated("market-fno");
            d1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
            d dVar = (d) getSupportFragmentManager().C("SearchOptionsFragment");
            if (dVar == null) {
                int i10 = d.f24382h;
                Bundle extras = getIntent().getExtras();
                Bundle bundle = new Bundle();
                bundle.putAll(extras);
                dVar = new d();
                dVar.setArguments(bundle);
                aVar.e(R.id.container_fragment, dVar, "SearchOptionsFragment", 1);
            } else {
                aVar.o(dVar);
            }
            aVar.h(false);
            this.f8647k = dVar;
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
        findItem.setOnActionExpandListener(new la.a(this, 0));
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
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        FnoRepository fnoRepository = activityComponent.f14246a.e();
        g.i(fnoRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(MarketOptionSearchViewModel.class), new q(k10, compositeDisposable, fnoRepository, userRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MarketOptionSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketOptionSearchViewModel.class, "<this>", MarketOptionSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketOptionSearchViewModel marketOptionSearchViewModel = (MarketOptionSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketOptionSearchViewModel);
            this.f17254b = marketOptionSearchViewModel;
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
