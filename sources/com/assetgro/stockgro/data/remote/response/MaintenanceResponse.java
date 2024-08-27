package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponse;", "Landroid/os/Parcelable;", "isMaintenanceWindowOn", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "isChatMaintenanceWindowOn", "(ZLjava/lang/String;Z)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MaintenanceResponse implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MaintenanceResponse> CREATOR = new Creator();

    @SerializedName("isChatMaintenanceWindowOnForAndroid")
    private final boolean isChatMaintenanceWindowOn;

    @SerializedName("isMaintenanceWindowOn")
    private final boolean isMaintenanceWindowOn;

    @SerializedName("message")
    @NotNull
    private final String message;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MaintenanceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MaintenanceResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaintenanceResponse(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MaintenanceResponse[] newArray(int i10) {
            return new MaintenanceResponse[i10];
        }
    }

    public MaintenanceResponse(boolean z10, @NotNull String message, boolean z11) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.isMaintenanceWindowOn = z10;
        this.message = message;
        this.isChatMaintenanceWindowOn = z11;
    }

    public static /* synthetic */ MaintenanceResponse copy$default(MaintenanceResponse maintenanceResponse, boolean z10, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = maintenanceResponse.isMaintenanceWindowOn;
        }
        if ((i10 & 2) != 0) {
            str = maintenanceResponse.message;
        }
        if ((i10 & 4) != 0) {
            z11 = maintenanceResponse.isChatMaintenanceWindowOn;
        }
        return maintenanceResponse.copy(z10, str, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMaintenanceWindowOn() {
        return this.isMaintenanceWindowOn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChatMaintenanceWindowOn() {
        return this.isChatMaintenanceWindowOn;
    }

    @NotNull
    public final MaintenanceResponse copy(boolean isMaintenanceWindowOn, @NotNull String message, boolean isChatMaintenanceWindowOn) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new MaintenanceResponse(isMaintenanceWindowOn, message, isChatMaintenanceWindowOn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaintenanceResponse)) {
            return false;
        }
        MaintenanceResponse maintenanceResponse = (MaintenanceResponse) other;
        return this.isMaintenanceWindowOn == maintenanceResponse.isMaintenanceWindowOn && Intrinsics.a(this.message, maintenanceResponse.message) && this.isChatMaintenanceWindowOn == maintenanceResponse.isChatMaintenanceWindowOn;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChatMaintenanceWindowOn) + h.g(this.message, Boolean.hashCode(this.isMaintenanceWindowOn) * 31, 31);
    }

    public final boolean isChatMaintenanceWindowOn() {
        return this.isChatMaintenanceWindowOn;
    }

    public final boolean isMaintenanceWindowOn() {
        return this.isMaintenanceWindowOn;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.isMaintenanceWindowOn;
        String str = this.message;
        boolean z11 = this.isChatMaintenanceWindowOn;
        StringBuilder sb2 = new StringBuilder("MaintenanceResponse(isMaintenanceWindowOn=");
        sb2.append(z10);
        sb2.append(", message=");
        sb2.append(str);
        sb2.append(", isChatMaintenanceWindowOn=");
        return e.o(sb2, z11, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isMaintenanceWindowOn ? 1 : 0);
        parcel.writeString(this.message);
        parcel.writeInt(this.isChatMaintenanceWindowOn ? 1 : 0);
    }
}
