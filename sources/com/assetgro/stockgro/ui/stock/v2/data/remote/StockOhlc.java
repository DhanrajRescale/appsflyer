package com.assetgro.stockgro.ui.stock.v2.data.remote;

import a3.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockOhlc;", HttpUrl.FRAGMENT_ENCODE_SET, "openPrice", HttpUrl.FRAGMENT_ENCODE_SET, "priceHigh", "priceLow", "priceClose", "price52WeekHigh", "price52WeekLow", "(DDDDDD)V", "getOpenPrice", "()D", "getPrice52WeekHigh", "getPrice52WeekLow", "getPriceClose", "getPriceHigh", "getPriceLow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockOhlc {
    public static final int $stable = 0;

    @SerializedName("price_open_24h")
    private final double openPrice;

    @SerializedName("price_high_52w")
    private final double price52WeekHigh;

    @SerializedName("price_low_52w")
    private final double price52WeekLow;

    @SerializedName("previous_close_24h")
    private final double priceClose;

    @SerializedName("price_high_24h")
    private final double priceHigh;

    @SerializedName("price_low_24h")
    private final double priceLow;

    public StockOhlc(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.openPrice = d10;
        this.priceHigh = d11;
        this.priceLow = d12;
        this.priceClose = d13;
        this.price52WeekHigh = d14;
        this.price52WeekLow = d15;
    }

    /* renamed from: component1, reason: from getter */
    public final double getOpenPrice() {
        return this.openPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPriceHigh() {
        return this.priceHigh;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPriceLow() {
        return this.priceLow;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPriceClose() {
        return this.priceClose;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPrice52WeekHigh() {
        return this.price52WeekHigh;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPrice52WeekLow() {
        return this.price52WeekLow;
    }

    @NotNull
    public final StockOhlc copy(double openPrice, double priceHigh, double priceLow, double priceClose, double price52WeekHigh, double price52WeekLow) {
        return new StockOhlc(openPrice, priceHigh, priceLow, priceClose, price52WeekHigh, price52WeekLow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockOhlc)) {
            return false;
        }
        StockOhlc stockOhlc = (StockOhlc) other;
        return Double.compare(this.openPrice, stockOhlc.openPrice) == 0 && Double.compare(this.priceHigh, stockOhlc.priceHigh) == 0 && Double.compare(this.priceLow, stockOhlc.priceLow) == 0 && Double.compare(this.priceClose, stockOhlc.priceClose) == 0 && Double.compare(this.price52WeekHigh, stockOhlc.price52WeekHigh) == 0 && Double.compare(this.price52WeekLow, stockOhlc.price52WeekLow) == 0;
    }

    public final double getOpenPrice() {
        return this.openPrice;
    }

    public final double getPrice52WeekHigh() {
        return this.price52WeekHigh;
    }

    public final double getPrice52WeekLow() {
        return this.price52WeekLow;
    }

    public final double getPriceClose() {
        return this.priceClose;
    }

    public final double getPriceHigh() {
        return this.priceHigh;
    }

    public final double getPriceLow() {
        return this.priceLow;
    }

    public int hashCode() {
        return Double.hashCode(this.price52WeekLow) + d.c(this.price52WeekHigh, d.c(this.priceClose, d.c(this.priceLow, d.c(this.priceHigh, Double.hashCode(this.openPrice) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        double d10 = this.openPrice;
        double d11 = this.priceHigh;
        double d12 = this.priceLow;
        double d13 = this.priceClose;
        double d14 = this.price52WeekHigh;
        double d15 = this.price52WeekLow;
        StringBuilder sb2 = new StringBuilder("StockOhlc(openPrice=");
        sb2.append(d10);
        sb2.append(", priceHigh=");
        sb2.append(d11);
        a.v(sb2, ", priceLow=", d12, ", priceClose=");
        sb2.append(d13);
        a.v(sb2, ", price52WeekHigh=", d14, ", price52WeekLow=");
        sb2.append(d15);
        sb2.append(")");
        return sb2.toString();
    }
}
