package com.assetgro.stockgro.data.remote.response;

import com.assetgro.stockgro.data.model.ChangeDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/IndexDto;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "ltp", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;)V", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getLtp", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IndexDto {
    public static final int $stable = 0;

    @SerializedName("change")
    private final ChangeDto change;

    @SerializedName("last_trade_price")
    @NotNull
    private final String ltp;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    public IndexDto(@NotNull String name, @NotNull String ltp, ChangeDto changeDto) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ltp, "ltp");
        this.name = name;
        this.ltp = ltp;
        this.change = changeDto;
    }

    public static /* synthetic */ IndexDto copy$default(IndexDto indexDto, String str, String str2, ChangeDto changeDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = indexDto.name;
        }
        if ((i10 & 2) != 0) {
            str2 = indexDto.ltp;
        }
        if ((i10 & 4) != 0) {
            changeDto = indexDto.change;
        }
        return indexDto.copy(str, str2, changeDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLtp() {
        return this.ltp;
    }

    /* renamed from: component3, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final IndexDto copy(@NotNull String name, @NotNull String ltp, ChangeDto change) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ltp, "ltp");
        return new IndexDto(name, ltp, change);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDto)) {
            return false;
        }
        IndexDto indexDto = (IndexDto) other;
        return Intrinsics.a(this.name, indexDto.name) && Intrinsics.a(this.ltp, indexDto.ltp) && Intrinsics.a(this.change, indexDto.change);
    }

    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getLtp() {
        return this.ltp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.ltp, this.name.hashCode() * 31, 31);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.ltp;
        ChangeDto changeDto = this.change;
        StringBuilder l10 = e.l("IndexDto(name=", str, ", ltp=", str2, ", change=");
        l10.append(changeDto);
        l10.append(")");
        return l10.toString();
    }
}
