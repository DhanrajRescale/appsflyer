package com.assetgro.stockgro.data.model.portfolio.orders;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/orders/Sold;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "orderPrice", HttpUrl.FRAGMENT_ENCODE_SET, "total", "orderType", "lastTradePrice", "change", "Lcom/assetgro/stockgro/data/model/portfolio/orders/Change;", "(Ljava/lang/String;IDDLjava/lang/String;DLcom/assetgro/stockgro/data/model/portfolio/orders/Change;)V", "getChange", "()Lcom/assetgro/stockgro/data/model/portfolio/orders/Change;", "getLastTradePrice", "()D", "getName", "()Ljava/lang/String;", "getOrderPrice", "getOrderType", "getQuantity", "()I", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Sold {
    public static final int $stable = 0;

    @SerializedName("change")
    @NotNull
    private final Change change;

    @SerializedName("last_trade_price")
    private final double lastTradePrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("order_price")
    private final double orderPrice;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("total")
    private final double total;

    public Sold(@NotNull String name, int i10, double d10, double d11, @NotNull String orderType, double d12, @NotNull Change change) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(change, "change");
        this.name = name;
        this.quantity = i10;
        this.orderPrice = d10;
        this.total = d11;
        this.orderType = orderType;
        this.lastTradePrice = d12;
        this.change = change;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final double getOrderPrice() {
        return this.orderPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Change getChange() {
        return this.change;
    }

    @NotNull
    public final Sold copy(@NotNull String name, int quantity, double orderPrice, double total, @NotNull String orderType, double lastTradePrice, @NotNull Change change) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(change, "change");
        return new Sold(name, quantity, orderPrice, total, orderType, lastTradePrice, change);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sold)) {
            return false;
        }
        Sold sold = (Sold) other;
        return Intrinsics.a(this.name, sold.name) && this.quantity == sold.quantity && Double.compare(this.orderPrice, sold.orderPrice) == 0 && Double.compare(this.total, sold.total) == 0 && Intrinsics.a(this.orderType, sold.orderType) && Double.compare(this.lastTradePrice, sold.lastTradePrice) == 0 && Intrinsics.a(this.change, sold.change);
    }

    @NotNull
    public final Change getChange() {
        return this.change;
    }

    public final double getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getOrderPrice() {
        return this.orderPrice;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.change.hashCode() + d.c(this.lastTradePrice, h.g(this.orderType, d.c(this.total, d.c(this.orderPrice, e.f(this.quantity, this.name.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        int i10 = this.quantity;
        double d10 = this.orderPrice;
        double d11 = this.total;
        String str2 = this.orderType;
        double d12 = this.lastTradePrice;
        Change change = this.change;
        StringBuilder sb2 = new StringBuilder("Sold(name=");
        sb2.append(str);
        sb2.append(", quantity=");
        sb2.append(i10);
        sb2.append(", orderPrice=");
        sb2.append(d10);
        a.v(sb2, ", total=", d11, ", orderType=");
        sb2.append(str2);
        sb2.append(", lastTradePrice=");
        sb2.append(d12);
        sb2.append(", change=");
        sb2.append(change);
        sb2.append(")");
        return sb2.toString();
    }
}
