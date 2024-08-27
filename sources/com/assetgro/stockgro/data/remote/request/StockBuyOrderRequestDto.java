package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015¨\u00068"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/StockBuyOrderRequestDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "executionPrice", "stopLoss", "bookProfit", "product", "orderType", "portfolioId", "parentOrderType", "transactionType", "totalAmount", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "getBookProfit", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getExecutionPrice", "getOrderType", "()Ljava/lang/String;", "getParentOrderType", "getPortfolioId", "getProduct", "getQuantity", "getStopLoss", "getTotalAmount", "getTransactionType", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lcom/assetgro/stockgro/data/remote/request/StockBuyOrderRequestDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockBuyOrderRequestDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<StockBuyOrderRequestDto> CREATOR = new Creator();

    @SerializedName("book_profit")
    private final Float bookProfit;

    @SerializedName("entry_price")
    private final Float executionPrice;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("parent_order_type")
    private final String parentOrderType;

    @SerializedName("portfolio_id")
    private final String portfolioId;

    @SerializedName("product")
    private final String product;

    @SerializedName("quantity")
    private final Float quantity;

    @SerializedName("stop_loss")
    private final Float stopLoss;

    @SerializedName("total_amount")
    private final Float totalAmount;

    @SerializedName("transaction_type")
    private final String transactionType;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockBuyOrderRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockBuyOrderRequestDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockBuyOrderRequestDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockBuyOrderRequestDto[] newArray(int i10) {
            return new StockBuyOrderRequestDto[i10];
        }
    }

    public StockBuyOrderRequestDto(String str, Float f10, Float f11, Float f12, Float f13, String str2, String str3, String str4, String str5, String str6, Float f14) {
        this.userId = str;
        this.quantity = f10;
        this.executionPrice = f11;
        this.stopLoss = f12;
        this.bookProfit = f13;
        this.product = str2;
        this.orderType = str3;
        this.portfolioId = str4;
        this.parentOrderType = str5;
        this.transactionType = str6;
        this.totalAmount = f14;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component11, reason: from getter */
    public final Float getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final Float getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getStopLoss() {
        return this.stopLoss;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getBookProfit() {
        return this.bookProfit;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getParentOrderType() {
        return this.parentOrderType;
    }

    @NotNull
    public final StockBuyOrderRequestDto copy(String userId, Float quantity, Float executionPrice, Float stopLoss, Float bookProfit, String product, String orderType, String portfolioId, String parentOrderType, String transactionType, Float totalAmount) {
        return new StockBuyOrderRequestDto(userId, quantity, executionPrice, stopLoss, bookProfit, product, orderType, portfolioId, parentOrderType, transactionType, totalAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockBuyOrderRequestDto)) {
            return false;
        }
        StockBuyOrderRequestDto stockBuyOrderRequestDto = (StockBuyOrderRequestDto) other;
        return Intrinsics.a(this.userId, stockBuyOrderRequestDto.userId) && Intrinsics.a(this.quantity, stockBuyOrderRequestDto.quantity) && Intrinsics.a(this.executionPrice, stockBuyOrderRequestDto.executionPrice) && Intrinsics.a(this.stopLoss, stockBuyOrderRequestDto.stopLoss) && Intrinsics.a(this.bookProfit, stockBuyOrderRequestDto.bookProfit) && Intrinsics.a(this.product, stockBuyOrderRequestDto.product) && Intrinsics.a(this.orderType, stockBuyOrderRequestDto.orderType) && Intrinsics.a(this.portfolioId, stockBuyOrderRequestDto.portfolioId) && Intrinsics.a(this.parentOrderType, stockBuyOrderRequestDto.parentOrderType) && Intrinsics.a(this.transactionType, stockBuyOrderRequestDto.transactionType) && Intrinsics.a(this.totalAmount, stockBuyOrderRequestDto.totalAmount);
    }

    public final Float getBookProfit() {
        return this.bookProfit;
    }

    public final Float getExecutionPrice() {
        return this.executionPrice;
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

    public final String getProduct() {
        return this.product;
    }

    public final Float getQuantity() {
        return this.quantity;
    }

    public final Float getStopLoss() {
        return this.stopLoss;
    }

    public final Float getTotalAmount() {
        return this.totalAmount;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f10 = this.quantity;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.executionPrice;
        int hashCode3 = (hashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.stopLoss;
        int hashCode4 = (hashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.bookProfit;
        int hashCode5 = (hashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str2 = this.product;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderType;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.portfolioId;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parentOrderType;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionType;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f14 = this.totalAmount;
        return hashCode10 + (f14 != null ? f14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        Float f10 = this.quantity;
        Float f11 = this.executionPrice;
        Float f12 = this.stopLoss;
        Float f13 = this.bookProfit;
        String str2 = this.product;
        String str3 = this.orderType;
        String str4 = this.portfolioId;
        String str5 = this.parentOrderType;
        String str6 = this.transactionType;
        Float f14 = this.totalAmount;
        StringBuilder sb2 = new StringBuilder("StockBuyOrderRequestDto(userId=");
        sb2.append(str);
        sb2.append(", quantity=");
        sb2.append(f10);
        sb2.append(", executionPrice=");
        sb2.append(f11);
        sb2.append(", stopLoss=");
        sb2.append(f12);
        sb2.append(", bookProfit=");
        sb2.append(f13);
        sb2.append(", product=");
        sb2.append(str2);
        sb2.append(", orderType=");
        e.v(sb2, str3, ", portfolioId=", str4, ", parentOrderType=");
        e.v(sb2, str5, ", transactionType=", str6, ", totalAmount=");
        sb2.append(f14);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        Float f10 = this.quantity;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        Float f11 = this.executionPrice;
        if (f11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f11.floatValue());
        }
        Float f12 = this.stopLoss;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f12.floatValue());
        }
        Float f13 = this.bookProfit;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f13.floatValue());
        }
        parcel.writeString(this.product);
        parcel.writeString(this.orderType);
        parcel.writeString(this.portfolioId);
        parcel.writeString(this.parentOrderType);
        parcel.writeString(this.transactionType);
        Float f14 = this.totalAmount;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
    }
}
