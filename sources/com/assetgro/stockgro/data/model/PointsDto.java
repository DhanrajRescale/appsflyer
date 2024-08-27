package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/PointsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "social", HttpUrl.FRAGMENT_ENCODE_SET, "trade", "(JJ)V", "getSocial", "()J", "getTrade", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointsDto {
    public static final int $stable = 0;

    @SerializedName("social")
    private final long social;

    @SerializedName("trade")
    private final long trade;

    public PointsDto(long j10, long j11) {
        this.social = j10;
        this.trade = j11;
    }

    public static /* synthetic */ PointsDto copy$default(PointsDto pointsDto, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pointsDto.social;
        }
        if ((i10 & 2) != 0) {
            j11 = pointsDto.trade;
        }
        return pointsDto.copy(j10, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSocial() {
        return this.social;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTrade() {
        return this.trade;
    }

    @NotNull
    public final PointsDto copy(long social, long trade) {
        return new PointsDto(social, trade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsDto)) {
            return false;
        }
        PointsDto pointsDto = (PointsDto) other;
        return this.social == pointsDto.social && this.trade == pointsDto.trade;
    }

    public final long getSocial() {
        return this.social;
    }

    public final long getTrade() {
        return this.trade;
    }

    public int hashCode() {
        return Long.hashCode(this.trade) + (Long.hashCode(this.social) * 31);
    }

    @NotNull
    public String toString() {
        long j10 = this.social;
        long j11 = this.trade;
        StringBuilder sb2 = new StringBuilder("PointsDto(social=");
        sb2.append(j10);
        sb2.append(", trade=");
        return a.j(sb2, j11, ")");
    }
}
