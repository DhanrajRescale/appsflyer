package com.assetgro.stockgro.data.model.portfolio.holdings;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/Followers;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "orderType", "displayName", "displayImage", "executionDate", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDisplayImage", "()Ljava/lang/String;", "getDisplayName", "getExecutionDate", "()J", "getOrderType", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Followers implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Followers> CREATOR = new Creator();

    @SerializedName("display_image")
    @NotNull
    private final String displayImage;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("execution_date")
    private final long executionDate;

    @SerializedName("order_type")
    @NotNull
    private final String orderType;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Followers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Followers createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Followers(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Followers[] newArray(int i10) {
            return new Followers[i10];
        }
    }

    public Followers(@NotNull String userId, @NotNull String orderType, @NotNull String displayName, @NotNull String displayImage, long j10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        this.userId = userId;
        this.orderType = orderType;
        this.displayName = displayName;
        this.displayImage = displayImage;
        this.executionDate = j10;
    }

    public static /* synthetic */ Followers copy$default(Followers followers, String str, String str2, String str3, String str4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = followers.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = followers.orderType;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = followers.displayName;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = followers.displayImage;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            j10 = followers.executionDate;
        }
        return followers.copy(str, str5, str6, str7, j10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    public final Followers copy(@NotNull String userId, @NotNull String orderType, @NotNull String displayName, @NotNull String displayImage, long executionDate) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        return new Followers(userId, orderType, displayName, displayImage, executionDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Followers)) {
            return false;
        }
        Followers followers = (Followers) other;
        return Intrinsics.a(this.userId, followers.userId) && Intrinsics.a(this.orderType, followers.orderType) && Intrinsics.a(this.displayName, followers.displayName) && Intrinsics.a(this.displayImage, followers.displayImage) && this.executionDate == followers.executionDate;
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getExecutionDate() {
        return this.executionDate;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.executionDate) + h.g(this.displayImage, h.g(this.displayName, h.g(this.orderType, this.userId.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.orderType;
        String str3 = this.displayName;
        String str4 = this.displayImage;
        long j10 = this.executionDate;
        StringBuilder l10 = e.l("Followers(userId=", str, ", orderType=", str2, ", displayName=");
        e.v(l10, str3, ", displayImage=", str4, ", executionDate=");
        return a.j(l10, j10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.orderType);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayImage);
        parcel.writeLong(this.executionDate);
    }
}
