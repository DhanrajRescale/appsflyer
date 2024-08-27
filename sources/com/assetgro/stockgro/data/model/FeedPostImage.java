package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ImageSource;
import di.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006&"}, d2 = {"Lcom/assetgro/stockgro/data/model/FeedPostImage;", "Landroid/os/Parcelable;", "Lcom/assetgro/stockgro/data/model/ImageSource;", "getImageSource", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "Ldi/a;", "component2", "component3", "component4", "imageId", "imageSrc", "uri", "url", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "Ljava/lang/String;", "getImageId", "()Ljava/lang/String;", "Ldi/a;", "getImageSrc", "()Ldi/a;", "getUri", "getUrl", "<init>", "(Ljava/lang/String;Ldi/a;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class FeedPostImage implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FeedPostImage> CREATOR = new Creator();

    @NotNull
    private final String imageId;

    @NotNull
    private final a imageSrc;
    private final String uri;
    private final String url;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FeedPostImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostImage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedPostImage(parcel.readString(), a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostImage[] newArray(int i10) {
            return new FeedPostImage[i10];
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                Parcelable.Creator<a> creator = a.CREATOR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<a> creator2 = a.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FeedPostImage(@NotNull String imageId, @NotNull a imageSrc, String str, String str2) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        this.imageId = imageId;
        this.imageSrc = imageSrc;
        this.uri = str;
        this.url = str2;
    }

    public static /* synthetic */ FeedPostImage copy$default(FeedPostImage feedPostImage, String str, a aVar, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedPostImage.imageId;
        }
        if ((i10 & 2) != 0) {
            aVar = feedPostImage.imageSrc;
        }
        if ((i10 & 4) != 0) {
            str2 = feedPostImage.uri;
        }
        if ((i10 & 8) != 0) {
            str3 = feedPostImage.url;
        }
        return feedPostImage.copy(str, aVar, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final a getImageSrc() {
        return this.imageSrc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final FeedPostImage copy(@NotNull String imageId, @NotNull a imageSrc, String uri, String url) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        return new FeedPostImage(imageId, imageSrc, uri, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedPostImage)) {
            return false;
        }
        FeedPostImage feedPostImage = (FeedPostImage) other;
        return Intrinsics.a(this.imageId, feedPostImage.imageId) && this.imageSrc == feedPostImage.imageSrc && Intrinsics.a(this.uri, feedPostImage.uri) && Intrinsics.a(this.url, feedPostImage.url);
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    public final ImageSource getImageSource() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.imageSrc.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new ImageSource.SourceURL(this.url);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new ImageSource.SourceURI(this.uri);
    }

    @NotNull
    public final a getImageSrc() {
        return this.imageSrc;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.imageSrc.hashCode() + (this.imageId.hashCode() * 31)) * 31;
        String str = this.uri;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageId;
        a aVar = this.imageSrc;
        String str2 = this.uri;
        String str3 = this.url;
        StringBuilder sb2 = new StringBuilder("FeedPostImage(imageId=");
        sb2.append(str);
        sb2.append(", imageSrc=");
        sb2.append(aVar);
        sb2.append(", uri=");
        return a3.a.k(sb2, str2, ", url=", str3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.imageId);
        this.imageSrc.writeToParcel(parcel, flags);
        parcel.writeString(this.uri);
        parcel.writeString(this.url);
    }
}
