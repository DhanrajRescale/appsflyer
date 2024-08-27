package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockGyanCard;", "Landroid/os/Parcelable;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "displayPicture", "Lcom/assetgro/stockgro/data/model/DisplayPicture;", "totalLikes", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/DisplayPicture;Ljava/lang/Integer;)V", "getDisplayPicture", "()Lcom/assetgro/stockgro/data/model/DisplayPicture;", "getId", "()Ljava/lang/String;", "getTotalLikes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/DisplayPicture;Ljava/lang/Integer;)Lcom/assetgro/stockgro/data/model/StockGyanCard;", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockGyanCard implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<StockGyanCard> CREATOR = new Creator();

    @SerializedName("displayPicture")
    @NotNull
    private final DisplayPicture displayPicture;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("total_likes")
    private final Integer totalLikes;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockGyanCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanCard createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockGyanCard(parcel.readString(), DisplayPicture.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockGyanCard[] newArray(int i10) {
            return new StockGyanCard[i10];
        }
    }

    public StockGyanCard(@NotNull String id2, @NotNull DisplayPicture displayPicture, Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        this.id = id2;
        this.displayPicture = displayPicture;
        this.totalLikes = num;
    }

    public static /* synthetic */ StockGyanCard copy$default(StockGyanCard stockGyanCard, String str, DisplayPicture displayPicture, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockGyanCard.id;
        }
        if ((i10 & 2) != 0) {
            displayPicture = stockGyanCard.displayPicture;
        }
        if ((i10 & 4) != 0) {
            num = stockGyanCard.totalLikes;
        }
        return stockGyanCard.copy(str, displayPicture, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DisplayPicture getDisplayPicture() {
        return this.displayPicture;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotalLikes() {
        return this.totalLikes;
    }

    @NotNull
    public final StockGyanCard copy(@NotNull String id2, @NotNull DisplayPicture displayPicture, Integer totalLikes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        return new StockGyanCard(id2, displayPicture, totalLikes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockGyanCard)) {
            return false;
        }
        StockGyanCard stockGyanCard = (StockGyanCard) other;
        return Intrinsics.a(this.id, stockGyanCard.id) && Intrinsics.a(this.displayPicture, stockGyanCard.displayPicture) && Intrinsics.a(this.totalLikes, stockGyanCard.totalLikes);
    }

    @NotNull
    public final DisplayPicture getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Integer getTotalLikes() {
        return this.totalLikes;
    }

    public int hashCode() {
        int hashCode = (this.displayPicture.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.totalLikes;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "StockGyanCard(id=" + this.id + ", displayPicture=" + this.displayPicture + ", totalLikes=" + this.totalLikes + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        this.displayPicture.writeToParcel(parcel, flags);
        Integer num = this.totalLikes;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
