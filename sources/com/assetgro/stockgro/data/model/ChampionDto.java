package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/data/model/ChampionDto;", HttpUrl.FRAGMENT_ENCODE_SET, "uuid", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "displayPicture", "points", "Lcom/assetgro/stockgro/data/model/PointsDto;", "gameStats", "Lcom/assetgro/stockgro/data/model/GameStatsDto;", "profits", "Lcom/assetgro/stockgro/data/model/ProfitDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/PointsDto;Lcom/assetgro/stockgro/data/model/GameStatsDto;Lcom/assetgro/stockgro/data/model/ProfitDto;)V", "getDisplayName", "()Ljava/lang/String;", "getDisplayPicture", "getGameStats", "()Lcom/assetgro/stockgro/data/model/GameStatsDto;", "getPoints", "()Lcom/assetgro/stockgro/data/model/PointsDto;", "getProfits", "()Lcom/assetgro/stockgro/data/model/ProfitDto;", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChampionDto {
    public static final int $stable = 0;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("display_picture")
    @NotNull
    private final String displayPicture;

    @SerializedName("game_stats")
    @NotNull
    private final GameStatsDto gameStats;

    @SerializedName("points")
    @NotNull
    private final PointsDto points;

    @SerializedName("profit")
    @NotNull
    private final ProfitDto profits;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    public ChampionDto(@NotNull String uuid, @NotNull String displayName, @NotNull String displayPicture, @NotNull PointsDto points, @NotNull GameStatsDto gameStats, @NotNull ProfitDto profits) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(gameStats, "gameStats");
        Intrinsics.checkNotNullParameter(profits, "profits");
        this.uuid = uuid;
        this.displayName = displayName;
        this.displayPicture = displayPicture;
        this.points = points;
        this.gameStats = gameStats;
        this.profits = profits;
    }

    public static /* synthetic */ ChampionDto copy$default(ChampionDto championDto, String str, String str2, String str3, PointsDto pointsDto, GameStatsDto gameStatsDto, ProfitDto profitDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = championDto.uuid;
        }
        if ((i10 & 2) != 0) {
            str2 = championDto.displayName;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = championDto.displayPicture;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            pointsDto = championDto.points;
        }
        PointsDto pointsDto2 = pointsDto;
        if ((i10 & 16) != 0) {
            gameStatsDto = championDto.gameStats;
        }
        GameStatsDto gameStatsDto2 = gameStatsDto;
        if ((i10 & 32) != 0) {
            profitDto = championDto.profits;
        }
        return championDto.copy(str, str4, str5, pointsDto2, gameStatsDto2, profitDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PointsDto getPoints() {
        return this.points;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final GameStatsDto getGameStats() {
        return this.gameStats;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ProfitDto getProfits() {
        return this.profits;
    }

    @NotNull
    public final ChampionDto copy(@NotNull String uuid, @NotNull String displayName, @NotNull String displayPicture, @NotNull PointsDto points, @NotNull GameStatsDto gameStats, @NotNull ProfitDto profits) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(gameStats, "gameStats");
        Intrinsics.checkNotNullParameter(profits, "profits");
        return new ChampionDto(uuid, displayName, displayPicture, points, gameStats, profits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChampionDto)) {
            return false;
        }
        ChampionDto championDto = (ChampionDto) other;
        return Intrinsics.a(this.uuid, championDto.uuid) && Intrinsics.a(this.displayName, championDto.displayName) && Intrinsics.a(this.displayPicture, championDto.displayPicture) && Intrinsics.a(this.points, championDto.points) && Intrinsics.a(this.gameStats, championDto.gameStats) && Intrinsics.a(this.profits, championDto.profits);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final GameStatsDto getGameStats() {
        return this.gameStats;
    }

    @NotNull
    public final PointsDto getPoints() {
        return this.points;
    }

    @NotNull
    public final ProfitDto getProfits() {
        return this.profits;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.profits.hashCode() + ((this.gameStats.hashCode() + ((this.points.hashCode() + h.g(this.displayPicture, h.g(this.displayName, this.uuid.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.displayName;
        String str3 = this.displayPicture;
        PointsDto pointsDto = this.points;
        GameStatsDto gameStatsDto = this.gameStats;
        ProfitDto profitDto = this.profits;
        StringBuilder l10 = e.l("ChampionDto(uuid=", str, ", displayName=", str2, ", displayPicture=");
        l10.append(str3);
        l10.append(", points=");
        l10.append(pointsDto);
        l10.append(", gameStats=");
        l10.append(gameStatsDto);
        l10.append(", profits=");
        l10.append(profitDto);
        l10.append(")");
        return l10.toString();
    }
}
