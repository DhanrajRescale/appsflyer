package kf;

import com.assetgro.stockgro.data.model.StockGyanIndex;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        StockGyanIndex oldItem = (StockGyanIndex) obj;
        StockGyanIndex newItem = (StockGyanIndex) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getId(), newItem.getId());
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        StockGyanIndex oldItem = (StockGyanIndex) obj;
        StockGyanIndex newItem = (StockGyanIndex) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getId(), newItem.getId());
    }
}
