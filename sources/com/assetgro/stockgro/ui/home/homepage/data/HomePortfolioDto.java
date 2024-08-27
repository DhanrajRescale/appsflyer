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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomePortfolioDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioListItems", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/PortfolioListItem;", "extraActionCtaTitle", "extraActionBehavior", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getExtraActionBehavior", "()Ljava/lang/String;", "getExtraActionCtaTitle", "getPortfolioListItems", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomePortfolioDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("extra_action_behavior")
    @NotNull
    private final String extraActionBehavior;

    @SerializedName("extra_action_cta_title")
    @NotNull
    private final String extraActionCtaTitle;

    @SerializedName("elements")
    private final List<PortfolioListItem> portfolioListItems;

    @SerializedName("title")
    @NotNull
    private final String title;

    public HomePortfolioDto(@NotNull String title, List<PortfolioListItem> list, @NotNull String extraActionCtaTitle, @NotNull String extraActionBehavior) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraActionCtaTitle, "extraActionCtaTitle");
        Intrinsics.checkNotNullParameter(extraActionBehavior, "extraActionBehavior");
        this.title = title;
        this.portfolioListItems = list;
        this.extraActionCtaTitle = extraActionCtaTitle;
        this.extraActionBehavior = extraActionBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomePortfolioDto copy$default(HomePortfolioDto homePortfolioDto, String str, List list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homePortfolioDto.title;
        }
        if ((i10 & 2) != 0) {
            list = homePortfolioDto.portfolioListItems;
        }
        if ((i10 & 4) != 0) {
            str2 = homePortfolioDto.extraActionCtaTitle;
        }
        if ((i10 & 8) != 0) {
            str3 = homePortfolioDto.extraActionBehavior;
        }
        return homePortfolioDto.copy(str, list, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<PortfolioListItem> component2() {
        return this.portfolioListItems;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    @NotNull
    public final HomePortfolioDto copy(@NotNull String title, List<PortfolioListItem> portfolioListItems, @NotNull String extraActionCtaTitle, @NotNull String extraActionBehavior) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraActionCtaTitle, "extraActionCtaTitle");
        Intrinsics.checkNotNullParameter(extraActionBehavior, "extraActionBehavior");
        return new HomePortfolioDto(title, portfolioListItems, extraActionCtaTitle, extraActionBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePortfolioDto)) {
            return false;
        }
        HomePortfolioDto homePortfolioDto = (HomePortfolioDto) other;
        return Intrinsics.a(this.title, homePortfolioDto.title) && Intrinsics.a(this.portfolioListItems, homePortfolioDto.portfolioListItems) && Intrinsics.a(this.extraActionCtaTitle, homePortfolioDto.extraActionCtaTitle) && Intrinsics.a(this.extraActionBehavior, homePortfolioDto.extraActionBehavior);
    }

    @NotNull
    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    @NotNull
    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    public final List<PortfolioListItem> getPortfolioListItems() {
        return this.portfolioListItems;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        List<PortfolioListItem> list = this.portfolioListItems;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.extraActionBehavior.hashCode() + h.g(this.extraActionCtaTitle, (hashCode2 + hashCode) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<PortfolioListItem> list = this.portfolioListItems;
        String str2 = this.extraActionCtaTitle;
        String str3 = this.extraActionBehavior;
        StringBuilder sb2 = new StringBuilder("HomePortfolioDto(title=");
        sb2.append(str);
        sb2.append(", portfolioListItems=");
        sb2.append(list);
        sb2.append(", extraActionCtaTitle=");
        return a.k(sb2, str2, ", extraActionBehavior=", str3, ")");
    }
}
