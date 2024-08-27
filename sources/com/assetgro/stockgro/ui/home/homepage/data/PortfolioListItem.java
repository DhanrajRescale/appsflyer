package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0089\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00064"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/PortfolioListItem;", HttpUrl.FRAGMENT_ENCODE_SET, "redirectionUrl", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", "portfolioStatus", "portfolioValue", "cashBalance", "investedAmount", "totalReturn", "Lcom/assetgro/stockgro/ui/home/homepage/data/TotalReturn;", "assetClass", "assetClassText", "footerCta", "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "valueCta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/data/TotalReturn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;Ljava/lang/String;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getAssetClass", "()Ljava/lang/String;", "getAssetClassText", "getCashBalance", "getFooterCta", "getInvestedAmount", "getPortfolioName", "getPortfolioStatus", "getPortfolioValue", "getRedirectionUrl", "getTotalReturn", "()Lcom/assetgro/stockgro/ui/home/homepage/data/TotalReturn;", "getValueCta", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioListItem {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName("asset_class")
    @NotNull
    private final String assetClass;

    @SerializedName("asset_class_text")
    @NotNull
    private final String assetClassText;

    @SerializedName("cash_balance")
    private final String cashBalance;

    @SerializedName("footer_cta")
    @NotNull
    private final String footerCta;

    @SerializedName("invested_amount")
    @NotNull
    private final String investedAmount;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    @SerializedName("portfolio_status")
    @NotNull
    private final String portfolioStatus;

    @SerializedName("portfolio_value")
    private final String portfolioValue;

    @SerializedName("redirection_url")
    @NotNull
    private final String redirectionUrl;

    @SerializedName("total_returns")
    @NotNull
    private final TotalReturn totalReturn;

    @SerializedName("value_cta")
    private final String valueCta;

    public PortfolioListItem(@NotNull String redirectionUrl, @NotNull String portfolioName, @NotNull String portfolioStatus, String str, String str2, @NotNull String investedAmount, @NotNull TotalReturn totalReturn, @NotNull String assetClass, @NotNull String assetClassText, @NotNull String footerCta, Analytics analytics, String str3) {
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(investedAmount, "investedAmount");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(assetClassText, "assetClassText");
        Intrinsics.checkNotNullParameter(footerCta, "footerCta");
        this.redirectionUrl = redirectionUrl;
        this.portfolioName = portfolioName;
        this.portfolioStatus = portfolioStatus;
        this.portfolioValue = str;
        this.cashBalance = str2;
        this.investedAmount = investedAmount;
        this.totalReturn = totalReturn;
        this.assetClass = assetClass;
        this.assetClassText = assetClassText;
        this.footerCta = footerCta;
        this.analytics = analytics;
        this.valueCta = str3;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getFooterCta() {
        return this.footerCta;
    }

    /* renamed from: component11, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    /* renamed from: component12, reason: from getter */
    public final String getValueCta() {
        return this.valueCta;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getAssetClassText() {
        return this.assetClassText;
    }

    @NotNull
    public final PortfolioListItem copy(@NotNull String redirectionUrl, @NotNull String portfolioName, @NotNull String portfolioStatus, String portfolioValue, String cashBalance, @NotNull String investedAmount, @NotNull TotalReturn totalReturn, @NotNull String assetClass, @NotNull String assetClassText, @NotNull String footerCta, Analytics analytics, String valueCta) {
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(investedAmount, "investedAmount");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(assetClassText, "assetClassText");
        Intrinsics.checkNotNullParameter(footerCta, "footerCta");
        return new PortfolioListItem(redirectionUrl, portfolioName, portfolioStatus, portfolioValue, cashBalance, investedAmount, totalReturn, assetClass, assetClassText, footerCta, analytics, valueCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioListItem)) {
            return false;
        }
        PortfolioListItem portfolioListItem = (PortfolioListItem) other;
        return Intrinsics.a(this.redirectionUrl, portfolioListItem.redirectionUrl) && Intrinsics.a(this.portfolioName, portfolioListItem.portfolioName) && Intrinsics.a(this.portfolioStatus, portfolioListItem.portfolioStatus) && Intrinsics.a(this.portfolioValue, portfolioListItem.portfolioValue) && Intrinsics.a(this.cashBalance, portfolioListItem.cashBalance) && Intrinsics.a(this.investedAmount, portfolioListItem.investedAmount) && Intrinsics.a(this.totalReturn, portfolioListItem.totalReturn) && Intrinsics.a(this.assetClass, portfolioListItem.assetClass) && Intrinsics.a(this.assetClassText, portfolioListItem.assetClassText) && Intrinsics.a(this.footerCta, portfolioListItem.footerCta) && Intrinsics.a(this.analytics, portfolioListItem.analytics) && Intrinsics.a(this.valueCta, portfolioListItem.valueCta);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final String getAssetClassText() {
        return this.assetClassText;
    }

    public final String getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    public final String getFooterCta() {
        return this.footerCta;
    }

    @NotNull
    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final TotalReturn getTotalReturn() {
        return this.totalReturn;
    }

    public final String getValueCta() {
        return this.valueCta;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int g10 = h.g(this.portfolioStatus, h.g(this.portfolioName, this.redirectionUrl.hashCode() * 31, 31), 31);
        String str = this.portfolioValue;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.cashBalance;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int g11 = h.g(this.footerCta, h.g(this.assetClassText, h.g(this.assetClass, (this.totalReturn.hashCode() + h.g(this.investedAmount, (i11 + hashCode2) * 31, 31)) * 31, 31), 31), 31);
        Analytics analytics = this.analytics;
        if (analytics == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = analytics.hashCode();
        }
        int i12 = (g11 + hashCode3) * 31;
        String str3 = this.valueCta;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.redirectionUrl;
        String str2 = this.portfolioName;
        String str3 = this.portfolioStatus;
        String str4 = this.portfolioValue;
        String str5 = this.cashBalance;
        String str6 = this.investedAmount;
        TotalReturn totalReturn = this.totalReturn;
        String str7 = this.assetClass;
        String str8 = this.assetClassText;
        String str9 = this.footerCta;
        Analytics analytics = this.analytics;
        String str10 = this.valueCta;
        StringBuilder l10 = e.l("PortfolioListItem(redirectionUrl=", str, ", portfolioName=", str2, ", portfolioStatus=");
        e.v(l10, str3, ", portfolioValue=", str4, ", cashBalance=");
        e.v(l10, str5, ", investedAmount=", str6, ", totalReturn=");
        l10.append(totalReturn);
        l10.append(", assetClass=");
        l10.append(str7);
        l10.append(", assetClassText=");
        e.v(l10, str8, ", footerCta=", str9, ", analytics=");
        l10.append(analytics);
        l10.append(", valueCta=");
        l10.append(str10);
        l10.append(")");
        return l10.toString();
    }
}
