package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vl.b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/Media;", "Landroid/os/Parcelable;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "type", "file_name", "sticker", "Lcom/assetgro/stockgro/data/model/Sticker;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/Sticker;)V", "getFile_name", "()Ljava/lang/String;", "getSticker", "()Lcom/assetgro/stockgro/data/model/Sticker;", "getType", "getUrl", "setUrl", "(Ljava/lang/String;)V", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Media implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Media> CREATOR = new Creator();

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String file_name;

    @SerializedName("sticker")
    private final Sticker sticker;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private String url;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Media> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Media createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Media(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Sticker.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Media[] newArray(int i10) {
            return new Media[i10];
        }
    }

    public Media(String str, String str2, String str3, Sticker sticker) {
        this.url = str;
        this.type = str2;
        this.file_name = str3;
        this.sticker = sticker;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.type);
        parcel.writeString(this.file_name);
        Sticker sticker = this.sticker;
        if (sticker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sticker.writeToParcel(parcel, flags);
        }
    }

    public Media(String str, String str2, String str3, Sticker sticker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? b.f38176f : str3, (i10 & 8) != 0 ? null : sticker);
    }
}
