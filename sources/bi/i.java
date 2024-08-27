package bi;

import com.assetgro.stockgro.ui.social.domain.model.User;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        User oldItem = (User) obj;
        User newItem = (User) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        User oldItem = (User) obj;
        User newItem = (User) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
