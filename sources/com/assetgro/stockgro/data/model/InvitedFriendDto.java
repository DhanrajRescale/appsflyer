package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/model/InvitedFriendDto;", "Landroid/os/Parcelable;", "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "uuid", "imageUrl", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayName", "()Ljava/lang/String;", "getImageUrl", "()Z", "getUuid", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InvitedFriendDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<InvitedFriendDto> CREATOR = new Creator();

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("is_ria_rra")
    private final boolean isExpert;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<InvitedFriendDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InvitedFriendDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvitedFriendDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final InvitedFriendDto[] newArray(int i10) {
            return new InvitedFriendDto[i10];
        }
    }

    public InvitedFriendDto(@NotNull String displayName, @NotNull String uuid, @NotNull String imageUrl, boolean z10) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.displayName = displayName;
        this.uuid = uuid;
        this.imageUrl = imageUrl;
        this.isExpert = z10;
    }

    public static /* synthetic */ InvitedFriendDto copy$default(InvitedFriendDto invitedFriendDto, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = invitedFriendDto.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = invitedFriendDto.uuid;
        }
        if ((i10 & 4) != 0) {
            str3 = invitedFriendDto.imageUrl;
        }
        if ((i10 & 8) != 0) {
            z10 = invitedFriendDto.isExpert;
        }
        return invitedFriendDto.copy(str, str2, str3, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    public final InvitedFriendDto copy(@NotNull String displayName, @NotNull String uuid, @NotNull String imageUrl, boolean isExpert) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new InvitedFriendDto(displayName, uuid, imageUrl, isExpert);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitedFriendDto)) {
            return false;
        }
        InvitedFriendDto invitedFriendDto = (InvitedFriendDto) other;
        return Intrinsics.a(this.displayName, invitedFriendDto.displayName) && Intrinsics.a(this.uuid, invitedFriendDto.uuid) && Intrinsics.a(this.imageUrl, invitedFriendDto.imageUrl) && this.isExpert == invitedFriendDto.isExpert;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpert) + h.g(this.imageUrl, h.g(this.uuid, this.displayName.hashCode() * 31, 31), 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        String str2 = this.uuid;
        String str3 = this.imageUrl;
        boolean z10 = this.isExpert;
        StringBuilder l10 = e.l("InvitedFriendDto(displayName=", str, ", uuid=", str2, ", imageUrl=");
        l10.append(str3);
        l10.append(", isExpert=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.displayName);
        parcel.writeString(this.uuid);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isExpert ? 1 : 0);
    }

    public /* synthetic */ InvitedFriendDto(String str, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10);
    }
}
