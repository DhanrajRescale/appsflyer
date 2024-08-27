package pa;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.AssetInsightsDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketInsightsDetailViewModel f30810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MarketInsightsDetailViewModel marketInsightsDetailViewModel, int i10) {
        super(1);
        this.f30809a = i10;
        this.f30810b = marketInsightsDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AssetInsightsDto assetInsightsDto;
        int i10 = this.f30809a;
        MarketInsightsDetailViewModel marketInsightsDetailViewModel = this.f30810b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                if (baseResponseDto != null && (assetInsightsDto = (AssetInsightsDto) baseResponseDto.getData()) != null) {
                    marketInsightsDetailViewModel.f9084g.postValue(Boolean.FALSE);
                    int i11 = d.f30808a[marketInsightsDetailViewModel.f8664q.ordinal()];
                    e0 e0Var = marketInsightsDetailViewModel.f8663p;
                    switch (i11) {
                        case 1:
                            e0Var.postValue(assetInsightsDto.getTrending());
                            break;
                        case 2:
                            e0Var.postValue(assetInsightsDto.getVolumeShockers());
                            break;
                        case 3:
                            e0Var.postValue(assetInsightsDto.getGainers());
                            break;
                        case 4:
                            e0Var.postValue(assetInsightsDto.getLosers());
                            break;
                        case 5:
                            e0Var.postValue(assetInsightsDto.getWeeklyTopPortfolios());
                            break;
                        case 6:
                            e0Var.postValue(assetInsightsDto.getDailyTopPortfolios());
                            break;
                    }
                }
                return Unit.f23355a;
            case 1:
                marketInsightsDetailViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            default:
                marketInsightsDetailViewModel.h();
                return Unit.f23355a;
        }
    }
}
