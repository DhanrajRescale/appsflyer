package com.assetgro.stockgro.feature_market.domain.model;

import kotlin.Metadata;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/BEChartData;", HttpUrl.FRAGMENT_ENCODE_SET, "xValue", HttpUrl.FRAGMENT_ENCODE_SET, "yValue", HttpUrl.FRAGMENT_ENCODE_SET, "itemValue", "(IDD)V", "getItemValue", "()D", "getXValue", "()I", "getYValue", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BEChartData {
    public static final int $stable = 0;
    private final double itemValue;
    private final int xValue;
    private final double yValue;

    public BEChartData(int i10, double d10, double d11) {
        this.xValue = i10;
        this.yValue = d10;
        this.itemValue = d11;
    }

    public static /* synthetic */ BEChartData copy$default(BEChartData bEChartData, int i10, double d10, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bEChartData.xValue;
        }
        if ((i11 & 2) != 0) {
            d10 = bEChartData.yValue;
        }
        double d12 = d10;
        if ((i11 & 4) != 0) {
            d11 = bEChartData.itemValue;
        }
        return bEChartData.copy(i10, d12, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getXValue() {
        return this.xValue;
    }

    /* renamed from: component2, reason: from getter */
    public final double getYValue() {
        return this.yValue;
    }

    /* renamed from: component3, reason: from getter */
    public final double getItemValue() {
        return this.itemValue;
    }

    @NotNull
    public final BEChartData copy(int xValue, double yValue, double itemValue) {
        return new BEChartData(xValue, yValue, itemValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChartData)) {
            return false;
        }
        BEChartData bEChartData = (BEChartData) other;
        return this.xValue == bEChartData.xValue && Double.compare(this.yValue, bEChartData.yValue) == 0 && Double.compare(this.itemValue, bEChartData.itemValue) == 0;
    }

    public final double getItemValue() {
        return this.itemValue;
    }

    public final int getXValue() {
        return this.xValue;
    }

    public final double getYValue() {
        return this.yValue;
    }

    public int hashCode() {
        return Double.hashCode(this.itemValue) + d.c(this.yValue, Integer.hashCode(this.xValue) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BEChartData(xValue=" + this.xValue + ", yValue=" + this.yValue + ", itemValue=" + this.itemValue + ")";
    }
}
