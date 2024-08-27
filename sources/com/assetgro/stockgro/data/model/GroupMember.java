package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupMember;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "role", "memberName", "displayPicture", "globalRole", "username", "iBlocked", HttpUrl.FRAGMENT_ENCODE_SET, "isExpert", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDisplayPicture", "()Ljava/lang/String;", "getGlobalRole", "getGroupId", "getIBlocked", "()Z", "setExpert", "(Z)V", "getMemberName", "getRole", "showDivider", "getShowDivider", "setShowDivider", "getUserId", "getUsername", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupMember implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GroupMember> CREATOR = new Creator();

    @SerializedName("display_picture")
    private final String displayPicture;

    @SerializedName("global_role")
    private final String globalRole;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("i_blocked")
    private final boolean iBlocked;

    @SerializedName("is_ria_rra")
    private boolean isExpert;

    @SerializedName("display_name")
    private final String memberName;

    @SerializedName("role")
    @NotNull
    private final String role;
    private boolean showDivider;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("username")
    private final String username;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<GroupMember> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupMember createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupMember(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupMember[] newArray(int i10) {
            return new GroupMember[i10];
        }
    }

    public GroupMember(@NotNull String groupId, @NotNull String userId, @NotNull String role, String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.groupId = groupId;
        this.userId = userId;
        this.role = role;
        this.memberName = str;
        this.displayPicture = str2;
        this.globalRole = str3;
        this.username = str4;
        this.iBlocked = z10;
        this.isExpert = z11;
        this.showDivider = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final String getGlobalRole() {
        return this.globalRole;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean getIBlocked() {
        return this.iBlocked;
    }

    public final String getMemberName() {
        return this.memberName;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    /* renamed from: isExpert, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    public final void setExpert(boolean z10) {
        this.isExpert = z10;
    }

    public final void setShowDivider(boolean z10) {
        this.showDivider = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.userId);
        parcel.writeString(this.role);
        parcel.writeString(this.memberName);
        parcel.writeString(this.displayPicture);
        parcel.writeString(this.globalRole);
        parcel.writeString(this.username);
        parcel.writeInt(this.iBlocked ? 1 : 0);
        parcel.writeInt(this.isExpert ? 1 : 0);
    }

    public /* synthetic */ GroupMember(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? "@username" : str7, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11);
    }
}
