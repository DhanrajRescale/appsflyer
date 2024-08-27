package com.assetgro.stockgro.ui.portfolio.orders.model;

import com.google.gson.annotations.SerializedName;
import da.e;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/model/PortfolioPendingOrderCancelRequest;", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.ORDER_ID_CAMEL, HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", "isModel", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getOrderId", "()Ljava/lang/String;", "getPortfolioId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioPendingOrderCancelRequest {
    public static final int $stable = 0;

    @SerializedName("is_model")
    private final boolean isModel;

    @SerializedName(PaymentConstants.ORDER_ID)
    @NotNull
    private final String orderId;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    public PortfolioPendingOrderCancelRequest(@NotNull String orderId, @NotNull String portfolioId, boolean z10) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.orderId = orderId;
        this.portfolioId = portfolioId;
        this.isModel = z10;
    }

    public static /* synthetic */ PortfolioPendingOrderCancelRequest copy$default(PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = portfolioPendingOrderCancelRequest.orderId;
        }
        if ((i10 & 2) != 0) {
            str2 = portfolioPendingOrderCancelRequest.portfolioId;
        }
        if ((i10 & 4) != 0) {
            z10 = portfolioPendingOrderCancelRequest.isModel;
        }
        return portfolioPendingOrderCancelRequest.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    @NotNull
    public final PortfolioPendingOrderCancelRequest copy(@NotNull String orderId, @NotNull String portfolioId, boolean isModel) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new PortfolioPendingOrderCancelRequest(orderId, portfolioId, isModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioPendingOrderCancelRequest)) {
            return false;
        }
        PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest = (PortfolioPendingOrderCancelRequest) other;
        return Intrinsics.a(this.orderId, portfolioPendingOrderCancelRequest.orderId) && Intrinsics.a(this.portfolioId, portfolioPendingOrderCancelRequest.portfolioId) && this.isModel == portfolioPendingOrderCancelRequest.isModel;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isModel) + h.g(this.portfolioId, this.orderId.hashCode() * 31, 31);
    }

    public final boolean isModel() {
        return this.isModel;
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.portfolioId;
        return e.o(v.e.l("PortfolioPendingOrderCancelRequest(orderId=", str, ", portfolioId=", str2, ", isModel="), this.isModel, ")");
    }

    public /* synthetic */ PortfolioPendingOrderCancelRequest(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? true : z10);
    }
}
