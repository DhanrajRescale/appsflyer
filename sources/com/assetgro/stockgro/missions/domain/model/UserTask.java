package com.assetgro.stockgro.missions.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u008e\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00102J\t\u00103\u001a\u00020\u000fHÖ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u000fHÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fHÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u0006?"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "Landroid/os/Parcelable;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "logo", "status", "reward", "Lcom/assetgro/stockgro/missions/domain/model/MissionReward;", "createdAt", "liveDate", "expiryDate", "sortingDate", "set", HttpUrl.FRAGMENT_ENCODE_SET, "eventName", "taskType", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/domain/model/MissionReward;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEventName", "()Ljava/lang/String;", "getExpiryDate", "getId", "()J", "getLiveDate", "getLogo", "getReward", "()Lcom/assetgro/stockgro/missions/domain/model/MissionReward;", "getSet", "()I", "getSortingDate", "getStatus", "getTaskType", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/domain/model/MissionReward;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserTask implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UserTask> CREATOR = new Creator();
    private final Long createdAt;

    @NotNull
    private final String eventName;
    private final Long expiryDate;
    private final long id;
    private final Long liveDate;

    @NotNull
    private final String logo;

    @NotNull
    private final MissionReward reward;
    private final int set;
    private final Long sortingDate;

    @NotNull
    private final String status;

    @NotNull
    private final String taskType;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserTask> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserTask createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserTask(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), MissionReward.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserTask[] newArray(int i10) {
            return new UserTask[i10];
        }
    }

    public UserTask(long j10, @NotNull String title, @NotNull String logo, @NotNull String status, @NotNull MissionReward reward, Long l10, Long l11, Long l12, Long l13, int i10, @NotNull String eventName, @NotNull String taskType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        this.id = j10;
        this.title = title;
        this.logo = logo;
        this.status = status;
        this.reward = reward;
        this.createdAt = l10;
        this.liveDate = l11;
        this.expiryDate = l12;
        this.sortingDate = l13;
        this.set = i10;
        this.eventName = eventName;
        this.taskType = taskType;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSet() {
        return this.set;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
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

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MissionReward getReward() {
        return this.reward;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getLiveDate() {
        return this.liveDate;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getSortingDate() {
        return this.sortingDate;
    }

    @NotNull
    public final UserTask copy(long id2, @NotNull String title, @NotNull String logo, @NotNull String status, @NotNull MissionReward reward, Long createdAt, Long liveDate, Long expiryDate, Long sortingDate, int set, @NotNull String eventName, @NotNull String taskType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        return new UserTask(id2, title, logo, status, reward, createdAt, liveDate, expiryDate, sortingDate, set, eventName, taskType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTask)) {
            return false;
        }
        UserTask userTask = (UserTask) other;
        return this.id == userTask.id && Intrinsics.a(this.title, userTask.title) && Intrinsics.a(this.logo, userTask.logo) && Intrinsics.a(this.status, userTask.status) && Intrinsics.a(this.reward, userTask.reward) && Intrinsics.a(this.createdAt, userTask.createdAt) && Intrinsics.a(this.liveDate, userTask.liveDate) && Intrinsics.a(this.expiryDate, userTask.expiryDate) && Intrinsics.a(this.sortingDate, userTask.sortingDate) && this.set == userTask.set && Intrinsics.a(this.eventName, userTask.eventName) && Intrinsics.a(this.taskType, userTask.taskType);
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
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
    public final MissionReward getReward() {
        return this.reward;
    }

    public final int getSet() {
        return this.set;
    }

    public final Long getSortingDate() {
        return this.sortingDate;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
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
        int hashCode4 = (this.reward.hashCode() + h.g(this.status, h.g(this.logo, h.g(this.title, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31;
        Long l10 = this.createdAt;
        int i10 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        Long l11 = this.liveDate;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Long l12 = this.expiryDate;
        if (l12 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l12.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Long l13 = this.sortingDate;
        if (l13 != null) {
            i10 = l13.hashCode();
        }
        return this.taskType.hashCode() + h.g(this.eventName, e.f(this.set, (i13 + i10) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        long j10 = this.id;
        String str = this.title;
        String str2 = this.logo;
        String str3 = this.status;
        MissionReward missionReward = this.reward;
        Long l10 = this.createdAt;
        Long l11 = this.liveDate;
        Long l12 = this.expiryDate;
        Long l13 = this.sortingDate;
        int i10 = this.set;
        String str4 = this.eventName;
        String str5 = this.taskType;
        StringBuilder sb2 = new StringBuilder("UserTask(id=");
        sb2.append(j10);
        sb2.append(", title=");
        sb2.append(str);
        v.e.v(sb2, ", logo=", str2, ", status=", str3);
        sb2.append(", reward=");
        sb2.append(missionReward);
        sb2.append(", createdAt=");
        sb2.append(l10);
        sb2.append(", liveDate=");
        sb2.append(l11);
        sb2.append(", expiryDate=");
        sb2.append(l12);
        sb2.append(", sortingDate=");
        sb2.append(l13);
        sb2.append(", set=");
        sb2.append(i10);
        v.e.v(sb2, ", eventName=", str4, ", taskType=", str5);
        sb2.append(")");
        return sb2.toString();
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
        Long l11 = this.liveDate;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l11);
        }
        Long l12 = this.expiryDate;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l12);
        }
        Long l13 = this.sortingDate;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l13);
        }
        parcel.writeInt(this.set);
        parcel.writeString(this.eventName);
        parcel.writeString(this.taskType);
    }
}
