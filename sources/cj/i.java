package cj;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartBaseDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartV2Dto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockOhlc;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import zi.q;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockChartViewModel f8174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StockChartViewModel stockChartViewModel, yt.a aVar) {
        super(2, aVar);
        this.f8174b = stockChartViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f8174b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        StockChartBaseDto stockChartBaseDto;
        StockChartV2Dto pbData;
        q stockChartV2;
        StockChartV2Dto peData;
        q stockChartV22;
        StockOhlc olhc;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8173a;
        StockChartViewModel stockChartViewModel = this.f8174b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            StockRepository stockRepository = stockChartViewModel.f10459n;
            String h10 = stockChartViewModel.h();
            this.f8173a = 1;
            obj = stockRepository.getStocksAllChartsData(h10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null) {
            StockChartBaseDto stockChartBaseDto2 = (StockChartBaseDto) baseResponseDto.getData();
            if (stockChartBaseDto2 != null && (olhc = stockChartBaseDto2.getOlhc()) != null) {
                stockChartViewModel.f10471z.postValue(olhc);
            }
            StockChartBaseDto stockChartBaseDto3 = (StockChartBaseDto) baseResponseDto.getData();
            if (stockChartBaseDto3 != null && (peData = stockChartBaseDto3.getPeData()) != null && (stockChartV22 = peData.toStockChartV2()) != null) {
                List list = stockChartV22.f42517a;
                if (list != null) {
                    stockChartViewModel.f10463r.postValue(new kj.j(list));
                }
                if (stockChartV22.f42518b != null) {
                    stockChartViewModel.H.put(stockChartV22.f42519c, stockChartV22);
                }
                stockChartViewModel.f10467v.postValue(new kj.j(stockChartV22));
            }
            byte[] bArr = kj.a.f23206a;
            if (!kj.a.f23207b && (stockChartBaseDto = (StockChartBaseDto) baseResponseDto.getData()) != null && (pbData = stockChartBaseDto.getPbData()) != null && (stockChartV2 = pbData.toStockChartV2()) != null) {
                List list2 = stockChartV2.f42517a;
                if (list2 != null) {
                    stockChartViewModel.f10465t.postValue(new kj.j(list2));
                }
                stockChartViewModel.f10469x.postValue(new kj.j(stockChartV2));
            }
        }
        return Unit.f23355a;
    }
}
