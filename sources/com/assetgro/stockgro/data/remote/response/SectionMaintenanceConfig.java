package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SectionMaintenanceConfig;", "Landroid/os/Parcelable;", "isMaintenanceOn", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/assetgro/stockgro/data/remote/response/SectionMaintenanceConfig;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SectionMaintenanceConfig implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SectionMaintenanceConfig> CREATOR = new Creator();

    @SerializedName("maintenance_on")
    private final Boolean isMaintenanceOn;

    @SerializedName("message")
    private final String message;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SectionMaintenanceConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SectionMaintenanceConfig createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SectionMaintenanceConfig(valueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SectionMaintenanceConfig[] newArray(int i10) {
            return new SectionMaintenanceConfig[i10];
        }
    }

    public SectionMaintenanceConfig(Boolean bool, String str) {
        this.isMaintenanceOn = bool;
        this.message = str;
    }

    public static /* synthetic */ SectionMaintenanceConfig copy$default(SectionMaintenanceConfig sectionMaintenanceConfig, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sectionMaintenanceConfig.isMaintenanceOn;
        }
        if ((i10 & 2) != 0) {
            str = sectionMaintenanceConfig.message;
        }
        return sectionMaintenanceConfig.copy(bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsMaintenanceOn() {
        return this.isMaintenanceOn;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final SectionMaintenanceConfig copy(Boolean isMaintenanceOn, String message) {
        return new SectionMaintenanceConfig(isMaintenanceOn, message);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionMaintenanceConfig)) {
            return false;
        }
        SectionMaintenanceConfig sectionMaintenanceConfig = (SectionMaintenanceConfig) other;
        return Intrinsics.a(this.isMaintenanceOn, sectionMaintenanceConfig.isMaintenanceOn) && Intrinsics.a(this.message, sectionMaintenanceConfig.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Boolean bool = this.isMaintenanceOn;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isMaintenanceOn() {
        return this.isMaintenanceOn;
    }

    @NotNull
    public String toString() {
        return "SectionMaintenanceConfig(isMaintenanceOn=" + this.isMaintenanceOn + ", message=" + this.message + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.isMaintenanceOn;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        parcel.writeString(this.message);
    }
}
