package com.assetgro.stockgro.feature_market.presentation.market.search.adapter;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/search/adapter/AdvancedSearchStocksItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AdvancedSearchStocksItemViewModel extends BaseItemViewModel<FnoOptionDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f8698g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f8699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedSearchStocksItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f8698g = i0.C(this.f9075c, wa.e.f38904d);
        this.f8699h = i0.C(this.f9075c, wa.e.f38905e);
    }
}
