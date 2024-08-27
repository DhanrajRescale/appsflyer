package hd;

import com.assetgro.stockgro.data.model.BottomSheetItem;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        BottomSheetItem oldItem = (BottomSheetItem) obj;
        BottomSheetItem newItem = (BottomSheetItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        BottomSheetItem oldItem = (BottomSheetItem) obj;
        BottomSheetItem newItem = (BottomSheetItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getOptionName(), newItem.getOptionName());
    }
}
