package com.assetgro.stockgro.data.remote.response;

import a3.a;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0097\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\rHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006;"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/StockSellSelectOrderResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stockName", HttpUrl.FRAGMENT_ENCODE_SET, "stockPrice", HttpUrl.FRAGMENT_ENCODE_SET, "stockImage", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "portfolioDetails", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "remainingQuantity", "coverRemainingQuantity", "orderType", "stopLoss", "bookProfit", "stopLossMaxPercentage", "bookProfitMaxPercentage", "(Ljava/lang/String;DLjava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;Ljava/util/List;IIILjava/util/List;DDDD)V", "getBookProfit", "()D", "getBookProfitMaxPercentage", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getCoverRemainingQuantity", "()I", "getOrderType", "()Ljava/util/List;", "getPortfolioDetails", "getQuantity", "getRemainingQuantity", "getStockImage", "()Ljava/lang/String;", "getStockName", "getStockPrice", "getStopLoss", "getStopLossMaxPercentage", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockSellSelectOrderResponseDto {
    public static final int $stable = 8;

    @SerializedName("book_profit")
    private final double bookProfit;

    @SerializedName("book_profit_max_percentage")
    private final double bookProfitMaxPercentage;

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("cover_remaining_quantity")
    private final int coverRemainingQuantity;

    @SerializedName("order_type")
    @NotNull
    private final List<String> orderType;

    @SerializedName("portfolio_details")
    @NotNull
    private final List<Portfolio> portfolioDetails;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("sell_remaining_quantity")
    private final int remainingQuantity;

    @SerializedName("image_url")
    @NotNull
    private final String stockImage;

    @SerializedName("stock_name")
    @NotNull
    private final String stockName;

    @SerializedName("stock_price")
    private final double stockPrice;

    @SerializedName("stop_loss")
    private final double stopLoss;

    @SerializedName("stop_loss_max_percentage")
    private final double stopLossMaxPercentage;

    public StockSellSelectOrderResponseDto(@NotNull String stockName, double d10, @NotNull String stockImage, @NotNull ChangeDto change, @NotNull List<Portfolio> portfolioDetails, int i10, int i11, int i12, @NotNull List<String> orderType, double d11, double d12, double d13, double d14) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockImage, "stockImage");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.stockName = stockName;
        this.stockPrice = d10;
        this.stockImage = stockImage;
        this.change = change;
        this.portfolioDetails = portfolioDetails;
        this.quantity = i10;
        this.remainingQuantity = i11;
        this.coverRemainingQuantity = i12;
        this.orderType = orderType;
        this.stopLoss = d11;
        this.bookProfit = d12;
        this.stopLossMaxPercentage = d13;
        this.bookProfitMaxPercentage = d14;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStockName() {
        return this.stockName;
    }

    /* renamed from: component10, reason: from getter */
    public final double getStopLoss() {
        return this.stopLoss;
    }

    /* renamed from: component11, reason: from getter */
    public final double getBookProfit() {
        return this.bookProfit;
    }

    /* renamed from: component12, reason: from getter */
    public final double getStopLossMaxPercentage() {
        return this.stopLossMaxPercentage;
    }

    /* renamed from: component13, reason: from getter */
    public final double getBookProfitMaxPercentage() {
        return this.bookProfitMaxPercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStockPrice() {
        return this.stockPrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStockImage() {
        return this.stockImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final List<Portfolio> component5() {
        return this.portfolioDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRemainingQuantity() {
        return this.remainingQuantity;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCoverRemainingQuantity() {
        return this.coverRemainingQuantity;
    }

    @NotNull
    public final List<String> component9() {
        return this.orderType;
    }

    @NotNull
    public final StockSellSelectOrderResponseDto copy(@NotNull String stockName, double stockPrice, @NotNull String stockImage, @NotNull ChangeDto change, @NotNull List<Portfolio> portfolioDetails, int quantity, int remainingQuantity, int coverRemainingQuantity, @NotNull List<String> orderType, double stopLoss, double bookProfit, double stopLossMaxPercentage, double bookProfitMaxPercentage) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockImage, "stockImage");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new StockSellSelectOrderResponseDto(stockName, stockPrice, stockImage, change, portfolioDetails, quantity, remainingQuantity, coverRemainingQuantity, orderType, stopLoss, bookProfit, stopLossMaxPercentage, bookProfitMaxPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockSellSelectOrderResponseDto)) {
            return false;
        }
        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) other;
        return Intrinsics.a(this.stockName, stockSellSelectOrderResponseDto.stockName) && Double.compare(this.stockPrice, stockSellSelectOrderResponseDto.stockPrice) == 0 && Intrinsics.a(this.stockImage, stockSellSelectOrderResponseDto.stockImage) && Intrinsics.a(this.change, stockSellSelectOrderResponseDto.change) && Intrinsics.a(this.portfolioDetails, stockSellSelectOrderResponseDto.portfolioDetails) && this.quantity == stockSellSelectOrderResponseDto.quantity && this.remainingQuantity == stockSellSelectOrderResponseDto.remainingQuantity && this.coverRemainingQuantity == stockSellSelectOrderResponseDto.coverRemainingQuantity && Intrinsics.a(this.orderType, stockSellSelectOrderResponseDto.orderType) && Double.compare(this.stopLoss, stockSellSelectOrderResponseDto.stopLoss) == 0 && Double.compare(this.bookProfit, stockSellSelectOrderResponseDto.bookProfit) == 0 && Double.compare(this.stopLossMaxPercentage, stockSellSelectOrderResponseDto.stopLossMaxPercentage) == 0 && Double.compare(this.bookProfitMaxPercentage, stockSellSelectOrderResponseDto.bookProfitMaxPercentage) == 0;
    }

    public final double getBookProfit() {
        return this.bookProfit;
    }

    public final double getBookProfitMaxPercentage() {
        return this.bookProfitMaxPercentage;
    }

    @NotNull
    public final ChangeDto getChange() {
        return this.change;
    }

    public final int getCoverRemainingQuantity() {
        return this.coverRemainingQuantity;
    }

    @NotNull
    public final List<String> getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final List<Portfolio> getPortfolioDetails() {
        return this.portfolioDetails;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final int getRemainingQuantity() {
        return this.remainingQuantity;
    }

    @NotNull
    public final String getStockImage() {
        return this.stockImage;
    }

    @NotNull
    public final String getStockName() {
        return this.stockName;
    }

    public final double getStockPrice() {
        return this.stockPrice;
    }

    public final double getStopLoss() {
        return this.stopLoss;
    }

    public final double getStopLossMaxPercentage() {
        return this.stopLossMaxPercentage;
    }

    public int hashCode() {
        return Double.hashCode(this.bookProfitMaxPercentage) + d.c(this.stopLossMaxPercentage, d.c(this.bookProfit, d.c(this.stopLoss, d.e(this.orderType, e.f(this.coverRemainingQuantity, e.f(this.remainingQuantity, e.f(this.quantity, d.e(this.portfolioDetails, (this.change.hashCode() + h.g(this.stockImage, d.c(this.stockPrice, this.stockName.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.stockName;
        double d10 = this.stockPrice;
        String str2 = this.stockImage;
        ChangeDto changeDto = this.change;
        List<Portfolio> list = this.portfolioDetails;
        int i10 = this.quantity;
        int i11 = this.remainingQuantity;
        int i12 = this.coverRemainingQuantity;
        List<String> list2 = this.orderType;
        double d11 = this.stopLoss;
        double d12 = this.bookProfit;
        double d13 = this.stopLossMaxPercentage;
        double d14 = this.bookProfitMaxPercentage;
        StringBuilder sb2 = new StringBuilder("StockSellSelectOrderResponseDto(stockName=");
        sb2.append(str);
        sb2.append(", stockPrice=");
        sb2.append(d10);
        sb2.append(", stockImage=");
        sb2.append(str2);
        sb2.append(", change=");
        sb2.append(changeDto);
        sb2.append(", portfolioDetails=");
        sb2.append(list);
        sb2.append(", quantity=");
        sb2.append(i10);
        sb2.append(", remainingQuantity=");
        sb2.append(i11);
        sb2.append(", coverRemainingQuantity=");
        sb2.append(i12);
        sb2.append(", orderType=");
        sb2.append(list2);
        sb2.append(", stopLoss=");
        sb2.append(d11);
        a.v(sb2, ", bookProfit=", d12, ", stopLossMaxPercentage=");
        sb2.append(d13);
        sb2.append(", bookProfitMaxPercentage=");
        sb2.append(d14);
        sb2.append(")");
        return sb2.toString();
    }
}
