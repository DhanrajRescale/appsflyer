package com.assetgro.stockgro.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import h.q0;
import java.util.ArrayList;
import java.util.Iterator;
import s0.g;

/* loaded from: classes.dex */
public class StickyNestedScrollView extends NestedScrollView {
    public final ArrayList F;
    public View G;
    public float H;
    public final q0 I;
    public int J;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f10731e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f10732f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f10733g0;

    /* renamed from: h0, reason: collision with root package name */
    public ViewGroup.MarginLayoutParams f10734h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f10735i0;

    /* renamed from: j0, reason: collision with root package name */
    public GradientDrawable f10736j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f10737k0;

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.scrollViewStyle);
        this.I = new q0(this, 18);
        this.f10737k0 = true;
        this.F = new ArrayList();
    }

    public final void A(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (String.valueOf(viewGroup.getChildAt(i10).getTag()).contains("sticky")) {
                    this.F.add(viewGroup.getChildAt(i10));
                } else if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    A(viewGroup.getChildAt(i10));
                }
            }
            return;
        }
        String str = (String) view.getTag();
        if (str != null && str.contains("sticky")) {
            this.F.add(view);
        }
    }

    public final int B(View view) {
        int left = view.getLeft();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    public final int C(View view) {
        int top = view.getTop();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    public final void D() {
        if (String.valueOf(this.G.getTag()).contains("-hastransparancy")) {
            this.G.setAlpha(1.0f);
        }
        GradientDrawable gradientDrawable = this.f10736j0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(24.0f);
        }
        this.f10734h0.setMargins(24, 24, 24, 24);
        this.G.requestLayout();
        this.G = null;
        removeCallbacks(this.I);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        A(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.dispatchDraw(canvas);
        if (this.G != null) {
            canvas.save();
            float paddingLeft = getPaddingLeft() + this.J;
            float scrollY = getScrollY() + this.H;
            if (this.f10732f0) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.translate(paddingLeft, scrollY + i10);
            if (this.f10732f0) {
                f10 = -this.H;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(g.f34069a, f10, getWidth() - this.J, this.G.getHeight() + this.f10735i0 + 1);
            if (this.f10732f0) {
                f11 = -this.H;
            } else {
                f11 = 0.0f;
            }
            canvas.clipRect(g.f34069a, f11, getWidth(), this.G.getHeight());
            if (String.valueOf(this.G.getTag()).contains("-hastransparancy")) {
                this.G.setAlpha(1.0f);
                this.G.draw(canvas);
                this.G.setAlpha(g.f34069a);
            } else {
                this.G.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r0 <= r4) goto L25;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            if (r0 != 0) goto L9
            r7.f10731e0 = r1
        L9:
            boolean r0 = r7.f10731e0
            r2 = 0
            if (r0 == 0) goto L64
            android.view.View r0 = r7.G
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            r7.f10731e0 = r0
            if (r0 == 0) goto L6a
            float r0 = r8.getY()
            android.view.View r3 = r7.G
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r4 = r7.H
            float r3 = r3 + r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L60
            float r0 = r8.getX()
            android.view.View r3 = r7.G
            int r3 = r7.B(r3)
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L60
            float r0 = r8.getX()
            android.view.View r3 = r7.G
            int r4 = r3.getRight()
        L44:
            android.view.ViewParent r5 = r3.getParent()
            android.view.View r6 = r7.getChildAt(r2)
            if (r5 == r6) goto L5a
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            int r5 = r3.getRight()
            int r4 = r4 + r5
            goto L44
        L5a:
            float r3 = (float) r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            r7.f10731e0 = r1
            goto L6a
        L64:
            android.view.View r0 = r7.G
            if (r0 != 0) goto L6a
            r7.f10731e0 = r2
        L6a:
            boolean r0 = r7.f10731e0
            if (r0 == 0) goto L85
            int r0 = r7.getScrollY()
            float r0 = (float) r0
            float r1 = r7.H
            float r0 = r0 + r1
            android.view.View r1 = r7.G
            int r1 = r7.C(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r1 = 0
            r8.offsetLocation(r1, r0)
        L85:
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.widget.StickyNestedScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f10733g0) {
            this.f10732f0 = true;
        }
        if (this.G != null) {
            D();
        }
        this.F.clear();
        A(getChildAt(0));
        z();
        invalidate();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        z();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10731e0) {
            motionEvent.offsetLocation(g.f34069a, (getScrollY() + this.H) - C(this.G));
        }
        if (motionEvent.getAction() == 0) {
            this.f10737k0 = false;
        }
        if (this.f10737k0) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            super.onTouchEvent(obtain);
            this.f10737k0 = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f10737k0 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        super.setClipToPadding(z10);
        this.f10732f0 = z10;
        this.f10733g0 = true;
    }

    public void setShadowHeight(int i10) {
        this.f10735i0 = i10;
    }

    public final void z() {
        int paddingTop;
        float min;
        int paddingTop2;
        Iterator it = this.F.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            View view3 = (View) it.next();
            if (this.f10736j0 == null) {
                this.f10736j0 = (GradientDrawable) view3.getBackground();
            }
            if (this.f10734h0 == null) {
                this.f10734h0 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            }
            int C = C(view3) - getScrollY();
            if (this.f10732f0) {
                paddingTop2 = 0;
            } else {
                paddingTop2 = getPaddingTop();
            }
            int i11 = C + paddingTop2;
            if (i11 <= 0) {
                if (view != null) {
                    int C2 = C(view) - getScrollY();
                    if (!this.f10732f0) {
                        i10 = getPaddingTop();
                    }
                    if (i11 > C2 + i10) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    int C3 = C(view2) - getScrollY();
                    if (!this.f10732f0) {
                        i10 = getPaddingTop();
                    }
                    if (i11 < C3 + i10) {
                    }
                }
                view2 = view3;
            }
        }
        if (view != null) {
            if (view2 == null) {
                min = 0.0f;
            } else {
                int C4 = C(view2) - getScrollY();
                if (this.f10732f0) {
                    paddingTop = 0;
                } else {
                    paddingTop = getPaddingTop();
                }
                min = Math.min(0, (C4 + paddingTop) - view.getHeight());
            }
            this.H = min;
            View view4 = this.G;
            if (view != view4) {
                if (view4 != null) {
                    D();
                }
                this.J = B(view);
                this.G = view;
                GradientDrawable gradientDrawable = this.f10736j0;
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(g.f34069a);
                }
                this.f10734h0.setMargins(0, 0, 0, 0);
                view.requestLayout();
                if (String.valueOf(this.G.getTag()).contains("-hastransparancy")) {
                    this.G.setAlpha(g.f34069a);
                }
                if (((String) this.G.getTag()).contains("-nonconstant")) {
                    post(this.I);
                    return;
                }
                return;
            }
            return;
        }
        if (this.G != null) {
            D();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        super.addView(view, i10);
        A(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        A(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
        A(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        A(view);
    }
}
