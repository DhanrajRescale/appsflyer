package com.assetgro.stockgro.ui.home.homepage.data;

import a3.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", HttpUrl.FRAGMENT_ENCODE_SET, "aspectRatio", HttpUrl.FRAGMENT_ENCODE_SET, "text", "redirectionUrl", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageUrl", "()Ljava/lang/String;", "getRedirectionUrl", "getText", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomepageTitleData {
    public static final int $stable = 0;

    @SerializedName("aspect_ratio")
    private final Float aspectRatio;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("redirection_url")
    private final String redirectionUrl;

    @SerializedName("text")
    private final String text;

    public HomepageTitleData(String str, Float f10, String str2, String str3) {
        this.imageUrl = str;
        this.aspectRatio = f10;
        this.text = str2;
        this.redirectionUrl = str3;
    }

    public static /* synthetic */ HomepageTitleData copy$default(HomepageTitleData homepageTitleData, String str, Float f10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homepageTitleData.imageUrl;
        }
        if ((i10 & 2) != 0) {
            f10 = homepageTitleData.aspectRatio;
        }
        if ((i10 & 4) != 0) {
            str2 = homepageTitleData.text;
        }
        if ((i10 & 8) != 0) {
            str3 = homepageTitleData.redirectionUrl;
        }
        return homepageTitleData.copy(str, f10, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final HomepageTitleData copy(String imageUrl, Float aspectRatio, String text, String redirectionUrl) {
        return new HomepageTitleData(imageUrl, aspectRatio, text, redirectionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomepageTitleData)) {
            return false;
        }
        HomepageTitleData homepageTitleData = (HomepageTitleData) other;
        return Intrinsics.a(this.imageUrl, homepageTitleData.imageUrl) && Intrinsics.a(this.aspectRatio, homepageTitleData.aspectRatio) && Intrinsics.a(this.text, homepageTitleData.text) && Intrinsics.a(this.redirectionUrl, homepageTitleData.redirectionUrl);
    }

    public final Float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f10 = this.aspectRatio;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectionUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        Float f10 = this.aspectRatio;
        String str2 = this.text;
        String str3 = this.redirectionUrl;
        StringBuilder sb2 = new StringBuilder("HomepageTitleData(imageUrl=");
        sb2.append(str);
        sb2.append(", aspectRatio=");
        sb2.append(f10);
        sb2.append(", text=");
        return a.k(sb2, str2, ", redirectionUrl=", str3, ")");
    }
}
