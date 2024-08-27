package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewSecondaryCallRequestData;", HttpUrl.FRAGMENT_ENCODE_SET, "symbol", HttpUrl.FRAGMENT_ENCODE_SET, "expiry", "optionType", "strikePrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExpiry", "()Ljava/lang/String;", "getOptionType", "getStrikePrice", "getSymbol", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionOverviewSecondaryCallRequestData {
    public static final int $stable = 0;
    private final String expiry;
    private final String optionType;
    private final String strikePrice;
    private final String symbol;

    public OptionOverviewSecondaryCallRequestData(String str, String str2, String str3, String str4) {
        this.symbol = str;
        this.expiry = str2;
        this.optionType = str3;
        this.strikePrice = str4;
    }

    public static /* synthetic */ OptionOverviewSecondaryCallRequestData copy$default(OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = optionOverviewSecondaryCallRequestData.symbol;
        }
        if ((i10 & 2) != 0) {
            str2 = optionOverviewSecondaryCallRequestData.expiry;
        }
        if ((i10 & 4) != 0) {
            str3 = optionOverviewSecondaryCallRequestData.optionType;
        }
        if ((i10 & 8) != 0) {
            str4 = optionOverviewSecondaryCallRequestData.strikePrice;
        }
        return optionOverviewSecondaryCallRequestData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpiry() {
        return this.expiry;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStrikePrice() {
        return this.strikePrice;
    }

    @NotNull
    public final OptionOverviewSecondaryCallRequestData copy(String symbol, String expiry, String optionType, String strikePrice) {
        return new OptionOverviewSecondaryCallRequestData(symbol, expiry, optionType, strikePrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOverviewSecondaryCallRequestData)) {
            return false;
        }
        OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData = (OptionOverviewSecondaryCallRequestData) other;
        return Intrinsics.a(this.symbol, optionOverviewSecondaryCallRequestData.symbol) && Intrinsics.a(this.expiry, optionOverviewSecondaryCallRequestData.expiry) && Intrinsics.a(this.optionType, optionOverviewSecondaryCallRequestData.optionType) && Intrinsics.a(this.strikePrice, optionOverviewSecondaryCallRequestData.strikePrice);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getOptionType() {
        return this.optionType;
    }

    public final String getStrikePrice() {
        return this.strikePrice;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiry;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.optionType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.strikePrice;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.symbol;
        String str2 = this.expiry;
        return a.k(e.l("OptionOverviewSecondaryCallRequestData(symbol=", str, ", expiry=", str2, ", optionType="), this.optionType, ", strikePrice=", this.strikePrice, ")");
    }
}
