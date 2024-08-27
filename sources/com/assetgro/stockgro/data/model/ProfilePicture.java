package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/model/ProfilePicture;", "Landroid/os/Parcelable;", "displayImage", "Lcom/assetgro/stockgro/data/model/DisplayImage;", "(Lcom/assetgro/stockgro/data/model/DisplayImage;)V", "getDisplayImage", "()Lcom/assetgro/stockgro/data/model/DisplayImage;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ProfilePicture implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProfilePicture> CREATOR = new Creator();

    @SerializedName("displayImage~")
    @NotNull
    private final DisplayImage displayImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ProfilePicture> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfilePicture createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfilePicture(DisplayImage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProfilePicture[] newArray(int i10) {
            return new ProfilePicture[i10];
        }
    }

    public ProfilePicture(@NotNull DisplayImage displayImage) {
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        this.displayImage = displayImage;
    }

    public static /* synthetic */ ProfilePicture copy$default(ProfilePicture profilePicture, DisplayImage displayImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            displayImage = profilePicture.displayImage;
        }
        return profilePicture.copy(displayImage);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisplayImage getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final ProfilePicture copy(@NotNull DisplayImage displayImage) {
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        return new ProfilePicture(displayImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfilePicture) && Intrinsics.a(this.displayImage, ((ProfilePicture) other).displayImage);
    }

    @NotNull
    public final DisplayImage getDisplayImage() {
        return this.displayImage;
    }

    public int hashCode() {
        return this.displayImage.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProfilePicture(displayImage=" + this.displayImage + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.displayImage.writeToParcel(parcel, flags);
    }
}
