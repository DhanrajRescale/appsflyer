package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/MarketStocks;", HttpUrl.FRAGMENT_ENCODE_SET, "imageURL", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "lastTradePrice", "change", "Lcom/assetgro/stockgro/ui/home/homepage/data/PriceChange;", "redirectionUrl", "sector", "analytics", "Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/data/PriceChange;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/homedata/Analytics;)V", "getAnalytics", "()Lcom/assetgro/stockgro/data/model/homedata/Analytics;", "getChange", "()Lcom/assetgro/stockgro/ui/home/homepage/data/PriceChange;", "getImageURL", "()Ljava/lang/String;", "getLastTradePrice", "getName", "getRedirectionUrl", "getSector", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketStocks {
    public static final int $stable = 0;

    @SerializedName("analytics")
    private final Analytics analytics;

    @SerializedName("change")
    @NotNull
    private final PriceChange change;

    @SerializedName("image_url")
    @NotNull
    private final String imageURL;

    @SerializedName("last_trade_price")
    private final String lastTradePrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("redirection_url")
    @NotNull
    private final String redirectionUrl;

    @SerializedName("sector")
    private final String sector;

    public MarketStocks(@NotNull String imageURL, String str, String str2, @NotNull PriceChange change, @NotNull String redirectionUrl, String str3, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        this.imageURL = imageURL;
        this.name = str;
        this.lastTradePrice = str2;
        this.change = change;
        this.redirectionUrl = redirectionUrl;
        this.sector = str3;
        this.analytics = analytics;
    }

    public static /* synthetic */ MarketStocks copy$default(MarketStocks marketStocks, String str, String str2, String str3, PriceChange priceChange, String str4, String str5, Analytics analytics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = marketStocks.imageURL;
        }
        if ((i10 & 2) != 0) {
            str2 = marketStocks.name;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = marketStocks.lastTradePrice;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            priceChange = marketStocks.change;
        }
        PriceChange priceChange2 = priceChange;
        if ((i10 & 16) != 0) {
            str4 = marketStocks.redirectionUrl;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = marketStocks.sector;
        }
        String str9 = str5;
        if ((i10 & 64) != 0) {
            analytics = marketStocks.analytics;
        }
        return marketStocks.copy(str, str6, str7, priceChange2, str8, str9, analytics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PriceChange getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    /* renamed from: component7, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final MarketStocks copy(@NotNull String imageURL, String name, String lastTradePrice, @NotNull PriceChange change, @NotNull String redirectionUrl, String sector, Analytics analytics) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        return new MarketStocks(imageURL, name, lastTradePrice, change, redirectionUrl, sector, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketStocks)) {
            return false;
        }
        MarketStocks marketStocks = (MarketStocks) other;
        return Intrinsics.a(this.imageURL, marketStocks.imageURL) && Intrinsics.a(this.name, marketStocks.name) && Intrinsics.a(this.lastTradePrice, marketStocks.lastTradePrice) && Intrinsics.a(this.change, marketStocks.change) && Intrinsics.a(this.redirectionUrl, marketStocks.redirectionUrl) && Intrinsics.a(this.sector, marketStocks.sector) && Intrinsics.a(this.analytics, marketStocks.analytics);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final PriceChange getChange() {
        return this.change;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getLastTradePrice() {
        return this.lastTradePrice;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public final String getSector() {
        return this.sector;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.imageURL.hashCode() * 31;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.lastTradePrice;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int g10 = h.g(this.redirectionUrl, (this.change.hashCode() + ((i11 + hashCode2) * 31)) * 31, 31);
        String str3 = this.sector;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (g10 + hashCode3) * 31;
        Analytics analytics = this.analytics;
        if (analytics != null) {
            i10 = analytics.hashCode();
        }
        return i12 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.imageURL;
        String str2 = this.name;
        String str3 = this.lastTradePrice;
        PriceChange priceChange = this.change;
        String str4 = this.redirectionUrl;
        String str5 = this.sector;
        Analytics analytics = this.analytics;
        StringBuilder l10 = e.l("MarketStocks(imageURL=", str, ", name=", str2, ", lastTradePrice=");
        l10.append(str3);
        l10.append(", change=");
        l10.append(priceChange);
        l10.append(", redirectionUrl=");
        e.v(l10, str4, ", sector=", str5, ", analytics=");
        l10.append(analytics);
        l10.append(")");
        return l10.toString();
    }
}
