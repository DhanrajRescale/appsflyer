package com.assetgro.stockgro.ui.portfolio.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfoliosDto;", HttpUrl.FRAGMENT_ENCODE_SET, "modelPortfoliosSection", "Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfolioSectionDto;", "leaguePortfoliosSection", "(Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfolioSectionDto;Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfolioSectionDto;)V", "getLeaguePortfoliosSection", "()Lcom/assetgro/stockgro/ui/portfolio/v2/data/remote/PortfolioSectionDto;", "getModelPortfoliosSection", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PortfoliosDto {
    public static final int $stable = 8;

    @SerializedName("league_portfolios")
    private final PortfolioSectionDto leaguePortfoliosSection;

    @SerializedName("model_portfolios")
    private final PortfolioSectionDto modelPortfoliosSection;

    public PortfoliosDto(PortfolioSectionDto portfolioSectionDto, PortfolioSectionDto portfolioSectionDto2) {
        this.modelPortfoliosSection = portfolioSectionDto;
        this.leaguePortfoliosSection = portfolioSectionDto2;
    }

    public final PortfolioSectionDto getLeaguePortfoliosSection() {
        return this.leaguePortfoliosSection;
    }

    public final PortfolioSectionDto getModelPortfoliosSection() {
        return this.modelPortfoliosSection;
    }
}
