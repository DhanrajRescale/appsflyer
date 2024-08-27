package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import nn.d;
import o3.b;
import o3.e;
import un.a;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // o3.b
    public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
        d.t(view);
        throw null;
    }

    @Override // o3.b
    public final void c(e eVar) {
        if (eVar.f29551h == 0) {
            eVar.f29551h = 80;
        }
    }

    @Override // o3.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        d.t(view);
        throw null;
    }

    @Override // o3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        d.t(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f37304o);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
