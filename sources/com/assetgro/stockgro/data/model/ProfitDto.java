package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/model/ProfitDto;", "Landroid/os/Parcelable;", "absolute", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getAbsolute", "()Ljava/lang/String;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ProfitDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProfitDto> CREATOR = new Creator();

    @SerializedName("absolute")
    @NotNull
    private final String absolute;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ProfitDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfitDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfitDto(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfitDto[] newArray(int i10) {
            return new ProfitDto[i10];
        }
    }

    public ProfitDto(@NotNull String absolute) {
        Intrinsics.checkNotNullParameter(absolute, "absolute");
        this.absolute = absolute;
    }

    public static /* synthetic */ ProfitDto copy$default(ProfitDto profitDto, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = profitDto.absolute;
        }
        return profitDto.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAbsolute() {
        return this.absolute;
    }

    @NotNull
    public final ProfitDto copy(@NotNull String absolute) {
        Intrinsics.checkNotNullParameter(absolute, "absolute");
        return new ProfitDto(absolute);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfitDto) && Intrinsics.a(this.absolute, ((ProfitDto) other).absolute);
    }

    @NotNull
    public final String getAbsolute() {
        return this.absolute;
    }

    public int hashCode() {
        return this.absolute.hashCode();
    }

    @NotNull
    public String toString() {
        return d.k("ProfitDto(absolute=", this.absolute, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.absolute);
    }
}
