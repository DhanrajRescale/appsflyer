package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;", "Landroid/os/Parcelable;", "netPnl", HttpUrl.FRAGMENT_ENCODE_SET, "type", "percentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNetPnl", "()Ljava/lang/String;", "getPercentage", "getType", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pnl implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Pnl> CREATOR = new Creator();

    @SerializedName("net_pnl")
    @NotNull
    private final String netPnl;

    @SerializedName("percentage")
    @NotNull
    private final String percentage;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Pnl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pnl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Pnl(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Pnl[] newArray(int i10) {
            return new Pnl[i10];
        }
    }

    public Pnl(@NotNull String netPnl, @NotNull String type, @NotNull String percentage) {
        Intrinsics.checkNotNullParameter(netPnl, "netPnl");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.netPnl = netPnl;
        this.type = type;
        this.percentage = percentage;
    }

    public static /* synthetic */ Pnl copy$default(Pnl pnl, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pnl.netPnl;
        }
        if ((i10 & 2) != 0) {
            str2 = pnl.type;
        }
        if ((i10 & 4) != 0) {
            str3 = pnl.percentage;
        }
        return pnl.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNetPnl() {
        return this.netPnl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final Pnl copy(@NotNull String netPnl, @NotNull String type, @NotNull String percentage) {
        Intrinsics.checkNotNullParameter(netPnl, "netPnl");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        return new Pnl(netPnl, type, percentage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pnl)) {
            return false;
        }
        Pnl pnl = (Pnl) other;
        return Intrinsics.a(this.netPnl, pnl.netPnl) && Intrinsics.a(this.type, pnl.type) && Intrinsics.a(this.percentage, pnl.percentage);
    }

    @NotNull
    public final String getNetPnl() {
        return this.netPnl;
    }

    @NotNull
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.percentage.hashCode() + h.g(this.type, this.netPnl.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.netPnl;
        String str2 = this.type;
        return d.o(e.l("Pnl(netPnl=", str, ", type=", str2, ", percentage="), this.percentage, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.netPnl);
        parcel.writeString(this.type);
        parcel.writeString(this.percentage);
    }
}
