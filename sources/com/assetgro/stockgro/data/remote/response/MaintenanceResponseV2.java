package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponseV2;", "Landroid/os/Parcelable;", "androidMaintenanceConfig", "Lcom/assetgro/stockgro/data/remote/response/Sections;", "(Lcom/assetgro/stockgro/data/remote/response/Sections;)V", "getAndroidMaintenanceConfig", "()Lcom/assetgro/stockgro/data/remote/response/Sections;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MaintenanceResponseV2 implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MaintenanceResponseV2> CREATOR = new Creator();

    @SerializedName(LogSubCategory.LifeCycle.ANDROID)
    private final Sections androidMaintenanceConfig;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MaintenanceResponseV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MaintenanceResponseV2 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaintenanceResponseV2(parcel.readInt() == 0 ? null : Sections.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MaintenanceResponseV2[] newArray(int i10) {
            return new MaintenanceResponseV2[i10];
        }
    }

    public MaintenanceResponseV2(Sections sections) {
        this.androidMaintenanceConfig = sections;
    }

    public static /* synthetic */ MaintenanceResponseV2 copy$default(MaintenanceResponseV2 maintenanceResponseV2, Sections sections, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sections = maintenanceResponseV2.androidMaintenanceConfig;
        }
        return maintenanceResponseV2.copy(sections);
    }

    /* renamed from: component1, reason: from getter */
    public final Sections getAndroidMaintenanceConfig() {
        return this.androidMaintenanceConfig;
    }

    @NotNull
    public final MaintenanceResponseV2 copy(Sections androidMaintenanceConfig) {
        return new MaintenanceResponseV2(androidMaintenanceConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MaintenanceResponseV2) && Intrinsics.a(this.androidMaintenanceConfig, ((MaintenanceResponseV2) other).androidMaintenanceConfig);
    }

    public final Sections getAndroidMaintenanceConfig() {
        return this.androidMaintenanceConfig;
    }

    public int hashCode() {
        Sections sections = this.androidMaintenanceConfig;
        if (sections == null) {
            return 0;
        }
        return sections.hashCode();
    }

    @NotNull
    public String toString() {
        return "MaintenanceResponseV2(androidMaintenanceConfig=" + this.androidMaintenanceConfig + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Sections sections = this.androidMaintenanceConfig;
        if (sections == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sections.writeToParcel(parcel, flags);
        }
    }
}
