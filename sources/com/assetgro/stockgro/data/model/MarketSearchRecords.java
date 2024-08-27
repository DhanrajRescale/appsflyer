package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/MarketSearchRecords;", "Landroid/os/Parcelable;", "records", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "total", HttpUrl.FRAGMENT_ENCODE_SET, "morePresent", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;IZ)V", "getMorePresent", "()Z", "getRecords", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketSearchRecords implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MarketSearchRecords> CREATOR = new Creator();

    @SerializedName("more_present")
    private final boolean morePresent;

    @SerializedName("records")
    private final List<FnoOptionDto> records;

    @SerializedName("total")
    private final int total;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MarketSearchRecords> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchRecords createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(FnoOptionDto.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketSearchRecords(arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchRecords[] newArray(int i10) {
            return new MarketSearchRecords[i10];
        }
    }

    public MarketSearchRecords(List<FnoOptionDto> list, int i10, boolean z10) {
        this.records = list;
        this.total = i10;
        this.morePresent = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketSearchRecords copy$default(MarketSearchRecords marketSearchRecords, List list, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketSearchRecords.records;
        }
        if ((i11 & 2) != 0) {
            i10 = marketSearchRecords.total;
        }
        if ((i11 & 4) != 0) {
            z10 = marketSearchRecords.morePresent;
        }
        return marketSearchRecords.copy(list, i10, z10);
    }

    public final List<FnoOptionDto> component1() {
        return this.records;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMorePresent() {
        return this.morePresent;
    }

    @NotNull
    public final MarketSearchRecords copy(List<FnoOptionDto> records, int total, boolean morePresent) {
        return new MarketSearchRecords(records, total, morePresent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketSearchRecords)) {
            return false;
        }
        MarketSearchRecords marketSearchRecords = (MarketSearchRecords) other;
        return Intrinsics.a(this.records, marketSearchRecords.records) && this.total == marketSearchRecords.total && this.morePresent == marketSearchRecords.morePresent;
    }

    public final boolean getMorePresent() {
        return this.morePresent;
    }

    public final List<FnoOptionDto> getRecords() {
        return this.records;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode;
        List<FnoOptionDto> list = this.records;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Boolean.hashCode(this.morePresent) + e.f(this.total, hashCode * 31, 31);
    }

    @NotNull
    public String toString() {
        List<FnoOptionDto> list = this.records;
        int i10 = this.total;
        boolean z10 = this.morePresent;
        StringBuilder sb2 = new StringBuilder("MarketSearchRecords(records=");
        sb2.append(list);
        sb2.append(", total=");
        sb2.append(i10);
        sb2.append(", morePresent=");
        return e.o(sb2, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<FnoOptionDto> list = this.records;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((FnoOptionDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.total);
        parcel.writeInt(this.morePresent ? 1 : 0);
    }
}
