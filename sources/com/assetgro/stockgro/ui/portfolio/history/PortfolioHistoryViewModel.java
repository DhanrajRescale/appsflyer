package com.assetgro.stockgro.ui.portfolio.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fg.g;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import lg.c;
import lg.f;
import nt.b;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/history/PortfolioHistoryViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioHistoryViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9818n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9819o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9820p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f9821q;

    /* renamed from: r, reason: collision with root package name */
    public int f9822r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9823s;

    /* renamed from: t, reason: collision with root package name */
    public String f9824t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioHistoryViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9818n = portfolioRepository;
        portfolioRepository.getUserId();
        this.f9819o = new LiveData();
        this.f9820p = new LiveData();
        this.f9821q = new String[]{"All Transactions", "Bought", "Sold", "Cancelled"};
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String str) {
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9818n.getPortfolioHistory(str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET).c(((e) this.f9079b).J());
        d dVar = new d(new g(10, new f(this, 0)), new g(11, new f(this, 1)));
        c10.a(dVar);
        this.f9080c.e(dVar);
    }

    public final void i(String str, String sortType, String tradeType, int i10) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        m<BaseResponseDto<PortfolioHistoryDto>> portfolioHistory = this.f9818n.getPortfolioHistory(str, sortType, tradeType, String.valueOf(i10));
        g gVar = new g(12, c.f24822j);
        portfolioHistory.getClass();
        h c10 = new b(new b(new b(new nt.f(portfolioHistory, gVar, 1), new g(13, new f(this, 2)), 1), new g(14, new f(this, 3)), 2), new g(15, new f(this, 4)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new g(16, new f(this, 5)), new g(17, new f(this, 6)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }
}
