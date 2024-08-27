package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jy\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000200HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006<"}, d2 = {"Lcom/assetgro/stockgro/data/model/FriendHoldingContentDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "executionPrice", HttpUrl.FRAGMENT_ENCODE_SET, "executionDate", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "displayImage", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "stockName", "stockId", "assetClass", "(Ljava/lang/String;Ljava/lang/String;FJLjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetClass", "()Ljava/lang/String;", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getDisplayImage", "getDisplayName", "getExecutionDate", "()J", "getExecutionPrice", "()F", "getOrderType", "getQuantity", "()D", "getStockId", "getStockName", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FriendHoldingContentDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FriendHoldingContentDto> CREATOR = new Creator();

    @SerializedName("asset_class")
    @NotNull
    private final String assetClass;

    @SerializedName("change")
    private final ChangeDto change;

    @SerializedName("display_image")
    @NotNull
    private final String displayImage;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("execution_date")
    private final long executionDate;

    @SerializedName("execution_price")
    private final float executionPrice;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("quantity")
    private final double quantity;

    @SerializedName("stock_id")
    @NotNull
    private final String stockId;

    @SerializedName("stock_name")
    @NotNull
    private final String stockName;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FriendHoldingContentDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FriendHoldingContentDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FriendHoldingContentDto(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FriendHoldingContentDto[] newArray(int i10) {
            return new FriendHoldingContentDto[i10];
        }
    }

    public FriendHoldingContentDto(@NotNull String userId, @NotNull String orderType, float f10, long j10, @NotNull String displayName, @NotNull String displayImage, ChangeDto changeDto, double d10, @NotNull String stockName, @NotNull String stockId, @NotNull String assetClass) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        this.userId = userId;
        this.orderType = orderType;
        this.executionPrice = f10;
        this.executionDate = j10;
        this.displayName = displayName;
        this.displayImage = displayImage;
        this.change = changeDto;
        this.quantity = d10;
        this.stockName = stockName;
        this.stockId = stockId;
        this.assetClass = assetClass;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getStockId() {
        return this.stockId;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component3, reason: from getter */
    public final float getExecutionPrice() {
        return this.executionPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    /* renamed from: component7, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    /* renamed from: component8, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getStockName() {
        return this.stockName;
    }

    @NotNull
    public final FriendHoldingContentDto copy(@NotNull String userId, @NotNull String orderType, float executionPrice, long executionDate, @NotNull String displayName, @NotNull String displayImage, ChangeDto change, double quantity, @NotNull String stockName, @NotNull String stockId, @NotNull String assetClass) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        return new FriendHoldingContentDto(userId, orderType, executionPrice, executionDate, displayName, displayImage, change, quantity, stockName, stockId, assetClass);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendHoldingContentDto)) {
            return false;
        }
        FriendHoldingContentDto friendHoldingContentDto = (FriendHoldingContentDto) other;
        return Intrinsics.a(this.userId, friendHoldingContentDto.userId) && Intrinsics.a(this.orderType, friendHoldingContentDto.orderType) && Float.compare(this.executionPrice, friendHoldingContentDto.executionPrice) == 0 && this.executionDate == friendHoldingContentDto.executionDate && Intrinsics.a(this.displayName, friendHoldingContentDto.displayName) && Intrinsics.a(this.displayImage, friendHoldingContentDto.displayImage) && Intrinsics.a(this.change, friendHoldingContentDto.change) && Double.compare(this.quantity, friendHoldingContentDto.quantity) == 0 && Intrinsics.a(this.stockName, friendHoldingContentDto.stockName) && Intrinsics.a(this.stockId, friendHoldingContentDto.stockId) && Intrinsics.a(this.assetClass, friendHoldingContentDto.assetClass);
    }

    @NotNull
    public final String getAssetClass() {
        return this.assetClass;
    }

    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getExecutionDate() {
        return this.executionDate;
    }

    public final float getExecutionPrice() {
        return this.executionPrice;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getStockId() {
        return this.stockId;
    }

    @NotNull
    public final String getStockName() {
        return this.stockName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.displayImage, h.g(this.displayName, e.c(this.executionDate, e.a(this.executionPrice, h.g(this.orderType, this.userId.hashCode() * 31, 31), 31), 31), 31), 31);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        return this.assetClass.hashCode() + h.g(this.stockId, h.g(this.stockName, d.c(this.quantity, (g10 + hashCode) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.orderType;
        float f10 = this.executionPrice;
        long j10 = this.executionDate;
        String str3 = this.displayName;
        String str4 = this.displayImage;
        ChangeDto changeDto = this.change;
        double d10 = this.quantity;
        String str5 = this.stockName;
        String str6 = this.stockId;
        String str7 = this.assetClass;
        StringBuilder l10 = e.l("FriendHoldingContentDto(userId=", str, ", orderType=", str2, ", executionPrice=");
        l10.append(f10);
        l10.append(", executionDate=");
        l10.append(j10);
        e.v(l10, ", displayName=", str3, ", displayImage=", str4);
        l10.append(", change=");
        l10.append(changeDto);
        l10.append(", quantity=");
        l10.append(d10);
        l10.append(", stockName=");
        l10.append(str5);
        e.v(l10, ", stockId=", str6, ", assetClass=", str7);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.orderType);
        parcel.writeFloat(this.executionPrice);
        parcel.writeLong(this.executionDate);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayImage);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeDto.writeToParcel(parcel, flags);
        }
        parcel.writeDouble(this.quantity);
        parcel.writeString(this.stockName);
        parcel.writeString(this.stockId);
        parcel.writeString(this.assetClass);
    }
}
