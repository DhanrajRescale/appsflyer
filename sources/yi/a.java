package yi;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import gd.d;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f41643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o parentLifecycle, Function1 onSortOptionClicked) {
        super(parentLifecycle, new ga.a(12));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onSortOptionClicked, "onSortOptionClicked");
        this.f41643h = onSortOptionClicked;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(parent, this.f41643h);
    }
}
