package ae;

import com.assetgro.stockgro.data.model.ChatMessage;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        ChatMessage oldItem = (ChatMessage) obj;
        ChatMessage newItem = (ChatMessage) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getMessageId(), newItem.getMessageId()) && Intrinsics.a(oldItem.getMessage(), newItem.getMessage()) && Intrinsics.a(oldItem.getServerTime(), newItem.getServerTime())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        ChatMessage oldItem = (ChatMessage) obj;
        ChatMessage newItem = (ChatMessage) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getMessageId(), newItem.getMessageId());
    }
}
