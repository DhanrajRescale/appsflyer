package re;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f33671h;

    /* renamed from: i, reason: collision with root package name */
    public final Function2 f33672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [k7.w, java.lang.Object] */
    public b(o parentLifecycle, qe.c onItemClick, qe.d onActionClick) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onActionClick, "onActionClick");
        this.f33671h = onItemClick;
        this.f33672i = onActionClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new e(parent, this.f33671h, this.f33672i);
    }
}
