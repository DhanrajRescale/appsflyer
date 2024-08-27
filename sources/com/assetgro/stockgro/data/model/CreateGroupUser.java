package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/CreateGroupUser;", HttpUrl.FRAGMENT_ENCODE_SET, "displayImage", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "followerCount", HttpUrl.FRAGMENT_ENCODE_SET, "isFollowing", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "username", "isPartOfGroup", "isExpert", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZZ)V", "getDisplayImage", "()Ljava/lang/String;", "getDisplayName", "getFollowerCount", "()I", "()Z", "setExpert", "(Z)V", "getUserId", "getUsername", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreateGroupUser {
    public static final int $stable = 8;

    @SerializedName("display_image")
    @NotNull
    private final String displayImage;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("follower_count")
    private final int followerCount;

    @SerializedName("is_ria_rra")
    private boolean isExpert;

    @SerializedName("is_following")
    private final boolean isFollowing;

    @SerializedName("is_part_of_group")
    private final boolean isPartOfGroup;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("username")
    @NotNull
    private final String username;

    public CreateGroupUser(@NotNull String displayImage, @NotNull String displayName, int i10, boolean z10, @NotNull String userId, @NotNull String username, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(username, "username");
        this.displayImage = displayImage;
        this.displayName = displayName;
        this.followerCount = i10;
        this.isFollowing = z10;
        this.userId = userId;
        this.username = username;
        this.isPartOfGroup = z11;
        this.isExpert = z12;
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: isExpert, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    /* renamed from: isFollowing, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* renamed from: isPartOfGroup, reason: from getter */
    public final boolean getIsPartOfGroup() {
        return this.isPartOfGroup;
    }

    public final void setExpert(boolean z10) {
        this.isExpert = z10;
    }

    public /* synthetic */ CreateGroupUser(String str, String str2, int i10, boolean z10, String str3, String str4, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, z10, str3, str4, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? false : z12);
    }
}
