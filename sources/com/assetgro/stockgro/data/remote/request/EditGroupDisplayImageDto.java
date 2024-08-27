package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/EditGroupDisplayImageDto;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "displayImage", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayImage", "()Ljava/lang/String;", "getGroupId", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EditGroupDisplayImageDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<EditGroupDisplayImageDto> CREATOR = new Creator();

    @SerializedName("image_url")
    @NotNull
    private final String displayImage;

    @SerializedName("group_id")
    private final String groupId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<EditGroupDisplayImageDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EditGroupDisplayImageDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditGroupDisplayImageDto(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final EditGroupDisplayImageDto[] newArray(int i10) {
            return new EditGroupDisplayImageDto[i10];
        }
    }

    public EditGroupDisplayImageDto(String str, @NotNull String displayImage) {
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        this.groupId = str;
        this.displayImage = displayImage;
    }

    public static /* synthetic */ EditGroupDisplayImageDto copy$default(EditGroupDisplayImageDto editGroupDisplayImageDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = editGroupDisplayImageDto.groupId;
        }
        if ((i10 & 2) != 0) {
            str2 = editGroupDisplayImageDto.displayImage;
        }
        return editGroupDisplayImageDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    @NotNull
    public final EditGroupDisplayImageDto copy(String groupId, @NotNull String displayImage) {
        Intrinsics.checkNotNullParameter(displayImage, "displayImage");
        return new EditGroupDisplayImageDto(groupId, displayImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditGroupDisplayImageDto)) {
            return false;
        }
        EditGroupDisplayImageDto editGroupDisplayImageDto = (EditGroupDisplayImageDto) other;
        return Intrinsics.a(this.groupId, editGroupDisplayImageDto.groupId) && Intrinsics.a(this.displayImage, editGroupDisplayImageDto.displayImage);
    }

    @NotNull
    public final String getDisplayImage() {
        return this.displayImage;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        String str = this.groupId;
        return this.displayImage.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return h.s("EditGroupDisplayImageDto(groupId=", this.groupId, ", displayImage=", this.displayImage, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.displayImage);
    }
}
