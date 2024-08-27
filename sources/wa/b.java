package wa;

import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        FnoOptionDto oldItem = (FnoOptionDto) obj;
        FnoOptionDto newItem = (FnoOptionDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        FnoOptionDto oldItem = (FnoOptionDto) obj;
        FnoOptionDto newItem = (FnoOptionDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getIdentifier(), newItem.getIdentifier());
    }
}
