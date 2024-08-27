package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.n1;
import d4.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jo.a;
import o3.b;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f11563a = 0;

    public ExpandableBehavior() {
    }

    @Override // o3.b
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z10 = ((FloatingActionButton) obj).f11362o.f3157a;
        int i10 = 2;
        if (z10) {
            int i11 = this.f11563a;
            if (i11 != 0 && i11 != 2) {
                return false;
            }
        } else if (this.f11563a != 1) {
            return false;
        }
        if (z10) {
            i10 = 1;
        }
        this.f11563a = i10;
        s((View) obj, view, z10, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a aVar;
        int i11;
        WeakHashMap weakHashMap = n1.f13788a;
        if (!y0.c(view)) {
            ArrayList k10 = coordinatorLayout.k(view);
            int size = k10.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    View view2 = (View) k10.get(i12);
                    if (b(view, view2)) {
                        aVar = (a) view2;
                        break;
                    }
                    i12++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                boolean z10 = ((FloatingActionButton) aVar).f11362o.f3157a;
                int i13 = 2;
                if (!z10 ? this.f11563a == 1 : !((i11 = this.f11563a) != 0 && i11 != 2)) {
                    if (z10) {
                        i13 = 1;
                    }
                    this.f11563a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new cp.a(this, view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
