package com.assetgro.stockgro.ui.stock.shortSell.confirm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qu.i0;
import wi.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/shortSell/confirm/StockSortSellConfirmationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockSortSellConfirmationViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10409n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10410o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10411p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10412q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10413r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10414s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f10415t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f10416u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10417v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10418w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10419x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10420y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10421z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockSortSellConfirmationViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10409n = stockRepository;
        ?? liveData = new LiveData();
        this.f10410o = liveData;
        this.f10411p = new LiveData();
        this.f10412q = new LiveData();
        this.f10413r = new LiveData(Boolean.TRUE);
        this.f10414s = i0.C(liveData, d.f39086d);
        this.f10415t = i0.C(liveData, d.f39087e);
        this.f10416u = i0.C(liveData, d.f39089g);
        this.f10417v = i0.C(liveData, d.f39092j);
        this.f10418w = i0.C(liveData, d.f39084b);
        this.f10419x = i0.C(liveData, d.f39093k);
        this.f10420y = i0.C(liveData, d.f39085c);
        this.f10421z = i0.C(liveData, d.f39088f);
        this.A = i0.C(liveData, d.f39090h);
        this.B = i0.C(liveData, d.f39091i);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
