package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u000f\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/data/model/SocialChatGroup;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "groupName", "imageUrl", "coverImageUrl", "groupDescription", "paymentModel", "createdBy", "categoryId", "mode", "type", "membershipStatus", "Lcom/assetgro/stockgro/data/model/MembershipStatus;", "isOpenForAudience", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/MembershipStatus;Ljava/lang/Boolean;)V", "getCategoryId", "()Ljava/lang/String;", "getCoverImageUrl", "getCreatedBy", "getGroupDescription", "getGroupId", "getGroupName", "getImageUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMembershipStatus", "()Lcom/assetgro/stockgro/data/model/MembershipStatus;", "getMode", "getPaymentModel", "getType", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialChatGroup implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SocialChatGroup> CREATOR = new Creator();

    @SerializedName("category_id")
    private final String categoryId;

    @SerializedName("cover_image_url")
    private final String coverImageUrl;

    @SerializedName("created_by")
    private final String createdBy;

    @SerializedName("description")
    private final String groupDescription;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String groupName;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("is_open_for_audience")
    private final Boolean isOpenForAudience;

    @SerializedName("membership_status")
    private final MembershipStatus membershipStatus;

    @SerializedName("mode")
    private final String mode;

    @SerializedName("payment_model")
    private final String paymentModel;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SocialChatGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialChatGroup createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            MembershipStatus createFromParcel = parcel.readInt() == 0 ? null : MembershipStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SocialChatGroup(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, createFromParcel, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialChatGroup[] newArray(int i10) {
            return new SocialChatGroup[i10];
        }
    }

    public SocialChatGroup(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, MembershipStatus membershipStatus, Boolean bool) {
        this.groupId = str;
        this.groupName = str2;
        this.imageUrl = str3;
        this.coverImageUrl = str4;
        this.groupDescription = str5;
        this.paymentModel = str6;
        this.createdBy = str7;
        this.categoryId = str8;
        this.mode = str9;
        this.type = str10;
        this.membershipStatus = membershipStatus;
        this.isOpenForAudience = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getPaymentModel() {
        return this.paymentModel;
    }

    public final String getType() {
        return this.type;
    }

    /* renamed from: isOpenForAudience, reason: from getter */
    public final Boolean getIsOpenForAudience() {
        return this.isOpenForAudience;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.coverImageUrl);
        parcel.writeString(this.groupDescription);
        parcel.writeString(this.paymentModel);
        parcel.writeString(this.createdBy);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.mode);
        parcel.writeString(this.type);
        MembershipStatus membershipStatus = this.membershipStatus;
        if (membershipStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            membershipStatus.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isOpenForAudience;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
    }
}
