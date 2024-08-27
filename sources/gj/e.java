package gj;

import com.assetgro.stockgro.data.model.SubscriptionPackages;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        SubscriptionPackages oldItem = (SubscriptionPackages) obj;
        SubscriptionPackages newItem = (SubscriptionPackages) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getLevel() == newItem.getLevel() && Intrinsics.a(oldItem.getTitle(), newItem.getTitle()) && Intrinsics.a(oldItem.getDiscountPrice(), newItem.getDiscountPrice()) && Intrinsics.a(oldItem.getPrice(), newItem.getPrice())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        SubscriptionPackages oldItem = (SubscriptionPackages) obj;
        SubscriptionPackages newItem = (SubscriptionPackages) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getPackageId(), newItem.getPackageId());
    }
}
