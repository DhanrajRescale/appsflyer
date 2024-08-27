package com.assetgro.stockgro.ui.portfolio.v2.domain.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/v2/domain/model/TotalReturn;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/String;", "getType", "getValue", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TotalReturn {
    public static final int $stable = 0;

    @NotNull
    private final String percentage;
    private final String type;

    @NotNull
    private final String value;

    public TotalReturn(@NotNull String value, @NotNull String percentage, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.value = value;
        this.percentage = percentage;
        this.type = str;
    }

    public static /* synthetic */ TotalReturn copy$default(TotalReturn totalReturn, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = totalReturn.value;
        }
        if ((i10 & 2) != 0) {
            str2 = totalReturn.percentage;
        }
        if ((i10 & 4) != 0) {
            str3 = totalReturn.type;
        }
        return totalReturn.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TotalReturn copy(@NotNull String value, @NotNull String percentage, String type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        return new TotalReturn(value, percentage, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalReturn)) {
            return false;
        }
        TotalReturn totalReturn = (TotalReturn) other;
        return Intrinsics.a(this.value, totalReturn.value) && Intrinsics.a(this.percentage, totalReturn.percentage) && Intrinsics.a(this.type, totalReturn.type);
    }

    @NotNull
    public final String getPercentage() {
        return this.percentage;
    }

    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.percentage, this.value.hashCode() * 31, 31);
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.percentage;
        return d.o(e.l("TotalReturn(value=", str, ", percentage=", str2, ", type="), this.type, ")");
    }
}
