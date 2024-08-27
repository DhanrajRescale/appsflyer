package rh;

import com.assetgro.stockgro.data.model.RedeemedOffers;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        RedeemedOffers oldItem = (RedeemedOffers) obj;
        RedeemedOffers newItem = (RedeemedOffers) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        RedeemedOffers oldItem = (RedeemedOffers) obj;
        RedeemedOffers newItem = (RedeemedOffers) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getCouponCode(), newItem.getCouponCode());
    }
}
