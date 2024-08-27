package com.assetgro.stockgro.data.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J}\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/assetgro/stockgro/data/model/TopLeaguesDto;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "leagueId", "frequency", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioSubmissionTime", "endDate", "order", HttpUrl.FRAGMENT_ENCODE_SET, "winners", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/WinnersDto;", "currentUser", "Lcom/assetgro/stockgro/data/model/CurrentUser;", "totalPages", "packageTag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJILjava/util/List;Lcom/assetgro/stockgro/data/model/CurrentUser;ILjava/lang/String;)V", "getCurrentUser", "()Lcom/assetgro/stockgro/data/model/CurrentUser;", "getEndDate", "()J", "getFrequency", "()Ljava/lang/String;", "getLeagueId", "getName", "getOrder", "()I", "getPackageTag", "getPortfolioSubmissionTime", "getStartDate", "getTotalPages", "getWinners", "()Ljava/util/List;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TopLeaguesDto {
    public static final int $stable = 8;

    @SerializedName("current_user")
    @NotNull
    private final CurrentUser currentUser;

    @SerializedName("end_date")
    private final long endDate;

    @SerializedName("frequency")
    @NotNull
    private final String frequency;

    @SerializedName("league_id")
    @NotNull
    private final String leagueId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("order")
    private final int order;

    @SerializedName("package_tag")
    @NotNull
    private final String packageTag;

    @SerializedName("portfolio_submission_time")
    private final long portfolioSubmissionTime;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName("total_pages")
    private final int totalPages;

    @SerializedName("winners")
    @NotNull
    private final List<WinnersDto> winners;

    public TopLeaguesDto(@NotNull String name, @NotNull String leagueId, @NotNull String frequency, long j10, long j11, long j12, int i10, @NotNull List<WinnersDto> winners, @NotNull CurrentUser currentUser, int i11, @NotNull String packageTag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(winners, "winners");
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        Intrinsics.checkNotNullParameter(packageTag, "packageTag");
        this.name = name;
        this.leagueId = leagueId;
        this.frequency = frequency;
        this.startDate = j10;
        this.portfolioSubmissionTime = j11;
        this.endDate = j12;
        this.order = i10;
        this.winners = winners;
        this.currentUser = currentUser;
        this.totalPages = i11;
        this.packageTag = packageTag;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getPackageTag() {
        return this.packageTag;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPortfolioSubmissionTime() {
        return this.portfolioSubmissionTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final List<WinnersDto> component8() {
        return this.winners;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CurrentUser getCurrentUser() {
        return this.currentUser;
    }

    @NotNull
    public final TopLeaguesDto copy(@NotNull String name, @NotNull String leagueId, @NotNull String frequency, long startDate, long portfolioSubmissionTime, long endDate, int order, @NotNull List<WinnersDto> winners, @NotNull CurrentUser currentUser, int totalPages, @NotNull String packageTag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(winners, "winners");
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        Intrinsics.checkNotNullParameter(packageTag, "packageTag");
        return new TopLeaguesDto(name, leagueId, frequency, startDate, portfolioSubmissionTime, endDate, order, winners, currentUser, totalPages, packageTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopLeaguesDto)) {
            return false;
        }
        TopLeaguesDto topLeaguesDto = (TopLeaguesDto) other;
        return Intrinsics.a(this.name, topLeaguesDto.name) && Intrinsics.a(this.leagueId, topLeaguesDto.leagueId) && Intrinsics.a(this.frequency, topLeaguesDto.frequency) && this.startDate == topLeaguesDto.startDate && this.portfolioSubmissionTime == topLeaguesDto.portfolioSubmissionTime && this.endDate == topLeaguesDto.endDate && this.order == topLeaguesDto.order && Intrinsics.a(this.winners, topLeaguesDto.winners) && Intrinsics.a(this.currentUser, topLeaguesDto.currentUser) && this.totalPages == topLeaguesDto.totalPages && Intrinsics.a(this.packageTag, topLeaguesDto.packageTag);
    }

    @NotNull
    public final CurrentUser getCurrentUser() {
        return this.currentUser;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final String getPackageTag() {
        return this.packageTag;
    }

    public final long getPortfolioSubmissionTime() {
        return this.portfolioSubmissionTime;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    @NotNull
    public final List<WinnersDto> getWinners() {
        return this.winners;
    }

    public int hashCode() {
        return this.packageTag.hashCode() + e.f(this.totalPages, (this.currentUser.hashCode() + d.e(this.winners, e.f(this.order, v.e.c(this.endDate, v.e.c(this.portfolioSubmissionTime, v.e.c(this.startDate, h.g(this.frequency, h.g(this.leagueId, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.leagueId;
        String str3 = this.frequency;
        long j10 = this.startDate;
        long j11 = this.portfolioSubmissionTime;
        long j12 = this.endDate;
        int i10 = this.order;
        List<WinnersDto> list = this.winners;
        CurrentUser currentUser = this.currentUser;
        int i11 = this.totalPages;
        String str4 = this.packageTag;
        StringBuilder l10 = v.e.l("TopLeaguesDto(name=", str, ", leagueId=", str2, ", frequency=");
        l10.append(str3);
        l10.append(", startDate=");
        l10.append(j10);
        l10.append(", portfolioSubmissionTime=");
        l10.append(j11);
        l10.append(", endDate=");
        l10.append(j12);
        l10.append(", order=");
        l10.append(i10);
        l10.append(", winners=");
        l10.append(list);
        l10.append(", currentUser=");
        l10.append(currentUser);
        l10.append(", totalPages=");
        l10.append(i11);
        l10.append(", packageTag=");
        l10.append(str4);
        l10.append(")");
        return l10.toString();
    }
}
