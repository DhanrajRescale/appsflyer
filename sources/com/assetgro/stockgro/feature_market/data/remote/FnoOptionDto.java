package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020 HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "identifier", "ltp", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "imageUrl", "sector", "tag", "(Ljava/lang/String;Ljava/lang/String;DLcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getIdentifier", "()Ljava/lang/String;", "getImageUrl", "getLtp", "()D", "getName", "getSector", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toFnoOption", "Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FnoOptionDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FnoOptionDto> CREATOR = new Creator();

    @SerializedName("change")
    private final ChangeDto change;

    @SerializedName("identifier")
    @NotNull
    private final String identifier;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("last_trade_price")
    private final double ltp;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FnoOptionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoOptionDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FnoOptionDto(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoOptionDto[] newArray(int i10) {
            return new FnoOptionDto[i10];
        }
    }

    public FnoOptionDto(@NotNull String name, @NotNull String identifier, double d10, ChangeDto changeDto, @NotNull String imageUrl, @NotNull String sector, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.name = name;
        this.identifier = identifier;
        this.ltp = d10;
        this.change = changeDto;
        this.imageUrl = imageUrl;
        this.sector = sector;
        this.tag = tag;
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
    public final double getLtp() {
        return this.ltp;
    }

    /* renamed from: component4, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final FnoOptionDto copy(@NotNull String name, @NotNull String identifier, double ltp, ChangeDto change, @NotNull String imageUrl, @NotNull String sector, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new FnoOptionDto(name, identifier, ltp, change, imageUrl, sector, tag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FnoOptionDto)) {
            return false;
        }
        FnoOptionDto fnoOptionDto = (FnoOptionDto) other;
        return Intrinsics.a(this.name, fnoOptionDto.name) && Intrinsics.a(this.identifier, fnoOptionDto.identifier) && Double.compare(this.ltp, fnoOptionDto.ltp) == 0 && Intrinsics.a(this.change, fnoOptionDto.change) && Intrinsics.a(this.imageUrl, fnoOptionDto.imageUrl) && Intrinsics.a(this.sector, fnoOptionDto.sector) && Intrinsics.a(this.tag, fnoOptionDto.tag);
    }

    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final double getLtp() {
        return this.ltp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int hashCode;
        int c10 = d.c(this.ltp, h.g(this.identifier, this.name.hashCode() * 31, 31), 31);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        return this.tag.hashCode() + h.g(this.sector, h.g(this.imageUrl, (c10 + hashCode) * 31, 31), 31);
    }

    @NotNull
    public final FnoOption toFnoOption() {
        return new FnoOption(this.name, this.identifier, this.ltp, this.change, this.imageUrl, this.sector, this.tag);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.identifier;
        double d10 = this.ltp;
        ChangeDto changeDto = this.change;
        String str3 = this.imageUrl;
        String str4 = this.sector;
        String str5 = this.tag;
        StringBuilder l10 = e.l("FnoOptionDto(name=", str, ", identifier=", str2, ", ltp=");
        l10.append(d10);
        l10.append(", change=");
        l10.append(changeDto);
        e.v(l10, ", imageUrl=", str3, ", sector=", str4);
        return e.j(l10, ", tag=", str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.identifier);
        parcel.writeDouble(this.ltp);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeDto.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.sector);
        parcel.writeString(this.tag);
    }
}
