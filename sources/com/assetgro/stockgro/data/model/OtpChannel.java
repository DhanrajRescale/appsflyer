package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/OtpChannel;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "imageUrl", "otpRetryTimer", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDisplayName", "()Ljava/lang/String;", "getImageUrl", "getName", "getOtpRetryTimer", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OtpChannel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OtpChannel> CREATOR = new Creator();

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("otp_retry_timer")
    private final int otpRetryTimer;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OtpChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OtpChannel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtpChannel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OtpChannel[] newArray(int i10) {
            return new OtpChannel[i10];
        }
    }

    public OtpChannel(@NotNull String name, @NotNull String displayName, @NotNull String imageUrl, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.name = name;
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.otpRetryTimer = i10;
    }

    public static /* synthetic */ OtpChannel copy$default(OtpChannel otpChannel, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otpChannel.name;
        }
        if ((i11 & 2) != 0) {
            str2 = otpChannel.displayName;
        }
        if ((i11 & 4) != 0) {
            str3 = otpChannel.imageUrl;
        }
        if ((i11 & 8) != 0) {
            i10 = otpChannel.otpRetryTimer;
        }
        return otpChannel.copy(str, str2, str3, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOtpRetryTimer() {
        return this.otpRetryTimer;
    }

    @NotNull
    public final OtpChannel copy(@NotNull String name, @NotNull String displayName, @NotNull String imageUrl, int otpRetryTimer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new OtpChannel(name, displayName, imageUrl, otpRetryTimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpChannel)) {
            return false;
        }
        OtpChannel otpChannel = (OtpChannel) other;
        return Intrinsics.a(this.name, otpChannel.name) && Intrinsics.a(this.displayName, otpChannel.displayName) && Intrinsics.a(this.imageUrl, otpChannel.imageUrl) && this.otpRetryTimer == otpChannel.otpRetryTimer;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getOtpRetryTimer() {
        return this.otpRetryTimer;
    }

    public int hashCode() {
        return Integer.hashCode(this.otpRetryTimer) + h.g(this.imageUrl, h.g(this.displayName, this.name.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.displayName;
        String str3 = this.imageUrl;
        int i10 = this.otpRetryTimer;
        StringBuilder l10 = e.l("OtpChannel(name=", str, ", displayName=", str2, ", imageUrl=");
        l10.append(str3);
        l10.append(", otpRetryTimer=");
        l10.append(i10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.displayName);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.otpRetryTimer);
    }
}
