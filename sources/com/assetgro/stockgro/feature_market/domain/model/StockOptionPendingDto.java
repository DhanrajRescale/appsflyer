package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000fHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\u0010\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u0007J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00067"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/StockOptionPendingDto;", "Landroid/os/Parcelable;", "stockOptionName", HttpUrl.FRAGMENT_ENCODE_SET, "numberOfLots", HttpUrl.FRAGMENT_ENCODE_SET, "pricePerLot", HttpUrl.FRAGMENT_ENCODE_SET, "lotNumber", "orderType", "totalMargin", "marginBalance", "optionIconImageUrl", "portfolioId", "isModelPortfolio", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;IDILjava/lang/String;DDLjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getLotNumber", "()I", "getMarginBalance", "()D", "setMarginBalance", "(D)V", "getNumberOfLots", "getOptionIconImageUrl", "()Ljava/lang/String;", "getOrderType", "getPortfolioId", "getPricePerLot", "getStockOptionName", "getTotalMargin", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "totalBalance", "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockOptionPendingDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StockOptionPendingDto> CREATOR = new Creator();
    private final boolean isModelPortfolio;
    private final int lotNumber;
    private double marginBalance;
    private final int numberOfLots;

    @NotNull
    private final String optionIconImageUrl;

    @NotNull
    private final String orderType;

    @NotNull
    private final String portfolioId;
    private final double pricePerLot;

    @NotNull
    private final String stockOptionName;
    private final double totalMargin;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockOptionPendingDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockOptionPendingDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockOptionPendingDto(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockOptionPendingDto[] newArray(int i10) {
            return new StockOptionPendingDto[i10];
        }
    }

    public StockOptionPendingDto() {
        this(null, 0, 0.0d, 0, null, 0.0d, 0.0d, null, null, false, 1023, null);
    }

    public static /* synthetic */ double getMarginBalance$default(StockOptionPendingDto stockOptionPendingDto, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = 0.0d;
        }
        return stockOptionPendingDto.getMarginBalance(d10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStockOptionName() {
        return this.stockOptionName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsModelPortfolio() {
        return this.isModelPortfolio;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfLots() {
        return this.numberOfLots;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPricePerLot() {
        return this.pricePerLot;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLotNumber() {
        return this.lotNumber;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTotalMargin() {
        return this.totalMargin;
    }

    /* renamed from: component7, reason: from getter */
    public final double getMarginBalance() {
        return this.marginBalance;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getOptionIconImageUrl() {
        return this.optionIconImageUrl;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    public final StockOptionPendingDto copy(@NotNull String stockOptionName, int numberOfLots, double pricePerLot, int lotNumber, @NotNull String orderType, double totalMargin, double marginBalance, @NotNull String optionIconImageUrl, @NotNull String portfolioId, boolean isModelPortfolio) {
        Intrinsics.checkNotNullParameter(stockOptionName, "stockOptionName");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(optionIconImageUrl, "optionIconImageUrl");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new StockOptionPendingDto(stockOptionName, numberOfLots, pricePerLot, lotNumber, orderType, totalMargin, marginBalance, optionIconImageUrl, portfolioId, isModelPortfolio);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockOptionPendingDto)) {
            return false;
        }
        StockOptionPendingDto stockOptionPendingDto = (StockOptionPendingDto) other;
        return Intrinsics.a(this.stockOptionName, stockOptionPendingDto.stockOptionName) && this.numberOfLots == stockOptionPendingDto.numberOfLots && Double.compare(this.pricePerLot, stockOptionPendingDto.pricePerLot) == 0 && this.lotNumber == stockOptionPendingDto.lotNumber && Intrinsics.a(this.orderType, stockOptionPendingDto.orderType) && Double.compare(this.totalMargin, stockOptionPendingDto.totalMargin) == 0 && Double.compare(this.marginBalance, stockOptionPendingDto.marginBalance) == 0 && Intrinsics.a(this.optionIconImageUrl, stockOptionPendingDto.optionIconImageUrl) && Intrinsics.a(this.portfolioId, stockOptionPendingDto.portfolioId) && this.isModelPortfolio == stockOptionPendingDto.isModelPortfolio;
    }

    public final int getLotNumber() {
        return this.lotNumber;
    }

    public final double getMarginBalance() {
        return this.marginBalance;
    }

    public final int getNumberOfLots() {
        return this.numberOfLots;
    }

    @NotNull
    public final String getOptionIconImageUrl() {
        return this.optionIconImageUrl;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final double getPricePerLot() {
        return this.pricePerLot;
    }

    @NotNull
    public final String getStockOptionName() {
        return this.stockOptionName;
    }

    public final double getTotalMargin() {
        return this.totalMargin;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isModelPortfolio) + h.g(this.portfolioId, h.g(this.optionIconImageUrl, d.c(this.marginBalance, d.c(this.totalMargin, h.g(this.orderType, e.f(this.lotNumber, d.c(this.pricePerLot, e.f(this.numberOfLots, this.stockOptionName.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isModelPortfolio() {
        return this.isModelPortfolio;
    }

    public final void setMarginBalance(double d10) {
        this.marginBalance = d10;
    }

    @NotNull
    public String toString() {
        String str = this.stockOptionName;
        int i10 = this.numberOfLots;
        double d10 = this.pricePerLot;
        int i11 = this.lotNumber;
        String str2 = this.orderType;
        double d11 = this.totalMargin;
        double d12 = this.marginBalance;
        String str3 = this.optionIconImageUrl;
        String str4 = this.portfolioId;
        boolean z10 = this.isModelPortfolio;
        StringBuilder sb2 = new StringBuilder("StockOptionPendingDto(stockOptionName=");
        sb2.append(str);
        sb2.append(", numberOfLots=");
        sb2.append(i10);
        sb2.append(", pricePerLot=");
        sb2.append(d10);
        sb2.append(", lotNumber=");
        sb2.append(i11);
        sb2.append(", orderType=");
        sb2.append(str2);
        sb2.append(", totalMargin=");
        sb2.append(d11);
        a.v(sb2, ", marginBalance=", d12, ", optionIconImageUrl=");
        v.e.v(sb2, str3, ", portfolioId=", str4, ", isModelPortfolio=");
        return e.o(sb2, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stockOptionName);
        parcel.writeInt(this.numberOfLots);
        parcel.writeDouble(this.pricePerLot);
        parcel.writeInt(this.lotNumber);
        parcel.writeString(this.orderType);
        parcel.writeDouble(this.totalMargin);
        parcel.writeDouble(this.marginBalance);
        parcel.writeString(this.optionIconImageUrl);
        parcel.writeString(this.portfolioId);
        parcel.writeInt(this.isModelPortfolio ? 1 : 0);
    }

    public StockOptionPendingDto(@NotNull String stockOptionName, int i10, double d10, int i11, @NotNull String orderType, double d11, double d12, @NotNull String optionIconImageUrl, @NotNull String portfolioId, boolean z10) {
        Intrinsics.checkNotNullParameter(stockOptionName, "stockOptionName");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(optionIconImageUrl, "optionIconImageUrl");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.stockOptionName = stockOptionName;
        this.numberOfLots = i10;
        this.pricePerLot = d10;
        this.lotNumber = i11;
        this.orderType = orderType;
        this.totalMargin = d11;
        this.marginBalance = d12;
        this.optionIconImageUrl = optionIconImageUrl;
        this.portfolioId = portfolioId;
        this.isModelPortfolio = z10;
    }

    public final double getMarginBalance(double totalBalance) {
        return totalBalance - ((this.numberOfLots * this.pricePerLot) * this.lotNumber);
    }

    public /* synthetic */ StockOptionPendingDto(String str, int i10, double d10, int i11, String str2, double d11, double d12, String str3, String str4, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0.0d : d10, (i12 & 8) == 0 ? i11 : 0, (i12 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i12 & 32) != 0 ? 0.0d : d11, (i12 & 64) == 0 ? d12 : 0.0d, (i12 & 128) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i12 & 256) == 0 ? str4 : HttpUrl.FRAGMENT_ENCODE_SET, (i12 & 512) != 0 ? true : z10);
    }
}
