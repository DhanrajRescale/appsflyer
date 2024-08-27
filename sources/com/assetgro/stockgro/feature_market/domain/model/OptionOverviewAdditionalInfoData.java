package com.assetgro.stockgro.feature_market.domain.model;

import da.e;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionOverviewAdditionalInfoData;", HttpUrl.FRAGMENT_ENCODE_SET, "price", HttpUrl.FRAGMENT_ENCODE_SET, "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "totalMargin", "(DID)V", "getLotSize", "()I", "getPrice", "()D", "getTotalMargin", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionOverviewAdditionalInfoData {
    public static final int $stable = 0;
    private final int lotSize;
    private final double price;
    private final double totalMargin;

    public OptionOverviewAdditionalInfoData(double d10, int i10, double d11) {
        this.price = d10;
        this.lotSize = i10;
        this.totalMargin = d11;
    }

    public static /* synthetic */ OptionOverviewAdditionalInfoData copy$default(OptionOverviewAdditionalInfoData optionOverviewAdditionalInfoData, double d10, int i10, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = optionOverviewAdditionalInfoData.price;
        }
        double d12 = d10;
        if ((i11 & 2) != 0) {
            i10 = optionOverviewAdditionalInfoData.lotSize;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            d11 = optionOverviewAdditionalInfoData.totalMargin;
        }
        return optionOverviewAdditionalInfoData.copy(d12, i12, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTotalMargin() {
        return this.totalMargin;
    }

    @NotNull
    public final OptionOverviewAdditionalInfoData copy(double price, int lotSize, double totalMargin) {
        return new OptionOverviewAdditionalInfoData(price, lotSize, totalMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOverviewAdditionalInfoData)) {
            return false;
        }
        OptionOverviewAdditionalInfoData optionOverviewAdditionalInfoData = (OptionOverviewAdditionalInfoData) other;
        return Double.compare(this.price, optionOverviewAdditionalInfoData.price) == 0 && this.lotSize == optionOverviewAdditionalInfoData.lotSize && Double.compare(this.totalMargin, optionOverviewAdditionalInfoData.totalMargin) == 0;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getTotalMargin() {
        return this.totalMargin;
    }

    public int hashCode() {
        return Double.hashCode(this.totalMargin) + e.f(this.lotSize, Double.hashCode(this.price) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "OptionOverviewAdditionalInfoData(price=" + this.price + ", lotSize=" + this.lotSize + ", totalMargin=" + this.totalMargin + ")";
    }
}
