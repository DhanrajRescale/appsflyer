package m3;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class t extends b {

    /* renamed from: h, reason: collision with root package name */
    public boolean f27466h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27467i;

    @Override // m3.b
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // m3.b
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f27457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f27466h = true;
                } else if (index == 22) {
                    this.f27467i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(j3.l lVar, int i10, int i11);

    @Override // m3.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27466h || this.f27467i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f27299b; i10++) {
                    View view = (View) constraintLayout.f1449a.get(this.f27298a[i10]);
                    if (view != null) {
                        if (this.f27466h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f27467i && elevation > s0.g.f34069a) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
