package com.assetgro.stockgro.ui.portfolio.orders.model;

import com.assetgro.stockgro.feature_market.data.remote.Change;
import com.assetgro.stockgro.ui.portfolio.history.model.IdentifierInfo;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001dJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jþ\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\f2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\nHÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b)\u0010$R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u000b\u0010-R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b2\u0010'R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b3\u0010'R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b4\u0010'R\u001a\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b5\u00100R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!¨\u0006V"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/model/FnoOrderResponseData;", HttpUrl.FRAGMENT_ENCODE_SET, "identifierInfo", "Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;", "contractSym", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "entryDate", HttpUrl.FRAGMENT_ENCODE_SET, "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "isChildExecuted", HttpUrl.FRAGMENT_ENCODE_SET, "noOfLots", "parentOrderType", PaymentConstants.ORDER_ID_CAMEL, "change", "Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "transactionType", "margin", HttpUrl.FRAGMENT_ENCODE_SET, "marginPrice", "ltp", "optionType", "contractName", "entryPrice", "status", "executionPrice", "executionDate", "(Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Change;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "getChange", "()Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "getContractName", "()Ljava/lang/String;", "getContractSym", "getEntryDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEntryPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExecutionDate", "getExecutionPrice", "getIdentifierInfo", "()Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLotSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLtp", "getMargin", "getMarginPrice", "getNoOfLots", "getOptionType", "getOrderId", "getOrderType", "getParentOrderType", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Change;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)Lcom/assetgro/stockgro/ui/portfolio/orders/model/FnoOrderResponseData;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FnoOrderResponseData {
    public static final int $stable = 0;

    @SerializedName("change")
    private final Change change;

    @SerializedName("contract_name")
    private final String contractName;

    @SerializedName("contract_sym")
    private final String contractSym;

    @SerializedName("entry_date")
    private final Long entryDate;

    @SerializedName("entry_price")
    private final Double entryPrice;

    @SerializedName("execution_date")
    private final Long executionDate;

    @SerializedName("execution_price")
    private final Double executionPrice;

    @SerializedName("identifier_info")
    private final IdentifierInfo identifierInfo;

    @SerializedName("is_child_executed")
    private final Boolean isChildExecuted;

    @SerializedName("lot_size")
    private final Integer lotSize;

    @SerializedName("ltp")
    private final Double ltp;

    @SerializedName("margin")
    private final Double margin;

    @SerializedName("margin_price")
    private final Double marginPrice;

    @SerializedName("no_of_lots")
    private final Integer noOfLots;

    @SerializedName("option_type")
    private final String optionType;

    @SerializedName(PaymentConstants.ORDER_ID)
    private final String orderId;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("parent_order_type")
    private final String parentOrderType;

    @SerializedName("status")
    private final String status;

    @SerializedName("transaction_type")
    private final String transactionType;

    public FnoOrderResponseData(IdentifierInfo identifierInfo, String str, String str2, Long l10, Integer num, Boolean bool, Integer num2, String str3, String str4, Change change, String str5, Double d10, Double d11, Double d12, String str6, String str7, Double d13, String str8, Double d14, Long l11) {
        this.identifierInfo = identifierInfo;
        this.contractSym = str;
        this.orderType = str2;
        this.entryDate = l10;
        this.lotSize = num;
        this.isChildExecuted = bool;
        this.noOfLots = num2;
        this.parentOrderType = str3;
        this.orderId = str4;
        this.change = change;
        this.transactionType = str5;
        this.margin = d10;
        this.marginPrice = d11;
        this.ltp = d12;
        this.optionType = str6;
        this.contractName = str7;
        this.entryPrice = d13;
        this.status = str8;
        this.executionPrice = d14;
        this.executionDate = l11;
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final Change getChange() {
        return this.change;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getMargin() {
        return this.margin;
    }

    /* renamed from: component13, reason: from getter */
    public final Double getMarginPrice() {
        return this.marginPrice;
    }

    /* renamed from: component14, reason: from getter */
    public final Double getLtp() {
        return this.ltp;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    /* renamed from: component16, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    /* renamed from: component17, reason: from getter */
    public final Double getEntryPrice() {
        return this.entryPrice;
    }

    /* renamed from: component18, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component19, reason: from getter */
    public final Double getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContractSym() {
        return this.contractSym;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getExecutionDate() {
        return this.executionDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getEntryDate() {
        return this.entryDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getLotSize() {
        return this.lotSize;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsChildExecuted() {
        return this.isChildExecuted;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getNoOfLots() {
        return this.noOfLots;
    }

    /* renamed from: component8, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final FnoOrderResponseData copy(IdentifierInfo identifierInfo, String contractSym, String orderType, Long entryDate, Integer lotSize, Boolean isChildExecuted, Integer noOfLots, String parentOrderType, String orderId, Change change, String transactionType, Double margin, Double marginPrice, Double ltp, String optionType, String contractName, Double entryPrice, String status, Double executionPrice, Long executionDate) {
        return new FnoOrderResponseData(identifierInfo, contractSym, orderType, entryDate, lotSize, isChildExecuted, noOfLots, parentOrderType, orderId, change, transactionType, margin, marginPrice, ltp, optionType, contractName, entryPrice, status, executionPrice, executionDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FnoOrderResponseData)) {
            return false;
        }
        FnoOrderResponseData fnoOrderResponseData = (FnoOrderResponseData) other;
        return Intrinsics.a(this.identifierInfo, fnoOrderResponseData.identifierInfo) && Intrinsics.a(this.contractSym, fnoOrderResponseData.contractSym) && Intrinsics.a(this.orderType, fnoOrderResponseData.orderType) && Intrinsics.a(this.entryDate, fnoOrderResponseData.entryDate) && Intrinsics.a(this.lotSize, fnoOrderResponseData.lotSize) && Intrinsics.a(this.isChildExecuted, fnoOrderResponseData.isChildExecuted) && Intrinsics.a(this.noOfLots, fnoOrderResponseData.noOfLots) && Intrinsics.a(this.parentOrderType, fnoOrderResponseData.parentOrderType) && Intrinsics.a(this.orderId, fnoOrderResponseData.orderId) && Intrinsics.a(this.change, fnoOrderResponseData.change) && Intrinsics.a(this.transactionType, fnoOrderResponseData.transactionType) && Intrinsics.a(this.margin, fnoOrderResponseData.margin) && Intrinsics.a(this.marginPrice, fnoOrderResponseData.marginPrice) && Intrinsics.a(this.ltp, fnoOrderResponseData.ltp) && Intrinsics.a(this.optionType, fnoOrderResponseData.optionType) && Intrinsics.a(this.contractName, fnoOrderResponseData.contractName) && Intrinsics.a(this.entryPrice, fnoOrderResponseData.entryPrice) && Intrinsics.a(this.status, fnoOrderResponseData.status) && Intrinsics.a(this.executionPrice, fnoOrderResponseData.executionPrice) && Intrinsics.a(this.executionDate, fnoOrderResponseData.executionDate);
    }

    public final Change getChange() {
        return this.change;
    }

    public final String getContractName() {
        return this.contractName;
    }

    public final String getContractSym() {
        return this.contractSym;
    }

    public final Long getEntryDate() {
        return this.entryDate;
    }

    public final Double getEntryPrice() {
        return this.entryPrice;
    }

    public final Long getExecutionDate() {
        return this.executionDate;
    }

    public final Double getExecutionPrice() {
        return this.executionPrice;
    }

    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final Integer getLotSize() {
        return this.lotSize;
    }

    public final Double getLtp() {
        return this.ltp;
    }

    public final Double getMargin() {
        return this.margin;
    }

    public final Double getMarginPrice() {
        return this.marginPrice;
    }

    public final Integer getNoOfLots() {
        return this.noOfLots;
    }

    public final String getOptionType() {
        return this.optionType;
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

    public final String getStatus() {
        return this.status;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        IdentifierInfo identifierInfo = this.identifierInfo;
        int hashCode = (identifierInfo == null ? 0 : identifierInfo.hashCode()) * 31;
        String str = this.contractSym;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.entryDate;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.lotSize;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isChildExecuted;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.noOfLots;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.parentOrderType;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Change change = this.change;
        int hashCode10 = (hashCode9 + (change == null ? 0 : change.hashCode())) * 31;
        String str5 = this.transactionType;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d10 = this.margin;
        int hashCode12 = (hashCode11 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.marginPrice;
        int hashCode13 = (hashCode12 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.ltp;
        int hashCode14 = (hashCode13 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str6 = this.optionType;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contractName;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d13 = this.entryPrice;
        int hashCode17 = (hashCode16 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str8 = this.status;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d14 = this.executionPrice;
        int hashCode19 = (hashCode18 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l11 = this.executionDate;
        return hashCode19 + (l11 != null ? l11.hashCode() : 0);
    }

    public final Boolean isChildExecuted() {
        return this.isChildExecuted;
    }

    @NotNull
    public String toString() {
        IdentifierInfo identifierInfo = this.identifierInfo;
        String str = this.contractSym;
        String str2 = this.orderType;
        Long l10 = this.entryDate;
        Integer num = this.lotSize;
        Boolean bool = this.isChildExecuted;
        Integer num2 = this.noOfLots;
        String str3 = this.parentOrderType;
        String str4 = this.orderId;
        Change change = this.change;
        String str5 = this.transactionType;
        Double d10 = this.margin;
        Double d11 = this.marginPrice;
        Double d12 = this.ltp;
        String str6 = this.optionType;
        String str7 = this.contractName;
        Double d13 = this.entryPrice;
        String str8 = this.status;
        Double d14 = this.executionPrice;
        Long l11 = this.executionDate;
        StringBuilder sb2 = new StringBuilder("FnoOrderResponseData(identifierInfo=");
        sb2.append(identifierInfo);
        sb2.append(", contractSym=");
        sb2.append(str);
        sb2.append(", orderType=");
        sb2.append(str2);
        sb2.append(", entryDate=");
        sb2.append(l10);
        sb2.append(", lotSize=");
        sb2.append(num);
        sb2.append(", isChildExecuted=");
        sb2.append(bool);
        sb2.append(", noOfLots=");
        sb2.append(num2);
        sb2.append(", parentOrderType=");
        sb2.append(str3);
        sb2.append(", orderId=");
        sb2.append(str4);
        sb2.append(", change=");
        sb2.append(change);
        sb2.append(", transactionType=");
        sb2.append(str5);
        sb2.append(", margin=");
        sb2.append(d10);
        sb2.append(", marginPrice=");
        sb2.append(d11);
        sb2.append(", ltp=");
        sb2.append(d12);
        sb2.append(", optionType=");
        e.v(sb2, str6, ", contractName=", str7, ", entryPrice=");
        sb2.append(d13);
        sb2.append(", status=");
        sb2.append(str8);
        sb2.append(", executionPrice=");
        sb2.append(d14);
        sb2.append(", executionDate=");
        sb2.append(l11);
        sb2.append(")");
        return sb2.toString();
    }
}
