package com.assetgro.stockgro.data.model.portfolio.orders;

import a3.a;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b¨\u0006J"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/orders/Bought;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.ORDER_ID_CAMEL, "stockIdentifier", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "entryDate", HttpUrl.FRAGMENT_ENCODE_SET, "executionDate", "orderPrice", HttpUrl.FRAGMENT_ENCODE_SET, "total", "orderStatus", "cancelReason", "tradeType", "orderType", "lastTradePrice", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "imageUrl", "bidPrice", "askPrice", "transactionType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJJDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAskPrice", "()Ljava/lang/String;", "getBidPrice", "getCancelReason", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getEntryDate", "()J", "getExecutionDate", "getImageUrl", "getLastTradePrice", "()D", "getName", "getOrderId", "getOrderPrice", "getOrderStatus", "getOrderType", "getQuantity", "()F", "getStockIdentifier", "getTotal", "getTradeType", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Bought {
    public static final int $stable = 0;

    @SerializedName("ask_price")
    @NotNull
    private final String askPrice;

    @SerializedName("bid_price")
    @NotNull
    private final String bidPrice;

    @SerializedName("cancel_reason")
    @NotNull
    private final String cancelReason;

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("entry_date")
    private final long entryDate;

    @SerializedName("execution_date")
    private final long executionDate;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("last_trade_price")
    private final double lastTradePrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName(PaymentConstants.ORDER_ID)
    @NotNull
    private final String orderId;

    @SerializedName("order_price")
    private final double orderPrice;

    @SerializedName("order_status")
    @NotNull
    private final String orderStatus;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("quantity")
    private final float quantity;

    @SerializedName("identifier")
    @NotNull
    private final String stockIdentifier;

    @SerializedName("total")
    private final double total;

    @SerializedName("trade_type")
    @NotNull
    private final String tradeType;

    @SerializedName("transaction_type")
    @NotNull
    private final String transactionType;

    public Bought(@NotNull String name, @NotNull String orderId, @NotNull String stockIdentifier, float f10, long j10, long j11, double d10, double d11, @NotNull String orderStatus, @NotNull String cancelReason, @NotNull String tradeType, @NotNull String orderType, double d12, @NotNull ChangeDto change, @NotNull String imageUrl, @NotNull String bidPrice, @NotNull String askPrice, @NotNull String transactionType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(stockIdentifier, "stockIdentifier");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.name = name;
        this.orderId = orderId;
        this.stockIdentifier = stockIdentifier;
        this.quantity = f10;
        this.entryDate = j10;
        this.executionDate = j11;
        this.orderPrice = d10;
        this.total = d11;
        this.orderStatus = orderStatus;
        this.cancelReason = cancelReason;
        this.tradeType = tradeType;
        this.orderType = orderType;
        this.lastTradePrice = d12;
        this.change = change;
        this.imageUrl = imageUrl;
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
        this.transactionType = transactionType;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component13, reason: from getter */
    public final double getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getBidPrice() {
        return this.bidPrice;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getAskPrice() {
        return this.askPrice;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStockIdentifier() {
        return this.stockIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEntryDate() {
        return this.entryDate;
    }

    /* renamed from: component6, reason: from getter */
    public final long getExecutionDate() {
        return this.executionDate;
    }

    /* renamed from: component7, reason: from getter */
    public final double getOrderPrice() {
        return this.orderPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final Bought copy(@NotNull String name, @NotNull String orderId, @NotNull String stockIdentifier, float quantity, long entryDate, long executionDate, double orderPrice, double total, @NotNull String orderStatus, @NotNull String cancelReason, @NotNull String tradeType, @NotNull String orderType, double lastTradePrice, @NotNull ChangeDto change, @NotNull String imageUrl, @NotNull String bidPrice, @NotNull String askPrice, @NotNull String transactionType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(stockIdentifier, "stockIdentifier");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return new Bought(name, orderId, stockIdentifier, quantity, entryDate, executionDate, orderPrice, total, orderStatus, cancelReason, tradeType, orderType, lastTradePrice, change, imageUrl, bidPrice, askPrice, transactionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bought)) {
            return false;
        }
        Bought bought = (Bought) other;
        return Intrinsics.a(this.name, bought.name) && Intrinsics.a(this.orderId, bought.orderId) && Intrinsics.a(this.stockIdentifier, bought.stockIdentifier) && Float.compare(this.quantity, bought.quantity) == 0 && this.entryDate == bought.entryDate && this.executionDate == bought.executionDate && Double.compare(this.orderPrice, bought.orderPrice) == 0 && Double.compare(this.total, bought.total) == 0 && Intrinsics.a(this.orderStatus, bought.orderStatus) && Intrinsics.a(this.cancelReason, bought.cancelReason) && Intrinsics.a(this.tradeType, bought.tradeType) && Intrinsics.a(this.orderType, bought.orderType) && Double.compare(this.lastTradePrice, bought.lastTradePrice) == 0 && Intrinsics.a(this.change, bought.change) && Intrinsics.a(this.imageUrl, bought.imageUrl) && Intrinsics.a(this.bidPrice, bought.bidPrice) && Intrinsics.a(this.askPrice, bought.askPrice) && Intrinsics.a(this.transactionType, bought.transactionType);
    }

    @NotNull
    public final String getAskPrice() {
        return this.askPrice;
    }

    @NotNull
    public final String getBidPrice() {
        return this.bidPrice;
    }

    @NotNull
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @NotNull
    public final ChangeDto getChange() {
        return this.change;
    }

    public final long getEntryDate() {
        return this.entryDate;
    }

    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final double getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final double getOrderPrice() {
        return this.orderPrice;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    public final float getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getStockIdentifier() {
        return this.stockIdentifier;
    }

    public final double getTotal() {
        return this.total;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return this.transactionType.hashCode() + h.g(this.askPrice, h.g(this.bidPrice, h.g(this.imageUrl, (this.change.hashCode() + d.c(this.lastTradePrice, h.g(this.orderType, h.g(this.tradeType, h.g(this.cancelReason, h.g(this.orderStatus, d.c(this.total, d.c(this.orderPrice, e.c(this.executionDate, e.c(this.entryDate, e.a(this.quantity, h.g(this.stockIdentifier, h.g(this.orderId, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.orderId;
        String str3 = this.stockIdentifier;
        float f10 = this.quantity;
        long j10 = this.entryDate;
        long j11 = this.executionDate;
        double d10 = this.orderPrice;
        double d11 = this.total;
        String str4 = this.orderStatus;
        String str5 = this.cancelReason;
        String str6 = this.tradeType;
        String str7 = this.orderType;
        double d12 = this.lastTradePrice;
        ChangeDto changeDto = this.change;
        String str8 = this.imageUrl;
        String str9 = this.bidPrice;
        String str10 = this.askPrice;
        String str11 = this.transactionType;
        StringBuilder l10 = e.l("Bought(name=", str, ", orderId=", str2, ", stockIdentifier=");
        l10.append(str3);
        l10.append(", quantity=");
        l10.append(f10);
        l10.append(", entryDate=");
        l10.append(j10);
        l10.append(", executionDate=");
        l10.append(j11);
        l10.append(", orderPrice=");
        l10.append(d10);
        a.v(l10, ", total=", d11, ", orderStatus=");
        e.v(l10, str4, ", cancelReason=", str5, ", tradeType=");
        e.v(l10, str6, ", orderType=", str7, ", lastTradePrice=");
        l10.append(d12);
        l10.append(", change=");
        l10.append(changeDto);
        e.v(l10, ", imageUrl=", str8, ", bidPrice=", str9);
        e.v(l10, ", askPrice=", str10, ", transactionType=", str11);
        l10.append(")");
        return l10.toString();
    }
}
