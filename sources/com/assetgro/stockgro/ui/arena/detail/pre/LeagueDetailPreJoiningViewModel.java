package com.assetgro.stockgro.ui.arena.detail.pre;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import cd.e;
import cd.i;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import el.l;
import jr.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import ni.j;
import qf.a;
import qu.i0;
import t0.n1;
import t0.o3;
import t0.t;
import vt.p0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/pre/LeagueDetailPreJoiningViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueDetailPreJoiningViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f9047n;

    /* renamed from: o, reason: collision with root package name */
    public final a f9048o;

    /* renamed from: p, reason: collision with root package name */
    public String f9049p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9050q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9051r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9052s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9053t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9054u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9055v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9056w;

    /* renamed from: x, reason: collision with root package name */
    public final n1 f9057x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9058y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9059z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeagueDetailPreJoiningViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ArenaRepository arenaRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9047n = arenaRepository;
        this.f9048o = maintenanceConfigManager;
        ?? liveData = new LiveData();
        this.f9050q = liveData;
        this.f9052s = new LiveData();
        this.f9053t = new LiveData();
        this.f9054u = new LiveData();
        this.f9055v = new LiveData();
        this.f9056w = new LiveData();
        this.f9057x = t.n0(Boolean.TRUE, o3.f35116a);
        this.f9058y = new LiveData();
        this.f9059z = new LiveData();
        this.A = i0.C(liveData, i.f8116b);
        this.B = i0.C(liveData, i.f8117c);
    }

    public final void h() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            g.H(u0.f(this), null, null, new e(this, null), 3);
        }
    }

    public final void i() {
        int i10;
        Double d10;
        int i11;
        Double e10;
        e0 e0Var = this.f9050q;
        ArenaGame arenaGame = (ArenaGame) e0Var.getValue();
        boolean z10 = false;
        if (arenaGame != null) {
            String balance = arenaGame.getBalance();
            if (balance != null) {
                d10 = q.e(balance);
            } else {
                d10 = null;
            }
            if (d10 != null && d10.doubleValue() > 0.0d) {
                int joiningFee = arenaGame.getJoiningFee();
                String balance2 = arenaGame.getBalance();
                if (balance2 != null && (e10 = q.e(balance2)) != null) {
                    i11 = (int) e10.doubleValue();
                } else {
                    i11 = 0;
                }
                i10 = joiningFee - i11;
            } else {
                i10 = arenaGame.getJoiningFee();
            }
        } else {
            i10 = 0;
        }
        ArenaGame arenaGame2 = (ArenaGame) e0Var.getValue();
        if (arenaGame2 != null) {
            if (i10 > 0) {
                z10 = true;
            }
            e0 e0Var2 = this.f9086i;
            e0 e0Var3 = this.f9089l;
            e0 e0Var4 = this.f9088k;
            if (z10) {
                kj.j jVar = new kj.j(new AnalyticEvent("app_league_info_cta_click", p0.f(new Pair("is_continue", Boolean.FALSE))));
                e0Var4.setValue(jVar);
                e0Var3.setValue(jVar);
                e0Var2.setValue(new kj.j(new AnalyticEvent("league_join", l.h0(arenaGame2))));
                e0 e0Var5 = this.f9053t;
                Bundle h10 = h.h("REDIRECT", true);
                h10.putFloat("RECHARGE_AMOUNT", i10);
                e0Var5.postValue(new kj.j(h10));
                return;
            }
            if (!z10) {
                kj.j jVar2 = new kj.j(new AnalyticEvent("app_league_info_cta_click", p0.f(new Pair("is_continue", Boolean.TRUE))));
                e0Var4.setValue(jVar2);
                e0Var3.setValue(jVar2);
                Long portfolioSubmissionTime = arenaGame2.getPortfolioSubmissionTime();
                e0 e0Var6 = this.f9082e;
                if (portfolioSubmissionTime != null) {
                    if (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT <= portfolioSubmissionTime.longValue()) {
                        if (arenaGame2.getSeatsLeft() == 0) {
                            e0Var6.postValue(j.i(Integer.valueOf(R.string.league_full)));
                            return;
                        } else {
                            g.H(u0.f(this), null, null, new cd.h(this, null), 3);
                            return;
                        }
                    }
                }
                e0Var6.postValue(j.i(Integer.valueOf(R.string.league_join_after_portfolio_submission_time)));
                e0Var2.setValue(new kj.j(new AnalyticEvent("league_join_after_portfolio_submission_time", l.h0(arenaGame2))));
                this.f9087j.postValue(new kj.j(Unit.f23355a));
            }
        }
    }
}
