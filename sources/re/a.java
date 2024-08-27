package re;

import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        SearchGroupsItem oldItem = (SearchGroupsItem) obj;
        SearchGroupsItem newItem = (SearchGroupsItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        SearchGroupsItem oldItem = (SearchGroupsItem) obj;
        SearchGroupsItem newItem = (SearchGroupsItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getGroupId(), newItem.getGroupId());
    }
}
