package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import el.l;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\"HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionContractDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "identifier", "strikePrice", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "premium", "marginPrice", "marker", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;DLcom/assetgro/stockgro/data/model/ChangeDto;DDZ)V", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getIdentifier", "()Ljava/lang/String;", "getMarginPrice", "()D", "getMarker", "()Z", "getName", "getPremium", "getStrikePrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionContract", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionContract;", "optionType", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "ltp", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionContractDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionContractDto> CREATOR = new Creator();

    @SerializedName("change")
    private final ChangeDto change;

    @SerializedName("identifier")
    @NotNull
    private final String identifier;

    @SerializedName("margin_price")
    private final double marginPrice;

    @SerializedName("marker")
    private final boolean marker;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("premium")
    private final double premium;

    @SerializedName("strike_price")
    private final double strikePrice;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionContractDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionContractDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionContractDto(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionContractDto[] newArray(int i10) {
            return new OptionContractDto[i10];
        }
    }

    public OptionContractDto(@NotNull String name, @NotNull String identifier, double d10, ChangeDto changeDto, double d11, double d12, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.name = name;
        this.identifier = identifier;
        this.strikePrice = d10;
        this.change = changeDto;
        this.premium = d11;
        this.marginPrice = d12;
        this.marker = z10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component3, reason: from getter */
    public final double getStrikePrice() {
        return this.strikePrice;
    }

    /* renamed from: component4, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPremium() {
        return this.premium;
    }

    /* renamed from: component6, reason: from getter */
    public final double getMarginPrice() {
        return this.marginPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getMarker() {
        return this.marker;
    }

    @NotNull
    public final OptionContractDto copy(@NotNull String name, @NotNull String identifier, double strikePrice, ChangeDto change, double premium, double marginPrice, boolean marker) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new OptionContractDto(name, identifier, strikePrice, change, premium, marginPrice, marker);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionContractDto)) {
            return false;
        }
        OptionContractDto optionContractDto = (OptionContractDto) other;
        return Intrinsics.a(this.name, optionContractDto.name) && Intrinsics.a(this.identifier, optionContractDto.identifier) && Double.compare(this.strikePrice, optionContractDto.strikePrice) == 0 && Intrinsics.a(this.change, optionContractDto.change) && Double.compare(this.premium, optionContractDto.premium) == 0 && Double.compare(this.marginPrice, optionContractDto.marginPrice) == 0 && this.marker == optionContractDto.marker;
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

    public final double getPremium() {
        return this.premium;
    }

    public final double getStrikePrice() {
        return this.strikePrice;
    }

    public int hashCode() {
        int hashCode;
        int c10 = d.c(this.strikePrice, h.g(this.identifier, this.name.hashCode() * 31, 31), 31);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        return Boolean.hashCode(this.marker) + d.c(this.marginPrice, d.c(this.premium, (c10 + hashCode) * 31, 31), 31);
    }

    @NotNull
    public final OptionContract toOptionContract(@NotNull OptionType optionType, double ltp) {
        double d10;
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        if (optionType == OptionType.CALL) {
            d10 = this.strikePrice + this.premium;
        } else {
            d10 = this.strikePrice - this.premium;
        }
        double d11 = d10;
        double d12 = 0.0d;
        if (ltp > 0.0d) {
            d12 = l.E0(2, ((d11 - ltp) / ltp) * 100.0d);
        }
        String str = this.name;
        String str2 = this.identifier;
        double d13 = this.strikePrice;
        double d14 = this.premium;
        return new OptionContract(optionType, str, str2, d13, this.change, d14, d11, d12 + " %", this.marginPrice, this.marker, null);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.identifier;
        double d10 = this.strikePrice;
        ChangeDto changeDto = this.change;
        double d11 = this.premium;
        double d12 = this.marginPrice;
        boolean z10 = this.marker;
        StringBuilder l10 = e.l("OptionContractDto(name=", str, ", identifier=", str2, ", strikePrice=");
        l10.append(d10);
        l10.append(", change=");
        l10.append(changeDto);
        a.v(l10, ", premium=", d11, ", marginPrice=");
        l10.append(d12);
        l10.append(", marker=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
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
        parcel.writeDouble(this.marginPrice);
        parcel.writeInt(this.marker ? 1 : 0);
    }
}
