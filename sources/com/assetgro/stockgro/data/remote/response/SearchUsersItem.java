package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006+"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SearchUsersItem;", "Landroid/os/Parcelable;", "userName", HttpUrl.FRAGMENT_ENCODE_SET, "displayImage", "userId", "isFollowing", HttpUrl.FRAGMENT_ENCODE_SET, "userDisplayName", "followerCount", HttpUrl.FRAGMENT_ENCODE_SET, "isExpert", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZ)V", "getDisplayImage", "()Ljava/lang/String;", "getFollowerCount", "()I", "()Z", "setExpert", "(Z)V", "setFollowing", "getUserDisplayName", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchUsersItem implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SearchUsersItem> CREATOR = new Creator();

    @SerializedName("display_image")
    @NotNull
    private final String displayImage;

    @SerializedName("follower_count")
    private final int followerCount;

    @SerializedName("is_ria_rra")
    private boolean isExpert;

    @SerializedName("is_following")
    private boolean isFollowing;

    @SerializedName("display_name")
    @NotNull
    private final String userDisplayName;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("username")
    @NotNull
    private final String userName;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SearchUsersItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchUsersItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchUsersItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SearchUsersItem[] newArray(int i10) {
            return new SearchUsersItem[i10];
        }
    }

    public SearchUsersItem(@NotNull String userName, @NotNull String displayImage, @NotNull String userId, boolean z10, @NotNull String userDisplayName, int i10, boolean z11) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userDisplayName, "userDisplayName");
        this.userName = userName;
        this.displayImage = displayImage;
        this.userId = userId;
        this.isFollowing = z10;
        this.userDisplayName = userDisplayName;
        this.followerCount = i10;
        this.isExpert = z11;
    }

    public static /* synthetic */ SearchUsersItem copy$default(SearchUsersItem searchUsersItem, String str, String str2, String str3, boolean z10, String str4, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchUsersItem.userName;
        }
        if ((i11 & 2) != 0) {
            str2 = searchUsersItem.displayImage;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = searchUsersItem.userId;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            z10 = searchUsersItem.isFollowing;
        }
        boolean z12 = z10;
        if ((i11 & 16) != 0) {
            str4 = searchUsersItem.userDisplayName;
        }
        String str7 = str4;
        if ((i11 & 32) != 0) {
            i10 = searchUsersItem.followerCount;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            z11 = searchUsersItem.isExpert;
        }
        return searchUsersItem.copy(str, str5, str6, z12, str7, i12, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFollowerCount() {
        return this.followerCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    public final SearchUsersItem copy(@NotNull String userName, @NotNull String displayImage, @NotNull String userId, boolean isFollowing, @NotNull String userDisplayName, int followerCount, boolean isExpert) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userDisplayName, "userDisplayName");
        return new SearchUsersItem(userName, displayImage, userId, isFollowing, userDisplayName, followerCount, isExpert);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchUsersItem)) {
            return false;
        }
        SearchUsersItem searchUsersItem = (SearchUsersItem) other;
        return Intrinsics.a(this.userName, searchUsersItem.userName) && Intrinsics.a(this.displayImage, searchUsersItem.displayImage) && Intrinsics.a(this.userId, searchUsersItem.userId) && this.isFollowing == searchUsersItem.isFollowing && Intrinsics.a(this.userDisplayName, searchUsersItem.userDisplayName) && this.followerCount == searchUsersItem.followerCount && this.isExpert == searchUsersItem.isExpert;
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    @NotNull
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpert) + e.f(this.followerCount, h.g(this.userDisplayName, v.e.d(this.isFollowing, h.g(this.userId, h.g(this.displayImage, this.userName.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final void setExpert(boolean z10) {
        this.isExpert = z10;
    }

    public final void setFollowing(boolean z10) {
        this.isFollowing = z10;
    }

    @NotNull
    public String toString() {
        String str = this.userName;
        String str2 = this.displayImage;
        String str3 = this.userId;
        boolean z10 = this.isFollowing;
        String str4 = this.userDisplayName;
        int i10 = this.followerCount;
        boolean z11 = this.isExpert;
        StringBuilder l10 = v.e.l("SearchUsersItem(userName=", str, ", displayImage=", str2, ", userId=");
        l10.append(str3);
        l10.append(", isFollowing=");
        l10.append(z10);
        l10.append(", userDisplayName=");
        l10.append(str4);
        l10.append(", followerCount=");
        l10.append(i10);
        l10.append(", isExpert=");
        return e.o(l10, z11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userName);
        parcel.writeString(this.displayImage);
        parcel.writeString(this.userId);
        parcel.writeInt(this.isFollowing ? 1 : 0);
        parcel.writeString(this.userDisplayName);
        parcel.writeInt(this.followerCount);
        parcel.writeInt(this.isExpert ? 1 : 0);
    }

    public /* synthetic */ SearchUsersItem(String str, String str2, String str3, boolean z10, String str4, int i10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, str4, i10, (i11 & 64) != 0 ? false : z11);
    }
}
