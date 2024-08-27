package ga;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y.r0;

/* loaded from: classes.dex */
public final class b extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final FnoOption f17175h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f17176i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o parentLifecycle, FnoOption identifierInfo, r0 onItemClick) {
        super(parentLifecycle, new a(0));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f17175h = identifierInfo;
        this.f17176i = onItemClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(parent, this.f17175h, this.f17176i);
    }
}
