package k7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z1 extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final a2 f22654d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f22655e = new WeakHashMap();

    public z1(a2 a2Var) {
        this.f22654d = a2Var;
    }

    @Override // d4.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            return cVar.a(view, accessibilityEvent);
        }
        return this.f13725a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // d4.c
    public final e4.k b(View view) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            return cVar.b(view);
        }
        return super.b(view);
    }

    @Override // d4.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // d4.c
    public final void d(View view, e4.m mVar) {
        a2 a2Var = this.f22654d;
        boolean P = a2Var.f22271d.P();
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        if (!P) {
            RecyclerView recyclerView = a2Var.f22271d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().X(view, mVar);
                d4.c cVar = (d4.c) this.f22655e.get(view);
                if (cVar != null) {
                    cVar.d(view, mVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // d4.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // d4.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        d4.c cVar = (d4.c) this.f22655e.get(viewGroup);
        if (cVar != null) {
            return cVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f13725a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // d4.c
    public final boolean g(View view, int i10, Bundle bundle) {
        a2 a2Var = this.f22654d;
        if (!a2Var.f22271d.P()) {
            RecyclerView recyclerView = a2Var.f22271d;
            if (recyclerView.getLayoutManager() != null) {
                d4.c cVar = (d4.c) this.f22655e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                u6.g gVar = recyclerView.getLayoutManager().f22405b.f2382c;
                return false;
            }
        }
        return super.g(view, i10, bundle);
    }

    @Override // d4.c
    public final void h(View view, int i10) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            cVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // d4.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        d4.c cVar = (d4.c) this.f22655e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
