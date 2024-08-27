package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;
import m.u2;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f922a;

    /* renamed from: b, reason: collision with root package name */
    public View f923b;

    /* renamed from: c, reason: collision with root package name */
    public View f924c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f925d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f926e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f927f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f928g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f929h;

    /* renamed from: i, reason: collision with root package name */
    public final int f930i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.b bVar = new m.b(this);
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f16349a);
        boolean z10 = false;
        this.f925d = obtainStyledAttributes.getDrawable(0);
        this.f926e = obtainStyledAttributes.getDrawable(2);
        this.f930i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f928g = true;
            this.f927f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f928g ? !(this.f925d != null || this.f926e != null) : this.f927f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f925d;
        if (drawable != null && drawable.isStateful()) {
            this.f925d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f926e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f926e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f927f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f927f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f925d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f926e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f927f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f923b = findViewById(R.id.action_bar);
        this.f924c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f922a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f928g) {
            Drawable drawable = this.f927f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f925d != null) {
                if (this.f923b.getVisibility() == 0) {
                    this.f925d.setBounds(this.f923b.getLeft(), this.f923b.getTop(), this.f923b.getRight(), this.f923b.getBottom());
                } else {
                    View view = this.f924c;
                    if (view != null && view.getVisibility() == 0) {
                        this.f925d.setBounds(this.f924c.getLeft(), this.f924c.getTop(), this.f924c.getRight(), this.f924c.getBottom());
                    } else {
                        this.f925d.setBounds(0, 0, 0, 0);
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
            this.f929h = false;
            if (!z11) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f923b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f930i) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f923b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f925d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f925d);
        }
        this.f925d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f923b;
            if (view != null) {
                this.f925d.setBounds(view.getLeft(), this.f923b.getTop(), this.f923b.getRight(), this.f923b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f928g ? !(this.f925d != null || this.f926e != null) : this.f927f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f927f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f927f);
        }
        this.f927f = drawable;
        boolean z10 = this.f928g;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f927f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f925d != null || this.f926e != null) : this.f927f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f926e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f926e);
        }
        this.f926e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f929h && this.f926e != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f928g ? !(this.f925d != null || this.f926e != null) : this.f927f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(u2 u2Var) {
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f922a = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f925d;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f926e;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f927f;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f925d;
        boolean z10 = this.f928g;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f926e && this.f929h) || ((drawable == this.f927f && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
