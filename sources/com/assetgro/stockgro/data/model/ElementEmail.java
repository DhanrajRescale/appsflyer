package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/model/ElementEmail;", "Landroid/os/Parcelable;", "elementHandle", "Lcom/assetgro/stockgro/data/model/Handle;", "handle", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/data/model/Handle;Ljava/lang/String;)V", "getElementHandle", "()Lcom/assetgro/stockgro/data/model/Handle;", "getHandle", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ElementEmail implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ElementEmail> CREATOR = new Creator();

    @SerializedName("handle~")
    @NotNull
    private final Handle elementHandle;

    @SerializedName("handle")
    @NotNull
    private final String handle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ElementEmail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ElementEmail createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ElementEmail(Handle.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ElementEmail[] newArray(int i10) {
            return new ElementEmail[i10];
        }
    }

    public ElementEmail(@NotNull Handle elementHandle, @NotNull String handle) {
        Intrinsics.checkNotNullParameter(elementHandle, "elementHandle");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.elementHandle = elementHandle;
        this.handle = handle;
    }

    public static /* synthetic */ ElementEmail copy$default(ElementEmail elementEmail, Handle handle, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handle = elementEmail.elementHandle;
        }
        if ((i10 & 2) != 0) {
            str = elementEmail.handle;
        }
        return elementEmail.copy(handle, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Handle getElementHandle() {
        return this.elementHandle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHandle() {
        return this.handle;
    }

    @NotNull
    public final ElementEmail copy(@NotNull Handle elementHandle, @NotNull String handle) {
        Intrinsics.checkNotNullParameter(elementHandle, "elementHandle");
        Intrinsics.checkNotNullParameter(handle, "handle");
        return new ElementEmail(elementHandle, handle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementEmail)) {
            return false;
        }
        ElementEmail elementEmail = (ElementEmail) other;
        return Intrinsics.a(this.elementHandle, elementEmail.elementHandle) && Intrinsics.a(this.handle, elementEmail.handle);
    }

    @NotNull
    public final Handle getElementHandle() {
        return this.elementHandle;
    }

    @NotNull
    public final String getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return this.handle.hashCode() + (this.elementHandle.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ElementEmail(elementHandle=" + this.elementHandle + ", handle=" + this.handle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.elementHandle.writeToParcel(parcel, flags);
        parcel.writeString(this.handle);
    }
}
