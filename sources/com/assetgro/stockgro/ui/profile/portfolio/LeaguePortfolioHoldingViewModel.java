package com.assetgro.stockgro.ui.profile.portfolio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import gh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/portfolio/LeaguePortfolioHoldingViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeaguePortfolioHoldingViewModel extends BaseViewModel {
    public final d0 A;
    public final e0 B;
    public final d0 C;
    public final d0 D;
    public final d0 E;

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9991n;

    /* renamed from: o, reason: collision with root package name */
    public String f9992o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9993p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9994q;

    /* renamed from: r, reason: collision with root package name */
    public String f9995r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9996s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f9997t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f9998u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f9999v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10000w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10001x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10002y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeaguePortfolioHoldingViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9991n = portfolioRepository;
        this.f9992o = "EQUITY";
        ?? liveData = new LiveData();
        this.f9993p = liveData;
        ?? liveData2 = new LiveData();
        this.f9994q = liveData2;
        this.f9996s = new LiveData();
        this.f9997t = i0.C(liveData, b.f17416e);
        this.f9998u = i0.C(liveData, b.f17413b);
        this.f9999v = i0.C(liveData, b.f17420i);
        this.f10000w = i0.C(liveData, b.f17419h);
        this.f10001x = i0.C(liveData, b.f17414c);
        this.f10002y = i0.C(liveData, b.f17417f);
        this.f10003z = i0.C(liveData, b.f17418g);
        this.A = i0.C(liveData2, b.f17423l);
        this.B = new LiveData();
        this.C = i0.C(liveData2, b.f17415d);
        this.D = i0.C(liveData, b.f17422k);
        this.E = i0.C(liveData, b.f17421j);
    }
}
