package gd;

import android.view.View;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k7.i1;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17262a;

    public c(d dVar) {
        this.f17262a = dVar;
    }

    @Override // androidx.lifecycle.e
    public final void d(t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        RecyclerView recyclerView = this.f17262a.f17263g;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != null) {
                    y1 M = recyclerView.M(childAt);
                    Intrinsics.d(M, "null cannot be cast to non-null type com.assetgro.stockgro.ui.base.BaseItemViewHolder<*, *, *>");
                    o oVar = (o) M;
                    oVar.u().h(androidx.lifecycle.n.f1950d);
                    oVar.u().h(androidx.lifecycle.n.f1949c);
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void f(t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        RecyclerView recyclerView = this.f17262a.f17263g;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != null) {
                    y1 M = recyclerView.M(childAt);
                    Intrinsics.d(M, "null cannot be cast to non-null type com.assetgro.stockgro.ui.base.BaseItemViewHolder<*, *, *>");
                    o oVar = (o) M;
                    oVar.u().h(androidx.lifecycle.n.f1947a);
                    oVar.v().d();
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void g(t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        RecyclerView recyclerView = this.f17262a.f17263g;
        if (recyclerView != null) {
            i1 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int Q0 = linearLayoutManager.Q0();
                int R0 = linearLayoutManager.R0();
                if (Q0 < 0 || Q0 > R0 || Q0 > R0) {
                    return;
                }
                while (true) {
                    y1 I = recyclerView.I(Q0);
                    if (I != null) {
                        o oVar = (o) I;
                        oVar.u().h(androidx.lifecycle.n.f1950d);
                        oVar.u().h(androidx.lifecycle.n.f1951e);
                    }
                    if (Q0 != R0) {
                        Q0++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
