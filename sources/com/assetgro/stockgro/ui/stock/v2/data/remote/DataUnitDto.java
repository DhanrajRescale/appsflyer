package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zi.b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u001dR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/DataUnitDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/b;", "toDataUnit", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "component3", "()Ljava/lang/Boolean;", "component4", AppMeasurementSdk.ConditionalUserProperty.VALUE, "suffix", "trophy", "prefix", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/assetgro/stockgro/ui/stock/v2/data/remote/DataUnitDto;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getSuffix", "Ljava/lang/Boolean;", "getTrophy", "setTrophy", "(Ljava/lang/Boolean;)V", "getPrefix", "setPrefix", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class DataUnitDto {
    public static final int $stable = 8;

    @SerializedName("prefix")
    private String prefix;

    @SerializedName("suffix")
    private final String suffix;

    @SerializedName("has_trophy")
    private Boolean trophy;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    private final String value;

    public DataUnitDto(@NotNull String value, String str, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.suffix = str;
        this.trophy = bool;
        this.prefix = str2;
    }

    public static /* synthetic */ DataUnitDto copy$default(DataUnitDto dataUnitDto, String str, String str2, Boolean bool, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataUnitDto.value;
        }
        if ((i10 & 2) != 0) {
            str2 = dataUnitDto.suffix;
        }
        if ((i10 & 4) != 0) {
            bool = dataUnitDto.trophy;
        }
        if ((i10 & 8) != 0) {
            str3 = dataUnitDto.prefix;
        }
        return dataUnitDto.copy(str, str2, bool, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getTrophy() {
        return this.trophy;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final DataUnitDto copy(@NotNull String value, String suffix, Boolean trophy, String prefix) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new DataUnitDto(value, suffix, trophy, prefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUnitDto)) {
            return false;
        }
        DataUnitDto dataUnitDto = (DataUnitDto) other;
        return Intrinsics.a(this.value, dataUnitDto.value) && Intrinsics.a(this.suffix, dataUnitDto.suffix) && Intrinsics.a(this.trophy, dataUnitDto.trophy) && Intrinsics.a(this.prefix, dataUnitDto.prefix);
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Boolean getTrophy() {
        return this.trophy;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.suffix;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.trophy;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.prefix;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPrefix(String str) {
        this.prefix = str;
    }

    public final void setTrophy(Boolean bool) {
        this.trophy = bool;
    }

    @NotNull
    public final b toDataUnit() {
        return new b(this.value, this.suffix, this.trophy, this.prefix);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.suffix;
        Boolean bool = this.trophy;
        String str3 = this.prefix;
        StringBuilder l10 = e.l("DataUnitDto(value=", str, ", suffix=", str2, ", trophy=");
        l10.append(bool);
        l10.append(", prefix=");
        l10.append(str3);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ DataUnitDto(String str, String str2, Boolean bool, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3);
    }
}
