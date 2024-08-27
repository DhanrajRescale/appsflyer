package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/model/PNL;", "Landroid/os/Parcelable;", "netPNL", HttpUrl.FRAGMENT_ENCODE_SET, "type", "percentage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNetPNL", "()Ljava/lang/String;", "getPercentage", "getType", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PNL implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PNL> CREATOR = new Creator();

    @SerializedName("net_pnl")
    private final String netPNL;

    @SerializedName("percentage")
    private final String percentage;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PNL> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PNL createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PNL(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PNL[] newArray(int i10) {
            return new PNL[i10];
        }
    }

    public PNL(String str, String str2, String str3) {
        this.netPNL = str;
        this.type = str2;
        this.percentage = str3;
    }

    public static /* synthetic */ PNL copy$default(PNL pnl, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pnl.netPNL;
        }
        if ((i10 & 2) != 0) {
            str2 = pnl.type;
        }
        if ((i10 & 4) != 0) {
            str3 = pnl.percentage;
        }
        return pnl.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNetPNL() {
        return this.netPNL;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final PNL copy(String netPNL, String type, String percentage) {
        return new PNL(netPNL, type, percentage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PNL)) {
            return false;
        }
        PNL pnl = (PNL) other;
        return Intrinsics.a(this.netPNL, pnl.netPNL) && Intrinsics.a(this.type, pnl.type) && Intrinsics.a(this.percentage, pnl.percentage);
    }

    public final String getNetPNL() {
        return this.netPNL;
    }

    public final String getPercentage() {
        return this.percentage;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.netPNL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.percentage;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.netPNL;
        String str2 = this.type;
        return d.o(e.l("PNL(netPNL=", str, ", type=", str2, ", percentage="), this.percentage, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.netPNL);
        parcel.writeString(this.type);
        parcel.writeString(this.percentage);
    }
}
