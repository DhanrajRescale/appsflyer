package dj;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.ui.stock.v2.data.remote.MarketOverviewDto;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOverviewV2ViewModel f14400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StockOverviewV2ViewModel stockOverviewV2ViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f14400b = stockOverviewV2ViewModel;
        this.f14401c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f14400b, this.f14401c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MarketOverviewDto marketOverviewDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14399a;
        StockOverviewV2ViewModel stockOverviewV2ViewModel = this.f14400b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                StockRepository stockRepository = stockOverviewV2ViewModel.f10490n;
                String str = this.f14401c;
                this.f14399a = 1;
                obj = stockRepository.getStockOverviewData(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = stockOverviewV2ViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            if (v0Var.f29302a.isSuccessful()) {
                stockOverviewV2ViewModel.f9084g.postValue(bool);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (marketOverviewDto = (MarketOverviewDto) baseResponseDto.getData()) != null) {
                    stockOverviewV2ViewModel.f10491o.postValue(marketOverviewDto.toMarketOverview());
                }
            } else {
                stockOverviewV2ViewModel.f10493q.postValue("Try again later");
            }
        } catch (Exception unused) {
            stockOverviewV2ViewModel.f10493q.postValue("Check internet connection");
        }
        return Unit.f23355a;
    }
}
