package ge;

import com.assetgro.stockgro.data.remote.response.StockgroContact;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u extends k7.w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        StockgroContact oldItem = (StockgroContact) obj;
        StockgroContact newItem = (StockgroContact) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        StockgroContact oldItem = (StockgroContact) obj;
        StockgroContact newItem = (StockgroContact) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUuid(), newItem.getUuid());
    }
}
