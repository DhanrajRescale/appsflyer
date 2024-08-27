package me.relex.circleindicator;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.f;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.ArrayList;
import o3.b;
import s0.g;
import zu.c;

/* loaded from: classes2.dex */
public class SnackbarBehavior extends b {
    public SnackbarBehavior() {
    }

    @Override // o3.b
    public final boolean b(View view, View view2) {
        return view2 instanceof Snackbar$SnackbarLayout;
    }

    @Override // o3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        boolean z11;
        c cVar = (c) view;
        ArrayList k10 = coordinatorLayout.k(cVar);
        int size = k10.size();
        float f10 = g.f34069a;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 < size) {
                View view3 = (View) k10.get(i10);
                if ((view3 instanceof Snackbar$SnackbarLayout) && cVar.getVisibility() == 0 && view3.getVisibility() == 0) {
                    Rect a10 = CoordinatorLayout.a();
                    if (cVar.getParent() != coordinatorLayout) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    coordinatorLayout.j(cVar, a10, z10);
                    Rect a11 = CoordinatorLayout.a();
                    if (view3.getParent() != coordinatorLayout) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    coordinatorLayout.j(view3, a11, z11);
                    try {
                        if (a10.left > a11.right || a10.top > a11.bottom || a10.right < a11.left || a10.bottom < a11.top) {
                            z12 = false;
                        }
                        if (z12) {
                            f10 = Math.min(f10, view3.getTranslationY() - view3.getHeight());
                        }
                    } finally {
                        a10.setEmpty();
                        f fVar = CoordinatorLayout.f1470x;
                        fVar.b(a10);
                        a11.setEmpty();
                        fVar.b(a11);
                    }
                }
                i10++;
            } else {
                cVar.setTranslationY(f10);
                return true;
            }
        }
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
    }
}
