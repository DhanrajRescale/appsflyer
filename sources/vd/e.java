package vd;

import com.assetgro.stockgro.data.model.GroupMember;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        GroupMember oldItem = (GroupMember) obj;
        GroupMember newItem = (GroupMember) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        GroupMember oldItem = (GroupMember) obj;
        GroupMember newItem = (GroupMember) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
