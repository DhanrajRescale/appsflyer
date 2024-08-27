package te;

import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        SearchUsersItem oldItem = (SearchUsersItem) obj;
        SearchUsersItem newItem = (SearchUsersItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        SearchUsersItem oldItem = (SearchUsersItem) obj;
        SearchUsersItem newItem = (SearchUsersItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
