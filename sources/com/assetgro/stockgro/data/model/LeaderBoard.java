package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/model/LeaderBoard;", HttpUrl.FRAGMENT_ENCODE_SET, "leagueName", HttpUrl.FRAGMENT_ENCODE_SET, "subType", "frequency", "leaderBoardEntries", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/LeaderBoardUserDto;", "self", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/assetgro/stockgro/data/model/LeaderBoardUserDto;)V", "getFrequency", "()Ljava/lang/String;", "getLeaderBoardEntries", "()Ljava/util/List;", "getLeagueName", "getSelf", "()Lcom/assetgro/stockgro/data/model/LeaderBoardUserDto;", "getSubType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LeaderBoard {
    public static final int $stable = 8;

    @SerializedName("frequency")
    private final String frequency;

    @SerializedName("entries")
    private final List<LeaderBoardUserDto> leaderBoardEntries;

    @SerializedName("league_name")
    private final String leagueName;

    @SerializedName("self")
    @NotNull
    private final LeaderBoardUserDto self;

    @SerializedName("sub_type")
    private final String subType;

    public LeaderBoard(String str, String str2, String str3, List<LeaderBoardUserDto> list, @NotNull LeaderBoardUserDto self) {
        Intrinsics.checkNotNullParameter(self, "self");
        this.leagueName = str;
        this.subType = str2;
        this.frequency = str3;
        this.leaderBoardEntries = list;
        this.self = self;
    }

    public static /* synthetic */ LeaderBoard copy$default(LeaderBoard leaderBoard, String str, String str2, String str3, List list, LeaderBoardUserDto leaderBoardUserDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = leaderBoard.leagueName;
        }
        if ((i10 & 2) != 0) {
            str2 = leaderBoard.subType;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = leaderBoard.frequency;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            list = leaderBoard.leaderBoardEntries;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            leaderBoardUserDto = leaderBoard.self;
        }
        return leaderBoard.copy(str, str4, str5, list2, leaderBoardUserDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    public final List<LeaderBoardUserDto> component4() {
        return this.leaderBoardEntries;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final LeaderBoardUserDto getSelf() {
        return this.self;
    }

    @NotNull
    public final LeaderBoard copy(String leagueName, String subType, String frequency, List<LeaderBoardUserDto> leaderBoardEntries, @NotNull LeaderBoardUserDto self) {
        Intrinsics.checkNotNullParameter(self, "self");
        return new LeaderBoard(leagueName, subType, frequency, leaderBoardEntries, self);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderBoard)) {
            return false;
        }
        LeaderBoard leaderBoard = (LeaderBoard) other;
        return Intrinsics.a(this.leagueName, leaderBoard.leagueName) && Intrinsics.a(this.subType, leaderBoard.subType) && Intrinsics.a(this.frequency, leaderBoard.frequency) && Intrinsics.a(this.leaderBoardEntries, leaderBoard.leaderBoardEntries) && Intrinsics.a(this.self, leaderBoard.self);
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final List<LeaderBoardUserDto> getLeaderBoardEntries() {
        return this.leaderBoardEntries;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    @NotNull
    public final LeaderBoardUserDto getSelf() {
        return this.self;
    }

    public final String getSubType() {
        return this.subType;
    }

    public int hashCode() {
        String str = this.leagueName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.frequency;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LeaderBoardUserDto> list = this.leaderBoardEntries;
        return this.self.hashCode() + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.leagueName;
        String str2 = this.subType;
        String str3 = this.frequency;
        List<LeaderBoardUserDto> list = this.leaderBoardEntries;
        LeaderBoardUserDto leaderBoardUserDto = this.self;
        StringBuilder l10 = e.l("LeaderBoard(leagueName=", str, ", subType=", str2, ", frequency=");
        l10.append(str3);
        l10.append(", leaderBoardEntries=");
        l10.append(list);
        l10.append(", self=");
        l10.append(leaderBoardUserDto);
        l10.append(")");
        return l10.toString();
    }
}
