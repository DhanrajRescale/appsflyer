package com.assetgro.stockgro.ui.portfolio.orders.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioFnoOrderResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "data", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/portfolio/orders/model/FnoOrderResponseData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioFnoOrderResponse {
    public static final int $stable = 8;

    @SerializedName("data")
    private final List<FnoOrderResponseData> data;

    public PortfolioFnoOrderResponse(List<FnoOrderResponseData> list) {
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioFnoOrderResponse copy$default(PortfolioFnoOrderResponse portfolioFnoOrderResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = portfolioFnoOrderResponse.data;
        }
        return portfolioFnoOrderResponse.copy(list);
    }

    public final List<FnoOrderResponseData> component1() {
        return this.data;
    }

    @NotNull
    public final PortfolioFnoOrderResponse copy(List<FnoOrderResponseData> data) {
        return new PortfolioFnoOrderResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PortfolioFnoOrderResponse) && Intrinsics.a(this.data, ((PortfolioFnoOrderResponse) other).data);
    }

    public final List<FnoOrderResponseData> getData() {
        return this.data;
    }

    public int hashCode() {
        List<FnoOrderResponseData> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("PortfolioFnoOrderResponse(data=", this.data, ")");
    }
}
