package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/PeriodicPnl;", "Landroid/os/Parcelable;", "pnl", "Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;", "periodicity", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;Ljava/lang/String;)V", "getPeriodicity", "()Ljava/lang/String;", "getPnl", "()Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PeriodicPnl implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PeriodicPnl> CREATOR = new Creator();

    @SerializedName("periodicity")
    @NotNull
    private final String periodicity;

    @SerializedName("pnl")
    @NotNull
    private final Pnl pnl;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PeriodicPnl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PeriodicPnl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeriodicPnl(Pnl.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PeriodicPnl[] newArray(int i10) {
            return new PeriodicPnl[i10];
        }
    }

    public PeriodicPnl(@NotNull Pnl pnl, @NotNull String periodicity) {
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        this.pnl = pnl;
        this.periodicity = periodicity;
    }

    public static /* synthetic */ PeriodicPnl copy$default(PeriodicPnl periodicPnl, Pnl pnl, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pnl = periodicPnl.pnl;
        }
        if ((i10 & 2) != 0) {
            str = periodicPnl.periodicity;
        }
        return periodicPnl.copy(pnl, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Pnl getPnl() {
        return this.pnl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPeriodicity() {
        return this.periodicity;
    }

    @NotNull
    public final PeriodicPnl copy(@NotNull Pnl pnl, @NotNull String periodicity) {
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        return new PeriodicPnl(pnl, periodicity);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodicPnl)) {
            return false;
        }
        PeriodicPnl periodicPnl = (PeriodicPnl) other;
        return Intrinsics.a(this.pnl, periodicPnl.pnl) && Intrinsics.a(this.periodicity, periodicPnl.periodicity);
    }

    @NotNull
    public final String getPeriodicity() {
        return this.periodicity;
    }

    @NotNull
    public final Pnl getPnl() {
        return this.pnl;
    }

    public int hashCode() {
        return this.periodicity.hashCode() + (this.pnl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PeriodicPnl(pnl=" + this.pnl + ", periodicity=" + this.periodicity + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.pnl.writeToParcel(parcel, flags);
        parcel.writeString(this.periodicity);
    }
}
