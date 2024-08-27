package com.assetgro.stockgro.ui.home.homepage.domain;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import hb.b;
import hb.c;
import hb.f;
import hb.k;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "cta", HttpUrl.FRAGMENT_ENCODE_SET, "elements", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeViewElement;", "redirectionUrl", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "getRedirectionUrl", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Analytics", "TradeContent", "TradeViewElement", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeSocialTradeView implements WidgetDataInterface {
    public static final int $stable = 0;

    @NotNull
    private final String cta;

    @NotNull
    private final List<TradeViewElement> elements;

    @NotNull
    private final String redirectionUrl;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$Analytics;", HttpUrl.FRAGMENT_ENCODE_SET, "cardSubType", HttpUrl.FRAGMENT_ENCODE_SET, "cardType", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardSubType", "()Ljava/lang/String;", "getCardType", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Analytics {
        public static final int $stable = 0;

        @NotNull
        private final String cardSubType;

        @NotNull
        private final String cardType;

        public Analytics(@NotNull String cardSubType, @NotNull String cardType) {
            Intrinsics.checkNotNullParameter(cardSubType, "cardSubType");
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            this.cardSubType = cardSubType;
            this.cardType = cardType;
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

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCardSubType() {
            return this.cardSubType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        @NotNull
        public final Analytics copy(@NotNull String cardSubType, @NotNull String cardType) {
            Intrinsics.checkNotNullParameter(cardSubType, "cardSubType");
            Intrinsics.checkNotNullParameter(cardType, "cardType");
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

        @NotNull
        public final String getCardSubType() {
            return this.cardSubType;
        }

        @NotNull
        public final String getCardType() {
            return this.cardType;
        }

        public int hashCode() {
            return this.cardType.hashCode() + (this.cardSubType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return h.s("Analytics(cardSubType=", this.cardSubType, ", cardType=", this.cardType, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u000201B?\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003JO\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b\u0013\u0010'R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$ProfitLeft;", "component1", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$StockMeta;", "component2", HttpUrl.FRAGMENT_ENCODE_SET, "component3", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "component5", "Lhb/c;", "component6", HttpUrl.FRAGMENT_ENCODE_SET, "component7", "profitLeft", "stockMeta", "entryPrice", "targetPrice", "isBullish", "progressBar", "tradeDuration", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$ProfitLeft;", "getProfitLeft", "()Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$ProfitLeft;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$StockMeta;", "getStockMeta", "()Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$StockMeta;", "D", "getEntryPrice", "()D", "getTargetPrice", "Z", "()Z", "Lhb/c;", "getProgressBar", "()Lhb/c;", "Ljava/lang/String;", "getTradeDuration", "()Ljava/lang/String;", "<init>", "(Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$ProfitLeft;Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$StockMeta;DDZLhb/c;Ljava/lang/String;)V", "ProfitLeft", "StockMeta", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class TradeContent {
        public static final int $stable = 8;
        private final double entryPrice;
        private final boolean isBullish;

        @NotNull
        private final ProfitLeft profitLeft;

        @NotNull
        private final c progressBar;

        @NotNull
        private final StockMeta stockMeta;
        private final double targetPrice;

        @NotNull
        private final String tradeDuration;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$ProfitLeft;", HttpUrl.FRAGMENT_ENCODE_SET, "percentage", HttpUrl.FRAGMENT_ENCODE_SET, "textPrefix", HttpUrl.FRAGMENT_ENCODE_SET, "textSuffix", "(DLjava/lang/String;Ljava/lang/String;)V", "getPercentage", "()D", "getTextPrefix", "()Ljava/lang/String;", "getTextSuffix", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class ProfitLeft {
            public static final int $stable = 0;
            private final double percentage;

            @NotNull
            private final String textPrefix;

            @NotNull
            private final String textSuffix;

            public ProfitLeft(double d10, @NotNull String textPrefix, @NotNull String textSuffix) {
                Intrinsics.checkNotNullParameter(textPrefix, "textPrefix");
                Intrinsics.checkNotNullParameter(textSuffix, "textSuffix");
                this.percentage = d10;
                this.textPrefix = textPrefix;
                this.textSuffix = textSuffix;
            }

            public static /* synthetic */ ProfitLeft copy$default(ProfitLeft profitLeft, double d10, String str, String str2, int i10, Object obj) {
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
            public final double getPercentage() {
                return this.percentage;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTextPrefix() {
                return this.textPrefix;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTextSuffix() {
                return this.textSuffix;
            }

            @NotNull
            public final ProfitLeft copy(double percentage, @NotNull String textPrefix, @NotNull String textSuffix) {
                Intrinsics.checkNotNullParameter(textPrefix, "textPrefix");
                Intrinsics.checkNotNullParameter(textSuffix, "textSuffix");
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
                return Double.compare(this.percentage, profitLeft.percentage) == 0 && Intrinsics.a(this.textPrefix, profitLeft.textPrefix) && Intrinsics.a(this.textSuffix, profitLeft.textSuffix);
            }

            public final double getPercentage() {
                return this.percentage;
            }

            @NotNull
            public final String getTextPrefix() {
                return this.textPrefix;
            }

            @NotNull
            public final String getTextSuffix() {
                return this.textSuffix;
            }

            public int hashCode() {
                return this.textSuffix.hashCode() + h.g(this.textPrefix, Double.hashCode(this.percentage) * 31, 31);
            }

            @NotNull
            public String toString() {
                double d10 = this.percentage;
                String str = this.textPrefix;
                String str2 = this.textSuffix;
                StringBuilder sb2 = new StringBuilder("ProfitLeft(percentage=");
                sb2.append(d10);
                sb2.append(", textPrefix=");
                sb2.append(str);
                return e.j(sb2, ", textSuffix=", str2, ")");
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent$StockMeta;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "Lhb/b;", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "Lhb/f;", "component5", "identifier", "imageUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "marketPriceChange", "tradeTicks", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getImageUrl", "getName", "Lhb/b;", "getMarketPriceChange", "()Lhb/b;", "Ljava/util/List;", "getTradeTicks", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhb/b;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final /* data */ class StockMeta {
            public static final int $stable = 8;

            @NotNull
            private final String identifier;

            @NotNull
            private final String imageUrl;

            @NotNull
            private final b marketPriceChange;

            @NotNull
            private final String name;

            @NotNull
            private final List<f> tradeTicks;

            public StockMeta(@NotNull String identifier, @NotNull String imageUrl, @NotNull String name, @NotNull b marketPriceChange, @NotNull List<f> tradeTicks) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(marketPriceChange, "marketPriceChange");
                Intrinsics.checkNotNullParameter(tradeTicks, "tradeTicks");
                this.identifier = identifier;
                this.imageUrl = imageUrl;
                this.name = name;
                this.marketPriceChange = marketPriceChange;
                this.tradeTicks = tradeTicks;
            }

            public static /* synthetic */ StockMeta copy$default(StockMeta stockMeta, String str, String str2, String str3, b bVar, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = stockMeta.identifier;
                }
                if ((i10 & 2) != 0) {
                    str2 = stockMeta.imageUrl;
                }
                String str4 = str2;
                if ((i10 & 4) != 0) {
                    str3 = stockMeta.name;
                }
                String str5 = str3;
                if ((i10 & 8) != 0) {
                    bVar = stockMeta.marketPriceChange;
                }
                b bVar2 = bVar;
                if ((i10 & 16) != 0) {
                    list = stockMeta.tradeTicks;
                }
                return stockMeta.copy(str, str4, str5, bVar2, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIdentifier() {
                return this.identifier;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final b getMarketPriceChange() {
                return this.marketPriceChange;
            }

            @NotNull
            public final List<f> component5() {
                return this.tradeTicks;
            }

            @NotNull
            public final StockMeta copy(@NotNull String identifier, @NotNull String imageUrl, @NotNull String name, @NotNull b marketPriceChange, @NotNull List<f> tradeTicks) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(marketPriceChange, "marketPriceChange");
                Intrinsics.checkNotNullParameter(tradeTicks, "tradeTicks");
                return new StockMeta(identifier, imageUrl, name, marketPriceChange, tradeTicks);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StockMeta)) {
                    return false;
                }
                StockMeta stockMeta = (StockMeta) other;
                return Intrinsics.a(this.identifier, stockMeta.identifier) && Intrinsics.a(this.imageUrl, stockMeta.imageUrl) && Intrinsics.a(this.name, stockMeta.name) && Intrinsics.a(this.marketPriceChange, stockMeta.marketPriceChange) && Intrinsics.a(this.tradeTicks, stockMeta.tradeTicks);
            }

            @NotNull
            public final String getIdentifier() {
                return this.identifier;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final b getMarketPriceChange() {
                return this.marketPriceChange;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final List<f> getTradeTicks() {
                return this.tradeTicks;
            }

            public int hashCode() {
                return this.tradeTicks.hashCode() + ((this.marketPriceChange.hashCode() + h.g(this.name, h.g(this.imageUrl, this.identifier.hashCode() * 31, 31), 31)) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.identifier;
                String str2 = this.imageUrl;
                String str3 = this.name;
                b bVar = this.marketPriceChange;
                List<f> list = this.tradeTicks;
                StringBuilder l10 = e.l("StockMeta(identifier=", str, ", imageUrl=", str2, ", name=");
                l10.append(str3);
                l10.append(", marketPriceChange=");
                l10.append(bVar);
                l10.append(", tradeTicks=");
                return a.l(l10, list, ")");
            }
        }

        public TradeContent(@NotNull ProfitLeft profitLeft, @NotNull StockMeta stockMeta, double d10, double d11, boolean z10, @NotNull c progressBar, @NotNull String tradeDuration) {
            Intrinsics.checkNotNullParameter(profitLeft, "profitLeft");
            Intrinsics.checkNotNullParameter(stockMeta, "stockMeta");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            Intrinsics.checkNotNullParameter(tradeDuration, "tradeDuration");
            this.profitLeft = profitLeft;
            this.stockMeta = stockMeta;
            this.entryPrice = d10;
            this.targetPrice = d11;
            this.isBullish = z10;
            this.progressBar = progressBar;
            this.tradeDuration = tradeDuration;
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProfitLeft getProfitLeft() {
            return this.profitLeft;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StockMeta getStockMeta() {
            return this.stockMeta;
        }

        /* renamed from: component3, reason: from getter */
        public final double getEntryPrice() {
            return this.entryPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final double getTargetPrice() {
            return this.targetPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBullish() {
            return this.isBullish;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final c getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getTradeDuration() {
            return this.tradeDuration;
        }

        @NotNull
        public final TradeContent copy(@NotNull ProfitLeft profitLeft, @NotNull StockMeta stockMeta, double entryPrice, double targetPrice, boolean isBullish, @NotNull c progressBar, @NotNull String tradeDuration) {
            Intrinsics.checkNotNullParameter(profitLeft, "profitLeft");
            Intrinsics.checkNotNullParameter(stockMeta, "stockMeta");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            Intrinsics.checkNotNullParameter(tradeDuration, "tradeDuration");
            return new TradeContent(profitLeft, stockMeta, entryPrice, targetPrice, isBullish, progressBar, tradeDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeContent)) {
                return false;
            }
            TradeContent tradeContent = (TradeContent) other;
            return Intrinsics.a(this.profitLeft, tradeContent.profitLeft) && Intrinsics.a(this.stockMeta, tradeContent.stockMeta) && Double.compare(this.entryPrice, tradeContent.entryPrice) == 0 && Double.compare(this.targetPrice, tradeContent.targetPrice) == 0 && this.isBullish == tradeContent.isBullish && Intrinsics.a(this.progressBar, tradeContent.progressBar) && Intrinsics.a(this.tradeDuration, tradeContent.tradeDuration);
        }

        public final double getEntryPrice() {
            return this.entryPrice;
        }

        @NotNull
        public final ProfitLeft getProfitLeft() {
            return this.profitLeft;
        }

        @NotNull
        public final c getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final StockMeta getStockMeta() {
            return this.stockMeta;
        }

        public final double getTargetPrice() {
            return this.targetPrice;
        }

        @NotNull
        public final String getTradeDuration() {
            return this.tradeDuration;
        }

        public int hashCode() {
            return this.tradeDuration.hashCode() + ((this.progressBar.hashCode() + e.d(this.isBullish, d.c(this.targetPrice, d.c(this.entryPrice, (this.stockMeta.hashCode() + (this.profitLeft.hashCode() * 31)) * 31, 31), 31), 31)) * 31);
        }

        public final boolean isBullish() {
            return this.isBullish;
        }

        @NotNull
        public String toString() {
            ProfitLeft profitLeft = this.profitLeft;
            StockMeta stockMeta = this.stockMeta;
            double d10 = this.entryPrice;
            double d11 = this.targetPrice;
            boolean z10 = this.isBullish;
            c cVar = this.progressBar;
            String str = this.tradeDuration;
            StringBuilder sb2 = new StringBuilder("TradeContent(profitLeft=");
            sb2.append(profitLeft);
            sb2.append(", stockMeta=");
            sb2.append(stockMeta);
            sb2.append(", entryPrice=");
            sb2.append(d10);
            a.v(sb2, ", targetPrice=", d11, ", isBullish=");
            sb2.append(z10);
            sb2.append(", progressBar=");
            sb2.append(cVar);
            sb2.append(", tradeDuration=");
            return d.o(sb2, str, ")");
        }
    }

    public HomeSocialTradeView(@NotNull String cta, @NotNull List<TradeViewElement> elements, @NotNull String redirectionUrl) {
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        this.cta = cta;
        this.elements = elements;
        this.redirectionUrl = redirectionUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeSocialTradeView copy$default(HomeSocialTradeView homeSocialTradeView, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeSocialTradeView.cta;
        }
        if ((i10 & 2) != 0) {
            list = homeSocialTradeView.elements;
        }
        if ((i10 & 4) != 0) {
            str2 = homeSocialTradeView.redirectionUrl;
        }
        return homeSocialTradeView.copy(str, list, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final List<TradeViewElement> component2() {
        return this.elements;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    @NotNull
    public final HomeSocialTradeView copy(@NotNull String cta, @NotNull List<TradeViewElement> elements, @NotNull String redirectionUrl) {
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        return new HomeSocialTradeView(cta, elements, redirectionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeSocialTradeView)) {
            return false;
        }
        HomeSocialTradeView homeSocialTradeView = (HomeSocialTradeView) other;
        return Intrinsics.a(this.cta, homeSocialTradeView.cta) && Intrinsics.a(this.elements, homeSocialTradeView.elements) && Intrinsics.a(this.redirectionUrl, homeSocialTradeView.redirectionUrl);
    }

    @NotNull
    public final String getCta() {
        return this.cta;
    }

    @NotNull
    public final List<TradeViewElement> getElements() {
        return this.elements;
    }

    @NotNull
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        return this.redirectionUrl.hashCode() + d.e(this.elements, this.cta.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.cta;
        List<TradeViewElement> list = this.elements;
        String str2 = this.redirectionUrl;
        StringBuilder sb2 = new StringBuilder("HomeSocialTradeView(cta=");
        sb2.append(str);
        sb2.append(", elements=");
        sb2.append(list);
        sb2.append(", redirectionUrl=");
        return d.o(sb2, str2, ")");
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\u009b\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\b\u0002\u0010 \u001a\u00020\u0002HÆ\u0001J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\u0013\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b/\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b1\u0010(R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b5\u00104R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u001e\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b\u001e\u0010:R\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00106\u001a\u0004\b;\u00108R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b<\u0010(¨\u0006?"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeViewElement;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "component1", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$Analytics;", "component2", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;", "component3", "component4", "component5", "component6", HttpUrl.FRAGMENT_ENCODE_SET, "component7", "component8", HttpUrl.FRAGMENT_ENCODE_SET, "Lhb/k;", "component9", HttpUrl.FRAGMENT_ENCODE_SET, "component10", "component11", "component12", "postId", "analytics", "tradeContent", "title", "bodyTitle", "bodyDescription", "likesCount", "commentsCount", "mediaFiles", "isSebiRegisteredRIA", "tags", "redirectionUrl", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getPostId", "()Ljava/lang/String;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$Analytics;", "getAnalytics", "()Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$Analytics;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;", "getTradeContent", "()Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;", "getTitle", "getBodyTitle", "getBodyDescription", "I", "getLikesCount", "()I", "getCommentsCount", "Ljava/util/List;", "getMediaFiles", "()Ljava/util/List;", "Z", "()Z", "getTags", "getRedirectionUrl", "<init>", "(Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$Analytics;Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;ZLjava/util/List;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class TradeViewElement {
        public static final int $stable = 8;
        private final Analytics analytics;
        private final String bodyDescription;
        private final String bodyTitle;
        private final int commentsCount;
        private final boolean isSebiRegisteredRIA;
        private final int likesCount;
        private final List<k> mediaFiles;

        @NotNull
        private final String postId;

        @NotNull
        private final String redirectionUrl;
        private final List<String> tags;
        private final String title;
        private final TradeContent tradeContent;

        public /* synthetic */ TradeViewElement(String str, Analytics analytics, TradeContent tradeContent, String str2, String str3, String str4, int i10, int i11, List list, boolean z10, List list2, String str5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? a.d("toString(...)") : str, analytics, tradeContent, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? 100 : i10, (i12 & 128) != 0 ? 10 : i11, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? false : z10, (i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : list2, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPostId() {
            return this.postId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsSebiRegisteredRIA() {
            return this.isSebiRegisteredRIA;
        }

        public final List<String> component11() {
            return this.tags;
        }

        @NotNull
        /* renamed from: component12, reason: from getter */
        public final String getRedirectionUrl() {
            return this.redirectionUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        /* renamed from: component3, reason: from getter */
        public final TradeContent getTradeContent() {
            return this.tradeContent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBodyTitle() {
            return this.bodyTitle;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBodyDescription() {
            return this.bodyDescription;
        }

        /* renamed from: component7, reason: from getter */
        public final int getLikesCount() {
            return this.likesCount;
        }

        /* renamed from: component8, reason: from getter */
        public final int getCommentsCount() {
            return this.commentsCount;
        }

        public final List<k> component9() {
            return this.mediaFiles;
        }

        @NotNull
        public final TradeViewElement copy(@NotNull String postId, Analytics analytics, TradeContent tradeContent, String title, String bodyTitle, String bodyDescription, int likesCount, int commentsCount, List<k> mediaFiles, boolean isSebiRegisteredRIA, List<String> tags, @NotNull String redirectionUrl) {
            Intrinsics.checkNotNullParameter(postId, "postId");
            Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
            return new TradeViewElement(postId, analytics, tradeContent, title, bodyTitle, bodyDescription, likesCount, commentsCount, mediaFiles, isSebiRegisteredRIA, tags, redirectionUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeViewElement)) {
                return false;
            }
            TradeViewElement tradeViewElement = (TradeViewElement) other;
            return Intrinsics.a(this.postId, tradeViewElement.postId) && Intrinsics.a(this.analytics, tradeViewElement.analytics) && Intrinsics.a(this.tradeContent, tradeViewElement.tradeContent) && Intrinsics.a(this.title, tradeViewElement.title) && Intrinsics.a(this.bodyTitle, tradeViewElement.bodyTitle) && Intrinsics.a(this.bodyDescription, tradeViewElement.bodyDescription) && this.likesCount == tradeViewElement.likesCount && this.commentsCount == tradeViewElement.commentsCount && Intrinsics.a(this.mediaFiles, tradeViewElement.mediaFiles) && this.isSebiRegisteredRIA == tradeViewElement.isSebiRegisteredRIA && Intrinsics.a(this.tags, tradeViewElement.tags) && Intrinsics.a(this.redirectionUrl, tradeViewElement.redirectionUrl);
        }

        public final Analytics getAnalytics() {
            return this.analytics;
        }

        public final String getBodyDescription() {
            return this.bodyDescription;
        }

        public final String getBodyTitle() {
            return this.bodyTitle;
        }

        public final int getCommentsCount() {
            return this.commentsCount;
        }

        public final int getLikesCount() {
            return this.likesCount;
        }

        public final List<k> getMediaFiles() {
            return this.mediaFiles;
        }

        @NotNull
        public final String getPostId() {
            return this.postId;
        }

        @NotNull
        public final String getRedirectionUrl() {
            return this.redirectionUrl;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final String getTitle() {
            return this.title;
        }

        public final TradeContent getTradeContent() {
            return this.tradeContent;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7 = this.postId.hashCode() * 31;
            Analytics analytics = this.analytics;
            int i10 = 0;
            if (analytics == null) {
                hashCode = 0;
            } else {
                hashCode = analytics.hashCode();
            }
            int i11 = (hashCode7 + hashCode) * 31;
            TradeContent tradeContent = this.tradeContent;
            if (tradeContent == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = tradeContent.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            String str = this.title;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str2 = this.bodyTitle;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int i14 = (i13 + hashCode4) * 31;
            String str3 = this.bodyDescription;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int f10 = da.e.f(this.commentsCount, da.e.f(this.likesCount, (i14 + hashCode5) * 31, 31), 31);
            List<k> list = this.mediaFiles;
            if (list == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = list.hashCode();
            }
            int d10 = e.d(this.isSebiRegisteredRIA, (f10 + hashCode6) * 31, 31);
            List<String> list2 = this.tags;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return this.redirectionUrl.hashCode() + ((d10 + i10) * 31);
        }

        public final boolean isSebiRegisteredRIA() {
            return this.isSebiRegisteredRIA;
        }

        @NotNull
        public String toString() {
            String str = this.postId;
            Analytics analytics = this.analytics;
            TradeContent tradeContent = this.tradeContent;
            String str2 = this.title;
            String str3 = this.bodyTitle;
            String str4 = this.bodyDescription;
            int i10 = this.likesCount;
            int i11 = this.commentsCount;
            List<k> list = this.mediaFiles;
            boolean z10 = this.isSebiRegisteredRIA;
            List<String> list2 = this.tags;
            String str5 = this.redirectionUrl;
            StringBuilder sb2 = new StringBuilder("TradeViewElement(postId=");
            sb2.append(str);
            sb2.append(", analytics=");
            sb2.append(analytics);
            sb2.append(", tradeContent=");
            sb2.append(tradeContent);
            sb2.append(", title=");
            sb2.append(str2);
            sb2.append(", bodyTitle=");
            e.v(sb2, str3, ", bodyDescription=", str4, ", likesCount=");
            h.v(sb2, i10, ", commentsCount=", i11, ", mediaFiles=");
            sb2.append(list);
            sb2.append(", isSebiRegisteredRIA=");
            sb2.append(z10);
            sb2.append(", tags=");
            sb2.append(list2);
            sb2.append(", redirectionUrl=");
            sb2.append(str5);
            sb2.append(")");
            return sb2.toString();
        }

        public TradeViewElement(@NotNull String postId, Analytics analytics, TradeContent tradeContent, String str, String str2, String str3, int i10, int i11, List<k> list, boolean z10, List<String> list2, @NotNull String redirectionUrl) {
            Intrinsics.checkNotNullParameter(postId, "postId");
            Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
            this.postId = postId;
            this.analytics = analytics;
            this.tradeContent = tradeContent;
            this.title = str;
            this.bodyTitle = str2;
            this.bodyDescription = str3;
            this.likesCount = i10;
            this.commentsCount = i11;
            this.mediaFiles = list;
            this.isSebiRegisteredRIA = z10;
            this.tags = list2;
            this.redirectionUrl = redirectionUrl;
        }
    }
}
