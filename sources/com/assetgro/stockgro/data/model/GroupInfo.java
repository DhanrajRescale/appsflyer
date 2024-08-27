package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupInfo;", "Landroid/os/Parcelable;", "groupName", HttpUrl.FRAGMENT_ENCODE_SET, "imageURL", "type", "otherUserName", "otherUserId", "friendUserName", "friendUserId", "friendImageURL", "exitReasons", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/ExitOption;", "subscriptionPackageInfo", "Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;)V", "getExitReasons", "()Ljava/util/List;", "getFriendImageURL", "()Ljava/lang/String;", "getFriendUserId", "getFriendUserName", "getGroupName", "getImageURL", "getOtherUserId", "getOtherUserName", "getSubscriptionPackageInfo", "()Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;", "getType", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GroupInfo> CREATOR = new Creator();

    @SerializedName("exit_reasons")
    private final List<ExitOption> exitReasons;

    @SerializedName("friend_display_picture")
    private final String friendImageURL;

    @SerializedName("friend_id")
    private final String friendUserId;

    @SerializedName("friend_name")
    private final String friendUserName;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String groupName;

    @SerializedName("image_url")
    @NotNull
    private final String imageURL;

    @SerializedName("other_user_id")
    private final String otherUserId;

    @SerializedName("other_user_name")
    private final String otherUserName;

    @SerializedName("package_info")
    @NotNull
    private final SubscriptionPackageInfo subscriptionPackageInfo;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<GroupInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupInfo createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(ExitOption.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupInfo(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, arrayList, SubscriptionPackageInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GroupInfo[] newArray(int i10) {
            return new GroupInfo[i10];
        }
    }

    public GroupInfo(String str, @NotNull String imageURL, String str2, String str3, String str4, String str5, String str6, String str7, List<ExitOption> list, @NotNull SubscriptionPackageInfo subscriptionPackageInfo) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(subscriptionPackageInfo, "subscriptionPackageInfo");
        this.groupName = str;
        this.imageURL = imageURL;
        this.type = str2;
        this.otherUserName = str3;
        this.otherUserId = str4;
        this.friendUserName = str5;
        this.friendUserId = str6;
        this.friendImageURL = str7;
        this.exitReasons = list;
        this.subscriptionPackageInfo = subscriptionPackageInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<ExitOption> getExitReasons() {
        return this.exitReasons;
    }

    public final String getFriendImageURL() {
        return this.friendImageURL;
    }

    public final String getFriendUserId() {
        return this.friendUserId;
    }

    public final String getFriendUserName() {
        return this.friendUserName;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getOtherUserId() {
        return this.otherUserId;
    }

    public final String getOtherUserName() {
        return this.otherUserName;
    }

    @NotNull
    public final SubscriptionPackageInfo getSubscriptionPackageInfo() {
        return this.subscriptionPackageInfo;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupName);
        parcel.writeString(this.imageURL);
        parcel.writeString(this.type);
        parcel.writeString(this.otherUserName);
        parcel.writeString(this.otherUserId);
        parcel.writeString(this.friendUserName);
        parcel.writeString(this.friendUserId);
        parcel.writeString(this.friendImageURL);
        List<ExitOption> list = this.exitReasons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((ExitOption) o10.next()).writeToParcel(parcel, flags);
            }
        }
        this.subscriptionPackageInfo.writeToParcel(parcel, flags);
    }
}
