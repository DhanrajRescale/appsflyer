package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/Inventory;", "Landroid/os/Parcelable;", "type", HttpUrl.FRAGMENT_ENCODE_SET, "total", "available", HttpUrl.FRAGMENT_ENCODE_SET, "perUserLimit", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getAvailable", "()J", "getPerUserLimit", "getTotal", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Inventory implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Inventory> CREATOR = new Creator();

    @SerializedName("available")
    private final long available;

    @SerializedName("per_user_limit")
    private final long perUserLimit;

    @SerializedName("total")
    @NotNull
    private final String total;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Inventory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Inventory createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Inventory(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Inventory[] newArray(int i10) {
            return new Inventory[i10];
        }
    }

    public Inventory(@NotNull String type, @NotNull String total, long j10, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(total, "total");
        this.type = type;
        this.total = total;
        this.available = j10;
        this.perUserLimit = j11;
    }

    public static /* synthetic */ Inventory copy$default(Inventory inventory, String str, String str2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inventory.type;
        }
        if ((i10 & 2) != 0) {
            str2 = inventory.total;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = inventory.available;
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = inventory.perUserLimit;
        }
        return inventory.copy(str, str3, j12, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAvailable() {
        return this.available;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPerUserLimit() {
        return this.perUserLimit;
    }

    @NotNull
    public final Inventory copy(@NotNull String type, @NotNull String total, long available, long perUserLimit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(total, "total");
        return new Inventory(type, total, available, perUserLimit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Inventory)) {
            return false;
        }
        Inventory inventory = (Inventory) other;
        return Intrinsics.a(this.type, inventory.type) && Intrinsics.a(this.total, inventory.total) && this.available == inventory.available && this.perUserLimit == inventory.perUserLimit;
    }

    public final long getAvailable() {
        return this.available;
    }

    public final long getPerUserLimit() {
        return this.perUserLimit;
    }

    @NotNull
    public final String getTotal() {
        return this.total;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.perUserLimit) + e.c(this.available, h.g(this.total, this.type.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.total;
        long j10 = this.available;
        long j11 = this.perUserLimit;
        StringBuilder l10 = e.l("Inventory(type=", str, ", total=", str2, ", available=");
        l10.append(j10);
        l10.append(", perUserLimit=");
        l10.append(j11);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.total);
        parcel.writeLong(this.available);
        parcel.writeLong(this.perUserLimit);
    }
}
