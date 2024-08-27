package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/BreakEvenChartInputData;", HttpUrl.FRAGMENT_ENCODE_SET, "isSell", HttpUrl.FRAGMENT_ENCODE_SET, "premium", HttpUrl.FRAGMENT_ENCODE_SET, "breakEven", "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "optionType", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "optionName", HttpUrl.FRAGMENT_ENCODE_SET, "parentStockPrice", "(ZDDILcom/assetgro/stockgro/feature_market/domain/model/OptionType;Ljava/lang/String;D)V", "getBreakEven", "()D", "()Z", "getLotSize", "()I", "getOptionName", "()Ljava/lang/String;", "getOptionType", "()Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "getParentStockPrice", "getPremium", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BreakEvenChartInputData {
    public static final int $stable = 0;
    private final double breakEven;
    private final boolean isSell;
    private final int lotSize;

    @NotNull
    private final String optionName;

    @NotNull
    private final OptionType optionType;
    private final double parentStockPrice;
    private final double premium;

    public BreakEvenChartInputData(boolean z10, double d10, double d11, int i10, @NotNull OptionType optionType, @NotNull String optionName, double d12) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        this.isSell = z10;
        this.premium = d10;
        this.breakEven = d11;
        this.lotSize = i10;
        this.optionType = optionType;
        this.optionName = optionName;
        this.parentStockPrice = d12;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSell() {
        return this.isSell;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPremium() {
        return this.premium;
    }

    /* renamed from: component3, reason: from getter */
    public final double getBreakEven() {
        return this.breakEven;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final OptionType getOptionType() {
        return this.optionType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getOptionName() {
        return this.optionName;
    }

    /* renamed from: component7, reason: from getter */
    public final double getParentStockPrice() {
        return this.parentStockPrice;
    }

    @NotNull
    public final BreakEvenChartInputData copy(boolean isSell, double premium, double breakEven, int lotSize, @NotNull OptionType optionType, @NotNull String optionName, double parentStockPrice) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        return new BreakEvenChartInputData(isSell, premium, breakEven, lotSize, optionType, optionName, parentStockPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakEvenChartInputData)) {
            return false;
        }
        BreakEvenChartInputData breakEvenChartInputData = (BreakEvenChartInputData) other;
        return this.isSell == breakEvenChartInputData.isSell && Double.compare(this.premium, breakEvenChartInputData.premium) == 0 && Double.compare(this.breakEven, breakEvenChartInputData.breakEven) == 0 && this.lotSize == breakEvenChartInputData.lotSize && this.optionType == breakEvenChartInputData.optionType && Intrinsics.a(this.optionName, breakEvenChartInputData.optionName) && Double.compare(this.parentStockPrice, breakEvenChartInputData.parentStockPrice) == 0;
    }

    public final double getBreakEven() {
        return this.breakEven;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    @NotNull
    public final String getOptionName() {
        return this.optionName;
    }

    @NotNull
    public final OptionType getOptionType() {
        return this.optionType;
    }

    public final double getParentStockPrice() {
        return this.parentStockPrice;
    }

    public final double getPremium() {
        return this.premium;
    }

    public int hashCode() {
        return Double.hashCode(this.parentStockPrice) + h.g(this.optionName, (this.optionType.hashCode() + e.f(this.lotSize, d.c(this.breakEven, d.c(this.premium, Boolean.hashCode(this.isSell) * 31, 31), 31), 31)) * 31, 31);
    }

    public final boolean isSell() {
        return this.isSell;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.isSell;
        double d10 = this.premium;
        double d11 = this.breakEven;
        int i10 = this.lotSize;
        OptionType optionType = this.optionType;
        String str = this.optionName;
        double d12 = this.parentStockPrice;
        StringBuilder sb2 = new StringBuilder("BreakEvenChartInputData(isSell=");
        sb2.append(z10);
        sb2.append(", premium=");
        sb2.append(d10);
        a.v(sb2, ", breakEven=", d11, ", lotSize=");
        sb2.append(i10);
        sb2.append(", optionType=");
        sb2.append(optionType);
        sb2.append(", optionName=");
        sb2.append(str);
        sb2.append(", parentStockPrice=");
        sb2.append(d12);
        sb2.append(")");
        return sb2.toString();
    }
}
