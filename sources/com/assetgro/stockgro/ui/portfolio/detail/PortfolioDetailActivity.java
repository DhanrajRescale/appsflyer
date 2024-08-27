package com.assetgro.stockgro.ui.portfolio.detail;

import a3.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import b3.t;
import ba.b3;
import ba.c3;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.s;
import gd.b;
import ha.h;
import iu.a0;
import iu.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import xf.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/detail/PortfolioDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/portfolio/detail/PortfolioDetailViewModel;", "Lba/b3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioDetailActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9774m = 0;

    /* renamed from: k, reason: collision with root package name */
    public PortfolioSharedViewModel f9775k;

    /* renamed from: l, reason: collision with root package name */
    public final c f9776l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public PortfolioDetailActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 7));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9776l = registerForActivityResult;
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_portfolio_detail;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        y4.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(PortfolioSharedViewModel.class, "modelClass");
        e b10 = a.b(PortfolioSharedViewModel.class, "<this>", PortfolioSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            this.f9775k = (PortfolioSharedViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            e0 e0Var = ((PortfolioDetailViewModel) x()).f9779p;
            ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 11), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 10), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 9), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 8), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 7), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 6), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 5), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 4), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 3), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 2), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 1), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 0), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 20), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 19), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 18), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 17), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 16), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 15), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 14), ((PortfolioDetailViewModel) da.e.i(7, new ig.b(this, 13), e0Var, this)).O, this)).Q, this)).f9787x, this)).f9788y, this)).A, this)).f9789z, this)).E, this)).D, this)).F, this)).G, this)).H, this)).f9780q, this)).C, this)).B, this)).M, this)).f9783t, this)).Y, this)).S, this)).U, this)).W.observe(this, new v(7, new ig.b(this, 12)));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.b
    public final void I() {
        Portfolio portfolio;
        Object parcelable;
        this.f17260h = "portfolio-detail";
        c3 c3Var = (c3) ((b3) w());
        c3Var.B = (PortfolioDetailViewModel) x();
        synchronized (c3Var) {
            c3Var.C |= 4;
        }
        c3Var.a(24);
        c3Var.m();
        ((b3) w()).p(this);
        Bundle extras = getIntent().getExtras();
        int i10 = 1;
        if (extras != null && extras.getBoolean("REFRESH")) {
            ((PortfolioDetailViewModel) x()).i();
        }
        Portfolio portfolio2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                parcelable = extras2.getParcelable("PORTFOLIO", Portfolio.class);
                portfolio2 = (Portfolio) parcelable;
            }
        } else {
            Bundle extras3 = getIntent().getExtras();
            if (extras3 != null) {
                portfolio = (Portfolio) extras3.getParcelable("PORTFOLIO");
            } else {
                portfolio = null;
            }
            if (portfolio instanceof Portfolio) {
                portfolio2 = portfolio;
            }
        }
        if (portfolio2 != null) {
            ((PortfolioDetailViewModel) x()).k(portfolio2);
            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) x();
            portfolioDetailViewModel.f9782s = portfolio2.getPortfolioId();
            portfolioDetailViewModel.i();
        } else {
            String stringExtra = getIntent().getStringExtra("PORTFOLIO_ID");
            PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) x();
            portfolioDetailViewModel2.f9782s = stringExtra;
            portfolioDetailViewModel2.i();
        }
        u(((b3) w()).f4252y);
        ((b3) w()).f4253z.setUserInputEnabled(true);
        Toolbar toolbar = ((b3) w()).f4252y;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        ((b3) w()).f4250w.a(new nc.c(this, 7));
        ((b3) w()).f4246s.setOnClickListener(new p004if.c(this, 18));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.CustomPopupTheme);
        PopupMenu popupMenu = new PopupMenu(contextThemeWrapper, ((b3) w()).f4248u);
        popupMenu.getMenuInflater().inflate(R.menu.menu_portfolio_default, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new ig.a(this, 0));
        PopupMenu popupMenu2 = new PopupMenu(contextThemeWrapper, ((b3) w()).f4248u);
        popupMenu2.getMenuInflater().inflate(R.menu.menu_portfolio, popupMenu2.getMenu());
        popupMenu2.setOnMenuItemClickListener(new ig.a(this, i10));
        ((b3) w()).f4248u.setOnClickListener(new h(3, this, popupMenu, popupMenu2));
    }

    @Override // h.m, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration != null) {
            configuration.fontScale = 1.0f;
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        PortfolioSharedViewModel portfolioSharedViewModel = this.f9775k;
        if (portfolioSharedViewModel != null) {
            portfolioSharedViewModel.f9790b.postValue(Boolean.TRUE);
        } else {
            Intrinsics.k("model");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        ea.v vVar = (ea.v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        PortfolioRepository portfolioRepository = activityComponent.f14246a.j();
        g.i(portfolioRepository);
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        g.i(arenaRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(PortfolioDetailViewModel.class), new s(k10, compositeDisposable, portfolioRepository, arenaRepository, userRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, PortfolioDetailViewModel.class, "modelClass");
        e b10 = a.b(PortfolioDetailViewModel.class, "<this>", PortfolioDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(portfolioDetailViewModel);
            this.f17254b = portfolioDetailViewModel;
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
