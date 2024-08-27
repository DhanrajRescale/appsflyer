package com.assetgro.stockgro.ui.home.homepage.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageHeadingDto;", HttpUrl.FRAGMENT_ENCODE_SET, "title", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;", "subTitle", "(Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;)V", "getSubTitle", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomepageTitleData;", "getTitle", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomepageHeadingDto {
    public static final int $stable = 0;

    @SerializedName("sub_title")
    private final HomepageTitleData subTitle;

    @SerializedName("title")
    private final HomepageTitleData title;

    public HomepageHeadingDto(HomepageTitleData homepageTitleData, HomepageTitleData homepageTitleData2) {
        this.title = homepageTitleData;
        this.subTitle = homepageTitleData2;
    }

    public static /* synthetic */ HomepageHeadingDto copy$default(HomepageHeadingDto homepageHeadingDto, HomepageTitleData homepageTitleData, HomepageTitleData homepageTitleData2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            homepageTitleData = homepageHeadingDto.title;
        }
        if ((i10 & 2) != 0) {
            homepageTitleData2 = homepageHeadingDto.subTitle;
        }
        return homepageHeadingDto.copy(homepageTitleData, homepageTitleData2);
    }

    /* renamed from: component1, reason: from getter */
    public final HomepageTitleData getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final HomepageTitleData getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final HomepageHeadingDto copy(HomepageTitleData title, HomepageTitleData subTitle) {
        return new HomepageHeadingDto(title, subTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomepageHeadingDto)) {
            return false;
        }
        HomepageHeadingDto homepageHeadingDto = (HomepageHeadingDto) other;
        return Intrinsics.a(this.title, homepageHeadingDto.title) && Intrinsics.a(this.subTitle, homepageHeadingDto.subTitle);
    }

    public final HomepageTitleData getSubTitle() {
        return this.subTitle;
    }

    public final HomepageTitleData getTitle() {
        return this.title;
    }

    public int hashCode() {
        HomepageTitleData homepageTitleData = this.title;
        int hashCode = (homepageTitleData == null ? 0 : homepageTitleData.hashCode()) * 31;
        HomepageTitleData homepageTitleData2 = this.subTitle;
        return hashCode + (homepageTitleData2 != null ? homepageTitleData2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomepageHeadingDto(title=" + this.title + ", subTitle=" + this.subTitle + ")";
    }
}
