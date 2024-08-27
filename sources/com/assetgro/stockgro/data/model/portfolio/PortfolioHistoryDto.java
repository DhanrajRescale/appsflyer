package com.assetgro.stockgro.data.model.portfolio;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/PortfolioHistoryDto;", HttpUrl.FRAGMENT_ENCODE_SET, "bought", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/HistoryOrderDto;", "sold", "cancelled", "allOrders", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllOrders", "()Ljava/util/List;", "getBought", "getCancelled", "getSold", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PortfolioHistoryDto {
    public static final int $stable = 8;

    @SerializedName("all_orders")
    @NotNull
    private final List<HistoryOrderDto> allOrders;

    @SerializedName("bought_orders")
    @NotNull
    private final List<HistoryOrderDto> bought;

    @SerializedName("cancelled_orders")
    @NotNull
    private final List<HistoryOrderDto> cancelled;

    @SerializedName("sold_orders")
    @NotNull
    private final List<HistoryOrderDto> sold;

    public PortfolioHistoryDto(@NotNull List<HistoryOrderDto> bought, @NotNull List<HistoryOrderDto> sold, @NotNull List<HistoryOrderDto> cancelled, @NotNull List<HistoryOrderDto> allOrders) {
        Intrinsics.checkNotNullParameter(bought, "bought");
        Intrinsics.checkNotNullParameter(sold, "sold");
        Intrinsics.checkNotNullParameter(cancelled, "cancelled");
        Intrinsics.checkNotNullParameter(allOrders, "allOrders");
        this.bought = bought;
        this.sold = sold;
        this.cancelled = cancelled;
        this.allOrders = allOrders;
    }

    @NotNull
    public final List<HistoryOrderDto> getAllOrders() {
        return this.allOrders;
    }

    @NotNull
    public final List<HistoryOrderDto> getBought() {
        return this.bought;
    }

    @NotNull
    public final List<HistoryOrderDto> getCancelled() {
        return this.cancelled;
    }

    @NotNull
    public final List<HistoryOrderDto> getSold() {
        return this.sold;
    }
}
