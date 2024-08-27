package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SubscriptionFeatureFlag;", "Landroid/os/Parcelable;", "is_enabled", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "description", "(ZLjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "()Z", "getTitle", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionFeatureFlag implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SubscriptionFeatureFlag> CREATOR = new Creator();

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("is_enabled")
    private final boolean is_enabled;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubscriptionFeatureFlag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionFeatureFlag createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionFeatureFlag(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubscriptionFeatureFlag[] newArray(int i10) {
            return new SubscriptionFeatureFlag[i10];
        }
    }

    public SubscriptionFeatureFlag(boolean z10, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.is_enabled = z10;
        this.title = title;
        this.description = description;
    }

    public static /* synthetic */ SubscriptionFeatureFlag copy$default(SubscriptionFeatureFlag subscriptionFeatureFlag, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = subscriptionFeatureFlag.is_enabled;
        }
        if ((i10 & 2) != 0) {
            str = subscriptionFeatureFlag.title;
        }
        if ((i10 & 4) != 0) {
            str2 = subscriptionFeatureFlag.description;
        }
        return subscriptionFeatureFlag.copy(z10, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final SubscriptionFeatureFlag copy(boolean is_enabled, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new SubscriptionFeatureFlag(is_enabled, title, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionFeatureFlag)) {
            return false;
        }
        SubscriptionFeatureFlag subscriptionFeatureFlag = (SubscriptionFeatureFlag) other;
        return this.is_enabled == subscriptionFeatureFlag.is_enabled && Intrinsics.a(this.title, subscriptionFeatureFlag.title) && Intrinsics.a(this.description, subscriptionFeatureFlag.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + h.g(this.title, Boolean.hashCode(this.is_enabled) * 31, 31);
    }

    public final boolean is_enabled() {
        return this.is_enabled;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.is_enabled;
        String str = this.title;
        String str2 = this.description;
        StringBuilder sb2 = new StringBuilder("SubscriptionFeatureFlag(is_enabled=");
        sb2.append(z10);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", description=");
        return d.o(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.is_enabled ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
