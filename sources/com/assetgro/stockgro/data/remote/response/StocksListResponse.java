package com.assetgro.stockgro.data.remote.response;

import com.assetgro.stockgro.data.model.StockDto;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/StocksListResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "stocks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "index", "Lcom/assetgro/stockgro/data/remote/response/IndexDto;", "stocksCount", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/util/List;I)V", "getIndex", "()Ljava/util/List;", "getStocks", "getStocksCount", "()I", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StocksListResponse {
    public static final int $stable = 8;

    @SerializedName("index")
    private final List<IndexDto> index;

    @SerializedName("stocks")
    @NotNull
    private final List<StockDto> stocks;

    @SerializedName("stocks_count")
    private final int stocksCount;

    public StocksListResponse(@NotNull List<StockDto> stocks, List<IndexDto> list, int i10) {
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        this.stocks = stocks;
        this.index = list;
        this.stocksCount = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StocksListResponse copy$default(StocksListResponse stocksListResponse, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = stocksListResponse.stocks;
        }
        if ((i11 & 2) != 0) {
            list2 = stocksListResponse.index;
        }
        if ((i11 & 4) != 0) {
            i10 = stocksListResponse.stocksCount;
        }
        return stocksListResponse.copy(list, list2, i10);
    }

    @NotNull
    public final List<StockDto> component1() {
        return this.stocks;
    }

    public final List<IndexDto> component2() {
        return this.index;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStocksCount() {
        return this.stocksCount;
    }

    @NotNull
    public final StocksListResponse copy(@NotNull List<StockDto> stocks, List<IndexDto> index, int stocksCount) {
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        return new StocksListResponse(stocks, index, stocksCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StocksListResponse)) {
            return false;
        }
        StocksListResponse stocksListResponse = (StocksListResponse) other;
        return Intrinsics.a(this.stocks, stocksListResponse.stocks) && Intrinsics.a(this.index, stocksListResponse.index) && this.stocksCount == stocksListResponse.stocksCount;
    }

    public final List<IndexDto> getIndex() {
        return this.index;
    }

    @NotNull
    public final List<StockDto> getStocks() {
        return this.stocks;
    }

    public final int getStocksCount() {
        return this.stocksCount;
    }

    public int hashCode() {
        int hashCode = this.stocks.hashCode() * 31;
        List<IndexDto> list = this.index;
        return Integer.hashCode(this.stocksCount) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<StockDto> list = this.stocks;
        List<IndexDto> list2 = this.index;
        int i10 = this.stocksCount;
        StringBuilder sb2 = new StringBuilder("StocksListResponse(stocks=");
        sb2.append(list);
        sb2.append(", index=");
        sb2.append(list2);
        sb2.append(", stocksCount=");
        return d.m(sb2, i10, ")");
    }
}
