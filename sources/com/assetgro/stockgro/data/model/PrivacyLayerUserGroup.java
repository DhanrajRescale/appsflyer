package com.assetgro.stockgro.data.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003J\t\u0010/\u001a\u00020\u0015HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¡\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0013HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006="}, d2 = {"Lcom/assetgro/stockgro/data/model/PrivacyLayerUserGroup;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "groupKey", AppMeasurementSdk.ConditionalUserProperty.NAME, "status", "isPinned", HttpUrl.FRAGMENT_ENCODE_SET, "type", "imageUrl", "friendName", "friendDisplayPicture", "packageInfo", "Lcom/assetgro/stockgro/data/model/PackageInfo;", "lastMsg", "Lcom/assetgro/stockgro/data/model/LastMessage;", "unreadCount", HttpUrl.FRAGMENT_ENCODE_SET, "createdAtMicros", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/PackageInfo;Lcom/assetgro/stockgro/data/model/LastMessage;IJ)V", "getCreatedAtMicros", "()J", "getFriendDisplayPicture", "()Ljava/lang/String;", "getFriendName", "getGroupId", "getGroupKey", "getImageUrl", "()Z", "getLastMsg", "()Lcom/assetgro/stockgro/data/model/LastMessage;", "getName", "getPackageInfo", "()Lcom/assetgro/stockgro/data/model/PackageInfo;", "getStatus", "getType", "getUnreadCount", "()I", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PrivacyLayerUserGroup {
    public static final int $stable = 8;

    @SerializedName("created_at_micros")
    private final long createdAtMicros;

    @SerializedName("friend_display_picture")
    private final String friendDisplayPicture;

    @SerializedName("friend_name")
    private final String friendName;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("group_key")
    private final String groupKey;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("last_msg")
    private final LastMessage lastMsg;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("package_info")
    @NotNull
    private final PackageInfo packageInfo;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("unread_count")
    private final int unreadCount;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    public PrivacyLayerUserGroup(@NotNull String userId, @NotNull String groupId, String str, String str2, @NotNull String status, boolean z10, @NotNull String type, String str3, String str4, String str5, @NotNull PackageInfo packageInfo, LastMessage lastMessage, int i10, long j10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        this.userId = userId;
        this.groupId = groupId;
        this.groupKey = str;
        this.name = str2;
        this.status = status;
        this.isPinned = z10;
        this.type = type;
        this.imageUrl = str3;
        this.friendName = str4;
        this.friendDisplayPicture = str5;
        this.packageInfo = packageInfo;
        this.lastMsg = lastMessage;
        this.unreadCount = i10;
        this.createdAtMicros = j10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFriendDisplayPicture() {
        return this.friendDisplayPicture;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final LastMessage getLastMsg() {
        return this.lastMsg;
    }

    /* renamed from: component13, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component14, reason: from getter */
    public final long getCreatedAtMicros() {
        return this.createdAtMicros;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFriendName() {
        return this.friendName;
    }

    @NotNull
    public final PrivacyLayerUserGroup copy(@NotNull String userId, @NotNull String groupId, String groupKey, String name, @NotNull String status, boolean isPinned, @NotNull String type, String imageUrl, String friendName, String friendDisplayPicture, @NotNull PackageInfo packageInfo, LastMessage lastMsg, int unreadCount, long createdAtMicros) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        return new PrivacyLayerUserGroup(userId, groupId, groupKey, name, status, isPinned, type, imageUrl, friendName, friendDisplayPicture, packageInfo, lastMsg, unreadCount, createdAtMicros);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyLayerUserGroup)) {
            return false;
        }
        PrivacyLayerUserGroup privacyLayerUserGroup = (PrivacyLayerUserGroup) other;
        return Intrinsics.a(this.userId, privacyLayerUserGroup.userId) && Intrinsics.a(this.groupId, privacyLayerUserGroup.groupId) && Intrinsics.a(this.groupKey, privacyLayerUserGroup.groupKey) && Intrinsics.a(this.name, privacyLayerUserGroup.name) && Intrinsics.a(this.status, privacyLayerUserGroup.status) && this.isPinned == privacyLayerUserGroup.isPinned && Intrinsics.a(this.type, privacyLayerUserGroup.type) && Intrinsics.a(this.imageUrl, privacyLayerUserGroup.imageUrl) && Intrinsics.a(this.friendName, privacyLayerUserGroup.friendName) && Intrinsics.a(this.friendDisplayPicture, privacyLayerUserGroup.friendDisplayPicture) && Intrinsics.a(this.packageInfo, privacyLayerUserGroup.packageInfo) && Intrinsics.a(this.lastMsg, privacyLayerUserGroup.lastMsg) && this.unreadCount == privacyLayerUserGroup.unreadCount && this.createdAtMicros == privacyLayerUserGroup.createdAtMicros;
    }

    public final long getCreatedAtMicros() {
        return this.createdAtMicros;
    }

    public final String getFriendDisplayPicture() {
        return this.friendDisplayPicture;
    }

    public final String getFriendName() {
        return this.friendName;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final LastMessage getLastMsg() {
        return this.lastMsg;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int g10 = h.g(this.groupId, this.userId.hashCode() * 31, 31);
        String str = this.groupKey;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int g11 = h.g(this.type, e.d(this.isPinned, h.g(this.status, (i11 + hashCode2) * 31, 31), 31), 31);
        String str3 = this.imageUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (g11 + hashCode3) * 31;
        String str4 = this.friendName;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.friendDisplayPicture;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode6 = (this.packageInfo.hashCode() + ((i13 + hashCode5) * 31)) * 31;
        LastMessage lastMessage = this.lastMsg;
        if (lastMessage != null) {
            i10 = lastMessage.hashCode();
        }
        return Long.hashCode(this.createdAtMicros) + da.e.f(this.unreadCount, (hashCode6 + i10) * 31, 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.groupId;
        String str3 = this.groupKey;
        String str4 = this.name;
        String str5 = this.status;
        boolean z10 = this.isPinned;
        String str6 = this.type;
        String str7 = this.imageUrl;
        String str8 = this.friendName;
        String str9 = this.friendDisplayPicture;
        PackageInfo packageInfo = this.packageInfo;
        LastMessage lastMessage = this.lastMsg;
        int i10 = this.unreadCount;
        long j10 = this.createdAtMicros;
        StringBuilder l10 = e.l("PrivacyLayerUserGroup(userId=", str, ", groupId=", str2, ", groupKey=");
        e.v(l10, str3, ", name=", str4, ", status=");
        l10.append(str5);
        l10.append(", isPinned=");
        l10.append(z10);
        l10.append(", type=");
        e.v(l10, str6, ", imageUrl=", str7, ", friendName=");
        e.v(l10, str8, ", friendDisplayPicture=", str9, ", packageInfo=");
        l10.append(packageInfo);
        l10.append(", lastMsg=");
        l10.append(lastMessage);
        l10.append(", unreadCount=");
        l10.append(i10);
        l10.append(", createdAtMicros=");
        l10.append(j10);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ PrivacyLayerUserGroup(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, String str8, String str9, PackageInfo packageInfo, LastMessage lastMessage, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, z10, str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, packageInfo, (i11 & 2048) != 0 ? null : lastMessage, (i11 & 4096) != 0 ? 0 : i10, j10);
    }
}
