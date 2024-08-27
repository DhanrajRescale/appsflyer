package ra;

import com.assetgro.stockgro.data.model.AssetInsightData;
import com.assetgro.stockgro.data.model.AssetInsightsDto;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vt.g0;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketAssetInsightsViewModel f33545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(MarketAssetInsightsViewModel marketAssetInsightsViewModel, int i10) {
        super(1);
        this.f33544a = i10;
        this.f33545b = marketAssetInsightsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AssetInsightsDto assetInsightsDto;
        int i10 = this.f33544a;
        MarketAssetInsightsViewModel marketAssetInsightsViewModel = this.f33545b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                if (baseResponseDto != null && (assetInsightsDto = (AssetInsightsDto) baseResponseDto.getData()) != null) {
                    ArrayList arrayList = new ArrayList();
                    List<StockDto> trending = assetInsightsDto.getTrending();
                    if (trending != null && !trending.isEmpty()) {
                        arrayList.add(new AssetInsightData("EQUITY", g0.N(assetInsightsDto.getTrending(), 20), InsightListType.TRENDING));
                    }
                    List<StockDto> volumeShockers = assetInsightsDto.getVolumeShockers();
                    if (volumeShockers != null && !volumeShockers.isEmpty()) {
                        arrayList.add(new AssetInsightData("EQUITY", g0.N(assetInsightsDto.getVolumeShockers(), 20), InsightListType.VOLUMESHOCKERS));
                    }
                    List<StockDto> gainers = assetInsightsDto.getGainers();
                    if (gainers != null && !gainers.isEmpty()) {
                        arrayList.add(new AssetInsightData("EQUITY", g0.N(assetInsightsDto.getGainers(), 20), InsightListType.GAINERS));
                    }
                    List<StockDto> losers = assetInsightsDto.getLosers();
                    if (losers != null && !losers.isEmpty()) {
                        arrayList.add(new AssetInsightData("EQUITY", g0.N(assetInsightsDto.getLosers(), 20), InsightListType.LOSERS));
                    }
                    marketAssetInsightsViewModel.i(new d(arrayList));
                }
                return Unit.f23355a;
            case 1:
                marketAssetInsightsViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            default:
                marketAssetInsightsViewModel.getClass();
                marketAssetInsightsViewModel.h();
                return Unit.f23355a;
        }
    }
}
