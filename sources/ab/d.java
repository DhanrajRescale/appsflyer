package ab;

import com.assetgro.stockgro.data.model.CountrySelectDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        CountrySelectDto oldItem = (CountrySelectDto) obj;
        CountrySelectDto newItem = (CountrySelectDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        CountrySelectDto oldItem = (CountrySelectDto) obj;
        CountrySelectDto newItem = (CountrySelectDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
