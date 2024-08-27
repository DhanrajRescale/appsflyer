package com.assetgro.stockgro.ui.stock.modify.buy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import mt.p;
import pi.g;
import pi.h;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/buy/ModifyBuyOrderViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyBuyOrderViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public int F;
    public float G;
    public int H;
    public final e0 I;
    public final d0 J;
    public final d0 K;
    public final e0 L;
    public final e0 M;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public final e0 Q;
    public final e0 R;
    public final e0 S;
    public final e0 T;
    public final e0 U;
    public final e0 V;
    public final e0 W;
    public final e0 X;
    public final e0 Y;
    public final e0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final d0 f10270a0;

    /* renamed from: b0, reason: collision with root package name */
    public final d0 f10271b0;

    /* renamed from: c0, reason: collision with root package name */
    public final d0 f10272c0;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10273n;

    /* renamed from: o, reason: collision with root package name */
    public final p f10274o;

    /* renamed from: p, reason: collision with root package name */
    public Portfolio f10275p;

    /* renamed from: q, reason: collision with root package name */
    public String f10276q;

    /* renamed from: r, reason: collision with root package name */
    public String f10277r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10278s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10279t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10280u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10281v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10282w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10283x;

    /* renamed from: y, reason: collision with root package name */
    public double f10284y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyBuyOrderViewModel(a schedulerProvider, ct.a compositeDisposable, StockRepository stockRepository, p orderValidator, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10273n = stockRepository;
        this.f10274o = orderValidator;
        this.f10285z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        this.I = new LiveData();
        d0 d0Var = new d0();
        this.J = d0Var;
        d0 d0Var2 = new d0();
        this.K = d0Var2;
        this.L = new LiveData();
        this.M = new LiveData();
        this.N = new LiveData();
        this.O = new LiveData();
        this.P = new LiveData();
        this.Q = new LiveData();
        this.R = new LiveData();
        ?? liveData = new LiveData();
        this.S = liveData;
        this.T = new LiveData();
        this.U = new LiveData();
        this.V = new LiveData();
        this.W = new LiveData();
        this.X = new LiveData();
        ?? liveData2 = new LiveData();
        this.Y = liveData2;
        ?? liveData3 = new LiveData();
        this.Z = liveData3;
        d0 C = i0.C(liveData, new g(this, 11));
        this.f10270a0 = C;
        this.f10271b0 = i0.C(liveData3, h.f31126d);
        this.f10272c0 = i0.C(liveData2, h.f31127e);
        d0Var.a(C, new c(11, new g(this, 0)));
        d0Var2.a(liveData3, new c(11, new g(this, 1)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(double d10) {
        this.f10284y = d10;
        this.I.postValue(Double.valueOf(d10));
        this.K.postValue(Double.valueOf(this.F * this.f10284y));
    }
}
