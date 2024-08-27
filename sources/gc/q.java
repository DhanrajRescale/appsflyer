package gc;

import com.assetgro.stockgro.missions.domain.model.MissionHistoryTimeline;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        MissionHistoryTimeline oldItem = (MissionHistoryTimeline) obj;
        MissionHistoryTimeline newItem = (MissionHistoryTimeline) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        MissionHistoryTimeline oldItem = (MissionHistoryTimeline) obj;
        MissionHistoryTimeline newItem = (MissionHistoryTimeline) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getDate() == newItem.getDate()) {
            return true;
        }
        return false;
    }
}
