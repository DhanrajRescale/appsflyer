package com.assetgro.stockgro.data.model.portfolio.holdings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/TotalReturns;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", HttpUrl.FRAGMENT_ENCODE_SET, "(DDLjava/lang/String;)V", "getPercentage", "()D", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TotalReturns implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TotalReturns> CREATOR = new Creator();

    @SerializedName("percentage")
    private final double percentage;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final double value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<TotalReturns> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TotalReturns createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalReturns(parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TotalReturns[] newArray(int i10) {
            return new TotalReturns[i10];
        }
    }

    public TotalReturns(double d10, double d11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = d10;
        this.percentage = d11;
        this.type = type;
    }

    public static /* synthetic */ TotalReturns copy$default(TotalReturns totalReturns, double d10, double d11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = totalReturns.value;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            d11 = totalReturns.percentage;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            str = totalReturns.type;
        }
        return totalReturns.copy(d12, d13, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TotalReturns copy(double value, double percentage, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TotalReturns(value, percentage, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalReturns)) {
            return false;
        }
        TotalReturns totalReturns = (TotalReturns) other;
        return Double.compare(this.value, totalReturns.value) == 0 && Double.compare(this.percentage, totalReturns.percentage) == 0 && Intrinsics.a(this.type, totalReturns.type);
    }

    public final double getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.type.hashCode() + d.c(this.percentage, Double.hashCode(this.value) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "TotalReturns(value=" + this.value + ", percentage=" + this.percentage + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.value);
        parcel.writeDouble(this.percentage);
        parcel.writeString(this.type);
    }
}
