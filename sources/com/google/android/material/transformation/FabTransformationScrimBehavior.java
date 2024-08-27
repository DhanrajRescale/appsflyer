package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dp.b;
import java.util.ArrayList;
import s0.g;
import vn.e;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final e f11571c;

    /* renamed from: d, reason: collision with root package name */
    public final e f11572d;

    public FabTransformationScrimBehavior() {
        this.f11571c = new e(75L);
        this.f11572d = new e(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, o3.b
    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // o3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        e eVar;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z10) {
            eVar = this.f11571c;
        } else {
            eVar = this.f11572d;
        }
        if (z10) {
            if (!z11) {
                view2.setAlpha(g.f34069a);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, g.f34069a);
        }
        eVar.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        b.B1(animatorSet, arrayList);
        animatorSet.addListener(new cp.b(z10, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11571c = new e(75L);
        this.f11572d = new e(0L);
    }
}
