package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hyper.constants.LogSubCategory;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/data/model/RecentPerformance;", "Landroid/os/Parcelable;", "leagueId", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "profileUrl", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "endDate", "winnerAnnounce", LogSubCategory.Action.USER, "Lcom/assetgro/stockgro/data/model/User;", "winner", "assetClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/assetgro/stockgro/data/model/User;Lcom/assetgro/stockgro/data/model/User;Ljava/lang/String;)V", "getAssetClass", "()Ljava/lang/String;", "getEndDate", "()J", "getLeagueId", "getName", "getProfileUrl", "getStartDate", "getUser", "()Lcom/assetgro/stockgro/data/model/User;", "getWinner", "getWinnerAnnounce", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecentPerformance implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RecentPerformance> CREATOR = new Creator();

    @SerializedName("asset_class")
    private final String assetClass;

    @SerializedName("end_date")
    private final long endDate;

    @SerializedName("league_id")
    @NotNull
    private final String leagueId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("profile_url")
    @NotNull
    private final String profileUrl;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName(LogSubCategory.Action.USER)
    @NotNull
    private final User user;

    @SerializedName("winner")
    @NotNull
    private final User winner;

    @SerializedName("winner_announce")
    private final long winnerAnnounce;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<RecentPerformance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RecentPerformance createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            Parcelable.Creator<User> creator = User.CREATOR;
            return new RecentPerformance(readString, readString2, readString3, readLong, readLong2, readLong3, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RecentPerformance[] newArray(int i10) {
            return new RecentPerformance[i10];
        }
    }

    public RecentPerformance(@NotNull String leagueId, @NotNull String name, @NotNull String profileUrl, long j10, long j11, long j12, @NotNull User user, @NotNull User winner, String str) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(winner, "winner");
        this.leagueId = leagueId;
        this.name = name;
        this.profileUrl = profileUrl;
        this.startDate = j10;
        this.endDate = j11;
        this.winnerAnnounce = j12;
        this.user = user;
        this.winner = winner;
        this.assetClass = str;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProfileUrl() {
        return this.profileUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* renamed from: component6, reason: from getter */
    public final long getWinnerAnnounce() {
        return this.winnerAnnounce;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final User getWinner() {
        return this.winner;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final RecentPerformance copy(@NotNull String leagueId, @NotNull String name, @NotNull String profileUrl, long startDate, long endDate, long winnerAnnounce, @NotNull User user, @NotNull User winner, String assetClass) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(winner, "winner");
        return new RecentPerformance(leagueId, name, profileUrl, startDate, endDate, winnerAnnounce, user, winner, assetClass);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentPerformance)) {
            return false;
        }
        RecentPerformance recentPerformance = (RecentPerformance) other;
        return Intrinsics.a(this.leagueId, recentPerformance.leagueId) && Intrinsics.a(this.name, recentPerformance.name) && Intrinsics.a(this.profileUrl, recentPerformance.profileUrl) && this.startDate == recentPerformance.startDate && this.endDate == recentPerformance.endDate && this.winnerAnnounce == recentPerformance.winnerAnnounce && Intrinsics.a(this.user, recentPerformance.user) && Intrinsics.a(this.winner, recentPerformance.winner) && Intrinsics.a(this.assetClass, recentPerformance.assetClass);
    }

    public final String getAssetClass() {
        return this.assetClass;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }

    @NotNull
    public final User getWinner() {
        return this.winner;
    }

    public final long getWinnerAnnounce() {
        return this.winnerAnnounce;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.winner.hashCode() + ((this.user.hashCode() + e.c(this.winnerAnnounce, e.c(this.endDate, e.c(this.startDate, h.g(this.profileUrl, h.g(this.name, this.leagueId.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31;
        String str = this.assetClass;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.leagueId;
        String str2 = this.name;
        String str3 = this.profileUrl;
        long j10 = this.startDate;
        long j11 = this.endDate;
        long j12 = this.winnerAnnounce;
        User user = this.user;
        User user2 = this.winner;
        String str4 = this.assetClass;
        StringBuilder l10 = e.l("RecentPerformance(leagueId=", str, ", name=", str2, ", profileUrl=");
        l10.append(str3);
        l10.append(", startDate=");
        l10.append(j10);
        l10.append(", endDate=");
        l10.append(j11);
        l10.append(", winnerAnnounce=");
        l10.append(j12);
        l10.append(", user=");
        l10.append(user);
        l10.append(", winner=");
        l10.append(user2);
        l10.append(", assetClass=");
        l10.append(str4);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.leagueId);
        parcel.writeString(this.name);
        parcel.writeString(this.profileUrl);
        parcel.writeLong(this.startDate);
        parcel.writeLong(this.endDate);
        parcel.writeLong(this.winnerAnnounce);
        this.user.writeToParcel(parcel, flags);
        this.winner.writeToParcel(parcel, flags);
        parcel.writeString(this.assetClass);
    }
}
