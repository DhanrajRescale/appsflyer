package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockDetailDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stockDto", "Lcom/assetgro/stockgro/data/model/StockDto;", "(Lcom/assetgro/stockgro/data/model/StockDto;)V", "getStockDto", "()Lcom/assetgro/stockgro/data/model/StockDto;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockDetailDto {
    public static final int $stable = 8;

    @SerializedName("stock")
    @NotNull
    private final StockDto stockDto;

    public StockDetailDto(@NotNull StockDto stockDto) {
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        this.stockDto = stockDto;
    }

    public static /* synthetic */ StockDetailDto copy$default(StockDetailDto stockDetailDto, StockDto stockDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stockDto = stockDetailDto.stockDto;
        }
        return stockDetailDto.copy(stockDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StockDto getStockDto() {
        return this.stockDto;
    }

    @NotNull
    public final StockDetailDto copy(@NotNull StockDto stockDto) {
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        return new StockDetailDto(stockDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StockDetailDto) && Intrinsics.a(this.stockDto, ((StockDetailDto) other).stockDto);
    }

    @NotNull
    public final StockDto getStockDto() {
        return this.stockDto;
    }

    public int hashCode() {
        return this.stockDto.hashCode();
    }

    @NotNull
    public String toString() {
        return "StockDetailDto(stockDto=" + this.stockDto + ")";
    }
}
