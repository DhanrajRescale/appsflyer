package ch;

import com.assetgro.stockgro.data.model.UserFollowerFollowing;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        UserFollowerFollowing oldItem = (UserFollowerFollowing) obj;
        UserFollowerFollowing newItem = (UserFollowerFollowing) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getUuid(), newItem.getUuid()) && Intrinsics.a(oldItem.getUserRole(), newItem.getUserRole()) && Intrinsics.a(oldItem.getDisplayName(), newItem.getDisplayName())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        UserFollowerFollowing oldItem = (UserFollowerFollowing) obj;
        UserFollowerFollowing newItem = (UserFollowerFollowing) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUuid(), newItem.getUuid());
    }
}
