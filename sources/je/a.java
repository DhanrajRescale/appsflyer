package je;

import com.assetgro.stockgro.data.model.ChatChannel;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        ChatChannel oldItem = (ChatChannel) obj;
        ChatChannel newItem = (ChatChannel) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        ChatChannel oldItem = (ChatChannel) obj;
        ChatChannel newItem = (ChatChannel) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getGroup().getGroupId(), newItem.getGroup().getGroupId());
    }
}
