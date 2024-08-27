package tg;

import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final Function2 f36058h;

    /* renamed from: i, reason: collision with root package name */
    public final Function2 f36059i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f36060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [k7.w, java.lang.Object] */
    public k(androidx.lifecycle.o parentLifecycle, n onCancelOrderClicked, n onModifyOrderClicked, m onHeaderClicked) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onCancelOrderClicked, "onCancelOrderClicked");
        Intrinsics.checkNotNullParameter(onModifyOrderClicked, "onModifyOrderClicked");
        Intrinsics.checkNotNullParameter(onHeaderClicked, "onHeaderClicked");
        this.f36058h = onCancelOrderClicked;
        this.f36059i = onModifyOrderClicked;
        this.f36060j = onHeaderClicked;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r(parent, this.f36058h, this.f36059i, this.f36060j);
    }
}
