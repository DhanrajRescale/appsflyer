package com.assetgro.stockgro.data.model.homedata;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/BannerData;", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", HttpUrl.FRAGMENT_ENCODE_SET, "redirectionType", "redirectionUrl", "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "contentType", "posterId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;Ljava/lang/String;Ljava/lang/String;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getContentType", "()Ljava/lang/String;", "getImageUrl", "getPosterId", "getRedirectionType", "getRedirectionUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BannerData {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName(alternate = {"content_type"}, value = "contentType")
    @NotNull
    private final String contentType;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName(alternate = {"poster_id"}, value = "posterId")
    private final String posterId;

    @SerializedName("redirection_type")
    @NotNull
    private final String redirectionType;

    @SerializedName(alternate = {"redirection_url"}, value = "redirectionURL")
    @NotNull
    private final String redirectionUrl;

    public BannerData(@NotNull String imageUrl, @NotNull String redirectionType, @NotNull String redirectionUrl, Analytics analytics, @NotNull String contentType, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(redirectionType, "redirectionType");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.imageUrl = imageUrl;
        this.redirectionType = redirectionType;
        this.redirectionUrl = redirectionUrl;
        this.analytics = analytics;
        this.contentType = contentType;
        this.posterId = str;
    }

    public static /* synthetic */ BannerData copy$default(BannerData bannerData, String str, String str2, String str3, Analytics analytics, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerData.imageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerData.redirectionType;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = bannerData.redirectionUrl;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            analytics = bannerData.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i10 & 16) != 0) {
            str4 = bannerData.contentType;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = bannerData.posterId;
        }
        return bannerData.copy(str, str6, str7, analytics2, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRedirectionType() {
        return this.redirectionType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPosterId() {
        return this.posterId;
    }

    @NotNull
    public final BannerData copy(@NotNull String imageUrl, @NotNull String redirectionType, @NotNull String redirectionUrl, Analytics analytics, @NotNull String contentType, String posterId) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(redirectionType, "redirectionType");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new BannerData(imageUrl, redirectionType, redirectionUrl, analytics, contentType, posterId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerData)) {
            return false;
        }
        BannerData bannerData = (BannerData) other;
        return Intrinsics.a(this.imageUrl, bannerData.imageUrl) && Intrinsics.a(this.redirectionType, bannerData.redirectionType) && Intrinsics.a(this.redirectionUrl, bannerData.redirectionUrl) && Intrinsics.a(this.analytics, bannerData.analytics) && Intrinsics.a(this.contentType, bannerData.contentType) && Intrinsics.a(this.posterId, bannerData.posterId);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPosterId() {
        return this.posterId;
    }

    @NotNull
    public final String getRedirectionType() {
        return this.redirectionType;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.redirectionUrl, h.g(this.redirectionType, this.imageUrl.hashCode() * 31, 31), 31);
        Analytics analytics = this.analytics;
        int i10 = 0;
        if (analytics == null) {
            hashCode = 0;
        } else {
            hashCode = analytics.hashCode();
        }
        int g11 = h.g(this.contentType, (g10 + hashCode) * 31, 31);
        String str = this.posterId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return g11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.redirectionType;
        String str3 = this.redirectionUrl;
        Analytics analytics = this.analytics;
        String str4 = this.contentType;
        String str5 = this.posterId;
        StringBuilder l10 = e.l("BannerData(imageUrl=", str, ", redirectionType=", str2, ", redirectionUrl=");
        l10.append(str3);
        l10.append(", analytics=");
        l10.append(analytics);
        l10.append(", contentType=");
        return a.k(l10, str4, ", posterId=", str5, ")");
    }
}
