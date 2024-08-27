package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/IntroModel;", "Landroid/os/Parcelable;", "image", HttpUrl.FRAGMENT_ENCODE_SET, "text", HttpUrl.FRAGMENT_ENCODE_SET, "subtext", "(ILjava/lang/String;Ljava/lang/String;)V", "getImage", "()I", "getSubtext", "()Ljava/lang/String;", "getText", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntroModel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<IntroModel> CREATOR = new Creator();
    private final int image;

    @NotNull
    private final String subtext;

    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<IntroModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IntroModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntroModel(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IntroModel[] newArray(int i10) {
            return new IntroModel[i10];
        }
    }

    public IntroModel(int i10, @NotNull String text, @NotNull String subtext) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(subtext, "subtext");
        this.image = i10;
        this.text = text;
        this.subtext = subtext;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getImage() {
        return this.image;
    }

    @NotNull
    public final String getSubtext() {
        return this.subtext;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.image);
        parcel.writeString(this.text);
        parcel.writeString(this.subtext);
    }
}
