package com.assetgro.stockgro.ui.portfolio.history.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0016HÆ\u0003J\t\u0010;\u001a\u00020\u0016HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003JÆ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\nHÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010)R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f¨\u0006L"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioHistoryFnoDataItem;", HttpUrl.FRAGMENT_ENCODE_SET, "identifierInfo", "Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;", "contractSym", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "isChildExecuted", HttpUrl.FRAGMENT_ENCODE_SET, "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "noOfLots", "parentOrderType", PaymentConstants.ORDER_ID_CAMEL, "transactionType", "margin", HttpUrl.FRAGMENT_ENCODE_SET, "executionPrice", "entryPrice", "optionType", "contractName", "executionDate", HttpUrl.FRAGMENT_ENCODE_SET, "entryDate", "status", "bookProfitPercentage", "(Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Double;)V", "getBookProfitPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getContractName", "()Ljava/lang/String;", "getContractSym", "getEntryDate", "()J", "getEntryPrice", "()D", "getExecutionDate", "getExecutionPrice", "getIdentifierInfo", "()Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;", "()Z", "getLotSize", "()I", "getMargin", "getNoOfLots", "getOptionType", "getOrderId", "getOrderType", "getParentOrderType", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/assetgro/stockgro/ui/portfolio/history/model/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Double;)Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioHistoryFnoDataItem;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioHistoryFnoDataItem {
    public static final int $stable = 0;

    @SerializedName("book_profit_percentage")
    private final Double bookProfitPercentage;

    @SerializedName("contract_name")
    @NotNull
    private final String contractName;

    @SerializedName("contract_sym")
    @NotNull
    private final String contractSym;

    @SerializedName("entry_date")
    private final long entryDate;

    @SerializedName("entry_price")
    private final double entryPrice;

    @SerializedName("execution_date")
    private final long executionDate;

    @SerializedName("execution_price")
    private final double executionPrice;

    @SerializedName("identifier_info")
    private final IdentifierInfo identifierInfo;

    @SerializedName("is_child_executed")
    private final boolean isChildExecuted;

    @SerializedName("lot_size")
    private final int lotSize;

    @SerializedName("margin")
    private final double margin;

    @SerializedName("no_of_lots")
    private final int noOfLots;

    @SerializedName("option_type")
    @NotNull
    private final String optionType;

    @SerializedName(PaymentConstants.ORDER_ID)
    @NotNull
    private final String orderId;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("parent_order_type")
    @NotNull
    private final String parentOrderType;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("transaction_type")
    @NotNull
    private final String transactionType;

    public PortfolioHistoryFnoDataItem(IdentifierInfo identifierInfo, @NotNull String contractSym, @NotNull String orderType, boolean z10, int i10, int i11, @NotNull String parentOrderType, @NotNull String orderId, @NotNull String transactionType, double d10, double d11, double d12, @NotNull String optionType, @NotNull String contractName, long j10, long j11, @NotNull String status, Double d13) {
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(parentOrderType, "parentOrderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.identifierInfo = identifierInfo;
        this.contractSym = contractSym;
        this.orderType = orderType;
        this.isChildExecuted = z10;
        this.lotSize = i10;
        this.noOfLots = i11;
        this.parentOrderType = parentOrderType;
        this.orderId = orderId;
        this.transactionType = transactionType;
        this.margin = d10;
        this.executionPrice = d11;
        this.entryPrice = d12;
        this.optionType = optionType;
        this.contractName = contractName;
        this.executionDate = j10;
        this.entryDate = j11;
        this.status = status;
        this.bookProfitPercentage = d13;
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final double getMargin() {
        return this.margin;
    }

    /* renamed from: component11, reason: from getter */
    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component12, reason: from getter */
    public final double getEntryPrice() {
        return this.entryPrice;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    /* renamed from: component15, reason: from getter */
    public final long getExecutionDate() {
        return this.executionDate;
    }

    /* renamed from: component16, reason: from getter */
    public final long getEntryDate() {
        return this.entryDate;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component18, reason: from getter */
    public final Double getBookProfitPercentage() {
        return this.bookProfitPercentage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContractSym() {
        return this.contractSym;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsChildExecuted() {
        return this.isChildExecuted;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    public final PortfolioHistoryFnoDataItem copy(IdentifierInfo identifierInfo, @NotNull String contractSym, @NotNull String orderType, boolean isChildExecuted, int lotSize, int noOfLots, @NotNull String parentOrderType, @NotNull String orderId, @NotNull String transactionType, double margin, double executionPrice, double entryPrice, @NotNull String optionType, @NotNull String contractName, long executionDate, long entryDate, @NotNull String status, Double bookProfitPercentage) {
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(parentOrderType, "parentOrderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PortfolioHistoryFnoDataItem(identifierInfo, contractSym, orderType, isChildExecuted, lotSize, noOfLots, parentOrderType, orderId, transactionType, margin, executionPrice, entryPrice, optionType, contractName, executionDate, entryDate, status, bookProfitPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioHistoryFnoDataItem)) {
            return false;
        }
        PortfolioHistoryFnoDataItem portfolioHistoryFnoDataItem = (PortfolioHistoryFnoDataItem) other;
        return Intrinsics.a(this.identifierInfo, portfolioHistoryFnoDataItem.identifierInfo) && Intrinsics.a(this.contractSym, portfolioHistoryFnoDataItem.contractSym) && Intrinsics.a(this.orderType, portfolioHistoryFnoDataItem.orderType) && this.isChildExecuted == portfolioHistoryFnoDataItem.isChildExecuted && this.lotSize == portfolioHistoryFnoDataItem.lotSize && this.noOfLots == portfolioHistoryFnoDataItem.noOfLots && Intrinsics.a(this.parentOrderType, portfolioHistoryFnoDataItem.parentOrderType) && Intrinsics.a(this.orderId, portfolioHistoryFnoDataItem.orderId) && Intrinsics.a(this.transactionType, portfolioHistoryFnoDataItem.transactionType) && Double.compare(this.margin, portfolioHistoryFnoDataItem.margin) == 0 && Double.compare(this.executionPrice, portfolioHistoryFnoDataItem.executionPrice) == 0 && Double.compare(this.entryPrice, portfolioHistoryFnoDataItem.entryPrice) == 0 && Intrinsics.a(this.optionType, portfolioHistoryFnoDataItem.optionType) && Intrinsics.a(this.contractName, portfolioHistoryFnoDataItem.contractName) && this.executionDate == portfolioHistoryFnoDataItem.executionDate && this.entryDate == portfolioHistoryFnoDataItem.entryDate && Intrinsics.a(this.status, portfolioHistoryFnoDataItem.status) && Intrinsics.a(this.bookProfitPercentage, portfolioHistoryFnoDataItem.bookProfitPercentage);
    }

    public final Double getBookProfitPercentage() {
        return this.bookProfitPercentage;
    }

    @NotNull
    public final String getContractName() {
        return this.contractName;
    }

    @NotNull
    public final String getContractSym() {
        return this.contractSym;
    }

    public final long getEntryDate() {
        return this.entryDate;
    }

    public final double getEntryPrice() {
        return this.entryPrice;
    }

    public final long getExecutionDate() {
        return this.executionDate;
    }

    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    public final double getMargin() {
        return this.margin;
    }

    public final int getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        int hashCode;
        IdentifierInfo identifierInfo = this.identifierInfo;
        int i10 = 0;
        if (identifierInfo == null) {
            hashCode = 0;
        } else {
            hashCode = identifierInfo.hashCode();
        }
        int g10 = h.g(this.status, e.c(this.entryDate, e.c(this.executionDate, h.g(this.contractName, h.g(this.optionType, d.c(this.entryPrice, d.c(this.executionPrice, d.c(this.margin, h.g(this.transactionType, h.g(this.orderId, h.g(this.parentOrderType, da.e.f(this.noOfLots, da.e.f(this.lotSize, e.d(this.isChildExecuted, h.g(this.orderType, h.g(this.contractSym, hashCode * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Double d10 = this.bookProfitPercentage;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return g10 + i10;
    }

    public final boolean isChildExecuted() {
        return this.isChildExecuted;
    }

    @NotNull
    public String toString() {
        IdentifierInfo identifierInfo = this.identifierInfo;
        String str = this.contractSym;
        String str2 = this.orderType;
        boolean z10 = this.isChildExecuted;
        int i10 = this.lotSize;
        int i11 = this.noOfLots;
        String str3 = this.parentOrderType;
        String str4 = this.orderId;
        String str5 = this.transactionType;
        double d10 = this.margin;
        double d11 = this.executionPrice;
        double d12 = this.entryPrice;
        String str6 = this.optionType;
        String str7 = this.contractName;
        long j10 = this.executionDate;
        long j11 = this.entryDate;
        String str8 = this.status;
        Double d13 = this.bookProfitPercentage;
        StringBuilder sb2 = new StringBuilder("PortfolioHistoryFnoDataItem(identifierInfo=");
        sb2.append(identifierInfo);
        sb2.append(", contractSym=");
        sb2.append(str);
        sb2.append(", orderType=");
        sb2.append(str2);
        sb2.append(", isChildExecuted=");
        sb2.append(z10);
        sb2.append(", lotSize=");
        h.v(sb2, i10, ", noOfLots=", i11, ", parentOrderType=");
        e.v(sb2, str3, ", orderId=", str4, ", transactionType=");
        sb2.append(str5);
        sb2.append(", margin=");
        sb2.append(d10);
        a.v(sb2, ", executionPrice=", d11, ", entryPrice=");
        sb2.append(d12);
        sb2.append(", optionType=");
        sb2.append(str6);
        sb2.append(", contractName=");
        sb2.append(str7);
        sb2.append(", executionDate=");
        sb2.append(j10);
        sb2.append(", entryDate=");
        sb2.append(j11);
        sb2.append(", status=");
        sb2.append(str8);
        sb2.append(", bookProfitPercentage=");
        sb2.append(d13);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ PortfolioHistoryFnoDataItem(IdentifierInfo identifierInfo, String str, String str2, boolean z10, int i10, int i11, String str3, String str4, String str5, double d10, double d11, double d12, String str6, String str7, long j10, long j11, String str8, Double d13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierInfo, str, str2, z10, i10, i11, str3, str4, str5, d10, d11, d12, str6, str7, j10, j11, str8, (i12 & 131072) != 0 ? null : d13);
    }
}
