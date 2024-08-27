package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/Limit;", HttpUrl.FRAGMENT_ENCODE_SET, "min", HttpUrl.FRAGMENT_ENCODE_SET, "max", "(DD)V", "getMax", "()D", "getMin", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Limit {
    public static final int $stable = 0;

    @SerializedName("max")
    private final double max;

    @SerializedName("min")
    private final double min;

    public Limit(double d10, double d11) {
        this.min = d10;
        this.max = d11;
    }

    public static /* synthetic */ Limit copy$default(Limit limit, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = limit.min;
        }
        if ((i10 & 2) != 0) {
            d11 = limit.max;
        }
        return limit.copy(d10, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    @NotNull
    public final Limit copy(double min, double max) {
        return new Limit(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Limit)) {
            return false;
        }
        Limit limit = (Limit) other;
        return Double.compare(this.min, limit.min) == 0 && Double.compare(this.max, limit.max) == 0;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public int hashCode() {
        return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
    }

    @NotNull
    public String toString() {
        return "Limit(min=" + this.min + ", max=" + this.max + ")";
    }
}
