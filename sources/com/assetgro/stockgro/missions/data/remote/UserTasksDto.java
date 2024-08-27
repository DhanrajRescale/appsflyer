package com.assetgro.stockgro.missions.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.MissionReward;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0096\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\t\u00104\u001a\u00020\u0010HÖ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0010HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\u0006\u0010;\u001a\u00020<J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\"\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u0006B"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/UserTasksDto;", "Landroid/os/Parcelable;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "logo", "status", "reward", "Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;", "createdAt", "expiryDate", "sortingDate", "liveDate", "taskType", "set", HttpUrl.FRAGMENT_ENCODE_SET, "eventName", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEventName", "()Ljava/lang/String;", "getExpiryDate", "getId", "()J", "getLiveDate", "getLogo", "getReward", "()Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;", "getSet", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSortingDate", "getStatus", "getTaskType", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/assetgro/stockgro/missions/data/remote/UserTasksDto;", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "toUserTasks", "Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserTasksDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UserTasksDto> CREATOR = new Creator();

    @SerializedName("created_at")
    private final Long createdAt;

    @SerializedName("event_name")
    private final String eventName;

    @SerializedName("expiry_date")
    private final Long expiryDate;

    @SerializedName("id")
    private final long id;

    @SerializedName("live_date")
    private final Long liveDate;

    @SerializedName("logo")
    @NotNull
    private final String logo;

    @SerializedName("reward")
    @NotNull
    private final MissionRewardDto reward;

    @SerializedName("level_id")
    private final Integer set;

    @SerializedName("sorting_date")
    private final Long sortingDate;

    @SerializedName("status")
    private final String status;

    @SerializedName("task_type")
    private final String taskType;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserTasksDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserTasksDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserTasksDto(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), MissionRewardDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserTasksDto[] newArray(int i10) {
            return new UserTasksDto[i10];
        }
    }

    public UserTasksDto(long j10, @NotNull String title, @NotNull String logo, String str, @NotNull MissionRewardDto reward, Long l10, Long l11, Long l12, Long l13, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.id = j10;
        this.title = title;
        this.logo = logo;
        this.status = str;
        this.reward = reward;
        this.createdAt = l10;
        this.expiryDate = l11;
        this.sortingDate = l12;
        this.liveDate = l13;
        this.taskType = str2;
        this.set = num;
        this.eventName = str3;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getSet() {
        return this.set;
    }

    /* renamed from: component12, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MissionRewardDto getReward() {
        return this.reward;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getSortingDate() {
        return this.sortingDate;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getLiveDate() {
        return this.liveDate;
    }

    @NotNull
    public final UserTasksDto copy(long id2, @NotNull String title, @NotNull String logo, String status, @NotNull MissionRewardDto reward, Long createdAt, Long expiryDate, Long sortingDate, Long liveDate, String taskType, Integer set, String eventName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(reward, "reward");
        return new UserTasksDto(id2, title, logo, status, reward, createdAt, expiryDate, sortingDate, liveDate, taskType, set, eventName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTasksDto)) {
            return false;
        }
        UserTasksDto userTasksDto = (UserTasksDto) other;
        return this.id == userTasksDto.id && Intrinsics.a(this.title, userTasksDto.title) && Intrinsics.a(this.logo, userTasksDto.logo) && Intrinsics.a(this.status, userTasksDto.status) && Intrinsics.a(this.reward, userTasksDto.reward) && Intrinsics.a(this.createdAt, userTasksDto.createdAt) && Intrinsics.a(this.expiryDate, userTasksDto.expiryDate) && Intrinsics.a(this.sortingDate, userTasksDto.sortingDate) && Intrinsics.a(this.liveDate, userTasksDto.liveDate) && Intrinsics.a(this.taskType, userTasksDto.taskType) && Intrinsics.a(this.set, userTasksDto.set) && Intrinsics.a(this.eventName, userTasksDto.eventName);
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getLiveDate() {
        return this.liveDate;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final MissionRewardDto getReward() {
        return this.reward;
    }

    public final Integer getSet() {
        return this.set;
    }

    public final Long getSortingDate() {
        return this.sortingDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int g10 = h.g(this.logo, h.g(this.title, Long.hashCode(this.id) * 31, 31), 31);
        String str = this.status;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode8 = (this.reward.hashCode() + ((g10 + hashCode) * 31)) * 31;
        Long l10 = this.createdAt;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i11 = (hashCode8 + hashCode2) * 31;
        Long l11 = this.expiryDate;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l12 = this.sortingDate;
        if (l12 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l12.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l13 = this.liveDate;
        if (l13 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l13.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str2 = this.taskType;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Integer num = this.set;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str3 = this.eventName;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i16 + i10;
    }

    @NotNull
    public String toString() {
        long j10 = this.id;
        String str = this.title;
        String str2 = this.logo;
        String str3 = this.status;
        MissionRewardDto missionRewardDto = this.reward;
        Long l10 = this.createdAt;
        Long l11 = this.expiryDate;
        Long l12 = this.sortingDate;
        Long l13 = this.liveDate;
        String str4 = this.taskType;
        Integer num = this.set;
        String str5 = this.eventName;
        StringBuilder sb2 = new StringBuilder("UserTasksDto(id=");
        sb2.append(j10);
        sb2.append(", title=");
        sb2.append(str);
        e.v(sb2, ", logo=", str2, ", status=", str3);
        sb2.append(", reward=");
        sb2.append(missionRewardDto);
        sb2.append(", createdAt=");
        sb2.append(l10);
        sb2.append(", expiryDate=");
        sb2.append(l11);
        sb2.append(", sortingDate=");
        sb2.append(l12);
        sb2.append(", liveDate=");
        sb2.append(l13);
        sb2.append(", taskType=");
        sb2.append(str4);
        sb2.append(", set=");
        sb2.append(num);
        sb2.append(", eventName=");
        sb2.append(str5);
        sb2.append(")");
        return sb2.toString();
    }

    @NotNull
    public final UserTask toUserTasks() {
        String str;
        String str2;
        String str3;
        int i10;
        long j10 = this.id;
        String str4 = this.title;
        String str5 = this.logo;
        String str6 = this.status;
        if (str6 == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = str6;
        }
        MissionReward missionReward = this.reward.toMissionReward();
        Long l10 = this.createdAt;
        Long l11 = this.expiryDate;
        Long l12 = this.sortingDate;
        Long l13 = this.liveDate;
        String str7 = this.taskType;
        if (str7 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = str7;
        }
        String str8 = this.eventName;
        if (str8 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str3 = str8;
        }
        Integer num = this.set;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 1;
        }
        return new UserTask(j10, str4, str5, str, missionReward, l10, l13, l11, l12, i10, str3, str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.logo);
        parcel.writeString(this.status);
        this.reward.writeToParcel(parcel, flags);
        Long l10 = this.createdAt;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l10);
        }
        Long l11 = this.expiryDate;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l11);
        }
        Long l12 = this.sortingDate;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l12);
        }
        Long l13 = this.liveDate;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l13);
        }
        parcel.writeString(this.taskType);
        Integer num = this.set;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.eventName);
    }
}
