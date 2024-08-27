package com.assetgro.stockgro.missions.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.LifetimeEarnings;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/LifetimeEarningsDto;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.AMOUNT, "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toLifetimeEarnings", "Lcom/assetgro/stockgro/missions/domain/model/LifetimeEarnings;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LifetimeEarningsDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<LifetimeEarningsDto> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final String amount;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<LifetimeEarningsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LifetimeEarningsDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LifetimeEarningsDto(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LifetimeEarningsDto[] newArray(int i10) {
            return new LifetimeEarningsDto[i10];
        }
    }

    public LifetimeEarningsDto(@NotNull String title, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.title = title;
        this.amount = amount;
    }

    public static /* synthetic */ LifetimeEarningsDto copy$default(LifetimeEarningsDto lifetimeEarningsDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lifetimeEarningsDto.title;
        }
        if ((i10 & 2) != 0) {
            str2 = lifetimeEarningsDto.amount;
        }
        return lifetimeEarningsDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final LifetimeEarningsDto copy(@NotNull String title, @NotNull String amount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new LifetimeEarningsDto(title, amount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LifetimeEarningsDto)) {
            return false;
        }
        LifetimeEarningsDto lifetimeEarningsDto = (LifetimeEarningsDto) other;
        return Intrinsics.a(this.title, lifetimeEarningsDto.title) && Intrinsics.a(this.amount, lifetimeEarningsDto.amount);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.amount.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public final LifetimeEarnings toLifetimeEarnings() {
        return new LifetimeEarnings(this.title, this.amount);
    }

    @NotNull
    public String toString() {
        return h.s("LifetimeEarningsDto(title=", this.title, ", amount=", this.amount, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.amount);
    }
}
