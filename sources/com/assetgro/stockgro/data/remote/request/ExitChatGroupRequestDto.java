package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ExitChatGroupRequestDto;", "Landroid/os/Parcelable;", "userId", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "status", "exitData", "Lcom/assetgro/stockgro/data/remote/request/ExitData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/ExitData;)V", "getExitData", "()Lcom/assetgro/stockgro/data/remote/request/ExitData;", "getGroupId", "()Ljava/lang/String;", "getStatus", "getUserId", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExitChatGroupRequestDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ExitChatGroupRequestDto> CREATOR = new Creator();

    @SerializedName("exit_data")
    private final ExitData exitData;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("status")
    private final String status;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ExitChatGroupRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExitChatGroupRequestDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExitChatGroupRequestDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ExitData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExitChatGroupRequestDto[] newArray(int i10) {
            return new ExitChatGroupRequestDto[i10];
        }
    }

    public ExitChatGroupRequestDto(String str, String str2, String str3, ExitData exitData) {
        this.userId = str;
        this.groupId = str2;
        this.status = str3;
        this.exitData = exitData;
    }

    public static /* synthetic */ ExitChatGroupRequestDto copy$default(ExitChatGroupRequestDto exitChatGroupRequestDto, String str, String str2, String str3, ExitData exitData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exitChatGroupRequestDto.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = exitChatGroupRequestDto.groupId;
        }
        if ((i10 & 4) != 0) {
            str3 = exitChatGroupRequestDto.status;
        }
        if ((i10 & 8) != 0) {
            exitData = exitChatGroupRequestDto.exitData;
        }
        return exitChatGroupRequestDto.copy(str, str2, str3, exitData);
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
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final ExitData getExitData() {
        return this.exitData;
    }

    @NotNull
    public final ExitChatGroupRequestDto copy(String userId, String groupId, String status, ExitData exitData) {
        return new ExitChatGroupRequestDto(userId, groupId, status, exitData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitChatGroupRequestDto)) {
            return false;
        }
        ExitChatGroupRequestDto exitChatGroupRequestDto = (ExitChatGroupRequestDto) other;
        return Intrinsics.a(this.userId, exitChatGroupRequestDto.userId) && Intrinsics.a(this.groupId, exitChatGroupRequestDto.groupId) && Intrinsics.a(this.status, exitChatGroupRequestDto.status) && Intrinsics.a(this.exitData, exitChatGroupRequestDto.exitData);
    }

    public final ExitData getExitData() {
        return this.exitData;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExitData exitData = this.exitData;
        return hashCode3 + (exitData != null ? exitData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.groupId;
        String str3 = this.status;
        ExitData exitData = this.exitData;
        StringBuilder l10 = e.l("ExitChatGroupRequestDto(userId=", str, ", groupId=", str2, ", status=");
        l10.append(str3);
        l10.append(", exitData=");
        l10.append(exitData);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.status);
        ExitData exitData = this.exitData;
        if (exitData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exitData.writeToParcel(parcel, flags);
        }
    }
}
