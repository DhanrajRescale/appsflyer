package com.assetgro.stockgro.ui.home.homepage.data;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/SectionHomeDto;", HttpUrl.FRAGMENT_ENCODE_SET, "sectionId", HttpUrl.FRAGMENT_ENCODE_SET, "widgetType", "heading", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;", "widgetData", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;Ljava/util/Map;)V", "getHeading", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;", "getSectionId", "()Ljava/lang/String;", "getWidgetData", "()Ljava/util/Map;", "getWidgetType", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SectionHomeDto {
    public static final int $stable = 0;

    @SerializedName("heading")
    private final HomepageHeadingDto heading;

    @SerializedName("section_id")
    @NotNull
    private final String sectionId;

    @SerializedName("data")
    private final Map<String, Object> widgetData;

    @SerializedName("type")
    @NotNull
    private final String widgetType;

    public SectionHomeDto(@NotNull String sectionId, @NotNull String widgetType, HomepageHeadingDto homepageHeadingDto, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.sectionId = sectionId;
        this.widgetType = widgetType;
        this.heading = homepageHeadingDto;
        this.widgetData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionHomeDto copy$default(SectionHomeDto sectionHomeDto, String str, String str2, HomepageHeadingDto homepageHeadingDto, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sectionHomeDto.sectionId;
        }
        if ((i10 & 2) != 0) {
            str2 = sectionHomeDto.widgetType;
        }
        if ((i10 & 4) != 0) {
            homepageHeadingDto = sectionHomeDto.heading;
        }
        if ((i10 & 8) != 0) {
            map = sectionHomeDto.widgetData;
        }
        return sectionHomeDto.copy(str, str2, homepageHeadingDto, map);
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

    public final Map<String, Object> component4() {
        return this.widgetData;
    }

    @NotNull
    public final SectionHomeDto copy(@NotNull String sectionId, @NotNull String widgetType, HomepageHeadingDto heading, Map<String, ? extends Object> widgetData) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new SectionHomeDto(sectionId, widgetType, heading, widgetData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionHomeDto)) {
            return false;
        }
        SectionHomeDto sectionHomeDto = (SectionHomeDto) other;
        return Intrinsics.a(this.sectionId, sectionHomeDto.sectionId) && Intrinsics.a(this.widgetType, sectionHomeDto.widgetType) && Intrinsics.a(this.heading, sectionHomeDto.heading) && Intrinsics.a(this.widgetData, sectionHomeDto.widgetData);
    }

    public final HomepageHeadingDto getHeading() {
        return this.heading;
    }

    @NotNull
    public final String getSectionId() {
        return this.sectionId;
    }

    public final Map<String, Object> getWidgetData() {
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
        Map<String, Object> map = this.widgetData;
        if (map != null) {
            i10 = map.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.sectionId;
        String str2 = this.widgetType;
        HomepageHeadingDto homepageHeadingDto = this.heading;
        Map<String, Object> map = this.widgetData;
        StringBuilder l10 = e.l("SectionHomeDto(sectionId=", str, ", widgetType=", str2, ", heading=");
        l10.append(homepageHeadingDto);
        l10.append(", widgetData=");
        l10.append(map);
        l10.append(")");
        return l10.toString();
    }
}
