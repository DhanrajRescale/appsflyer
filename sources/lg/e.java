package lg;

import com.assetgro.stockgro.data.model.portfolio.HistoryOrderDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        HistoryOrderDto oldItem = (HistoryOrderDto) obj;
        HistoryOrderDto newItem = (HistoryOrderDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getQuantity() == newItem.getQuantity() && oldItem.getExecutionDate() == newItem.getExecutionDate() && oldItem.getAmount() == newItem.getAmount() && Intrinsics.a(oldItem.getTradeType(), newItem.getTradeType())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        HistoryOrderDto oldItem = (HistoryOrderDto) obj;
        HistoryOrderDto newItem = (HistoryOrderDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getQuantity() == newItem.getQuantity() && oldItem.getExecutionDate() == newItem.getExecutionDate() && oldItem.getAmount() == newItem.getAmount() && Intrinsics.a(oldItem.getTradeType(), newItem.getTradeType())) {
            return true;
        }
        return false;
    }
}
