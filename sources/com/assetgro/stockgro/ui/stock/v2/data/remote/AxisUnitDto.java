package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zi.a;
import zi.i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/AxisUnitDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/a;", "toAxisUnit", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "component3", "()Ljava/lang/Boolean;", "title", "narrationDto", "isUnplottable", "copy", "(Ljava/lang/String;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/ui/stock/v2/data/remote/AxisUnitDto;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "getNarrationDto", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;Ljava/lang/Boolean;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AxisUnitDto {
    public static final int $stable = 0;

    @SerializedName("is_unplottable")
    private final Boolean isUnplottable;

    @SerializedName("narration")
    private final NarrationDto narrationDto;

    @SerializedName("title")
    @NotNull
    private final String title;

    public AxisUnitDto(@NotNull String title, NarrationDto narrationDto, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.narrationDto = narrationDto;
        this.isUnplottable = bool;
    }

    public static /* synthetic */ AxisUnitDto copy$default(AxisUnitDto axisUnitDto, String str, NarrationDto narrationDto, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = axisUnitDto.title;
        }
        if ((i10 & 2) != 0) {
            narrationDto = axisUnitDto.narrationDto;
        }
        if ((i10 & 4) != 0) {
            bool = axisUnitDto.isUnplottable;
        }
        return axisUnitDto.copy(str, narrationDto, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final NarrationDto getNarrationDto() {
        return this.narrationDto;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsUnplottable() {
        return this.isUnplottable;
    }

    @NotNull
    public final AxisUnitDto copy(@NotNull String title, NarrationDto narrationDto, Boolean isUnplottable) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new AxisUnitDto(title, narrationDto, isUnplottable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AxisUnitDto)) {
            return false;
        }
        AxisUnitDto axisUnitDto = (AxisUnitDto) other;
        return Intrinsics.a(this.title, axisUnitDto.title) && Intrinsics.a(this.narrationDto, axisUnitDto.narrationDto) && Intrinsics.a(this.isUnplottable, axisUnitDto.isUnplottable);
    }

    public final NarrationDto getNarrationDto() {
        return this.narrationDto;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        NarrationDto narrationDto = this.narrationDto;
        int hashCode2 = (hashCode + (narrationDto == null ? 0 : narrationDto.hashCode())) * 31;
        Boolean bool = this.isUnplottable;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isUnplottable() {
        return this.isUnplottable;
    }

    @NotNull
    public final a toAxisUnit() {
        i iVar;
        String str = this.title;
        NarrationDto narrationDto = this.narrationDto;
        if (narrationDto != null) {
            iVar = narrationDto.toNarration();
        } else {
            iVar = null;
        }
        return new a(str, iVar, this.isUnplottable);
    }

    @NotNull
    public String toString() {
        return "AxisUnitDto(title=" + this.title + ", narrationDto=" + this.narrationDto + ", isUnplottable=" + this.isUnplottable + ")";
    }
}
