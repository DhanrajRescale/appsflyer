package ni;

import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28726h;

    /* renamed from: i, reason: collision with root package name */
    public final l f28727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [k7.w, java.lang.Object] */
    public c(androidx.lifecycle.o parentLifecycle, boolean z10, l lVar) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        this.f28726h = z10;
        this.f28727i = lVar;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(parent, this.f28726h, this.f28727i);
    }
}
