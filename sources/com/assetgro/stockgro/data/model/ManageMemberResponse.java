package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/data/model/ManageMemberResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "groupId", "updatedAtMicros", HttpUrl.FRAGMENT_ENCODE_SET, "joinedAtSecs", "role", "isPinned", HttpUrl.FRAGMENT_ENCODE_SET, "status", "isSupportGroup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Z)V", "getDisplayName", "()Ljava/lang/String;", "getGroupId", "()Z", "getJoinedAtSecs", "()J", "getRole", "getStatus", "getUpdatedAtMicros", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ManageMemberResponse {
    public static final int $stable = 0;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("is_support_group")
    private final boolean isSupportGroup;

    @SerializedName("joined_at_secs")
    private final long joinedAtSecs;

    @SerializedName("role")
    @NotNull
    private final String role;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("updated_at_micros")
    private final long updatedAtMicros;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    public ManageMemberResponse(@NotNull String userId, @NotNull String displayName, @NotNull String groupId, long j10, long j11, @NotNull String role, boolean z10, @NotNull String status, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(status, "status");
        this.userId = userId;
        this.displayName = displayName;
        this.groupId = groupId;
        this.updatedAtMicros = j10;
        this.joinedAtSecs = j11;
        this.role = role;
        this.isPinned = z10;
        this.status = status;
        this.isSupportGroup = z11;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
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
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdatedAtMicros() {
        return this.updatedAtMicros;
    }

    /* renamed from: component5, reason: from getter */
    public final long getJoinedAtSecs() {
        return this.joinedAtSecs;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSupportGroup() {
        return this.isSupportGroup;
    }

    @NotNull
    public final ManageMemberResponse copy(@NotNull String userId, @NotNull String displayName, @NotNull String groupId, long updatedAtMicros, long joinedAtSecs, @NotNull String role, boolean isPinned, @NotNull String status, boolean isSupportGroup) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ManageMemberResponse(userId, displayName, groupId, updatedAtMicros, joinedAtSecs, role, isPinned, status, isSupportGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManageMemberResponse)) {
            return false;
        }
        ManageMemberResponse manageMemberResponse = (ManageMemberResponse) other;
        return Intrinsics.a(this.userId, manageMemberResponse.userId) && Intrinsics.a(this.displayName, manageMemberResponse.displayName) && Intrinsics.a(this.groupId, manageMemberResponse.groupId) && this.updatedAtMicros == manageMemberResponse.updatedAtMicros && this.joinedAtSecs == manageMemberResponse.joinedAtSecs && Intrinsics.a(this.role, manageMemberResponse.role) && this.isPinned == manageMemberResponse.isPinned && Intrinsics.a(this.status, manageMemberResponse.status) && this.isSupportGroup == manageMemberResponse.isSupportGroup;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final long getJoinedAtSecs() {
        return this.joinedAtSecs;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getUpdatedAtMicros() {
        return this.updatedAtMicros;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSupportGroup) + h.g(this.status, e.d(this.isPinned, h.g(this.role, e.c(this.joinedAtSecs, e.c(this.updatedAtMicros, h.g(this.groupId, h.g(this.displayName, this.userId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isSupportGroup() {
        return this.isSupportGroup;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.displayName;
        String str3 = this.groupId;
        long j10 = this.updatedAtMicros;
        long j11 = this.joinedAtSecs;
        String str4 = this.role;
        boolean z10 = this.isPinned;
        String str5 = this.status;
        boolean z11 = this.isSupportGroup;
        StringBuilder l10 = e.l("ManageMemberResponse(userId=", str, ", displayName=", str2, ", groupId=");
        l10.append(str3);
        l10.append(", updatedAtMicros=");
        l10.append(j10);
        l10.append(", joinedAtSecs=");
        l10.append(j11);
        l10.append(", role=");
        l10.append(str4);
        l10.append(", isPinned=");
        l10.append(z10);
        l10.append(", status=");
        l10.append(str5);
        l10.append(", isSupportGroup=");
        l10.append(z11);
        l10.append(")");
        return l10.toString();
    }
}
