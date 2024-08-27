package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/Pricing;", "Landroid/os/Parcelable;", "type", HttpUrl.FRAGMENT_ENCODE_SET, "cash", HttpUrl.FRAGMENT_ENCODE_SET, "bonus", "total", "(Ljava/lang/String;FFF)V", "getBonus", "()F", "getCash", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pricing implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Pricing> CREATOR = new Creator();

    @SerializedName("bonus")
    private final float bonus;

    @SerializedName("cash")
    private final float cash;

    @SerializedName("total")
    private final float total;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Pricing> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pricing createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Pricing(parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pricing[] newArray(int i10) {
            return new Pricing[i10];
        }
    }

    public Pricing(@NotNull String type, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.cash = f10;
        this.bonus = f11;
        this.total = f12;
    }

    public static /* synthetic */ Pricing copy$default(Pricing pricing, String str, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pricing.type;
        }
        if ((i10 & 2) != 0) {
            f10 = pricing.cash;
        }
        if ((i10 & 4) != 0) {
            f11 = pricing.bonus;
        }
        if ((i10 & 8) != 0) {
            f12 = pricing.total;
        }
        return pricing.copy(str, f10, f11, f12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCash() {
        return this.cash;
    }

    /* renamed from: component3, reason: from getter */
    public final float getBonus() {
        return this.bonus;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTotal() {
        return this.total;
    }

    @NotNull
    public final Pricing copy(@NotNull String type, float cash, float bonus, float total) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Pricing(type, cash, bonus, total);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pricing)) {
            return false;
        }
        Pricing pricing = (Pricing) other;
        return Intrinsics.a(this.type, pricing.type) && Float.compare(this.cash, pricing.cash) == 0 && Float.compare(this.bonus, pricing.bonus) == 0 && Float.compare(this.total, pricing.total) == 0;
    }

    public final float getBonus() {
        return this.bonus;
    }

    public final float getCash() {
        return this.cash;
    }

    public final float getTotal() {
        return this.total;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Float.hashCode(this.total) + e.a(this.bonus, e.a(this.cash, this.type.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "Pricing(type=" + this.type + ", cash=" + this.cash + ", bonus=" + this.bonus + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeFloat(this.cash);
        parcel.writeFloat(this.bonus);
        parcel.writeFloat(this.total);
    }
}
