package com.assetgro.stockgro.ui.home.homepage.domain;

import com.assetgro.stockgro.ui.home.homepage.data.HomepageHeadingDto;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/SectionHomeDomain;", HttpUrl.FRAGMENT_ENCODE_SET, "sectionId", HttpUrl.FRAGMENT_ENCODE_SET, "widgetType", "heading", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;", "widgetData", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;)V", "getHeading", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;", "getSectionId", "()Ljava/lang/String;", "getWidgetData", "()Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "getWidgetType", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SectionHomeDomain {
    public static final int $stable = 0;
    private final HomepageHeadingDto heading;

    @NotNull
    private final String sectionId;
    private final WidgetDataInterface widgetData;

    @NotNull
    private final String widgetType;

    public SectionHomeDomain(@NotNull String sectionId, @NotNull String widgetType, HomepageHeadingDto homepageHeadingDto, WidgetDataInterface widgetDataInterface) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.sectionId = sectionId;
        this.widgetType = widgetType;
        this.heading = homepageHeadingDto;
        this.widgetData = widgetDataInterface;
    }

    public static /* synthetic */ SectionHomeDomain copy$default(SectionHomeDomain sectionHomeDomain, String str, String str2, HomepageHeadingDto homepageHeadingDto, WidgetDataInterface widgetDataInterface, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sectionHomeDomain.sectionId;
        }
        if ((i10 & 2) != 0) {
            str2 = sectionHomeDomain.widgetType;
        }
        if ((i10 & 4) != 0) {
            homepageHeadingDto = sectionHomeDomain.heading;
        }
        if ((i10 & 8) != 0) {
            widgetDataInterface = sectionHomeDomain.widgetData;
        }
        return sectionHomeDomain.copy(str, str2, homepageHeadingDto, widgetDataInterface);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    /* renamed from: component3, reason: from getter */
    public final HomepageHeadingDto getHeading() {
        return this.heading;
    }

    /* renamed from: component4, reason: from getter */
    public final WidgetDataInterface getWidgetData() {
        return this.widgetData;
    }

    @NotNull
    public final SectionHomeDomain copy(@NotNull String sectionId, @NotNull String widgetType, HomepageHeadingDto heading, WidgetDataInterface widgetData) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new SectionHomeDomain(sectionId, widgetType, heading, widgetData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionHomeDomain)) {
            return false;
        }
        SectionHomeDomain sectionHomeDomain = (SectionHomeDomain) other;
        return Intrinsics.a(this.sectionId, sectionHomeDomain.sectionId) && Intrinsics.a(this.widgetType, sectionHomeDomain.widgetType) && Intrinsics.a(this.heading, sectionHomeDomain.heading) && Intrinsics.a(this.widgetData, sectionHomeDomain.widgetData);
    }

    public final HomepageHeadingDto getHeading() {
        return this.heading;
    }

    @NotNull
    public final String getSectionId() {
        return this.sectionId;
    }

    public final WidgetDataInterface getWidgetData() {
        return this.widgetData;
    }

    @NotNull
    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.widgetType, this.sectionId.hashCode() * 31, 31);
        HomepageHeadingDto homepageHeadingDto = this.heading;
        int i10 = 0;
        if (homepageHeadingDto == null) {
            hashCode = 0;
        } else {
            hashCode = homepageHeadingDto.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        WidgetDataInterface widgetDataInterface = this.widgetData;
        if (widgetDataInterface != null) {
            i10 = widgetDataInterface.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.sectionId;
        String str2 = this.widgetType;
        HomepageHeadingDto homepageHeadingDto = this.heading;
        WidgetDataInterface widgetDataInterface = this.widgetData;
        StringBuilder l10 = e.l("SectionHomeDomain(sectionId=", str, ", widgetType=", str2, ", heading=");
        l10.append(homepageHeadingDto);
        l10.append(", widgetData=");
        l10.append(widgetDataInterface);
        l10.append(")");
        return l10.toString();
    }
}
