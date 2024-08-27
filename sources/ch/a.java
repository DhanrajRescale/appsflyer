package ch;

import com.assetgro.stockgro.data.model.FollowerFollowingData;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        FollowerFollowingData oldItem = (FollowerFollowingData) obj;
        FollowerFollowingData newItem = (FollowerFollowingData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserFollowerFollowings(), newItem.getUserFollowerFollowings());
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        FollowerFollowingData oldItem = (FollowerFollowingData) obj;
        FollowerFollowingData newItem = (FollowerFollowingData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserFollowerFollowings(), newItem.getUserFollowerFollowings());
    }
}
