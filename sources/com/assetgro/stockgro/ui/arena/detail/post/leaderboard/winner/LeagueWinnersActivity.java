package com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner;

import ad.a;
import ad.e;
import android.os.Parcelable;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.q1;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import ea.n;
import ea.v;
import eb.c;
import eb.f;
import gd.b;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/winner/LeagueWinnersActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/winner/LeagueWinnerViewModel;", "Lba/q1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueWinnersActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9043l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9044k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_league_winner;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((LeagueWinnerViewModel) x()).f9037q.observe(this, new c(19, new e(this, 0)));
        ((LeagueWinnerViewModel) x()).f9038r.observe(this, new c(19, new e(this, 1)));
        ((LeagueWinnerViewModel) x()).f9039s.observe(this, new c(19, new e(this, 2)));
        ((LeagueWinnerViewModel) x()).f9040t.observe(this, new c(19, new e(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        ArenaGame arenaGame;
        ArrayList arrayList;
        boolean z10;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("LEAGUE");
        if (parcelableExtra instanceof ArenaGame) {
            arenaGame = (ArenaGame) parcelableExtra;
        } else {
            arenaGame = null;
        }
        if (arenaGame != null) {
            ((LeagueWinnerViewModel) x()).f9035o = arenaGame;
            u(((q1) w()).f5822u);
            ((LeagueWinnerViewModel) x()).h(true);
            ((q1) w()).f5821t.m(arenaGame.getName(), arenaGame.getAssetClass(), arenaGame.getDisplayPic());
        }
        LeagueWinnerViewModel leagueWinnerViewModel = (LeagueWinnerViewModel) x();
        Object parcelableExtra2 = getIntent().getParcelableExtra("DATA");
        if (parcelableExtra2 instanceof ArrayList) {
            arrayList = (ArrayList) parcelableExtra2;
        } else {
            arrayList = null;
        }
        leagueWinnerViewModel.f9036p = arrayList;
        ((q1) w()).f5822u.setNavigationOnClickListener(new j(this, 26));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        if (arenaGame != null) {
            z10 = arenaGame.getWinCash();
        } else {
            z10 = false;
        }
        a aVar = new a(lifecycle, z10, new e(this, 4));
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f9044k = aVar;
        q1 q1Var = (q1) w();
        a aVar2 = this.f9044k;
        if (aVar2 != null) {
            q1Var.f5824w.setAdapter(aVar2);
            ((q1) w()).f5820s.setItemSelectListener(new f(this, 1));
            return;
        }
        Intrinsics.k("leagueDeclaredWinnerAdapter");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        g.i(arenaRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(LeagueWinnerViewModel.class), new n(arenaRepository, userRepository, k10, compositeDisposable));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, LeagueWinnerViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueWinnerViewModel.class, "<this>", LeagueWinnerViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueWinnerViewModel leagueWinnerViewModel = (LeagueWinnerViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(leagueWinnerViewModel);
            this.f17254b = leagueWinnerViewModel;
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
