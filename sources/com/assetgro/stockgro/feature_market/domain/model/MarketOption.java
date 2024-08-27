package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/MarketOption;", "Landroid/os/Parcelable;", "indices", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "stocks", "stocksCount", HttpUrl.FRAGMENT_ENCODE_SET, "eor", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/util/List;IZ)V", "getEor", "()Z", "getIndices", "()Ljava/util/List;", "getStocks", "getStocksCount", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketOption implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MarketOption> CREATOR = new Creator();
    private final boolean eor;

    @NotNull
    private final List<FnoOption> indices;

    @NotNull
    private final List<FnoOption> stocks;
    private final int stocksCount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MarketOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(FnoOption.CREATOR, parcel, arrayList, i10, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i11 = 0;
            while (i11 != readInt2) {
                i11 = h.e(FnoOption.CREATOR, parcel, arrayList2, i11, 1);
            }
            return new MarketOption(arrayList, arrayList2, parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketOption[] newArray(int i10) {
            return new MarketOption[i10];
        }
    }

    public MarketOption(@NotNull List<FnoOption> indices, @NotNull List<FnoOption> stocks, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        this.indices = indices;
        this.stocks = stocks;
        this.stocksCount = i10;
        this.eor = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketOption copy$default(MarketOption marketOption, List list, List list2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketOption.indices;
        }
        if ((i11 & 2) != 0) {
            list2 = marketOption.stocks;
        }
        if ((i11 & 4) != 0) {
            i10 = marketOption.stocksCount;
        }
        if ((i11 & 8) != 0) {
            z10 = marketOption.eor;
        }
        return marketOption.copy(list, list2, i10, z10);
    }

    @NotNull
    public final List<FnoOption> component1() {
        return this.indices;
    }

    @NotNull
    public final List<FnoOption> component2() {
        return this.stocks;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStocksCount() {
        return this.stocksCount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEor() {
        return this.eor;
    }

    @NotNull
    public final MarketOption copy(@NotNull List<FnoOption> indices, @NotNull List<FnoOption> stocks, int stocksCount, boolean eor) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        return new MarketOption(indices, stocks, stocksCount, eor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketOption)) {
            return false;
        }
        MarketOption marketOption = (MarketOption) other;
        return Intrinsics.a(this.indices, marketOption.indices) && Intrinsics.a(this.stocks, marketOption.stocks) && this.stocksCount == marketOption.stocksCount && this.eor == marketOption.eor;
    }

    public final boolean getEor() {
        return this.eor;
    }

    @NotNull
    public final List<FnoOption> getIndices() {
        return this.indices;
    }

    @NotNull
    public final List<FnoOption> getStocks() {
        return this.stocks;
    }

    public final int getStocksCount() {
        return this.stocksCount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.eor) + e.f(this.stocksCount, d.e(this.stocks, this.indices.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "MarketOption(indices=" + this.indices + ", stocks=" + this.stocks + ", stocksCount=" + this.stocksCount + ", eor=" + this.eor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.indices, parcel);
        while (p10.hasNext()) {
            ((FnoOption) p10.next()).writeToParcel(parcel, flags);
        }
        Iterator p11 = a.p(this.stocks, parcel);
        while (p11.hasNext()) {
            ((FnoOption) p11.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.stocksCount);
        parcel.writeInt(this.eor ? 1 : 0);
    }
}
