package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\t\u0010/\u001a\u00020\nHÖ\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\nHÖ\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0010\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006:"}, d2 = {"Lcom/assetgro/stockgro/data/model/ProfileStatsDto;", "Landroid/os/Parcelable;", "isFriend", HttpUrl.FRAGMENT_ENCODE_SET, "socialPoints", HttpUrl.FRAGMENT_ENCODE_SET, "tradingPoints", "level", "totalFollowers", "followerCount", HttpUrl.FRAGMENT_ENCODE_SET, "followingCount", "username", "displayName", "bio", "imageUrl", "isRiaRra", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBio", "()Ljava/lang/String;", "getDisplayName", "getFollowerCount", "()I", "getFollowingCount", "getImageUrl", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLevel", "getSocialPoints", "getTotalFollowers", "getTradingPoints", "getUsername", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/data/model/ProfileStatsDto;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ProfileStatsDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProfileStatsDto> CREATOR = new Creator();

    @SerializedName("bio")
    private final String bio;

    @SerializedName("display_name")
    private final String displayName;

    @SerializedName("follower_count")
    private final int followerCount;

    @SerializedName("following_count")
    private final int followingCount;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("is_friend")
    private final boolean isFriend;

    @SerializedName("is_ria_rra")
    private final Boolean isRiaRra;

    @SerializedName("level")
    private final String level;

    @SerializedName("sp")
    @NotNull
    private final String socialPoints;

    @SerializedName("friends_count")
    @NotNull
    private final String totalFollowers;

    @SerializedName("tp")
    @NotNull
    private final String tradingPoints;

    @SerializedName("username")
    private final String username;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ProfileStatsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfileStatsDto createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z10 = parcel.readInt() != 0;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProfileStatsDto(z10, readString, readString2, readString3, readString4, readInt, readInt2, readString5, readString6, readString7, readString8, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfileStatsDto[] newArray(int i10) {
            return new ProfileStatsDto[i10];
        }
    }

    public ProfileStatsDto(boolean z10, @NotNull String socialPoints, @NotNull String tradingPoints, String str, @NotNull String totalFollowers, int i10, int i11, String str2, String str3, String str4, String str5, Boolean bool) {
        Intrinsics.checkNotNullParameter(socialPoints, "socialPoints");
        Intrinsics.checkNotNullParameter(tradingPoints, "tradingPoints");
        Intrinsics.checkNotNullParameter(totalFollowers, "totalFollowers");
        this.isFriend = z10;
        this.socialPoints = socialPoints;
        this.tradingPoints = tradingPoints;
        this.level = str;
        this.totalFollowers = totalFollowers;
        this.followerCount = i10;
        this.followingCount = i11;
        this.username = str2;
        this.displayName = str3;
        this.bio = str4;
        this.imageUrl = str5;
        this.isRiaRra = bool;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFriend() {
        return this.isFriend;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component11, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsRiaRra() {
        return this.isRiaRra;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSocialPoints() {
        return this.socialPoints;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTradingPoints() {
        return this.tradingPoints;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTotalFollowers() {
        return this.totalFollowers;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFollowerCount() {
        return this.followerCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getFollowingCount() {
        return this.followingCount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final ProfileStatsDto copy(boolean isFriend, @NotNull String socialPoints, @NotNull String tradingPoints, String level, @NotNull String totalFollowers, int followerCount, int followingCount, String username, String displayName, String bio, String imageUrl, Boolean isRiaRra) {
        Intrinsics.checkNotNullParameter(socialPoints, "socialPoints");
        Intrinsics.checkNotNullParameter(tradingPoints, "tradingPoints");
        Intrinsics.checkNotNullParameter(totalFollowers, "totalFollowers");
        return new ProfileStatsDto(isFriend, socialPoints, tradingPoints, level, totalFollowers, followerCount, followingCount, username, displayName, bio, imageUrl, isRiaRra);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileStatsDto)) {
            return false;
        }
        ProfileStatsDto profileStatsDto = (ProfileStatsDto) other;
        return this.isFriend == profileStatsDto.isFriend && Intrinsics.a(this.socialPoints, profileStatsDto.socialPoints) && Intrinsics.a(this.tradingPoints, profileStatsDto.tradingPoints) && Intrinsics.a(this.level, profileStatsDto.level) && Intrinsics.a(this.totalFollowers, profileStatsDto.totalFollowers) && this.followerCount == profileStatsDto.followerCount && this.followingCount == profileStatsDto.followingCount && Intrinsics.a(this.username, profileStatsDto.username) && Intrinsics.a(this.displayName, profileStatsDto.displayName) && Intrinsics.a(this.bio, profileStatsDto.bio) && Intrinsics.a(this.imageUrl, profileStatsDto.imageUrl) && Intrinsics.a(this.isRiaRra, profileStatsDto.isRiaRra);
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowingCount() {
        return this.followingCount;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getSocialPoints() {
        return this.socialPoints;
    }

    @NotNull
    public final String getTotalFollowers() {
        return this.totalFollowers;
    }

    @NotNull
    public final String getTradingPoints() {
        return this.tradingPoints;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int g10 = h.g(this.tradingPoints, h.g(this.socialPoints, Boolean.hashCode(this.isFriend) * 31, 31), 31);
        String str = this.level;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = e.f(this.followingCount, e.f(this.followerCount, h.g(this.totalFollowers, (g10 + hashCode) * 31, 31), 31), 31);
        String str2 = this.username;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        String str3 = this.displayName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.bio;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.imageUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Boolean bool = this.isRiaRra;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i14 + i10;
    }

    public final boolean isFriend() {
        return this.isFriend;
    }

    public final Boolean isRiaRra() {
        return this.isRiaRra;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.isFriend;
        String str = this.socialPoints;
        String str2 = this.tradingPoints;
        String str3 = this.level;
        String str4 = this.totalFollowers;
        int i10 = this.followerCount;
        int i11 = this.followingCount;
        String str5 = this.username;
        String str6 = this.displayName;
        String str7 = this.bio;
        String str8 = this.imageUrl;
        Boolean bool = this.isRiaRra;
        StringBuilder sb2 = new StringBuilder("ProfileStatsDto(isFriend=");
        sb2.append(z10);
        sb2.append(", socialPoints=");
        sb2.append(str);
        sb2.append(", tradingPoints=");
        v.e.v(sb2, str2, ", level=", str3, ", totalFollowers=");
        sb2.append(str4);
        sb2.append(", followerCount=");
        sb2.append(i10);
        sb2.append(", followingCount=");
        d.w(sb2, i11, ", username=", str5, ", displayName=");
        v.e.v(sb2, str6, ", bio=", str7, ", imageUrl=");
        sb2.append(str8);
        sb2.append(", isRiaRra=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isFriend ? 1 : 0);
        parcel.writeString(this.socialPoints);
        parcel.writeString(this.tradingPoints);
        parcel.writeString(this.level);
        parcel.writeString(this.totalFollowers);
        parcel.writeInt(this.followerCount);
        parcel.writeInt(this.followingCount);
        parcel.writeString(this.username);
        parcel.writeString(this.displayName);
        parcel.writeString(this.bio);
        parcel.writeString(this.imageUrl);
        Boolean bool = this.isRiaRra;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
    }

    public /* synthetic */ ProfileStatsDto(boolean z10, String str, String str2, String str3, String str4, int i10, int i11, String str5, String str6, String str7, String str8, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, str, str2, str3, str4, i10, i11, (i12 & 128) != 0 ? "stockgro.user" : str5, (i12 & 256) != 0 ? "stockgro.user" : str6, str7, str8, bool);
    }
}
