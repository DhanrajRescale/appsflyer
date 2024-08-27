package com.assetgro.stockgro.ui.stock.detail.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mi.d;
import mi.e;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderConfirmationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderConfirmationViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10206n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10207o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10208p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10209q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10210r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10211s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f10212t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f10213u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10214v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10215w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10216x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10217y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10218z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockOrderConfirmationViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10206n = stockRepository;
        ?? liveData = new LiveData();
        this.f10207o = liveData;
        this.f10208p = new LiveData();
        this.f10209q = new LiveData();
        this.f10210r = new LiveData(Boolean.TRUE);
        this.f10211s = i0.C(liveData, d.f27766d);
        this.f10212t = i0.C(liveData, d.f27767e);
        this.f10213u = i0.C(liveData, d.f27769g);
        this.f10214v = i0.C(liveData, d.f27772j);
        this.f10215w = i0.C(liveData, d.f27764b);
        this.f10216x = i0.C(liveData, new e(this, 2));
        this.f10217y = i0.C(liveData, d.f27765c);
        this.f10218z = i0.C(liveData, d.f27768f);
        this.A = i0.C(liveData, d.f27770h);
        this.B = i0.C(liveData, d.f27771i);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
