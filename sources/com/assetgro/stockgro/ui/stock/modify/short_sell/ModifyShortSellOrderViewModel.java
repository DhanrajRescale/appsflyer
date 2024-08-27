package com.assetgro.stockgro.ui.stock.modify.short_sell;

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
import kq.e;
import li.c;
import pj.a;
import qu.i0;
import ti.g;
import ti.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/short_sell/ModifyShortSellOrderViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyShortSellOrderViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public int D;
    public float E;
    public int F;
    public final e0 G;
    public final d0 H;
    public final d0 I;
    public final e0 J;
    public final e0 K;
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
    public final d0 Y;
    public final d0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final d0 f10356a0;

    /* renamed from: b0, reason: collision with root package name */
    public final d0 f10357b0;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10358n;

    /* renamed from: o, reason: collision with root package name */
    public final e f10359o;

    /* renamed from: p, reason: collision with root package name */
    public Portfolio f10360p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10361q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10362r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10363s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10364t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10365u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10366v;

    /* renamed from: w, reason: collision with root package name */
    public double f10367w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10368x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10369y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10370z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyShortSellOrderViewModel(a schedulerProvider, ct.a compositeDisposable, StockRepository stockRepository, e orderValidator, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10358n = stockRepository;
        this.f10359o = orderValidator;
        this.f10368x = new LiveData();
        this.f10369y = new LiveData();
        this.f10370z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.G = new LiveData();
        d0 d0Var = new d0();
        this.H = d0Var;
        d0 d0Var2 = new d0();
        this.I = d0Var2;
        this.J = new LiveData();
        this.K = new LiveData();
        this.L = new LiveData();
        this.M = new LiveData();
        this.N = new LiveData();
        this.O = new LiveData();
        this.P = new LiveData();
        ?? liveData = new LiveData();
        this.Q = liveData;
        this.R = new LiveData();
        this.S = new LiveData();
        this.T = new LiveData();
        this.U = new LiveData();
        ?? liveData2 = new LiveData();
        this.V = liveData2;
        ?? liveData3 = new LiveData();
        this.W = liveData3;
        ?? liveData4 = new LiveData();
        this.X = liveData4;
        d0 C = i0.C(liveData, new g(this, 13));
        this.Y = C;
        this.Z = i0.C(liveData4, h.f36108d);
        this.f10356a0 = i0.C(liveData3, h.f36109e);
        this.f10357b0 = i0.C(liveData, h.f36110f);
        d0Var.a(liveData2, new c(20, new g(this, 0)));
        d0Var.a(C, new c(20, new g(this, 1)));
        d0Var2.a(liveData4, new c(20, new g(this, 2)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(double d10) {
        this.f10367w = d10;
        this.G.postValue(Double.valueOf(d10));
        this.I.postValue(Double.valueOf(this.D * this.f10367w));
    }
}
