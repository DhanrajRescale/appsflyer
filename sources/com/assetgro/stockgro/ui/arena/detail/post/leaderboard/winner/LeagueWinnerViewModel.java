package com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ja.g;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import pj.a;
import ub.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/winner/LeagueWinnerViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueWinnerViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f9034n;

    /* renamed from: o, reason: collision with root package name */
    public ArenaGame f9035o;

    /* renamed from: p, reason: collision with root package name */
    public List f9036p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9037q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9038r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9039s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9040t;

    /* renamed from: u, reason: collision with root package name */
    public int f9041u;

    /* renamed from: v, reason: collision with root package name */
    public int f9042v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeagueWinnerViewModel(ArenaRepository arenaRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        this.f9034n = arenaRepository;
        this.f9037q = new LiveData();
        this.f9038r = new LiveData();
        this.f9039s = new LiveData();
        this.f9040t = new LiveData();
        this.f9041u = 1;
        this.f9042v = 1;
    }

    public final void h(boolean z10) {
        ArenaGame arenaGame = this.f9035o;
        if (arenaGame != null) {
            h c10 = this.f9034n.getWinners(arenaGame.getGameId(), Integer.valueOf(this.f9042v)).c(((e) this.f9079b).J());
            int i10 = 1;
            d dVar = new d(new za.e(24, new g(this, z10, i10)), new za.e(25, new f(this, i10)));
            c10.a(dVar);
            this.f9080c.c(dVar);
        }
    }
}
