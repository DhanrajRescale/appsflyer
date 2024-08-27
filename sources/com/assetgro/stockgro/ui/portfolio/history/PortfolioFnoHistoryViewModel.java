package com.assetgro.stockgro.ui.portfolio.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.d;
import ni.j;
import pj.a;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/history/PortfolioFnoHistoryViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioFnoHistoryViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9811n;

    /* renamed from: o, reason: collision with root package name */
    public String f9812o;

    /* renamed from: p, reason: collision with root package name */
    public Portfolio f9813p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9814q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9815r;

    /* renamed from: s, reason: collision with root package name */
    public String f9816s;

    /* renamed from: t, reason: collision with root package name */
    public final k1 f9817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioFnoHistoryViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9811n = portfolioRepository;
        portfolioRepository.getUserId();
        new LiveData();
        ?? liveData = new LiveData();
        this.f9814q = liveData;
        this.f9815r = liveData;
        this.f9816s = "all";
        this.f9817t = l1.a(Boolean.FALSE);
    }

    public final void h(String str, String str2, String str3, Integer num) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            try {
                g.H(u0.f(this), null, null, new d(this, str2, num, str, str3, null), 3);
            } catch (Exception unused) {
            }
        }
    }
}
