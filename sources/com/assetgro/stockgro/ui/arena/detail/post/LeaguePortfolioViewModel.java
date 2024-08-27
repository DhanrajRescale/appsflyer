package com.assetgro.stockgro.ui.arena.detail.post;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import qu.i0;
import yc.k;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/LeaguePortfolioViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "yc/f", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeaguePortfolioViewModel extends BaseViewModel {
    public final e0 A;
    public String B;
    public LeagueStatus C;
    public final e0 D;
    public final d0 E;
    public final d0 F;
    public final d0 G;
    public final d0 H;
    public final d0 I;
    public final d0 J;
    public final d0 K;
    public final d0 L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final d0 P;
    public final d0 Q;
    public final d0 R;
    public final d0 S;
    public final d0 T;
    public final d0 U;
    public final d0 V;
    public final d0 W;
    public final d0 X;
    public final d0 Y;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8999n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f9000o;

    /* renamed from: p, reason: collision with root package name */
    public String f9001p;

    /* renamed from: q, reason: collision with root package name */
    public String f9002q;

    /* renamed from: r, reason: collision with root package name */
    public UnifiedPortfolio f9003r;

    /* renamed from: s, reason: collision with root package name */
    public e f9004s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9005t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9006u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9007v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9008w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9009x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9010y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9011z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeaguePortfolioViewModel(ArenaRepository arenaRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8999n = arenaRepository;
        this.f9000o = new d0();
        this.f9005t = new LiveData(Boolean.FALSE);
        ?? liveData = new LiveData();
        this.f9006u = liveData;
        this.f9007v = new LiveData();
        this.f9008w = new LiveData();
        Boolean bool = Boolean.TRUE;
        this.f9009x = new LiveData(bool);
        this.f9010y = new LiveData();
        this.f9011z = new LiveData();
        this.A = new LiveData();
        this.D = new LiveData();
        this.E = i0.C(liveData, yc.e.f41497q);
        this.F = i0.C(liveData, yc.e.f41485e);
        this.G = i0.C(liveData, yc.e.f41488h);
        this.H = i0.C(liveData, yc.e.f41484d);
        this.I = i0.C(liveData, new k(this, 2));
        this.J = i0.C(liveData, yc.e.f41496p);
        this.K = i0.C(liveData, yc.e.f41498r);
        this.L = i0.C(liveData, yc.e.f41492l);
        this.M = i0.C(liveData, yc.e.f41493m);
        this.N = i0.C(liveData, yc.e.f41501u);
        this.O = i0.C(liveData, yc.e.f41500t);
        this.P = i0.C(liveData, yc.e.f41499s);
        this.Q = i0.C(liveData, yc.e.f41502v);
        this.R = i0.C(liveData, yc.e.f41486f);
        this.S = i0.C(liveData, yc.e.f41489i);
        this.T = i0.C(liveData, yc.e.f41490j);
        this.U = i0.C(liveData, yc.e.f41495o);
        this.V = i0.C(liveData, new k(this, 0));
        this.W = i0.C(liveData, yc.e.f41491k);
        this.X = i0.C(liveData, yc.e.f41487g);
        this.Y = i0.C(liveData, new k(this, 3));
        this.f9084g.setValue(bool);
    }

    public final void h() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        String str = this.f9001p;
        if (str != null && str.length() != 0) {
            try {
                g.H(u0.f(this), null, null, new yc.j(this, null), 3);
            } catch (Exception unused) {
                this.f9084g.postValue(Boolean.FALSE);
            }
        } else {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullParameter("portfolio Id not received in LeaguePortfolioViewModel::getUnifiedLeaguePortfolioData", "message");
            firebaseCrashlytics.recordException(new Exception("portfolio Id not received in LeaguePortfolioViewModel::getUnifiedLeaguePortfolioData"));
        }
    }
}
