package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import pm.b;
import pm.g;
import pm.h;
import pm.i;
import pm.k;

/* loaded from: classes.dex */
public class FloatingActionMenu extends ViewGroup {
    public final int A;
    public final float B;
    public final float C;
    public final float D;
    public int E;
    public int F;
    public int G;
    public final Drawable H;
    public int I;
    public final OvershootInterpolator J;

    /* renamed from: a, reason: collision with root package name */
    public final AnimatorSet f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimatorSet f11013b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f11014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11015d;

    /* renamed from: e, reason: collision with root package name */
    public final FloatingActionButton f11016e;

    /* renamed from: e0, reason: collision with root package name */
    public final AnticipateInterpolator f11017e0;

    /* renamed from: f, reason: collision with root package name */
    public int f11018f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f11019f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f11020g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f11021g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f11022h;

    /* renamed from: h0, reason: collision with root package name */
    public final int f11023h0;

    /* renamed from: i, reason: collision with root package name */
    public int f11024i;

    /* renamed from: i0, reason: collision with root package name */
    public final int f11025i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11026j;

    /* renamed from: j0, reason: collision with root package name */
    public final int f11027j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11028k;

    /* renamed from: k0, reason: collision with root package name */
    public final int f11029k0;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f11030l;

    /* renamed from: l0, reason: collision with root package name */
    public final Typeface f11031l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f11032m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f11033m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f11034n;
    public final ImageView n0;

    /* renamed from: o, reason: collision with root package name */
    public final int f11035o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f11036o0;

    /* renamed from: p, reason: collision with root package name */
    public final int f11037p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f11038p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f11039q;

    /* renamed from: q0, reason: collision with root package name */
    public final ValueAnimator f11040q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f11041r;

    /* renamed from: r0, reason: collision with root package name */
    public final ValueAnimator f11042r0;

    /* renamed from: s, reason: collision with root package name */
    public final ColorStateList f11043s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f11044s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f11045t;

    /* renamed from: t0, reason: collision with root package name */
    public final int f11046t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f11047u;

    /* renamed from: u0, reason: collision with root package name */
    public final ContextThemeWrapper f11048u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11049v;

    /* renamed from: v0, reason: collision with root package name */
    public final String f11050v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f11051w;

    /* renamed from: w0, reason: collision with root package name */
    public final boolean f11052w0;

    /* renamed from: x, reason: collision with root package name */
    public final int f11053x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11054y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f11055z;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x032c, code lost:
    
        if (r1 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x032e, code lost:
    
        r2 = -135.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0339, code lost:
    
        r1 = android.animation.ObjectAnimator.ofFloat(r19.n0, "rotation", r4, s0.g.f34069a);
        r9.play(android.animation.ObjectAnimator.ofFloat(r19.n0, "rotation", s0.g.f34069a, r2));
        r10.play(r1);
        r9.setInterpolator(r19.J);
        r10.setInterpolator(r19.f11017e0);
        r9.setDuration(300L);
        r10.setDuration(300L);
        r1 = r0.getResourceId(9, com.assetgro.stockgro.prod.R.anim.fab_scale_up);
        setMenuButtonShowAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r1));
        android.view.animation.AnimationUtils.loadAnimation(getContext(), r1);
        r1 = r0.getResourceId(7, com.assetgro.stockgro.prod.R.anim.fab_scale_down);
        setMenuButtonHideAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r1));
        android.view.animation.AnimationUtils.loadAnimation(getContext(), r1);
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0337, code lost:
    
        if (r1 == 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionMenu(android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.clans.fab.FloatingActionMenu.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setLabelEllipsize(k kVar) {
        int i10 = this.f11023h0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        kVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        return;
                    }
                    return;
                }
                kVar.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            kVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            return;
        }
        kVar.setEllipsize(TextUtils.TruncateAt.START);
    }

    public final void a(boolean z10) {
        if (this.f11026j) {
            if (this.f11044s0 != 0) {
                this.f11042r0.start();
            }
            if (this.f11033m0) {
                AnimatorSet animatorSet = this.f11014c;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f11013b.start();
                    this.f11012a.cancel();
                }
            }
            int i10 = 0;
            this.f11028k = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int childCount = getChildCount();
                Handler handler = this.f11030l;
                if (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                        i11++;
                        handler.postDelayed(new g(this, (FloatingActionButton) childAt, z10, 1), i12);
                        i12 += this.I;
                    }
                    i10++;
                } else {
                    handler.postDelayed(new h(this, 1), (i11 + 1) * this.I);
                    return;
                }
            }
        }
    }

    public final void b(boolean z10) {
        boolean z11 = this.f11026j;
        if (z11) {
            a(z10);
            return;
        }
        if (!z11) {
            if (this.f11044s0 != 0) {
                this.f11040q0.start();
            }
            if (this.f11033m0) {
                AnimatorSet animatorSet = this.f11014c;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f11013b.cancel();
                    this.f11012a.start();
                }
            }
            this.f11028k = true;
            int childCount = getChildCount() - 1;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                Handler handler = this.f11030l;
                if (childCount >= 0) {
                    View childAt = getChildAt(childCount);
                    if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                        i10++;
                        handler.postDelayed(new g(this, (FloatingActionButton) childAt, z10, 0), i11);
                        i11 += this.I;
                    }
                    childCount--;
                } else {
                    handler.postDelayed(new h(this, 0), (i10 + 1) * this.I);
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimationDelayPerItem() {
        return this.I;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.f11014c;
    }

    public int getMenuButtonColorNormal() {
        return this.E;
    }

    public int getMenuButtonColorPressed() {
        return this.F;
    }

    public int getMenuButtonColorRipple() {
        return this.G;
    }

    public String getMenuButtonLabelText() {
        return this.f11050v0;
    }

    public ImageView getMenuIconView() {
        return this.n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.TextView, android.view.View, java.lang.Object, pm.k] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f11016e);
        bringChildToFront(this.n0);
        this.f11024i = getChildCount();
        for (int i10 = 0; i10 < this.f11024i; i10++) {
            if (getChildAt(i10) != this.n0) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i10);
                if (floatingActionButton.getTag(R.id.fab_label) == null) {
                    String labelText = floatingActionButton.getLabelText();
                    if (!TextUtils.isEmpty(labelText)) {
                        ?? textView = new TextView(this.f11048u0);
                        textView.f31210f = true;
                        textView.f31221q = true;
                        textView.f31222r = new GestureDetector(textView.getContext(), new b(textView, 1));
                        textView.setClickable(true);
                        textView.setFab(floatingActionButton);
                        textView.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f11032m));
                        textView.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f11034n));
                        if (this.f11029k0 > 0) {
                            textView.setTextAppearance(getContext(), this.f11029k0);
                            textView.setShowShadow(false);
                            textView.setUsingStyle(true);
                        } else {
                            int i11 = this.f11051w;
                            int i12 = this.f11053x;
                            int i13 = this.f11054y;
                            textView.f31213i = i11;
                            textView.f31214j = i12;
                            textView.f31215k = i13;
                            textView.setShowShadow(this.f11049v);
                            textView.setCornerRadius(this.f11047u);
                            if (this.f11023h0 > 0) {
                                setLabelEllipsize(textView);
                            }
                            textView.setMaxLines(this.f11025i0);
                            textView.e();
                            textView.setTextSize(0, this.f11045t);
                            textView.setTextColor(this.f11043s);
                            int i14 = this.f11041r;
                            int i15 = this.f11035o;
                            if (this.f11049v) {
                                i14 += Math.abs(floatingActionButton.getShadowXOffset()) + floatingActionButton.getShadowRadius();
                                i15 += Math.abs(floatingActionButton.getShadowYOffset()) + floatingActionButton.getShadowRadius();
                            }
                            textView.setPadding(i14, i15, this.f11041r, this.f11035o);
                            if (this.f11025i0 < 0 || this.f11021g0) {
                                textView.setSingleLine(this.f11021g0);
                            }
                        }
                        Typeface typeface = this.f11031l0;
                        if (typeface != null) {
                            textView.setTypeface(typeface);
                        }
                        textView.setText(labelText);
                        textView.setOnClickListener(floatingActionButton.getOnClickListener());
                        addView(textView);
                        floatingActionButton.setTag(R.id.fab_label, textView);
                    }
                    FloatingActionButton floatingActionButton2 = this.f11016e;
                    if (floatingActionButton == floatingActionButton2) {
                        floatingActionButton2.setOnClickListener(new h.b(this, 4));
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        boolean z11;
        int paddingTop;
        int measuredWidth;
        int i14;
        int measuredWidth2;
        int i15;
        if (this.f11046t0 == 0) {
            paddingLeft = ((i12 - i10) - (this.f11018f / 2)) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft() + (this.f11018f / 2);
        }
        if (this.f11038p0 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingTop = ((i13 - i11) - this.f11016e.getMeasuredHeight()) - getPaddingBottom();
        } else {
            paddingTop = getPaddingTop();
        }
        int measuredWidth3 = paddingLeft - (this.f11016e.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f11016e;
        floatingActionButton.layout(measuredWidth3, paddingTop, floatingActionButton.getMeasuredWidth() + measuredWidth3, this.f11016e.getMeasuredHeight() + paddingTop);
        int measuredWidth4 = paddingLeft - (this.n0.getMeasuredWidth() / 2);
        int measuredHeight = ((this.f11016e.getMeasuredHeight() / 2) + paddingTop) - (this.n0.getMeasuredHeight() / 2);
        ImageView imageView = this.n0;
        imageView.layout(measuredWidth4, measuredHeight, imageView.getMeasuredWidth() + measuredWidth4, this.n0.getMeasuredHeight() + measuredHeight);
        if (z11) {
            paddingTop = this.f11015d + this.f11016e.getMeasuredHeight() + paddingTop;
        }
        for (int i16 = this.f11024i - 1; i16 >= 0; i16--) {
            View childAt = getChildAt(i16);
            if (childAt != this.n0) {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) childAt;
                if (floatingActionButton2.getVisibility() != 8) {
                    int measuredWidth5 = paddingLeft - (floatingActionButton2.getMeasuredWidth() / 2);
                    if (z11) {
                        paddingTop = (paddingTop - floatingActionButton2.getMeasuredHeight()) - this.f11015d;
                    }
                    if (floatingActionButton2 != this.f11016e) {
                        floatingActionButton2.layout(measuredWidth5, paddingTop, floatingActionButton2.getMeasuredWidth() + measuredWidth5, floatingActionButton2.getMeasuredHeight() + paddingTop);
                        if (!this.f11028k) {
                            floatingActionButton2.g(false);
                        }
                    }
                    View view = (View) floatingActionButton2.getTag(R.id.fab_label);
                    if (view != null) {
                        if (this.f11052w0) {
                            measuredWidth = this.f11018f;
                        } else {
                            measuredWidth = floatingActionButton2.getMeasuredWidth();
                        }
                        int i17 = (measuredWidth / 2) + this.f11020g;
                        int i18 = this.f11046t0;
                        if (i18 == 0) {
                            i14 = paddingLeft - i17;
                        } else {
                            i14 = i17 + paddingLeft;
                        }
                        if (i18 == 0) {
                            measuredWidth2 = i14 - view.getMeasuredWidth();
                        } else {
                            measuredWidth2 = view.getMeasuredWidth() + i14;
                        }
                        int i19 = this.f11046t0;
                        if (i19 == 0) {
                            i15 = measuredWidth2;
                        } else {
                            i15 = i14;
                        }
                        if (i19 != 0) {
                            i14 = measuredWidth2;
                        }
                        int measuredHeight2 = ((floatingActionButton2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (paddingTop - this.f11022h);
                        view.layout(i15, measuredHeight2, i14, view.getMeasuredHeight() + measuredHeight2);
                        if (!this.f11028k) {
                            view.setVisibility(4);
                        }
                    }
                    if (z11) {
                        paddingTop -= this.f11015d;
                    } else {
                        paddingTop = this.f11015d + childAt.getMeasuredHeight() + paddingTop;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f11018f = 0;
        measureChildWithMargins(this.n0, i10, 0, i11, 0);
        for (int i13 = 0; i13 < this.f11024i; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && childAt != this.n0) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                this.f11018f = Math.max(this.f11018f, childAt.getMeasuredWidth());
            }
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (i15 >= this.f11024i) {
                break;
            }
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && childAt2 != this.n0) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight() + i14;
                k kVar = (k) childAt2.getTag(R.id.fab_label);
                if (kVar != null) {
                    int measuredWidth2 = this.f11018f - childAt2.getMeasuredWidth();
                    if (!this.f11052w0) {
                        i17 = 2;
                    }
                    int i18 = measuredWidth2 / i17;
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    if (kVar.f31210f) {
                        i12 = Math.abs(kVar.f31206b) + kVar.f31205a;
                    } else {
                        i12 = 0;
                    }
                    measureChildWithMargins(kVar, i10, i12 + measuredWidth3 + this.f11020g + i18, i11, 0);
                    i16 = Math.max(i16, kVar.getMeasuredWidth() + measuredWidth + i18);
                }
                i14 = measuredHeight;
            }
            i15++;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.f11018f, i16 + this.f11020g);
        double paddingBottom = getPaddingBottom() + getPaddingTop() + ((this.f11024i - 1) * this.f11015d) + i14;
        int i19 = (int) ((0.03d * paddingBottom) + paddingBottom);
        if (getLayoutParams().width == -1) {
            paddingRight = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        }
        if (getLayoutParams().height == -1) {
            i19 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        }
        setMeasuredDimension(paddingRight, i19);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11036o0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                a(this.f11019f0);
                return true;
            }
            return this.f11026j;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimated(boolean z10) {
        long j10;
        this.f11019f0 = z10;
        long j11 = 0;
        if (z10) {
            j10 = 300;
        } else {
            j10 = 0;
        }
        this.f11012a.setDuration(j10);
        if (z10) {
            j11 = 300;
        }
        this.f11013b.setDuration(j11);
    }

    public void setAnimationDelayPerItem(int i10) {
        this.I = i10;
    }

    public void setClosedOnTouchOutside(boolean z10) {
        this.f11036o0 = z10;
    }

    public void setIconAnimated(boolean z10) {
        this.f11033m0 = z10;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.f11013b.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f11012a.setInterpolator(interpolator);
        this.f11013b.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.f11012a.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.f11014c = animatorSet;
    }

    public void setMenuButtonColorNormal(int i10) {
        this.E = i10;
        this.f11016e.setColorNormal(i10);
    }

    public void setMenuButtonColorNormalResId(int i10) {
        this.E = getResources().getColor(i10);
        this.f11016e.setColorNormalResId(i10);
    }

    public void setMenuButtonColorPressed(int i10) {
        this.F = i10;
        this.f11016e.setColorPressed(i10);
    }

    public void setMenuButtonColorPressedResId(int i10) {
        this.F = getResources().getColor(i10);
        this.f11016e.setColorPressedResId(i10);
    }

    public void setMenuButtonColorRipple(int i10) {
        this.G = i10;
        this.f11016e.setColorRipple(i10);
    }

    public void setMenuButtonColorRippleResId(int i10) {
        this.G = getResources().getColor(i10);
        this.f11016e.setColorRippleResId(i10);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.f11016e.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.f11016e.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.f11016e.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.f11016e.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11016e.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(i iVar) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
