package com.assetgro.stockgro.data.model.homedata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J²\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\rHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006>"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/ListItem;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "subtitle", "subtitleExtra", "subtitleState", "imageUrl", "mediaType", "redirectionType", "redirectionUrl", "contentType", "rank", HttpUrl.FRAGMENT_ENCODE_SET, "winners", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/homedata/Winner;", "buttonDeeplink", "buttonImage", "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getButtonDeeplink", "()Ljava/lang/String;", "getButtonImage", "getContentType", "getImageUrl", "getMediaType", "getRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRedirectionType", "getRedirectionUrl", "getSubtitle", "getSubtitleExtra", "getSubtitleState", "getTitle", "getWinners", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;)Lcom/assetgro/stockgro/data/model/homedata/ListItem;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListItem {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName("button_deeplink")
    private final String buttonDeeplink;

    @SerializedName("button_image")
    private final String buttonImage;

    @SerializedName(alternate = {"content_type"}, value = "contentType")
    @NotNull
    private final String contentType;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("media_type")
    @NotNull
    private final String mediaType;

    @SerializedName("rank")
    private final Integer rank;

    @SerializedName("redirection_type")
    @NotNull
    private final String redirectionType;

    @SerializedName(alternate = {"redirection_url"}, value = "redirectionURL")
    @NotNull
    private final String redirectionUrl;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("subtitle_extra")
    private final String subtitleExtra;

    @SerializedName("subtitle_state")
    private final String subtitleState;

    @SerializedName("title")
    private final String title;

    @SerializedName("winners")
    private final List<Winner> winners;

    public ListItem(String str, String str2, String str3, String str4, @NotNull String imageUrl, @NotNull String mediaType, @NotNull String redirectionType, @NotNull String redirectionUrl, @NotNull String contentType, Integer num, List<Winner> list, String str5, String str6, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(redirectionType, "redirectionType");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.title = str;
        this.subtitle = str2;
        this.subtitleExtra = str3;
        this.subtitleState = str4;
        this.imageUrl = imageUrl;
        this.mediaType = mediaType;
        this.redirectionType = redirectionType;
        this.redirectionUrl = redirectionUrl;
        this.contentType = contentType;
        this.rank = num;
        this.winners = list;
        this.buttonDeeplink = str5;
        this.buttonImage = str6;
        this.analytics = analytics;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    public final List<Winner> component11() {
        return this.winners;
    }

    /* renamed from: component12, reason: from getter */
    public final String getButtonDeeplink() {
        return this.buttonDeeplink;
    }

    /* renamed from: component13, reason: from getter */
    public final String getButtonImage() {
        return this.buttonImage;
    }

    /* renamed from: component14, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitleExtra() {
        return this.subtitleExtra;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleState() {
        return this.subtitleState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRedirectionType() {
        return this.redirectionType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final ListItem copy(String title, String subtitle, String subtitleExtra, String subtitleState, @NotNull String imageUrl, @NotNull String mediaType, @NotNull String redirectionType, @NotNull String redirectionUrl, @NotNull String contentType, Integer rank, List<Winner> winners, String buttonDeeplink, String buttonImage, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(redirectionType, "redirectionType");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new ListItem(title, subtitle, subtitleExtra, subtitleState, imageUrl, mediaType, redirectionType, redirectionUrl, contentType, rank, winners, buttonDeeplink, buttonImage, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItem)) {
            return false;
        }
        ListItem listItem = (ListItem) other;
        return Intrinsics.a(this.title, listItem.title) && Intrinsics.a(this.subtitle, listItem.subtitle) && Intrinsics.a(this.subtitleExtra, listItem.subtitleExtra) && Intrinsics.a(this.subtitleState, listItem.subtitleState) && Intrinsics.a(this.imageUrl, listItem.imageUrl) && Intrinsics.a(this.mediaType, listItem.mediaType) && Intrinsics.a(this.redirectionType, listItem.redirectionType) && Intrinsics.a(this.redirectionUrl, listItem.redirectionUrl) && Intrinsics.a(this.contentType, listItem.contentType) && Intrinsics.a(this.rank, listItem.rank) && Intrinsics.a(this.winners, listItem.winners) && Intrinsics.a(this.buttonDeeplink, listItem.buttonDeeplink) && Intrinsics.a(this.buttonImage, listItem.buttonImage) && Intrinsics.a(this.analytics, listItem.analytics);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final String getButtonDeeplink() {
        return this.buttonDeeplink;
    }

    public final String getButtonImage() {
        return this.buttonImage;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMediaType() {
        return this.mediaType;
    }

    public final Integer getRank() {
        return this.rank;
    }

    @NotNull
    public final String getRedirectionType() {
        return this.redirectionType;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleExtra() {
        return this.subtitleExtra;
    }

    public final String getSubtitleState() {
        return this.subtitleState;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Winner> getWinners() {
        return this.winners;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.subtitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.subtitleExtra;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.subtitleState;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int g10 = h.g(this.contentType, h.g(this.redirectionUrl, h.g(this.redirectionType, h.g(this.mediaType, h.g(this.imageUrl, (i13 + hashCode4) * 31, 31), 31), 31), 31), 31);
        Integer num = this.rank;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i14 = (g10 + hashCode5) * 31;
        List<Winner> list = this.winners;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str5 = this.buttonDeeplink;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str6 = this.buttonImage;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Analytics analytics = this.analytics;
        if (analytics != null) {
            i10 = analytics.hashCode();
        }
        return i17 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.subtitleExtra;
        String str4 = this.subtitleState;
        String str5 = this.imageUrl;
        String str6 = this.mediaType;
        String str7 = this.redirectionType;
        String str8 = this.redirectionUrl;
        String str9 = this.contentType;
        Integer num = this.rank;
        List<Winner> list = this.winners;
        String str10 = this.buttonDeeplink;
        String str11 = this.buttonImage;
        Analytics analytics = this.analytics;
        StringBuilder l10 = e.l("ListItem(title=", str, ", subtitle=", str2, ", subtitleExtra=");
        e.v(l10, str3, ", subtitleState=", str4, ", imageUrl=");
        e.v(l10, str5, ", mediaType=", str6, ", redirectionType=");
        e.v(l10, str7, ", redirectionUrl=", str8, ", contentType=");
        l10.append(str9);
        l10.append(", rank=");
        l10.append(num);
        l10.append(", winners=");
        l10.append(list);
        l10.append(", buttonDeeplink=");
        l10.append(str10);
        l10.append(", buttonImage=");
        l10.append(str11);
        l10.append(", analytics=");
        l10.append(analytics);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ ListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, List list, String str10, String str11, Analytics analytics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, str5, str6, str7, str8, str9, (i10 & 512) != 0 ? null : num, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : list, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : str11, analytics);
    }
}
