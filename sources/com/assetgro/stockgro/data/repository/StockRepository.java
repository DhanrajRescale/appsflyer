package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.AssetInsightsDto;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockGyanDto;
import com.assetgro.stockgro.data.model.StockGyanInteractionDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.StockSellOrderRequestDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.ModifyOrderRequestDto;
import com.assetgro.stockgro.data.remote.request.StockBuyOrderRequestDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.ui.stock.v2.data.remote.MarketOverviewDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisBvpsConfigDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisCalculationType;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisEmaConfigDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartBaseDto;
import com.assetgro.stockgro.ui.stock.v2.data.remote.StockChartV2Dto;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bT\u0010UJ6\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J6\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t2\u0006\u0010\u000f\u001a\u00020\u0002J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\n0\t2\u0006\u0010\u0019\u001a\u00020\u0018JD\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\n0\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0002JD\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\n0\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0002J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\n0\t2\u0006\u0010\u0019\u001a\u00020\u0018J2\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\n0\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002J\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010)\u001a\u00020(J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\n0\tJ+\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\n0\t2\u0006\u0010-\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\n0\tJ.\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\n052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\n052\u0006\u0010\u000f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b;\u00109J$\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\n052\u0006\u0010<\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b=\u00109J<\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0\n05\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\bC\u0010DJ<\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0A0\n05\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\bF\u0010DJ6\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\n052\u0006\u0010G\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\bJ\u0010KJ$\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\n052\u0006\u0010\u000f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\bM\u00109R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/assetgro/stockgro/data/repository/StockRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "page", "index", "Lcom/assetgro/stockgro/data/repository/SortOption;", "sortOption", "Lcom/assetgro/stockgro/data/repository/SortDirection;", "sortDirection", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/data/remote/response/StocksListResponse;", "getStocks", "searchParam", "getStocksSearch", "stockName", "Lcom/assetgro/stockgro/data/model/StockDetailDto;", "getStockDetails", "Lcom/assetgro/stockgro/data/remote/response/StockOrderInfoResponseDto;", "getStockOrderInfo", "portfolioId", "stockId", "Lcom/assetgro/stockgro/data/remote/response/StockSellSelectOrderResponseDto;", "getStockOrderInfoForPortfolio", "Lcom/assetgro/stockgro/data/model/StockOrderDto;", "stockOrderDto", "Lcom/assetgro/stockgro/data/remote/response/StockOrderResponse;", "buyOrder", HttpUrl.FRAGMENT_ENCODE_SET, "quantity", "orderType", HttpUrl.FRAGMENT_ENCODE_SET, "executionPrice", "transactionType", "sellOrder", "squareOffStock", "shortSellOrder", PaymentConstants.ORDER_ID_CAMEL, "Lcom/assetgro/stockgro/data/model/StockModifyInfoDto;", "getOrderDetails", "Lcom/assetgro/stockgro/data/model/ModifyOrderDto;", "modifyOrderDto", "modifyOrders", "Lcom/assetgro/stockgro/data/model/StockGyanDto;", "getStockGyanGroups", "cardId", HttpUrl.FRAGMENT_ENCODE_SET, "isLiked", "putStockGyanIndexInteraction", "(Ljava/lang/String;Ljava/lang/Boolean;)Lat/m;", "Lcom/assetgro/stockgro/data/model/AssetInsightsDto;", "getStockInsights", "sectionParams", "Lnv/v0;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "getStockInsightsV2", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketOverviewDto;", "getStockOverviewData", "categoryId", "getStockGyanCardData", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "T", "calculationType", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisEmaConfigDto;", "getStockAnalysisData", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisBvpsConfigDto;", "getStockAnalysisDataBvps", "type", "duration", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;", "getStockChartV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartBaseDto;", "getStocksAllChartsData", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public StockRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public static /* synthetic */ Object getStockInsightsV2$default(StockRepository stockRepository, String str, yt.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return stockRepository.getStockInsightsV2(str, aVar);
    }

    public static /* synthetic */ m getStocks$default(StockRepository stockRepository, String str, String str2, SortOption sortOption, SortDirection sortDirection, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            sortOption = SortOption.Percentage;
        }
        if ((i10 & 8) != 0) {
            sortDirection = SortDirection.Descending;
        }
        return stockRepository.getStocks(str, str2, sortOption, sortDirection);
    }

    public static /* synthetic */ m getStocksSearch$default(StockRepository stockRepository, String str, String str2, SortOption sortOption, SortDirection sortDirection, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            sortOption = SortOption.Percentage;
        }
        if ((i10 & 8) != 0) {
            sortDirection = SortDirection.Descending;
        }
        return stockRepository.getStocksSearch(str, str2, sortOption, sortDirection);
    }

    @NotNull
    public final m<BaseResponseDto<StockOrderResponse>> buyOrder(@NotNull StockOrderDto stockOrderDto) {
        Float f10;
        Float f11;
        String str;
        Float f12;
        Intrinsics.checkNotNullParameter(stockOrderDto, "stockOrderDto");
        NetworkService networkService = this.networkService;
        String stockCode = stockOrderDto.getStockCode();
        Intrinsics.c(stockCode);
        String quantity = stockOrderDto.getQuantity();
        Float f13 = null;
        if (quantity != null) {
            f10 = Float.valueOf(Float.parseFloat(quantity));
        } else {
            f10 = null;
        }
        String uuid = this.userPreferences.getUuid();
        String stopLoss = stockOrderDto.getStopLoss();
        if (stopLoss != null) {
            f11 = Float.valueOf(Float.parseFloat(stopLoss));
        } else {
            f11 = null;
        }
        String product = stockOrderDto.getProduct();
        Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto != null) {
            str = portfolioDropDownInfoDto.getPortfolioId();
        } else {
            str = null;
        }
        String orderType = stockOrderDto.getOrderType();
        String bookProfit = stockOrderDto.getBookProfit();
        if (bookProfit != null) {
            f12 = Float.valueOf(Float.parseFloat(bookProfit));
        } else {
            f12 = null;
        }
        Double executionPrice = stockOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            f13 = Float.valueOf((float) executionPrice.doubleValue());
        }
        return networkService.buyStockOrder(stockCode, new StockBuyOrderRequestDto(uuid, f10, f13, f11, f12, product, orderType, str, stockOrderDto.getParentOrderType(), stockOrderDto.getTransactionType(), stockOrderDto.getTotalAmount()));
    }

    @NotNull
    public final m<BaseResponseDto<StockModifyInfoDto>> getOrderDetails(@NotNull String portfolioId, @NotNull String stockId, @NotNull String transactionType, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.networkService.getOrderDetails(portfolioId, stockId, transactionType, orderId);
    }

    public final <T extends StockAnalysisCalculationType> Object getStockAnalysisData(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseDto<StockAnalysisDto<StockAnalysisEmaConfigDto>>>> aVar) {
        return this.networkService.getStockAnalysisData(str, str2, aVar);
    }

    public final <T extends StockAnalysisCalculationType> Object getStockAnalysisDataBvps(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseDto<StockAnalysisDto<StockAnalysisBvpsConfigDto>>>> aVar) {
        return this.networkService.getStockAnalysisDataBvps(str, str2, aVar);
    }

    public final Object getStockChartV2(@NotNull String str, @NotNull String str2, String str3, @NotNull yt.a<? super v0<BaseResponseDto<StockChartV2Dto>>> aVar) {
        return this.networkService.getStockChartV2(str, str2, str3, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<StockDetailDto>> getStockDetails(@NotNull String stockName) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        return this.networkService.getStockDetails(stockName);
    }

    public final Object getStockGyanCardData(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<StockGyanDto>>> aVar) {
        return this.networkService.getStockGyanCardData(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<StockGyanDto>> getStockGyanGroups() {
        return this.networkService.getStockGyanGroups();
    }

    @NotNull
    public final m<BaseResponseDto<AssetInsightsDto>> getStockInsights() {
        return this.networkService.getStockInsights();
    }

    public final Object getStockInsightsV2(String str, @NotNull yt.a<? super v0<BaseResponseDto<List<StockDto>>>> aVar) {
        return this.networkService.getStockInsightsV2(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<StockOrderInfoResponseDto>> getStockOrderInfo(@NotNull String stockName) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        return this.networkService.getStockOrderInfo(stockName);
    }

    @NotNull
    public final m<BaseResponseDto<StockSellSelectOrderResponseDto>> getStockOrderInfoForPortfolio(@NotNull String portfolioId, @NotNull String stockId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        return this.networkService.getStockOrderInfoForPortfolio(portfolioId, stockId);
    }

    public final Object getStockOverviewData(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<MarketOverviewDto>>> aVar) {
        return this.networkService.getStockOverviewData(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<StocksListResponse>> getStocks(@NotNull String page, @NotNull String index, @NotNull SortOption sortOption, @NotNull SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        return this.networkService.getStocks(a3.a.g(sortOption.getParamName(), ":", sortDirection.getParamName()), page, index);
    }

    public final Object getStocksAllChartsData(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<StockChartBaseDto>>> aVar) {
        return this.networkService.getStocksAllChartsData(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<StocksListResponse>> getStocksSearch(@NotNull String page, @NotNull String searchParam, @NotNull SortOption sortOption, @NotNull SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(searchParam, "searchParam");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        return this.networkService.getStocksSearch(a3.a.g(sortOption.getParamName(), ":", sortDirection.getParamName()), page, searchParam);
    }

    @NotNull
    public final m<BaseResponseDto<String>> modifyOrders(@NotNull ModifyOrderDto modifyOrderDto) {
        Integer num;
        String str;
        Float f10;
        Float f11;
        Intrinsics.checkNotNullParameter(modifyOrderDto, "modifyOrderDto");
        NetworkService networkService = this.networkService;
        String stockCode = modifyOrderDto.getStockCode();
        Intrinsics.c(stockCode);
        String quantity = modifyOrderDto.getQuantity();
        Float f12 = null;
        if (quantity != null) {
            num = Integer.valueOf(Integer.parseInt(quantity));
        } else {
            num = null;
        }
        Portfolio selectedPortfolio = modifyOrderDto.getSelectedPortfolio();
        if (selectedPortfolio != null) {
            str = selectedPortfolio.getPortfolioId();
        } else {
            str = null;
        }
        String orderType = modifyOrderDto.getOrderType();
        String bookProfit = modifyOrderDto.getBookProfit();
        if (bookProfit != null) {
            f10 = Float.valueOf(Float.parseFloat(bookProfit));
        } else {
            f10 = null;
        }
        Double executionPrice = modifyOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            f11 = Float.valueOf((float) executionPrice.doubleValue());
        } else {
            f11 = null;
        }
        String orderId = modifyOrderDto.getOrderId();
        String purchaseType = modifyOrderDto.getPurchaseType();
        String stopLoss = modifyOrderDto.getStopLoss();
        if (stopLoss != null) {
            f12 = Float.valueOf(Float.parseFloat(stopLoss));
        }
        return networkService.modifyOrder(stockCode, new ModifyOrderRequestDto(str, orderId, purchaseType, num, orderType, f12, f10, f11, modifyOrderDto.getParentOrderType()));
    }

    @NotNull
    public final m<BaseResponseDto<StockGyanDto>> putStockGyanIndexInteraction(@NotNull String cardId, Boolean isLiked) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.networkService.putStockGyanIndexInteraction(new StockGyanInteractionDto(cardId, this.userPreferences.getUuid(), "app", isLiked));
    }

    @NotNull
    public final m<BaseResponseDto<StockOrderResponse>> sellOrder(@NotNull String stockId, int quantity, @NotNull String portfolioId, @NotNull String orderType, double executionPrice, String transactionType) {
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return this.networkService.sellStockOrder(stockId, new StockSellOrderRequestDto(quantity, portfolioId, orderType, executionPrice, transactionType));
    }

    @NotNull
    public final m<BaseResponseDto<StockOrderResponse>> shortSellOrder(@NotNull StockOrderDto stockOrderDto) {
        Float f10;
        Float f11;
        String str;
        Float f12;
        Intrinsics.checkNotNullParameter(stockOrderDto, "stockOrderDto");
        NetworkService networkService = this.networkService;
        String stockCode = stockOrderDto.getStockCode();
        Intrinsics.c(stockCode);
        String quantity = stockOrderDto.getQuantity();
        Float f13 = null;
        if (quantity != null) {
            f10 = Float.valueOf(Float.parseFloat(quantity));
        } else {
            f10 = null;
        }
        String uuid = this.userPreferences.getUuid();
        String stopLoss = stockOrderDto.getStopLoss();
        if (stopLoss != null) {
            f11 = Float.valueOf(Float.parseFloat(stopLoss));
        } else {
            f11 = null;
        }
        String product = stockOrderDto.getProduct();
        Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto != null) {
            str = portfolioDropDownInfoDto.getPortfolioId();
        } else {
            str = null;
        }
        String orderType = stockOrderDto.getOrderType();
        String bookProfit = stockOrderDto.getBookProfit();
        if (bookProfit != null) {
            f12 = Float.valueOf(Float.parseFloat(bookProfit));
        } else {
            f12 = null;
        }
        Double executionPrice = stockOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            f13 = Float.valueOf((float) executionPrice.doubleValue());
        }
        return networkService.shortSellStockOrder(stockCode, new StockBuyOrderRequestDto(uuid, f10, f13, f11, f12, product, orderType, str, stockOrderDto.getParentOrderType(), stockOrderDto.getTransactionType(), stockOrderDto.getTotalAmount()));
    }

    @NotNull
    public final m<BaseResponseDto<StockOrderResponse>> squareOffStock(@NotNull String stockId, int quantity, @NotNull String portfolioId, @NotNull String orderType, double executionPrice, String transactionType) {
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return this.networkService.squareOffStock(stockId, new StockSellOrderRequestDto(quantity, portfolioId, orderType, executionPrice, transactionType));
    }
}
