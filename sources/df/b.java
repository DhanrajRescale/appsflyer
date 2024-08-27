package df;

import com.assetgro.stockgro.data.model.TutorialDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        TutorialDto oldItem = (TutorialDto) obj;
        TutorialDto newItem = (TutorialDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        TutorialDto oldItem = (TutorialDto) obj;
        TutorialDto newItem = (TutorialDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getVideoId(), newItem.getVideoId());
    }
}
