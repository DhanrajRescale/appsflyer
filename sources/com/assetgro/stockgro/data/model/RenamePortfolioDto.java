package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/RenamePortfolioDto;", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPortfolioId", "()Ljava/lang/String;", "getPortfolioName", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RenamePortfolioDto {
    public static final int $stable = 0;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    public RenamePortfolioDto(@NotNull String portfolioId, @NotNull String portfolioName) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
    }

    public static /* synthetic */ RenamePortfolioDto copy$default(RenamePortfolioDto renamePortfolioDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = renamePortfolioDto.portfolioId;
        }
        if ((i10 & 2) != 0) {
            str2 = renamePortfolioDto.portfolioName;
        }
        return renamePortfolioDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final RenamePortfolioDto copy(@NotNull String portfolioId, @NotNull String portfolioName) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        return new RenamePortfolioDto(portfolioId, portfolioName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenamePortfolioDto)) {
            return false;
        }
        RenamePortfolioDto renamePortfolioDto = (RenamePortfolioDto) other;
        return Intrinsics.a(this.portfolioId, renamePortfolioDto.portfolioId) && Intrinsics.a(this.portfolioName, renamePortfolioDto.portfolioName);
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    public int hashCode() {
        return this.portfolioName.hashCode() + (this.portfolioId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("RenamePortfolioDto(portfolioId=", this.portfolioId, ", portfolioName=", this.portfolioName, ")");
    }
}
