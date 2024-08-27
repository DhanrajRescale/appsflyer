package com.assetgro.stockgro.ui.profile.portfolio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/portfolio/UserPortfolioDetailsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserPortfolioDetailsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f10004n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10005o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10006p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10007q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UserPortfolioDetailsViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10004n = portfolioRepository;
        this.f10005o = new LiveData();
        this.f10006p = new ArrayList();
        this.f10007q = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
