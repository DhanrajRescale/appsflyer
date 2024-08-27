package tg;

import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        Bought oldItem = (Bought) obj;
        Bought newItem = (Bought) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        Bought oldItem = (Bought) obj;
        Bought newItem = (Bought) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getOrderId(), newItem.getOrderId()) && oldItem.getQuantity() == newItem.getQuantity() && oldItem.getLastTradePrice() == newItem.getLastTradePrice() && Intrinsics.a(oldItem.getOrderStatus(), newItem.getOrderStatus()) && Intrinsics.a(oldItem.getTradeType(), newItem.getTradeType()) && Intrinsics.a(oldItem.getOrderType(), newItem.getOrderType()) && Intrinsics.a(oldItem.getAskPrice(), newItem.getAskPrice()) && Intrinsics.a(oldItem.getBidPrice(), newItem.getBidPrice()) && oldItem.getQuantity() == newItem.getQuantity() && Intrinsics.a(oldItem.getCancelReason(), newItem.getCancelReason()) && oldItem.getOrderPrice() == newItem.getOrderPrice() && Intrinsics.a(oldItem.getChange(), newItem.getChange()) && Intrinsics.a(oldItem.getTransactionType(), newItem.getTransactionType())) {
            return true;
        }
        return false;
    }
}
