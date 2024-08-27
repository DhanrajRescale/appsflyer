package com.assetgro.stockgro.ui.portfolio.rename;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/rename/RenamePortfolioBottomSheetViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RenamePortfolioBottomSheetViewModel extends BaseBottomSheetViewModel {

    /* renamed from: g, reason: collision with root package name */
    public final PortfolioRepository f9926g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f9927h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f9928i;

    /* renamed from: j, reason: collision with root package name */
    public String f9929j;

    /* renamed from: k, reason: collision with root package name */
    public String f9930k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public RenamePortfolioBottomSheetViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        this.f9926g = portfolioRepository;
        this.f9927h = new LiveData();
        this.f9928i = new LiveData();
        this.f9929j = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9930k = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel
    public final void e() {
    }
}
