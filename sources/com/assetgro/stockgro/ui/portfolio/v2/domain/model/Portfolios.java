package com.assetgro.stockgro.ui.portfolio.v2.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/Portfolios;", HttpUrl.FRAGMENT_ENCODE_SET, "modelPortfoliosSection", "Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/PortfolioSection;", "leaguePortfoliosSection", "(Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/PortfolioSection;Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/PortfolioSection;)V", "getLeaguePortfoliosSection", "()Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/PortfolioSection;", "getModelPortfoliosSection", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Portfolios {
    public static final int $stable = 8;
    private final PortfolioSection leaguePortfoliosSection;
    private final PortfolioSection modelPortfoliosSection;

    public Portfolios(PortfolioSection portfolioSection, PortfolioSection portfolioSection2) {
        this.modelPortfoliosSection = portfolioSection;
        this.leaguePortfoliosSection = portfolioSection2;
    }

    public static /* synthetic */ Portfolios copy$default(Portfolios portfolios, PortfolioSection portfolioSection, PortfolioSection portfolioSection2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            portfolioSection = portfolios.modelPortfoliosSection;
        }
        if ((i10 & 2) != 0) {
            portfolioSection2 = portfolios.leaguePortfoliosSection;
        }
        return portfolios.copy(portfolioSection, portfolioSection2);
    }

    /* renamed from: component1, reason: from getter */
    public final PortfolioSection getModelPortfoliosSection() {
        return this.modelPortfoliosSection;
    }

    /* renamed from: component2, reason: from getter */
    public final PortfolioSection getLeaguePortfoliosSection() {
        return this.leaguePortfoliosSection;
    }

    @NotNull
    public final Portfolios copy(PortfolioSection modelPortfoliosSection, PortfolioSection leaguePortfoliosSection) {
        return new Portfolios(modelPortfoliosSection, leaguePortfoliosSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Portfolios)) {
            return false;
        }
        Portfolios portfolios = (Portfolios) other;
        return Intrinsics.a(this.modelPortfoliosSection, portfolios.modelPortfoliosSection) && Intrinsics.a(this.leaguePortfoliosSection, portfolios.leaguePortfoliosSection);
    }

    public final PortfolioSection getLeaguePortfoliosSection() {
        return this.leaguePortfoliosSection;
    }

    public final PortfolioSection getModelPortfoliosSection() {
        return this.modelPortfoliosSection;
    }

    public int hashCode() {
        PortfolioSection portfolioSection = this.modelPortfoliosSection;
        int hashCode = (portfolioSection == null ? 0 : portfolioSection.hashCode()) * 31;
        PortfolioSection portfolioSection2 = this.leaguePortfoliosSection;
        return hashCode + (portfolioSection2 != null ? portfolioSection2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Portfolios(modelPortfoliosSection=" + this.modelPortfoliosSection + ", leaguePortfoliosSection=" + this.leaguePortfoliosSection + ")";
    }
}
