package kh;

import com.assetgro.stockgro.data.model.RecentPerformance;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends k7.w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        RecentPerformance oldItem = (RecentPerformance) obj;
        RecentPerformance newItem = (RecentPerformance) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        RecentPerformance oldItem = (RecentPerformance) obj;
        RecentPerformance newItem = (RecentPerformance) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getLeagueId(), newItem.getLeagueId());
    }
}
