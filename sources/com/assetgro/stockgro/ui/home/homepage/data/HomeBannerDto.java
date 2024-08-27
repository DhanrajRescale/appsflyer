package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeBannerDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "imageUrl", HttpUrl.FRAGMENT_ENCODE_SET, "redirectionUrl", "aspectRatio", HttpUrl.FRAGMENT_ENCODE_SET, "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "(Ljava/lang/String;Ljava/lang/String;FLcom/assetgro/stockgro/data/model/homedata/Analytics;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getAspectRatio", "()F", "getImageUrl", "()Ljava/lang/String;", "getRedirectionUrl", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeBannerDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName("aspect_ratio")
    private final float aspectRatio;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("redirection_url")
    private final String redirectionUrl;

    public HomeBannerDto(@NotNull String imageUrl, String str, float f10, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.redirectionUrl = str;
        this.aspectRatio = f10;
        this.analytics = analytics;
    }

    public static /* synthetic */ HomeBannerDto copy$default(HomeBannerDto homeBannerDto, String str, String str2, float f10, Analytics analytics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeBannerDto.imageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = homeBannerDto.redirectionUrl;
        }
        if ((i10 & 4) != 0) {
            f10 = homeBannerDto.aspectRatio;
        }
        if ((i10 & 8) != 0) {
            analytics = homeBannerDto.analytics;
        }
        return homeBannerDto.copy(str, str2, f10, analytics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final HomeBannerDto copy(@NotNull String imageUrl, String redirectionUrl, float aspectRatio, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new HomeBannerDto(imageUrl, redirectionUrl, aspectRatio, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeBannerDto)) {
            return false;
        }
        HomeBannerDto homeBannerDto = (HomeBannerDto) other;
        return Intrinsics.a(this.imageUrl, homeBannerDto.imageUrl) && Intrinsics.a(this.redirectionUrl, homeBannerDto.redirectionUrl) && Float.compare(this.aspectRatio, homeBannerDto.aspectRatio) == 0 && Intrinsics.a(this.analytics, homeBannerDto.analytics);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.imageUrl.hashCode() * 31;
        String str = this.redirectionUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a10 = e.a(this.aspectRatio, (hashCode2 + hashCode) * 31, 31);
        Analytics analytics = this.analytics;
        if (analytics != null) {
            i10 = analytics.hashCode();
        }
        return a10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.redirectionUrl;
        float f10 = this.aspectRatio;
        Analytics analytics = this.analytics;
        StringBuilder l10 = e.l("HomeBannerDto(imageUrl=", str, ", redirectionUrl=", str2, ", aspectRatio=");
        l10.append(f10);
        l10.append(", analytics=");
        l10.append(analytics);
        l10.append(")");
        return l10.toString();
    }
}
