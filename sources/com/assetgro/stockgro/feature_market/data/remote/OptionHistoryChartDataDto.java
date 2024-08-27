package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.OptionHistoryChartData;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionHistoryChartDataDto;", "Landroid/os/Parcelable;", PaymentConstants.TIMESTAMP, HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "(JF)V", "getClose", "()F", "getTimestamp", "()J", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionHistoryChartData", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionHistoryChartData;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionHistoryChartDataDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionHistoryChartDataDto> CREATOR = new Creator();

    @SerializedName("close")
    private final float close;

    @SerializedName(PaymentConstants.TIMESTAMP)
    private final long timestamp;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionHistoryChartDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryChartDataDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionHistoryChartDataDto(parcel.readLong(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryChartDataDto[] newArray(int i10) {
            return new OptionHistoryChartDataDto[i10];
        }
    }

    public OptionHistoryChartDataDto(long j10, float f10) {
        this.timestamp = j10;
        this.close = f10;
    }

    public static /* synthetic */ OptionHistoryChartDataDto copy$default(OptionHistoryChartDataDto optionHistoryChartDataDto, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = optionHistoryChartDataDto.timestamp;
        }
        if ((i10 & 2) != 0) {
            f10 = optionHistoryChartDataDto.close;
        }
        return optionHistoryChartDataDto.copy(j10, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final float getClose() {
        return this.close;
    }

    @NotNull
    public final OptionHistoryChartDataDto copy(long timestamp, float close) {
        return new OptionHistoryChartDataDto(timestamp, close);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionHistoryChartDataDto)) {
            return false;
        }
        OptionHistoryChartDataDto optionHistoryChartDataDto = (OptionHistoryChartDataDto) other;
        return this.timestamp == optionHistoryChartDataDto.timestamp && Float.compare(this.close, optionHistoryChartDataDto.close) == 0;
    }

    public final float getClose() {
        return this.close;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Float.hashCode(this.close) + (Long.hashCode(this.timestamp) * 31);
    }

    @NotNull
    public final OptionHistoryChartData toOptionHistoryChartData() {
        return new OptionHistoryChartData(this.timestamp, this.close);
    }

    @NotNull
    public String toString() {
        return "OptionHistoryChartDataDto(timestamp=" + this.timestamp + ", close=" + this.close + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.timestamp);
        parcel.writeFloat(this.close);
    }
}
