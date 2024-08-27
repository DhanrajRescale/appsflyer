package gc;

import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f17225h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v parentLifecycle, i onItemClick) {
        super(parentLifecycle, new ga.a(2));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f17225h = onItemClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(parent, this.f17225h);
    }
}
