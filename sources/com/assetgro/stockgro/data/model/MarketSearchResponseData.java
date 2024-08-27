package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/MarketSearchResponseData;", "Landroid/os/Parcelable;", "stocks", "Lcom/assetgro/stockgro/data/model/MarketSearchRecords;", "options", "(Lcom/assetgro/stockgro/data/model/MarketSearchRecords;Lcom/assetgro/stockgro/data/model/MarketSearchRecords;)V", "getOptions", "()Lcom/assetgro/stockgro/data/model/MarketSearchRecords;", "getStocks", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketSearchResponseData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MarketSearchResponseData> CREATOR = new Creator();

    @SerializedName("options")
    private final MarketSearchRecords options;

    @SerializedName("stocks")
    private final MarketSearchRecords stocks;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MarketSearchResponseData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchResponseData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketSearchResponseData(parcel.readInt() == 0 ? null : MarketSearchRecords.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketSearchRecords.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchResponseData[] newArray(int i10) {
            return new MarketSearchResponseData[i10];
        }
    }

    public MarketSearchResponseData(MarketSearchRecords marketSearchRecords, MarketSearchRecords marketSearchRecords2) {
        this.stocks = marketSearchRecords;
        this.options = marketSearchRecords2;
    }

    public static /* synthetic */ MarketSearchResponseData copy$default(MarketSearchResponseData marketSearchResponseData, MarketSearchRecords marketSearchRecords, MarketSearchRecords marketSearchRecords2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            marketSearchRecords = marketSearchResponseData.stocks;
        }
        if ((i10 & 2) != 0) {
            marketSearchRecords2 = marketSearchResponseData.options;
        }
        return marketSearchResponseData.copy(marketSearchRecords, marketSearchRecords2);
    }

    /* renamed from: component1, reason: from getter */
    public final MarketSearchRecords getStocks() {
        return this.stocks;
    }

    /* renamed from: component2, reason: from getter */
    public final MarketSearchRecords getOptions() {
        return this.options;
    }

    @NotNull
    public final MarketSearchResponseData copy(MarketSearchRecords stocks, MarketSearchRecords options) {
        return new MarketSearchResponseData(stocks, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketSearchResponseData)) {
            return false;
        }
        MarketSearchResponseData marketSearchResponseData = (MarketSearchResponseData) other;
        return Intrinsics.a(this.stocks, marketSearchResponseData.stocks) && Intrinsics.a(this.options, marketSearchResponseData.options);
    }

    public final MarketSearchRecords getOptions() {
        return this.options;
    }

    public final MarketSearchRecords getStocks() {
        return this.stocks;
    }

    public int hashCode() {
        MarketSearchRecords marketSearchRecords = this.stocks;
        int hashCode = (marketSearchRecords == null ? 0 : marketSearchRecords.hashCode()) * 31;
        MarketSearchRecords marketSearchRecords2 = this.options;
        return hashCode + (marketSearchRecords2 != null ? marketSearchRecords2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketSearchResponseData(stocks=" + this.stocks + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        MarketSearchRecords marketSearchRecords = this.stocks;
        if (marketSearchRecords == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSearchRecords.writeToParcel(parcel, flags);
        }
        MarketSearchRecords marketSearchRecords2 = this.options;
        if (marketSearchRecords2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSearchRecords2.writeToParcel(parcel, flags);
        }
    }
}
