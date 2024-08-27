package com.assetgro.stockgro.data.model.portfolio.holdings;

import com.assetgro.stockgro.data.model.ChangeDto;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/PeriodicReturn;", HttpUrl.FRAGMENT_ENCODE_SET, "periodicity", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;)V", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getPeriodicity", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PeriodicReturn {
    public static final int $stable = 0;

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("periodicity")
    @NotNull
    private final String periodicity;

    public PeriodicReturn(@NotNull String periodicity, @NotNull ChangeDto change) {
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        Intrinsics.checkNotNullParameter(change, "change");
        this.periodicity = periodicity;
        this.change = change;
    }

    public static /* synthetic */ PeriodicReturn copy$default(PeriodicReturn periodicReturn, String str, ChangeDto changeDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = periodicReturn.periodicity;
        }
        if ((i10 & 2) != 0) {
            changeDto = periodicReturn.change;
        }
        return periodicReturn.copy(str, changeDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPeriodicity() {
        return this.periodicity;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final PeriodicReturn copy(@NotNull String periodicity, @NotNull ChangeDto change) {
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        Intrinsics.checkNotNullParameter(change, "change");
        return new PeriodicReturn(periodicity, change);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodicReturn)) {
            return false;
        }
        PeriodicReturn periodicReturn = (PeriodicReturn) other;
        return Intrinsics.a(this.periodicity, periodicReturn.periodicity) && Intrinsics.a(this.change, periodicReturn.change);
    }

    @NotNull
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getPeriodicity() {
        return this.periodicity;
    }

    public int hashCode() {
        return this.change.hashCode() + (this.periodicity.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PeriodicReturn(periodicity=" + this.periodicity + ", change=" + this.change + ")";
    }
}
