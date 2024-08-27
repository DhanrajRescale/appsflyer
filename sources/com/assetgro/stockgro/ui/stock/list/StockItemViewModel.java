package com.assetgro.stockgro.ui.stock.list;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ni.k;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/list/StockItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/StockDto;", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockItemViewModel extends BaseItemViewModel<StockDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f10245g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f10246h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f10247i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f10248j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f10249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f10245g = i0.C(this.f9075c, k.f28740c);
        this.f10246h = i0.C(this.f9075c, k.f28741d);
        this.f10247i = i0.C(this.f9075c, k.f28743f);
        this.f10248j = i0.C(this.f9075c, k.f28739b);
        this.f10249k = i0.C(this.f9075c, k.f28742e);
    }
}
