package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/model/LeaderBoardUserDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", "userId", "date", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioDetails", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "rank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/String;)V", "getDate", "()J", "getImageUrl", "()Ljava/lang/String;", "getName", "getPortfolioDetails", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getRank", "getUserId", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LeaderBoardUserDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<LeaderBoardUserDto> CREATOR = new Creator();

    @SerializedName("date")
    private final long date;

    @SerializedName("display_picture")
    @NotNull
    private final String imageUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("portfolio_details")
    @NotNull
    private final ChangeDto portfolioDetails;

    @SerializedName("rank")
    @NotNull
    private final String rank;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<LeaderBoardUserDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LeaderBoardUserDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeaderBoardUserDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), ChangeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LeaderBoardUserDto[] newArray(int i10) {
            return new LeaderBoardUserDto[i10];
        }
    }

    public LeaderBoardUserDto(@NotNull String name, @NotNull String imageUrl, @NotNull String userId, long j10, @NotNull ChangeDto portfolioDetails, @NotNull String rank) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(portfolioDetails, "portfolioDetails");
        Intrinsics.checkNotNullParameter(rank, "rank");
        this.name = name;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.date = j10;
        this.portfolioDetails = portfolioDetails;
        this.rank = rank;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ChangeDto getPortfolioDetails() {
        return this.portfolioDetails;
    }

    @NotNull
    public final String getRank() {
        return this.rank;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.userId);
        parcel.writeLong(this.date);
        this.portfolioDetails.writeToParcel(parcel, flags);
        parcel.writeString(this.rank);
    }
}
