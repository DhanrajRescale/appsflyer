package com.assetgro.stockgro.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/utils/NullPortfolioIdException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NullPortfolioIdException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullPortfolioIdException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
