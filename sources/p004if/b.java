package p004if;

import com.assetgro.stockgro.data.model.TopPortfolioDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        TopPortfolioDto oldItem = (TopPortfolioDto) obj;
        TopPortfolioDto newItem = (TopPortfolioDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getImageUrl(), newItem.getImageUrl()) && Intrinsics.a(oldItem.getName(), newItem.getName()) && oldItem.getPercentage() == newItem.getPercentage() && Intrinsics.a(oldItem.getType(), newItem.getType()) && Intrinsics.a(oldItem.getUserId(), newItem.getUserId()) && oldItem.getValue() == newItem.getValue()) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        TopPortfolioDto oldItem = (TopPortfolioDto) obj;
        TopPortfolioDto newItem = (TopPortfolioDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
