package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeTitleDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "titleUrl", HttpUrl.FRAGMENT_ENCODE_SET, "aspectRatio", HttpUrl.FRAGMENT_ENCODE_SET, "redirectionUrl", "(Ljava/lang/String;FLjava/lang/String;)V", "getAspectRatio", "()F", "getRedirectionUrl", "()Ljava/lang/String;", "getTitleUrl", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeTitleDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("aspect_ratio")
    private final float aspectRatio;

    @SerializedName("redirection_url")
    private final String redirectionUrl;

    @SerializedName("title_url")
    @NotNull
    private final String titleUrl;

    public HomeTitleDto(@NotNull String titleUrl, float f10, String str) {
        Intrinsics.checkNotNullParameter(titleUrl, "titleUrl");
        this.titleUrl = titleUrl;
        this.aspectRatio = f10;
        this.redirectionUrl = str;
    }

    public static /* synthetic */ HomeTitleDto copy$default(HomeTitleDto homeTitleDto, String str, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeTitleDto.titleUrl;
        }
        if ((i10 & 2) != 0) {
            f10 = homeTitleDto.aspectRatio;
        }
        if ((i10 & 4) != 0) {
            str2 = homeTitleDto.redirectionUrl;
        }
        return homeTitleDto.copy(str, f10, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitleUrl() {
        return this.titleUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final HomeTitleDto copy(@NotNull String titleUrl, float aspectRatio, String redirectionUrl) {
        Intrinsics.checkNotNullParameter(titleUrl, "titleUrl");
        return new HomeTitleDto(titleUrl, aspectRatio, redirectionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTitleDto)) {
            return false;
        }
        HomeTitleDto homeTitleDto = (HomeTitleDto) other;
        return Intrinsics.a(this.titleUrl, homeTitleDto.titleUrl) && Float.compare(this.aspectRatio, homeTitleDto.aspectRatio) == 0 && Intrinsics.a(this.redirectionUrl, homeTitleDto.redirectionUrl);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final String getTitleUrl() {
        return this.titleUrl;
    }

    public int hashCode() {
        int hashCode;
        int a10 = e.a(this.aspectRatio, this.titleUrl.hashCode() * 31, 31);
        String str = this.redirectionUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.titleUrl;
        float f10 = this.aspectRatio;
        String str2 = this.redirectionUrl;
        StringBuilder sb2 = new StringBuilder("HomeTitleDto(titleUrl=");
        sb2.append(str);
        sb2.append(", aspectRatio=");
        sb2.append(f10);
        sb2.append(", redirectionUrl=");
        return d.o(sb2, str2, ")");
    }
}
