package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zi.n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisEmaConfigDto;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisCalculationType;", "Lzi/n;", "toStockAnalysisConfig", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;", "component1", "component2", "component3", HttpUrl.FRAGMENT_ENCODE_SET, "component4", "component5", "cagrInEps", "discountPercentage", "estimatedPE", "ttmEPS", "cmp", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;", "getCagrInEps", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;", "getDiscountPercentage", "getEstimatedPE", "F", "getTtmEPS", "()F", "getCmp", "<init>", "(Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockAnalysisInputConfigDto;FF)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockAnalysisEmaConfigDto implements StockAnalysisCalculationType {
    public static final int $stable = 0;

    @SerializedName("eps_cagr_config")
    @NotNull
    private final StockAnalysisInputConfigDto cagrInEps;

    @SerializedName("ltp")
    private final float cmp;

    @SerializedName("discount_rate_config")
    @NotNull
    private final StockAnalysisInputConfigDto discountPercentage;

    @SerializedName("estimated_pe_config")
    @NotNull
    private final StockAnalysisInputConfigDto estimatedPE;

    @SerializedName("ttm_eps")
    private final float ttmEPS;

    public StockAnalysisEmaConfigDto(@NotNull StockAnalysisInputConfigDto cagrInEps, @NotNull StockAnalysisInputConfigDto discountPercentage, @NotNull StockAnalysisInputConfigDto estimatedPE, float f10, float f11) {
        Intrinsics.checkNotNullParameter(cagrInEps, "cagrInEps");
        Intrinsics.checkNotNullParameter(discountPercentage, "discountPercentage");
        Intrinsics.checkNotNullParameter(estimatedPE, "estimatedPE");
        this.cagrInEps = cagrInEps;
        this.discountPercentage = discountPercentage;
        this.estimatedPE = estimatedPE;
        this.ttmEPS = f10;
        this.cmp = f11;
    }

    public static /* synthetic */ StockAnalysisEmaConfigDto copy$default(StockAnalysisEmaConfigDto stockAnalysisEmaConfigDto, StockAnalysisInputConfigDto stockAnalysisInputConfigDto, StockAnalysisInputConfigDto stockAnalysisInputConfigDto2, StockAnalysisInputConfigDto stockAnalysisInputConfigDto3, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stockAnalysisInputConfigDto = stockAnalysisEmaConfigDto.cagrInEps;
        }
        if ((i10 & 2) != 0) {
            stockAnalysisInputConfigDto2 = stockAnalysisEmaConfigDto.discountPercentage;
        }
        StockAnalysisInputConfigDto stockAnalysisInputConfigDto4 = stockAnalysisInputConfigDto2;
        if ((i10 & 4) != 0) {
            stockAnalysisInputConfigDto3 = stockAnalysisEmaConfigDto.estimatedPE;
        }
        StockAnalysisInputConfigDto stockAnalysisInputConfigDto5 = stockAnalysisInputConfigDto3;
        if ((i10 & 8) != 0) {
            f10 = stockAnalysisEmaConfigDto.ttmEPS;
        }
        float f12 = f10;
        if ((i10 & 16) != 0) {
            f11 = stockAnalysisEmaConfigDto.cmp;
        }
        return stockAnalysisEmaConfigDto.copy(stockAnalysisInputConfigDto, stockAnalysisInputConfigDto4, stockAnalysisInputConfigDto5, f12, f11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StockAnalysisInputConfigDto getCagrInEps() {
        return this.cagrInEps;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StockAnalysisInputConfigDto getDiscountPercentage() {
        return this.discountPercentage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StockAnalysisInputConfigDto getEstimatedPE() {
        return this.estimatedPE;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTtmEPS() {
        return this.ttmEPS;
    }

    /* renamed from: component5, reason: from getter */
    public final float getCmp() {
        return this.cmp;
    }

    @NotNull
    public final StockAnalysisEmaConfigDto copy(@NotNull StockAnalysisInputConfigDto cagrInEps, @NotNull StockAnalysisInputConfigDto discountPercentage, @NotNull StockAnalysisInputConfigDto estimatedPE, float ttmEPS, float cmp) {
        Intrinsics.checkNotNullParameter(cagrInEps, "cagrInEps");
        Intrinsics.checkNotNullParameter(discountPercentage, "discountPercentage");
        Intrinsics.checkNotNullParameter(estimatedPE, "estimatedPE");
        return new StockAnalysisEmaConfigDto(cagrInEps, discountPercentage, estimatedPE, ttmEPS, cmp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockAnalysisEmaConfigDto)) {
            return false;
        }
        StockAnalysisEmaConfigDto stockAnalysisEmaConfigDto = (StockAnalysisEmaConfigDto) other;
        return Intrinsics.a(this.cagrInEps, stockAnalysisEmaConfigDto.cagrInEps) && Intrinsics.a(this.discountPercentage, stockAnalysisEmaConfigDto.discountPercentage) && Intrinsics.a(this.estimatedPE, stockAnalysisEmaConfigDto.estimatedPE) && Float.compare(this.ttmEPS, stockAnalysisEmaConfigDto.ttmEPS) == 0 && Float.compare(this.cmp, stockAnalysisEmaConfigDto.cmp) == 0;
    }

    @NotNull
    public final StockAnalysisInputConfigDto getCagrInEps() {
        return this.cagrInEps;
    }

    public final float getCmp() {
        return this.cmp;
    }

    @NotNull
    public final StockAnalysisInputConfigDto getDiscountPercentage() {
        return this.discountPercentage;
    }

    @NotNull
    public final StockAnalysisInputConfigDto getEstimatedPE() {
        return this.estimatedPE;
    }

    public final float getTtmEPS() {
        return this.ttmEPS;
    }

    public int hashCode() {
        return Float.hashCode(this.cmp) + e.a(this.ttmEPS, (this.estimatedPE.hashCode() + ((this.discountPercentage.hashCode() + (this.cagrInEps.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // com.assetgro.stockgro.ui.stock.v2.data.remote.StockAnalysisCalculationType
    @NotNull
    public n toStockAnalysisConfig() {
        return new n(this.cagrInEps.toMarketInputParameter(), this.estimatedPE.toMarketInputParameter(), this.discountPercentage.toMarketInputParameter(), this.cmp, this.ttmEPS);
    }

    @NotNull
    public String toString() {
        return "StockAnalysisEmaConfigDto(cagrInEps=" + this.cagrInEps + ", discountPercentage=" + this.discountPercentage + ", estimatedPE=" + this.estimatedPE + ", ttmEPS=" + this.ttmEPS + ", cmp=" + this.cmp + ")";
    }
}
