package com.assetgro.stockgro.ui.arena.detail.pre.prize;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.PrizeDistributionDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import ed.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/pre/prize/PrizeDistributionItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/PrizeDistributionDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PrizeDistributionItemViewModel extends BaseItemViewModel<PrizeDistributionDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9060g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9061h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9062i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrizeDistributionItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9060g = i0.C(this.f9075c, d.f15376c);
        this.f9061h = i0.C(this.f9075c, d.f15375b);
        this.f9062i = i0.C(this.f9075c, d.f15377d);
    }
}
