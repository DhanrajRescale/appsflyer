package dj;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f14385h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f14386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [k7.w, java.lang.Object] */
    public a(o parentLifecycle, f onCellClick, f logEvent) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onCellClick, "onCellClick");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        this.f14385h = onCellClick;
        this.f14386i = logEvent;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d(parent, this.f14385h, this.f14386i);
    }
}
