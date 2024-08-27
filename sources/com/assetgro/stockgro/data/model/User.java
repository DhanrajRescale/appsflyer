package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JZ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\u0006\u0010&\u001a\u00020\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/data/model/User;", "Landroid/os/Parcelable;", "winningAmount", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "userId", "rank", "portfolio", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "winCash", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/Boolean;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getName", "getPortfolio", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getRank", "getUserId", "getWinCash", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWinningAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/assetgro/stockgro/data/model/User;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "getUserImageUrl", "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class User implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<User> CREATOR = new Creator();

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("portfolio")
    @NotNull
    private final ChangeDto portfolio;

    @SerializedName("rank")
    @NotNull
    private final String rank;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("win_cash")
    private final Boolean winCash;

    @SerializedName("winning_amount")
    private final String winningAmount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final User createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ChangeDto createFromParcel = ChangeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new User(readString, readString2, readString3, readString4, createFromParcel, valueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final User[] newArray(int i10) {
            return new User[i10];
        }
    }

    public User(String str, @NotNull String name, @NotNull String userId, @NotNull String rank, @NotNull ChangeDto portfolio, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.winningAmount = str;
        this.name = name;
        this.userId = userId;
        this.rank = rank;
        this.portfolio = portfolio;
        this.winCash = bool;
        this.imageUrl = str2;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, ChangeDto changeDto, Boolean bool, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = user.winningAmount;
        }
        if ((i10 & 2) != 0) {
            str2 = user.name;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = user.userId;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = user.rank;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            changeDto = user.portfolio;
        }
        ChangeDto changeDto2 = changeDto;
        if ((i10 & 32) != 0) {
            bool = user.winCash;
        }
        Boolean bool2 = bool;
        if ((i10 & 64) != 0) {
            str5 = user.imageUrl;
        }
        return user.copy(str, str6, str7, str8, changeDto2, bool2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWinningAmount() {
        return this.winningAmount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ChangeDto getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getWinCash() {
        return this.winCash;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final User copy(String winningAmount, @NotNull String name, @NotNull String userId, @NotNull String rank, @NotNull ChangeDto portfolio, Boolean winCash, String imageUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        return new User(winningAmount, name, userId, rank, portfolio, winCash, imageUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.a(this.winningAmount, user.winningAmount) && Intrinsics.a(this.name, user.name) && Intrinsics.a(this.userId, user.userId) && Intrinsics.a(this.rank, user.rank) && Intrinsics.a(this.portfolio, user.portfolio) && Intrinsics.a(this.winCash, user.winCash) && Intrinsics.a(this.imageUrl, user.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ChangeDto getPortfolio() {
        return this.portfolio;
    }

    @NotNull
    public final String getRank() {
        return this.rank;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserImageUrl() {
        String str = this.imageUrl;
        if (str == null) {
            return a.f("https://storage.googleapis.com/prod_stockgro-users/", this.userId);
        }
        return str;
    }

    public final Boolean getWinCash() {
        return this.winCash;
    }

    public final String getWinningAmount() {
        return this.winningAmount;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.winningAmount;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (this.portfolio.hashCode() + h.g(this.rank, h.g(this.userId, h.g(this.name, hashCode * 31, 31), 31), 31)) * 31;
        Boolean bool = this.winCash;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i11 = (hashCode3 + hashCode2) * 31;
        String str2 = this.imageUrl;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.winningAmount;
        String str2 = this.name;
        String str3 = this.userId;
        String str4 = this.rank;
        ChangeDto changeDto = this.portfolio;
        Boolean bool = this.winCash;
        String str5 = this.imageUrl;
        StringBuilder l10 = e.l("User(winningAmount=", str, ", name=", str2, ", userId=");
        e.v(l10, str3, ", rank=", str4, ", portfolio=");
        l10.append(changeDto);
        l10.append(", winCash=");
        l10.append(bool);
        l10.append(", imageUrl=");
        return d.o(l10, str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.winningAmount);
        parcel.writeString(this.name);
        parcel.writeString(this.userId);
        parcel.writeString(this.rank);
        this.portfolio.writeToParcel(parcel, flags);
        Boolean bool = this.winCash;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        parcel.writeString(this.imageUrl);
    }
}
