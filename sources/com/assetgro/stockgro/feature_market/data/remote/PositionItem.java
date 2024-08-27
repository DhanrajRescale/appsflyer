package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/PositionItem;", "Landroid/os/Parcelable;", "type", HttpUrl.FRAGMENT_ENCODE_SET, "lots", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getLots", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PositionItem implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PositionItem> CREATOR = new Creator();

    @SerializedName("lots")
    private final int lots;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PositionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PositionItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PositionItem(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PositionItem[] newArray(int i10) {
            return new PositionItem[i10];
        }
    }

    public PositionItem(@NotNull String type, int i10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.lots = i10;
    }

    public static /* synthetic */ PositionItem copy$default(PositionItem positionItem, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = positionItem.type;
        }
        if ((i11 & 2) != 0) {
            i10 = positionItem.lots;
        }
        return positionItem.copy(str, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLots() {
        return this.lots;
    }

    @NotNull
    public final PositionItem copy(@NotNull String type, int lots) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new PositionItem(type, lots);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionItem)) {
            return false;
        }
        PositionItem positionItem = (PositionItem) other;
        return Intrinsics.a(this.type, positionItem.type) && this.lots == positionItem.lots;
    }

    public final int getLots() {
        return this.lots;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.lots) + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PositionItem(type=" + this.type + ", lots=" + this.lots + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeInt(this.lots);
    }
}
