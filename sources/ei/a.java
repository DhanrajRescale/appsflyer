package ei;

import com.assetgro.stockgro.data.model.FeedPostImage;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        FeedPostImage oldItem = (FeedPostImage) obj;
        FeedPostImage newItem = (FeedPostImage) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getImageId(), newItem.getImageId());
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        FeedPostImage oldItem = (FeedPostImage) obj;
        FeedPostImage newItem = (FeedPostImage) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }
}
