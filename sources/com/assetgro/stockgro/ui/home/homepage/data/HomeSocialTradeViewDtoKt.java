package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedPostDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import com.assetgro.stockgro.ui.home.homepage.domain.HomeSocialTradeView;
import hb.a;
import hb.b;
import hb.c;
import hb.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import s0.g;
import vt.i0;
import vt.z;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toDomainLayer", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeContent;", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/HomeSocialTradeView$TradeViewElement;", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeViewElement;", "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomeSocialTradeViewDtoKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final HomeSocialTradeView.TradeContent toDomainLayer(@NotNull HomeSocialTradeViewDto.TradeContent tradeContent) {
        String str;
        String str2;
        String str3;
        a aVar;
        i0 i0Var;
        Boolean isNegativeTrade;
        Float endPosition;
        Float indicatorPosition;
        Float entryPosition;
        Double percentage;
        Intrinsics.checkNotNullParameter(tradeContent, "<this>");
        HomeSocialTradeViewDto.TradeContent.ProfitLeft profitLeft = tradeContent.getProfitLeft();
        double doubleValue = (profitLeft == null || (percentage = profitLeft.getPercentage()) == null) ? 0.0d : percentage.doubleValue();
        HomeSocialTradeViewDto.TradeContent.ProfitLeft profitLeft2 = tradeContent.getProfitLeft();
        if (profitLeft2 == null || (str = profitLeft2.getTextPrefix()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        HomeSocialTradeViewDto.TradeContent.ProfitLeft profitLeft3 = tradeContent.getProfitLeft();
        if (profitLeft3 == null || (str2 = profitLeft3.getTextSuffix()) == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        HomeSocialTradeView.TradeContent.ProfitLeft profitLeft4 = new HomeSocialTradeView.TradeContent.ProfitLeft(doubleValue, str, str2);
        HomeSocialTradeViewDto.TradeContent.StockMetaDto stockMeta = tradeContent.getStockMeta();
        Intrinsics.c(stockMeta);
        String identifier = stockMeta.getIdentifier();
        String str4 = identifier == null ? HttpUrl.FRAGMENT_ENCODE_SET : identifier;
        String imageUrl = stockMeta.getImageUrl();
        String str5 = imageUrl == null ? HttpUrl.FRAGMENT_ENCODE_SET : imageUrl;
        String name = stockMeta.getName();
        String str6 = name == null ? HttpUrl.FRAGMENT_ENCODE_SET : name;
        FeedPostDto.BodyDto.TradeContentDto.ChangeDto marketPriceChange = stockMeta.getMarketPriceChange();
        Intrinsics.c(marketPriceChange);
        Double value = marketPriceChange.getValue();
        double doubleValue2 = value != null ? value.doubleValue() : 0.0d;
        Double percentage2 = marketPriceChange.getPercentage();
        double doubleValue3 = percentage2 != null ? percentage2.doubleValue() : 0.0d;
        String type = marketPriceChange.getType();
        String str7 = null;
        if (type != null) {
            str3 = type.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
        } else {
            str3 = null;
        }
        if (Intrinsics.a(str3, "positive")) {
            aVar = a.f18129a;
        } else {
            aVar = Intrinsics.a(str3, "negative") ? a.f18130b : a.f18131c;
        }
        b bVar = new b(doubleValue2, doubleValue3, aVar);
        List<FeedPostDto.BodyDto.TradeContentDto.TradeDataDto> tradeTicks = stockMeta.getTradeTicks();
        if (tradeTicks != null) {
            ArrayList arrayList = new ArrayList(z.k(tradeTicks));
            for (FeedPostDto.BodyDto.TradeContentDto.TradeDataDto tradeDataDto : tradeTicks) {
                Long timestamp = tradeDataDto.getTimestamp();
                long longValue = timestamp != null ? timestamp.longValue() : 0L;
                Double value2 = tradeDataDto.getValue();
                arrayList.add(new f(value2 != null ? value2.doubleValue() : 0.0d, longValue));
            }
            i0Var = arrayList;
        } else {
            i0Var = i0.f38321a;
        }
        HomeSocialTradeView.TradeContent.StockMeta stockMeta2 = new HomeSocialTradeView.TradeContent.StockMeta(str4, str5, str6, bVar, i0Var);
        Double entryPrice = tradeContent.getEntryPrice();
        double doubleValue4 = entryPrice != null ? entryPrice.doubleValue() : 0.0d;
        Double targetPrice = tradeContent.getTargetPrice();
        double doubleValue5 = targetPrice != null ? targetPrice.doubleValue() : 0.0d;
        String direction = tradeContent.getDirection();
        if (direction != null) {
            str7 = direction.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str7, "toLowerCase(...)");
        }
        boolean a10 = Intrinsics.a(str7, "bullish");
        FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar = tradeContent.getProgressBar();
        float f10 = g.f34069a;
        float floatValue = (progressBar == null || (entryPosition = progressBar.getEntryPosition()) == null) ? 0.0f : entryPosition.floatValue();
        FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar2 = tradeContent.getProgressBar();
        float floatValue2 = (progressBar2 == null || (indicatorPosition = progressBar2.getIndicatorPosition()) == null) ? 0.0f : indicatorPosition.floatValue();
        FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar3 = tradeContent.getProgressBar();
        if (progressBar3 != null && (endPosition = progressBar3.getEndPosition()) != null) {
            f10 = endPosition.floatValue();
        }
        FeedPostDto.BodyDto.TradeContentDto.ProgressBarDto progressBar4 = tradeContent.getProgressBar();
        c cVar = new c(floatValue, floatValue2, f10, (progressBar4 == null || (isNegativeTrade = progressBar4.isNegativeTrade()) == null) ? false : isNegativeTrade.booleanValue());
        String tradeDuration = tradeContent.getTradeDuration();
        if (tradeDuration == null) {
            tradeDuration = "NA";
        }
        return new HomeSocialTradeView.TradeContent(profitLeft4, stockMeta2, doubleValue4, doubleValue5, a10, cVar, tradeDuration);
    }

    @NotNull
    public static final HomeSocialTradeView.TradeViewElement toDomainLayer(@NotNull HomeSocialTradeViewDto.TradeViewElement tradeViewElement) {
        Intrinsics.checkNotNullParameter(tradeViewElement, "<this>");
        HomeSocialTradeViewDto.TradeContent tradeContent = tradeViewElement.getTradeContent();
        HomeSocialTradeView.TradeContent domainLayer = tradeContent != null ? toDomainLayer(tradeContent) : null;
        String redirectionUrl = tradeViewElement.getRedirectionUrl();
        if (redirectionUrl == null) {
            redirectionUrl = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new HomeSocialTradeView.TradeViewElement(null, null, domainLayer, "NA", "NA", "NA", 100, 10, null, true, null, redirectionUrl, 1, null);
    }
}
