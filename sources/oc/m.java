package oc;

import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        ArenaSection oldItem = (ArenaSection) obj;
        ArenaSection newItem = (ArenaSection) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        ArenaSection oldItem = (ArenaSection) obj;
        ArenaSection newItem = (ArenaSection) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
