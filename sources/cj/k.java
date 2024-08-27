package cj;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartV2Dto;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import zi.q;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockChartViewModel f8179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StockChartViewModel stockChartViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f8179b = stockChartViewModel;
        this.f8180c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f8179b, this.f8180c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        StockChartV2Dto stockChartV2Dto;
        q stockChartV2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8178a;
        String str = this.f8180c;
        StockChartViewModel stockChartViewModel = this.f8179b;
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
            this.f8178a = 1;
            obj = stockRepository.getStockChartV2("pe", h10, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (stockChartV2Dto = (StockChartV2Dto) baseResponseDto.getData()) != null && (stockChartV2 = stockChartV2Dto.toStockChartV2()) != null) {
            stockChartViewModel.H.put(str, stockChartV2);
            stockChartViewModel.f10467v.postValue(new kj.j(stockChartV2));
        }
        return Unit.f23355a;
    }
}
