package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J{\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202HÖ\u0001R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006="}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionContract;", "Landroid/os/Parcelable;", "optionType", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "identifier", "strikePrice", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "premium", "breakEven", "breakEvenPercentage", "marginPrice", "marker", HttpUrl.FRAGMENT_ENCODE_SET, "positionItem", "Lcom/assetgro/stockgro/feature_market/data/remote/PositionItem;", "(Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;Ljava/lang/String;Ljava/lang/String;DLcom/assetgro/stockgro/data/model/ChangeDto;DDLjava/lang/String;DZLcom/assetgro/stockgro/feature_market/data/remote/PositionItem;)V", "getBreakEven", "()D", "getBreakEvenPercentage", "()Ljava/lang/String;", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getIdentifier", "getMarginPrice", "getMarker", "()Z", "getName", "getOptionType", "()Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "getPositionItem", "()Lcom/assetgro/stockgro/feature_market/data/remote/PositionItem;", "getPremium", "getStrikePrice", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionContract implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionContract> CREATOR = new Creator();
    private final double breakEven;

    @NotNull
    private final String breakEvenPercentage;
    private final ChangeDto change;

    @NotNull
    private final String identifier;
    private final double marginPrice;
    private final boolean marker;

    @NotNull
    private final String name;

    @NotNull
    private final OptionType optionType;
    private final PositionItem positionItem;
    private final double premium;
    private final double strikePrice;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionContract> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionContract createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionContract(OptionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0 ? PositionItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionContract[] newArray(int i10) {
            return new OptionContract[i10];
        }
    }

    public OptionContract(@NotNull OptionType optionType, @NotNull String name, @NotNull String identifier, double d10, ChangeDto changeDto, double d11, double d12, @NotNull String breakEvenPercentage, double d13, boolean z10, PositionItem positionItem) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(breakEvenPercentage, "breakEvenPercentage");
        this.optionType = optionType;
        this.name = name;
        this.identifier = identifier;
        this.strikePrice = d10;
        this.change = changeDto;
        this.premium = d11;
        this.breakEven = d12;
        this.breakEvenPercentage = breakEvenPercentage;
        this.marginPrice = d13;
        this.marker = z10;
        this.positionItem = positionItem;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OptionType getOptionType() {
        return this.optionType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getMarker() {
        return this.marker;
    }

    /* renamed from: component11, reason: from getter */
    public final PositionItem getPositionItem() {
        return this.positionItem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component4, reason: from getter */
    public final double getStrikePrice() {
        return this.strikePrice;
    }

    /* renamed from: component5, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPremium() {
        return this.premium;
    }

    /* renamed from: component7, reason: from getter */
    public final double getBreakEven() {
        return this.breakEven;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getBreakEvenPercentage() {
        return this.breakEvenPercentage;
    }

    /* renamed from: component9, reason: from getter */
    public final double getMarginPrice() {
        return this.marginPrice;
    }

    @NotNull
    public final OptionContract copy(@NotNull OptionType optionType, @NotNull String name, @NotNull String identifier, double strikePrice, ChangeDto change, double premium, double breakEven, @NotNull String breakEvenPercentage, double marginPrice, boolean marker, PositionItem positionItem) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(breakEvenPercentage, "breakEvenPercentage");
        return new OptionContract(optionType, name, identifier, strikePrice, change, premium, breakEven, breakEvenPercentage, marginPrice, marker, positionItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionContract)) {
            return false;
        }
        OptionContract optionContract = (OptionContract) other;
        return this.optionType == optionContract.optionType && Intrinsics.a(this.name, optionContract.name) && Intrinsics.a(this.identifier, optionContract.identifier) && Double.compare(this.strikePrice, optionContract.strikePrice) == 0 && Intrinsics.a(this.change, optionContract.change) && Double.compare(this.premium, optionContract.premium) == 0 && Double.compare(this.breakEven, optionContract.breakEven) == 0 && Intrinsics.a(this.breakEvenPercentage, optionContract.breakEvenPercentage) && Double.compare(this.marginPrice, optionContract.marginPrice) == 0 && this.marker == optionContract.marker && Intrinsics.a(this.positionItem, optionContract.positionItem);
    }

    public final double getBreakEven() {
        return this.breakEven;
    }

    @NotNull
    public final String getBreakEvenPercentage() {
        return this.breakEvenPercentage;
    }

    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public final double getMarginPrice() {
        return this.marginPrice;
    }

    public final boolean getMarker() {
        return this.marker;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final OptionType getOptionType() {
        return this.optionType;
    }

    public final PositionItem getPositionItem() {
        return this.positionItem;
    }

    public final double getPremium() {
        return this.premium;
    }

    public final double getStrikePrice() {
        return this.strikePrice;
    }

    public int hashCode() {
        int hashCode;
        int c10 = d.c(this.strikePrice, h.g(this.identifier, h.g(this.name, this.optionType.hashCode() * 31, 31), 31), 31);
        ChangeDto changeDto = this.change;
        int i10 = 0;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        int d10 = e.d(this.marker, d.c(this.marginPrice, h.g(this.breakEvenPercentage, d.c(this.breakEven, d.c(this.premium, (c10 + hashCode) * 31, 31), 31), 31), 31), 31);
        PositionItem positionItem = this.positionItem;
        if (positionItem != null) {
            i10 = positionItem.hashCode();
        }
        return d10 + i10;
    }

    @NotNull
    public String toString() {
        OptionType optionType = this.optionType;
        String str = this.name;
        String str2 = this.identifier;
        double d10 = this.strikePrice;
        ChangeDto changeDto = this.change;
        double d11 = this.premium;
        double d12 = this.breakEven;
        String str3 = this.breakEvenPercentage;
        double d13 = this.marginPrice;
        boolean z10 = this.marker;
        PositionItem positionItem = this.positionItem;
        StringBuilder sb2 = new StringBuilder("OptionContract(optionType=");
        sb2.append(optionType);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", identifier=");
        sb2.append(str2);
        sb2.append(", strikePrice=");
        sb2.append(d10);
        sb2.append(", change=");
        sb2.append(changeDto);
        sb2.append(", premium=");
        sb2.append(d11);
        a.v(sb2, ", breakEven=", d12, ", breakEvenPercentage=");
        sb2.append(str3);
        sb2.append(", marginPrice=");
        sb2.append(d13);
        sb2.append(", marker=");
        sb2.append(z10);
        sb2.append(", positionItem=");
        sb2.append(positionItem);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.optionType.name());
        parcel.writeString(this.name);
        parcel.writeString(this.identifier);
        parcel.writeDouble(this.strikePrice);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeDto.writeToParcel(parcel, flags);
        }
        parcel.writeDouble(this.premium);
        parcel.writeDouble(this.breakEven);
        parcel.writeString(this.breakEvenPercentage);
        parcel.writeDouble(this.marginPrice);
        parcel.writeInt(this.marker ? 1 : 0);
        PositionItem positionItem = this.positionItem;
        if (positionItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            positionItem.writeToParcel(parcel, flags);
        }
    }
}
