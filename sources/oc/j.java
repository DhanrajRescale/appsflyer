package oc;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.d1;
import b3.t;
import ba.qf;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeagueDetailActivity;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loc/j;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/asset/v2/myleagues/viewmodel/ArenaMyLeaguesViewModel;", "Lba/qf;", "Loc/d;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends gd.m<ArenaMyLeaguesViewModel, qf> implements d {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f29952h;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f29953g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_arena_my_leagues_host;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((qf) q()).p(this);
        qf qfVar = (qf) q();
        d1 fragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        qfVar.f5855s.setAdapter(new z7.e(fragmentManager, lifecycle));
        byte[] bArr = kj.a.f23206a;
        if (kj.a.f23207b) {
            CollapsingToolbarLayout collapsingToolbar = ((qf) q()).f5856t;
            Intrinsics.checkNotNullExpressionValue(collapsingToolbar, "collapsingToolbar");
            zq.f.M(collapsingToolbar);
        } else {
            CollapsingToolbarLayout collapsingToolbar2 = ((qf) q()).f5856t;
            Intrinsics.checkNotNullExpressionValue(collapsingToolbar2, "collapsingToolbar");
            zq.f.M(collapsingToolbar2);
        }
        qf qfVar2 = (qf) q();
        qf qfVar3 = (qf) q();
        new yo.n(qfVar2.f5857u, qfVar3.f5855s, new t(this, 26)).a();
        ((qf) q()).f5855s.setUserInputEnabled(true);
        qf qfVar4 = (qf) q();
        qfVar4.f5857u.a(new nc.c(this, 1));
    }

    @Override // oc.d
    public final void g(ArenaGame arenaGame, int i10) {
        String str;
        if (arenaGame != null) {
            str = arenaGame.getStatus();
        } else {
            str = null;
        }
        if (Intrinsics.a(str, "W")) {
            Intent intent = new Intent(getContext(), (Class<?>) CompletedLeagueDetailActivity.class);
            intent.putExtra("LEAGUE", arenaGame);
            intent.putExtra("LEAGUE DETAIL POSITION", i10);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(getContext(), (Class<?>) LeagueDetailPostJoiningActivity.class);
        intent2.putExtra("LEAGUE", arenaGame);
        intent2.putExtra("LEAGUE DETAIL POSITION", i10);
        startActivity(intent2);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MainSharedViewModel mainSharedViewModel = this.f29953g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.F.setValue("arena-my-leagues");
            if (((qf) q()).f5857u.getSelectedTabPosition() == 0) {
                ((ArenaMyLeaguesViewModel) r()).f8950o.postValue(Boolean.TRUE);
                return;
            } else {
                ((ArenaMyLeaguesViewModel) r()).f8950o.postValue(Boolean.FALSE);
                return;
            }
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.a();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
        this.f29953g = fragmentComponent.f();
    }
}
