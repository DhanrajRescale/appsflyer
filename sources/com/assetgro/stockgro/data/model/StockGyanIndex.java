package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockGyanIndex;", "Landroid/os/Parcelable;", "id", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "displayPicture", "Lcom/assetgro/stockgro/data/model/DisplayPicture;", "stockGyanCards", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockGyanCard;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/DisplayPicture;Ljava/util/List;)V", "getDisplayPicture", "()Lcom/assetgro/stockgro/data/model/DisplayPicture;", "getId", "()Ljava/lang/String;", "getName", "getStockGyanCards", "()Ljava/util/List;", "setStockGyanCards", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockGyanIndex implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StockGyanIndex> CREATOR = new Creator();

    @SerializedName("displayPicture")
    @NotNull
    private final DisplayPicture displayPicture;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("cards")
    @NotNull
    private List<StockGyanCard> stockGyanCards;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockGyanIndex> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanIndex createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            DisplayPicture createFromParcel = DisplayPicture.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(StockGyanCard.CREATOR, parcel, arrayList, i10, 1);
            }
            return new StockGyanIndex(readString, readString2, createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanIndex[] newArray(int i10) {
            return new StockGyanIndex[i10];
        }
    }

    public StockGyanIndex(@NotNull String id2, @NotNull String name, @NotNull DisplayPicture displayPicture, @NotNull List<StockGyanCard> stockGyanCards) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(stockGyanCards, "stockGyanCards");
        this.id = id2;
        this.name = name;
        this.displayPicture = displayPicture;
        this.stockGyanCards = stockGyanCards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StockGyanIndex copy$default(StockGyanIndex stockGyanIndex, String str, String str2, DisplayPicture displayPicture, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockGyanIndex.id;
        }
        if ((i10 & 2) != 0) {
            str2 = stockGyanIndex.name;
        }
        if ((i10 & 4) != 0) {
            displayPicture = stockGyanIndex.displayPicture;
        }
        if ((i10 & 8) != 0) {
            list = stockGyanIndex.stockGyanCards;
        }
        return stockGyanIndex.copy(str, str2, displayPicture, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DisplayPicture getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final List<StockGyanCard> component4() {
        return this.stockGyanCards;
    }

    @NotNull
    public final StockGyanIndex copy(@NotNull String id2, @NotNull String name, @NotNull DisplayPicture displayPicture, @NotNull List<StockGyanCard> stockGyanCards) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(stockGyanCards, "stockGyanCards");
        return new StockGyanIndex(id2, name, displayPicture, stockGyanCards);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockGyanIndex)) {
            return false;
        }
        StockGyanIndex stockGyanIndex = (StockGyanIndex) other;
        return Intrinsics.a(this.id, stockGyanIndex.id) && Intrinsics.a(this.name, stockGyanIndex.name) && Intrinsics.a(this.displayPicture, stockGyanIndex.displayPicture) && Intrinsics.a(this.stockGyanCards, stockGyanIndex.stockGyanCards);
    }

    @NotNull
    public final DisplayPicture getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<StockGyanCard> getStockGyanCards() {
        return this.stockGyanCards;
    }

    public int hashCode() {
        return this.stockGyanCards.hashCode() + ((this.displayPicture.hashCode() + h.g(this.name, this.id.hashCode() * 31, 31)) * 31);
    }

    public final void setStockGyanCards(@NotNull List<StockGyanCard> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.stockGyanCards = list;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        DisplayPicture displayPicture = this.displayPicture;
        List<StockGyanCard> list = this.stockGyanCards;
        StringBuilder l10 = e.l("StockGyanIndex(id=", str, ", name=", str2, ", displayPicture=");
        l10.append(displayPicture);
        l10.append(", stockGyanCards=");
        l10.append(list);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        this.displayPicture.writeToParcel(parcel, flags);
        Iterator p10 = a.p(this.stockGyanCards, parcel);
        while (p10.hasNext()) {
            ((StockGyanCard) p10.next()).writeToParcel(parcel, flags);
        }
    }
}
