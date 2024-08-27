package com.assetgro.stockgro.feature_social.data.remote.feed.home;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import gb.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J=\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialStoryGroupDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lgb/e;", "toSocialStoryGroup", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "component5", "groupId", "imageUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "postId", "hasJoinedGroup", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getGroupId", "()Ljava/lang/String;", "getImageUrl", "getName", "getPostId", "Z", "getHasJoinedGroup", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SocialStoryGroupDto {
    public static final int $stable = 0;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("has_joined_group")
    private final boolean hasJoinedGroup;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("post_id")
    private final String postId;

    public SocialStoryGroupDto(@NotNull String groupId, @NotNull String imageUrl, @NotNull String name, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.groupId = groupId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.postId = str;
        this.hasJoinedGroup = z10;
    }

    public static /* synthetic */ SocialStoryGroupDto copy$default(SocialStoryGroupDto socialStoryGroupDto, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialStoryGroupDto.groupId;
        }
        if ((i10 & 2) != 0) {
            str2 = socialStoryGroupDto.imageUrl;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = socialStoryGroupDto.name;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = socialStoryGroupDto.postId;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = socialStoryGroupDto.hasJoinedGroup;
        }
        return socialStoryGroupDto.copy(str, str5, str6, str7, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasJoinedGroup() {
        return this.hasJoinedGroup;
    }

    @NotNull
    public final SocialStoryGroupDto copy(@NotNull String groupId, @NotNull String imageUrl, @NotNull String name, String postId, boolean hasJoinedGroup) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        return new SocialStoryGroupDto(groupId, imageUrl, name, postId, hasJoinedGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialStoryGroupDto)) {
            return false;
        }
        SocialStoryGroupDto socialStoryGroupDto = (SocialStoryGroupDto) other;
        return Intrinsics.a(this.groupId, socialStoryGroupDto.groupId) && Intrinsics.a(this.imageUrl, socialStoryGroupDto.imageUrl) && Intrinsics.a(this.name, socialStoryGroupDto.name) && Intrinsics.a(this.postId, socialStoryGroupDto.postId) && this.hasJoinedGroup == socialStoryGroupDto.hasJoinedGroup;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean getHasJoinedGroup() {
        return this.hasJoinedGroup;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getPostId() {
        return this.postId;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.name, h.g(this.imageUrl, this.groupId.hashCode() * 31, 31), 31);
        String str = this.postId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.hasJoinedGroup) + ((g10 + hashCode) * 31);
    }

    @NotNull
    public final e toSocialStoryGroup() {
        return new e(this.groupId, this.imageUrl, this.name, this.postId, this.hasJoinedGroup, false, false);
    }

    @NotNull
    public String toString() {
        String str = this.groupId;
        String str2 = this.imageUrl;
        String str3 = this.name;
        String str4 = this.postId;
        boolean z10 = this.hasJoinedGroup;
        StringBuilder l10 = v.e.l("SocialStoryGroupDto(groupId=", str, ", imageUrl=", str2, ", name=");
        v.e.v(l10, str3, ", postId=", str4, ", hasJoinedGroup=");
        return da.e.o(l10, z10, ")");
    }
}
