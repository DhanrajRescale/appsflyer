package rg;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        UnifiedStockTransaction oldItem = (UnifiedStockTransaction) obj;
        UnifiedStockTransaction newItem = (UnifiedStockTransaction) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getCode(), newItem.getCode()) && Intrinsics.a(oldItem.getQuantity(), newItem.getQuantity()) && Intrinsics.a(oldItem.getTotalQuantity(), newItem.getTotalQuantity()) && Intrinsics.a(oldItem.getCurrentMarketPrice(), newItem.getCurrentMarketPrice()) && Intrinsics.a(oldItem.getNetPNL(), newItem.getNetPNL()) && Intrinsics.a(oldItem.getRealizedProfitGained(), newItem.getRealizedProfitGained()) && Intrinsics.a(oldItem.getAveragePriceSide1(), newItem.getAveragePriceSide1())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        UnifiedStockTransaction oldItem = (UnifiedStockTransaction) obj;
        UnifiedStockTransaction newItem = (UnifiedStockTransaction) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getCode(), newItem.getCode());
    }
}
