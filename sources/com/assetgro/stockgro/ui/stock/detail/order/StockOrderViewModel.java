package com.assetgro.stockgro.ui.stock.detail.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import mi.d;
import mi.o;
import mt.p;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final d0 E;
    public final d0 F;
    public final e0 G;
    public final e0 H;
    public final e0 I;
    public final e0 J;
    public final e0 K;
    public final e0 L;
    public final e0 M;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public final e0 Q;
    public final d0 R;
    public final d0 S;
    public final d0 T;
    public final d0 U;
    public final d0 V;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10232n;

    /* renamed from: o, reason: collision with root package name */
    public final p f10233o;

    /* renamed from: p, reason: collision with root package name */
    public Portfolio f10234p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10235q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10236r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10237s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10238t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10239u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10240v;

    /* renamed from: w, reason: collision with root package name */
    public int f10241w;

    /* renamed from: x, reason: collision with root package name */
    public double f10242x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10243y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockOrderViewModel(a schedulerProvider, ct.a compositeDisposable, StockRepository stockRepository, p orderValidator, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10232n = stockRepository;
        this.f10233o = orderValidator;
        this.f10243y = new LiveData();
        this.f10244z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        d0 d0Var = new d0();
        this.E = d0Var;
        d0 d0Var2 = new d0();
        this.F = d0Var2;
        this.G = new LiveData();
        this.H = new LiveData();
        this.I = h.i();
        ?? liveData = new LiveData();
        this.J = liveData;
        this.K = new LiveData();
        this.L = new LiveData();
        this.M = new LiveData();
        this.N = new LiveData();
        ?? liveData2 = new LiveData();
        this.O = liveData2;
        ?? liveData3 = new LiveData();
        this.P = liveData3;
        this.Q = new LiveData();
        d0 C = i0.C(liveData, new o(this, 8));
        this.R = C;
        this.S = i0.C(liveData, d.f27782t);
        this.T = i0.C(liveData, d.f27781s);
        this.U = i0.C(liveData3, d.f27779q);
        this.V = i0.C(liveData, d.f27780r);
        i0.C(liveData, d.f27783u);
        i0.C(liveData, d.f27777o);
        d0Var.a(liveData2, new c(4, new o(this, 0)));
        d0Var.a(C, new c(4, new o(this, 1)));
        d0Var2.a(liveData, new c(4, new o(this, 2)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
