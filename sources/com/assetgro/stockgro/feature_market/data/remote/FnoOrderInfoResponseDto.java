package com.assetgro.stockgro.feature_market.data.remote;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import da.e;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0016HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0014HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003JÎ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\nHÖ\u0001J\t\u0010R\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010)R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!¨\u0006S"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/FnoOrderInfoResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "identifierInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;", "contractSym", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "entryDate", HttpUrl.FRAGMENT_ENCODE_SET, "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "isChildExecuted", HttpUrl.FRAGMENT_ENCODE_SET, "noOfLots", "parentOrderType", PaymentConstants.ORDER_ID_CAMEL, "change", "Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "transactionType", "margin", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioInfo;", "marginPrice", "ltp", "optionType", "contractName", "entryPrice", "status", "(Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;JIZILjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Change;Ljava/lang/String;DLcom/assetgro/stockgro/feature_market/data/remote/PortfolioInfo;Ljava/lang/Double;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getChange", "()Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "getContractName", "()Ljava/lang/String;", "getContractSym", "getEntryDate", "()J", "getEntryPrice", "()D", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;", "()Z", "getLotSize", "()I", "getLtp", "getMargin", "getMarginPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNoOfLots", "getOptionType", "getOrderId", "getOrderType", "getParentOrderType", "getPortfolioInfo", "()Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioInfo;", "getStatus", "getTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;Ljava/lang/String;Ljava/lang/String;JIZILjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Change;Ljava/lang/String;DLcom/assetgro/stockgro/feature_market/data/remote/PortfolioInfo;Ljava/lang/Double;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/assetgro/stockgro/feature_market/data/remote/FnoOrderInfoResponseDto;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FnoOrderInfoResponseDto {
    public static final int $stable = 8;

    @SerializedName("change")
    @NotNull
    private final Change change;

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

    @SerializedName("identifier_info")
    @NotNull
    private final IdentifierInfo identifierInfo;

    @SerializedName("is_child_executed")
    private final boolean isChildExecuted;

    @SerializedName("lot_size")
    private final int lotSize;

    @SerializedName("ltp")
    private final double ltp;

    @SerializedName("margin")
    private final double margin;

    @SerializedName("margin_price")
    private final Double marginPrice;

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

    @SerializedName("portfolio_info")
    @NotNull
    private final PortfolioInfo portfolioInfo;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("transaction_type")
    @NotNull
    private final String transactionType;

    public FnoOrderInfoResponseDto(@NotNull IdentifierInfo identifierInfo, @NotNull String contractSym, @NotNull String orderType, long j10, int i10, boolean z10, int i11, @NotNull String parentOrderType, @NotNull String orderId, @NotNull Change change, @NotNull String transactionType, double d10, @NotNull PortfolioInfo portfolioInfo, Double d11, double d12, @NotNull String optionType, @NotNull String contractName, double d13, @NotNull String status) {
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(parentOrderType, "parentOrderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.identifierInfo = identifierInfo;
        this.contractSym = contractSym;
        this.orderType = orderType;
        this.entryDate = j10;
        this.lotSize = i10;
        this.isChildExecuted = z10;
        this.noOfLots = i11;
        this.parentOrderType = parentOrderType;
        this.orderId = orderId;
        this.change = change;
        this.transactionType = transactionType;
        this.margin = d10;
        this.portfolioInfo = portfolioInfo;
        this.marginPrice = d11;
        this.ltp = d12;
        this.optionType = optionType;
        this.contractName = contractName;
        this.entryPrice = d13;
        this.status = status;
    }

    public static /* synthetic */ FnoOrderInfoResponseDto copy$default(FnoOrderInfoResponseDto fnoOrderInfoResponseDto, IdentifierInfo identifierInfo, String str, String str2, long j10, int i10, boolean z10, int i11, String str3, String str4, Change change, String str5, double d10, PortfolioInfo portfolioInfo, Double d11, double d12, String str6, String str7, double d13, String str8, int i12, Object obj) {
        IdentifierInfo identifierInfo2 = (i12 & 1) != 0 ? fnoOrderInfoResponseDto.identifierInfo : identifierInfo;
        String str9 = (i12 & 2) != 0 ? fnoOrderInfoResponseDto.contractSym : str;
        String str10 = (i12 & 4) != 0 ? fnoOrderInfoResponseDto.orderType : str2;
        long j11 = (i12 & 8) != 0 ? fnoOrderInfoResponseDto.entryDate : j10;
        int i13 = (i12 & 16) != 0 ? fnoOrderInfoResponseDto.lotSize : i10;
        boolean z11 = (i12 & 32) != 0 ? fnoOrderInfoResponseDto.isChildExecuted : z10;
        int i14 = (i12 & 64) != 0 ? fnoOrderInfoResponseDto.noOfLots : i11;
        String str11 = (i12 & 128) != 0 ? fnoOrderInfoResponseDto.parentOrderType : str3;
        String str12 = (i12 & 256) != 0 ? fnoOrderInfoResponseDto.orderId : str4;
        Change change2 = (i12 & 512) != 0 ? fnoOrderInfoResponseDto.change : change;
        String str13 = (i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? fnoOrderInfoResponseDto.transactionType : str5;
        double d14 = (i12 & 2048) != 0 ? fnoOrderInfoResponseDto.margin : d10;
        PortfolioInfo portfolioInfo2 = (i12 & 4096) != 0 ? fnoOrderInfoResponseDto.portfolioInfo : portfolioInfo;
        return fnoOrderInfoResponseDto.copy(identifierInfo2, str9, str10, j11, i13, z11, i14, str11, str12, change2, str13, d14, portfolioInfo2, (i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? fnoOrderInfoResponseDto.marginPrice : d11, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? fnoOrderInfoResponseDto.ltp : d12, (i12 & 32768) != 0 ? fnoOrderInfoResponseDto.optionType : str6, (65536 & i12) != 0 ? fnoOrderInfoResponseDto.contractName : str7, (i12 & 131072) != 0 ? fnoOrderInfoResponseDto.entryPrice : d13, (i12 & 262144) != 0 ? fnoOrderInfoResponseDto.status : str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Change getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component12, reason: from getter */
    public final double getMargin() {
        return this.margin;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final PortfolioInfo getPortfolioInfo() {
        return this.portfolioInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final Double getMarginPrice() {
        return this.marginPrice;
    }

    /* renamed from: component15, reason: from getter */
    public final double getLtp() {
        return this.ltp;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    /* renamed from: component18, reason: from getter */
    public final double getEntryPrice() {
        return this.entryPrice;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getStatus() {
        return this.status;
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
    public final long getEntryDate() {
        return this.entryDate;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsChildExecuted() {
        return this.isChildExecuted;
    }

    /* renamed from: component7, reason: from getter */
    public final int getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final FnoOrderInfoResponseDto copy(@NotNull IdentifierInfo identifierInfo, @NotNull String contractSym, @NotNull String orderType, long entryDate, int lotSize, boolean isChildExecuted, int noOfLots, @NotNull String parentOrderType, @NotNull String orderId, @NotNull Change change, @NotNull String transactionType, double margin, @NotNull PortfolioInfo portfolioInfo, Double marginPrice, double ltp, @NotNull String optionType, @NotNull String contractName, double entryPrice, @NotNull String status) {
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(parentOrderType, "parentOrderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new FnoOrderInfoResponseDto(identifierInfo, contractSym, orderType, entryDate, lotSize, isChildExecuted, noOfLots, parentOrderType, orderId, change, transactionType, margin, portfolioInfo, marginPrice, ltp, optionType, contractName, entryPrice, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FnoOrderInfoResponseDto)) {
            return false;
        }
        FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) other;
        return Intrinsics.a(this.identifierInfo, fnoOrderInfoResponseDto.identifierInfo) && Intrinsics.a(this.contractSym, fnoOrderInfoResponseDto.contractSym) && Intrinsics.a(this.orderType, fnoOrderInfoResponseDto.orderType) && this.entryDate == fnoOrderInfoResponseDto.entryDate && this.lotSize == fnoOrderInfoResponseDto.lotSize && this.isChildExecuted == fnoOrderInfoResponseDto.isChildExecuted && this.noOfLots == fnoOrderInfoResponseDto.noOfLots && Intrinsics.a(this.parentOrderType, fnoOrderInfoResponseDto.parentOrderType) && Intrinsics.a(this.orderId, fnoOrderInfoResponseDto.orderId) && Intrinsics.a(this.change, fnoOrderInfoResponseDto.change) && Intrinsics.a(this.transactionType, fnoOrderInfoResponseDto.transactionType) && Double.compare(this.margin, fnoOrderInfoResponseDto.margin) == 0 && Intrinsics.a(this.portfolioInfo, fnoOrderInfoResponseDto.portfolioInfo) && Intrinsics.a(this.marginPrice, fnoOrderInfoResponseDto.marginPrice) && Double.compare(this.ltp, fnoOrderInfoResponseDto.ltp) == 0 && Intrinsics.a(this.optionType, fnoOrderInfoResponseDto.optionType) && Intrinsics.a(this.contractName, fnoOrderInfoResponseDto.contractName) && Double.compare(this.entryPrice, fnoOrderInfoResponseDto.entryPrice) == 0 && Intrinsics.a(this.status, fnoOrderInfoResponseDto.status);
    }

    @NotNull
    public final Change getChange() {
        return this.change;
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

    @NotNull
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    public final double getLtp() {
        return this.ltp;
    }

    public final double getMargin() {
        return this.margin;
    }

    public final Double getMarginPrice() {
        return this.marginPrice;
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
    public final PortfolioInfo getPortfolioInfo() {
        return this.portfolioInfo;
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
        int hashCode2 = (this.portfolioInfo.hashCode() + d.c(this.margin, h.g(this.transactionType, (this.change.hashCode() + h.g(this.orderId, h.g(this.parentOrderType, e.f(this.noOfLots, v.e.d(this.isChildExecuted, e.f(this.lotSize, v.e.c(this.entryDate, h.g(this.orderType, h.g(this.contractSym, this.identifierInfo.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31)) * 31;
        Double d10 = this.marginPrice;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        return this.status.hashCode() + d.c(this.entryPrice, h.g(this.contractName, h.g(this.optionType, d.c(this.ltp, (hashCode2 + hashCode) * 31, 31), 31), 31), 31);
    }

    public final boolean isChildExecuted() {
        return this.isChildExecuted;
    }

    @NotNull
    public String toString() {
        return "FnoOrderInfoResponseDto(identifierInfo=" + this.identifierInfo + ", contractSym=" + this.contractSym + ", orderType=" + this.orderType + ", entryDate=" + this.entryDate + ", lotSize=" + this.lotSize + ", isChildExecuted=" + this.isChildExecuted + ", noOfLots=" + this.noOfLots + ", parentOrderType=" + this.parentOrderType + ", orderId=" + this.orderId + ", change=" + this.change + ", transactionType=" + this.transactionType + ", margin=" + this.margin + ", portfolioInfo=" + this.portfolioInfo + ", marginPrice=" + this.marginPrice + ", ltp=" + this.ltp + ", optionType=" + this.optionType + ", contractName=" + this.contractName + ", entryPrice=" + this.entryPrice + ", status=" + this.status + ")";
    }
}
