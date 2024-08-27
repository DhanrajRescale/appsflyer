package com.assetgro.stockgro.ui.stock.v2.data.remote;

import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zi.r;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/data/remote/StockIntervalConfigDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lzi/r;", "toStockIntervalConfig", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "component3", "title", "id", "isDefault", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getId", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class StockIntervalConfigDto {
    public static final int $stable = 0;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("is_default")
    private final boolean isDefault;

    @SerializedName("title")
    @NotNull
    private final String title;

    public StockIntervalConfigDto(@NotNull String title, @NotNull String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.title = title;
        this.id = id2;
        this.isDefault = z10;
    }

    public static /* synthetic */ StockIntervalConfigDto copy$default(StockIntervalConfigDto stockIntervalConfigDto, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockIntervalConfigDto.title;
        }
        if ((i10 & 2) != 0) {
            str2 = stockIntervalConfigDto.id;
        }
        if ((i10 & 4) != 0) {
            z10 = stockIntervalConfigDto.isDefault;
        }
        return stockIntervalConfigDto.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    public final StockIntervalConfigDto copy(@NotNull String title, @NotNull String id2, boolean isDefault) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new StockIntervalConfigDto(title, id2, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockIntervalConfigDto)) {
            return false;
        }
        StockIntervalConfigDto stockIntervalConfigDto = (StockIntervalConfigDto) other;
        return Intrinsics.a(this.title, stockIntervalConfigDto.title) && Intrinsics.a(this.id, stockIntervalConfigDto.id) && this.isDefault == stockIntervalConfigDto.isDefault;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefault) + h.g(this.id, this.title.hashCode() * 31, 31);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @NotNull
    public final r toStockIntervalConfig() {
        return new r(this.title, this.id, this.isDefault);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.id;
        return e.o(v.e.l("StockIntervalConfigDto(title=", str, ", id=", str2, ", isDefault="), this.isDefault, ")");
    }
}
