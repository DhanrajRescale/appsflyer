package com.assetgro.stockgro.feature_market.domain.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/BreakEvenChartOutputData;", HttpUrl.FRAGMENT_ENCODE_SET, "maxY", HttpUrl.FRAGMENT_ENCODE_SET, "positiveChartValues", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;", "negativeChartValues", "breakEvenMarkerPointValue", "maxLossMarkerPointValue", "maxProfitMarkerPointValue", "isChartPlottable", HttpUrl.FRAGMENT_ENCODE_SET, "(DLjava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;Z)V", "getBreakEvenMarkerPointValue", "()Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;", "()Z", "getMaxLossMarkerPointValue", "getMaxProfitMarkerPointValue", "getMaxY", "()D", "getNegativeChartValues", "()Ljava/util/List;", "getPositiveChartValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BreakEvenChartOutputData {
    public static final int $stable = 8;
    private final BEChartData breakEvenMarkerPointValue;
    private final boolean isChartPlottable;
    private final BEChartData maxLossMarkerPointValue;
    private final BEChartData maxProfitMarkerPointValue;
    private final double maxY;

    @NotNull
    private final List<BEChartData> negativeChartValues;

    @NotNull
    private final List<BEChartData> positiveChartValues;

    public BreakEvenChartOutputData(double d10, @NotNull List<BEChartData> positiveChartValues, @NotNull List<BEChartData> negativeChartValues, BEChartData bEChartData, BEChartData bEChartData2, BEChartData bEChartData3, boolean z10) {
        Intrinsics.checkNotNullParameter(positiveChartValues, "positiveChartValues");
        Intrinsics.checkNotNullParameter(negativeChartValues, "negativeChartValues");
        this.maxY = d10;
        this.positiveChartValues = positiveChartValues;
        this.negativeChartValues = negativeChartValues;
        this.breakEvenMarkerPointValue = bEChartData;
        this.maxLossMarkerPointValue = bEChartData2;
        this.maxProfitMarkerPointValue = bEChartData3;
        this.isChartPlottable = z10;
    }

    /* renamed from: component1, reason: from getter */
    public final double getMaxY() {
        return this.maxY;
    }

    @NotNull
    public final List<BEChartData> component2() {
        return this.positiveChartValues;
    }

    @NotNull
    public final List<BEChartData> component3() {
        return this.negativeChartValues;
    }

    /* renamed from: component4, reason: from getter */
    public final BEChartData getBreakEvenMarkerPointValue() {
        return this.breakEvenMarkerPointValue;
    }

    /* renamed from: component5, reason: from getter */
    public final BEChartData getMaxLossMarkerPointValue() {
        return this.maxLossMarkerPointValue;
    }

    /* renamed from: component6, reason: from getter */
    public final BEChartData getMaxProfitMarkerPointValue() {
        return this.maxProfitMarkerPointValue;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsChartPlottable() {
        return this.isChartPlottable;
    }

    @NotNull
    public final BreakEvenChartOutputData copy(double maxY, @NotNull List<BEChartData> positiveChartValues, @NotNull List<BEChartData> negativeChartValues, BEChartData breakEvenMarkerPointValue, BEChartData maxLossMarkerPointValue, BEChartData maxProfitMarkerPointValue, boolean isChartPlottable) {
        Intrinsics.checkNotNullParameter(positiveChartValues, "positiveChartValues");
        Intrinsics.checkNotNullParameter(negativeChartValues, "negativeChartValues");
        return new BreakEvenChartOutputData(maxY, positiveChartValues, negativeChartValues, breakEvenMarkerPointValue, maxLossMarkerPointValue, maxProfitMarkerPointValue, isChartPlottable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakEvenChartOutputData)) {
            return false;
        }
        BreakEvenChartOutputData breakEvenChartOutputData = (BreakEvenChartOutputData) other;
        return Double.compare(this.maxY, breakEvenChartOutputData.maxY) == 0 && Intrinsics.a(this.positiveChartValues, breakEvenChartOutputData.positiveChartValues) && Intrinsics.a(this.negativeChartValues, breakEvenChartOutputData.negativeChartValues) && Intrinsics.a(this.breakEvenMarkerPointValue, breakEvenChartOutputData.breakEvenMarkerPointValue) && Intrinsics.a(this.maxLossMarkerPointValue, breakEvenChartOutputData.maxLossMarkerPointValue) && Intrinsics.a(this.maxProfitMarkerPointValue, breakEvenChartOutputData.maxProfitMarkerPointValue) && this.isChartPlottable == breakEvenChartOutputData.isChartPlottable;
    }

    public final BEChartData getBreakEvenMarkerPointValue() {
        return this.breakEvenMarkerPointValue;
    }

    public final BEChartData getMaxLossMarkerPointValue() {
        return this.maxLossMarkerPointValue;
    }

    public final BEChartData getMaxProfitMarkerPointValue() {
        return this.maxProfitMarkerPointValue;
    }

    public final double getMaxY() {
        return this.maxY;
    }

    @NotNull
    public final List<BEChartData> getNegativeChartValues() {
        return this.negativeChartValues;
    }

    @NotNull
    public final List<BEChartData> getPositiveChartValues() {
        return this.positiveChartValues;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int e10 = d.e(this.negativeChartValues, d.e(this.positiveChartValues, Double.hashCode(this.maxY) * 31, 31), 31);
        BEChartData bEChartData = this.breakEvenMarkerPointValue;
        int i10 = 0;
        if (bEChartData == null) {
            hashCode = 0;
        } else {
            hashCode = bEChartData.hashCode();
        }
        int i11 = (e10 + hashCode) * 31;
        BEChartData bEChartData2 = this.maxLossMarkerPointValue;
        if (bEChartData2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bEChartData2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        BEChartData bEChartData3 = this.maxProfitMarkerPointValue;
        if (bEChartData3 != null) {
            i10 = bEChartData3.hashCode();
        }
        return Boolean.hashCode(this.isChartPlottable) + ((i12 + i10) * 31);
    }

    public final boolean isChartPlottable() {
        return this.isChartPlottable;
    }

    @NotNull
    public String toString() {
        return "BreakEvenChartOutputData(maxY=" + this.maxY + ", positiveChartValues=" + this.positiveChartValues + ", negativeChartValues=" + this.negativeChartValues + ", breakEvenMarkerPointValue=" + this.breakEvenMarkerPointValue + ", maxLossMarkerPointValue=" + this.maxLossMarkerPointValue + ", maxProfitMarkerPointValue=" + this.maxProfitMarkerPointValue + ", isChartPlottable=" + this.isChartPlottable + ")";
    }

    public /* synthetic */ BreakEvenChartOutputData(double d10, List list, List list2, BEChartData bEChartData, BEChartData bEChartData2, BEChartData bEChartData3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, list, list2, (i10 & 8) != 0 ? null : bEChartData, (i10 & 16) != 0 ? null : bEChartData2, (i10 & 32) != 0 ? null : bEChartData3, z10);
    }
}
