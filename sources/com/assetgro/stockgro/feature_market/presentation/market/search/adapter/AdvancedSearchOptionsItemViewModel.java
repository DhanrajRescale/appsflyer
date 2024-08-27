package com.assetgro.stockgro.feature_market.presentation.market.search.adapter;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/search/adapter/AdvancedSearchOptionsItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AdvancedSearchOptionsItemViewModel extends BaseItemViewModel<FnoOptionDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f8696g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f8697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedSearchOptionsItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f8696g = i0.C(this.f9075c, wa.e.f38902b);
        this.f8697h = i0.C(this.f9075c, wa.e.f38903c);
    }
}
