package com.assetgro.stockgro.ui.home.homepage.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/MarketCategory;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "iconUrl", "stocks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/MarketStocks;", "redirectionUrl", "cta", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "getIconUrl", "getRedirectionUrl", "getStocks", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketCategory {
    public static final int $stable = 0;

    @SerializedName("cta")
    private final String cta;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("redirection_url")
    @NotNull
    private final String redirectionUrl;

    @SerializedName("stocks")
    private final List<MarketStocks> stocks;

    @SerializedName("category")
    private final String title;

    public MarketCategory(String str, String str2, List<MarketStocks> list, @NotNull String redirectionUrl, String str3) {
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        this.title = str;
        this.iconUrl = str2;
        this.stocks = list;
        this.redirectionUrl = redirectionUrl;
        this.cta = str3;
    }

    public static /* synthetic */ MarketCategory copy$default(MarketCategory marketCategory, String str, String str2, List list, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = marketCategory.title;
        }
        if ((i10 & 2) != 0) {
            str2 = marketCategory.iconUrl;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            list = marketCategory.stocks;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            str3 = marketCategory.redirectionUrl;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = marketCategory.cta;
        }
        return marketCategory.copy(str, str5, list2, str6, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final List<MarketStocks> component3() {
        return this.stocks;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final MarketCategory copy(String title, String iconUrl, List<MarketStocks> stocks, @NotNull String redirectionUrl, String cta) {
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        return new MarketCategory(title, iconUrl, stocks, redirectionUrl, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCategory)) {
            return false;
        }
        MarketCategory marketCategory = (MarketCategory) other;
        return Intrinsics.a(this.title, marketCategory.title) && Intrinsics.a(this.iconUrl, marketCategory.iconUrl) && Intrinsics.a(this.stocks, marketCategory.stocks) && Intrinsics.a(this.redirectionUrl, marketCategory.redirectionUrl) && Intrinsics.a(this.cta, marketCategory.cta);
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final List<MarketStocks> getStocks() {
        return this.stocks;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.iconUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List<MarketStocks> list = this.stocks;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int g10 = h.g(this.redirectionUrl, (i12 + hashCode3) * 31, 31);
        String str3 = this.cta;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return g10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.iconUrl;
        List<MarketStocks> list = this.stocks;
        String str3 = this.redirectionUrl;
        String str4 = this.cta;
        StringBuilder l10 = e.l("MarketCategory(title=", str, ", iconUrl=", str2, ", stocks=");
        l10.append(list);
        l10.append(", redirectionUrl=");
        l10.append(str3);
        l10.append(", cta=");
        return d.o(l10, str4, ")");
    }
}
