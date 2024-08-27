package com.assetgro.stockgro.ui.portfolio.v2.domain.model;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/Portfolio;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", "portfolioStatus", "portfolioValue", "cashBalance", "investedAmount", "totalReturn", "Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/TotalReturn;", "assetClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/TotalReturn;Ljava/lang/String;)V", "getAssetClass", "()Ljava/lang/String;", "getCashBalance", "getInvestedAmount", "getPortfolioId", "getPortfolioName", "getPortfolioStatus", "getPortfolioValue", "getTotalReturn", "()Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/TotalReturn;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Portfolio {
    public static final int $stable = 0;
    private final String assetClass;

    @NotNull
    private final String cashBalance;

    @NotNull
    private final String investedAmount;

    @NotNull
    private final String portfolioId;
    private final String portfolioName;

    @NotNull
    private final String portfolioStatus;

    @NotNull
    private final String portfolioValue;
    private final TotalReturn totalReturn;

    public Portfolio(@NotNull String portfolioId, String str, @NotNull String portfolioStatus, @NotNull String portfolioValue, @NotNull String cashBalance, @NotNull String investedAmount, TotalReturn totalReturn, String str2) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(cashBalance, "cashBalance");
        Intrinsics.checkNotNullParameter(investedAmount, "investedAmount");
        this.portfolioId = portfolioId;
        this.portfolioName = str;
        this.portfolioStatus = portfolioStatus;
        this.portfolioValue = portfolioValue;
        this.cashBalance = cashBalance;
        this.investedAmount = investedAmount;
        this.totalReturn = totalReturn;
        this.assetClass = str2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final Portfolio copy(@NotNull String portfolioId, String portfolioName, @NotNull String portfolioStatus, @NotNull String portfolioValue, @NotNull String cashBalance, @NotNull String investedAmount, TotalReturn totalReturn, String assetClass) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(cashBalance, "cashBalance");
        Intrinsics.checkNotNullParameter(investedAmount, "investedAmount");
        return new Portfolio(portfolioId, portfolioName, portfolioStatus, portfolioValue, cashBalance, investedAmount, totalReturn, assetClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Portfolio)) {
            return false;
        }
        Portfolio portfolio = (Portfolio) other;
        return Intrinsics.a(this.portfolioId, portfolio.portfolioId) && Intrinsics.a(this.portfolioName, portfolio.portfolioName) && Intrinsics.a(this.portfolioStatus, portfolio.portfolioStatus) && Intrinsics.a(this.portfolioValue, portfolio.portfolioValue) && Intrinsics.a(this.cashBalance, portfolio.cashBalance) && Intrinsics.a(this.investedAmount, portfolio.investedAmount) && Intrinsics.a(this.totalReturn, portfolio.totalReturn) && Intrinsics.a(this.assetClass, portfolio.assetClass);
    }

    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final String getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    @NotNull
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    public final TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.portfolioId.hashCode() * 31;
        String str = this.portfolioName;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.investedAmount, h.g(this.cashBalance, h.g(this.portfolioValue, h.g(this.portfolioStatus, (hashCode3 + hashCode) * 31, 31), 31), 31), 31);
        TotalReturn totalReturn = this.totalReturn;
        if (totalReturn == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = totalReturn.hashCode();
        }
        int i11 = (g10 + hashCode2) * 31;
        String str2 = this.assetClass;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.portfolioId;
        String str2 = this.portfolioName;
        String str3 = this.portfolioStatus;
        String str4 = this.portfolioValue;
        String str5 = this.cashBalance;
        String str6 = this.investedAmount;
        TotalReturn totalReturn = this.totalReturn;
        String str7 = this.assetClass;
        StringBuilder l10 = e.l("Portfolio(portfolioId=", str, ", portfolioName=", str2, ", portfolioStatus=");
        e.v(l10, str3, ", portfolioValue=", str4, ", cashBalance=");
        e.v(l10, str5, ", investedAmount=", str6, ", totalReturn=");
        l10.append(totalReturn);
        l10.append(", assetClass=");
        l10.append(str7);
        l10.append(")");
        return l10.toString();
    }
}
