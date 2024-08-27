package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupUIConfig;", "Landroid/os/Parcelable;", "isGroupMetaEditable", HttpUrl.FRAGMENT_ENCODE_SET, "canAddMembers", "canViewRogues", "canEditAdminOnlyOption", "canViewInvitedUsers", "adminActions", "Lcom/assetgro/stockgro/data/model/GroupInfoActions;", "moderatorActions", "userActions", "seederActions", "canExitGroup", "canDeleteGroup", "canViewGroupMember", "(ZZZZZLcom/assetgro/stockgro/data/model/GroupInfoActions;Lcom/assetgro/stockgro/data/model/GroupInfoActions;Lcom/assetgro/stockgro/data/model/GroupInfoActions;Lcom/assetgro/stockgro/data/model/GroupInfoActions;ZZZ)V", "getAdminActions", "()Lcom/assetgro/stockgro/data/model/GroupInfoActions;", "getCanAddMembers", "()Z", "getCanDeleteGroup", "getCanEditAdminOnlyOption", "getCanExitGroup", "getCanViewGroupMember", "getCanViewInvitedUsers", "getCanViewRogues", "getModeratorActions", "getSeederActions", "getUserActions", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupUIConfig implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<GroupUIConfig> CREATOR = new Creator();

    @SerializedName("admin_actions")
    private final GroupInfoActions adminActions;

    @SerializedName("can_add_members")
    private final boolean canAddMembers;

    @SerializedName("can_delete_group")
    private final boolean canDeleteGroup;

    @SerializedName("can_edit_admin_only_opt")
    private final boolean canEditAdminOnlyOption;

    @SerializedName("can_exit_group")
    private final boolean canExitGroup;

    @SerializedName("can_view_group_member")
    private final boolean canViewGroupMember;

    @SerializedName("can_view_invited_users")
    private final boolean canViewInvitedUsers;

    @SerializedName("can_view_rogues")
    private final boolean canViewRogues;

    @SerializedName("is_group_meta_editable")
    private final boolean isGroupMetaEditable;

    @SerializedName("moderator_actions")
    private final GroupInfoActions moderatorActions;

    @SerializedName("seeder_actions")
    private final GroupInfoActions seederActions;

    @SerializedName("user_actions")
    private final GroupInfoActions userActions;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<GroupUIConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupUIConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupUIConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : GroupInfoActions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupInfoActions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupInfoActions.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupInfoActions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupUIConfig[] newArray(int i10) {
            return new GroupUIConfig[i10];
        }
    }

    public GroupUIConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, GroupInfoActions groupInfoActions, GroupInfoActions groupInfoActions2, GroupInfoActions groupInfoActions3, GroupInfoActions groupInfoActions4, boolean z15, boolean z16, boolean z17) {
        this.isGroupMetaEditable = z10;
        this.canAddMembers = z11;
        this.canViewRogues = z12;
        this.canEditAdminOnlyOption = z13;
        this.canViewInvitedUsers = z14;
        this.adminActions = groupInfoActions;
        this.moderatorActions = groupInfoActions2;
        this.userActions = groupInfoActions3;
        this.seederActions = groupInfoActions4;
        this.canExitGroup = z15;
        this.canDeleteGroup = z16;
        this.canViewGroupMember = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final GroupInfoActions getAdminActions() {
        return this.adminActions;
    }

    public final boolean getCanAddMembers() {
        return this.canAddMembers;
    }

    public final boolean getCanDeleteGroup() {
        return this.canDeleteGroup;
    }

    public final boolean getCanEditAdminOnlyOption() {
        return this.canEditAdminOnlyOption;
    }

    public final boolean getCanExitGroup() {
        return this.canExitGroup;
    }

    public final boolean getCanViewGroupMember() {
        return this.canViewGroupMember;
    }

    public final boolean getCanViewInvitedUsers() {
        return this.canViewInvitedUsers;
    }

    public final boolean getCanViewRogues() {
        return this.canViewRogues;
    }

    public final GroupInfoActions getModeratorActions() {
        return this.moderatorActions;
    }

    public final GroupInfoActions getSeederActions() {
        return this.seederActions;
    }

    public final GroupInfoActions getUserActions() {
        return this.userActions;
    }

    /* renamed from: isGroupMetaEditable, reason: from getter */
    public final boolean getIsGroupMetaEditable() {
        return this.isGroupMetaEditable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isGroupMetaEditable ? 1 : 0);
        parcel.writeInt(this.canAddMembers ? 1 : 0);
        parcel.writeInt(this.canViewRogues ? 1 : 0);
        parcel.writeInt(this.canEditAdminOnlyOption ? 1 : 0);
        parcel.writeInt(this.canViewInvitedUsers ? 1 : 0);
        GroupInfoActions groupInfoActions = this.adminActions;
        if (groupInfoActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInfoActions.writeToParcel(parcel, flags);
        }
        GroupInfoActions groupInfoActions2 = this.moderatorActions;
        if (groupInfoActions2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInfoActions2.writeToParcel(parcel, flags);
        }
        GroupInfoActions groupInfoActions3 = this.userActions;
        if (groupInfoActions3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInfoActions3.writeToParcel(parcel, flags);
        }
        GroupInfoActions groupInfoActions4 = this.seederActions;
        if (groupInfoActions4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInfoActions4.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.canExitGroup ? 1 : 0);
        parcel.writeInt(this.canDeleteGroup ? 1 : 0);
        parcel.writeInt(this.canViewGroupMember ? 1 : 0);
    }

    public /* synthetic */ GroupUIConfig(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, GroupInfoActions groupInfoActions, GroupInfoActions groupInfoActions2, GroupInfoActions groupInfoActions3, GroupInfoActions groupInfoActions4, boolean z15, boolean z16, boolean z17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, groupInfoActions, groupInfoActions2, groupInfoActions3, groupInfoActions4, (i10 & 512) != 0 ? true : z15, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z16, (i10 & 2048) != 0 ? false : z17);
    }
}
