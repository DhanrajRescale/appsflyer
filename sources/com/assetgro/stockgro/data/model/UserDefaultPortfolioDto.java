package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserDefaultPortfolioDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolios", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UnifiedPortfolio;", "leaderBoard", "Lcom/assetgro/stockgro/data/model/LeaderBoard;", "(Ljava/util/List;Lcom/assetgro/stockgro/data/model/LeaderBoard;)V", "getLeaderBoard", "()Lcom/assetgro/stockgro/data/model/LeaderBoard;", "getPortfolios", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserDefaultPortfolioDto {
    public static final int $stable = 8;

    @SerializedName("leader_board")
    @NotNull
    private final LeaderBoard leaderBoard;

    @SerializedName("portfolios")
    @NotNull
    private final List<UnifiedPortfolio> portfolios;

    public UserDefaultPortfolioDto(@NotNull List<UnifiedPortfolio> portfolios, @NotNull LeaderBoard leaderBoard) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        Intrinsics.checkNotNullParameter(leaderBoard, "leaderBoard");
        this.portfolios = portfolios;
        this.leaderBoard = leaderBoard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserDefaultPortfolioDto copy$default(UserDefaultPortfolioDto userDefaultPortfolioDto, List list, LeaderBoard leaderBoard, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = userDefaultPortfolioDto.portfolios;
        }
        if ((i10 & 2) != 0) {
            leaderBoard = userDefaultPortfolioDto.leaderBoard;
        }
        return userDefaultPortfolioDto.copy(list, leaderBoard);
    }

    @NotNull
    public final List<UnifiedPortfolio> component1() {
        return this.portfolios;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LeaderBoard getLeaderBoard() {
        return this.leaderBoard;
    }

    @NotNull
    public final UserDefaultPortfolioDto copy(@NotNull List<UnifiedPortfolio> portfolios, @NotNull LeaderBoard leaderBoard) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        Intrinsics.checkNotNullParameter(leaderBoard, "leaderBoard");
        return new UserDefaultPortfolioDto(portfolios, leaderBoard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDefaultPortfolioDto)) {
            return false;
        }
        UserDefaultPortfolioDto userDefaultPortfolioDto = (UserDefaultPortfolioDto) other;
        return Intrinsics.a(this.portfolios, userDefaultPortfolioDto.portfolios) && Intrinsics.a(this.leaderBoard, userDefaultPortfolioDto.leaderBoard);
    }

    @NotNull
    public final LeaderBoard getLeaderBoard() {
        return this.leaderBoard;
    }

    @NotNull
    public final List<UnifiedPortfolio> getPortfolios() {
        return this.portfolios;
    }

    public int hashCode() {
        return this.leaderBoard.hashCode() + (this.portfolios.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserDefaultPortfolioDto(portfolios=" + this.portfolios + ", leaderBoard=" + this.leaderBoard + ")";
    }
}
