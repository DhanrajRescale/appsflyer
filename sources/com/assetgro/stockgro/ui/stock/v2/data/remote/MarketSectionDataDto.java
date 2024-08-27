package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;
import zi.g;
import zi.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\r\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\rHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0093\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\r2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b\u0018\u0010+R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b-\u0010(R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b1\u00100R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b2\u00100R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b3\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b4\u0010(¨\u00067"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketSectionDataDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/k;", "toNarrationUiData", "Lzi/g;", "toMarketSectionData", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "component3", "component4", "component5", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/AxisUnitDto;", "component6", "component7", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/DataUnitDto;", "component8", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "component9", "component10", "sectionSentiment", "representationType", "isChartRepresentationTransposed", "description", "intersectionTitle", "columnHeaders", "rowHeaders", "dataSet", "universalNarrationDtos", "universalNarrationTitle", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getSectionSentiment", "()Ljava/lang/String;", "getRepresentationType", "Z", "()Z", "getDescription", "getIntersectionTitle", "Ljava/util/List;", "getColumnHeaders", "()Ljava/util/List;", "getRowHeaders", "getDataSet", "getUniversalNarrationDtos", "getUniversalNarrationTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MarketSectionDataDto {
    public static final int $stable = 8;

    @SerializedName("column_headers")
    @NotNull
    private final List<AxisUnitDto> columnHeaders;

    @SerializedName("column_row_values")
    @NotNull
    private final List<List<DataUnitDto>> dataSet;

    @SerializedName("description")
    private final String description;

    @SerializedName("intersection_title")
    @NotNull
    private final String intersectionTitle;

    @SerializedName("is_chart_representation_transposed")
    private final boolean isChartRepresentationTransposed;

    @SerializedName("representation_type")
    @NotNull
    private final String representationType;

    @SerializedName("row_headers")
    @NotNull
    private final List<AxisUnitDto> rowHeaders;

    @SerializedName("sentiment")
    private final String sectionSentiment;

    @SerializedName("universal_narrations")
    private final List<NarrationDto> universalNarrationDtos;

    @SerializedName("universal_narration_title")
    private final String universalNarrationTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketSectionDataDto(String str, @NotNull String representationType, boolean z10, String str2, @NotNull String intersectionTitle, @NotNull List<AxisUnitDto> columnHeaders, @NotNull List<AxisUnitDto> rowHeaders, @NotNull List<? extends List<DataUnitDto>> dataSet, List<NarrationDto> list, String str3) {
        Intrinsics.checkNotNullParameter(representationType, "representationType");
        Intrinsics.checkNotNullParameter(intersectionTitle, "intersectionTitle");
        Intrinsics.checkNotNullParameter(columnHeaders, "columnHeaders");
        Intrinsics.checkNotNullParameter(rowHeaders, "rowHeaders");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        this.sectionSentiment = str;
        this.representationType = representationType;
        this.isChartRepresentationTransposed = z10;
        this.description = str2;
        this.intersectionTitle = intersectionTitle;
        this.columnHeaders = columnHeaders;
        this.rowHeaders = rowHeaders;
        this.dataSet = dataSet;
        this.universalNarrationDtos = list;
        this.universalNarrationTitle = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    private final k toNarrationUiData() {
        ?? r22;
        String str = this.universalNarrationTitle;
        if (str != null) {
            List<NarrationDto> list = this.universalNarrationDtos;
            if (list != null) {
                r22 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r22.add(((NarrationDto) it.next()).toNarration());
                }
            } else {
                r22 = i0.f38321a;
            }
            return new k(str, r22);
        }
        return null;
    }

    /* renamed from: component1, reason: from getter */
    public final String getSectionSentiment() {
        return this.sectionSentiment;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUniversalNarrationTitle() {
        return this.universalNarrationTitle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRepresentationType() {
        return this.representationType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChartRepresentationTransposed() {
        return this.isChartRepresentationTransposed;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getIntersectionTitle() {
        return this.intersectionTitle;
    }

    @NotNull
    public final List<AxisUnitDto> component6() {
        return this.columnHeaders;
    }

    @NotNull
    public final List<AxisUnitDto> component7() {
        return this.rowHeaders;
    }

    @NotNull
    public final List<List<DataUnitDto>> component8() {
        return this.dataSet;
    }

    public final List<NarrationDto> component9() {
        return this.universalNarrationDtos;
    }

    @NotNull
    public final MarketSectionDataDto copy(String sectionSentiment, @NotNull String representationType, boolean isChartRepresentationTransposed, String description, @NotNull String intersectionTitle, @NotNull List<AxisUnitDto> columnHeaders, @NotNull List<AxisUnitDto> rowHeaders, @NotNull List<? extends List<DataUnitDto>> dataSet, List<NarrationDto> universalNarrationDtos, String universalNarrationTitle) {
        Intrinsics.checkNotNullParameter(representationType, "representationType");
        Intrinsics.checkNotNullParameter(intersectionTitle, "intersectionTitle");
        Intrinsics.checkNotNullParameter(columnHeaders, "columnHeaders");
        Intrinsics.checkNotNullParameter(rowHeaders, "rowHeaders");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        return new MarketSectionDataDto(sectionSentiment, representationType, isChartRepresentationTransposed, description, intersectionTitle, columnHeaders, rowHeaders, dataSet, universalNarrationDtos, universalNarrationTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketSectionDataDto)) {
            return false;
        }
        MarketSectionDataDto marketSectionDataDto = (MarketSectionDataDto) other;
        return Intrinsics.a(this.sectionSentiment, marketSectionDataDto.sectionSentiment) && Intrinsics.a(this.representationType, marketSectionDataDto.representationType) && this.isChartRepresentationTransposed == marketSectionDataDto.isChartRepresentationTransposed && Intrinsics.a(this.description, marketSectionDataDto.description) && Intrinsics.a(this.intersectionTitle, marketSectionDataDto.intersectionTitle) && Intrinsics.a(this.columnHeaders, marketSectionDataDto.columnHeaders) && Intrinsics.a(this.rowHeaders, marketSectionDataDto.rowHeaders) && Intrinsics.a(this.dataSet, marketSectionDataDto.dataSet) && Intrinsics.a(this.universalNarrationDtos, marketSectionDataDto.universalNarrationDtos) && Intrinsics.a(this.universalNarrationTitle, marketSectionDataDto.universalNarrationTitle);
    }

    @NotNull
    public final List<AxisUnitDto> getColumnHeaders() {
        return this.columnHeaders;
    }

    @NotNull
    public final List<List<DataUnitDto>> getDataSet() {
        return this.dataSet;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getIntersectionTitle() {
        return this.intersectionTitle;
    }

    @NotNull
    public final String getRepresentationType() {
        return this.representationType;
    }

    @NotNull
    public final List<AxisUnitDto> getRowHeaders() {
        return this.rowHeaders;
    }

    public final String getSectionSentiment() {
        return this.sectionSentiment;
    }

    public final List<NarrationDto> getUniversalNarrationDtos() {
        return this.universalNarrationDtos;
    }

    public final String getUniversalNarrationTitle() {
        return this.universalNarrationTitle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.sectionSentiment;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = e.d(this.isChartRepresentationTransposed, h.g(this.representationType, hashCode * 31, 31), 31);
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int e10 = d.e(this.dataSet, d.e(this.rowHeaders, d.e(this.columnHeaders, h.g(this.intersectionTitle, (d10 + hashCode2) * 31, 31), 31), 31), 31);
        List<NarrationDto> list = this.universalNarrationDtos;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i11 = (e10 + hashCode3) * 31;
        String str3 = this.universalNarrationTitle;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isChartRepresentationTransposed() {
        return this.isChartRepresentationTransposed;
    }

    @NotNull
    public final g toMarketSectionData() {
        String str = this.sectionSentiment;
        String str2 = this.representationType;
        boolean z10 = this.isChartRepresentationTransposed;
        String str3 = this.description;
        String str4 = this.intersectionTitle;
        List<AxisUnitDto> list = this.columnHeaders;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AxisUnitDto) it.next()).toAxisUnit());
        }
        List<AxisUnitDto> list2 = this.rowHeaders;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AxisUnitDto) it2.next()).toAxisUnit());
        }
        List<List<DataUnitDto>> list3 = this.dataSet;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((DataUnitDto) it4.next()).toDataUnit());
            }
            arrayList3.add(arrayList4);
        }
        return new g(str, str2, z10, str3, str4, arrayList, arrayList2, arrayList3, toNarrationUiData());
    }

    @NotNull
    public String toString() {
        String str = this.sectionSentiment;
        String str2 = this.representationType;
        boolean z10 = this.isChartRepresentationTransposed;
        String str3 = this.description;
        String str4 = this.intersectionTitle;
        List<AxisUnitDto> list = this.columnHeaders;
        List<AxisUnitDto> list2 = this.rowHeaders;
        List<List<DataUnitDto>> list3 = this.dataSet;
        List<NarrationDto> list4 = this.universalNarrationDtos;
        String str5 = this.universalNarrationTitle;
        StringBuilder l10 = e.l("MarketSectionDataDto(sectionSentiment=", str, ", representationType=", str2, ", isChartRepresentationTransposed=");
        l10.append(z10);
        l10.append(", description=");
        l10.append(str3);
        l10.append(", intersectionTitle=");
        l10.append(str4);
        l10.append(", columnHeaders=");
        l10.append(list);
        l10.append(", rowHeaders=");
        l10.append(list2);
        l10.append(", dataSet=");
        l10.append(list3);
        l10.append(", universalNarrationDtos=");
        l10.append(list4);
        l10.append(", universalNarrationTitle=");
        l10.append(str5);
        l10.append(")");
        return l10.toString();
    }
}
