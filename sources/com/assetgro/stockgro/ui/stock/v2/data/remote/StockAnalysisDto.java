package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisCalculationType;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.y;
import zi.c;
import zi.k;
import zi.l;
import zi.n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b \u0010!J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J8\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/l;", "toMarketAnalysis", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "component1", "component2", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "component3", "narration", "stockAnalysisConfigDto", "emptyDataDto", "copy", "(Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;)Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisDto;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "getNarration", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "getStockAnalysisConfigDto", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "getEmptyDataDto", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;", "<init>", "(Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/EmptyDataDto;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockAnalysisDto<T extends StockAnalysisCalculationType> {
    public static final int $stable = 0;

    @SerializedName("empty_data")
    private final EmptyDataDto emptyDataDto;

    @SerializedName("narration")
    @NotNull
    private final NarrationDto narration;

    @SerializedName(PaymentConstants.Category.CONFIG)
    private final T stockAnalysisConfigDto;

    public StockAnalysisDto(@NotNull NarrationDto narration, T t10, EmptyDataDto emptyDataDto) {
        Intrinsics.checkNotNullParameter(narration, "narration");
        this.narration = narration;
        this.stockAnalysisConfigDto = t10;
        this.emptyDataDto = emptyDataDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StockAnalysisDto copy$default(StockAnalysisDto stockAnalysisDto, NarrationDto narrationDto, StockAnalysisCalculationType stockAnalysisCalculationType, EmptyDataDto emptyDataDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            narrationDto = stockAnalysisDto.narration;
        }
        if ((i10 & 2) != 0) {
            stockAnalysisCalculationType = stockAnalysisDto.stockAnalysisConfigDto;
        }
        if ((i10 & 4) != 0) {
            emptyDataDto = stockAnalysisDto.emptyDataDto;
        }
        return stockAnalysisDto.copy(narrationDto, stockAnalysisCalculationType, emptyDataDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NarrationDto getNarration() {
        return this.narration;
    }

    public final T component2() {
        return this.stockAnalysisConfigDto;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyDataDto getEmptyDataDto() {
        return this.emptyDataDto;
    }

    @NotNull
    public final StockAnalysisDto<T> copy(@NotNull NarrationDto narration, T stockAnalysisConfigDto, EmptyDataDto emptyDataDto) {
        Intrinsics.checkNotNullParameter(narration, "narration");
        return new StockAnalysisDto<>(narration, stockAnalysisConfigDto, emptyDataDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockAnalysisDto)) {
            return false;
        }
        StockAnalysisDto stockAnalysisDto = (StockAnalysisDto) other;
        return Intrinsics.a(this.narration, stockAnalysisDto.narration) && Intrinsics.a(this.stockAnalysisConfigDto, stockAnalysisDto.stockAnalysisConfigDto) && Intrinsics.a(this.emptyDataDto, stockAnalysisDto.emptyDataDto);
    }

    public final EmptyDataDto getEmptyDataDto() {
        return this.emptyDataDto;
    }

    @NotNull
    public final NarrationDto getNarration() {
        return this.narration;
    }

    public final T getStockAnalysisConfigDto() {
        return this.stockAnalysisConfigDto;
    }

    public int hashCode() {
        int hashCode = this.narration.hashCode() * 31;
        T t10 = this.stockAnalysisConfigDto;
        int hashCode2 = (hashCode + (t10 == null ? 0 : t10.hashCode())) * 31;
        EmptyDataDto emptyDataDto = this.emptyDataDto;
        return hashCode2 + (emptyDataDto != null ? emptyDataDto.hashCode() : 0);
    }

    @NotNull
    public final l toMarketAnalysis() {
        n nVar;
        k kVar = new k(HttpUrl.FRAGMENT_ENCODE_SET, y.c(this.narration.toNarration()));
        T t10 = this.stockAnalysisConfigDto;
        c cVar = null;
        if (t10 != null) {
            nVar = t10.toStockAnalysisConfig();
        } else {
            nVar = null;
        }
        EmptyDataDto emptyDataDto = this.emptyDataDto;
        if (emptyDataDto != null) {
            cVar = emptyDataDto.toEmptyData();
        }
        return new l(kVar, nVar, cVar);
    }

    @NotNull
    public String toString() {
        return "StockAnalysisDto(narration=" + this.narration + ", stockAnalysisConfigDto=" + this.stockAnalysisConfigDto + ", emptyDataDto=" + this.emptyDataDto + ")";
    }
}
