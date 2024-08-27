package com.assetgro.stockgro.data.model.homedata;

import com.assetgro.stockgro.ui.portfolio.v2.domain.model.Portfolio;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J®\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00052\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006<"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/Widget;", HttpUrl.FRAGMENT_ENCODE_SET, "widgetId", HttpUrl.FRAGMENT_ENCODE_SET, "listItems", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/homedata/ListItem;", "title", "isExtraActionAvailable", HttpUrl.FRAGMENT_ENCODE_SET, "bannerData", "Lcom/assetgro/stockgro/data/model/homedata/BannerData;", "extraActionCtaTitle", "extraActionBehavior", "subtitle", "widgetType", "autoScrollTimeInSec", HttpUrl.FRAGMENT_ENCODE_SET, "portfolios", "Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/Portfolio;", "widgetData", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/assetgro/stockgro/data/model/homedata/BannerData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;)V", "getAutoScrollTimeInSec", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBannerData", "()Lcom/assetgro/stockgro/data/model/homedata/BannerData;", "getExtraActionBehavior", "()Ljava/lang/String;", "getExtraActionCtaTitle", "()Z", "getListItems", "()Ljava/util/List;", "getPortfolios", "getSubtitle", "getTitle", "getWidgetData", "()Ljava/util/Map;", "getWidgetId", "getWidgetType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/assetgro/stockgro/data/model/homedata/BannerData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;)Lcom/assetgro/stockgro/data/model/homedata/Widget;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Widget {
    public static final int $stable = 0;

    @SerializedName("auto_scroll_time_in_sec")
    private final Long autoScrollTimeInSec;

    @SerializedName(alternate = {"banner_data"}, value = "bannerData")
    private final BannerData bannerData;

    @SerializedName("extra_action_behavior")
    private final String extraActionBehavior;

    @SerializedName("extra_action_cta_title")
    private final String extraActionCtaTitle;

    @SerializedName("extra_action_available")
    private final boolean isExtraActionAvailable;

    @SerializedName(alternate = {"list_items"}, value = "listItems")
    @NotNull
    private final List<ListItem> listItems;

    @SerializedName("portfolios")
    private final List<Portfolio> portfolios;

    @SerializedName(alternate = {"section_sub_title"}, value = "subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("widget_data")
    private final Map<String, Object> widgetData;

    @SerializedName(alternate = {"section_id"}, value = "widget_id")
    @NotNull
    private final String widgetId;

    @SerializedName(alternate = {"widget_type"}, value = "widgetType")
    @NotNull
    private final String widgetType;

    public Widget(@NotNull String widgetId, @NotNull List<ListItem> listItems, String str, boolean z10, BannerData bannerData, String str2, String str3, String str4, @NotNull String widgetType, Long l10, List<Portfolio> list, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.widgetId = widgetId;
        this.listItems = listItems;
        this.title = str;
        this.isExtraActionAvailable = z10;
        this.bannerData = bannerData;
        this.extraActionCtaTitle = str2;
        this.extraActionBehavior = str3;
        this.subtitle = str4;
        this.widgetType = widgetType;
        this.autoScrollTimeInSec = l10;
        this.portfolios = list;
        this.widgetData = map;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getAutoScrollTimeInSec() {
        return this.autoScrollTimeInSec;
    }

    public final List<Portfolio> component11() {
        return this.portfolios;
    }

    public final Map<String, Object> component12() {
        return this.widgetData;
    }

    @NotNull
    public final List<ListItem> component2() {
        return this.listItems;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExtraActionAvailable() {
        return this.isExtraActionAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final BannerData getBannerData() {
        return this.bannerData;
    }

    /* renamed from: component6, reason: from getter */
    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    @NotNull
    public final Widget copy(@NotNull String widgetId, @NotNull List<ListItem> listItems, String title, boolean isExtraActionAvailable, BannerData bannerData, String extraActionCtaTitle, String extraActionBehavior, String subtitle, @NotNull String widgetType, Long autoScrollTimeInSec, List<Portfolio> portfolios, Map<String, ? extends Object> widgetData) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new Widget(widgetId, listItems, title, isExtraActionAvailable, bannerData, extraActionCtaTitle, extraActionBehavior, subtitle, widgetType, autoScrollTimeInSec, portfolios, widgetData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) other;
        return Intrinsics.a(this.widgetId, widget.widgetId) && Intrinsics.a(this.listItems, widget.listItems) && Intrinsics.a(this.title, widget.title) && this.isExtraActionAvailable == widget.isExtraActionAvailable && Intrinsics.a(this.bannerData, widget.bannerData) && Intrinsics.a(this.extraActionCtaTitle, widget.extraActionCtaTitle) && Intrinsics.a(this.extraActionBehavior, widget.extraActionBehavior) && Intrinsics.a(this.subtitle, widget.subtitle) && Intrinsics.a(this.widgetType, widget.widgetType) && Intrinsics.a(this.autoScrollTimeInSec, widget.autoScrollTimeInSec) && Intrinsics.a(this.portfolios, widget.portfolios) && Intrinsics.a(this.widgetData, widget.widgetData);
    }

    public final Long getAutoScrollTimeInSec() {
        return this.autoScrollTimeInSec;
    }

    public final BannerData getBannerData() {
        return this.bannerData;
    }

    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    @NotNull
    public final List<ListItem> getListItems() {
        return this.listItems;
    }

    public final List<Portfolio> getPortfolios() {
        return this.portfolios;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, Object> getWidgetData() {
        return this.widgetData;
    }

    @NotNull
    public final String getWidgetId() {
        return this.widgetId;
    }

    @NotNull
    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int e10 = d.e(this.listItems, this.widgetId.hashCode() * 31, 31);
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = e.d(this.isExtraActionAvailable, (e10 + hashCode) * 31, 31);
        BannerData bannerData = this.bannerData;
        if (bannerData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bannerData.hashCode();
        }
        int i11 = (d10 + hashCode2) * 31;
        String str2 = this.extraActionCtaTitle;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.extraActionBehavior;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str4 = this.subtitle;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int g10 = h.g(this.widgetType, (i13 + hashCode5) * 31, 31);
        Long l10 = this.autoScrollTimeInSec;
        if (l10 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l10.hashCode();
        }
        int i14 = (g10 + hashCode6) * 31;
        List<Portfolio> list = this.portfolios;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Map<String, Object> map = this.widgetData;
        if (map != null) {
            i10 = map.hashCode();
        }
        return i15 + i10;
    }

    public final boolean isExtraActionAvailable() {
        return this.isExtraActionAvailable;
    }

    @NotNull
    public String toString() {
        String str = this.widgetId;
        List<ListItem> list = this.listItems;
        String str2 = this.title;
        boolean z10 = this.isExtraActionAvailable;
        BannerData bannerData = this.bannerData;
        String str3 = this.extraActionCtaTitle;
        String str4 = this.extraActionBehavior;
        String str5 = this.subtitle;
        String str6 = this.widgetType;
        Long l10 = this.autoScrollTimeInSec;
        List<Portfolio> list2 = this.portfolios;
        Map<String, Object> map = this.widgetData;
        StringBuilder sb2 = new StringBuilder("Widget(widgetId=");
        sb2.append(str);
        sb2.append(", listItems=");
        sb2.append(list);
        sb2.append(", title=");
        sb2.append(str2);
        sb2.append(", isExtraActionAvailable=");
        sb2.append(z10);
        sb2.append(", bannerData=");
        sb2.append(bannerData);
        sb2.append(", extraActionCtaTitle=");
        sb2.append(str3);
        sb2.append(", extraActionBehavior=");
        e.v(sb2, str4, ", subtitle=", str5, ", widgetType=");
        sb2.append(str6);
        sb2.append(", autoScrollTimeInSec=");
        sb2.append(l10);
        sb2.append(", portfolios=");
        sb2.append(list2);
        sb2.append(", widgetData=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ Widget(String str, List list, String str2, boolean z10, BannerData bannerData, String str3, String str4, String str5, String str6, Long l10, List list2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : bannerData, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, str6, (i10 & 512) != 0 ? 10L : l10, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : list2, map);
    }
}
