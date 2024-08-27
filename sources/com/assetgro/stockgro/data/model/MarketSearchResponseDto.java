package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/model/MarketSearchResponseDto;", "Landroid/os/Parcelable;", "marketSearchResponseData", "Lcom/assetgro/stockgro/data/model/MarketSearchResponseData;", "(Lcom/assetgro/stockgro/data/model/MarketSearchResponseData;)V", "getMarketSearchResponseData", "()Lcom/assetgro/stockgro/data/model/MarketSearchResponseData;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketSearchResponseDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MarketSearchResponseDto> CREATOR = new Creator();

    @SerializedName("data")
    @NotNull
    private final MarketSearchResponseData marketSearchResponseData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MarketSearchResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchResponseDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketSearchResponseDto(MarketSearchResponseData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketSearchResponseDto[] newArray(int i10) {
            return new MarketSearchResponseDto[i10];
        }
    }

    public MarketSearchResponseDto(@NotNull MarketSearchResponseData marketSearchResponseData) {
        Intrinsics.checkNotNullParameter(marketSearchResponseData, "marketSearchResponseData");
        this.marketSearchResponseData = marketSearchResponseData;
    }

    public static /* synthetic */ MarketSearchResponseDto copy$default(MarketSearchResponseDto marketSearchResponseDto, MarketSearchResponseData marketSearchResponseData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            marketSearchResponseData = marketSearchResponseDto.marketSearchResponseData;
        }
        return marketSearchResponseDto.copy(marketSearchResponseData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MarketSearchResponseData getMarketSearchResponseData() {
        return this.marketSearchResponseData;
    }

    @NotNull
    public final MarketSearchResponseDto copy(@NotNull MarketSearchResponseData marketSearchResponseData) {
        Intrinsics.checkNotNullParameter(marketSearchResponseData, "marketSearchResponseData");
        return new MarketSearchResponseDto(marketSearchResponseData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketSearchResponseDto) && Intrinsics.a(this.marketSearchResponseData, ((MarketSearchResponseDto) other).marketSearchResponseData);
    }

    @NotNull
    public final MarketSearchResponseData getMarketSearchResponseData() {
        return this.marketSearchResponseData;
    }

    public int hashCode() {
        return this.marketSearchResponseData.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketSearchResponseDto(marketSearchResponseData=" + this.marketSearchResponseData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.marketSearchResponseData.writeToParcel(parcel, flags);
    }
}
