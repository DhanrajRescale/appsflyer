package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/MembersCount;", "Landroid/os/Parcelable;", "invitedUsers", HttpUrl.FRAGMENT_ENCODE_SET, "invitedUsersStr", HttpUrl.FRAGMENT_ENCODE_SET, "joinedAdmins", "joinedAdminsStr", "joinedUsers", "joinedUsersStr", "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getInvitedUsers", "()I", "getInvitedUsersStr", "()Ljava/lang/String;", "getJoinedAdmins", "getJoinedAdminsStr", "getJoinedUsers", "getJoinedUsersStr", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MembersCount implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MembersCount> CREATOR = new Creator();

    @SerializedName("invited_users")
    private final int invitedUsers;

    @SerializedName("invited_users_str")
    @NotNull
    private final String invitedUsersStr;

    @SerializedName("joined_admins")
    private final int joinedAdmins;

    @SerializedName("joined_admins_str")
    @NotNull
    private final String joinedAdminsStr;

    @SerializedName("joined_users")
    private final int joinedUsers;

    @SerializedName("joined_users_str")
    @NotNull
    private final String joinedUsersStr;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MembersCount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MembersCount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MembersCount(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MembersCount[] newArray(int i10) {
            return new MembersCount[i10];
        }
    }

    public MembersCount(int i10, @NotNull String invitedUsersStr, int i11, @NotNull String joinedAdminsStr, int i12, @NotNull String joinedUsersStr) {
        Intrinsics.checkNotNullParameter(invitedUsersStr, "invitedUsersStr");
        Intrinsics.checkNotNullParameter(joinedAdminsStr, "joinedAdminsStr");
        Intrinsics.checkNotNullParameter(joinedUsersStr, "joinedUsersStr");
        this.invitedUsers = i10;
        this.invitedUsersStr = invitedUsersStr;
        this.joinedAdmins = i11;
        this.joinedAdminsStr = joinedAdminsStr;
        this.joinedUsers = i12;
        this.joinedUsersStr = joinedUsersStr;
    }

    public static /* synthetic */ MembersCount copy$default(MembersCount membersCount, int i10, String str, int i11, String str2, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = membersCount.invitedUsers;
        }
        if ((i13 & 2) != 0) {
            str = membersCount.invitedUsersStr;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            i11 = membersCount.joinedAdmins;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            str2 = membersCount.joinedAdminsStr;
        }
        String str5 = str2;
        if ((i13 & 16) != 0) {
            i12 = membersCount.joinedUsers;
        }
        int i15 = i12;
        if ((i13 & 32) != 0) {
            str3 = membersCount.joinedUsersStr;
        }
        return membersCount.copy(i10, str4, i14, str5, i15, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInvitedUsers() {
        return this.invitedUsers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInvitedUsersStr() {
        return this.invitedUsersStr;
    }

    /* renamed from: component3, reason: from getter */
    public final int getJoinedAdmins() {
        return this.joinedAdmins;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getJoinedAdminsStr() {
        return this.joinedAdminsStr;
    }

    /* renamed from: component5, reason: from getter */
    public final int getJoinedUsers() {
        return this.joinedUsers;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getJoinedUsersStr() {
        return this.joinedUsersStr;
    }

    @NotNull
    public final MembersCount copy(int invitedUsers, @NotNull String invitedUsersStr, int joinedAdmins, @NotNull String joinedAdminsStr, int joinedUsers, @NotNull String joinedUsersStr) {
        Intrinsics.checkNotNullParameter(invitedUsersStr, "invitedUsersStr");
        Intrinsics.checkNotNullParameter(joinedAdminsStr, "joinedAdminsStr");
        Intrinsics.checkNotNullParameter(joinedUsersStr, "joinedUsersStr");
        return new MembersCount(invitedUsers, invitedUsersStr, joinedAdmins, joinedAdminsStr, joinedUsers, joinedUsersStr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembersCount)) {
            return false;
        }
        MembersCount membersCount = (MembersCount) other;
        return this.invitedUsers == membersCount.invitedUsers && Intrinsics.a(this.invitedUsersStr, membersCount.invitedUsersStr) && this.joinedAdmins == membersCount.joinedAdmins && Intrinsics.a(this.joinedAdminsStr, membersCount.joinedAdminsStr) && this.joinedUsers == membersCount.joinedUsers && Intrinsics.a(this.joinedUsersStr, membersCount.joinedUsersStr);
    }

    public final int getInvitedUsers() {
        return this.invitedUsers;
    }

    @NotNull
    public final String getInvitedUsersStr() {
        return this.invitedUsersStr;
    }

    public final int getJoinedAdmins() {
        return this.joinedAdmins;
    }

    @NotNull
    public final String getJoinedAdminsStr() {
        return this.joinedAdminsStr;
    }

    public final int getJoinedUsers() {
        return this.joinedUsers;
    }

    @NotNull
    public final String getJoinedUsersStr() {
        return this.joinedUsersStr;
    }

    public int hashCode() {
        return this.joinedUsersStr.hashCode() + e.f(this.joinedUsers, h.g(this.joinedAdminsStr, e.f(this.joinedAdmins, h.g(this.invitedUsersStr, Integer.hashCode(this.invitedUsers) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.invitedUsers;
        String str = this.invitedUsersStr;
        int i11 = this.joinedAdmins;
        String str2 = this.joinedAdminsStr;
        int i12 = this.joinedUsers;
        String str3 = this.joinedUsersStr;
        StringBuilder sb2 = new StringBuilder("MembersCount(invitedUsers=");
        sb2.append(i10);
        sb2.append(", invitedUsersStr=");
        sb2.append(str);
        sb2.append(", joinedAdmins=");
        d.w(sb2, i11, ", joinedAdminsStr=", str2, ", joinedUsers=");
        sb2.append(i12);
        sb2.append(", joinedUsersStr=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.invitedUsers);
        parcel.writeString(this.invitedUsersStr);
        parcel.writeInt(this.joinedAdmins);
        parcel.writeString(this.joinedAdminsStr);
        parcel.writeInt(this.joinedUsers);
        parcel.writeString(this.joinedUsersStr);
    }
}
