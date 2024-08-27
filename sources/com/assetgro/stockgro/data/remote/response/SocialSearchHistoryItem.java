package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SocialSearchHistoryItem;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "searchQuery", "(Ljava/lang/String;Ljava/lang/String;)V", "getSearchQuery", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialSearchHistoryItem implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SocialSearchHistoryItem> CREATOR = new Creator();

    @SerializedName("search_query")
    @NotNull
    private final String searchQuery;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SocialSearchHistoryItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchHistoryItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SocialSearchHistoryItem(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchHistoryItem[] newArray(int i10) {
            return new SocialSearchHistoryItem[i10];
        }
    }

    public SocialSearchHistoryItem(@NotNull String userId, @NotNull String searchQuery) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.userId = userId;
        this.searchQuery = searchQuery;
    }

    public static /* synthetic */ SocialSearchHistoryItem copy$default(SocialSearchHistoryItem socialSearchHistoryItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialSearchHistoryItem.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = socialSearchHistoryItem.searchQuery;
        }
        return socialSearchHistoryItem.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    @NotNull
    public final SocialSearchHistoryItem copy(@NotNull String userId, @NotNull String searchQuery) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new SocialSearchHistoryItem(userId, searchQuery);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSearchHistoryItem)) {
            return false;
        }
        SocialSearchHistoryItem socialSearchHistoryItem = (SocialSearchHistoryItem) other;
        return Intrinsics.a(this.userId, socialSearchHistoryItem.userId) && Intrinsics.a(this.searchQuery, socialSearchHistoryItem.searchQuery);
    }

    @NotNull
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.searchQuery.hashCode() + (this.userId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("SocialSearchHistoryItem(userId=", this.userId, ", searchQuery=", this.searchQuery, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.searchQuery);
    }
}
