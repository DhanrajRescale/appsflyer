package ge;

import com.assetgro.stockgro.data.model.NonStockgroContact;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends k7.w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        NonStockgroContact oldItem = (NonStockgroContact) obj;
        NonStockgroContact newItem = (NonStockgroContact) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getPhoneNumber(), newItem.getPhoneNumber()) && Intrinsics.a(oldItem.getUuid(), newItem.getUuid()) && Intrinsics.a(oldItem.getDisplayName(), newItem.getDisplayName()) && Intrinsics.a(oldItem.getName(), newItem.getName())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        NonStockgroContact oldItem = (NonStockgroContact) obj;
        NonStockgroContact newItem = (NonStockgroContact) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getPhoneNumber(), newItem.getPhoneNumber()) && Intrinsics.a(oldItem.getUuid(), newItem.getUuid())) {
            return true;
        }
        return false;
    }
}
