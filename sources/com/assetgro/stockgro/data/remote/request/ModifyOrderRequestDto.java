package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006-"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ModifyOrderRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.ORDER_ID_CAMEL, "purchaseType", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "stopLoss", HttpUrl.FRAGMENT_ENCODE_SET, "bookProfit", "executionPrice", "parentOrderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getBookProfit", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getExecutionPrice", "getOrderId", "()Ljava/lang/String;", "getOrderType", "getParentOrderType", "getPortfolioId", "getPurchaseType", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStopLoss", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lcom/assetgro/stockgro/data/remote/request/ModifyOrderRequestDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ModifyOrderRequestDto {
    public static final int $stable = 0;

    @SerializedName("book_profit")
    private final Float bookProfit;

    @SerializedName("entry_price")
    private final Float executionPrice;

    @SerializedName(PaymentConstants.ORDER_ID)
    private final String orderId;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("parent_order_type")
    private final String parentOrderType;

    @SerializedName("portfolio_id")
    private final String portfolioId;

    @SerializedName("transaction_type")
    private final String purchaseType;

    @SerializedName("quantity")
    private final Integer quantity;

    @SerializedName("stop_loss")
    private final Float stopLoss;

    public ModifyOrderRequestDto(String str, String str2, String str3, Integer num, String str4, Float f10, Float f11, Float f12, String str5) {
        this.portfolioId = str;
        this.orderId = str2;
        this.purchaseType = str3;
        this.quantity = num;
        this.orderType = str4;
        this.stopLoss = f10;
        this.bookProfit = f11;
        this.executionPrice = f12;
        this.parentOrderType = str5;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPurchaseType() {
        return this.purchaseType;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getStopLoss() {
        return this.stopLoss;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getBookProfit() {
        return this.bookProfit;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component9, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    @NotNull
    public final ModifyOrderRequestDto copy(String portfolioId, String orderId, String purchaseType, Integer quantity, String orderType, Float stopLoss, Float bookProfit, Float executionPrice, String parentOrderType) {
        return new ModifyOrderRequestDto(portfolioId, orderId, purchaseType, quantity, orderType, stopLoss, bookProfit, executionPrice, parentOrderType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifyOrderRequestDto)) {
            return false;
        }
        ModifyOrderRequestDto modifyOrderRequestDto = (ModifyOrderRequestDto) other;
        return Intrinsics.a(this.portfolioId, modifyOrderRequestDto.portfolioId) && Intrinsics.a(this.orderId, modifyOrderRequestDto.orderId) && Intrinsics.a(this.purchaseType, modifyOrderRequestDto.purchaseType) && Intrinsics.a(this.quantity, modifyOrderRequestDto.quantity) && Intrinsics.a(this.orderType, modifyOrderRequestDto.orderType) && Intrinsics.a(this.stopLoss, modifyOrderRequestDto.stopLoss) && Intrinsics.a(this.bookProfit, modifyOrderRequestDto.bookProfit) && Intrinsics.a(this.executionPrice, modifyOrderRequestDto.executionPrice) && Intrinsics.a(this.parentOrderType, modifyOrderRequestDto.parentOrderType);
    }

    public final Float getBookProfit() {
        return this.bookProfit;
    }

    public final Float getExecutionPrice() {
        return this.executionPrice;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final String getPurchaseType() {
        return this.purchaseType;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Float getStopLoss() {
        return this.stopLoss;
    }

    public int hashCode() {
        String str = this.portfolioId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchaseType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.orderType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.stopLoss;
        int hashCode6 = (hashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.bookProfit;
        int hashCode7 = (hashCode6 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.executionPrice;
        int hashCode8 = (hashCode7 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str5 = this.parentOrderType;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.portfolioId;
        String str2 = this.orderId;
        String str3 = this.purchaseType;
        Integer num = this.quantity;
        String str4 = this.orderType;
        Float f10 = this.stopLoss;
        Float f11 = this.bookProfit;
        Float f12 = this.executionPrice;
        String str5 = this.parentOrderType;
        StringBuilder l10 = e.l("ModifyOrderRequestDto(portfolioId=", str, ", orderId=", str2, ", purchaseType=");
        l10.append(str3);
        l10.append(", quantity=");
        l10.append(num);
        l10.append(", orderType=");
        l10.append(str4);
        l10.append(", stopLoss=");
        l10.append(f10);
        l10.append(", bookProfit=");
        l10.append(f11);
        l10.append(", executionPrice=");
        l10.append(f12);
        l10.append(", parentOrderType=");
        return d.o(l10, str5, ")");
    }
}
