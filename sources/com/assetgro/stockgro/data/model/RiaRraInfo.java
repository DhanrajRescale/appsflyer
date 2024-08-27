package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/RiaRraInfo;", "Landroid/os/Parcelable;", "displayImage", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "userName", "userId", "followerCountDisplayText", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayImage", "()Ljava/lang/String;", "getDisplayName", "getFollowerCountDisplayText", "()Z", "getUserId", "getUserName", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RiaRraInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RiaRraInfo> CREATOR = new Creator();

    @SerializedName("avatar")
    private final String displayImage;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("follower_count_display_text")
    private final String followerCountDisplayText;

    @SerializedName("is_ria_rra")
    private final boolean isExpert;

    @SerializedName("uuid")
    private final String userId;

    @SerializedName("username")
    @NotNull
    private final String userName;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<RiaRraInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RiaRraInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiaRraInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RiaRraInfo[] newArray(int i10) {
            return new RiaRraInfo[i10];
        }
    }

    public RiaRraInfo(String str, @NotNull String displayName, @NotNull String userName, String str2, String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.displayImage = str;
        this.displayName = displayName;
        this.userName = userName;
        this.userId = str2;
        this.followerCountDisplayText = str3;
        this.isExpert = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFollowerCountDisplayText() {
        return this.followerCountDisplayText;
    }

    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: isExpert, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.displayImage);
        parcel.writeString(this.displayName);
        parcel.writeString(this.userName);
        parcel.writeString(this.userId);
        parcel.writeString(this.followerCountDisplayText);
        parcel.writeInt(this.isExpert ? 1 : 0);
    }

    public /* synthetic */ RiaRraInfo(String str, String str2, String str3, String str4, String str5, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? false : z10);
    }
}
