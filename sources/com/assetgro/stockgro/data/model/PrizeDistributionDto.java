package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/PrizeDistributionDto;", "Landroid/os/Parcelable;", "rank", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.AMOUNT, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;D)V", "getAmount", "()D", "getRank", "()Ljava/lang/String;", "winCash", HttpUrl.FRAGMENT_ENCODE_SET, "getWinCash", "()Ljava/lang/Boolean;", "setWinCash", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PrizeDistributionDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PrizeDistributionDto> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    private final double amount;

    @SerializedName("rank")
    @NotNull
    private final String rank;
    private Boolean winCash;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PrizeDistributionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrizeDistributionDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrizeDistributionDto(parcel.readString(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrizeDistributionDto[] newArray(int i10) {
            return new PrizeDistributionDto[i10];
        }
    }

    public PrizeDistributionDto(@NotNull String rank, double d10) {
        Intrinsics.checkNotNullParameter(rank, "rank");
        this.rank = rank;
        this.amount = d10;
        this.winCash = Boolean.FALSE;
    }

    public static /* synthetic */ PrizeDistributionDto copy$default(PrizeDistributionDto prizeDistributionDto, String str, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = prizeDistributionDto.rank;
        }
        if ((i10 & 2) != 0) {
            d10 = prizeDistributionDto.amount;
        }
        return prizeDistributionDto.copy(str, d10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final PrizeDistributionDto copy(@NotNull String rank, double amount) {
        Intrinsics.checkNotNullParameter(rank, "rank");
        return new PrizeDistributionDto(rank, amount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeDistributionDto)) {
            return false;
        }
        PrizeDistributionDto prizeDistributionDto = (PrizeDistributionDto) other;
        return Intrinsics.a(this.rank, prizeDistributionDto.rank) && Double.compare(this.amount, prizeDistributionDto.amount) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getRank() {
        return this.rank;
    }

    public final Boolean getWinCash() {
        return this.winCash;
    }

    public int hashCode() {
        return Double.hashCode(this.amount) + (this.rank.hashCode() * 31);
    }

    public final void setWinCash(Boolean bool) {
        this.winCash = bool;
    }

    @NotNull
    public String toString() {
        return "PrizeDistributionDto(rank=" + this.rank + ", amount=" + this.amount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.rank);
        parcel.writeDouble(this.amount);
    }
}
