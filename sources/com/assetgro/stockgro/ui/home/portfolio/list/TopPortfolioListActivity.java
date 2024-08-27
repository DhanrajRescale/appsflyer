package com.assetgro.stockgro.ui.home.portfolio.list;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.j4;
import com.assetgro.stockgro.data.enums.TopPortfolioType;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import ge.q;
import iu.a0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import p004if.a;
import p004if.c;
import p004if.g;
import p004if.h;
import qu.i0;
import re.d;
import ub.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/home/portfolio/list/TopPortfolioListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/home/portfolio/list/TopPortfolioListViewModel;", "Lba/j4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TopPortfolioListActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9561l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9562k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_top_portfolio_list;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((TopPortfolioListViewModel) x()).f9564o.observe(this, new d(13, new h(this, 0)));
    }

    @Override // gd.b
    public final void I() {
        Serializable serializableExtra = getIntent().getSerializableExtra("PORTFOLIO_TYPE");
        Intrinsics.d(serializableExtra, "null cannot be cast to non-null type com.assetgro.stockgro.data.enums.TopPortfolioType");
        TopPortfolioType portfolioType = (TopPortfolioType) serializableExtra;
        int i10 = g.f19962a[portfolioType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                j4 j4Var = (j4) w();
                j4Var.f5106s.setTitle(getString(R.string.top_portfolios_of_today));
            }
        } else {
            j4 j4Var2 = (j4) w();
            j4Var2.f5106s.setTitle(getString(R.string.top_portfolios_of_this_week));
        }
        TopPortfolioListViewModel topPortfolioListViewModel = (TopPortfolioListViewModel) x();
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        topPortfolioListViewModel.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = topPortfolioListViewModel.f9563n.getHomePageTopData().c(((e) topPortfolioListViewModel.f9079b).J());
        jt.d dVar = new jt.d(new q(28, new zd.g(7, topPortfolioListViewModel, portfolioType)), new q(29, new f(topPortfolioListViewModel, 18)));
        c10.a(dVar);
        topPortfolioListViewModel.f9080c.c(dVar);
        Toolbar toolbar = ((j4) w()).f5106s;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((j4) w()).f5106s);
        j4 j4Var3 = (j4) w();
        j4Var3.f5106s.setNavigationOnClickListener(new c(this, 1));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9562k = new a(lifecycle, new h(this, 1));
        j4 j4Var4 = (j4) w();
        a aVar = this.f9562k;
        if (aVar != null) {
            j4Var4.f5107t.setAdapter(aVar);
        } else {
            Intrinsics.k("topPortfolioAdapter");
            throw null;
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        TopChartsRepository topChartsRepository = (TopChartsRepository) activityComponent.f14246a.f14269u.get();
        yk.g.i(topChartsRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(TopPortfolioListViewModel.class), new ea.e(k10, compositeDisposable, topChartsRepository, userRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, TopPortfolioListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(TopPortfolioListViewModel.class, "<this>", TopPortfolioListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            TopPortfolioListViewModel topPortfolioListViewModel = (TopPortfolioListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(topPortfolioListViewModel);
            this.f17254b = topPortfolioListViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
