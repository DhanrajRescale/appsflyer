package com.assetgro.stockgro.feature_market.data.remote;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", HttpUrl.FRAGMENT_ENCODE_SET, "isModel", HttpUrl.FRAGMENT_ENCODE_SET, "status", "assetClass", "cashBalance", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", "openPositions", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/PositionItem;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/util/Map;)V", "getAssetClass", "()Ljava/lang/String;", "getCashBalance", "()D", "()Z", "getOpenPositions", "()Ljava/util/Map;", "getPortfolioId", "getPortfolioName", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioInfo {
    public static final int $stable = 8;

    @SerializedName("asset_class")
    @NotNull
    private final String assetClass;

    @SerializedName("cash_balance")
    private final double cashBalance;

    @SerializedName("is_model")
    private final boolean isModel;

    @SerializedName("open_pos")
    private final Map<String, PositionItem> openPositions;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    @SerializedName("status")
    @NotNull
    private final String status;

    public PortfolioInfo(@NotNull String portfolioName, boolean z10, @NotNull String status, @NotNull String assetClass, double d10, @NotNull String portfolioId, Map<String, PositionItem> map) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.portfolioName = portfolioName;
        this.isModel = z10;
        this.status = status;
        this.assetClass = assetClass;
        this.cashBalance = d10;
        this.portfolioId = portfolioId;
        this.openPositions = map;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    /* renamed from: component5, reason: from getter */
    public final double getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final Map<String, PositionItem> component7() {
        return this.openPositions;
    }

    @NotNull
    public final PortfolioInfo copy(@NotNull String portfolioName, boolean isModel, @NotNull String status, @NotNull String assetClass, double cashBalance, @NotNull String portfolioId, Map<String, PositionItem> openPositions) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new PortfolioInfo(portfolioName, isModel, status, assetClass, cashBalance, portfolioId, openPositions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioInfo)) {
            return false;
        }
        PortfolioInfo portfolioInfo = (PortfolioInfo) other;
        return Intrinsics.a(this.portfolioName, portfolioInfo.portfolioName) && this.isModel == portfolioInfo.isModel && Intrinsics.a(this.status, portfolioInfo.status) && Intrinsics.a(this.assetClass, portfolioInfo.assetClass) && Double.compare(this.cashBalance, portfolioInfo.cashBalance) == 0 && Intrinsics.a(this.portfolioId, portfolioInfo.portfolioId) && Intrinsics.a(this.openPositions, portfolioInfo.openPositions);
    }

    @NotNull
    public final String getAssetClass() {
        return this.assetClass;
    }

    public final double getCashBalance() {
        return this.cashBalance;
    }

    public final Map<String, PositionItem> getOpenPositions() {
        return this.openPositions;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.portfolioId, d.c(this.cashBalance, h.g(this.assetClass, h.g(this.status, e.d(this.isModel, this.portfolioName.hashCode() * 31, 31), 31), 31), 31), 31);
        Map<String, PositionItem> map = this.openPositions;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return g10 + hashCode;
    }

    public final boolean isModel() {
        return this.isModel;
    }

    @NotNull
    public String toString() {
        String str = this.portfolioName;
        boolean z10 = this.isModel;
        String str2 = this.status;
        String str3 = this.assetClass;
        double d10 = this.cashBalance;
        String str4 = this.portfolioId;
        Map<String, PositionItem> map = this.openPositions;
        StringBuilder sb2 = new StringBuilder("PortfolioInfo(portfolioName=");
        sb2.append(str);
        sb2.append(", isModel=");
        sb2.append(z10);
        sb2.append(", status=");
        e.v(sb2, str2, ", assetClass=", str3, ", cashBalance=");
        sb2.append(d10);
        sb2.append(", portfolioId=");
        sb2.append(str4);
        sb2.append(", openPositions=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
