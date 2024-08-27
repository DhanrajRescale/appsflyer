package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J)\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R>\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/data/model/StockGyanDto;", "Landroid/os/Parcelable;", "stockGyanGroups", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockGyanGroup;", "indices", "Lcom/assetgro/stockgro/data/model/StockGyanIndex;", "cardInteraction", "Ljava/util/HashMap;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/CardInteraction;", "Lkotlin/collections/HashMap;", "(Ljava/util/List;Ljava/util/List;Ljava/util/HashMap;)V", "getCardInteraction", "()Ljava/util/HashMap;", "setCardInteraction", "(Ljava/util/HashMap;)V", "getIndices", "()Ljava/util/List;", "setIndices", "(Ljava/util/List;)V", "getStockGyanGroups", "setStockGyanGroups", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockGyanDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StockGyanDto> CREATOR = new Creator();

    @SerializedName("subject_card_to_interaction")
    private HashMap<String, CardInteraction> cardInteraction;

    @SerializedName("indices")
    private List<StockGyanIndex> indices;

    @SerializedName("groups")
    private List<StockGyanGroup> stockGyanGroups;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockGyanDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HashMap hashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(StockGyanGroup.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = h.e(StockGyanIndex.CREATOR, parcel, arrayList2, i11, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                hashMap = new HashMap(readInt3);
                for (int i12 = 0; i12 != readInt3; i12++) {
                    hashMap.put(parcel.readString(), CardInteraction.CREATOR.createFromParcel(parcel));
                }
            }
            return new StockGyanDto(arrayList, arrayList2, hashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanDto[] newArray(int i10) {
            return new StockGyanDto[i10];
        }
    }

    public StockGyanDto(List<StockGyanGroup> list, List<StockGyanIndex> list2, HashMap<String, CardInteraction> hashMap) {
        this.stockGyanGroups = list;
        this.indices = list2;
        this.cardInteraction = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StockGyanDto copy$default(StockGyanDto stockGyanDto, List list, List list2, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = stockGyanDto.stockGyanGroups;
        }
        if ((i10 & 2) != 0) {
            list2 = stockGyanDto.indices;
        }
        if ((i10 & 4) != 0) {
            hashMap = stockGyanDto.cardInteraction;
        }
        return stockGyanDto.copy(list, list2, hashMap);
    }

    public final List<StockGyanGroup> component1() {
        return this.stockGyanGroups;
    }

    public final List<StockGyanIndex> component2() {
        return this.indices;
    }

    public final HashMap<String, CardInteraction> component3() {
        return this.cardInteraction;
    }

    @NotNull
    public final StockGyanDto copy(List<StockGyanGroup> stockGyanGroups, List<StockGyanIndex> indices, HashMap<String, CardInteraction> cardInteraction) {
        return new StockGyanDto(stockGyanGroups, indices, cardInteraction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockGyanDto)) {
            return false;
        }
        StockGyanDto stockGyanDto = (StockGyanDto) other;
        return Intrinsics.a(this.stockGyanGroups, stockGyanDto.stockGyanGroups) && Intrinsics.a(this.indices, stockGyanDto.indices) && Intrinsics.a(this.cardInteraction, stockGyanDto.cardInteraction);
    }

    public final HashMap<String, CardInteraction> getCardInteraction() {
        return this.cardInteraction;
    }

    public final List<StockGyanIndex> getIndices() {
        return this.indices;
    }

    public final List<StockGyanGroup> getStockGyanGroups() {
        return this.stockGyanGroups;
    }

    public int hashCode() {
        List<StockGyanGroup> list = this.stockGyanGroups;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StockGyanIndex> list2 = this.indices;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        HashMap<String, CardInteraction> hashMap = this.cardInteraction;
        return hashCode2 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final void setCardInteraction(HashMap<String, CardInteraction> hashMap) {
        this.cardInteraction = hashMap;
    }

    public final void setIndices(List<StockGyanIndex> list) {
        this.indices = list;
    }

    public final void setStockGyanGroups(List<StockGyanGroup> list) {
        this.stockGyanGroups = list;
    }

    @NotNull
    public String toString() {
        return "StockGyanDto(stockGyanGroups=" + this.stockGyanGroups + ", indices=" + this.indices + ", cardInteraction=" + this.cardInteraction + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<StockGyanGroup> list = this.stockGyanGroups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((StockGyanGroup) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<StockGyanIndex> list2 = this.indices;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((StockGyanIndex) o11.next()).writeToParcel(parcel, flags);
            }
        }
        HashMap<String, CardInteraction> hashMap = this.cardInteraction;
        if (hashMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(hashMap.size());
        for (Map.Entry<String, CardInteraction> entry : hashMap.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }
}
