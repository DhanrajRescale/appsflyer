package oa;

import com.assetgro.stockgro.data.model.StockDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        StockDto oldItem = (StockDto) obj;
        StockDto newItem = (StockDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        StockDto oldItem = (StockDto) obj;
        StockDto newItem = (StockDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getCode(), newItem.getCode());
    }
}
