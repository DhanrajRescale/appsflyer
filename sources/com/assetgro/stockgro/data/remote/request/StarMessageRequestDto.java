package com.assetgro.stockgro.data.remote.request;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/StarMessageRequestDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "messageId", "isStarred", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getGroupId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessageId", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/data/remote/request/StarMessageRequestDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StarMessageRequestDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<StarMessageRequestDto> CREATOR = new Creator();

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("is_pinned")
    private final Boolean isStarred;

    @SerializedName("message_id")
    private final String messageId;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StarMessageRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StarMessageRequestDto createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StarMessageRequestDto(readString, readString2, readString3, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StarMessageRequestDto[] newArray(int i10) {
            return new StarMessageRequestDto[i10];
        }
    }

    public StarMessageRequestDto(String str, String str2, String str3, Boolean bool) {
        this.userId = str;
        this.groupId = str2;
        this.messageId = str3;
        this.isStarred = bool;
    }

    public static /* synthetic */ StarMessageRequestDto copy$default(StarMessageRequestDto starMessageRequestDto, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = starMessageRequestDto.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = starMessageRequestDto.groupId;
        }
        if ((i10 & 4) != 0) {
            str3 = starMessageRequestDto.messageId;
        }
        if ((i10 & 8) != 0) {
            bool = starMessageRequestDto.isStarred;
        }
        return starMessageRequestDto.copy(str, str2, str3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsStarred() {
        return this.isStarred;
    }

    @NotNull
    public final StarMessageRequestDto copy(String userId, String groupId, String messageId, Boolean isStarred) {
        return new StarMessageRequestDto(userId, groupId, messageId, isStarred);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarMessageRequestDto)) {
            return false;
        }
        StarMessageRequestDto starMessageRequestDto = (StarMessageRequestDto) other;
        return Intrinsics.a(this.userId, starMessageRequestDto.userId) && Intrinsics.a(this.groupId, starMessageRequestDto.groupId) && Intrinsics.a(this.messageId, starMessageRequestDto.messageId) && Intrinsics.a(this.isStarred, starMessageRequestDto.isStarred);
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
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isStarred;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isStarred() {
        return this.isStarred;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.groupId;
        String str3 = this.messageId;
        Boolean bool = this.isStarred;
        StringBuilder l10 = e.l("StarMessageRequestDto(userId=", str, ", groupId=", str2, ", messageId=");
        l10.append(str3);
        l10.append(", isStarred=");
        l10.append(bool);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.messageId);
        Boolean bool = this.isStarred;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
    }
}
