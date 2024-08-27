package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/model/SentimentItemDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;)V", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SentimentItemDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SentimentItemDto> CREATOR = new Creator();

    @SerializedName("change")
    @NotNull
    private final ChangeDto change;

    @SerializedName("periodicity")
    @NotNull
    private final String name;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SentimentItemDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SentimentItemDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SentimentItemDto(parcel.readString(), ChangeDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SentimentItemDto[] newArray(int i10) {
            return new SentimentItemDto[i10];
        }
    }

    public SentimentItemDto(@NotNull String name, @NotNull ChangeDto change) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(change, "change");
        this.name = name;
        this.change = change;
    }

    public static /* synthetic */ SentimentItemDto copy$default(SentimentItemDto sentimentItemDto, String str, ChangeDto changeDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sentimentItemDto.name;
        }
        if ((i10 & 2) != 0) {
            changeDto = sentimentItemDto.change;
        }
        return sentimentItemDto.copy(str, changeDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final SentimentItemDto copy(@NotNull String name, @NotNull ChangeDto change) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(change, "change");
        return new SentimentItemDto(name, change);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentimentItemDto)) {
            return false;
        }
        SentimentItemDto sentimentItemDto = (SentimentItemDto) other;
        return Intrinsics.a(this.name, sentimentItemDto.name) && Intrinsics.a(this.change, sentimentItemDto.change);
    }

    @NotNull
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.change.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SentimentItemDto(name=" + this.name + ", change=" + this.change + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        this.change.writeToParcel(parcel, flags);
    }
}
