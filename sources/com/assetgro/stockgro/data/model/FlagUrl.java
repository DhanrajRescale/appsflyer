package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/FlagUrl;", "Landroid/os/Parcelable;", "rectangular", HttpUrl.FRAGMENT_ENCODE_SET, "circular", "(Ljava/lang/String;Ljava/lang/String;)V", "getCircular", "()Ljava/lang/String;", "getRectangular", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FlagUrl implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FlagUrl> CREATOR = new Creator();

    @SerializedName("circular")
    @NotNull
    private final String circular;

    @SerializedName("rectangular")
    @NotNull
    private final String rectangular;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FlagUrl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FlagUrl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlagUrl(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FlagUrl[] newArray(int i10) {
            return new FlagUrl[i10];
        }
    }

    public FlagUrl(@NotNull String rectangular, @NotNull String circular) {
        Intrinsics.checkNotNullParameter(rectangular, "rectangular");
        Intrinsics.checkNotNullParameter(circular, "circular");
        this.rectangular = rectangular;
        this.circular = circular;
    }

    public static /* synthetic */ FlagUrl copy$default(FlagUrl flagUrl, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = flagUrl.rectangular;
        }
        if ((i10 & 2) != 0) {
            str2 = flagUrl.circular;
        }
        return flagUrl.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRectangular() {
        return this.rectangular;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCircular() {
        return this.circular;
    }

    @NotNull
    public final FlagUrl copy(@NotNull String rectangular, @NotNull String circular) {
        Intrinsics.checkNotNullParameter(rectangular, "rectangular");
        Intrinsics.checkNotNullParameter(circular, "circular");
        return new FlagUrl(rectangular, circular);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagUrl)) {
            return false;
        }
        FlagUrl flagUrl = (FlagUrl) other;
        return Intrinsics.a(this.rectangular, flagUrl.rectangular) && Intrinsics.a(this.circular, flagUrl.circular);
    }

    @NotNull
    public final String getCircular() {
        return this.circular;
    }

    @NotNull
    public final String getRectangular() {
        return this.rectangular;
    }

    public int hashCode() {
        return this.circular.hashCode() + (this.rectangular.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("FlagUrl(rectangular=", this.rectangular, ", circular=", this.circular, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.rectangular);
        parcel.writeString(this.circular);
    }
}
