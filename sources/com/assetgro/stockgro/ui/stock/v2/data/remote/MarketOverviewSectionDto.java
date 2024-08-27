package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zi.c;
import zi.f;
import zi.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketOverviewSectionDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/f;", "toMarketOverviewSection", HttpUrl.FRAGMENT_ENCODE_SET, "component1", HttpUrl.FRAGMENT_ENCODE_SET, "component2", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "component3", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketSectionDataDto;", "component4", "sectionTitle", "showEmptyDataUi", "emptyDataDto", "marketSectionDataDto", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getSectionTitle", "()Ljava/lang/String;", "Z", "getShowEmptyDataUi", "()Z", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "getEmptyDataDto", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketSectionDataDto;", "getMarketSectionDataDto", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketSectionDataDto;", "<init>", "(Ljava/lang/String;ZLcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/MarketSectionDataDto;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MarketOverviewSectionDto {
    public static final int $stable = 8;

    @SerializedName("empty_data")
    private final EmptyDataDto emptyDataDto;

    @SerializedName("section_data")
    private final MarketSectionDataDto marketSectionDataDto;

    @SerializedName("title")
    @NotNull
    private final String sectionTitle;

    @SerializedName("show_empty_data_ui")
    private final boolean showEmptyDataUi;

    public MarketOverviewSectionDto(@NotNull String sectionTitle, boolean z10, EmptyDataDto emptyDataDto, MarketSectionDataDto marketSectionDataDto) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        this.sectionTitle = sectionTitle;
        this.showEmptyDataUi = z10;
        this.emptyDataDto = emptyDataDto;
        this.marketSectionDataDto = marketSectionDataDto;
    }

    public static /* synthetic */ MarketOverviewSectionDto copy$default(MarketOverviewSectionDto marketOverviewSectionDto, String str, boolean z10, EmptyDataDto emptyDataDto, MarketSectionDataDto marketSectionDataDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = marketOverviewSectionDto.sectionTitle;
        }
        if ((i10 & 2) != 0) {
            z10 = marketOverviewSectionDto.showEmptyDataUi;
        }
        if ((i10 & 4) != 0) {
            emptyDataDto = marketOverviewSectionDto.emptyDataDto;
        }
        if ((i10 & 8) != 0) {
            marketSectionDataDto = marketOverviewSectionDto.marketSectionDataDto;
        }
        return marketOverviewSectionDto.copy(str, z10, emptyDataDto, marketSectionDataDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowEmptyDataUi() {
        return this.showEmptyDataUi;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyDataDto getEmptyDataDto() {
        return this.emptyDataDto;
    }

    /* renamed from: component4, reason: from getter */
    public final MarketSectionDataDto getMarketSectionDataDto() {
        return this.marketSectionDataDto;
    }

    @NotNull
    public final MarketOverviewSectionDto copy(@NotNull String sectionTitle, boolean showEmptyDataUi, EmptyDataDto emptyDataDto, MarketSectionDataDto marketSectionDataDto) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        return new MarketOverviewSectionDto(sectionTitle, showEmptyDataUi, emptyDataDto, marketSectionDataDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketOverviewSectionDto)) {
            return false;
        }
        MarketOverviewSectionDto marketOverviewSectionDto = (MarketOverviewSectionDto) other;
        return Intrinsics.a(this.sectionTitle, marketOverviewSectionDto.sectionTitle) && this.showEmptyDataUi == marketOverviewSectionDto.showEmptyDataUi && Intrinsics.a(this.emptyDataDto, marketOverviewSectionDto.emptyDataDto) && Intrinsics.a(this.marketSectionDataDto, marketOverviewSectionDto.marketSectionDataDto);
    }

    public final EmptyDataDto getEmptyDataDto() {
        return this.emptyDataDto;
    }

    public final MarketSectionDataDto getMarketSectionDataDto() {
        return this.marketSectionDataDto;
    }

    @NotNull
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final boolean getShowEmptyDataUi() {
        return this.showEmptyDataUi;
    }

    public int hashCode() {
        int hashCode;
        int d10 = e.d(this.showEmptyDataUi, this.sectionTitle.hashCode() * 31, 31);
        EmptyDataDto emptyDataDto = this.emptyDataDto;
        int i10 = 0;
        if (emptyDataDto == null) {
            hashCode = 0;
        } else {
            hashCode = emptyDataDto.hashCode();
        }
        int i11 = (d10 + hashCode) * 31;
        MarketSectionDataDto marketSectionDataDto = this.marketSectionDataDto;
        if (marketSectionDataDto != null) {
            i10 = marketSectionDataDto.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public final f toMarketOverviewSection() {
        c cVar;
        String str = this.sectionTitle;
        boolean z10 = this.showEmptyDataUi;
        EmptyDataDto emptyDataDto = this.emptyDataDto;
        g gVar = null;
        if (emptyDataDto != null) {
            cVar = emptyDataDto.toEmptyData();
        } else {
            cVar = null;
        }
        MarketSectionDataDto marketSectionDataDto = this.marketSectionDataDto;
        if (marketSectionDataDto != null) {
            gVar = marketSectionDataDto.toMarketSectionData();
        }
        return new f(str, z10, cVar, gVar);
    }

    @NotNull
    public String toString() {
        return "MarketOverviewSectionDto(sectionTitle=" + this.sectionTitle + ", showEmptyDataUi=" + this.showEmptyDataUi + ", emptyDataDto=" + this.emptyDataDto + ", marketSectionDataDto=" + this.marketSectionDataDto + ")";
    }
}
