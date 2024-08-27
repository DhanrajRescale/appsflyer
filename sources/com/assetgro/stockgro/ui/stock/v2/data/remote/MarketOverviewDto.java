package com.assetgro.stockgro.ui.stock.v2.data.remote;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zi.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketOverviewDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/e;", "toMarketOverview", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketOverviewSectionDto;", "component1", "sections", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MarketOverviewDto {
    public static final int $stable = 8;

    @SerializedName("sections")
    @NotNull
    private final List<MarketOverviewSectionDto> sections;

    public MarketOverviewDto(@NotNull List<MarketOverviewSectionDto> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketOverviewDto copy$default(MarketOverviewDto marketOverviewDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = marketOverviewDto.sections;
        }
        return marketOverviewDto.copy(list);
    }

    @NotNull
    public final List<MarketOverviewSectionDto> component1() {
        return this.sections;
    }

    @NotNull
    public final MarketOverviewDto copy(@NotNull List<MarketOverviewSectionDto> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new MarketOverviewDto(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketOverviewDto) && Intrinsics.a(this.sections, ((MarketOverviewDto) other).sections);
    }

    @NotNull
    public final List<MarketOverviewSectionDto> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    @NotNull
    public final e toMarketOverview() {
        List<MarketOverviewSectionDto> list = this.sections;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarketOverviewSectionDto) it.next()).toMarketOverviewSection());
        }
        return new e(arrayList);
    }

    @NotNull
    public String toString() {
        return a.h("MarketOverviewDto(sections=", this.sections, ")");
    }
}
