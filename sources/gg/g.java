package gg;

import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public final class g extends i0 {

    /* renamed from: i, reason: collision with root package name */
    public final PortfolioSectionDto f17400i;

    /* renamed from: j, reason: collision with root package name */
    public final PortfolioSectionDto f17401j;

    public g(PortfolioSectionDto portfolioSectionDto, PortfolioSectionDto portfolioSectionDto2) {
        this.f17400i = portfolioSectionDto;
        this.f17401j = portfolioSectionDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f17400i, gVar.f17400i) && Intrinsics.a(this.f17401j, gVar.f17401j);
    }

    public final int hashCode() {
        PortfolioSectionDto portfolioSectionDto = this.f17400i;
        int hashCode = (portfolioSectionDto == null ? 0 : portfolioSectionDto.hashCode()) * 31;
        PortfolioSectionDto portfolioSectionDto2 = this.f17401j;
        return hashCode + (portfolioSectionDto2 != null ? portfolioSectionDto2.hashCode() : 0);
    }

    public final String toString() {
        return "Data(modelPortfolio=" + this.f17400i + ", leaguePortfolio=" + this.f17401j + ")";
    }
}
