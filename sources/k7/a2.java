package k7;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class a2 extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f22271d;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f22272e;

    public a2(RecyclerView recyclerView) {
        this.f22271d = recyclerView;
        z1 z1Var = this.f22272e;
        if (z1Var != null) {
            this.f22272e = z1Var;
        } else {
            this.f22272e = new z1(this);
        }
    }

    @Override // d4.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f22271d.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().V(accessibilityEvent);
            }
        }
    }

    @Override // d4.c
    public void d(View view, e4.m mVar) {
        this.f13725a.onInitializeAccessibilityNodeInfo(view, mVar.f14996a);
        RecyclerView recyclerView = this.f22271d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            i1 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f22405b;
            layoutManager.W(recyclerView2.f2382c, recyclerView2.f2424y0, mVar);
        }
    }

    @Override // d4.c
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f22271d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().k0(i10, bundle);
        }
        return false;
    }
}
