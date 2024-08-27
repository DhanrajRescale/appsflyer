package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/SocialExpertGroup;", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "groupName", AppMeasurementSdk.ConditionalUserProperty.NAME, "imageUrl", "redirectionUrl", "members", "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getGroupId", "()Ljava/lang/String;", "getGroupName", "getImageUrl", "getMembers", "getName", "getRedirectionUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialExpertGroup {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("group_name")
    private final String groupName;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("members")
    private final String members;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("redirection_url")
    @NotNull
    private final String redirectionUrl;

    public SocialExpertGroup(@NotNull String groupId, String str, String str2, @NotNull String imageUrl, @NotNull String redirectionUrl, String str3, Analytics analytics) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        this.groupId = groupId;
        this.groupName = str;
        this.name = str2;
        this.imageUrl = imageUrl;
        this.redirectionUrl = redirectionUrl;
        this.members = str3;
        this.analytics = analytics;
    }

    public static /* synthetic */ SocialExpertGroup copy$default(SocialExpertGroup socialExpertGroup, String str, String str2, String str3, String str4, String str5, String str6, Analytics analytics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialExpertGroup.groupId;
        }
        if ((i10 & 2) != 0) {
            str2 = socialExpertGroup.groupName;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = socialExpertGroup.name;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = socialExpertGroup.imageUrl;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = socialExpertGroup.redirectionUrl;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = socialExpertGroup.members;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            analytics = socialExpertGroup.analytics;
        }
        return socialExpertGroup.copy(str, str7, str8, str9, str10, str11, analytics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMembers() {
        return this.members;
    }

    /* renamed from: component7, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final SocialExpertGroup copy(@NotNull String groupId, String groupName, String name, @NotNull String imageUrl, @NotNull String redirectionUrl, String members, Analytics analytics) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        return new SocialExpertGroup(groupId, groupName, name, imageUrl, redirectionUrl, members, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialExpertGroup)) {
            return false;
        }
        SocialExpertGroup socialExpertGroup = (SocialExpertGroup) other;
        return Intrinsics.a(this.groupId, socialExpertGroup.groupId) && Intrinsics.a(this.groupName, socialExpertGroup.groupName) && Intrinsics.a(this.name, socialExpertGroup.name) && Intrinsics.a(this.imageUrl, socialExpertGroup.imageUrl) && Intrinsics.a(this.redirectionUrl, socialExpertGroup.redirectionUrl) && Intrinsics.a(this.members, socialExpertGroup.members) && Intrinsics.a(this.analytics, socialExpertGroup.analytics);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMembers() {
        return this.members;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.groupId.hashCode() * 31;
        String str = this.groupName;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int g10 = h.g(this.redirectionUrl, h.g(this.imageUrl, (i11 + hashCode2) * 31, 31), 31);
        String str3 = this.members;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (g10 + hashCode3) * 31;
        Analytics analytics = this.analytics;
        if (analytics != null) {
            i10 = analytics.hashCode();
        }
        return i12 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.groupId;
        String str2 = this.groupName;
        String str3 = this.name;
        String str4 = this.imageUrl;
        String str5 = this.redirectionUrl;
        String str6 = this.members;
        Analytics analytics = this.analytics;
        StringBuilder l10 = e.l("SocialExpertGroup(groupId=", str, ", groupName=", str2, ", name=");
        e.v(l10, str3, ", imageUrl=", str4, ", redirectionUrl=");
        e.v(l10, str5, ", members=", str6, ", analytics=");
        l10.append(analytics);
        l10.append(")");
        return l10.toString();
    }
}
