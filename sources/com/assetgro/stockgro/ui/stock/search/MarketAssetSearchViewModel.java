package com.assetgro.stockgro.ui.stock.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.concurrent.TimeUnit;
import jr.h;
import jt.d;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.s;
import nt.f;
import okhttp3.HttpUrl;
import pj.a;
import ui.b;
import ui.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/search/MarketAssetSearchViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAssetSearchViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10386n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10387o;

    /* renamed from: p, reason: collision with root package name */
    public e f10388p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10389q;

    /* renamed from: r, reason: collision with root package name */
    public String f10390r;

    /* renamed from: s, reason: collision with root package name */
    public final s f10391s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MarketAssetSearchViewModel(StockRepository stocksRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10386n = stocksRepository;
        this.f10387o = new LiveData();
        this.f10389q = h.i();
        this.f10390r = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10391s = new s(SortOption.Percentage, SortDirection.Descending, R.string.percentage_descending);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        String str = this.f10390r;
        s sVar = this.f10391s;
        m<BaseResponseDto<StocksListResponse>> stocksSearch = this.f10386n.getStocksSearch("1", str, sVar.f28762a, sVar.f28763b);
        ui.a aVar = new ui.a(2, b.f37212b);
        stocksSearch.getClass();
        nt.h c10 = new f(stocksSearch, aVar, 1).c(((kq.e) this.f9079b).J());
        d dVar = new d(new ui.a(3, new c(this, 0)), new ui.a(4, new c(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i() {
        j();
        mt.f g10 = new mt.c(at.e.a(5L, TimeUnit.SECONDS), new ui.a(0, b.f37213c)).g(((kq.e) this.f9079b).J());
        e eVar = new e(new ui.a(1, new c(this, 2)), gt.e.f17572d);
        g10.e(eVar);
        this.f10388p = eVar;
    }

    public final void j() {
        e eVar = this.f10388p;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }
}
