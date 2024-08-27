package com.assetgro.stockgro.ui.portfolio.unlock.list;

import ah.e;
import ah.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/unlock/list/UnlockPortfolioListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UnlockPortfolioListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9970n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f9971o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f9972p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f9973q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UnlockPortfolioListViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ?? liveData = new LiveData();
        this.f9970n = liveData;
        this.f9971o = i0.C(liveData, e.f432g);
        this.f9972p = i0.C(liveData, e.f433h);
        this.f9973q = i0.C(liveData, e.f431f);
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = portfolioRepository.getPortfolioUnlockDetails().c(((kq.e) this.f9079b).J());
        d dVar = new d(new vg.d(9, new g(this, 0)), new vg.d(10, new g(this, 1)));
        c10.a(dVar);
        this.f9080c.e(dVar);
    }
}
