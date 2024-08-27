package com.assetgro.stockgro.ui.home.homepage.data;

import a3.a;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedPostDto;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "cta", HttpUrl.FRAGMENT_ENCODE_SET, "elements", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeViewElement;", "redirectionUrl", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "getRedirectionUrl", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Analytics", "TradeContent", "TradeViewElement", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeSocialTradeViewDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("cta")
    private final String cta;

    @SerializedName("elements")
    private final List<TradeViewElement> elements;

    @SerializedName("redirection_url")
    private final String redirectionUrl;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$Analytics;", HttpUrl.FRAGMENT_ENCODE_SET, "cardSubType", HttpUrl.FRAGMENT_ENCODE_SET, "cardType", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardSubType", "()Ljava/lang/String;", "getCardType", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Analytics {
        public static final int $stable = 0;

        @SerializedName("card_sub_type")
        private final String cardSubType;

        @SerializedName("card_type")
        private final String cardType;

        public Analytics(String str, String str2) {
            this.cardSubType = str;
            this.cardType = str2;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = analytics.cardSubType;
            }
            if ((i10 & 2) != 0) {
                str2 = analytics.cardType;
            }
            return analytics.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCardSubType() {
            return this.cardSubType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @NotNull
        public final Analytics copy(String cardSubType, String cardType) {
            return new Analytics(cardSubType, cardType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return Intrinsics.a(this.cardSubType, analytics.cardSubType) && Intrinsics.a(this.cardType, analytics.cardType);
        }

        public final String getCardSubType() {
            return this.cardSubType;
        }

        public final String getCardType() {
            return this.cardType;
        }

        public int hashCode() {
            String str = this.cardSubType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cardType;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return h.s("Analytics(cardSubType=", this.cardSubType, ", cardType=", this.cardType, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", HttpUrl.FRAGMENT_ENCODE_SET, "profitLeft", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;", "stockMeta", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$StockMetaDto;", "entryPrice", HttpUrl.FRAGMENT_ENCODE_SET, "targetPrice", "direction", HttpUrl.FRAGMENT_ENCODE_SET, "progressBar", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "tradeDuration", "(Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$StockMetaDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;Ljava/lang/String;)V", "getDirection", "()Ljava/lang/String;", "getEntryPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProfitLeft", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;", "getProgressBar", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "getStockMeta", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$StockMetaDto;", "getTargetPrice", "getTradeDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$StockMetaDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;Ljava/lang/String;)Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "ProfitLeft", "StockMetaDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TradeContent {
        public static final int $stable = 8;

        @SerializedName("direction")
        private final String direction;

        @SerializedName("entry_price")
        private final Double entryPrice;

        @SerializedName("profit_left")
        private final ProfitLeft profitLeft;

        @SerializedName("progress_bar")
        private final FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar;

        @SerializedName("stock_meta")
        private final StockMetaDto stockMeta;

        @SerializedName("target_price")
        private final Double targetPrice;

        @SerializedName("trade_duration")
        private final String tradeDuration;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;", HttpUrl.FRAGMENT_ENCODE_SET, "percentage", HttpUrl.FRAGMENT_ENCODE_SET, "textPrefix", HttpUrl.FRAGMENT_ENCODE_SET, "textSuffix", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTextPrefix", "()Ljava/lang/String;", "getTextSuffix", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$ProfitLeft;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class ProfitLeft {
            public static final int $stable = 0;

            @SerializedName("percentage")
            private final Double percentage;

            @SerializedName("text_prefix")
            private final String textPrefix;

            @SerializedName("text_suffix")
            private final String textSuffix;

            public ProfitLeft(Double d10, String str, String str2) {
                this.percentage = d10;
                this.textPrefix = str;
                this.textSuffix = str2;
            }

            public static /* synthetic */ ProfitLeft copy$default(ProfitLeft profitLeft, Double d10, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    d10 = profitLeft.percentage;
                }
                if ((i10 & 2) != 0) {
                    str = profitLeft.textPrefix;
                }
                if ((i10 & 4) != 0) {
                    str2 = profitLeft.textSuffix;
                }
                return profitLeft.copy(d10, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getPercentage() {
                return this.percentage;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTextPrefix() {
                return this.textPrefix;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTextSuffix() {
                return this.textSuffix;
            }

            @NotNull
            public final ProfitLeft copy(Double percentage, String textPrefix, String textSuffix) {
                return new ProfitLeft(percentage, textPrefix, textSuffix);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProfitLeft)) {
                    return false;
                }
                ProfitLeft profitLeft = (ProfitLeft) other;
                return Intrinsics.a(this.percentage, profitLeft.percentage) && Intrinsics.a(this.textPrefix, profitLeft.textPrefix) && Intrinsics.a(this.textSuffix, profitLeft.textSuffix);
            }

            public final Double getPercentage() {
                return this.percentage;
            }

            public final String getTextPrefix() {
                return this.textPrefix;
            }

            public final String getTextSuffix() {
                return this.textSuffix;
            }

            public int hashCode() {
                Double d10 = this.percentage;
                int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                String str = this.textPrefix;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.textSuffix;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Double d10 = this.percentage;
                String str = this.textPrefix;
                String str2 = this.textSuffix;
                StringBuilder sb2 = new StringBuilder("ProfitLeft(percentage=");
                sb2.append(d10);
                sb2.append(", textPrefix=");
                sb2.append(str);
                sb2.append(", textSuffix=");
                return d.o(sb2, str2, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent$StockMetaDto;", HttpUrl.FRAGMENT_ENCODE_SET, "identifier", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "marketPriceChange", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "tradeTicks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;Ljava/util/List;)V", "getIdentifier", "()Ljava/lang/String;", "getImageUrl", "getMarketPriceChange", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "getName", "getTradeTicks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class StockMetaDto {
            public static final int $stable = 8;

            @SerializedName("identifier")
            private final String identifier;

            @SerializedName("image_url")
            private final String imageUrl;

            @SerializedName("market_price_change")
            private final FeedPostDto.BodyDto.TradeContentDto.ChangeDto marketPriceChange;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
            private final String name;

            @SerializedName("trade_ticks")
            private final List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> tradeTicks;

            public StockMetaDto(String str, String str2, String str3, FeedPostDto.BodyDto.TradeContentDto.ChangeDto changeDto, List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> list) {
                this.identifier = str;
                this.imageUrl = str2;
                this.name = str3;
                this.marketPriceChange = changeDto;
                this.tradeTicks = list;
            }

            public static /* synthetic */ StockMetaDto copy$default(StockMetaDto stockMetaDto, String str, String str2, String str3, FeedPostDto.BodyDto.TradeContentDto.ChangeDto changeDto, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = stockMetaDto.identifier;
                }
                if ((i10 & 2) != 0) {
                    str2 = stockMetaDto.imageUrl;
                }
                String str4 = str2;
                if ((i10 & 4) != 0) {
                    str3 = stockMetaDto.name;
                }
                String str5 = str3;
                if ((i10 & 8) != 0) {
                    changeDto = stockMetaDto.marketPriceChange;
                }
                FeedPostDto.BodyDto.TradeContentDto.ChangeDto changeDto2 = changeDto;
                if ((i10 & 16) != 0) {
                    list = stockMetaDto.tradeTicks;
                }
                return stockMetaDto.copy(str, str4, str5, changeDto2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIdentifier() {
                return this.identifier;
            }

            /* renamed from: component2, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component4, reason: from getter */
            public final FeedPostDto.BodyDto.TradeContentDto.ChangeDto getMarketPriceChange() {
                return this.marketPriceChange;
            }

            public final List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> component5() {
                return this.tradeTicks;
            }

            @NotNull
            public final StockMetaDto copy(String identifier, String imageUrl, String name, FeedPostDto.BodyDto.TradeContentDto.ChangeDto marketPriceChange, List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> tradeTicks) {
                return new StockMetaDto(identifier, imageUrl, name, marketPriceChange, tradeTicks);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StockMetaDto)) {
                    return false;
                }
                StockMetaDto stockMetaDto = (StockMetaDto) other;
                return Intrinsics.a(this.identifier, stockMetaDto.identifier) && Intrinsics.a(this.imageUrl, stockMetaDto.imageUrl) && Intrinsics.a(this.name, stockMetaDto.name) && Intrinsics.a(this.marketPriceChange, stockMetaDto.marketPriceChange) && Intrinsics.a(this.tradeTicks, stockMetaDto.tradeTicks);
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final FeedPostDto.BodyDto.TradeContentDto.ChangeDto getMarketPriceChange() {
                return this.marketPriceChange;
            }

            public final String getName() {
                return this.name;
            }

            public final List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> getTradeTicks() {
                return this.tradeTicks;
            }

            public int hashCode() {
                String str = this.identifier;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.imageUrl;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.name;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                FeedPostDto.BodyDto.TradeContentDto.ChangeDto changeDto = this.marketPriceChange;
                int hashCode4 = (hashCode3 + (changeDto == null ? 0 : changeDto.hashCode())) * 31;
                List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> list = this.tradeTicks;
                return hashCode4 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.identifier;
                String str2 = this.imageUrl;
                String str3 = this.name;
                FeedPostDto.BodyDto.TradeContentDto.ChangeDto changeDto = this.marketPriceChange;
                List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> list = this.tradeTicks;
                StringBuilder l10 = e.l("StockMetaDto(identifier=", str, ", imageUrl=", str2, ", name=");
                l10.append(str3);
                l10.append(", marketPriceChange=");
                l10.append(changeDto);
                l10.append(", tradeTicks=");
                return a.l(l10, list, ")");
            }
        }

        public TradeContent(ProfitLeft profitLeft, StockMetaDto stockMetaDto, Double d10, Double d11, String str, FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBarDto, String str2) {
            this.profitLeft = profitLeft;
            this.stockMeta = stockMetaDto;
            this.entryPrice = d10;
            this.targetPrice = d11;
            this.direction = str;
            this.progressBar = progressBarDto;
            this.tradeDuration = str2;
        }

        public static /* synthetic */ TradeContent copy$default(TradeContent tradeContent, ProfitLeft profitLeft, StockMetaDto stockMetaDto, Double d10, Double d11, String str, FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBarDto, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                profitLeft = tradeContent.profitLeft;
            }
            if ((i10 & 2) != 0) {
                stockMetaDto = tradeContent.stockMeta;
            }
            StockMetaDto stockMetaDto2 = stockMetaDto;
            if ((i10 & 4) != 0) {
                d10 = tradeContent.entryPrice;
            }
            Double d12 = d10;
            if ((i10 & 8) != 0) {
                d11 = tradeContent.targetPrice;
            }
            Double d13 = d11;
            if ((i10 & 16) != 0) {
                str = tradeContent.direction;
            }
            String str3 = str;
            if ((i10 & 32) != 0) {
                progressBarDto = tradeContent.progressBar;
            }
            FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBarDto2 = progressBarDto;
            if ((i10 & 64) != 0) {
                str2 = tradeContent.tradeDuration;
            }
            return tradeContent.copy(profitLeft, stockMetaDto2, d12, d13, str3, progressBarDto2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ProfitLeft getProfitLeft() {
            return this.profitLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final StockMetaDto getStockMeta() {
            return this.stockMeta;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getEntryPrice() {
            return this.entryPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final Double getTargetPrice() {
            return this.targetPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTradeDuration() {
            return this.tradeDuration;
        }

        @NotNull
        public final TradeContent copy(ProfitLeft profitLeft, StockMetaDto stockMeta, Double entryPrice, Double targetPrice, String direction, FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar, String tradeDuration) {
            return new TradeContent(profitLeft, stockMeta, entryPrice, targetPrice, direction, progressBar, tradeDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeContent)) {
                return false;
            }
            TradeContent tradeContent = (TradeContent) other;
            return Intrinsics.a(this.profitLeft, tradeContent.profitLeft) && Intrinsics.a(this.stockMeta, tradeContent.stockMeta) && Intrinsics.a(this.entryPrice, tradeContent.entryPrice) && Intrinsics.a(this.targetPrice, tradeContent.targetPrice) && Intrinsics.a(this.direction, tradeContent.direction) && Intrinsics.a(this.progressBar, tradeContent.progressBar) && Intrinsics.a(this.tradeDuration, tradeContent.tradeDuration);
        }

        public final String getDirection() {
            return this.direction;
        }

        public final Double getEntryPrice() {
            return this.entryPrice;
        }

        public final ProfitLeft getProfitLeft() {
            return this.profitLeft;
        }

        public final FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto getProgressBar() {
            return this.progressBar;
        }

        public final StockMetaDto getStockMeta() {
            return this.stockMeta;
        }

        public final Double getTargetPrice() {
            return this.targetPrice;
        }

        public final String getTradeDuration() {
            return this.tradeDuration;
        }

        public int hashCode() {
            ProfitLeft profitLeft = this.profitLeft;
            int hashCode = (profitLeft == null ? 0 : profitLeft.hashCode()) * 31;
            StockMetaDto stockMetaDto = this.stockMeta;
            int hashCode2 = (hashCode + (stockMetaDto == null ? 0 : stockMetaDto.hashCode())) * 31;
            Double d10 = this.entryPrice;
            int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.targetPrice;
            int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
            String str = this.direction;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBarDto = this.progressBar;
            int hashCode6 = (hashCode5 + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
            String str2 = this.tradeDuration;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ProfitLeft profitLeft = this.profitLeft;
            StockMetaDto stockMetaDto = this.stockMeta;
            Double d10 = this.entryPrice;
            Double d11 = this.targetPrice;
            String str = this.direction;
            FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBarDto = this.progressBar;
            String str2 = this.tradeDuration;
            StringBuilder sb2 = new StringBuilder("TradeContent(profitLeft=");
            sb2.append(profitLeft);
            sb2.append(", stockMeta=");
            sb2.append(stockMetaDto);
            sb2.append(", entryPrice=");
            sb2.append(d10);
            sb2.append(", targetPrice=");
            sb2.append(d11);
            sb2.append(", direction=");
            sb2.append(str);
            sb2.append(", progressBar=");
            sb2.append(progressBarDto);
            sb2.append(", tradeDuration=");
            return d.o(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeViewElement;", HttpUrl.FRAGMENT_ENCODE_SET, "analytics", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$Analytics;", "tradeContent", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "redirectionUrl", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "postId", "(Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$Analytics;Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnalytics", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$Analytics;", "getGroupId", "()Ljava/lang/String;", "getPostId", "getRedirectionUrl", "getTradeContent", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TradeViewElement {
        public static final int $stable = 8;

        @SerializedName("analytics")
        private final Analytics analytics;
        private final String groupId;
        private final String postId;

        @SerializedName("redirection_url")
        private final String redirectionUrl;

        @SerializedName("trade_content")
        private final TradeContent tradeContent;

        public TradeViewElement(Analytics analytics, TradeContent tradeContent, String str, String str2, String str3) {
            this.analytics = analytics;
            this.tradeContent = tradeContent;
            this.redirectionUrl = str;
            this.groupId = str2;
            this.postId = str3;
        }

        public static /* synthetic */ TradeViewElement copy$default(TradeViewElement tradeViewElement, Analytics analytics, TradeContent tradeContent, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                analytics = tradeViewElement.analytics;
            }
            if ((i10 & 2) != 0) {
                tradeContent = tradeViewElement.tradeContent;
            }
            TradeContent tradeContent2 = tradeContent;
            if ((i10 & 4) != 0) {
                str = tradeViewElement.redirectionUrl;
            }
            String str4 = str;
            if ((i10 & 8) != 0) {
                str2 = tradeViewElement.groupId;
            }
            String str5 = str2;
            if ((i10 & 16) != 0) {
                str3 = tradeViewElement.postId;
            }
            return tradeViewElement.copy(analytics, tradeContent2, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        /* renamed from: component2, reason: from getter */
        public final TradeContent getTradeContent() {
            return this.tradeContent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRedirectionUrl() {
            return this.redirectionUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPostId() {
            return this.postId;
        }

        @NotNull
        public final TradeViewElement copy(Analytics analytics, TradeContent tradeContent, String redirectionUrl, String groupId, String postId) {
            return new TradeViewElement(analytics, tradeContent, redirectionUrl, groupId, postId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeViewElement)) {
                return false;
            }
            TradeViewElement tradeViewElement = (TradeViewElement) other;
            return Intrinsics.a(this.analytics, tradeViewElement.analytics) && Intrinsics.a(this.tradeContent, tradeViewElement.tradeContent) && Intrinsics.a(this.redirectionUrl, tradeViewElement.redirectionUrl) && Intrinsics.a(this.groupId, tradeViewElement.groupId) && Intrinsics.a(this.postId, tradeViewElement.postId);
        }

        public final Analytics getAnalytics() {
            return this.analytics;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getPostId() {
            return this.postId;
        }

        public final String getRedirectionUrl() {
            return this.redirectionUrl;
        }

        public final TradeContent getTradeContent() {
            return this.tradeContent;
        }

        public int hashCode() {
            Analytics analytics = this.analytics;
            int hashCode = (analytics == null ? 0 : analytics.hashCode()) * 31;
            TradeContent tradeContent = this.tradeContent;
            int hashCode2 = (hashCode + (tradeContent == null ? 0 : tradeContent.hashCode())) * 31;
            String str = this.redirectionUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.groupId;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.postId;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Analytics analytics = this.analytics;
            TradeContent tradeContent = this.tradeContent;
            String str = this.redirectionUrl;
            String str2 = this.groupId;
            String str3 = this.postId;
            StringBuilder sb2 = new StringBuilder("TradeViewElement(analytics=");
            sb2.append(analytics);
            sb2.append(", tradeContent=");
            sb2.append(tradeContent);
            sb2.append(", redirectionUrl=");
            e.v(sb2, str, ", groupId=", str2, ", postId=");
            return d.o(sb2, str3, ")");
        }

        public /* synthetic */ TradeViewElement(Analytics analytics, TradeContent tradeContent, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(analytics, tradeContent, str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
        }
    }

    public HomeSocialTradeViewDto(String str, List<TradeViewElement> list, String str2) {
        this.cta = str;
        this.elements = list;
        this.redirectionUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeSocialTradeViewDto copy$default(HomeSocialTradeViewDto homeSocialTradeViewDto, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeSocialTradeViewDto.cta;
        }
        if ((i10 & 2) != 0) {
            list = homeSocialTradeViewDto.elements;
        }
        if ((i10 & 4) != 0) {
            str2 = homeSocialTradeViewDto.redirectionUrl;
        }
        return homeSocialTradeViewDto.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    public final List<TradeViewElement> component2() {
        return this.elements;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final HomeSocialTradeViewDto copy(String cta, List<TradeViewElement> elements, String redirectionUrl) {
        return new HomeSocialTradeViewDto(cta, elements, redirectionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeSocialTradeViewDto)) {
            return false;
        }
        HomeSocialTradeViewDto homeSocialTradeViewDto = (HomeSocialTradeViewDto) other;
        return Intrinsics.a(this.cta, homeSocialTradeViewDto.cta) && Intrinsics.a(this.elements, homeSocialTradeViewDto.elements) && Intrinsics.a(this.redirectionUrl, homeSocialTradeViewDto.redirectionUrl);
    }

    public final String getCta() {
        return this.cta;
    }

    public final List<TradeViewElement> getElements() {
        return this.elements;
    }

    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        String str = this.cta;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TradeViewElement> list = this.elements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.redirectionUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cta;
        List<TradeViewElement> list = this.elements;
        String str2 = this.redirectionUrl;
        StringBuilder sb2 = new StringBuilder("HomeSocialTradeViewDto(cta=");
        sb2.append(str);
        sb2.append(", elements=");
        sb2.append(list);
        sb2.append(", redirectionUrl=");
        return d.o(sb2, str2, ")");
    }
}
