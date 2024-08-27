package com.assetgro.stockgro.ui.portfolio.orders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fg.g;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;
import tg.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/PortfolioOrdersViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioOrdersViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9915n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9916o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9917p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9918q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9919r;

    /* renamed from: s, reason: collision with root package name */
    public String f9920s;

    /* renamed from: t, reason: collision with root package name */
    public Portfolio f9921t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9922u;

    /* renamed from: v, reason: collision with root package name */
    public BottomSheetItem f9923v;

    /* renamed from: w, reason: collision with root package name */
    public final String[] f9924w;

    /* renamed from: x, reason: collision with root package name */
    public int f9925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioOrdersViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9915n = portfolioRepository;
        portfolioRepository.getUserId();
        this.f9916o = new LiveData();
        this.f9917p = new LiveData();
        this.f9918q = new LiveData();
        this.f9919r = new LiveData();
        this.f9923v = new BottomSheetItem("All Orders", HttpUrl.FRAGMENT_ENCODE_SET);
        this.f9924w = new String[]{"All Orders", "Buy Orders", "Sell Orders"};
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String str) {
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9915n.getPortfolioOrders(str, this.f9923v.getOptionName()).c(((e) this.f9079b).J());
        d dVar = new d(new g(20, new j(this, 2)), new g(21, new j(this, 3)));
        c10.a(dVar);
        this.f9080c.e(dVar);
    }
}
