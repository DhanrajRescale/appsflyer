package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserChatGroup;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "role", "unreadCount", HttpUrl.FRAGMENT_ENCODE_SET, "groupInfo", "Lcom/assetgro/stockgro/data/model/GroupInfo;", "isPinned", HttpUrl.FRAGMENT_ENCODE_SET, "isMuted", "lastMessage", "Lcom/assetgro/stockgro/data/model/ChatMessage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/assetgro/stockgro/data/model/GroupInfo;ZZLcom/assetgro/stockgro/data/model/ChatMessage;)V", "getGroupId", "()Ljava/lang/String;", "getGroupInfo", "()Lcom/assetgro/stockgro/data/model/GroupInfo;", "()Z", "getLastMessage", "()Lcom/assetgro/stockgro/data/model/ChatMessage;", "getRole", "getUnreadCount", "()I", "getUserId", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserChatGroup implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UserChatGroup> CREATOR = new Creator();

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("group_info")
    private final GroupInfo groupInfo;

    @SerializedName("is_muted")
    private final boolean isMuted;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("last_msg")
    private final ChatMessage lastMessage;

    @SerializedName("role")
    @NotNull
    private final String role;

    @SerializedName("unread_count")
    private final int unreadCount;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserChatGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserChatGroup createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserChatGroup(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : GroupInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? ChatMessage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserChatGroup[] newArray(int i10) {
            return new UserChatGroup[i10];
        }
    }

    public UserChatGroup(@NotNull String groupId, @NotNull String userId, @NotNull String role, int i10, GroupInfo groupInfo, boolean z10, boolean z11, ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.groupId = groupId;
        this.userId = userId;
        this.role = role;
        this.unreadCount = i10;
        this.groupInfo = groupInfo;
        this.isPinned = z10;
        this.isMuted = z11;
        this.lastMessage = chatMessage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public final ChatMessage getLastMessage() {
        return this.lastMessage;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.userId);
        parcel.writeString(this.role);
        parcel.writeInt(this.unreadCount);
        GroupInfo groupInfo = this.groupInfo;
        if (groupInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInfo.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isPinned ? 1 : 0);
        parcel.writeInt(this.isMuted ? 1 : 0);
        ChatMessage chatMessage = this.lastMessage;
        if (chatMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMessage.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ UserChatGroup(String str, String str2, String str3, int i10, GroupInfo groupInfo, boolean z10, boolean z11, ChatMessage chatMessage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i10, groupInfo, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? false : z11, chatMessage);
    }
}
