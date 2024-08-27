package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserConfig;", "Landroid/os/Parcelable;", "auth", "Lcom/assetgro/stockgro/data/model/UserAuth;", "charLimits", "Lcom/assetgro/stockgro/data/model/CharLimit;", "(Lcom/assetgro/stockgro/data/model/UserAuth;Lcom/assetgro/stockgro/data/model/CharLimit;)V", "getAuth", "()Lcom/assetgro/stockgro/data/model/UserAuth;", "getCharLimits", "()Lcom/assetgro/stockgro/data/model/CharLimit;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfig implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UserConfig> CREATOR = new Creator();

    @SerializedName("auth")
    private final UserAuth auth;

    @SerializedName("group_limits")
    private final CharLimit charLimits;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserConfig(parcel.readInt() == 0 ? null : UserAuth.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CharLimit.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserConfig[] newArray(int i10) {
            return new UserConfig[i10];
        }
    }

    public UserConfig(UserAuth userAuth, CharLimit charLimit) {
        this.auth = userAuth;
        this.charLimits = charLimit;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final UserAuth getAuth() {
        return this.auth;
    }

    public final CharLimit getCharLimits() {
        return this.charLimits;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        UserAuth userAuth = this.auth;
        if (userAuth == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userAuth.writeToParcel(parcel, flags);
        }
        CharLimit charLimit = this.charLimits;
        if (charLimit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            charLimit.writeToParcel(parcel, flags);
        }
    }
}
