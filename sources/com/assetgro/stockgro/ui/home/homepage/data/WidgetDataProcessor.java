package com.assetgro.stockgro.ui.home.homepage.data;

import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.Gson;
import java.util.Map;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J$\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/WidgetDataProcessor;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "convertToExpertViewDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeExpertViewDto;", "rawData", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "convertToHomeBannerDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeBannerDto;", "convertToHomePortfolioDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomePortfolioDto;", "convertToHomeTitleDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeTitleDto;", "convertToHomeUserInfoDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeUserInfoDto;", "convertToMarketTabDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeMarketDto;", "convertToSocialTradeViewDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto;", "processWidgetData", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "widgetType", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WidgetDataProcessor {
    public static final int $stable = 0;

    private final HomeExpertViewDto convertToExpertViewDto(Map<String, ? extends Object> rawData) {
        return (HomeExpertViewDto) new Gson().fromJson(f.t(rawData).toString(), HomeExpertViewDto.class);
    }

    private final HomeBannerDto convertToHomeBannerDto(Map<String, ? extends Object> rawData) {
        return (HomeBannerDto) new Gson().fromJson(f.t(rawData).toString(), HomeBannerDto.class);
    }

    private final HomePortfolioDto convertToHomePortfolioDto(Map<String, ? extends Object> rawData) {
        return (HomePortfolioDto) new Gson().fromJson(f.t(rawData).toString(), HomePortfolioDto.class);
    }

    private final HomeTitleDto convertToHomeTitleDto(Map<String, ? extends Object> rawData) {
        return (HomeTitleDto) new Gson().fromJson(f.t(rawData).toString(), HomeTitleDto.class);
    }

    private final HomeUserInfoDto convertToHomeUserInfoDto(Map<String, ? extends Object> rawData) {
        return (HomeUserInfoDto) new Gson().fromJson(f.t(rawData).toString(), HomeUserInfoDto.class);
    }

    private final HomeMarketDto convertToMarketTabDto(Map<String, ? extends Object> rawData) {
        return (HomeMarketDto) new Gson().fromJson(f.t(rawData).toString(), HomeMarketDto.class);
    }

    private final HomeSocialTradeViewDto convertToSocialTradeViewDto(Map<String, ? extends Object> rawData) {
        return (HomeSocialTradeViewDto) new Gson().fromJson(f.t(rawData).toString(), HomeSocialTradeViewDto.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final WidgetDataInterface processWidgetData(@NotNull String widgetType, @NotNull Map<String, ? extends Object> rawData) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        switch (widgetType.hashCode()) {
            case -1396342996:
                if (widgetType.equals("banner")) {
                    return convertToHomeBannerDto(rawData);
                }
                return null;
            case 110371416:
                if (widgetType.equals("title")) {
                    return convertToHomeTitleDto(rawData);
                }
                return null;
            case 339204258:
                if (widgetType.equals("user_info")) {
                    return convertToHomeUserInfoDto(rawData);
                }
                return null;
            case 415474731:
                if (widgetType.equals("portfolios")) {
                    return convertToHomePortfolioDto(rawData);
                }
                return null;
            case 839250871:
                if (widgetType.equals("markets")) {
                    return convertToMarketTabDto(rawData);
                }
                return null;
            case 1875722400:
                if (widgetType.equals("trade_view")) {
                    return convertToSocialTradeViewDto(rawData);
                }
                return null;
            case 1952010138:
                if (widgetType.equals("expert_view")) {
                    return convertToExpertViewDto(rawData);
                }
                return null;
            default:
                return null;
        }
    }
}
