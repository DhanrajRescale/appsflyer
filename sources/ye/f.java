package ye;

import com.assetgro.stockgro.data.model.InvitedFriendDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        InvitedFriendDto oldItem = (InvitedFriendDto) obj;
        InvitedFriendDto newItem = (InvitedFriendDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        InvitedFriendDto oldItem = (InvitedFriendDto) obj;
        InvitedFriendDto newItem = (InvitedFriendDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUuid(), newItem.getUuid());
    }
}
