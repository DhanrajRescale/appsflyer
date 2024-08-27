package com.assetgro.stockgro.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toStockDto", "Lcom/assetgro/stockgro/data/model/StockDto;", "Lcom/assetgro/stockgro/data/model/UnifiedStockTransaction;", "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnifiedStockTransactionKt {
    @NotNull
    public static final StockDto toStockDto(@NotNull UnifiedStockTransaction unifiedStockTransaction) {
        Intrinsics.checkNotNullParameter(unifiedStockTransaction, "<this>");
        return new StockDto(unifiedStockTransaction.getName(), unifiedStockTransaction.getCode(), Double.parseDouble(unifiedStockTransaction.getCurrentMarketPrice()), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, unifiedStockTransaction.getImageUrl(), null, unifiedStockTransaction.getSector(), null, null, null);
    }
}
