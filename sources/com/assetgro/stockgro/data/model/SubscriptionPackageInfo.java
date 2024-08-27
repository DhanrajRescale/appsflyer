package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;", "Landroid/os/Parcelable;", "accessPackageLevel", HttpUrl.FRAGMENT_ENCODE_SET, "accessPackageName", HttpUrl.FRAGMENT_ENCODE_SET, "message", "(ILjava/lang/String;Ljava/lang/String;)V", "getAccessPackageLevel", "()I", "getAccessPackageName", "()Ljava/lang/String;", "getMessage", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriptionPackageInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SubscriptionPackageInfo> CREATOR = new Creator();

    @SerializedName("access_package_level")
    private final int accessPackageLevel;

    @SerializedName("access_package_name")
    @NotNull
    private final String accessPackageName;

    @SerializedName("message")
    @NotNull
    private final String message;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionPackageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPackageInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionPackageInfo(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionPackageInfo[] newArray(int i10) {
            return new SubscriptionPackageInfo[i10];
        }
    }

    public SubscriptionPackageInfo(int i10, @NotNull String accessPackageName, @NotNull String message) {
        Intrinsics.checkNotNullParameter(accessPackageName, "accessPackageName");
        Intrinsics.checkNotNullParameter(message, "message");
        this.accessPackageLevel = i10;
        this.accessPackageName = accessPackageName;
        this.message = message;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAccessPackageLevel() {
        return this.accessPackageLevel;
    }

    @NotNull
    public final String getAccessPackageName() {
        return this.accessPackageName;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.accessPackageLevel);
        parcel.writeString(this.accessPackageName);
        parcel.writeString(this.message);
    }
}
