package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/Stats;", HttpUrl.FRAGMENT_ENCODE_SET, "won", HttpUrl.FRAGMENT_ENCODE_SET, "joined", "played", "exited", "winningPercentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExited", "()Ljava/lang/String;", "getJoined", "getPlayed", "getWinningPercentage", "getWon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Stats {
    public static final int $stable = 0;

    @SerializedName("exited")
    @NotNull
    private final String exited;

    @SerializedName("joined")
    @NotNull
    private final String joined;

    @SerializedName("played")
    @NotNull
    private final String played;

    @SerializedName("winning_percentage")
    @NotNull
    private final String winningPercentage;

    @SerializedName("won")
    @NotNull
    private final String won;

    public Stats(@NotNull String won, @NotNull String joined, @NotNull String played, @NotNull String exited, @NotNull String winningPercentage) {
        Intrinsics.checkNotNullParameter(won, "won");
        Intrinsics.checkNotNullParameter(joined, "joined");
        Intrinsics.checkNotNullParameter(played, "played");
        Intrinsics.checkNotNullParameter(exited, "exited");
        Intrinsics.checkNotNullParameter(winningPercentage, "winningPercentage");
        this.won = won;
        this.joined = joined;
        this.played = played;
        this.exited = exited;
        this.winningPercentage = winningPercentage;
    }

    public static /* synthetic */ Stats copy$default(Stats stats, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stats.won;
        }
        if ((i10 & 2) != 0) {
            str2 = stats.joined;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = stats.played;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = stats.exited;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = stats.winningPercentage;
        }
        return stats.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWon() {
        return this.won;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getJoined() {
        return this.joined;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlayed() {
        return this.played;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getExited() {
        return this.exited;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getWinningPercentage() {
        return this.winningPercentage;
    }

    @NotNull
    public final Stats copy(@NotNull String won, @NotNull String joined, @NotNull String played, @NotNull String exited, @NotNull String winningPercentage) {
        Intrinsics.checkNotNullParameter(won, "won");
        Intrinsics.checkNotNullParameter(joined, "joined");
        Intrinsics.checkNotNullParameter(played, "played");
        Intrinsics.checkNotNullParameter(exited, "exited");
        Intrinsics.checkNotNullParameter(winningPercentage, "winningPercentage");
        return new Stats(won, joined, played, exited, winningPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stats)) {
            return false;
        }
        Stats stats = (Stats) other;
        return Intrinsics.a(this.won, stats.won) && Intrinsics.a(this.joined, stats.joined) && Intrinsics.a(this.played, stats.played) && Intrinsics.a(this.exited, stats.exited) && Intrinsics.a(this.winningPercentage, stats.winningPercentage);
    }

    @NotNull
    public final String getExited() {
        return this.exited;
    }

    @NotNull
    public final String getJoined() {
        return this.joined;
    }

    @NotNull
    public final String getPlayed() {
        return this.played;
    }

    @NotNull
    public final String getWinningPercentage() {
        return this.winningPercentage;
    }

    @NotNull
    public final String getWon() {
        return this.won;
    }

    public int hashCode() {
        return this.winningPercentage.hashCode() + h.g(this.exited, h.g(this.played, h.g(this.joined, this.won.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.won;
        String str2 = this.joined;
        String str3 = this.played;
        String str4 = this.exited;
        String str5 = this.winningPercentage;
        StringBuilder l10 = e.l("Stats(won=", str, ", joined=", str2, ", played=");
        e.v(l10, str3, ", exited=", str4, ", winningPercentage=");
        return d.o(l10, str5, ")");
    }
}
