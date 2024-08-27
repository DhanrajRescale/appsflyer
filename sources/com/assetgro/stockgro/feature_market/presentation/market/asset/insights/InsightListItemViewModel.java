package com.assetgro.stockgro.feature_market.presentation.market.asset.insights;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import oa.d;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/asset/insights/InsightListItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/StockDto;", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InsightListItemViewModel extends BaseItemViewModel<StockDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f8655g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f8656h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f8657i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f8658j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightListItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f8655g = i0.C(this.f9075c, d.f29875d);
        this.f8656h = i0.C(this.f9075c, d.f29876e);
        this.f8657i = i0.C(this.f9075c, d.f29873b);
        this.f8658j = i0.C(this.f9075c, d.f29874c);
    }
}
