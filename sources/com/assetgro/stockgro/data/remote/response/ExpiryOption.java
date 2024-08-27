package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006-"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/ExpiryOption;", "Landroid/os/Parcelable;", "date", HttpUrl.FRAGMENT_ENCODE_SET, "duration", HttpUrl.FRAGMENT_ENCODE_SET, "savePercentage", "mostPopular", HttpUrl.FRAGMENT_ENCODE_SET, "pricePerDay", HttpUrl.FRAGMENT_ENCODE_SET, "price", "isSelected", "(ILjava/lang/String;Ljava/lang/String;ZDDZ)V", "getDate", "()I", "getDuration", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getMostPopular", "getPrice", "()D", "getPricePerDay", "getSavePercentage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExpiryOption implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ExpiryOption> CREATOR = new Creator();

    @SerializedName("date")
    private final int date;

    @SerializedName("duration")
    @NotNull
    private final String duration;
    private boolean isSelected;

    @SerializedName("most_popular")
    private final boolean mostPopular;

    @SerializedName("price")
    private final double price;

    @SerializedName("price_per_day")
    private final double pricePerDay;

    @SerializedName("save_percentage")
    @NotNull
    private final String savePercentage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ExpiryOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExpiryOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiryOption(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExpiryOption[] newArray(int i10) {
            return new ExpiryOption[i10];
        }
    }

    public ExpiryOption(int i10, @NotNull String duration, @NotNull String savePercentage, boolean z10, double d10, double d11, boolean z11) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(savePercentage, "savePercentage");
        this.date = i10;
        this.duration = duration;
        this.savePercentage = savePercentage;
        this.mostPopular = z10;
        this.pricePerDay = d10;
        this.price = d11;
        this.isSelected = z11;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSavePercentage() {
        return this.savePercentage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMostPopular() {
        return this.mostPopular;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPricePerDay() {
        return this.pricePerDay;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final ExpiryOption copy(int date, @NotNull String duration, @NotNull String savePercentage, boolean mostPopular, double pricePerDay, double price, boolean isSelected) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(savePercentage, "savePercentage");
        return new ExpiryOption(date, duration, savePercentage, mostPopular, pricePerDay, price, isSelected);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryOption)) {
            return false;
        }
        ExpiryOption expiryOption = (ExpiryOption) other;
        return this.date == expiryOption.date && Intrinsics.a(this.duration, expiryOption.duration) && Intrinsics.a(this.savePercentage, expiryOption.savePercentage) && this.mostPopular == expiryOption.mostPopular && Double.compare(this.pricePerDay, expiryOption.pricePerDay) == 0 && Double.compare(this.price, expiryOption.price) == 0 && this.isSelected == expiryOption.isSelected;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public final boolean getMostPopular() {
        return this.mostPopular;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getPricePerDay() {
        return this.pricePerDay;
    }

    @NotNull
    public final String getSavePercentage() {
        return this.savePercentage;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + d.c(this.price, d.c(this.pricePerDay, e.d(this.mostPopular, h.g(this.savePercentage, h.g(this.duration, Integer.hashCode(this.date) * 31, 31), 31), 31), 31), 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    @NotNull
    public String toString() {
        int i10 = this.date;
        String str = this.duration;
        String str2 = this.savePercentage;
        boolean z10 = this.mostPopular;
        double d10 = this.pricePerDay;
        double d11 = this.price;
        boolean z11 = this.isSelected;
        StringBuilder sb2 = new StringBuilder("ExpiryOption(date=");
        sb2.append(i10);
        sb2.append(", duration=");
        sb2.append(str);
        sb2.append(", savePercentage=");
        sb2.append(str2);
        sb2.append(", mostPopular=");
        sb2.append(z10);
        sb2.append(", pricePerDay=");
        sb2.append(d10);
        a.v(sb2, ", price=", d11, ", isSelected=");
        return da.e.o(sb2, z11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.date);
        parcel.writeString(this.duration);
        parcel.writeString(this.savePercentage);
        parcel.writeInt(this.mostPopular ? 1 : 0);
        parcel.writeDouble(this.pricePerDay);
        parcel.writeDouble(this.price);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ ExpiryOption(int i10, String str, String str2, boolean z10, double d10, double d11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, z10, d10, d11, (i11 & 64) != 0 ? false : z11);
    }
}
