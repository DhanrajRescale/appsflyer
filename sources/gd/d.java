package gd;

import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import d7.v;
import k7.w;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d extends v {

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f17263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.lifecycle.o parentLifecycle, w differ) {
        super(differ);
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(differ, "differ");
        parentLifecycle.a(new c(this));
    }

    @Override // k7.z0
    public final void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f17263g = recyclerView;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        o holder = (o) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object data = q(i10);
        Intrinsics.checkNotNullExpressionValue(data, "getItem(...)");
        Intrinsics.checkNotNullParameter(data, "data");
        BaseItemViewModel v10 = holder.v();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        v10.f9076d = data;
        v10.f9075c.setValue(data);
    }

    @Override // k7.z0
    public final void j(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f17263g = null;
    }

    @Override // k7.z0
    public final void l(y1 y1Var) {
        o holder = (o) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.u().h(androidx.lifecycle.n.f1950d);
        holder.u().h(androidx.lifecycle.n.f1951e);
    }

    @Override // k7.z0
    public final void m(y1 y1Var) {
        o holder = (o) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.u().h(androidx.lifecycle.n.f1950d);
        holder.u().h(androidx.lifecycle.n.f1949c);
    }
}
