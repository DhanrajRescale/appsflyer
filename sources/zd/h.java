package zd;

import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f42422h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f42423i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [k7.w, java.lang.Object] */
    public h(o parentLifecycle, c onLongPress, c onUserInfoClicked) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        Intrinsics.checkNotNullParameter(onUserInfoClicked, "onUserInfoClicked");
        this.f42422h = onLongPress;
        this.f42423i = onUserInfoClicked;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new m(parent, this.f42422h, this.f42423i);
    }
}
