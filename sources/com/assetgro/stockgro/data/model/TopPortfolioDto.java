package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006*"}, d2 = {"Lcom/assetgro/stockgro/data/model/TopPortfolioDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", "imageUrl", "userId", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getImageUrl", "()Ljava/lang/String;", "()Z", "getName", "getPercentage", "()D", "getType", "getUserId", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TopPortfolioDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TopPortfolioDto> CREATOR = new Creator();

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("is_ria_rra")
    private final boolean isExpert;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("percentage")
    private final double percentage;

    @SerializedName("type")
    private final String type;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final double value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<TopPortfolioDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TopPortfolioDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopPortfolioDto(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TopPortfolioDto[] newArray(int i10) {
            return new TopPortfolioDto[i10];
        }
    }

    public TopPortfolioDto(@NotNull String name, double d10, double d11, String str, @NotNull String imageUrl, @NotNull String userId, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.name = name;
        this.value = d10;
        this.percentage = d11;
        this.type = str;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.isExpert = z10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    public final TopPortfolioDto copy(@NotNull String name, double value, double percentage, String type, @NotNull String imageUrl, @NotNull String userId, boolean isExpert) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new TopPortfolioDto(name, value, percentage, type, imageUrl, userId, isExpert);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopPortfolioDto)) {
            return false;
        }
        TopPortfolioDto topPortfolioDto = (TopPortfolioDto) other;
        return Intrinsics.a(this.name, topPortfolioDto.name) && Double.compare(this.value, topPortfolioDto.value) == 0 && Double.compare(this.percentage, topPortfolioDto.percentage) == 0 && Intrinsics.a(this.type, topPortfolioDto.type) && Intrinsics.a(this.imageUrl, topPortfolioDto.imageUrl) && Intrinsics.a(this.userId, topPortfolioDto.userId) && this.isExpert == topPortfolioDto.isExpert;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int c10 = d.c(this.percentage, d.c(this.value, this.name.hashCode() * 31, 31), 31);
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isExpert) + h.g(this.userId, h.g(this.imageUrl, (c10 + hashCode) * 31, 31), 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        double d10 = this.value;
        double d11 = this.percentage;
        String str2 = this.type;
        String str3 = this.imageUrl;
        String str4 = this.userId;
        boolean z10 = this.isExpert;
        StringBuilder sb2 = new StringBuilder("TopPortfolioDto(name=");
        sb2.append(str);
        sb2.append(", value=");
        sb2.append(d10);
        a.v(sb2, ", percentage=", d11, ", type=");
        e.v(sb2, str2, ", imageUrl=", str3, ", userId=");
        sb2.append(str4);
        sb2.append(", isExpert=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeDouble(this.value);
        parcel.writeDouble(this.percentage);
        parcel.writeString(this.type);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.userId);
        parcel.writeInt(this.isExpert ? 1 : 0);
    }

    public /* synthetic */ TopPortfolioDto(String str, double d10, double d11, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d10, d11, str2, str3, str4, (i10 & 64) != 0 ? false : z10);
    }
}
