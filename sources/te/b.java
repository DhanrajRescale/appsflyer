package te;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f35993h;

    /* renamed from: i, reason: collision with root package name */
    public final Function2 f35994i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [k7.w, java.lang.Object] */
    public b(o parentLifecycle, qe.c onItemClick, qe.d onActionClick) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onActionClick, "onActionClick");
        this.f35993h = onItemClick;
        this.f35994i = onActionClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d(parent, this.f35993h, this.f35994i);
    }
}
