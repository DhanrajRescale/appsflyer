package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/PrivateChatGroup;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "groupName", "imageURL", "coverImageURL", "createdAt", HttpUrl.FRAGMENT_ENCODE_SET, "createdBy", "memberIds", HttpUrl.FRAGMENT_ENCODE_SET, "groupDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCoverImageURL", "()Ljava/lang/String;", "getCreatedAt", "()J", "getCreatedBy", "getGroupDescription", "getGroupId", "getGroupName", "getImageURL", "getMemberIds", "()Ljava/util/List;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrivateChatGroup implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PrivateChatGroup> CREATOR = new Creator();

    @SerializedName("cover_image_url")
    private final String coverImageURL;

    @SerializedName("created_at_micros")
    private final long createdAt;

    @SerializedName("created_by")
    private final String createdBy;

    @SerializedName("description")
    private final String groupDescription;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String groupName;

    @SerializedName("image_url")
    private final String imageURL;

    @SerializedName("member_ids")
    private final List<String> memberIds;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PrivateChatGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrivateChatGroup createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrivateChatGroup(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrivateChatGroup[] newArray(int i10) {
            return new PrivateChatGroup[i10];
        }
    }

    public PrivateChatGroup(String str, String str2, String str3, String str4, long j10, String str5, List<String> list, String str6) {
        this.groupId = str;
        this.groupName = str2;
        this.imageURL = str3;
        this.coverImageURL = str4;
        this.createdAt = j10;
        this.createdBy = str5;
        this.memberIds = list;
        this.groupDescription = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCoverImageURL() {
        return this.coverImageURL;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getGroupDescription() {
        return this.groupDescription;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final List<String> getMemberIds() {
        return this.memberIds;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeString(this.imageURL);
        parcel.writeString(this.coverImageURL);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.createdBy);
        parcel.writeStringList(this.memberIds);
        parcel.writeString(this.groupDescription);
    }
}
