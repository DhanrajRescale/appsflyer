package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.CancelOrderRequestDto;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.RenamePortfolioDto;
import com.assetgro.stockgro.data.model.ResetPortfolioDto;
import com.assetgro.stockgro.data.model.UserDefaultPortfolioDto;
import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.UnlockPortfolioRequest;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioResponse;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioFnoHoldingResponseDto;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioFnoHistoryData;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioFnoOrderResponse;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioPendingOrderCancelRequest;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfoliosDto;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import jg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002J4\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002JT\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00060\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0004\b \u0010!J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u0002J2\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00060\u0005J\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00052\u0006\u0010,\u001a\u00020+J>\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00060\u00182\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b1\u00102J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00052\b\u00103\u001a\u0004\u0018\u00010\u0002J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00060\u0018H\u0086@¢\u0006\u0004\b7\u00108J,\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00060\u00182\u0006\u00109\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0086@¢\u0006\u0004\b=\u0010>J,\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00060\u00182\u0006\u0010?\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@H\u0086@¢\u0006\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/assetgro/stockgro/data/repository/PortfolioRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getUserId", "assetClass", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "getUserPortfolios", "portfolioId", "sortOption", "Lcom/assetgro/stockgro/data/model/portfolio/orders/PortfolioOrdersDto;", "getPortfolioOrders", "sortType", "tradeType", "timeType", "Lcom/assetgro/stockgro/data/model/portfolio/PortfolioHistoryDto;", "getPortfolioHistory", "filter", "sort", "executionDate", HttpUrl.FRAGMENT_ENCODE_SET, "isModel", "Lnv/v0;", "Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioFnoHistoryData;", "getFnoPortfolioHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioFnoHoldingResponseDto;", "getPortfolioFnoHolding", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioFnoOrderResponse;", "getFnoPortfolioOrders", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyt/a;)Ljava/lang/Object;", "portfolioName", "renamePortfolio", "resetPortfolio", "stockId", PaymentConstants.ORDER_ID_CAMEL, "transactionType", "cancelOrder", "Lcom/assetgro/stockgro/data/remote/response/UnlockPortfolioResponse;", "getPortfolioUnlockDetails", "Lcom/assetgro/stockgro/data/remote/request/UnlockPortfolioRequest;", "unlockPortfolioRequest", "unlockPortfolio", "leagueId", "ignoreSquaredValues", "Lcom/assetgro/stockgro/data/model/LeagueUnifiedResponseDto;", "getUnifiedLeaguePortfolioData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "userId", "Lcom/assetgro/stockgro/data/model/UserDefaultPortfolioDto;", "getUserDefaultPortfolio", "Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfoliosDto;", "getPortfoliosV2", "(Lyt/a;)Ljava/lang/Object;", "optionType", "Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioPendingOrderCancelRequest;", "portfolioPendingOrderCancelRequest", "Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoResponseDto;", "cancelOption", "(Ljava/lang/String;Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioPendingOrderCancelRequest;Lyt/a;)Ljava/lang/Object;", "operationType", "Ljg/a;", "body", "Ljg/b;", "modifyFnoPortfolio", "(Ljava/lang/String;Ljg/a;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public PortfolioRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public static /* synthetic */ Object getFnoPortfolioHistory$default(PortfolioRepository portfolioRepository, String str, String str2, String str3, String str4, String str5, Boolean bool, yt.a aVar, int i10, Object obj) {
        Boolean bool2;
        if ((i10 & 32) != 0) {
            bool2 = Boolean.TRUE;
        } else {
            bool2 = bool;
        }
        return portfolioRepository.getFnoPortfolioHistory(str, str2, str3, str4, str5, bool2, aVar);
    }

    public static /* synthetic */ Object getFnoPortfolioOrders$default(PortfolioRepository portfolioRepository, String str, String str2, Boolean bool, yt.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = Boolean.TRUE;
        }
        return portfolioRepository.getFnoPortfolioOrders(str, str2, bool, aVar);
    }

    public final Object cancelOption(@NotNull String str, @NotNull PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest, @NotNull yt.a<? super v0<BaseResponseDto<BuySellModifyFnoResponseDto>>> aVar) {
        return this.networkService.cancelOption(str, portfolioPendingOrderCancelRequest, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<String>> cancelOrder(@NotNull String stockId, @NotNull String orderId, @NotNull String transactionType, @NotNull String portfolioId) {
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return this.networkService.cancelOrder(stockId, new CancelOrderRequestDto(orderId, transactionType, portfolioId));
    }

    public final Object getFnoPortfolioHistory(String str, String str2, String str3, String str4, String str5, Boolean bool, @NotNull yt.a<? super v0<PortfolioFnoHistoryData>> aVar) {
        return this.networkService.getFnoPortfolioHistory(str, str2, str3, str4, str5, bool, aVar);
    }

    public final Object getFnoPortfolioOrders(String str, String str2, Boolean bool, @NotNull yt.a<? super v0<PortfolioFnoOrderResponse>> aVar) {
        return this.networkService.getFnoPortfolioOrders(str, str2, bool, aVar);
    }

    public final Object getPortfolioFnoHolding(String str, @NotNull yt.a<? super v0<BaseResponseDto<PortfolioFnoHoldingResponseDto>>> aVar) {
        return this.networkService.getPortfolioFnoHolding(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<PortfolioHistoryDto>> getPortfolioHistory(String portfolioId, @NotNull String sortType, @NotNull String tradeType, @NotNull String timeType) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        return this.networkService.getPortfolioHistory(portfolioId, sortType, tradeType, timeType);
    }

    @NotNull
    public final m<BaseResponseDto<PortfolioOrdersDto>> getPortfolioOrders(String portfolioId, @NotNull String sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        return this.networkService.getPortfolioOrders(portfolioId, sortOption);
    }

    @NotNull
    public final m<BaseResponseDto<UnlockPortfolioResponse>> getPortfolioUnlockDetails() {
        return this.networkService.getPortfolioUnlockDetails();
    }

    public final Object getPortfoliosV2(@NotNull yt.a<? super v0<BaseResponseDto<PortfoliosDto>>> aVar) {
        return this.networkService.getPortfoliosV2(aVar);
    }

    public final Object getUnifiedLeaguePortfolioData(@NotNull String str, @NotNull String str2, String str3, boolean z10, @NotNull yt.a<? super v0<BaseResponseDto<LeagueUnifiedResponseDto>>> aVar) {
        if (Intrinsics.a(str, "OPTIONS")) {
            return NetworkService.DefaultImpls.getPrepZoneOptionPortfolioData$default(this.networkService, str2, str3, Boolean.FALSE, Boolean.valueOf(z10), null, null, aVar, 48, null);
        }
        return this.networkService.getPrepZoneEquityPortfolioData(str2, str3, Boolean.FALSE, Boolean.valueOf(z10), aVar);
    }

    @NotNull
    public final m<UserDefaultPortfolioDto> getUserDefaultPortfolio(String userId) {
        return this.networkService.getUserDefaultPortfolio(userId);
    }

    public final String getUserId() {
        return this.userPreferences.getUuid();
    }

    @NotNull
    public final m<BaseResponseDto<List<Portfolio>>> getUserPortfolios(@NotNull String assetClass) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        return this.networkService.getUserPortfolios(assetClass);
    }

    public final Object modifyFnoPortfolio(@NotNull String str, @NotNull jg.a aVar, @NotNull yt.a<? super v0<BaseResponseDto<b>>> aVar2) {
        return this.networkService.modifyFnoPortfolio(str, aVar, aVar2);
    }

    @NotNull
    public final m<BaseResponseDto<String>> renamePortfolio(@NotNull String portfolioName, @NotNull String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return this.networkService.renamePortfolio(new RenamePortfolioDto(portfolioId, portfolioName));
    }

    @NotNull
    public final m<BaseResponseDto<String>> resetPortfolio(@NotNull String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return this.networkService.resetPortfolio(new ResetPortfolioDto(portfolioId));
    }

    @NotNull
    public final m<BaseResponseDto<Object>> unlockPortfolio(@NotNull UnlockPortfolioRequest unlockPortfolioRequest) {
        Intrinsics.checkNotNullParameter(unlockPortfolioRequest, "unlockPortfolioRequest");
        return this.networkService.unlockPortfolio(unlockPortfolioRequest);
    }
}
