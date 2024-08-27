package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/model/FTWeekTopStocksDto;", "Landroid/os/Parcelable;", "high", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "low", "(Ljava/util/List;Ljava/util/List;)V", "getHigh", "()Ljava/util/List;", "getLow", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FTWeekTopStocksDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FTWeekTopStocksDto> CREATOR = new Creator();

    @SerializedName("high")
    private final List<StockDto> high;

    @SerializedName("low")
    private final List<StockDto> low;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FTWeekTopStocksDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FTWeekTopStocksDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = h.e(StockDto.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i10 != readInt2) {
                    i10 = h.e(StockDto.CREATOR, parcel, arrayList2, i10, 1);
                }
            }
            return new FTWeekTopStocksDto(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FTWeekTopStocksDto[] newArray(int i10) {
            return new FTWeekTopStocksDto[i10];
        }
    }

    public FTWeekTopStocksDto(List<StockDto> list, List<StockDto> list2) {
        this.high = list;
        this.low = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTWeekTopStocksDto copy$default(FTWeekTopStocksDto fTWeekTopStocksDto, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = fTWeekTopStocksDto.high;
        }
        if ((i10 & 2) != 0) {
            list2 = fTWeekTopStocksDto.low;
        }
        return fTWeekTopStocksDto.copy(list, list2);
    }

    public final List<StockDto> component1() {
        return this.high;
    }

    public final List<StockDto> component2() {
        return this.low;
    }

    @NotNull
    public final FTWeekTopStocksDto copy(List<StockDto> high, List<StockDto> low) {
        return new FTWeekTopStocksDto(high, low);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FTWeekTopStocksDto)) {
            return false;
        }
        FTWeekTopStocksDto fTWeekTopStocksDto = (FTWeekTopStocksDto) other;
        return Intrinsics.a(this.high, fTWeekTopStocksDto.high) && Intrinsics.a(this.low, fTWeekTopStocksDto.low);
    }

    public final List<StockDto> getHigh() {
        return this.high;
    }

    public final List<StockDto> getLow() {
        return this.low;
    }

    public int hashCode() {
        List<StockDto> list = this.high;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StockDto> list2 = this.low;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FTWeekTopStocksDto(high=" + this.high + ", low=" + this.low + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<StockDto> list = this.high;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((StockDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<StockDto> list2 = this.low;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o11 = a.o(parcel, 1, list2);
        while (o11.hasNext()) {
            ((StockDto) o11.next()).writeToParcel(parcel, flags);
        }
    }
}
