package com.assetgro.stockgro.feature_market.data.remote;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/Change;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", HttpUrl.FRAGMENT_ENCODE_SET, "(DDLjava/lang/String;)V", "getPercentage", "()D", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Change {
    public static final int $stable = 0;

    @SerializedName("percentage")
    private final double percentage;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final double value;

    public Change(double d10, double d11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = d10;
        this.percentage = d11;
        this.type = type;
    }

    public static /* synthetic */ Change copy$default(Change change, double d10, double d11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = change.value;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            d11 = change.percentage;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            str = change.type;
        }
        return change.copy(d12, d13, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Change copy(double value, double percentage, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Change(value, percentage, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Change)) {
            return false;
        }
        Change change = (Change) other;
        return Double.compare(this.value, change.value) == 0 && Double.compare(this.percentage, change.percentage) == 0 && Intrinsics.a(this.type, change.type);
    }

    public final double getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.type.hashCode() + d.c(this.percentage, Double.hashCode(this.value) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Change(value=" + this.value + ", percentage=" + this.percentage + ", type=" + this.type + ")";
    }
}
