package com.assetgro.stockgro.data.model.portfolio.holdings;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u0016HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003Jë\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020\u00162\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0006HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 R\u0016\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 ¨\u0006W"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/StockTransaction;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "code", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "totalQuantity", "averageBuyPrice", HttpUrl.FRAGMENT_ENCODE_SET, "averageShortPrice", "averageCoverPrice", "averageSellPrice", "currentMarketPrice", "marketValue", "purchaseValue", "profitGained", "realizedProfitGained", "unrealizedProfit", "profitPercentage", "unrealizedProfitPercentage", "profitLoss", HttpUrl.FRAGMENT_ENCODE_SET, "marketSentiment", "sector", "followers", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Followers;", "imageUrl", "stockType", "(Ljava/lang/String;Ljava/lang/String;IIDDDDDDDDDDDDZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAverageBuyPrice", "()D", "getAverageCoverPrice", "getAverageSellPrice", "getAverageShortPrice", "getCode", "()Ljava/lang/String;", "getCurrentMarketPrice", "getFollowers", "()Ljava/util/List;", "setFollowers", "(Ljava/util/List;)V", "getImageUrl", "getMarketSentiment", "getMarketValue", "getName", "getProfitGained", "getProfitLoss", "()Z", "getProfitPercentage", "getPurchaseValue", "getQuantity", "()I", "getRealizedProfitGained", "getSector", "getStockType", "getTotalQuantity", "getUnrealizedProfit", "getUnrealizedProfitPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockTransaction {
    public static final int $stable = 8;

    @SerializedName("average_buy_price")
    private final double averageBuyPrice;

    @SerializedName("average_cover_price")
    private final double averageCoverPrice;

    @SerializedName("average_sell_price")
    private final double averageSellPrice;

    @SerializedName("average_short_price")
    private final double averageShortPrice;

    @SerializedName("stock_id")
    @NotNull
    private final String code;

    @SerializedName("current_market_price")
    private final double currentMarketPrice;

    @SerializedName("followers")
    @NotNull
    private List<Followers> followers;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("market_sentiment")
    @NotNull
    private final String marketSentiment;

    @SerializedName("market_value")
    private final double marketValue;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("profit_gained")
    private final double profitGained;

    @SerializedName("profit_loss")
    private final boolean profitLoss;

    @SerializedName("profit_percentage")
    private final double profitPercentage;

    @SerializedName("purchase_value")
    private final double purchaseValue;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("realized_profit_gained")
    private final double realizedProfitGained;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    @SerializedName("stock_type")
    @NotNull
    private final String stockType;

    @SerializedName("total_quantity")
    private final int totalQuantity;

    @SerializedName("unrealized_profit")
    private final double unrealizedProfit;

    @SerializedName("unrealized_profit_percentage")
    private final double unrealizedProfitPercentage;

    public StockTransaction(@NotNull String name, @NotNull String code, int i10, int i11, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, boolean z10, @NotNull String marketSentiment, @NotNull String sector, @NotNull List<Followers> followers, @NotNull String imageUrl, @NotNull String stockType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(followers, "followers");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(stockType, "stockType");
        this.name = name;
        this.code = code;
        this.quantity = i10;
        this.totalQuantity = i11;
        this.averageBuyPrice = d10;
        this.averageShortPrice = d11;
        this.averageCoverPrice = d12;
        this.averageSellPrice = d13;
        this.currentMarketPrice = d14;
        this.marketValue = d15;
        this.purchaseValue = d16;
        this.profitGained = d17;
        this.realizedProfitGained = d18;
        this.unrealizedProfit = d19;
        this.profitPercentage = d20;
        this.unrealizedProfitPercentage = d21;
        this.profitLoss = z10;
        this.marketSentiment = marketSentiment;
        this.sector = sector;
        this.followers = followers;
        this.imageUrl = imageUrl;
        this.stockType = stockType;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final double getMarketValue() {
        return this.marketValue;
    }

    /* renamed from: component11, reason: from getter */
    public final double getPurchaseValue() {
        return this.purchaseValue;
    }

    /* renamed from: component12, reason: from getter */
    public final double getProfitGained() {
        return this.profitGained;
    }

    /* renamed from: component13, reason: from getter */
    public final double getRealizedProfitGained() {
        return this.realizedProfitGained;
    }

    /* renamed from: component14, reason: from getter */
    public final double getUnrealizedProfit() {
        return this.unrealizedProfit;
    }

    /* renamed from: component15, reason: from getter */
    public final double getProfitPercentage() {
        return this.profitPercentage;
    }

    /* renamed from: component16, reason: from getter */
    public final double getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getProfitLoss() {
        return this.profitLoss;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getMarketSentiment() {
        return this.marketSentiment;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<Followers> component20() {
        return this.followers;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final String getStockType() {
        return this.stockType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAverageBuyPrice() {
        return this.averageBuyPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final double getAverageShortPrice() {
        return this.averageShortPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final double getAverageCoverPrice() {
        return this.averageCoverPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final double getAverageSellPrice() {
        return this.averageSellPrice;
    }

    /* renamed from: component9, reason: from getter */
    public final double getCurrentMarketPrice() {
        return this.currentMarketPrice;
    }

    @NotNull
    public final StockTransaction copy(@NotNull String name, @NotNull String code, int quantity, int totalQuantity, double averageBuyPrice, double averageShortPrice, double averageCoverPrice, double averageSellPrice, double currentMarketPrice, double marketValue, double purchaseValue, double profitGained, double realizedProfitGained, double unrealizedProfit, double profitPercentage, double unrealizedProfitPercentage, boolean profitLoss, @NotNull String marketSentiment, @NotNull String sector, @NotNull List<Followers> followers, @NotNull String imageUrl, @NotNull String stockType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(followers, "followers");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(stockType, "stockType");
        return new StockTransaction(name, code, quantity, totalQuantity, averageBuyPrice, averageShortPrice, averageCoverPrice, averageSellPrice, currentMarketPrice, marketValue, purchaseValue, profitGained, realizedProfitGained, unrealizedProfit, profitPercentage, unrealizedProfitPercentage, profitLoss, marketSentiment, sector, followers, imageUrl, stockType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockTransaction)) {
            return false;
        }
        StockTransaction stockTransaction = (StockTransaction) other;
        return Intrinsics.a(this.name, stockTransaction.name) && Intrinsics.a(this.code, stockTransaction.code) && this.quantity == stockTransaction.quantity && this.totalQuantity == stockTransaction.totalQuantity && Double.compare(this.averageBuyPrice, stockTransaction.averageBuyPrice) == 0 && Double.compare(this.averageShortPrice, stockTransaction.averageShortPrice) == 0 && Double.compare(this.averageCoverPrice, stockTransaction.averageCoverPrice) == 0 && Double.compare(this.averageSellPrice, stockTransaction.averageSellPrice) == 0 && Double.compare(this.currentMarketPrice, stockTransaction.currentMarketPrice) == 0 && Double.compare(this.marketValue, stockTransaction.marketValue) == 0 && Double.compare(this.purchaseValue, stockTransaction.purchaseValue) == 0 && Double.compare(this.profitGained, stockTransaction.profitGained) == 0 && Double.compare(this.realizedProfitGained, stockTransaction.realizedProfitGained) == 0 && Double.compare(this.unrealizedProfit, stockTransaction.unrealizedProfit) == 0 && Double.compare(this.profitPercentage, stockTransaction.profitPercentage) == 0 && Double.compare(this.unrealizedProfitPercentage, stockTransaction.unrealizedProfitPercentage) == 0 && this.profitLoss == stockTransaction.profitLoss && Intrinsics.a(this.marketSentiment, stockTransaction.marketSentiment) && Intrinsics.a(this.sector, stockTransaction.sector) && Intrinsics.a(this.followers, stockTransaction.followers) && Intrinsics.a(this.imageUrl, stockTransaction.imageUrl) && Intrinsics.a(this.stockType, stockTransaction.stockType);
    }

    public final double getAverageBuyPrice() {
        return this.averageBuyPrice;
    }

    public final double getAverageCoverPrice() {
        return this.averageCoverPrice;
    }

    public final double getAverageSellPrice() {
        return this.averageSellPrice;
    }

    public final double getAverageShortPrice() {
        return this.averageShortPrice;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final double getCurrentMarketPrice() {
        return this.currentMarketPrice;
    }

    @NotNull
    public final List<Followers> getFollowers() {
        return this.followers;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMarketSentiment() {
        return this.marketSentiment;
    }

    public final double getMarketValue() {
        return this.marketValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getProfitGained() {
        return this.profitGained;
    }

    public final boolean getProfitLoss() {
        return this.profitLoss;
    }

    public final double getProfitPercentage() {
        return this.profitPercentage;
    }

    public final double getPurchaseValue() {
        return this.purchaseValue;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final double getRealizedProfitGained() {
        return this.realizedProfitGained;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    public final String getStockType() {
        return this.stockType;
    }

    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    public final double getUnrealizedProfit() {
        return this.unrealizedProfit;
    }

    public final double getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    public int hashCode() {
        return this.stockType.hashCode() + h.g(this.imageUrl, d.e(this.followers, h.g(this.sector, h.g(this.marketSentiment, e.d(this.profitLoss, d.c(this.unrealizedProfitPercentage, d.c(this.profitPercentage, d.c(this.unrealizedProfit, d.c(this.realizedProfitGained, d.c(this.profitGained, d.c(this.purchaseValue, d.c(this.marketValue, d.c(this.currentMarketPrice, d.c(this.averageSellPrice, d.c(this.averageCoverPrice, d.c(this.averageShortPrice, d.c(this.averageBuyPrice, da.e.f(this.totalQuantity, da.e.f(this.quantity, h.g(this.code, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setFollowers(@NotNull List<Followers> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.followers = list;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        int i10 = this.quantity;
        int i11 = this.totalQuantity;
        double d10 = this.averageBuyPrice;
        double d11 = this.averageShortPrice;
        double d12 = this.averageCoverPrice;
        double d13 = this.averageSellPrice;
        double d14 = this.currentMarketPrice;
        double d15 = this.marketValue;
        double d16 = this.purchaseValue;
        double d17 = this.profitGained;
        double d18 = this.realizedProfitGained;
        double d19 = this.unrealizedProfit;
        double d20 = this.profitPercentage;
        double d21 = this.unrealizedProfitPercentage;
        boolean z10 = this.profitLoss;
        String str3 = this.marketSentiment;
        String str4 = this.sector;
        List<Followers> list = this.followers;
        String str5 = this.imageUrl;
        String str6 = this.stockType;
        StringBuilder l10 = e.l("StockTransaction(name=", str, ", code=", str2, ", quantity=");
        h.v(l10, i10, ", totalQuantity=", i11, ", averageBuyPrice=");
        l10.append(d10);
        a.v(l10, ", averageShortPrice=", d11, ", averageCoverPrice=");
        l10.append(d12);
        a.v(l10, ", averageSellPrice=", d13, ", currentMarketPrice=");
        l10.append(d14);
        a.v(l10, ", marketValue=", d15, ", purchaseValue=");
        l10.append(d16);
        a.v(l10, ", profitGained=", d17, ", realizedProfitGained=");
        l10.append(d18);
        a.v(l10, ", unrealizedProfit=", d19, ", profitPercentage=");
        l10.append(d20);
        a.v(l10, ", unrealizedProfitPercentage=", d21, ", profitLoss=");
        l10.append(z10);
        l10.append(", marketSentiment=");
        l10.append(str3);
        l10.append(", sector=");
        l10.append(str4);
        l10.append(", followers=");
        l10.append(list);
        l10.append(", imageUrl=");
        return a.k(l10, str5, ", stockType=", str6, ")");
    }
}
