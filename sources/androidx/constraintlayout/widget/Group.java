package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import m3.b;
import m3.d;

/* loaded from: classes.dex */
public class Group extends b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // m3.b
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // m3.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
    }

    @Override // m3.b
    public final void j() {
        d dVar = (d) getLayoutParams();
        dVar.f27336p0.T(0);
        dVar.f27336p0.O(0);
    }

    @Override // m3.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
