package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartBaseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "peData", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;", "pbData", "olhc", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockOhlc;", "(Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockOhlc;)V", "getOlhc", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockOhlc;", "getPbData", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockChartV2Dto;", "getPeData", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockChartBaseDto {
    public static final int $stable = 8;

    @SerializedName("olhc")
    @NotNull
    private final StockOhlc olhc;

    @SerializedName("pb_data")
    @NotNull
    private final StockChartV2Dto pbData;

    @SerializedName("pe_data")
    @NotNull
    private final StockChartV2Dto peData;

    public StockChartBaseDto(@NotNull StockChartV2Dto peData, @NotNull StockChartV2Dto pbData, @NotNull StockOhlc olhc) {
        Intrinsics.checkNotNullParameter(peData, "peData");
        Intrinsics.checkNotNullParameter(pbData, "pbData");
        Intrinsics.checkNotNullParameter(olhc, "olhc");
        this.peData = peData;
        this.pbData = pbData;
        this.olhc = olhc;
    }

    public static /* synthetic */ StockChartBaseDto copy$default(StockChartBaseDto stockChartBaseDto, StockChartV2Dto stockChartV2Dto, StockChartV2Dto stockChartV2Dto2, StockOhlc stockOhlc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stockChartV2Dto = stockChartBaseDto.peData;
        }
        if ((i10 & 2) != 0) {
            stockChartV2Dto2 = stockChartBaseDto.pbData;
        }
        if ((i10 & 4) != 0) {
            stockOhlc = stockChartBaseDto.olhc;
        }
        return stockChartBaseDto.copy(stockChartV2Dto, stockChartV2Dto2, stockOhlc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StockChartV2Dto getPeData() {
        return this.peData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StockChartV2Dto getPbData() {
        return this.pbData;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StockOhlc getOlhc() {
        return this.olhc;
    }

    @NotNull
    public final StockChartBaseDto copy(@NotNull StockChartV2Dto peData, @NotNull StockChartV2Dto pbData, @NotNull StockOhlc olhc) {
        Intrinsics.checkNotNullParameter(peData, "peData");
        Intrinsics.checkNotNullParameter(pbData, "pbData");
        Intrinsics.checkNotNullParameter(olhc, "olhc");
        return new StockChartBaseDto(peData, pbData, olhc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockChartBaseDto)) {
            return false;
        }
        StockChartBaseDto stockChartBaseDto = (StockChartBaseDto) other;
        return Intrinsics.a(this.peData, stockChartBaseDto.peData) && Intrinsics.a(this.pbData, stockChartBaseDto.pbData) && Intrinsics.a(this.olhc, stockChartBaseDto.olhc);
    }

    @NotNull
    public final StockOhlc getOlhc() {
        return this.olhc;
    }

    @NotNull
    public final StockChartV2Dto getPbData() {
        return this.pbData;
    }

    @NotNull
    public final StockChartV2Dto getPeData() {
        return this.peData;
    }

    public int hashCode() {
        return this.olhc.hashCode() + ((this.pbData.hashCode() + (this.peData.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "StockChartBaseDto(peData=" + this.peData + ", pbData=" + this.pbData + ", olhc=" + this.olhc + ")";
    }
}
