package com.assetgro.stockgro.ui.profile.portfolio;

import ak.p;
import android.os.Parcelable;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import ba.k1;
import ch.c;
import com.assetgro.stockgro.data.model.User;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.m;
import ea.v;
import gd.b;
import iu.a0;
import kg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import rg.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/portfolio/LeaguePortfolioHoldingActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/portfolio/LeaguePortfolioHoldingViewModel;", "Lba/k1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeaguePortfolioHoldingActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9988m = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9989k;

    /* renamed from: l, reason: collision with root package name */
    public e f9990l;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_league_portfolio_holding;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((LeaguePortfolioHoldingViewModel) x()).f9084g.observe(this, new c(4, new gh.a(this, 6)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel.f9997t.observe(this, new c(4, new gh.a(this, 7)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel2 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel2.f9998u.observe(this, new c(4, new gh.a(this, 8)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel3 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel3.f9999v.observe(this, new c(4, new gh.a(this, 9)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel4 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel4.f10002y.observe(this, new c(4, new gh.a(this, 10)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel5 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel5.f10003z.observe(this, new c(4, new gh.a(this, 11)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel6 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel6.f10000w.observe(this, new c(4, new gh.a(this, 12)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel7 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel7.f10001x.observe(this, new c(4, new gh.a(this, 13)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel8 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel8.A.observe(this, new c(4, new gh.a(this, 14)));
        ((LeaguePortfolioHoldingViewModel) x()).B.observe(this, new c(4, new gh.a(this, 0)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel9 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel9.C.observe(this, new c(4, new gh.a(this, 1)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel10 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel10.D.observe(this, new c(4, new gh.a(this, 2)));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel11 = (LeaguePortfolioHoldingViewModel) x();
        leaguePortfolioHoldingViewModel11.E.observe(this, new c(4, new gh.a(this, 4)));
        ((LeaguePortfolioHoldingViewModel) x()).f9996s.observe(this, new c(4, new gh.a(this, 5)));
    }

    @Override // gd.b
    public final void I() {
        String stringExtra = getIntent().getStringExtra("LEAGUE_ID");
        if (stringExtra != null) {
            ((LeaguePortfolioHoldingViewModel) x()).f9995r = stringExtra;
        }
        ((LeaguePortfolioHoldingViewModel) x()).B.postValue(getIntent().getStringExtra("LEAGUE_NAME"));
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel = (LeaguePortfolioHoldingViewModel) x();
        String stringExtra2 = getIntent().getStringExtra("ASSET_CLASS_TYPE");
        if (stringExtra2 == null) {
            stringExtra2 = "EQUITY";
        }
        Intrinsics.checkNotNullParameter(stringExtra2, "<set-?>");
        leaguePortfolioHoldingViewModel.f9992o = stringExtra2;
        u(((k1) w()).f5196w);
        k1 k1Var = (k1) w();
        k1Var.f5196w.setNavigationOnClickListener(new p004if.c(this, 25));
        ((k1) w()).f5192s.A.setVisibility(8);
        nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
        Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
        ((g) ((g) com.bumptech.glide.b.c(this).f(this).m(getIntent().getStringExtra("IMAGE_URL_KEY")).w((nk.e) p10).b()).l(R.drawable.ic_placeholder_stock)).z(((k1) w()).f5197x);
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().C("SubscribeToAccessBottomSheetDialogFragment") != null) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        User user;
        super.onResume();
        e0 e0Var = ((LeaguePortfolioHoldingViewModel) x()).f9994q;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("PLAYER_USER");
        if (parcelableExtra instanceof User) {
            user = (User) parcelableExtra;
        } else {
            user = null;
        }
        e0Var.postValue(user);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        PortfolioRepository portfolioRepository = activityComponent.f14246a.j();
        yk.g.i(portfolioRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(LeaguePortfolioHoldingViewModel.class), new m(k10, compositeDisposable, portfolioRepository, userRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, LeaguePortfolioHoldingViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeaguePortfolioHoldingViewModel.class, "<this>", LeaguePortfolioHoldingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel = (LeaguePortfolioHoldingViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(leaguePortfolioHoldingViewModel);
            this.f17254b = leaguePortfolioHoldingViewModel;
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
