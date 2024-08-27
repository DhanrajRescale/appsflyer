package com.assetgro.stockgro.data.model.portfolio.holdings;

import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/PortfolioHoldingsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stockTransactions", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/StockTransaction;", "portfolio", "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "stockCount", HttpUrl.FRAGMENT_ENCODE_SET, "periodicReturns", "Lcom/assetgro/stockgro/data/model/portfolio/holdings/PeriodicReturn;", "(Ljava/util/List;Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;ILjava/util/List;)V", "getPeriodicReturns", "()Ljava/util/List;", "getPortfolio", "()Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "getStockCount", "()I", "getStockTransactions", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioHoldingsDto {
    public static final int $stable = 8;

    @SerializedName("periodic_returns")
    @NotNull
    private final List<PeriodicReturn> periodicReturns;

    @SerializedName("portfolio")
    @NotNull
    private final Portfolio portfolio;

    @SerializedName("stock_count")
    private final int stockCount;

    @SerializedName("stock_transactions")
    @NotNull
    private final List<StockTransaction> stockTransactions;

    public PortfolioHoldingsDto(@NotNull List<StockTransaction> stockTransactions, @NotNull Portfolio portfolio, int i10, @NotNull List<PeriodicReturn> periodicReturns) {
        Intrinsics.checkNotNullParameter(stockTransactions, "stockTransactions");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(periodicReturns, "periodicReturns");
        this.stockTransactions = stockTransactions;
        this.portfolio = portfolio;
        this.stockCount = i10;
        this.periodicReturns = periodicReturns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioHoldingsDto copy$default(PortfolioHoldingsDto portfolioHoldingsDto, List list, Portfolio portfolio, int i10, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = portfolioHoldingsDto.stockTransactions;
        }
        if ((i11 & 2) != 0) {
            portfolio = portfolioHoldingsDto.portfolio;
        }
        if ((i11 & 4) != 0) {
            i10 = portfolioHoldingsDto.stockCount;
        }
        if ((i11 & 8) != 0) {
            list2 = portfolioHoldingsDto.periodicReturns;
        }
        return portfolioHoldingsDto.copy(list, portfolio, i10, list2);
    }

    @NotNull
    public final List<StockTransaction> component1() {
        return this.stockTransactions;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStockCount() {
        return this.stockCount;
    }

    @NotNull
    public final List<PeriodicReturn> component4() {
        return this.periodicReturns;
    }

    @NotNull
    public final PortfolioHoldingsDto copy(@NotNull List<StockTransaction> stockTransactions, @NotNull Portfolio portfolio, int stockCount, @NotNull List<PeriodicReturn> periodicReturns) {
        Intrinsics.checkNotNullParameter(stockTransactions, "stockTransactions");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(periodicReturns, "periodicReturns");
        return new PortfolioHoldingsDto(stockTransactions, portfolio, stockCount, periodicReturns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioHoldingsDto)) {
            return false;
        }
        PortfolioHoldingsDto portfolioHoldingsDto = (PortfolioHoldingsDto) other;
        return Intrinsics.a(this.stockTransactions, portfolioHoldingsDto.stockTransactions) && Intrinsics.a(this.portfolio, portfolioHoldingsDto.portfolio) && this.stockCount == portfolioHoldingsDto.stockCount && Intrinsics.a(this.periodicReturns, portfolioHoldingsDto.periodicReturns);
    }

    @NotNull
    public final List<PeriodicReturn> getPeriodicReturns() {
        return this.periodicReturns;
    }

    @NotNull
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final int getStockCount() {
        return this.stockCount;
    }

    @NotNull
    public final List<StockTransaction> getStockTransactions() {
        return this.stockTransactions;
    }

    public int hashCode() {
        return this.periodicReturns.hashCode() + e.f(this.stockCount, (this.portfolio.hashCode() + (this.stockTransactions.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PortfolioHoldingsDto(stockTransactions=" + this.stockTransactions + ", portfolio=" + this.portfolio + ", stockCount=" + this.stockCount + ", periodicReturns=" + this.periodicReturns + ")";
    }
}
