package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "Landroid/os/Parcelable;", "featureTitle", HttpUrl.FRAGMENT_ENCODE_SET, "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Z)V", "getEnabled", "()Z", "getFeatureTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionFeature implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SubscriptionFeature> CREATOR = new Creator();

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("feature_title")
    @NotNull
    private final String featureTitle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionFeature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionFeature createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionFeature(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionFeature[] newArray(int i10) {
            return new SubscriptionFeature[i10];
        }
    }

    public SubscriptionFeature(@NotNull String featureTitle, boolean z10) {
        Intrinsics.checkNotNullParameter(featureTitle, "featureTitle");
        this.featureTitle = featureTitle;
        this.enabled = z10;
    }

    public static /* synthetic */ SubscriptionFeature copy$default(SubscriptionFeature subscriptionFeature, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionFeature.featureTitle;
        }
        if ((i10 & 2) != 0) {
            z10 = subscriptionFeature.enabled;
        }
        return subscriptionFeature.copy(str, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFeatureTitle() {
        return this.featureTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final SubscriptionFeature copy(@NotNull String featureTitle, boolean enabled) {
        Intrinsics.checkNotNullParameter(featureTitle, "featureTitle");
        return new SubscriptionFeature(featureTitle, enabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionFeature)) {
            return false;
        }
        SubscriptionFeature subscriptionFeature = (SubscriptionFeature) other;
        return Intrinsics.a(this.featureTitle, subscriptionFeature.featureTitle) && this.enabled == subscriptionFeature.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getFeatureTitle() {
        return this.featureTitle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.featureTitle.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SubscriptionFeature(featureTitle=" + this.featureTitle + ", enabled=" + this.enabled + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.featureTitle);
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
