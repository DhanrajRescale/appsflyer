package com.assetgro.stockgro.feature_market.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getStringType", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OptionTypeKt {
    @NotNull
    public static final String getStringType(@NotNull OptionType optionType) {
        Intrinsics.checkNotNullParameter(optionType, "<this>");
        if (optionType == OptionType.CALL) {
            return "CE";
        }
        return "PE";
    }
}
