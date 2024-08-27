package com.assetgro.stockgro.ui.arena.completed;

import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import b3.t;
import ba.i1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeagueDetailActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import nc.c;
import qu.i0;
import vc.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/completed/CompletedLeagueDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/arena/completed/CompletedLeagueDetailViewModel;", "Lba/i1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CompletedLeagueDetailActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f8967k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_league_detail_closed;
    }

    @Override // gd.b
    public final void I() {
        this.f17260h = "arena-completed-league";
        C(new AnalyticEvent("app_completed_league_view", null, 2, null));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("LEAGUE");
        Intrinsics.c(parcelableExtra);
        ArenaGame arenaGame = (ArenaGame) parcelableExtra;
        final int i10 = 0;
        int intExtra = getIntent().getIntExtra("LEAGUE DETAIL POSITION", 0);
        ((CompletedLeagueDetailViewModel) x()).f8968n = arenaGame;
        i1 i1Var = (i1) w();
        i1Var.f5002s.m(arenaGame.getName(), arenaGame.getAssetClass(), arenaGame.getDisplayPic());
        u(((i1) w()).f5004u);
        i1 i1Var2 = (i1) w();
        i1Var2.f5004u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: vc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompletedLeagueDetailActivity f37932b;

            {
                this.f37932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                CompletedLeagueDetailActivity this$0 = this.f37932b;
                switch (i11) {
                    case 0:
                        int i12 = CompletedLeagueDetailActivity.f8967k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = CompletedLeagueDetailActivity.f8967k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                }
            }
        });
        i1 i1Var3 = (i1) w();
        d1 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        i1Var3.f5005v.setAdapter(new g(supportFragmentManager, lifecycle, getIntent().getExtras()));
        final int i11 = 1;
        ((i1) w()).f5005v.setUserInputEnabled(true);
        i1 i1Var4 = (i1) w();
        i1 i1Var5 = (i1) w();
        new n(i1Var4.f5003t, i1Var5.f5005v, new t(this, 29)).a();
        i1 i1Var6 = (i1) w();
        i1Var6.f5004u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: vc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompletedLeagueDetailActivity f37932b;

            {
                this.f37932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                CompletedLeagueDetailActivity this$0 = this.f37932b;
                switch (i112) {
                    case 0:
                        int i12 = CompletedLeagueDetailActivity.f8967k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = CompletedLeagueDetailActivity.f8967k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                }
            }
        });
        i1 i1Var7 = (i1) w();
        i1Var7.f5003t.a(new c(this, 3));
        if (intExtra != 0) {
            ((i1) w()).f5005v.setCurrentItem(intExtra);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_league_closed, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.menu_options_league_info) {
            Intent intent = new Intent(this, (Class<?>) LeagueDetailPreJoiningActivity.class);
            intent.putExtra("LEAGUE", ((CompletedLeagueDetailViewModel) x()).f8968n);
            intent.putExtra("VIEW_ONLY", true);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(CompletedLeagueDetailViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, CompletedLeagueDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(CompletedLeagueDetailViewModel.class, "<this>", CompletedLeagueDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            CompletedLeagueDetailViewModel completedLeagueDetailViewModel = (CompletedLeagueDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(completedLeagueDetailViewModel);
            this.f17254b = completedLeagueDetailViewModel;
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
