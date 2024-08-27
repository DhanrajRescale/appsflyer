package com.assetgro.stockgro.data.model.arenaV2;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;", HttpUrl.FRAGMENT_ENCODE_SET, "arenaSections", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaSection;", "(Ljava/util/List;)V", "getArenaSections", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ArenaAllData {
    public static final int $stable = 8;

    @SerializedName("sections")
    @NotNull
    private final List<ArenaSection> arenaSections;

    public ArenaAllData(@NotNull List<ArenaSection> arenaSections) {
        Intrinsics.checkNotNullParameter(arenaSections, "arenaSections");
        this.arenaSections = arenaSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArenaAllData copy$default(ArenaAllData arenaAllData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = arenaAllData.arenaSections;
        }
        return arenaAllData.copy(list);
    }

    @NotNull
    public final List<ArenaSection> component1() {
        return this.arenaSections;
    }

    @NotNull
    public final ArenaAllData copy(@NotNull List<ArenaSection> arenaSections) {
        Intrinsics.checkNotNullParameter(arenaSections, "arenaSections");
        return new ArenaAllData(arenaSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArenaAllData) && Intrinsics.a(this.arenaSections, ((ArenaAllData) other).arenaSections);
    }

    @NotNull
    public final List<ArenaSection> getArenaSections() {
        return this.arenaSections;
    }

    public int hashCode() {
        return this.arenaSections.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("ArenaAllData(arenaSections=", this.arenaSections, ")");
    }
}
