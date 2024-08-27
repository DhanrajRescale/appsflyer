package com.assetgro.stockgro.data.model.portfolio.orders;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/orders/PortfolioOrdersDto;", HttpUrl.FRAGMENT_ENCODE_SET, "bought", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/orders/Bought;", "sold", "allOrders", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllOrders", "()Ljava/util/List;", "getBought", "getSold", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioOrdersDto {
    public static final int $stable = 8;

    @SerializedName("all_orders")
    @NotNull
    private final List<Bought> allOrders;

    @SerializedName("bought_orders")
    @NotNull
    private final List<Bought> bought;

    @SerializedName("sold_orders")
    @NotNull
    private final List<Bought> sold;

    public PortfolioOrdersDto(@NotNull List<Bought> bought, @NotNull List<Bought> sold, @NotNull List<Bought> allOrders) {
        Intrinsics.checkNotNullParameter(bought, "bought");
        Intrinsics.checkNotNullParameter(sold, "sold");
        Intrinsics.checkNotNullParameter(allOrders, "allOrders");
        this.bought = bought;
        this.sold = sold;
        this.allOrders = allOrders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioOrdersDto copy$default(PortfolioOrdersDto portfolioOrdersDto, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = portfolioOrdersDto.bought;
        }
        if ((i10 & 2) != 0) {
            list2 = portfolioOrdersDto.sold;
        }
        if ((i10 & 4) != 0) {
            list3 = portfolioOrdersDto.allOrders;
        }
        return portfolioOrdersDto.copy(list, list2, list3);
    }

    @NotNull
    public final List<Bought> component1() {
        return this.bought;
    }

    @NotNull
    public final List<Bought> component2() {
        return this.sold;
    }

    @NotNull
    public final List<Bought> component3() {
        return this.allOrders;
    }

    @NotNull
    public final PortfolioOrdersDto copy(@NotNull List<Bought> bought, @NotNull List<Bought> sold, @NotNull List<Bought> allOrders) {
        Intrinsics.checkNotNullParameter(bought, "bought");
        Intrinsics.checkNotNullParameter(sold, "sold");
        Intrinsics.checkNotNullParameter(allOrders, "allOrders");
        return new PortfolioOrdersDto(bought, sold, allOrders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioOrdersDto)) {
            return false;
        }
        PortfolioOrdersDto portfolioOrdersDto = (PortfolioOrdersDto) other;
        return Intrinsics.a(this.bought, portfolioOrdersDto.bought) && Intrinsics.a(this.sold, portfolioOrdersDto.sold) && Intrinsics.a(this.allOrders, portfolioOrdersDto.allOrders);
    }

    @NotNull
    public final List<Bought> getAllOrders() {
        return this.allOrders;
    }

    @NotNull
    public final List<Bought> getBought() {
        return this.bought;
    }

    @NotNull
    public final List<Bought> getSold() {
        return this.sold;
    }

    public int hashCode() {
        return this.allOrders.hashCode() + d.e(this.sold, this.bought.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PortfolioOrdersDto(bought=" + this.bought + ", sold=" + this.sold + ", allOrders=" + this.allOrders + ")";
    }
}
