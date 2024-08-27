package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/UnlockPortfolioRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioType", "portfolioValueLimit", HttpUrl.FRAGMENT_ENCODE_SET, "transactionFeeType", "expiry", HttpUrl.FRAGMENT_ENCODE_SET, "unlockCost", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ID)V", "getExpiry", "()I", "getPortfolioName", "()Ljava/lang/String;", "getPortfolioType", "getPortfolioValueLimit", "()J", "getTransactionFeeType", "getUnlockCost", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnlockPortfolioRequest {
    public static final int $stable = 0;

    @SerializedName("expiry")
    private final int expiry;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    @SerializedName("portfolio_type")
    @NotNull
    private final String portfolioType;

    @SerializedName("portfolio_value_limit")
    private final long portfolioValueLimit;

    @SerializedName("transaction_fee_type")
    @NotNull
    private final String transactionFeeType;

    @SerializedName("unlock_cost")
    private final double unlockCost;

    public UnlockPortfolioRequest(@NotNull String portfolioName, @NotNull String portfolioType, long j10, @NotNull String transactionFeeType, int i10, double d10) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        Intrinsics.checkNotNullParameter(transactionFeeType, "transactionFeeType");
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
        this.portfolioValueLimit = j10;
        this.transactionFeeType = transactionFeeType;
        this.expiry = i10;
        this.unlockCost = d10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioType() {
        return this.portfolioType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPortfolioValueLimit() {
        return this.portfolioValueLimit;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTransactionFeeType() {
        return this.transactionFeeType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getExpiry() {
        return this.expiry;
    }

    /* renamed from: component6, reason: from getter */
    public final double getUnlockCost() {
        return this.unlockCost;
    }

    @NotNull
    public final UnlockPortfolioRequest copy(@NotNull String portfolioName, @NotNull String portfolioType, long portfolioValueLimit, @NotNull String transactionFeeType, int expiry, double unlockCost) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        Intrinsics.checkNotNullParameter(transactionFeeType, "transactionFeeType");
        return new UnlockPortfolioRequest(portfolioName, portfolioType, portfolioValueLimit, transactionFeeType, expiry, unlockCost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockPortfolioRequest)) {
            return false;
        }
        UnlockPortfolioRequest unlockPortfolioRequest = (UnlockPortfolioRequest) other;
        return Intrinsics.a(this.portfolioName, unlockPortfolioRequest.portfolioName) && Intrinsics.a(this.portfolioType, unlockPortfolioRequest.portfolioType) && this.portfolioValueLimit == unlockPortfolioRequest.portfolioValueLimit && Intrinsics.a(this.transactionFeeType, unlockPortfolioRequest.transactionFeeType) && this.expiry == unlockPortfolioRequest.expiry && Double.compare(this.unlockCost, unlockPortfolioRequest.unlockCost) == 0;
    }

    public final int getExpiry() {
        return this.expiry;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final String getPortfolioType() {
        return this.portfolioType;
    }

    public final long getPortfolioValueLimit() {
        return this.portfolioValueLimit;
    }

    @NotNull
    public final String getTransactionFeeType() {
        return this.transactionFeeType;
    }

    public final double getUnlockCost() {
        return this.unlockCost;
    }

    public int hashCode() {
        return Double.hashCode(this.unlockCost) + e.f(this.expiry, h.g(this.transactionFeeType, v.e.c(this.portfolioValueLimit, h.g(this.portfolioType, this.portfolioName.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.portfolioName;
        String str2 = this.portfolioType;
        long j10 = this.portfolioValueLimit;
        String str3 = this.transactionFeeType;
        int i10 = this.expiry;
        double d10 = this.unlockCost;
        StringBuilder l10 = v.e.l("UnlockPortfolioRequest(portfolioName=", str, ", portfolioType=", str2, ", portfolioValueLimit=");
        l10.append(j10);
        l10.append(", transactionFeeType=");
        l10.append(str3);
        l10.append(", expiry=");
        l10.append(i10);
        l10.append(", unlockCost=");
        l10.append(d10);
        l10.append(")");
        return l10.toString();
    }
}
