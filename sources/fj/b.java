package fj;

import com.assetgro.stockgro.data.remote.response.BulletInDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        BulletInDto oldItem = (BulletInDto) obj;
        BulletInDto newItem = (BulletInDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getDeeplinkUrl(), newItem.getDeeplinkUrl()) && Intrinsics.a(oldItem.getContentType(), newItem.getContentType())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        BulletInDto oldItem = (BulletInDto) obj;
        BulletInDto newItem = (BulletInDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getContentLink(), newItem.getContentLink());
    }
}
