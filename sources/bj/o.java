package bj;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisDto;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import qu.m0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7029a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StockAnalysisViewModel f7031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(StockAnalysisViewModel stockAnalysisViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f7031c = stockAnalysisViewModel;
        this.f7032d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        o oVar = new o(this.f7031c, this.f7032d, aVar);
        oVar.f7030b = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        v0 v0Var;
        v0 v0Var2;
        ArrayList arrayList;
        BaseResponseDto baseResponseDto;
        StockAnalysisDto stockAnalysisDto;
        BaseResponseDto baseResponseDto2;
        StockAnalysisDto stockAnalysisDto2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f7029a;
        String str = this.f7032d;
        StockAnalysisViewModel stockAnalysisViewModel = this.f7031c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    v0Var = (v0) this.f7030b;
                    ut.n.b(obj);
                    v0Var2 = (v0) obj;
                    arrayList = new ArrayList();
                    if (v0Var.f29302a.isSuccessful() && (baseResponseDto2 = (BaseResponseDto) v0Var.f29303b) != null && (stockAnalysisDto2 = (StockAnalysisDto) baseResponseDto2.getData()) != null) {
                        zi.l marketAnalysis = stockAnalysisDto2.toMarketAnalysis();
                        marketAnalysis.f42497d = stockAnalysisViewModel.f10458q[0];
                        arrayList.add(marketAnalysis);
                    }
                    if (v0Var2.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var2.f29303b) != null && (stockAnalysisDto = (StockAnalysisDto) baseResponseDto.getData()) != null) {
                        zi.l marketAnalysis2 = stockAnalysisDto.toMarketAnalysis();
                        marketAnalysis2.f42497d = stockAnalysisViewModel.f10458q[1];
                        arrayList.add(marketAnalysis2);
                    }
                    stockAnalysisViewModel.f9084g.postValue(Boolean.FALSE);
                    stockAnalysisViewModel.f10456o.postValue(arrayList);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (f0) this.f7030b;
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            f0Var = (f0) this.f7030b;
            m0 d10 = yk.g.d(f0Var, null, new n(stockAnalysisViewModel, str, null), 3);
            this.f7030b = f0Var;
            this.f7029a = 1;
            obj = d10.u(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var3 = (v0) obj;
        m0 d11 = yk.g.d(f0Var, null, new m(stockAnalysisViewModel, str, null), 3);
        this.f7030b = v0Var3;
        this.f7029a = 2;
        Object u10 = d11.u(this);
        if (u10 == aVar) {
            return aVar;
        }
        v0Var = v0Var3;
        obj = u10;
        v0Var2 = (v0) obj;
        arrayList = new ArrayList();
        if (v0Var.f29302a.isSuccessful()) {
            zi.l marketAnalysis3 = stockAnalysisDto2.toMarketAnalysis();
            marketAnalysis3.f42497d = stockAnalysisViewModel.f10458q[0];
            arrayList.add(marketAnalysis3);
        }
        if (v0Var2.f29302a.isSuccessful()) {
            zi.l marketAnalysis22 = stockAnalysisDto.toMarketAnalysis();
            marketAnalysis22.f42497d = stockAnalysisViewModel.f10458q[1];
            arrayList.add(marketAnalysis22);
        }
        stockAnalysisViewModel.f9084g.postValue(Boolean.FALSE);
        stockAnalysisViewModel.f10456o.postValue(arrayList);
        return Unit.f23355a;
    }
}
