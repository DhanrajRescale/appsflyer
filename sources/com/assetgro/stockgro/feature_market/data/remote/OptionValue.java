package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0002\u0010\u001cJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003Jù\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u0003HÆ\u0001J\t\u0010M\u001a\u00020NHÖ\u0001J\u0013\u0010O\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020NHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020NHÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0016\u0010\u001a\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001e¨\u0006Y"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionValue;", "Landroid/os/Parcelable;", "sector", HttpUrl.FRAGMENT_ENCODE_SET, "lotSize", "noOfLots", "margin", "parentSymbol", "realizedPnl", "optionType", "unrealizedPnl", "contractSym", "totalProfitPercentage", "netPnl", "isPnlPositive", HttpUrl.FRAGMENT_ENCODE_SET, "totalQuantity", "contractName", "marginPrice", "optionName", "unrealizedProfitPercentage", "openPos", "ltp", "averagePriceSide1", "openPosPurchaseValue", "isLong", "isShort", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAveragePriceSide1", "()Ljava/lang/String;", "getContractName", "getContractSym", "getImageUrl", "()Z", "getLotSize", "getLtp", "getMargin", "getMarginPrice", "getNetPnl", "getNoOfLots", "getOpenPos", "getOpenPosPurchaseValue", "getOptionName", "getOptionType", "getParentSymbol", "getRealizedPnl", "getSector", "getTotalProfitPercentage", "getTotalQuantity", "getUnrealizedPnl", "getUnrealizedProfitPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionValue implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionValue> CREATOR = new Creator();

    @SerializedName("average_price_side_1")
    @NotNull
    private final String averagePriceSide1;

    @SerializedName("contract_name")
    @NotNull
    private final String contractName;

    @SerializedName("contract_sym")
    @NotNull
    private final String contractSym;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("is_long")
    private final boolean isLong;

    @SerializedName("is_pnl_positive")
    private final boolean isPnlPositive;

    @SerializedName("is_short")
    private final boolean isShort;

    @SerializedName("lot_size")
    @NotNull
    private final String lotSize;

    @SerializedName("ltp")
    @NotNull
    private final String ltp;

    @SerializedName("margin")
    @NotNull
    private final String margin;

    @SerializedName("margin_price")
    @NotNull
    private final String marginPrice;

    @SerializedName("net_pnl")
    @NotNull
    private final String netPnl;

    @SerializedName("no_of_lots")
    @NotNull
    private final String noOfLots;

    @SerializedName("open_pos")
    @NotNull
    private final String openPos;

    @SerializedName("open_pos_purchase_value")
    @NotNull
    private final String openPosPurchaseValue;

    @SerializedName("option_name")
    @NotNull
    private final String optionName;

    @SerializedName("option_type")
    @NotNull
    private final String optionType;

    @SerializedName("parent_symbol")
    @NotNull
    private final String parentSymbol;

    @SerializedName("realized_pnl")
    @NotNull
    private final String realizedPnl;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    @SerializedName("total_profit_percentage")
    @NotNull
    private final String totalProfitPercentage;

    @SerializedName("total_quantity")
    @NotNull
    private final String totalQuantity;

    @SerializedName("unrealized_pnl")
    @NotNull
    private final String unrealizedPnl;

    @SerializedName("unrealized_profit_percentage")
    @NotNull
    private final String unrealizedProfitPercentage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionValue createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionValue[] newArray(int i10) {
            return new OptionValue[i10];
        }
    }

    public OptionValue(@NotNull String sector, @NotNull String lotSize, @NotNull String noOfLots, @NotNull String margin, @NotNull String parentSymbol, @NotNull String realizedPnl, @NotNull String optionType, @NotNull String unrealizedPnl, @NotNull String contractSym, @NotNull String totalProfitPercentage, @NotNull String netPnl, boolean z10, @NotNull String totalQuantity, @NotNull String contractName, @NotNull String marginPrice, @NotNull String optionName, @NotNull String unrealizedProfitPercentage, @NotNull String openPos, @NotNull String ltp, @NotNull String averagePriceSide1, @NotNull String openPosPurchaseValue, boolean z11, boolean z12, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        Intrinsics.checkNotNullParameter(noOfLots, "noOfLots");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(parentSymbol, "parentSymbol");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(unrealizedPnl, "unrealizedPnl");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(totalProfitPercentage, "totalProfitPercentage");
        Intrinsics.checkNotNullParameter(netPnl, "netPnl");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(marginPrice, "marginPrice");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        Intrinsics.checkNotNullParameter(unrealizedProfitPercentage, "unrealizedProfitPercentage");
        Intrinsics.checkNotNullParameter(openPos, "openPos");
        Intrinsics.checkNotNullParameter(ltp, "ltp");
        Intrinsics.checkNotNullParameter(averagePriceSide1, "averagePriceSide1");
        Intrinsics.checkNotNullParameter(openPosPurchaseValue, "openPosPurchaseValue");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.sector = sector;
        this.lotSize = lotSize;
        this.noOfLots = noOfLots;
        this.margin = margin;
        this.parentSymbol = parentSymbol;
        this.realizedPnl = realizedPnl;
        this.optionType = optionType;
        this.unrealizedPnl = unrealizedPnl;
        this.contractSym = contractSym;
        this.totalProfitPercentage = totalProfitPercentage;
        this.netPnl = netPnl;
        this.isPnlPositive = z10;
        this.totalQuantity = totalQuantity;
        this.contractName = contractName;
        this.marginPrice = marginPrice;
        this.optionName = optionName;
        this.unrealizedProfitPercentage = unrealizedProfitPercentage;
        this.openPos = openPos;
        this.ltp = ltp;
        this.averagePriceSide1 = averagePriceSide1;
        this.openPosPurchaseValue = openPosPurchaseValue;
        this.isLong = z11;
        this.isShort = z12;
        this.imageUrl = imageUrl;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getTotalProfitPercentage() {
        return this.totalProfitPercentage;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getNetPnl() {
        return this.netPnl;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsPnlPositive() {
        return this.isPnlPositive;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getMarginPrice() {
        return this.marginPrice;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getOptionName() {
        return this.optionName;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getOpenPos() {
        return this.openPos;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getLtp() {
        return this.ltp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getAveragePriceSide1() {
        return this.averagePriceSide1;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getOpenPosPurchaseValue() {
        return this.openPosPurchaseValue;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsLong() {
        return this.isLong;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsShort() {
        return this.isShort;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMargin() {
        return this.margin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getParentSymbol() {
        return this.parentSymbol;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getContractSym() {
        return this.contractSym;
    }

    @NotNull
    public final OptionValue copy(@NotNull String sector, @NotNull String lotSize, @NotNull String noOfLots, @NotNull String margin, @NotNull String parentSymbol, @NotNull String realizedPnl, @NotNull String optionType, @NotNull String unrealizedPnl, @NotNull String contractSym, @NotNull String totalProfitPercentage, @NotNull String netPnl, boolean isPnlPositive, @NotNull String totalQuantity, @NotNull String contractName, @NotNull String marginPrice, @NotNull String optionName, @NotNull String unrealizedProfitPercentage, @NotNull String openPos, @NotNull String ltp, @NotNull String averagePriceSide1, @NotNull String openPosPurchaseValue, boolean isLong, boolean isShort, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        Intrinsics.checkNotNullParameter(noOfLots, "noOfLots");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(parentSymbol, "parentSymbol");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(unrealizedPnl, "unrealizedPnl");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(totalProfitPercentage, "totalProfitPercentage");
        Intrinsics.checkNotNullParameter(netPnl, "netPnl");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(marginPrice, "marginPrice");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        Intrinsics.checkNotNullParameter(unrealizedProfitPercentage, "unrealizedProfitPercentage");
        Intrinsics.checkNotNullParameter(openPos, "openPos");
        Intrinsics.checkNotNullParameter(ltp, "ltp");
        Intrinsics.checkNotNullParameter(averagePriceSide1, "averagePriceSide1");
        Intrinsics.checkNotNullParameter(openPosPurchaseValue, "openPosPurchaseValue");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new OptionValue(sector, lotSize, noOfLots, margin, parentSymbol, realizedPnl, optionType, unrealizedPnl, contractSym, totalProfitPercentage, netPnl, isPnlPositive, totalQuantity, contractName, marginPrice, optionName, unrealizedProfitPercentage, openPos, ltp, averagePriceSide1, openPosPurchaseValue, isLong, isShort, imageUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionValue)) {
            return false;
        }
        OptionValue optionValue = (OptionValue) other;
        return Intrinsics.a(this.sector, optionValue.sector) && Intrinsics.a(this.lotSize, optionValue.lotSize) && Intrinsics.a(this.noOfLots, optionValue.noOfLots) && Intrinsics.a(this.margin, optionValue.margin) && Intrinsics.a(this.parentSymbol, optionValue.parentSymbol) && Intrinsics.a(this.realizedPnl, optionValue.realizedPnl) && Intrinsics.a(this.optionType, optionValue.optionType) && Intrinsics.a(this.unrealizedPnl, optionValue.unrealizedPnl) && Intrinsics.a(this.contractSym, optionValue.contractSym) && Intrinsics.a(this.totalProfitPercentage, optionValue.totalProfitPercentage) && Intrinsics.a(this.netPnl, optionValue.netPnl) && this.isPnlPositive == optionValue.isPnlPositive && Intrinsics.a(this.totalQuantity, optionValue.totalQuantity) && Intrinsics.a(this.contractName, optionValue.contractName) && Intrinsics.a(this.marginPrice, optionValue.marginPrice) && Intrinsics.a(this.optionName, optionValue.optionName) && Intrinsics.a(this.unrealizedProfitPercentage, optionValue.unrealizedProfitPercentage) && Intrinsics.a(this.openPos, optionValue.openPos) && Intrinsics.a(this.ltp, optionValue.ltp) && Intrinsics.a(this.averagePriceSide1, optionValue.averagePriceSide1) && Intrinsics.a(this.openPosPurchaseValue, optionValue.openPosPurchaseValue) && this.isLong == optionValue.isLong && this.isShort == optionValue.isShort && Intrinsics.a(this.imageUrl, optionValue.imageUrl);
    }

    @NotNull
    public final String getAveragePriceSide1() {
        return this.averagePriceSide1;
    }

    @NotNull
    public final String getContractName() {
        return this.contractName;
    }

    @NotNull
    public final String getContractSym() {
        return this.contractSym;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    public final String getLtp() {
        return this.ltp;
    }

    @NotNull
    public final String getMargin() {
        return this.margin;
    }

    @NotNull
    public final String getMarginPrice() {
        return this.marginPrice;
    }

    @NotNull
    public final String getNetPnl() {
        return this.netPnl;
    }

    @NotNull
    public final String getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    public final String getOpenPos() {
        return this.openPos;
    }

    @NotNull
    public final String getOpenPosPurchaseValue() {
        return this.openPosPurchaseValue;
    }

    @NotNull
    public final String getOptionName() {
        return this.optionName;
    }

    @NotNull
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    public final String getParentSymbol() {
        return this.parentSymbol;
    }

    @NotNull
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    public final String getTotalProfitPercentage() {
        return this.totalProfitPercentage;
    }

    @NotNull
    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @NotNull
    public final String getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + e.d(this.isShort, e.d(this.isLong, h.g(this.openPosPurchaseValue, h.g(this.averagePriceSide1, h.g(this.ltp, h.g(this.openPos, h.g(this.unrealizedProfitPercentage, h.g(this.optionName, h.g(this.marginPrice, h.g(this.contractName, h.g(this.totalQuantity, e.d(this.isPnlPositive, h.g(this.netPnl, h.g(this.totalProfitPercentage, h.g(this.contractSym, h.g(this.unrealizedPnl, h.g(this.optionType, h.g(this.realizedPnl, h.g(this.parentSymbol, h.g(this.margin, h.g(this.noOfLots, h.g(this.lotSize, this.sector.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isLong() {
        return this.isLong;
    }

    public final boolean isPnlPositive() {
        return this.isPnlPositive;
    }

    public final boolean isShort() {
        return this.isShort;
    }

    @NotNull
    public String toString() {
        String str = this.sector;
        String str2 = this.lotSize;
        String str3 = this.noOfLots;
        String str4 = this.margin;
        String str5 = this.parentSymbol;
        String str6 = this.realizedPnl;
        String str7 = this.optionType;
        String str8 = this.unrealizedPnl;
        String str9 = this.contractSym;
        String str10 = this.totalProfitPercentage;
        String str11 = this.netPnl;
        boolean z10 = this.isPnlPositive;
        String str12 = this.totalQuantity;
        String str13 = this.contractName;
        String str14 = this.marginPrice;
        String str15 = this.optionName;
        String str16 = this.unrealizedProfitPercentage;
        String str17 = this.openPos;
        String str18 = this.ltp;
        String str19 = this.averagePriceSide1;
        String str20 = this.openPosPurchaseValue;
        boolean z11 = this.isLong;
        boolean z12 = this.isShort;
        String str21 = this.imageUrl;
        StringBuilder l10 = e.l("OptionValue(sector=", str, ", lotSize=", str2, ", noOfLots=");
        e.v(l10, str3, ", margin=", str4, ", parentSymbol=");
        e.v(l10, str5, ", realizedPnl=", str6, ", optionType=");
        e.v(l10, str7, ", unrealizedPnl=", str8, ", contractSym=");
        e.v(l10, str9, ", totalProfitPercentage=", str10, ", netPnl=");
        l10.append(str11);
        l10.append(", isPnlPositive=");
        l10.append(z10);
        l10.append(", totalQuantity=");
        e.v(l10, str12, ", contractName=", str13, ", marginPrice=");
        e.v(l10, str14, ", optionName=", str15, ", unrealizedProfitPercentage=");
        e.v(l10, str16, ", openPos=", str17, ", ltp=");
        e.v(l10, str18, ", averagePriceSide1=", str19, ", openPosPurchaseValue=");
        l10.append(str20);
        l10.append(", isLong=");
        l10.append(z11);
        l10.append(", isShort=");
        l10.append(z12);
        l10.append(", imageUrl=");
        l10.append(str21);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.sector);
        parcel.writeString(this.lotSize);
        parcel.writeString(this.noOfLots);
        parcel.writeString(this.margin);
        parcel.writeString(this.parentSymbol);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.optionType);
        parcel.writeString(this.unrealizedPnl);
        parcel.writeString(this.contractSym);
        parcel.writeString(this.totalProfitPercentage);
        parcel.writeString(this.netPnl);
        parcel.writeInt(this.isPnlPositive ? 1 : 0);
        parcel.writeString(this.totalQuantity);
        parcel.writeString(this.contractName);
        parcel.writeString(this.marginPrice);
        parcel.writeString(this.optionName);
        parcel.writeString(this.unrealizedProfitPercentage);
        parcel.writeString(this.openPos);
        parcel.writeString(this.ltp);
        parcel.writeString(this.averagePriceSide1);
        parcel.writeString(this.openPosPurchaseValue);
        parcel.writeInt(this.isLong ? 1 : 0);
        parcel.writeInt(this.isShort ? 1 : 0);
        parcel.writeString(this.imageUrl);
    }
}
