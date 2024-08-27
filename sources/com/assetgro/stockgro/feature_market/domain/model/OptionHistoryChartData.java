package com.assetgro.stockgro.feature_market.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import um.i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionHistoryChartData;", "Landroid/os/Parcelable;", "Lum/i;", "toLineChartEntry", HttpUrl.FRAGMENT_ENCODE_SET, "component1", HttpUrl.FRAGMENT_ENCODE_SET, "component2", PaymentConstants.TIMESTAMP, "close", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "J", "getTimestamp", "()J", "F", "getClose", "()F", "<init>", "(JF)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class OptionHistoryChartData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OptionHistoryChartData> CREATOR = new Creator();
    private final float close;
    private final long timestamp;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionHistoryChartData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryChartData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionHistoryChartData(parcel.readLong(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryChartData[] newArray(int i10) {
            return new OptionHistoryChartData[i10];
        }
    }

    public OptionHistoryChartData(long j10, float f10) {
        this.timestamp = j10;
        this.close = f10;
    }

    public static /* synthetic */ OptionHistoryChartData copy$default(OptionHistoryChartData optionHistoryChartData, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = optionHistoryChartData.timestamp;
        }
        if ((i10 & 2) != 0) {
            f10 = optionHistoryChartData.close;
        }
        return optionHistoryChartData.copy(j10, f10);
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
    public final OptionHistoryChartData copy(long timestamp, float close) {
        return new OptionHistoryChartData(timestamp, close);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionHistoryChartData)) {
            return false;
        }
        OptionHistoryChartData optionHistoryChartData = (OptionHistoryChartData) other;
        return this.timestamp == optionHistoryChartData.timestamp && Float.compare(this.close, optionHistoryChartData.close) == 0;
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
    public final i toLineChartEntry() {
        return new i((float) this.timestamp, this.close);
    }

    @NotNull
    public String toString() {
        return "OptionHistoryChartData(timestamp=" + this.timestamp + ", close=" + this.close + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.timestamp);
        parcel.writeFloat(this.close);
    }
}
