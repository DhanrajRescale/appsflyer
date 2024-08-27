package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/LeagueReportRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "leagueId", HttpUrl.FRAGMENT_ENCODE_SET, "comment", "(Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getLeagueId", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LeagueReportRequestDto {
    public static final int $stable = 0;

    @SerializedName("comment")
    @NotNull
    private final String comment;

    @SerializedName("game_id")
    @NotNull
    private final String leagueId;

    public LeagueReportRequestDto(@NotNull String leagueId, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.leagueId = leagueId;
        this.comment = comment;
    }

    public static /* synthetic */ LeagueReportRequestDto copy$default(LeagueReportRequestDto leagueReportRequestDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = leagueReportRequestDto.leagueId;
        }
        if ((i10 & 2) != 0) {
            str2 = leagueReportRequestDto.comment;
        }
        return leagueReportRequestDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final LeagueReportRequestDto copy(@NotNull String leagueId, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new LeagueReportRequestDto(leagueId, comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueReportRequestDto)) {
            return false;
        }
        LeagueReportRequestDto leagueReportRequestDto = (LeagueReportRequestDto) other;
        return Intrinsics.a(this.leagueId, leagueReportRequestDto.leagueId) && Intrinsics.a(this.comment, leagueReportRequestDto.comment);
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    public int hashCode() {
        return this.comment.hashCode() + (this.leagueId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("LeagueReportRequestDto(leagueId=", this.leagueId, ", comment=", this.comment, ")");
    }
}
