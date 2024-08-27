package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/model/WalletInfo;", "Landroid/os/Parcelable;", "total", HttpUrl.FRAGMENT_ENCODE_SET, "bonus", "cash", "(FFF)V", "getBonus", "()F", "getCash", "getTotal", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WalletInfo> CREATOR = new Creator();

    @SerializedName("bonus")
    private final float bonus;

    @SerializedName("cash")
    private final float cash;

    @SerializedName("total")
    private final float total;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletInfo[] newArray(int i10) {
            return new WalletInfo[i10];
        }
    }

    public WalletInfo(float f10, float f11, float f12) {
        this.total = f10;
        this.bonus = f11;
        this.cash = f12;
    }

    public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = walletInfo.total;
        }
        if ((i10 & 2) != 0) {
            f11 = walletInfo.bonus;
        }
        if ((i10 & 4) != 0) {
            f12 = walletInfo.cash;
        }
        return walletInfo.copy(f10, f11, f12);
    }

    /* renamed from: component1, reason: from getter */
    public final float getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final float getBonus() {
        return this.bonus;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCash() {
        return this.cash;
    }

    @NotNull
    public final WalletInfo copy(float total, float bonus, float cash) {
        return new WalletInfo(total, bonus, cash);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletInfo)) {
            return false;
        }
        WalletInfo walletInfo = (WalletInfo) other;
        return Float.compare(this.total, walletInfo.total) == 0 && Float.compare(this.bonus, walletInfo.bonus) == 0 && Float.compare(this.cash, walletInfo.cash) == 0;
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

    public int hashCode() {
        return Float.hashCode(this.cash) + e.a(this.bonus, Float.hashCode(this.total) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "WalletInfo(total=" + this.total + ", bonus=" + this.bonus + ", cash=" + this.cash + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.total);
        parcel.writeFloat(this.bonus);
        parcel.writeFloat(this.cash);
    }
}
