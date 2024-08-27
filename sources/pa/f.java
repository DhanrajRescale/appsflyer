package pa;

import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketInsightsDetailViewModel f30812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MarketInsightsDetailViewModel marketInsightsDetailViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f30812b = marketInsightsDetailViewModel;
        this.f30813c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f30812b, this.f30813c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30811a;
        MarketInsightsDetailViewModel marketInsightsDetailViewModel = this.f30812b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                StockRepository stockRepository = marketInsightsDetailViewModel.f8661n;
                String str = this.f30813c;
                this.f30811a = 1;
                obj = stockRepository.getStockInsightsV2(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                marketInsightsDetailViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    marketInsightsDetailViewModel.f8663p.postValue(baseResponseDto.getData());
                }
            }
        } catch (Exception unused) {
            marketInsightsDetailViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
