package com.assetgro.stockgro.ui.home.homepage.data;

import a3.a;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeMarketDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "subTitle", "marketCategories", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/MarketCategory;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMarketCategories", "()Ljava/util/List;", "getSubTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeMarketDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("elements")
    @NotNull
    private final List<MarketCategory> marketCategories;

    @SerializedName("sub_title")
    @NotNull
    private final String subTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public HomeMarketDto(@NotNull String title, @NotNull String subTitle, @NotNull List<MarketCategory> marketCategories) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(marketCategories, "marketCategories");
        this.title = title;
        this.subTitle = subTitle;
        this.marketCategories = marketCategories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeMarketDto copy$default(HomeMarketDto homeMarketDto, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeMarketDto.title;
        }
        if ((i10 & 2) != 0) {
            str2 = homeMarketDto.subTitle;
        }
        if ((i10 & 4) != 0) {
            list = homeMarketDto.marketCategories;
        }
        return homeMarketDto.copy(str, str2, list);
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

    @NotNull
    public final List<MarketCategory> component3() {
        return this.marketCategories;
    }

    @NotNull
    public final HomeMarketDto copy(@NotNull String title, @NotNull String subTitle, @NotNull List<MarketCategory> marketCategories) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(marketCategories, "marketCategories");
        return new HomeMarketDto(title, subTitle, marketCategories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMarketDto)) {
            return false;
        }
        HomeMarketDto homeMarketDto = (HomeMarketDto) other;
        return Intrinsics.a(this.title, homeMarketDto.title) && Intrinsics.a(this.subTitle, homeMarketDto.subTitle) && Intrinsics.a(this.marketCategories, homeMarketDto.marketCategories);
    }

    @NotNull
    public final List<MarketCategory> getMarketCategories() {
        return this.marketCategories;
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
        return this.marketCategories.hashCode() + h.g(this.subTitle, this.title.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        return a.l(e.l("HomeMarketDto(title=", str, ", subTitle=", str2, ", marketCategories="), this.marketCategories, ")");
    }
}
