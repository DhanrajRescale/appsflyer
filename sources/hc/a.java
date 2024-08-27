package hc;

import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f18250h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.lifecycle.o parentLifecycle, g onItemClick) {
        super(parentLifecycle, new ga.a(3));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f18250h = onItemClick;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(parent, this.f18250h);
    }
}
