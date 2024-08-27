package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.OptionOhlc;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionOhlcDto;", "Landroid/os/Parcelable;", "open", HttpUrl.FRAGMENT_ENCODE_SET, "high", "low", "prevClose", "(DDDD)V", "getHigh", "()D", "getLow", "getOpen", "getPrevClose", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionOhlc", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionOhlc;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionOhlcDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionOhlcDto> CREATOR = new Creator();

    @SerializedName("h")
    private final double high;

    @SerializedName("l")
    private final double low;

    @SerializedName("o")
    private final double open;

    @SerializedName("prev_close")
    private final double prevClose;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionOhlcDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOhlcDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionOhlcDto(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOhlcDto[] newArray(int i10) {
            return new OptionOhlcDto[i10];
        }
    }

    public OptionOhlcDto(double d10, double d11, double d12, double d13) {
        this.open = d10;
        this.high = d11;
        this.low = d12;
        this.prevClose = d13;
    }

    /* renamed from: component1, reason: from getter */
    public final double getOpen() {
        return this.open;
    }

    /* renamed from: component2, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPrevClose() {
        return this.prevClose;
    }

    @NotNull
    public final OptionOhlcDto copy(double open, double high, double low, double prevClose) {
        return new OptionOhlcDto(open, high, low, prevClose);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOhlcDto)) {
            return false;
        }
        OptionOhlcDto optionOhlcDto = (OptionOhlcDto) other;
        return Double.compare(this.open, optionOhlcDto.open) == 0 && Double.compare(this.high, optionOhlcDto.high) == 0 && Double.compare(this.low, optionOhlcDto.low) == 0 && Double.compare(this.prevClose, optionOhlcDto.prevClose) == 0;
    }

    public final double getHigh() {
        return this.high;
    }

    public final double getLow() {
        return this.low;
    }

    public final double getOpen() {
        return this.open;
    }

    public final double getPrevClose() {
        return this.prevClose;
    }

    public int hashCode() {
        return Double.hashCode(this.prevClose) + d.c(this.low, d.c(this.high, Double.hashCode(this.open) * 31, 31), 31);
    }

    @NotNull
    public final OptionOhlc toOptionOhlc() {
        return new OptionOhlc(this.open, this.high, this.low, this.prevClose);
    }

    @NotNull
    public String toString() {
        double d10 = this.open;
        double d11 = this.high;
        double d12 = this.low;
        double d13 = this.prevClose;
        StringBuilder sb2 = new StringBuilder("OptionOhlcDto(open=");
        sb2.append(d10);
        sb2.append(", high=");
        sb2.append(d11);
        a.v(sb2, ", low=", d12, ", prevClose=");
        sb2.append(d13);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.open);
        parcel.writeDouble(this.high);
        parcel.writeDouble(this.low);
        parcel.writeDouble(this.prevClose);
    }
}
