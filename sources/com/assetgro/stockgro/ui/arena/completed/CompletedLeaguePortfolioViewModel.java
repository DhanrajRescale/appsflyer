package com.assetgro.stockgro.ui.arena.completed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import qu.i0;
import vc.e;
import vc.f;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/completed/CompletedLeaguePortfolioViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CompletedLeaguePortfolioViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8969n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8970o;

    /* renamed from: p, reason: collision with root package name */
    public ArenaGame f8971p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f8972q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f8973r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f8974s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f8975t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f8976u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f8977v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f8978w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f8979x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f8980y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f8981z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public CompletedLeaguePortfolioViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, ArenaRepository arenaRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8969n = arenaRepository;
        ?? liveData = new LiveData();
        this.f8970o = liveData;
        this.f8972q = i0.C(liveData, e.f37949j);
        this.f8973r = i0.C(liveData, e.f37942c);
        this.f8974s = i0.C(liveData, e.f37944e);
        this.f8975t = i0.C(liveData, e.f37941b);
        this.f8976u = i0.C(liveData, e.f37950k);
        this.f8977v = i0.C(liveData, e.f37945f);
        this.f8978w = i0.C(liveData, e.f37946g);
        this.f8979x = i0.C(liveData, e.f37952m);
        this.f8980y = i0.C(liveData, e.f37951l);
        this.f8981z = i0.C(liveData, e.f37947h);
        this.A = i0.C(liveData, e.f37943d);
        this.B = i0.C(liveData, e.f37948i);
    }

    public final ArenaGame h() {
        ArenaGame arenaGame = this.f8971p;
        if (arenaGame != null) {
            return arenaGame;
        }
        Intrinsics.k("arenaGame");
        throw null;
    }

    public final void i() {
        if (this.f8971p != null) {
            String assetClass = h().getAssetClass();
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                this.f9083f.setValue(j.i("Not connected to internet"));
                return;
            }
            String derivedPortfolioId = h().getDerivedPortfolioId();
            if (derivedPortfolioId != null && derivedPortfolioId.length() == 0) {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                Intrinsics.checkNotNullParameter("portfolio Id not received in CompletedLeaguePortfolioViewModel::getUnifiedLeaguePortfolioData", "message");
                firebaseCrashlytics.recordException(new Exception("portfolio Id not received in CompletedLeaguePortfolioViewModel::getUnifiedLeaguePortfolioData"));
            } else {
                try {
                    g.H(u0.f(this), null, null, new f(this, assetClass, null), 3);
                } catch (Exception unused) {
                    this.f9084g.postValue(Boolean.FALSE);
                }
            }
        }
    }
}
