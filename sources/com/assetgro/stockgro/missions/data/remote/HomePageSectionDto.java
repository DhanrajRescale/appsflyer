package com.assetgro.stockgro.missions.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.HomePageSection;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/HomePageSectionDto;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "subText", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubText", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toHomePageSection", "Lcom/assetgro/stockgro/missions/domain/model/HomePageSection;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomePageSectionDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<HomePageSectionDto> CREATOR = new Creator();

    @SerializedName("sub_text")
    @NotNull
    private final String subText;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<HomePageSectionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HomePageSectionDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HomePageSectionDto(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HomePageSectionDto[] newArray(int i10) {
            return new HomePageSectionDto[i10];
        }
    }

    public HomePageSectionDto(@NotNull String title, @NotNull String subText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        this.title = title;
        this.subText = subText;
    }

    public static /* synthetic */ HomePageSectionDto copy$default(HomePageSectionDto homePageSectionDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homePageSectionDto.title;
        }
        if ((i10 & 2) != 0) {
            str2 = homePageSectionDto.subText;
        }
        return homePageSectionDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final HomePageSectionDto copy(@NotNull String title, @NotNull String subText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        return new HomePageSectionDto(title, subText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageSectionDto)) {
            return false;
        }
        HomePageSectionDto homePageSectionDto = (HomePageSectionDto) other;
        return Intrinsics.a(this.title, homePageSectionDto.title) && Intrinsics.a(this.subText, homePageSectionDto.subText);
    }

    @NotNull
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subText.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public final HomePageSection toHomePageSection() {
        return new HomePageSection(this.title, this.subText);
    }

    @NotNull
    public String toString() {
        return h.s("HomePageSectionDto(title=", this.title, ", subText=", this.subText, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subText);
    }
}
