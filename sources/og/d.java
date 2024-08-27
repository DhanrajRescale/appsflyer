package og;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        UnifiedStockTransaction oldItem = (UnifiedStockTransaction) obj;
        UnifiedStockTransaction newItem = (UnifiedStockTransaction) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getName(), newItem.getName()) && Intrinsics.a(oldItem.getQuantity(), newItem.getQuantity()) && Intrinsics.a(oldItem.getAveragePriceSide1(), newItem.getAveragePriceSide1()) && Intrinsics.a(oldItem.getAveragePriceSide2(), newItem.getAveragePriceSide2()) && Intrinsics.a(oldItem.getMarketValue(), newItem.getMarketValue()) && Intrinsics.a(oldItem.getProfitPercentage(), newItem.getProfitPercentage()) && Intrinsics.a(oldItem.getUnrealizedProfitPercentage(), newItem.getUnrealizedProfitPercentage())) {
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
