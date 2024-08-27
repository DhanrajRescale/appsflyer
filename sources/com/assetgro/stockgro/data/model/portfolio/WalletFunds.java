package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletFunds;", "Landroid/os/Parcelable;", "cash", HttpUrl.FRAGMENT_ENCODE_SET, "bonus", "deposit", "(DDD)V", "getBonus", "()D", "getCash", "getDeposit", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletFunds implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WalletFunds> CREATOR = new Creator();

    @SerializedName("bonus")
    private final double bonus;

    @SerializedName("cash")
    private final double cash;

    @SerializedName("deposit")
    private final double deposit;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletFunds> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletFunds createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletFunds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletFunds[] newArray(int i10) {
            return new WalletFunds[i10];
        }
    }

    public WalletFunds(double d10, double d11, double d12) {
        this.cash = d10;
        this.bonus = d11;
        this.deposit = d12;
    }

    public static /* synthetic */ WalletFunds copy$default(WalletFunds walletFunds, double d10, double d11, double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = walletFunds.cash;
        }
        double d13 = d10;
        if ((i10 & 2) != 0) {
            d11 = walletFunds.bonus;
        }
        double d14 = d11;
        if ((i10 & 4) != 0) {
            d12 = walletFunds.deposit;
        }
        return walletFunds.copy(d13, d14, d12);
    }

    /* renamed from: component1, reason: from getter */
    public final double getCash() {
        return this.cash;
    }

    /* renamed from: component2, reason: from getter */
    public final double getBonus() {
        return this.bonus;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDeposit() {
        return this.deposit;
    }

    @NotNull
    public final WalletFunds copy(double cash, double bonus, double deposit) {
        return new WalletFunds(cash, bonus, deposit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletFunds)) {
            return false;
        }
        WalletFunds walletFunds = (WalletFunds) other;
        return Double.compare(this.cash, walletFunds.cash) == 0 && Double.compare(this.bonus, walletFunds.bonus) == 0 && Double.compare(this.deposit, walletFunds.deposit) == 0;
    }

    public final double getBonus() {
        return this.bonus;
    }

    public final double getCash() {
        return this.cash;
    }

    public final double getDeposit() {
        return this.deposit;
    }

    public int hashCode() {
        return Double.hashCode(this.deposit) + d.c(this.bonus, Double.hashCode(this.cash) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "WalletFunds(cash=" + this.cash + ", bonus=" + this.bonus + ", deposit=" + this.deposit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.cash);
        parcel.writeDouble(this.bonus);
        parcel.writeDouble(this.deposit);
    }
}
