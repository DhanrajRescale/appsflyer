package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SocialSearchResponseDto;", "Landroid/os/Parcelable;", "usersData", "Lcom/assetgro/stockgro/data/remote/response/SearchUsersData;", "groupsData", "Lcom/assetgro/stockgro/data/remote/response/SearchGroupsData;", "(Lcom/assetgro/stockgro/data/remote/response/SearchUsersData;Lcom/assetgro/stockgro/data/remote/response/SearchGroupsData;)V", "getGroupsData", "()Lcom/assetgro/stockgro/data/remote/response/SearchGroupsData;", "getUsersData", "()Lcom/assetgro/stockgro/data/remote/response/SearchUsersData;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialSearchResponseDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SocialSearchResponseDto> CREATOR = new Creator();

    @SerializedName("groups_response")
    private final SearchGroupsData groupsData;

    @SerializedName("users_response")
    private final SearchUsersData usersData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SocialSearchResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchResponseDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SocialSearchResponseDto(parcel.readInt() == 0 ? null : SearchUsersData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SearchGroupsData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchResponseDto[] newArray(int i10) {
            return new SocialSearchResponseDto[i10];
        }
    }

    public SocialSearchResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SocialSearchResponseDto copy$default(SocialSearchResponseDto socialSearchResponseDto, SearchUsersData searchUsersData, SearchGroupsData searchGroupsData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            searchUsersData = socialSearchResponseDto.usersData;
        }
        if ((i10 & 2) != 0) {
            searchGroupsData = socialSearchResponseDto.groupsData;
        }
        return socialSearchResponseDto.copy(searchUsersData, searchGroupsData);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchUsersData getUsersData() {
        return this.usersData;
    }

    /* renamed from: component2, reason: from getter */
    public final SearchGroupsData getGroupsData() {
        return this.groupsData;
    }

    @NotNull
    public final SocialSearchResponseDto copy(SearchUsersData usersData, SearchGroupsData groupsData) {
        return new SocialSearchResponseDto(usersData, groupsData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSearchResponseDto)) {
            return false;
        }
        SocialSearchResponseDto socialSearchResponseDto = (SocialSearchResponseDto) other;
        return Intrinsics.a(this.usersData, socialSearchResponseDto.usersData) && Intrinsics.a(this.groupsData, socialSearchResponseDto.groupsData);
    }

    public final SearchGroupsData getGroupsData() {
        return this.groupsData;
    }

    public final SearchUsersData getUsersData() {
        return this.usersData;
    }

    public int hashCode() {
        SearchUsersData searchUsersData = this.usersData;
        int hashCode = (searchUsersData == null ? 0 : searchUsersData.hashCode()) * 31;
        SearchGroupsData searchGroupsData = this.groupsData;
        return hashCode + (searchGroupsData != null ? searchGroupsData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SocialSearchResponseDto(usersData=" + this.usersData + ", groupsData=" + this.groupsData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        SearchUsersData searchUsersData = this.usersData;
        if (searchUsersData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchUsersData.writeToParcel(parcel, flags);
        }
        SearchGroupsData searchGroupsData = this.groupsData;
        if (searchGroupsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchGroupsData.writeToParcel(parcel, flags);
        }
    }

    public SocialSearchResponseDto(SearchUsersData searchUsersData, SearchGroupsData searchGroupsData) {
        this.usersData = searchUsersData;
        this.groupsData = searchGroupsData;
    }

    public /* synthetic */ SocialSearchResponseDto(SearchUsersData searchUsersData, SearchGroupsData searchGroupsData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : searchUsersData, (i10 & 2) != 0 ? null : searchGroupsData);
    }
}
