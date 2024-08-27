package com.assetgro.stockgro.data.model.socialgroups;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0016HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J½\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010(R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010(R\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010(R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001c¨\u0006G"}, d2 = {"Lcom/assetgro/stockgro/data/model/socialgroups/SocialGroupsItem;", HttpUrl.FRAGMENT_ENCODE_SET, "approverId", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "displayPicture", "exitData", "Lcom/assetgro/stockgro/data/model/socialgroups/ExitData;", "exitedAtSecs", HttpUrl.FRAGMENT_ENCODE_SET, "globalRole", "groupId", "groupInfo", "Lcom/assetgro/stockgro/data/model/socialgroups/GroupInfo;", "invalidPackage", HttpUrl.FRAGMENT_ENCODE_SET, "isMuted", "isPinned", "isSupportGroup", "joinedAtSecs", "lastReadMsgId", "lastReadMsgServerMicros", HttpUrl.FRAGMENT_ENCODE_SET, "role", "status", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/socialgroups/ExitData;ILjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/socialgroups/GroupInfo;ZZZZILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApproverId", "()Ljava/lang/String;", "getDisplayName", "getDisplayPicture", "getExitData", "()Lcom/assetgro/stockgro/data/model/socialgroups/ExitData;", "getExitedAtSecs", "()I", "getGlobalRole", "getGroupId", "getGroupInfo", "()Lcom/assetgro/stockgro/data/model/socialgroups/GroupInfo;", "getInvalidPackage", "()Z", "getJoinedAtSecs", "getLastReadMsgId", "getLastReadMsgServerMicros", "()J", "getRole", "getStatus", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialGroupsItem {
    public static final int $stable = 8;

    @SerializedName("approver_id")
    @NotNull
    private final String approverId;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("display_picture")
    @NotNull
    private final String displayPicture;

    @SerializedName("exit_data")
    @NotNull
    private final ExitData exitData;

    @SerializedName("exited_at_secs")
    private final int exitedAtSecs;

    @SerializedName("global_role")
    @NotNull
    private final String globalRole;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("group_info")
    @NotNull
    private final GroupInfo groupInfo;

    @SerializedName("invalid_package")
    private final boolean invalidPackage;

    @SerializedName("is_muted")
    private final boolean isMuted;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("is_support_group")
    private final boolean isSupportGroup;

    @SerializedName("joined_at_secs")
    private final int joinedAtSecs;

    @SerializedName("last_read_msg_id")
    @NotNull
    private final String lastReadMsgId;

    @SerializedName("last_read_msg_server_micros")
    private final long lastReadMsgServerMicros;

    @SerializedName("role")
    @NotNull
    private final String role;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    public SocialGroupsItem(@NotNull String approverId, @NotNull String displayName, @NotNull String displayPicture, @NotNull ExitData exitData, int i10, @NotNull String globalRole, @NotNull String groupId, @NotNull GroupInfo groupInfo, boolean z10, boolean z11, boolean z12, boolean z13, int i11, @NotNull String lastReadMsgId, long j10, @NotNull String role, @NotNull String status, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(approverId, "approverId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(exitData, "exitData");
        Intrinsics.checkNotNullParameter(globalRole, "globalRole");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupInfo, "groupInfo");
        Intrinsics.checkNotNullParameter(lastReadMsgId, "lastReadMsgId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.approverId = approverId;
        this.displayName = displayName;
        this.displayPicture = displayPicture;
        this.exitData = exitData;
        this.exitedAtSecs = i10;
        this.globalRole = globalRole;
        this.groupId = groupId;
        this.groupInfo = groupInfo;
        this.invalidPackage = z10;
        this.isMuted = z11;
        this.isPinned = z12;
        this.isSupportGroup = z13;
        this.joinedAtSecs = i11;
        this.lastReadMsgId = lastReadMsgId;
        this.lastReadMsgServerMicros = j10;
        this.role = role;
        this.status = status;
        this.userId = userId;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApproverId() {
        return this.approverId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSupportGroup() {
        return this.isSupportGroup;
    }

    /* renamed from: component13, reason: from getter */
    public final int getJoinedAtSecs() {
        return this.joinedAtSecs;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getLastReadMsgId() {
        return this.lastReadMsgId;
    }

    /* renamed from: component15, reason: from getter */
    public final long getLastReadMsgServerMicros() {
        return this.lastReadMsgServerMicros;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ExitData getExitData() {
        return this.exitData;
    }

    /* renamed from: component5, reason: from getter */
    public final int getExitedAtSecs() {
        return this.exitedAtSecs;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getGlobalRole() {
        return this.globalRole;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    @NotNull
    public final SocialGroupsItem copy(@NotNull String approverId, @NotNull String displayName, @NotNull String displayPicture, @NotNull ExitData exitData, int exitedAtSecs, @NotNull String globalRole, @NotNull String groupId, @NotNull GroupInfo groupInfo, boolean invalidPackage, boolean isMuted, boolean isPinned, boolean isSupportGroup, int joinedAtSecs, @NotNull String lastReadMsgId, long lastReadMsgServerMicros, @NotNull String role, @NotNull String status, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(approverId, "approverId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(exitData, "exitData");
        Intrinsics.checkNotNullParameter(globalRole, "globalRole");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupInfo, "groupInfo");
        Intrinsics.checkNotNullParameter(lastReadMsgId, "lastReadMsgId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new SocialGroupsItem(approverId, displayName, displayPicture, exitData, exitedAtSecs, globalRole, groupId, groupInfo, invalidPackage, isMuted, isPinned, isSupportGroup, joinedAtSecs, lastReadMsgId, lastReadMsgServerMicros, role, status, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialGroupsItem)) {
            return false;
        }
        SocialGroupsItem socialGroupsItem = (SocialGroupsItem) other;
        return Intrinsics.a(this.approverId, socialGroupsItem.approverId) && Intrinsics.a(this.displayName, socialGroupsItem.displayName) && Intrinsics.a(this.displayPicture, socialGroupsItem.displayPicture) && Intrinsics.a(this.exitData, socialGroupsItem.exitData) && this.exitedAtSecs == socialGroupsItem.exitedAtSecs && Intrinsics.a(this.globalRole, socialGroupsItem.globalRole) && Intrinsics.a(this.groupId, socialGroupsItem.groupId) && Intrinsics.a(this.groupInfo, socialGroupsItem.groupInfo) && this.invalidPackage == socialGroupsItem.invalidPackage && this.isMuted == socialGroupsItem.isMuted && this.isPinned == socialGroupsItem.isPinned && this.isSupportGroup == socialGroupsItem.isSupportGroup && this.joinedAtSecs == socialGroupsItem.joinedAtSecs && Intrinsics.a(this.lastReadMsgId, socialGroupsItem.lastReadMsgId) && this.lastReadMsgServerMicros == socialGroupsItem.lastReadMsgServerMicros && Intrinsics.a(this.role, socialGroupsItem.role) && Intrinsics.a(this.status, socialGroupsItem.status) && Intrinsics.a(this.userId, socialGroupsItem.userId);
    }

    @NotNull
    public final String getApproverId() {
        return this.approverId;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final ExitData getExitData() {
        return this.exitData;
    }

    public final int getExitedAtSecs() {
        return this.exitedAtSecs;
    }

    @NotNull
    public final String getGlobalRole() {
        return this.globalRole;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    public final int getJoinedAtSecs() {
        return this.joinedAtSecs;
    }

    @NotNull
    public final String getLastReadMsgId() {
        return this.lastReadMsgId;
    }

    public final long getLastReadMsgServerMicros() {
        return this.lastReadMsgServerMicros;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + h.g(this.status, h.g(this.role, e.c(this.lastReadMsgServerMicros, h.g(this.lastReadMsgId, da.e.f(this.joinedAtSecs, e.d(this.isSupportGroup, e.d(this.isPinned, e.d(this.isMuted, e.d(this.invalidPackage, (this.groupInfo.hashCode() + h.g(this.groupId, h.g(this.globalRole, da.e.f(this.exitedAtSecs, (this.exitData.hashCode() + h.g(this.displayPicture, h.g(this.displayName, this.approverId.hashCode() * 31, 31), 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isSupportGroup() {
        return this.isSupportGroup;
    }

    @NotNull
    public String toString() {
        String str = this.approverId;
        String str2 = this.displayName;
        String str3 = this.displayPicture;
        ExitData exitData = this.exitData;
        int i10 = this.exitedAtSecs;
        String str4 = this.globalRole;
        String str5 = this.groupId;
        GroupInfo groupInfo = this.groupInfo;
        boolean z10 = this.invalidPackage;
        boolean z11 = this.isMuted;
        boolean z12 = this.isPinned;
        boolean z13 = this.isSupportGroup;
        int i11 = this.joinedAtSecs;
        String str6 = this.lastReadMsgId;
        long j10 = this.lastReadMsgServerMicros;
        String str7 = this.role;
        String str8 = this.status;
        String str9 = this.userId;
        StringBuilder l10 = e.l("SocialGroupsItem(approverId=", str, ", displayName=", str2, ", displayPicture=");
        l10.append(str3);
        l10.append(", exitData=");
        l10.append(exitData);
        l10.append(", exitedAtSecs=");
        d.w(l10, i10, ", globalRole=", str4, ", groupId=");
        l10.append(str5);
        l10.append(", groupInfo=");
        l10.append(groupInfo);
        l10.append(", invalidPackage=");
        l10.append(z10);
        l10.append(", isMuted=");
        l10.append(z11);
        l10.append(", isPinned=");
        l10.append(z12);
        l10.append(", isSupportGroup=");
        l10.append(z13);
        l10.append(", joinedAtSecs=");
        d.w(l10, i11, ", lastReadMsgId=", str6, ", lastReadMsgServerMicros=");
        l10.append(j10);
        l10.append(", role=");
        l10.append(str7);
        e.v(l10, ", status=", str8, ", userId=", str9);
        l10.append(")");
        return l10.toString();
    }
}
