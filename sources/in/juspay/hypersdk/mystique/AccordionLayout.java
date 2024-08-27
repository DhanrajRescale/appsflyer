package in.juspay.hypersdk.mystique;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.Keep;
import s0.g;

@Keep
/* loaded from: classes2.dex */
public class AccordionLayout extends FrameLayout {
    private static final int COLLAPSE = 0;
    private static final int EXPAND = 1;
    private float alphaDelta;
    private int animationDuration;
    private ValueAnimator animator;
    private Context context;
    private float delta;
    private float parallaxDelta;
    private int parentScrollViewId;
    private boolean postLayout;
    private float target;

    public AccordionLayout(Context context) {
        super(context);
        this.delta = 1.0f;
        this.target = 1.0f;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = 1.0f;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    private int getRelativeTop(View view, ScrollView scrollView) {
        Object parent = view.getParent();
        return (parent == scrollView || !(parent instanceof View)) ? view.getTop() : view.getTop() + getRelativeTop((View) parent, scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollParent() {
        ScrollView scrollView;
        if (this.target != 1.0f || this.parentScrollViewId == -1 || !(getContext() instanceof Activity) || (scrollView = (ScrollView) ((Activity) getContext()).findViewById(this.parentScrollViewId)) == null) {
            return;
        }
        int scrollY = scrollView.getScrollY();
        int height = scrollView.getHeight() + scrollY;
        int relativeTop = getRelativeTop(this, scrollView);
        int height2 = getHeight() + relativeTop;
        if (relativeTop < scrollY || height2 > height) {
            scrollView.scrollTo(0, scrollView.getScrollY() + (relativeTop < scrollY ? relativeTop - scrollY : height2 - height));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = (int) (this.delta * getMeasuredHeight());
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        setVisibility((measuredHeight == 0 && this.target == g.f34069a) ? 8 : 0);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            childAt.setTranslationY((int) ((measuredHeight - r6) * this.parallaxDelta));
            float f10 = this.alphaDelta;
            if (f10 != g.f34069a) {
                childAt.setAlpha(this.delta * f10);
                if (this.target == 1.0f && this.delta == 1.0f) {
                    childAt.setAlpha(1.0f);
                }
            }
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        this.postLayout = true;
    }

    public void setDefaultExpand(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        this.target = f10;
        this.delta = f10;
        if (f10 == g.f34069a) {
            setVisibility(8);
        }
    }

    public void setExpand(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        if (this.target == f10) {
            return;
        }
        this.target = f10;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            if (!z10) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            this.delta = f10;
            scrollParent();
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.target == 1.0f) {
            setVisibility(0);
        }
        float f11 = this.target;
        float f12 = this.delta;
        float f13 = f11 - f12;
        if (f13 < g.f34069a) {
            f13 = f12 - f11;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.animator = ofFloat;
        ofFloat.setDuration((int) (f13 * this.animationDuration));
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.postLayout = false;
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: in.juspay.hypersdk.mystique.AccordionLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AccordionLayout.this.delta = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (AccordionLayout.this.postLayout) {
                    AccordionLayout.this.scrollParent();
                }
                AccordionLayout.this.requestLayout();
            }
        });
        this.animator.start();
    }

    public void setExpandAlpha(float f10) {
        this.alphaDelta = f10;
    }

    public void setExpandDuration(int i10) {
        this.animationDuration = i10;
    }

    public void setExpandParallax(float f10) {
        this.parallaxDelta = f10;
    }

    public void setScrollParent(int i10) {
        this.parentScrollViewId = i10;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.delta = 1.0f;
        this.target = 1.0f;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = 1.0f;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.delta = 1.0f;
        this.target = 1.0f;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = 1.0f;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }

    public AccordionLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.delta = 1.0f;
        this.target = 1.0f;
        this.parallaxDelta = 0.6f;
        this.alphaDelta = 1.0f;
        this.animationDuration = 300;
        this.parentScrollViewId = -1;
        this.postLayout = false;
        this.context = context;
    }
}
