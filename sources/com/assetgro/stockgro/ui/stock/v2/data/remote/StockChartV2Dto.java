package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zi.c;
import zi.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/q;", "toStockChartV2", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockIntervalConfigDto;", "component1", HttpUrl.FRAGMENT_ENCODE_SET, "component2", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartDataPointDto;", "component3", HttpUrl.FRAGMENT_ENCODE_SET, "component4", "Lzi/c;", "component5", "intervals", "durationId", "dataPoints", "showEmptyData", "emptyData", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/util/List;", "getIntervals", "()Ljava/util/List;", "Ljava/lang/String;", "getDurationId", "()Ljava/lang/String;", "getDataPoints", "Z", "getShowEmptyData", "()Z", "Lzi/c;", "getEmptyData", "()Lzi/c;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLzi/c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockChartV2Dto {
    public static final int $stable = 8;

    @SerializedName("ts_data")
    private final List<StockChartDataPointDto> dataPoints;

    @SerializedName("duration_id")
    @NotNull
    private final String durationId;

    @SerializedName("empty_data")
    private final c emptyData;

    @SerializedName("available_durations")
    private final List<StockIntervalConfigDto> intervals;

    @SerializedName("show_empty_data_ui")
    private final boolean showEmptyData;

    public StockChartV2Dto(List<StockIntervalConfigDto> list, @NotNull String durationId, List<StockChartDataPointDto> list2, boolean z10, c cVar) {
        Intrinsics.checkNotNullParameter(durationId, "durationId");
        this.intervals = list;
        this.durationId = durationId;
        this.dataPoints = list2;
        this.showEmptyData = z10;
        this.emptyData = cVar;
    }

    public static /* synthetic */ StockChartV2Dto copy$default(StockChartV2Dto stockChartV2Dto, List list, String str, List list2, boolean z10, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = stockChartV2Dto.intervals;
        }
        if ((i10 & 2) != 0) {
            str = stockChartV2Dto.durationId;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            list2 = stockChartV2Dto.dataPoints;
        }
        List list3 = list2;
        if ((i10 & 8) != 0) {
            z10 = stockChartV2Dto.showEmptyData;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            cVar = stockChartV2Dto.emptyData;
        }
        return stockChartV2Dto.copy(list, str2, list3, z11, cVar);
    }

    public final List<StockIntervalConfigDto> component1() {
        return this.intervals;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDurationId() {
        return this.durationId;
    }

    public final List<StockChartDataPointDto> component3() {
        return this.dataPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowEmptyData() {
        return this.showEmptyData;
    }

    /* renamed from: component5, reason: from getter */
    public final c getEmptyData() {
        return this.emptyData;
    }

    @NotNull
    public final StockChartV2Dto copy(List<StockIntervalConfigDto> intervals, @NotNull String durationId, List<StockChartDataPointDto> dataPoints, boolean showEmptyData, c emptyData) {
        Intrinsics.checkNotNullParameter(durationId, "durationId");
        return new StockChartV2Dto(intervals, durationId, dataPoints, showEmptyData, emptyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockChartV2Dto)) {
            return false;
        }
        StockChartV2Dto stockChartV2Dto = (StockChartV2Dto) other;
        return Intrinsics.a(this.intervals, stockChartV2Dto.intervals) && Intrinsics.a(this.durationId, stockChartV2Dto.durationId) && Intrinsics.a(this.dataPoints, stockChartV2Dto.dataPoints) && this.showEmptyData == stockChartV2Dto.showEmptyData && Intrinsics.a(this.emptyData, stockChartV2Dto.emptyData);
    }

    public final List<StockChartDataPointDto> getDataPoints() {
        return this.dataPoints;
    }

    @NotNull
    public final String getDurationId() {
        return this.durationId;
    }

    public final c getEmptyData() {
        return this.emptyData;
    }

    public final List<StockIntervalConfigDto> getIntervals() {
        return this.intervals;
    }

    public final boolean getShowEmptyData() {
        return this.showEmptyData;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<StockIntervalConfigDto> list = this.intervals;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int g10 = h.g(this.durationId, hashCode * 31, 31);
        List<StockChartDataPointDto> list2 = this.dataPoints;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int d10 = e.d(this.showEmptyData, (g10 + hashCode2) * 31, 31);
        c cVar = this.emptyData;
        if (cVar != null) {
            i10 = cVar.f42466a.hashCode();
        }
        return d10 + i10;
    }

    @NotNull
    public final q toStockChartV2() {
        ArrayList arrayList;
        List<StockIntervalConfigDto> list = this.intervals;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((StockIntervalConfigDto) it.next()).toStockIntervalConfig());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String str = this.durationId;
        List<StockChartDataPointDto> list2 = this.dataPoints;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((StockChartDataPointDto) it2.next()).toDataPoint());
            }
        }
        return new q(arrayList, str, arrayList2, this.showEmptyData, this.emptyData);
    }

    @NotNull
    public String toString() {
        return "StockChartV2Dto(intervals=" + this.intervals + ", durationId=" + this.durationId + ", dataPoints=" + this.dataPoints + ", showEmptyData=" + this.showEmptyData + ", emptyData=" + this.emptyData + ")";
    }
}
