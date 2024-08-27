package com.assetgro.stockgro.missions.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.MissionReward;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;", "Landroid/os/Parcelable;", "type", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.AMOUNT, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getAmount", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toMissionReward", "Lcom/assetgro/stockgro/missions/domain/model/MissionReward;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionRewardDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MissionRewardDto> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    private final int amount;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionRewardDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionRewardDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MissionRewardDto(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionRewardDto[] newArray(int i10) {
            return new MissionRewardDto[i10];
        }
    }

    public MissionRewardDto(@NotNull String type, int i10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.amount = i10;
    }

    public static /* synthetic */ MissionRewardDto copy$default(MissionRewardDto missionRewardDto, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = missionRewardDto.type;
        }
        if ((i11 & 2) != 0) {
            i10 = missionRewardDto.amount;
        }
        return missionRewardDto.copy(str, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final MissionRewardDto copy(@NotNull String type, int amount) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MissionRewardDto(type, amount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionRewardDto)) {
            return false;
        }
        MissionRewardDto missionRewardDto = (MissionRewardDto) other;
        return Intrinsics.a(this.type, missionRewardDto.type) && this.amount == missionRewardDto.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.amount) + (this.type.hashCode() * 31);
    }

    @NotNull
    public final MissionReward toMissionReward() {
        return new MissionReward(this.type, this.amount);
    }

    @NotNull
    public String toString() {
        return "MissionRewardDto(type=" + this.type + ", amount=" + this.amount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeInt(this.amount);
    }
}
