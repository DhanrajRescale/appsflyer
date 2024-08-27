package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserFollowerFollowing;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "username", "userRole", "uuid", "imageUrl", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayName", "()Ljava/lang/String;", "getImageUrl", "()Z", "getUserRole", "getUsername", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "getUserImageUrl", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserFollowerFollowing {
    public static final int $stable = 0;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("is_ria_rra")
    private final boolean isExpert;

    @SerializedName("user_role")
    @NotNull
    private final String userRole;

    @SerializedName("username")
    private final String username;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    public UserFollowerFollowing(@NotNull String displayName, String str, @NotNull String userRole, @NotNull String uuid, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.displayName = displayName;
        this.username = str;
        this.userRole = userRole;
        this.uuid = uuid;
        this.imageUrl = str2;
        this.isExpert = z10;
    }

    public static /* synthetic */ UserFollowerFollowing copy$default(UserFollowerFollowing userFollowerFollowing, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userFollowerFollowing.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = userFollowerFollowing.username;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = userFollowerFollowing.userRole;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = userFollowerFollowing.uuid;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = userFollowerFollowing.imageUrl;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            z10 = userFollowerFollowing.isExpert;
        }
        return userFollowerFollowing.copy(str, str6, str7, str8, str9, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    public final UserFollowerFollowing copy(@NotNull String displayName, String username, @NotNull String userRole, @NotNull String uuid, String imageUrl, boolean isExpert) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UserFollowerFollowing(displayName, username, userRole, uuid, imageUrl, isExpert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFollowerFollowing)) {
            return false;
        }
        UserFollowerFollowing userFollowerFollowing = (UserFollowerFollowing) other;
        return Intrinsics.a(this.displayName, userFollowerFollowing.displayName) && Intrinsics.a(this.username, userFollowerFollowing.username) && Intrinsics.a(this.userRole, userFollowerFollowing.userRole) && Intrinsics.a(this.uuid, userFollowerFollowing.uuid) && Intrinsics.a(this.imageUrl, userFollowerFollowing.imageUrl) && this.isExpert == userFollowerFollowing.isExpert;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getUserImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getUserRole() {
        return this.userRole;
    }

    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.displayName.hashCode() * 31;
        String str = this.username;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.uuid, h.g(this.userRole, (hashCode2 + hashCode) * 31, 31), 31);
        String str2 = this.imageUrl;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Boolean.hashCode(this.isExpert) + ((g10 + i10) * 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        String str2 = this.username;
        String str3 = this.userRole;
        String str4 = this.uuid;
        String str5 = this.imageUrl;
        boolean z10 = this.isExpert;
        StringBuilder l10 = e.l("UserFollowerFollowing(displayName=", str, ", username=", str2, ", userRole=");
        e.v(l10, str3, ", uuid=", str4, ", imageUrl=");
        l10.append(str5);
        l10.append(", isExpert=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ UserFollowerFollowing(String str, String str2, String str3, String str4, String str5, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? false : z10);
    }
}
