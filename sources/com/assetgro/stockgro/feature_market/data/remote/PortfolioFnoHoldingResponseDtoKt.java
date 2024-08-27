package com.assetgro.stockgro.feature_market.data.remote;

import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFnoOption", "Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionValue;", "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PortfolioFnoHoldingResponseDtoKt {
    @NotNull
    public static final FnoOption toFnoOption(@NotNull OptionValue optionValue) {
        Intrinsics.checkNotNullParameter(optionValue, "<this>");
        return new FnoOption(optionValue.getOptionName(), optionValue.getParentSymbol(), Double.parseDouble(optionValue.getLtp()), null, optionValue.getImageUrl(), optionValue.getSector(), HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
