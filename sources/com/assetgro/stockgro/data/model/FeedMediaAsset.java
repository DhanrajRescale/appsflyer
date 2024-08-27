package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/FeedMediaAsset;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "type", "url", "imageId", "workerId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getImageId", "()Ljava/lang/String;", "getName", "getType", "getUrl", "setUrl", "(Ljava/lang/String;)V", "getWorkerId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedMediaAsset implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FeedMediaAsset> CREATOR = new Creator();

    @SerializedName("image_id")
    @NotNull
    private final String imageId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private String url;

    @SerializedName("worker_id")
    @NotNull
    private final UUID workerId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FeedMediaAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedMediaAsset createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedMediaAsset(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedMediaAsset[] newArray(int i10) {
            return new FeedMediaAsset[i10];
        }
    }

    public FeedMediaAsset(@NotNull String name, String str, String str2, @NotNull String imageId, @NotNull UUID workerId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(workerId, "workerId");
        this.name = name;
        this.type = str;
        this.url = str2;
        this.imageId = imageId;
        this.workerId = workerId;
    }

    public static /* synthetic */ FeedMediaAsset copy$default(FeedMediaAsset feedMediaAsset, String str, String str2, String str3, String str4, UUID uuid, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedMediaAsset.name;
        }
        if ((i10 & 2) != 0) {
            str2 = feedMediaAsset.type;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = feedMediaAsset.url;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = feedMediaAsset.imageId;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            uuid = feedMediaAsset.workerId;
        }
        return feedMediaAsset.copy(str, str5, str6, str7, uuid);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final UUID getWorkerId() {
        return this.workerId;
    }

    @NotNull
    public final FeedMediaAsset copy(@NotNull String name, String type, String url, @NotNull String imageId, @NotNull UUID workerId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(workerId, "workerId");
        return new FeedMediaAsset(name, type, url, imageId, workerId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedMediaAsset)) {
            return false;
        }
        FeedMediaAsset feedMediaAsset = (FeedMediaAsset) other;
        return Intrinsics.a(this.name, feedMediaAsset.name) && Intrinsics.a(this.type, feedMediaAsset.type) && Intrinsics.a(this.url, feedMediaAsset.url) && Intrinsics.a(this.imageId, feedMediaAsset.imageId) && Intrinsics.a(this.workerId, feedMediaAsset.workerId);
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final UUID getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        String str = this.type;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.workerId.hashCode() + h.g(this.imageId, (i11 + i10) * 31, 31);
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.type;
        String str3 = this.url;
        String str4 = this.imageId;
        UUID uuid = this.workerId;
        StringBuilder l10 = e.l("FeedMediaAsset(name=", str, ", type=", str2, ", url=");
        e.v(l10, str3, ", imageId=", str4, ", workerId=");
        l10.append(uuid);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        parcel.writeString(this.imageId);
        parcel.writeSerializable(this.workerId);
    }
}
