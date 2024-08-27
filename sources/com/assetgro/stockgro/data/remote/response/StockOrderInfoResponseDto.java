package com.assetgro.stockgro.data.remote.response;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0002\u0010\u0013J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\u008a\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015¨\u00068"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/StockOrderInfoResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioDetails", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "stockName", HttpUrl.FRAGMENT_ENCODE_SET, "stockPrice", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "price", HttpUrl.FRAGMENT_ENCODE_SET, "stop_loss", "bookProfit", "stopLossMaxPercentage", "bookProfitMaxPercentage", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;ILjava/util/List;Ljava/lang/Float;FFFF)V", "getBookProfit", "()F", "getBookProfitMaxPercentage", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getOrderType", "()Ljava/util/List;", "getPortfolioDetails", "getPrice", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getQuantity", "()I", "getStockName", "()Ljava/lang/String;", "getStockPrice", "getStopLossMaxPercentage", "getStop_loss", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;ILjava/util/List;Ljava/lang/Float;FFFF)Lcom/assetgro/stockgro/data/remote/response/StockOrderInfoResponseDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockOrderInfoResponseDto {
    public static final int $stable = 8;

    @SerializedName("book_profit")
    private final float bookProfit;

    @SerializedName("book_profit_max_percentage")
    private final float bookProfitMaxPercentage;

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("order_type")
    @NotNull
    private final List<String> orderType;

    @SerializedName("portfolio_details")
    @NotNull
    private final List<Portfolio> portfolioDetails;

    @SerializedName("price")
    private final Float price;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("stock_name")
    @NotNull
    private final String stockName;

    @SerializedName("stock_price")
    @NotNull
    private final String stockPrice;

    @SerializedName("stop_loss_max_percentage")
    private final float stopLossMaxPercentage;

    @SerializedName("stop_loss")
    private final float stop_loss;

    public StockOrderInfoResponseDto(@NotNull List<Portfolio> portfolioDetails, @NotNull String stockName, @NotNull String stockPrice, @NotNull ChangeDto change, int i10, @NotNull List<String> orderType, Float f10, float f11, float f12, float f13, float f14) {
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockPrice, "stockPrice");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.portfolioDetails = portfolioDetails;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.change = change;
        this.quantity = i10;
        this.orderType = orderType;
        this.price = f10;
        this.stop_loss = f11;
        this.bookProfit = f12;
        this.stopLossMaxPercentage = f13;
        this.bookProfitMaxPercentage = f14;
    }

    @NotNull
    public final List<Portfolio> component1() {
        return this.portfolioDetails;
    }

    /* renamed from: component10, reason: from getter */
    public final float getStopLossMaxPercentage() {
        return this.stopLossMaxPercentage;
    }

    /* renamed from: component11, reason: from getter */
    public final float getBookProfitMaxPercentage() {
        return this.bookProfitMaxPercentage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStockName() {
        return this.stockName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStockPrice() {
        return this.stockPrice;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    /* renamed from: component5, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final List<String> component6() {
        return this.orderType;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    /* renamed from: component8, reason: from getter */
    public final float getStop_loss() {
        return this.stop_loss;
    }

    /* renamed from: component9, reason: from getter */
    public final float getBookProfit() {
        return this.bookProfit;
    }

    @NotNull
    public final StockOrderInfoResponseDto copy(@NotNull List<Portfolio> portfolioDetails, @NotNull String stockName, @NotNull String stockPrice, @NotNull ChangeDto change, int quantity, @NotNull List<String> orderType, Float price, float stop_loss, float bookProfit, float stopLossMaxPercentage, float bookProfitMaxPercentage) {
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockPrice, "stockPrice");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new StockOrderInfoResponseDto(portfolioDetails, stockName, stockPrice, change, quantity, orderType, price, stop_loss, bookProfit, stopLossMaxPercentage, bookProfitMaxPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockOrderInfoResponseDto)) {
            return false;
        }
        StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) other;
        return Intrinsics.a(this.portfolioDetails, stockOrderInfoResponseDto.portfolioDetails) && Intrinsics.a(this.stockName, stockOrderInfoResponseDto.stockName) && Intrinsics.a(this.stockPrice, stockOrderInfoResponseDto.stockPrice) && Intrinsics.a(this.change, stockOrderInfoResponseDto.change) && this.quantity == stockOrderInfoResponseDto.quantity && Intrinsics.a(this.orderType, stockOrderInfoResponseDto.orderType) && Intrinsics.a(this.price, stockOrderInfoResponseDto.price) && Float.compare(this.stop_loss, stockOrderInfoResponseDto.stop_loss) == 0 && Float.compare(this.bookProfit, stockOrderInfoResponseDto.bookProfit) == 0 && Float.compare(this.stopLossMaxPercentage, stockOrderInfoResponseDto.stopLossMaxPercentage) == 0 && Float.compare(this.bookProfitMaxPercentage, stockOrderInfoResponseDto.bookProfitMaxPercentage) == 0;
    }

    public final float getBookProfit() {
        return this.bookProfit;
    }

    public final float getBookProfitMaxPercentage() {
        return this.bookProfitMaxPercentage;
    }

    @NotNull
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final List<String> getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final List<Portfolio> getPortfolioDetails() {
        return this.portfolioDetails;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getStockName() {
        return this.stockName;
    }

    @NotNull
    public final String getStockPrice() {
        return this.stockPrice;
    }

    public final float getStopLossMaxPercentage() {
        return this.stopLossMaxPercentage;
    }

    public final float getStop_loss() {
        return this.stop_loss;
    }

    public int hashCode() {
        int hashCode;
        int e10 = d.e(this.orderType, e.f(this.quantity, (this.change.hashCode() + h.g(this.stockPrice, h.g(this.stockName, this.portfolioDetails.hashCode() * 31, 31), 31)) * 31, 31), 31);
        Float f10 = this.price;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        return Float.hashCode(this.bookProfitMaxPercentage) + v.e.a(this.stopLossMaxPercentage, v.e.a(this.bookProfit, v.e.a(this.stop_loss, (e10 + hashCode) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "StockOrderInfoResponseDto(portfolioDetails=" + this.portfolioDetails + ", stockName=" + this.stockName + ", stockPrice=" + this.stockPrice + ", change=" + this.change + ", quantity=" + this.quantity + ", orderType=" + this.orderType + ", price=" + this.price + ", stop_loss=" + this.stop_loss + ", bookProfit=" + this.bookProfit + ", stopLossMaxPercentage=" + this.stopLossMaxPercentage + ", bookProfitMaxPercentage=" + this.bookProfitMaxPercentage + ")";
    }
}
