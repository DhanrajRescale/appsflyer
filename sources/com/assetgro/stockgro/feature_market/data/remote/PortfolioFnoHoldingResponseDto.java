package com.assetgro.stockgro.feature_market.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioFnoHoldingResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "fnoPortfolioHolding", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolioHolding;", "(Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolioHolding;)V", "getFnoPortfolioHolding", "()Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolioHolding;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioFnoHoldingResponseDto {
    public static final int $stable = 8;

    @SerializedName("portfolio")
    @NotNull
    private final FnoPortfolioHolding fnoPortfolioHolding;

    public PortfolioFnoHoldingResponseDto(@NotNull FnoPortfolioHolding fnoPortfolioHolding) {
        Intrinsics.checkNotNullParameter(fnoPortfolioHolding, "fnoPortfolioHolding");
        this.fnoPortfolioHolding = fnoPortfolioHolding;
    }

    public static /* synthetic */ PortfolioFnoHoldingResponseDto copy$default(PortfolioFnoHoldingResponseDto portfolioFnoHoldingResponseDto, FnoPortfolioHolding fnoPortfolioHolding, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fnoPortfolioHolding = portfolioFnoHoldingResponseDto.fnoPortfolioHolding;
        }
        return portfolioFnoHoldingResponseDto.copy(fnoPortfolioHolding);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FnoPortfolioHolding getFnoPortfolioHolding() {
        return this.fnoPortfolioHolding;
    }

    @NotNull
    public final PortfolioFnoHoldingResponseDto copy(@NotNull FnoPortfolioHolding fnoPortfolioHolding) {
        Intrinsics.checkNotNullParameter(fnoPortfolioHolding, "fnoPortfolioHolding");
        return new PortfolioFnoHoldingResponseDto(fnoPortfolioHolding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PortfolioFnoHoldingResponseDto) && Intrinsics.a(this.fnoPortfolioHolding, ((PortfolioFnoHoldingResponseDto) other).fnoPortfolioHolding);
    }

    @NotNull
    public final FnoPortfolioHolding getFnoPortfolioHolding() {
        return this.fnoPortfolioHolding;
    }

    public int hashCode() {
        return this.fnoPortfolioHolding.hashCode();
    }

    @NotNull
    public String toString() {
        return "PortfolioFnoHoldingResponseDto(fnoPortfolioHolding=" + this.fnoPortfolioHolding + ")";
    }
}
