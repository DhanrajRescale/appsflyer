package ad;

import com.assetgro.stockgro.data.model.WinnersDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        WinnersDto oldItem = (WinnersDto) obj;
        WinnersDto newItem = (WinnersDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        WinnersDto oldItem = (WinnersDto) obj;
        WinnersDto newItem = (WinnersDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
