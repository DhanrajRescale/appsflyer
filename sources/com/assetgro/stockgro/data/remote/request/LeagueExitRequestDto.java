package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/LeagueExitRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "leagueId", HttpUrl.FRAGMENT_ENCODE_SET, "exitReason", "assetClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetClass", "()Ljava/lang/String;", "getExitReason", "getLeagueId", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LeagueExitRequestDto {
    public static final int $stable = 0;

    @SerializedName("asset_class")
    private final String assetClass;

    @SerializedName("reason")
    @NotNull
    private final String exitReason;

    @SerializedName("game_id")
    @NotNull
    private final String leagueId;

    public LeagueExitRequestDto(@NotNull String leagueId, @NotNull String exitReason, String str) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(exitReason, "exitReason");
        this.leagueId = leagueId;
        this.exitReason = exitReason;
        this.assetClass = str;
    }

    public static /* synthetic */ LeagueExitRequestDto copy$default(LeagueExitRequestDto leagueExitRequestDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = leagueExitRequestDto.leagueId;
        }
        if ((i10 & 2) != 0) {
            str2 = leagueExitRequestDto.exitReason;
        }
        if ((i10 & 4) != 0) {
            str3 = leagueExitRequestDto.assetClass;
        }
        return leagueExitRequestDto.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getExitReason() {
        return this.exitReason;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final LeagueExitRequestDto copy(@NotNull String leagueId, @NotNull String exitReason, String assetClass) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(exitReason, "exitReason");
        return new LeagueExitRequestDto(leagueId, exitReason, assetClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeagueExitRequestDto)) {
            return false;
        }
        LeagueExitRequestDto leagueExitRequestDto = (LeagueExitRequestDto) other;
        return Intrinsics.a(this.leagueId, leagueExitRequestDto.leagueId) && Intrinsics.a(this.exitReason, leagueExitRequestDto.exitReason) && Intrinsics.a(this.assetClass, leagueExitRequestDto.assetClass);
    }

    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final String getExitReason() {
        return this.exitReason;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.exitReason, this.leagueId.hashCode() * 31, 31);
        String str = this.assetClass;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.leagueId;
        String str2 = this.exitReason;
        return d.o(e.l("LeagueExitRequestDto(leagueId=", str, ", exitReason=", str2, ", assetClass="), this.assetClass, ")");
    }
}
