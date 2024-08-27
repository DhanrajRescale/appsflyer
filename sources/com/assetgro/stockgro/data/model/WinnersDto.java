package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/WinnersDto;", "Landroid/os/Parcelable;", "rank", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "profileUrl", PaymentConstants.AMOUNT, "Lcom/assetgro/stockgro/data/model/ProfitDto;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ProfitDto;)V", "getAmount", "()Lcom/assetgro/stockgro/data/model/ProfitDto;", "getDisplayName", "()Ljava/lang/String;", "getProfileUrl", "getRank", "()I", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WinnersDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WinnersDto> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final ProfitDto amount;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("display_picture")
    @NotNull
    private final String profileUrl;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WinnersDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WinnersDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WinnersDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), ProfitDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WinnersDto[] newArray(int i10) {
            return new WinnersDto[i10];
        }
    }

    public WinnersDto(int i10, @NotNull String displayName, @NotNull String userId, @NotNull String profileUrl, @NotNull ProfitDto amount) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.rank = i10;
        this.displayName = displayName;
        this.userId = userId;
        this.profileUrl = profileUrl;
        this.amount = amount;
    }

    public static /* synthetic */ WinnersDto copy$default(WinnersDto winnersDto, int i10, String str, String str2, String str3, ProfitDto profitDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = winnersDto.rank;
        }
        if ((i11 & 2) != 0) {
            str = winnersDto.displayName;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = winnersDto.userId;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = winnersDto.profileUrl;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            profitDto = winnersDto.amount;
        }
        return winnersDto.copy(i10, str4, str5, str6, profitDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getProfileUrl() {
        return this.profileUrl;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ProfitDto getAmount() {
        return this.amount;
    }

    @NotNull
    public final WinnersDto copy(int rank, @NotNull String displayName, @NotNull String userId, @NotNull String profileUrl, @NotNull ProfitDto amount) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new WinnersDto(rank, displayName, userId, profileUrl, amount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WinnersDto)) {
            return false;
        }
        WinnersDto winnersDto = (WinnersDto) other;
        return this.rank == winnersDto.rank && Intrinsics.a(this.displayName, winnersDto.displayName) && Intrinsics.a(this.userId, winnersDto.userId) && Intrinsics.a(this.profileUrl, winnersDto.profileUrl) && Intrinsics.a(this.amount, winnersDto.amount);
    }

    @NotNull
    public final ProfitDto getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.amount.hashCode() + h.g(this.profileUrl, h.g(this.userId, h.g(this.displayName, Integer.hashCode(this.rank) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.rank;
        String str = this.displayName;
        String str2 = this.userId;
        String str3 = this.profileUrl;
        ProfitDto profitDto = this.amount;
        StringBuilder sb2 = new StringBuilder("WinnersDto(rank=");
        sb2.append(i10);
        sb2.append(", displayName=");
        sb2.append(str);
        sb2.append(", userId=");
        e.v(sb2, str2, ", profileUrl=", str3, ", amount=");
        sb2.append(profitDto);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.rank);
        parcel.writeString(this.displayName);
        parcel.writeString(this.userId);
        parcel.writeString(this.profileUrl);
        this.amount.writeToParcel(parcel, flags);
    }
}
