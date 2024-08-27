package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zi.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartDataPointDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/p;", "toDataPoint", HttpUrl.FRAGMENT_ENCODE_SET, "component1", HttpUrl.FRAGMENT_ENCODE_SET, "component2", PaymentConstants.TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.VALUE, "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "J", "getTimestamp", "()J", "F", "getValue", "()F", "<init>", "(JF)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockChartDataPointDto {
    public static final int $stable = 0;

    @SerializedName("ts")
    private final long timestamp;

    @SerializedName("val")
    private final float value;

    public StockChartDataPointDto(long j10, float f10) {
        this.timestamp = j10;
        this.value = f10;
    }

    public static /* synthetic */ StockChartDataPointDto copy$default(StockChartDataPointDto stockChartDataPointDto, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = stockChartDataPointDto.timestamp;
        }
        if ((i10 & 2) != 0) {
            f10 = stockChartDataPointDto.value;
        }
        return stockChartDataPointDto.copy(j10, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final StockChartDataPointDto copy(long timestamp, float value) {
        return new StockChartDataPointDto(timestamp, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockChartDataPointDto)) {
            return false;
        }
        StockChartDataPointDto stockChartDataPointDto = (StockChartDataPointDto) other;
        return this.timestamp == stockChartDataPointDto.timestamp && Float.compare(this.value, stockChartDataPointDto.value) == 0;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value) + (Long.hashCode(this.timestamp) * 31);
    }

    @NotNull
    public final p toDataPoint() {
        return new p(this.timestamp, this.value);
    }

    @NotNull
    public String toString() {
        return "StockChartDataPointDto(timestamp=" + this.timestamp + ", value=" + this.value + ")";
    }
}
