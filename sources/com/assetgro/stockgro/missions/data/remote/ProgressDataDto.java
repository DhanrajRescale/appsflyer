package com.assetgro.stockgro.missions.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.ProgressData;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/ProgressDataDto;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "subTitle", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;I)V", "getProgress", "()I", "getSubTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toProgressData", "Lcom/assetgro/stockgro/missions/domain/model/ProgressData;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ProgressDataDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProgressDataDto> CREATOR = new Creator();

    @SerializedName("progress")
    private final int progress;

    @SerializedName("sub_title")
    @NotNull
    private final String subTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ProgressDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProgressDataDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProgressDataDto(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProgressDataDto[] newArray(int i10) {
            return new ProgressDataDto[i10];
        }
    }

    public ProgressDataDto(@NotNull String title, @NotNull String subTitle, int i10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        this.title = title;
        this.subTitle = subTitle;
        this.progress = i10;
    }

    public static /* synthetic */ ProgressDataDto copy$default(ProgressDataDto progressDataDto, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = progressDataDto.title;
        }
        if ((i11 & 2) != 0) {
            str2 = progressDataDto.subTitle;
        }
        if ((i11 & 4) != 0) {
            i10 = progressDataDto.progress;
        }
        return progressDataDto.copy(str, str2, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final ProgressDataDto copy(@NotNull String title, @NotNull String subTitle, int progress) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        return new ProgressDataDto(title, subTitle, progress);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressDataDto)) {
            return false;
        }
        ProgressDataDto progressDataDto = (ProgressDataDto) other;
        return Intrinsics.a(this.title, progressDataDto.title) && Intrinsics.a(this.subTitle, progressDataDto.subTitle) && this.progress == progressDataDto.progress;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.progress) + h.g(this.subTitle, this.title.hashCode() * 31, 31);
    }

    @NotNull
    public final ProgressData toProgressData() {
        return new ProgressData(this.title, this.subTitle, this.progress);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        return d.m(e.l("ProgressDataDto(title=", str, ", subTitle=", str2, ", progress="), this.progress, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeInt(this.progress);
    }
}
