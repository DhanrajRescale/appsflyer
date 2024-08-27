package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupInfoInviteItem;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "updatedAtMicros", HttpUrl.FRAGMENT_ENCODE_SET, "status", "displayPicture", "username", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getDisplayPicture", "getStatus", "getUpdatedAtMicros", "()J", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GroupInfoInviteItem {
    public static final int $stable = 0;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("display_picture")
    @NotNull
    private final String displayPicture;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("updated_at_micros")
    private final long updatedAtMicros;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("username")
    @NotNull
    private final String username;

    public GroupInfoInviteItem(@NotNull String userId, @NotNull String displayName, long j10, @NotNull String status, @NotNull String displayPicture, @NotNull String username) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(username, "username");
        this.userId = userId;
        this.displayName = displayName;
        this.updatedAtMicros = j10;
        this.status = status;
        this.displayPicture = displayPicture;
        this.username = username;
    }

    public static /* synthetic */ GroupInfoInviteItem copy$default(GroupInfoInviteItem groupInfoInviteItem, String str, String str2, long j10, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupInfoInviteItem.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = groupInfoInviteItem.displayName;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            j10 = groupInfoInviteItem.updatedAtMicros;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            str3 = groupInfoInviteItem.status;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = groupInfoInviteItem.displayPicture;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = groupInfoInviteItem.username;
        }
        return groupInfoInviteItem.copy(str, str6, j11, str7, str8, str5);
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

    /* renamed from: component3, reason: from getter */
    public final long getUpdatedAtMicros() {
        return this.updatedAtMicros;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final GroupInfoInviteItem copy(@NotNull String userId, @NotNull String displayName, long updatedAtMicros, @NotNull String status, @NotNull String displayPicture, @NotNull String username) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(username, "username");
        return new GroupInfoInviteItem(userId, displayName, updatedAtMicros, status, displayPicture, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfoInviteItem)) {
            return false;
        }
        GroupInfoInviteItem groupInfoInviteItem = (GroupInfoInviteItem) other;
        return Intrinsics.a(this.userId, groupInfoInviteItem.userId) && Intrinsics.a(this.displayName, groupInfoInviteItem.displayName) && this.updatedAtMicros == groupInfoInviteItem.updatedAtMicros && Intrinsics.a(this.status, groupInfoInviteItem.status) && Intrinsics.a(this.displayPicture, groupInfoInviteItem.displayPicture) && Intrinsics.a(this.username, groupInfoInviteItem.username);
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

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.username.hashCode() + h.g(this.displayPicture, h.g(this.status, e.c(this.updatedAtMicros, h.g(this.displayName, this.userId.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.displayName;
        long j10 = this.updatedAtMicros;
        String str3 = this.status;
        String str4 = this.displayPicture;
        String str5 = this.username;
        StringBuilder l10 = e.l("GroupInfoInviteItem(userId=", str, ", displayName=", str2, ", updatedAtMicros=");
        l10.append(j10);
        l10.append(", status=");
        l10.append(str3);
        e.v(l10, ", displayPicture=", str4, ", username=", str5);
        l10.append(")");
        return l10.toString();
    }
}
