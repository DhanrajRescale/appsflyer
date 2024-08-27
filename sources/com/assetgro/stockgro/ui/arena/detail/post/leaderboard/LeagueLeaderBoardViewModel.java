package com.assetgro.stockgro.ui.arena.detail.post.leaderboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import d2.y0;
import ft.b;
import jt.d;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import nt.h;
import pj.a;
import qu.i0;
import yk.g;
import zc.f;
import zc.m;
import zc.n;
import zc.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/leaderboard/LeagueLeaderBoardViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueLeaderBoardViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final d0 C;
    public final d0 D;
    public final d0 E;
    public final d0 F;
    public final d0 G;
    public final d0 H;
    public final d0 I;
    public final d0 J;
    public final e0 K;
    public final d0 L;
    public final e0 M;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public final d0 Q;
    public boolean R;
    public final e0 S;
    public boolean T;
    public final e0 U;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f9017n;

    /* renamed from: o, reason: collision with root package name */
    public e f9018o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9019p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9020q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9021r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9022s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9023t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9024u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9025v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9026w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9027x;

    /* renamed from: y, reason: collision with root package name */
    public LeagueStatus f9028y;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f9029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeagueLeaderBoardViewModel(ArenaRepository arenaRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9017n = arenaRepository;
        e0 e0Var = this.f9084g;
        Boolean bool = Boolean.TRUE;
        e0Var.postValue(bool);
        ?? liveData = new LiveData();
        this.f9019p = liveData;
        this.f9020q = liveData;
        ?? liveData2 = new LiveData();
        this.f9021r = liveData2;
        ?? liveData3 = new LiveData();
        this.f9022s = liveData3;
        ?? liveData4 = new LiveData();
        this.f9023t = liveData4;
        this.f9024u = new LiveData(bool);
        this.f9025v = new LiveData();
        this.f9026w = new LiveData();
        this.f9027x = new LiveData();
        Boolean bool2 = Boolean.FALSE;
        this.f9029z = bool2;
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = i0.C(liveData3, f.f42373i);
        this.D = i0.C(liveData3, f.f42374j);
        this.E = i0.C(liveData3, f.f42375k);
        this.F = i0.C(liveData3, f.f42376l);
        this.G = i0.C(liveData3, f.f42371g);
        this.H = i0.C(liveData3, f.f42377m);
        this.I = i0.C(liveData3, new n(this, 0));
        this.J = i0.C(liveData4, new n(this, 2));
        this.K = new LiveData();
        this.L = i0.C(liveData4, f.f42370f);
        this.M = new LiveData();
        this.N = new LiveData();
        this.O = new LiveData();
        this.P = new LiveData(bool2);
        this.Q = i0.C(liveData2, new n(this, 4));
        this.S = new LiveData();
        this.U = new LiveData();
    }

    public static final void h(LeagueLeaderBoardViewModel leagueLeaderBoardViewModel) {
        int i10;
        LeagueStatus leagueStatus = leagueLeaderBoardViewModel.f9028y;
        if (leagueStatus == null) {
            i10 = -1;
        } else {
            i10 = m.f42397a[leagueStatus.ordinal()];
        }
        e0 e0Var = leagueLeaderBoardViewModel.f9024u;
        e0 e0Var2 = leagueLeaderBoardViewModel.M;
        e0 e0Var3 = leagueLeaderBoardViewModel.f9084g;
        e0 e0Var4 = leagueLeaderBoardViewModel.O;
        e0 e0Var5 = leagueLeaderBoardViewModel.N;
        switch (i10) {
            case 1:
                Boolean bool = Boolean.FALSE;
                e0Var3.postValue(bool);
                e0Var5.postValue(bool);
                leagueLeaderBoardViewModel.P.postValue(Boolean.TRUE);
                return;
            case 2:
                Boolean bool2 = Boolean.FALSE;
                e0Var3.postValue(bool2);
                e0Var5.postValue(bool2);
                e0Var4.postValue(Boolean.TRUE);
                return;
            case 3:
                Boolean bool3 = Boolean.FALSE;
                e0Var2.postValue(bool3);
                Boolean bool4 = Boolean.TRUE;
                e0Var.postValue(bool4);
                e0Var3.postValue(bool3);
                e0Var5.postValue(bool3);
                e0Var4.postValue(bool4);
                return;
            case 4:
            case 5:
                Boolean bool5 = Boolean.FALSE;
                e0Var2.postValue(bool5);
                Boolean bool6 = Boolean.TRUE;
                e0Var.postValue(bool6);
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    leagueLeaderBoardViewModel.f9083f.postValue(j.i("Not connected to internet"));
                } else {
                    ArenaGame arenaGame = (ArenaGame) leagueLeaderBoardViewModel.f9021r.getValue();
                    if (arenaGame != null) {
                        String derivedPortfolioId = arenaGame.getDerivedPortfolioId();
                        if (derivedPortfolioId != null && derivedPortfolioId.length() == 0) {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            Intrinsics.checkNotNullParameter("portfolio Id not received in LeagueLeaderBoardViewModel::getLeaderBoard", "message");
                            firebaseCrashlytics.recordException(new Exception("portfolio Id not received in LeagueLeaderBoardViewModel::getLeaderBoard"));
                        } else {
                            g.H(u0.f(leagueLeaderBoardViewModel), null, null, new o(leagueLeaderBoardViewModel, arenaGame, null), 3);
                        }
                    }
                }
                e0Var5.postValue(bool6);
                e0Var4.postValue(bool5);
                return;
            case 6:
                e eVar = leagueLeaderBoardViewModel.f9018o;
                if (eVar != null) {
                    b.b(eVar);
                }
                Boolean bool7 = Boolean.FALSE;
                e0Var5.postValue(bool7);
                e0Var4.postValue(bool7);
                if (leagueLeaderBoardViewModel.f9023t.getValue() == null) {
                    leagueLeaderBoardViewModel.i();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        ArenaGame arenaGame = (ArenaGame) this.f9021r.getValue();
        if (arenaGame != null) {
            h c10 = this.f9017n.getWinners(arenaGame.getGameId(), 1).c(((kq.e) this.f9079b).J());
            d dVar = new d(new za.e(22, new y0(26, this, arenaGame)), new za.e(23, new n(this, 1)));
            c10.a(dVar);
            this.f9080c.c(dVar);
        }
    }

    public final void j(LeagueStatus leagueStatus) {
        LeagueStatus leagueStatus2;
        if (leagueStatus != null && (leagueStatus2 = this.f9028y) != null && leagueStatus != leagueStatus2 && leagueStatus == LeagueStatus.LEAGUE_WINNER_DECLARED) {
            e eVar = this.f9018o;
            if (eVar != null) {
                b.b(eVar);
            }
            e0 e0Var = this.N;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            this.O.postValue(bool);
            if (this.f9023t.getValue() == null) {
                i();
            }
        }
        this.f9028y = leagueStatus;
    }
}
