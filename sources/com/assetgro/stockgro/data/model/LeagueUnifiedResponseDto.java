package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/LeagueUnifiedResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolio", "Lcom/assetgro/stockgro/data/model/UnifiedPortfolio;", "leaderBoard", "Lcom/assetgro/stockgro/data/model/LeaderBoard;", "(Lcom/assetgro/stockgro/data/model/UnifiedPortfolio;Lcom/assetgro/stockgro/data/model/LeaderBoard;)V", "getLeaderBoard", "()Lcom/assetgro/stockgro/data/model/LeaderBoard;", "getPortfolio", "()Lcom/assetgro/stockgro/data/model/UnifiedPortfolio;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LeagueUnifiedResponseDto {
    public static final int $stable = 8;

    @SerializedName("leader_board")
    @NotNull
    private final LeaderBoard leaderBoard;

    @SerializedName("portfolio")
    @NotNull
    private final UnifiedPortfolio portfolio;

    public LeagueUnifiedResponseDto(@NotNull UnifiedPortfolio portfolio, @NotNull LeaderBoard leaderBoard) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(leaderBoard, "leaderBoard");
        this.portfolio = portfolio;
        this.leaderBoard = leaderBoard;
    }

    public static /* synthetic */ LeagueUnifiedResponseDto copy$default(LeagueUnifiedResponseDto leagueUnifiedResponseDto, UnifiedPortfolio unifiedPortfolio, LeaderBoard leaderBoard, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unifiedPortfolio = leagueUnifiedResponseDto.portfolio;
        }
        if ((i10 & 2) != 0) {
            leaderBoard = leagueUnifiedResponseDto.leaderBoard;
        }
        return leagueUnifiedResponseDto.copy(unifiedPortfolio, leaderBoard);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UnifiedPortfolio getPortfolio() {
        return this.portfolio;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LeaderBoard getLeaderBoard() {
        return this.leaderBoard;
    }

    @NotNull
    public final LeagueUnifiedResponseDto copy(@NotNull UnifiedPortfolio portfolio, @NotNull LeaderBoard leaderBoard) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(leaderBoard, "leaderBoard");
        return new LeagueUnifiedResponseDto(portfolio, leaderBoard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueUnifiedResponseDto)) {
            return false;
        }
        LeagueUnifiedResponseDto leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) other;
        return Intrinsics.a(this.portfolio, leagueUnifiedResponseDto.portfolio) && Intrinsics.a(this.leaderBoard, leagueUnifiedResponseDto.leaderBoard);
    }

    @NotNull
    public final LeaderBoard getLeaderBoard() {
        return this.leaderBoard;
    }

    @NotNull
    public final UnifiedPortfolio getPortfolio() {
        return this.portfolio;
    }

    public int hashCode() {
        return this.leaderBoard.hashCode() + (this.portfolio.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LeagueUnifiedResponseDto(portfolio=" + this.portfolio + ", leaderBoard=" + this.leaderBoard + ")";
    }
}
