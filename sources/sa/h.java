package sa;

import com.assetgro.stockgro.data.model.AssetInsightData;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        AssetInsightData oldItem = (AssetInsightData) obj;
        AssetInsightData newItem = (AssetInsightData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getType() == newItem.getType() && Intrinsics.a(oldItem.getAssetType(), newItem.getAssetType()) && Intrinsics.a(oldItem.getInsightList(), newItem.getInsightList())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        AssetInsightData oldItem = (AssetInsightData) obj;
        AssetInsightData newItem = (AssetInsightData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getType() == newItem.getType()) {
            return true;
        }
        return false;
    }
}
