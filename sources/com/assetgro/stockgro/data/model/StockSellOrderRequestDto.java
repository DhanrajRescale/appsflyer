package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockSellOrderRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "executionPrice", HttpUrl.FRAGMENT_ENCODE_SET, "transactionType", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getExecutionPrice", "()D", "getOrderType", "()Ljava/lang/String;", "getPortfolioId", "getQuantity", "()I", "getTransactionType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockSellOrderRequestDto {
    public static final int $stable = 0;

    @SerializedName("entry_price")
    private final double executionPrice;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("transaction_type")
    private final String transactionType;

    public StockSellOrderRequestDto(int i10, @NotNull String portfolioId, @NotNull String orderType, double d10, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.quantity = i10;
        this.portfolioId = portfolioId;
        this.orderType = orderType;
        this.executionPrice = d10;
        this.transactionType = str;
    }

    public static /* synthetic */ StockSellOrderRequestDto copy$default(StockSellOrderRequestDto stockSellOrderRequestDto, int i10, String str, String str2, double d10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = stockSellOrderRequestDto.quantity;
        }
        if ((i11 & 2) != 0) {
            str = stockSellOrderRequestDto.portfolioId;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = stockSellOrderRequestDto.orderType;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            d10 = stockSellOrderRequestDto.executionPrice;
        }
        double d11 = d10;
        if ((i11 & 16) != 0) {
            str3 = stockSellOrderRequestDto.transactionType;
        }
        return stockSellOrderRequestDto.copy(i10, str4, str5, d11, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component4, reason: from getter */
    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    public final StockSellOrderRequestDto copy(int quantity, @NotNull String portfolioId, @NotNull String orderType, double executionPrice, String transactionType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new StockSellOrderRequestDto(quantity, portfolioId, orderType, executionPrice, transactionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockSellOrderRequestDto)) {
            return false;
        }
        StockSellOrderRequestDto stockSellOrderRequestDto = (StockSellOrderRequestDto) other;
        return this.quantity == stockSellOrderRequestDto.quantity && Intrinsics.a(this.portfolioId, stockSellOrderRequestDto.portfolioId) && Intrinsics.a(this.orderType, stockSellOrderRequestDto.orderType) && Double.compare(this.executionPrice, stockSellOrderRequestDto.executionPrice) == 0 && Intrinsics.a(this.transactionType, stockSellOrderRequestDto.transactionType);
    }

    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        int hashCode;
        int c10 = d.c(this.executionPrice, h.g(this.orderType, h.g(this.portfolioId, Integer.hashCode(this.quantity) * 31, 31), 31), 31);
        String str = this.transactionType;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c10 + hashCode;
    }

    @NotNull
    public String toString() {
        int i10 = this.quantity;
        String str = this.portfolioId;
        String str2 = this.orderType;
        double d10 = this.executionPrice;
        String str3 = this.transactionType;
        StringBuilder sb2 = new StringBuilder("StockSellOrderRequestDto(quantity=");
        sb2.append(i10);
        sb2.append(", portfolioId=");
        sb2.append(str);
        sb2.append(", orderType=");
        sb2.append(str2);
        sb2.append(", executionPrice=");
        sb2.append(d10);
        return e.j(sb2, ", transactionType=", str3, ")");
    }
}
