package com.assetgro.stockgro.data.remote.response;

import com.assetgro.stockgro.data.model.RecentPerformance;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/UserStatsAndResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stats", "Lcom/assetgro/stockgro/data/remote/response/Stats;", "performance", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/RecentPerformance;", "currentPage", HttpUrl.FRAGMENT_ENCODE_SET, "totalPages", "lifetimeEarning", "Lcom/assetgro/stockgro/data/remote/response/LifetimeEarning;", "(Lcom/assetgro/stockgro/data/remote/response/Stats;Ljava/util/List;IILcom/assetgro/stockgro/data/remote/response/LifetimeEarning;)V", "getCurrentPage", "()I", "getLifetimeEarning", "()Lcom/assetgro/stockgro/data/remote/response/LifetimeEarning;", "getPerformance", "()Ljava/util/List;", "getStats", "()Lcom/assetgro/stockgro/data/remote/response/Stats;", "getTotalPages", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserStatsAndResponseDto {
    public static final int $stable = 8;

    @SerializedName("current_page")
    private final int currentPage;

    @SerializedName("lifetime_earning")
    @NotNull
    private final LifetimeEarning lifetimeEarning;

    @SerializedName("performance")
    @NotNull
    private final List<RecentPerformance> performance;

    @SerializedName("stats")
    private final Stats stats;

    @SerializedName("total_pages")
    private final int totalPages;

    public UserStatsAndResponseDto(Stats stats, @NotNull List<RecentPerformance> performance, int i10, int i11, @NotNull LifetimeEarning lifetimeEarning) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(lifetimeEarning, "lifetimeEarning");
        this.stats = stats;
        this.performance = performance;
        this.currentPage = i10;
        this.totalPages = i11;
        this.lifetimeEarning = lifetimeEarning;
    }

    public static /* synthetic */ UserStatsAndResponseDto copy$default(UserStatsAndResponseDto userStatsAndResponseDto, Stats stats, List list, int i10, int i11, LifetimeEarning lifetimeEarning, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            stats = userStatsAndResponseDto.stats;
        }
        if ((i12 & 2) != 0) {
            list = userStatsAndResponseDto.performance;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            i10 = userStatsAndResponseDto.currentPage;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = userStatsAndResponseDto.totalPages;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            lifetimeEarning = userStatsAndResponseDto.lifetimeEarning;
        }
        return userStatsAndResponseDto.copy(stats, list2, i13, i14, lifetimeEarning);
    }

    /* renamed from: component1, reason: from getter */
    public final Stats getStats() {
        return this.stats;
    }

    @NotNull
    public final List<RecentPerformance> component2() {
        return this.performance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final LifetimeEarning getLifetimeEarning() {
        return this.lifetimeEarning;
    }

    @NotNull
    public final UserStatsAndResponseDto copy(Stats stats, @NotNull List<RecentPerformance> performance, int currentPage, int totalPages, @NotNull LifetimeEarning lifetimeEarning) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(lifetimeEarning, "lifetimeEarning");
        return new UserStatsAndResponseDto(stats, performance, currentPage, totalPages, lifetimeEarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatsAndResponseDto)) {
            return false;
        }
        UserStatsAndResponseDto userStatsAndResponseDto = (UserStatsAndResponseDto) other;
        return Intrinsics.a(this.stats, userStatsAndResponseDto.stats) && Intrinsics.a(this.performance, userStatsAndResponseDto.performance) && this.currentPage == userStatsAndResponseDto.currentPage && this.totalPages == userStatsAndResponseDto.totalPages && Intrinsics.a(this.lifetimeEarning, userStatsAndResponseDto.lifetimeEarning);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final LifetimeEarning getLifetimeEarning() {
        return this.lifetimeEarning;
    }

    @NotNull
    public final List<RecentPerformance> getPerformance() {
        return this.performance;
    }

    public final Stats getStats() {
        return this.stats;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        int hashCode;
        Stats stats = this.stats;
        if (stats == null) {
            hashCode = 0;
        } else {
            hashCode = stats.hashCode();
        }
        return this.lifetimeEarning.hashCode() + e.f(this.totalPages, e.f(this.currentPage, d.e(this.performance, hashCode * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        Stats stats = this.stats;
        List<RecentPerformance> list = this.performance;
        int i10 = this.currentPage;
        int i11 = this.totalPages;
        LifetimeEarning lifetimeEarning = this.lifetimeEarning;
        StringBuilder sb2 = new StringBuilder("UserStatsAndResponseDto(stats=");
        sb2.append(stats);
        sb2.append(", performance=");
        sb2.append(list);
        sb2.append(", currentPage=");
        h.v(sb2, i10, ", totalPages=", i11, ", lifetimeEarning=");
        sb2.append(lifetimeEarning);
        sb2.append(")");
        return sb2.toString();
    }
}
