package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/MessageInteractionRequestDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "messageId", "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "()Z", "getMessageId", "getUserId", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MessageInteractionRequestDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MessageInteractionRequestDto> CREATOR = new Creator();

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("is_liked")
    private final boolean isLiked;

    @SerializedName("message_id")
    private final String messageId;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MessageInteractionRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageInteractionRequestDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageInteractionRequestDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MessageInteractionRequestDto[] newArray(int i10) {
            return new MessageInteractionRequestDto[i10];
        }
    }

    public MessageInteractionRequestDto(String str, String str2, boolean z10, String str3) {
        this.userId = str;
        this.messageId = str2;
        this.isLiked = z10;
        this.groupId = str3;
    }

    public static /* synthetic */ MessageInteractionRequestDto copy$default(MessageInteractionRequestDto messageInteractionRequestDto, String str, String str2, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messageInteractionRequestDto.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = messageInteractionRequestDto.messageId;
        }
        if ((i10 & 4) != 0) {
            z10 = messageInteractionRequestDto.isLiked;
        }
        if ((i10 & 8) != 0) {
            str3 = messageInteractionRequestDto.groupId;
        }
        return messageInteractionRequestDto.copy(str, str2, z10, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final MessageInteractionRequestDto copy(String userId, String messageId, boolean isLiked, String groupId) {
        return new MessageInteractionRequestDto(userId, messageId, isLiked, groupId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInteractionRequestDto)) {
            return false;
        }
        MessageInteractionRequestDto messageInteractionRequestDto = (MessageInteractionRequestDto) other;
        return Intrinsics.a(this.userId, messageInteractionRequestDto.userId) && Intrinsics.a(this.messageId, messageInteractionRequestDto.messageId) && this.isLiked == messageInteractionRequestDto.isLiked && Intrinsics.a(this.groupId, messageInteractionRequestDto.groupId);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.userId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.messageId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int d10 = e.d(this.isLiked, (i11 + hashCode2) * 31, 31);
        String str3 = this.groupId;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return d10 + i10;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.messageId;
        boolean z10 = this.isLiked;
        String str3 = this.groupId;
        StringBuilder l10 = e.l("MessageInteractionRequestDto(userId=", str, ", messageId=", str2, ", isLiked=");
        l10.append(z10);
        l10.append(", groupId=");
        l10.append(str3);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.messageId);
        parcel.writeInt(this.isLiked ? 1 : 0);
        parcel.writeString(this.groupId);
    }
}
