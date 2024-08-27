package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.model.MarketSearchResponseDto;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.MarketOptionDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionChainDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionHistoryDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewSecondaryCallRequestData;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b4\u00105JH\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\t0\b2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b#\u0010$J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b&\u0010'J4\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\t0\b2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b*\u0010+J,\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b,\u0010\u0017J2\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/assetgro/stockgro/data/repository/FnoRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "optionType", HttpUrl.FRAGMENT_ENCODE_SET, "page", "limit", "searchParam", "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/feature_market/data/remote/MarketOptionDto;", "getOptionListData", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "optionIdentifier", "type", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionChainDto;", "getOptionChain", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "actionType", "Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;", "body", "Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoResponseDto;", "buySellOptionFno", "(Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;Lyt/a;)Ljava/lang/Object;", "contractSymbol", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewSecondaryCallRequestData;", "optionOverviewSecondaryCallRequestData", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewDto;", "getOptionOverview", "(Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewSecondaryCallRequestData;Lyt/a;)Ljava/lang/Object;", "parentSymbol", HttpUrl.FRAGMENT_ENCODE_SET, "isModel", "portfolioId", "Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioReviewResponse;", "getOrderReview", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionHistoryDto;", "getOptionOhlcHistory", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", PaymentConstants.ORDER_ID_CAMEL, "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOrderInfoResponseDto;", "fetchOrderInfo", "(Ljava/lang/String;Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "modifyOptionFno", "assetClass", "Lcom/assetgro/stockgro/data/model/MarketSearchResponseDto;", "getMarketSearchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FnoRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @Inject
    public FnoRepository(@NotNull NetworkService networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.networkService = networkService;
    }

    public static /* synthetic */ Object getOptionListData$default(FnoRepository fnoRepository, String str, Integer num, Integer num2, String str2, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = 1;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            num2 = 50;
        }
        Integer num4 = num2;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return fnoRepository.getOptionListData(str, num3, num4, str2, aVar);
    }

    public static /* synthetic */ Object getOptionOverview$default(FnoRepository fnoRepository, String str, OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData, yt.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            optionOverviewSecondaryCallRequestData = null;
        }
        return fnoRepository.getOptionOverview(str, optionOverviewSecondaryCallRequestData, aVar);
    }

    public final Object buySellOptionFno(@NotNull String str, @NotNull BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, @NotNull yt.a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar) {
        return this.networkService.buySellOptionFno(str, buySellModifyFnoRequestDto, aVar);
    }

    public final Object fetchOrderInfo(@NotNull String str, @NotNull String str2, boolean z10, @NotNull yt.a<? super v0<BaseResponseDto<FnoOrderInfoResponseDto>>> aVar) {
        return this.networkService.getOrderInfo(str, str2, z10, aVar);
    }

    public final Object getMarketSearchData(@NotNull String str, String str2, Integer num, @NotNull yt.a<? super v0<MarketSearchResponseDto>> aVar) {
        return this.networkService.getMarketSearchData(str, str2, num, aVar);
    }

    public final Object getOptionChain(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseDto<OptionChainDto>>> aVar) {
        return this.networkService.getOptionChain(str, str2, aVar);
    }

    public final Object getOptionListData(@NotNull String str, Integer num, Integer num2, String str2, @NotNull yt.a<? super v0<BaseResponseDto<MarketOptionDto>>> aVar) {
        return this.networkService.getOptionListData(str, num, num2, str2, aVar);
    }

    public final Object getOptionOhlcHistory(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<OptionHistoryDto>>> aVar) {
        return this.networkService.getOptionOhlc(str, aVar);
    }

    public final Object getOptionOverview(String str, OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData, @NotNull yt.a<? super v0<BaseResponseDto<OptionOverviewDto>>> aVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        NetworkService networkService = this.networkService;
        if (optionOverviewSecondaryCallRequestData != null) {
            str2 = optionOverviewSecondaryCallRequestData.getSymbol();
        } else {
            str2 = null;
        }
        if (optionOverviewSecondaryCallRequestData != null) {
            str3 = optionOverviewSecondaryCallRequestData.getExpiry();
        } else {
            str3 = null;
        }
        if (optionOverviewSecondaryCallRequestData != null) {
            str4 = optionOverviewSecondaryCallRequestData.getOptionType();
        } else {
            str4 = null;
        }
        if (optionOverviewSecondaryCallRequestData != null) {
            str5 = optionOverviewSecondaryCallRequestData.getStrikePrice();
        } else {
            str5 = null;
        }
        return networkService.getOptionOverview(str, str2, str3, str4, str5, aVar);
    }

    public final Object getOrderReview(@NotNull String str, Boolean bool, String str2, @NotNull yt.a<? super v0<BaseResponseDto<PortfolioReviewResponse>>> aVar) {
        return this.networkService.getOrderReview(str, bool, str2, aVar);
    }

    public final Object modifyOptionFno(@NotNull String str, @NotNull BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, @NotNull yt.a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar) {
        return this.networkService.modifyOptionFno(str, buySellModifyFnoRequestDto, aVar);
    }
}
