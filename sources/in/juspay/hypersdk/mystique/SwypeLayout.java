package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import s0.g;

@Keep
/* loaded from: classes2.dex */
public class SwypeLayout extends FrameLayout {
    private static final String TAG = "SwypeLayout";
    public static SwypeLayout activeLayout;
    public static SwypeLayout partialSwype;
    private boolean didDisplace;
    private int leftEdge;
    private View mContent;
    private float mDisplaceX;
    private boolean mEnabled;
    private View mLeftOption;
    private View mRightOption;
    private float mX;
    private int rightEdge;

    public SwypeLayout(Context context) {
        super(context);
        this.mX = g.f34069a;
        this.leftEdge = 0;
        this.rightEdge = 250;
        this.mDisplaceX = g.f34069a;
        this.didDisplace = false;
        this.mContent = null;
        this.mLeftOption = null;
        this.mRightOption = null;
        this.mEnabled = false;
    }

    @Keep
    public static void clear() {
        SwypeLayout swypeLayout = activeLayout;
        if (swypeLayout != null) {
            swypeLayout.reset();
            activeLayout = null;
        }
        SwypeLayout swypeLayout2 = partialSwype;
        if (swypeLayout2 != null) {
            swypeLayout2.reset();
            partialSwype = null;
        }
    }

    private void handleSwype(float f10, boolean z10) {
        boolean z11;
        int i10 = this.leftEdge;
        if (i10 == 0 && this.rightEdge == 0) {
            return;
        }
        float f11 = i10;
        float f12 = this.mDisplaceX + (f10 - this.mX);
        if (f12 < g.f34069a) {
            f11 = this.rightEdge;
            f12 *= -1.0f;
            z11 = true;
        } else {
            z11 = false;
        }
        if (f12 > f11) {
            f12 = f11;
        }
        if (!z10) {
            f11 = f12;
        } else if (f12 / f11 <= 0.4d) {
            f11 = 0.0f;
        }
        SwypeLayout swypeLayout = partialSwype;
        if (swypeLayout != null && swypeLayout != this) {
            swypeLayout.reset();
        }
        partialSwype = this;
        if (z11) {
            f11 *= -1.0f;
        }
        float f13 = this.mDisplaceX - f11;
        if (f13 > 20.0f || f13 < -20.0f) {
            this.didDisplace = true;
            SwypeLayout swypeLayout2 = activeLayout;
            if (swypeLayout2 != null && swypeLayout2 != this) {
                swypeLayout2.reset();
                activeLayout = null;
            }
        }
        if (!z10) {
            this.mContent.setTranslationX(f11);
            return;
        }
        this.mDisplaceX = f11;
        this.mContent.animate().setDuration(150L).setInterpolator(new v4.a()).translationX(f11);
        if (f11 != g.f34069a) {
            activeLayout = this;
        }
        partialSwype = null;
    }

    private void processClick(MotionEvent motionEvent) {
        View view;
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        float y10 = motionEvent.getY();
        float x10 = motionEvent.getX();
        if (measuredHeight < y10 || y10 < g.f34069a || x10 < g.f34069a || x10 > measuredWidth) {
            return;
        }
        float f10 = this.mDisplaceX;
        if (f10 == g.f34069a) {
            view = this.mContent;
        } else if (f10 < g.f34069a && x10 >= measuredWidth - this.rightEdge) {
            view = this.mRightOption;
        } else {
            if (f10 <= g.f34069a || x10 > this.leftEdge) {
                reset();
                return;
            }
            view = this.mLeftOption;
        }
        view.callOnClick();
    }

    private boolean tagChildren() {
        if (getChildCount() != 3) {
            return false;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        if (childAt != this.mContent || childAt2 != this.mLeftOption || childAt3 != this.mRightOption) {
            this.mContent = childAt;
            this.mLeftOption = childAt2;
            this.mRightOption = childAt3;
            reset();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mEnabled;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.mContent != null || tagChildren()) {
            int i14 = i12 - i10;
            View view = this.mContent;
            view.layout(0, 0, view.getMeasuredWidth(), this.mContent.getMeasuredHeight());
            View view2 = this.mLeftOption;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.mContent.getMeasuredHeight());
            View view3 = this.mRightOption;
            view3.layout(i14 - view3.getMeasuredWidth(), 0, i14, this.mRightOption.getMeasuredWidth());
            this.mContent.bringToFront();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mX = motionEvent.getX();
        } else if (actionMasked == 1) {
            handleSwype(motionEvent.getX(), true);
            this.mX = g.f34069a;
            if (this.didDisplace) {
                this.didDisplace = false;
                return false;
            }
            processClick(motionEvent);
        } else if (actionMasked == 2) {
            handleSwype(motionEvent.getX(), false);
        }
        return true;
    }

    public void reset() {
        this.mDisplaceX = g.f34069a;
        this.leftEdge = this.mLeftOption.getMeasuredWidth();
        this.rightEdge = this.mRightOption.getMeasuredWidth();
        this.mContent.setTranslationZ(2.0f);
        this.mContent.animate().setDuration(150L).translationX(g.f34069a);
    }

    public void setSwypeEnabled(boolean z10) {
        boolean z11 = this.mEnabled;
        if (z11 != z10 && z11) {
            reset();
        }
        this.mEnabled = z10;
    }
}
