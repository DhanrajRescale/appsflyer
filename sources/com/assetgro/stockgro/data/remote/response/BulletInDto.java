package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/BulletInDto;", "Landroid/os/Parcelable;", "contentLink", HttpUrl.FRAGMENT_ENCODE_SET, "contentType", "deeplinkUrl", "text", "smallIcon", "posterId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentLink", "()Ljava/lang/String;", "getContentType", "getDeeplinkUrl", "getPosterId", "getSmallIcon", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BulletInDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<BulletInDto> CREATOR = new Creator();

    @SerializedName("content_link")
    @NotNull
    private final String contentLink;

    @SerializedName("content_type")
    @NotNull
    private final String contentType;

    @SerializedName("open_url")
    @NotNull
    private final String deeplinkUrl;

    @SerializedName("poster_ID")
    @NotNull
    private final String posterId;

    @SerializedName("small_icon")
    @NotNull
    private final String smallIcon;

    @SerializedName("text")
    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<BulletInDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BulletInDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BulletInDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BulletInDto[] newArray(int i10) {
            return new BulletInDto[i10];
        }
    }

    public BulletInDto(@NotNull String contentLink, @NotNull String contentType, @NotNull String deeplinkUrl, @NotNull String text, @NotNull String smallIcon, @NotNull String posterId) {
        Intrinsics.checkNotNullParameter(contentLink, "contentLink");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(posterId, "posterId");
        this.contentLink = contentLink;
        this.contentType = contentType;
        this.deeplinkUrl = deeplinkUrl;
        this.text = text;
        this.smallIcon = smallIcon;
        this.posterId = posterId;
    }

    public static /* synthetic */ BulletInDto copy$default(BulletInDto bulletInDto, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bulletInDto.contentLink;
        }
        if ((i10 & 2) != 0) {
            str2 = bulletInDto.contentType;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = bulletInDto.deeplinkUrl;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = bulletInDto.text;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = bulletInDto.smallIcon;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = bulletInDto.posterId;
        }
        return bulletInDto.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContentLink() {
        return this.contentLink;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPosterId() {
        return this.posterId;
    }

    @NotNull
    public final BulletInDto copy(@NotNull String contentLink, @NotNull String contentType, @NotNull String deeplinkUrl, @NotNull String text, @NotNull String smallIcon, @NotNull String posterId) {
        Intrinsics.checkNotNullParameter(contentLink, "contentLink");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(posterId, "posterId");
        return new BulletInDto(contentLink, contentType, deeplinkUrl, text, smallIcon, posterId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletInDto)) {
            return false;
        }
        BulletInDto bulletInDto = (BulletInDto) other;
        return Intrinsics.a(this.contentLink, bulletInDto.contentLink) && Intrinsics.a(this.contentType, bulletInDto.contentType) && Intrinsics.a(this.deeplinkUrl, bulletInDto.deeplinkUrl) && Intrinsics.a(this.text, bulletInDto.text) && Intrinsics.a(this.smallIcon, bulletInDto.smallIcon) && Intrinsics.a(this.posterId, bulletInDto.posterId);
    }

    @NotNull
    public final String getContentLink() {
        return this.contentLink;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    @NotNull
    public final String getPosterId() {
        return this.posterId;
    }

    @NotNull
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.posterId.hashCode() + h.g(this.smallIcon, h.g(this.text, h.g(this.deeplinkUrl, h.g(this.contentType, this.contentLink.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.contentLink;
        String str2 = this.contentType;
        String str3 = this.deeplinkUrl;
        String str4 = this.text;
        String str5 = this.smallIcon;
        String str6 = this.posterId;
        StringBuilder l10 = e.l("BulletInDto(contentLink=", str, ", contentType=", str2, ", deeplinkUrl=");
        e.v(l10, str3, ", text=", str4, ", smallIcon=");
        return a.k(l10, str5, ", posterId=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.contentLink);
        parcel.writeString(this.contentType);
        parcel.writeString(this.deeplinkUrl);
        parcel.writeString(this.text);
        parcel.writeString(this.smallIcon);
        parcel.writeString(this.posterId);
    }
}
