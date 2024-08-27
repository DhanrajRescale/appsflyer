package ce;

import com.assetgro.stockgro.data.model.DiscoverCategory;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        DiscoverCategory oldItem = (DiscoverCategory) obj;
        DiscoverCategory newItem = (DiscoverCategory) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        DiscoverCategory oldItem = (DiscoverCategory) obj;
        DiscoverCategory newItem = (DiscoverCategory) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getCategoryId(), newItem.getCategoryId()) && Intrinsics.a(oldItem.getCategoryName(), newItem.getCategoryName()) && Intrinsics.a(oldItem.getOrientation(), newItem.getOrientation()) && Intrinsics.a(oldItem.getImageUrl(), newItem.getImageUrl())) {
            return true;
        }
        return false;
    }
}
