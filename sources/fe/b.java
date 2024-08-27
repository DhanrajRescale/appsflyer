package fe;

import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f16044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [k7.w, java.lang.Object] */
    public b(v parentLifecycle, ce.c onItemClick) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f16044h = onItemClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(parent, this.f16044h);
    }
}
