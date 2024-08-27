package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Jp\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010,J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000bHÖ\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013¨\u00068"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;", "Landroid/os/Parcelable;", PaymentConstants.ORDER_ID_CAMEL, HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", "stopLossPercentage", HttpUrl.FRAGMENT_ENCODE_SET, "contractSym", "bookProfitPercentage", "entryPrice", "noOfLots", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "isModel", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;Z)V", "getBookProfitPercentage", "()Ljava/lang/Double;", "setBookProfitPercentage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getContractSym", "()Ljava/lang/String;", "getEntryPrice", "()Z", "setModel", "(Z)V", "getNoOfLots", "()I", "getOrderId", "getOrderType", "getPortfolioId", "getStopLossPercentage", "setStopLossPercentage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;Z)Lcom/assetgro/stockgro/feature_market/data/remote/BuySellModifyFnoRequestDto;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BuySellModifyFnoRequestDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BuySellModifyFnoRequestDto> CREATOR = new Creator();

    @SerializedName("book_profit_percentage")
    private Double bookProfitPercentage;

    @SerializedName("contract_sym")
    @NotNull
    private final String contractSym;

    @SerializedName("entry_price")
    private final Double entryPrice;

    @SerializedName("is_model")
    private boolean isModel;

    @SerializedName("no_of_lots")
    private final int noOfLots;

    @SerializedName(PaymentConstants.ORDER_ID)
    private final String orderId;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("stop_loss_percentage")
    private Double stopLossPercentage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<BuySellModifyFnoRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BuySellModifyFnoRequestDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuySellModifyFnoRequestDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BuySellModifyFnoRequestDto[] newArray(int i10) {
            return new BuySellModifyFnoRequestDto[i10];
        }
    }

    public BuySellModifyFnoRequestDto(String str, @NotNull String portfolioId, Double d10, @NotNull String contractSym, Double d11, Double d12, int i10, @NotNull String orderType, boolean z10) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.orderId = str;
        this.portfolioId = portfolioId;
        this.stopLossPercentage = d10;
        this.contractSym = contractSym;
        this.bookProfitPercentage = d11;
        this.entryPrice = d12;
        this.noOfLots = i10;
        this.orderType = orderType;
        this.isModel = z10;
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getStopLossPercentage() {
        return this.stopLossPercentage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getContractSym() {
        return this.contractSym;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getBookProfitPercentage() {
        return this.bookProfitPercentage;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getEntryPrice() {
        return this.entryPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final int getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    @NotNull
    public final BuySellModifyFnoRequestDto copy(String orderId, @NotNull String portfolioId, Double stopLossPercentage, @NotNull String contractSym, Double bookProfitPercentage, Double entryPrice, int noOfLots, @NotNull String orderType, boolean isModel) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(contractSym, "contractSym");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new BuySellModifyFnoRequestDto(orderId, portfolioId, stopLossPercentage, contractSym, bookProfitPercentage, entryPrice, noOfLots, orderType, isModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuySellModifyFnoRequestDto)) {
            return false;
        }
        BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = (BuySellModifyFnoRequestDto) other;
        return Intrinsics.a(this.orderId, buySellModifyFnoRequestDto.orderId) && Intrinsics.a(this.portfolioId, buySellModifyFnoRequestDto.portfolioId) && Intrinsics.a(this.stopLossPercentage, buySellModifyFnoRequestDto.stopLossPercentage) && Intrinsics.a(this.contractSym, buySellModifyFnoRequestDto.contractSym) && Intrinsics.a(this.bookProfitPercentage, buySellModifyFnoRequestDto.bookProfitPercentage) && Intrinsics.a(this.entryPrice, buySellModifyFnoRequestDto.entryPrice) && this.noOfLots == buySellModifyFnoRequestDto.noOfLots && Intrinsics.a(this.orderType, buySellModifyFnoRequestDto.orderType) && this.isModel == buySellModifyFnoRequestDto.isModel;
    }

    public final Double getBookProfitPercentage() {
        return this.bookProfitPercentage;
    }

    @NotNull
    public final String getContractSym() {
        return this.contractSym;
    }

    public final Double getEntryPrice() {
        return this.entryPrice;
    }

    public final int getNoOfLots() {
        return this.noOfLots;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final Double getStopLossPercentage() {
        return this.stopLossPercentage;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.orderId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.portfolioId, hashCode * 31, 31);
        Double d10 = this.stopLossPercentage;
        if (d10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d10.hashCode();
        }
        int g11 = h.g(this.contractSym, (g10 + hashCode2) * 31, 31);
        Double d11 = this.bookProfitPercentage;
        if (d11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d11.hashCode();
        }
        int i11 = (g11 + hashCode3) * 31;
        Double d12 = this.entryPrice;
        if (d12 != null) {
            i10 = d12.hashCode();
        }
        return Boolean.hashCode(this.isModel) + h.g(this.orderType, e.f(this.noOfLots, (i11 + i10) * 31, 31), 31);
    }

    public final boolean isModel() {
        return this.isModel;
    }

    public final void setBookProfitPercentage(Double d10) {
        this.bookProfitPercentage = d10;
    }

    public final void setModel(boolean z10) {
        this.isModel = z10;
    }

    public final void setStopLossPercentage(Double d10) {
        this.stopLossPercentage = d10;
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.portfolioId;
        Double d10 = this.stopLossPercentage;
        String str3 = this.contractSym;
        Double d11 = this.bookProfitPercentage;
        Double d12 = this.entryPrice;
        int i10 = this.noOfLots;
        String str4 = this.orderType;
        boolean z10 = this.isModel;
        StringBuilder l10 = v.e.l("BuySellModifyFnoRequestDto(orderId=", str, ", portfolioId=", str2, ", stopLossPercentage=");
        l10.append(d10);
        l10.append(", contractSym=");
        l10.append(str3);
        l10.append(", bookProfitPercentage=");
        l10.append(d11);
        l10.append(", entryPrice=");
        l10.append(d12);
        l10.append(", noOfLots=");
        d.w(l10, i10, ", orderType=", str4, ", isModel=");
        return e.o(l10, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.orderId);
        parcel.writeString(this.portfolioId);
        Double d10 = this.stopLossPercentage;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        parcel.writeString(this.contractSym);
        Double d11 = this.bookProfitPercentage;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Double d12 = this.entryPrice;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d12.doubleValue());
        }
        parcel.writeInt(this.noOfLots);
        parcel.writeString(this.orderType);
        parcel.writeInt(this.isModel ? 1 : 0);
    }

    public /* synthetic */ BuySellModifyFnoRequestDto(String str, String str2, Double d10, String str3, Double d11, Double d12, int i10, String str4, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : d10, str3, (i11 & 16) != 0 ? null : d11, (i11 & 32) != 0 ? null : d12, i10, str4, (i11 & 256) != 0 ? true : z10);
    }
}
