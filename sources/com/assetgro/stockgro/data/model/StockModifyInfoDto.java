package com.assetgro.stockgro.data.model;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0017J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\t\u00100\u001a\u00020\u0011HÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J®\u0001\u0010=\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\fHÖ\u0001J\t\u0010C\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006D"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockModifyInfoDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioDetails", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "stockName", HttpUrl.FRAGMENT_ENCODE_SET, "stockPrice", "entryPrice", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "sellRemainingQuantity", "coverRemainingQuantity", "orderType", "price", HttpUrl.FRAGMENT_ENCODE_SET, "stop_loss", "bookProfit", "stopLossMaxPercentage", "bookProfitMaxPercentage", "parentOrderType", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;IIILjava/lang/String;Ljava/lang/Float;FFFFLjava/lang/String;)V", "getBookProfit", "()F", "getBookProfitMaxPercentage", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getCoverRemainingQuantity", "()I", "getEntryPrice", "()Ljava/lang/String;", "getOrderType", "getParentOrderType", "getPortfolioDetails", "()Ljava/util/List;", "getPrice", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getQuantity", "getSellRemainingQuantity", "getStockName", "getStockPrice", "getStopLossMaxPercentage", "getStop_loss", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;IIILjava/lang/String;Ljava/lang/Float;FFFFLjava/lang/String;)Lcom/assetgro/stockgro/data/model/StockModifyInfoDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockModifyInfoDto {
    public static final int $stable = 8;

    @SerializedName("book_profit")
    private final float bookProfit;

    @SerializedName("book_profit_max_percentage")
    private final float bookProfitMaxPercentage;

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("cover_remaining_quantity")
    private final int coverRemainingQuantity;

    @SerializedName("entry_price")
    @NotNull
    private final String entryPrice;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("parent_order_type")
    private final String parentOrderType;

    @SerializedName("portfolio_details")
    @NotNull
    private final List<Portfolio> portfolioDetails;

    @SerializedName("price")
    private final Float price;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("sell_remaining_quantity")
    private final int sellRemainingQuantity;

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

    public StockModifyInfoDto(@NotNull List<Portfolio> portfolioDetails, @NotNull String stockName, @NotNull String stockPrice, @NotNull String entryPrice, @NotNull ChangeDto change, int i10, int i11, int i12, @NotNull String orderType, Float f10, float f11, float f12, float f13, float f14, String str) {
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockPrice, "stockPrice");
        Intrinsics.checkNotNullParameter(entryPrice, "entryPrice");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.portfolioDetails = portfolioDetails;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.entryPrice = entryPrice;
        this.change = change;
        this.quantity = i10;
        this.sellRemainingQuantity = i11;
        this.coverRemainingQuantity = i12;
        this.orderType = orderType;
        this.price = f10;
        this.stop_loss = f11;
        this.bookProfit = f12;
        this.stopLossMaxPercentage = f13;
        this.bookProfitMaxPercentage = f14;
        this.parentOrderType = str;
    }

    @NotNull
    public final List<Portfolio> component1() {
        return this.portfolioDetails;
    }

    /* renamed from: component10, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    /* renamed from: component11, reason: from getter */
    public final float getStop_loss() {
        return this.stop_loss;
    }

    /* renamed from: component12, reason: from getter */
    public final float getBookProfit() {
        return this.bookProfit;
    }

    /* renamed from: component13, reason: from getter */
    public final float getStopLossMaxPercentage() {
        return this.stopLossMaxPercentage;
    }

    /* renamed from: component14, reason: from getter */
    public final float getBookProfitMaxPercentage() {
        return this.bookProfitMaxPercentage;
    }

    /* renamed from: component15, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
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
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    /* renamed from: component6, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSellRemainingQuantity() {
        return this.sellRemainingQuantity;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCoverRemainingQuantity() {
        return this.coverRemainingQuantity;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final StockModifyInfoDto copy(@NotNull List<Portfolio> portfolioDetails, @NotNull String stockName, @NotNull String stockPrice, @NotNull String entryPrice, @NotNull ChangeDto change, int quantity, int sellRemainingQuantity, int coverRemainingQuantity, @NotNull String orderType, Float price, float stop_loss, float bookProfit, float stopLossMaxPercentage, float bookProfitMaxPercentage, String parentOrderType) {
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockPrice, "stockPrice");
        Intrinsics.checkNotNullParameter(entryPrice, "entryPrice");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new StockModifyInfoDto(portfolioDetails, stockName, stockPrice, entryPrice, change, quantity, sellRemainingQuantity, coverRemainingQuantity, orderType, price, stop_loss, bookProfit, stopLossMaxPercentage, bookProfitMaxPercentage, parentOrderType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockModifyInfoDto)) {
            return false;
        }
        StockModifyInfoDto stockModifyInfoDto = (StockModifyInfoDto) other;
        return Intrinsics.a(this.portfolioDetails, stockModifyInfoDto.portfolioDetails) && Intrinsics.a(this.stockName, stockModifyInfoDto.stockName) && Intrinsics.a(this.stockPrice, stockModifyInfoDto.stockPrice) && Intrinsics.a(this.entryPrice, stockModifyInfoDto.entryPrice) && Intrinsics.a(this.change, stockModifyInfoDto.change) && this.quantity == stockModifyInfoDto.quantity && this.sellRemainingQuantity == stockModifyInfoDto.sellRemainingQuantity && this.coverRemainingQuantity == stockModifyInfoDto.coverRemainingQuantity && Intrinsics.a(this.orderType, stockModifyInfoDto.orderType) && Intrinsics.a(this.price, stockModifyInfoDto.price) && Float.compare(this.stop_loss, stockModifyInfoDto.stop_loss) == 0 && Float.compare(this.bookProfit, stockModifyInfoDto.bookProfit) == 0 && Float.compare(this.stopLossMaxPercentage, stockModifyInfoDto.stopLossMaxPercentage) == 0 && Float.compare(this.bookProfitMaxPercentage, stockModifyInfoDto.bookProfitMaxPercentage) == 0 && Intrinsics.a(this.parentOrderType, stockModifyInfoDto.parentOrderType);
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

    public final int getCoverRemainingQuantity() {
        return this.coverRemainingQuantity;
    }

    @NotNull
    public final String getEntryPrice() {
        return this.entryPrice;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    public final String getParentOrderType() {
        return this.parentOrderType;
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

    public final int getSellRemainingQuantity() {
        return this.sellRemainingQuantity;
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
        int g10 = h.g(this.orderType, e.f(this.coverRemainingQuantity, e.f(this.sellRemainingQuantity, e.f(this.quantity, (this.change.hashCode() + h.g(this.entryPrice, h.g(this.stockPrice, h.g(this.stockName, this.portfolioDetails.hashCode() * 31, 31), 31), 31)) * 31, 31), 31), 31), 31);
        Float f10 = this.price;
        int i10 = 0;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        int a10 = v.e.a(this.bookProfitMaxPercentage, v.e.a(this.stopLossMaxPercentage, v.e.a(this.bookProfit, v.e.a(this.stop_loss, (g10 + hashCode) * 31, 31), 31), 31), 31);
        String str = this.parentOrderType;
        if (str != null) {
            i10 = str.hashCode();
        }
        return a10 + i10;
    }

    @NotNull
    public String toString() {
        List<Portfolio> list = this.portfolioDetails;
        String str = this.stockName;
        String str2 = this.stockPrice;
        String str3 = this.entryPrice;
        ChangeDto changeDto = this.change;
        int i10 = this.quantity;
        int i11 = this.sellRemainingQuantity;
        int i12 = this.coverRemainingQuantity;
        String str4 = this.orderType;
        Float f10 = this.price;
        float f11 = this.stop_loss;
        float f12 = this.bookProfit;
        float f13 = this.stopLossMaxPercentage;
        float f14 = this.bookProfitMaxPercentage;
        String str5 = this.parentOrderType;
        StringBuilder sb2 = new StringBuilder("StockModifyInfoDto(portfolioDetails=");
        sb2.append(list);
        sb2.append(", stockName=");
        sb2.append(str);
        sb2.append(", stockPrice=");
        v.e.v(sb2, str2, ", entryPrice=", str3, ", change=");
        sb2.append(changeDto);
        sb2.append(", quantity=");
        sb2.append(i10);
        sb2.append(", sellRemainingQuantity=");
        h.v(sb2, i11, ", coverRemainingQuantity=", i12, ", orderType=");
        sb2.append(str4);
        sb2.append(", price=");
        sb2.append(f10);
        sb2.append(", stop_loss=");
        sb2.append(f11);
        sb2.append(", bookProfit=");
        sb2.append(f12);
        sb2.append(", stopLossMaxPercentage=");
        sb2.append(f13);
        sb2.append(", bookProfitMaxPercentage=");
        sb2.append(f14);
        sb2.append(", parentOrderType=");
        return d.o(sb2, str5, ")");
    }
}
