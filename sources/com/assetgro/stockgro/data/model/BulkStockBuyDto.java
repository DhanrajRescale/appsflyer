package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import da.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/BulkStockBuyDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stockId", HttpUrl.FRAGMENT_ENCODE_SET, "quantity", HttpUrl.FRAGMENT_ENCODE_SET, "executionPrice", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ID)V", "getExecutionPrice", "()D", "getQuantity", "()I", "getStockId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BulkStockBuyDto {
    public static final int $stable = 0;

    @SerializedName("entry_price")
    private final double executionPrice;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("stock_id")
    @NotNull
    private final String stockId;

    public BulkStockBuyDto(@NotNull String stockId, int i10, double d10) {
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        this.stockId = stockId;
        this.quantity = i10;
        this.executionPrice = d10;
    }

    public static /* synthetic */ BulkStockBuyDto copy$default(BulkStockBuyDto bulkStockBuyDto, String str, int i10, double d10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bulkStockBuyDto.stockId;
        }
        if ((i11 & 2) != 0) {
            i10 = bulkStockBuyDto.quantity;
        }
        if ((i11 & 4) != 0) {
            d10 = bulkStockBuyDto.executionPrice;
        }
        return bulkStockBuyDto.copy(str, i10, d10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStockId() {
        return this.stockId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    @NotNull
    public final BulkStockBuyDto copy(@NotNull String stockId, int quantity, double executionPrice) {
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        return new BulkStockBuyDto(stockId, quantity, executionPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulkStockBuyDto)) {
            return false;
        }
        BulkStockBuyDto bulkStockBuyDto = (BulkStockBuyDto) other;
        return Intrinsics.a(this.stockId, bulkStockBuyDto.stockId) && this.quantity == bulkStockBuyDto.quantity && Double.compare(this.executionPrice, bulkStockBuyDto.executionPrice) == 0;
    }

    public final double getExecutionPrice() {
        return this.executionPrice;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getStockId() {
        return this.stockId;
    }

    public int hashCode() {
        return Double.hashCode(this.executionPrice) + e.f(this.quantity, this.stockId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BulkStockBuyDto(stockId=" + this.stockId + ", quantity=" + this.quantity + ", executionPrice=" + this.executionPrice + ")";
    }
}
