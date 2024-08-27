package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import d4.n1;
import m.a2;
import m.d4;
import s0.g;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1022a;

    /* renamed from: b, reason: collision with root package name */
    public int f1023b;

    /* renamed from: c, reason: collision with root package name */
    public int f1024c;

    /* renamed from: d, reason: collision with root package name */
    public int f1025d;

    /* renamed from: e, reason: collision with root package name */
    public int f1026e;

    /* renamed from: f, reason: collision with root package name */
    public int f1027f;

    /* renamed from: g, reason: collision with root package name */
    public float f1028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1029h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1030i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1031j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1032k;

    /* renamed from: l, reason: collision with root package name */
    public int f1033l;

    /* renamed from: m, reason: collision with root package name */
    public int f1034m;

    /* renamed from: n, reason: collision with root package name */
    public int f1035n;

    /* renamed from: o, reason: collision with root package name */
    public int f1036o;

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a2;
    }

    public final void f(Canvas canvas, int i10) {
        this.f1032k.setBounds(getPaddingLeft() + this.f1036o, i10, (getWidth() - getPaddingRight()) - this.f1036o, this.f1034m + i10);
        this.f1032k.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.f1032k.setBounds(i10, getPaddingTop() + this.f1036o, this.f1033l + i10, (getHeight() - getPaddingBottom()) - this.f1036o);
        this.f1032k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1023b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1023b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1023b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1024c;
            if (this.f1025d == 1 && (i10 = this.f1026e & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1027f;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1027f) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a2) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1023b;
    }

    public Drawable getDividerDrawable() {
        return this.f1032k;
    }

    public int getDividerPadding() {
        return this.f1036o;
    }

    public int getDividerWidth() {
        return this.f1033l;
    }

    public int getGravity() {
        return this.f1026e;
    }

    public int getOrientation() {
        return this.f1025d;
    }

    public int getShowDividers() {
        return this.f1035n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1028g;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m.a2, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [m.a2, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a2 generateDefaultLayoutParams() {
        int i10 = this.f1025d;
        if (i10 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a2, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a2 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a2, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            if ((this.f1035n & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i10 == getChildCount()) {
            if ((this.f1035n & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f1035n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.f1032k == null) {
            return;
        }
        int i11 = 0;
        if (this.f1025d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a2) childAt.getLayoutParams())).topMargin) - this.f1034m);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1034m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a2) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = d4.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                a2 a2Var = (a2) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) a2Var).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) a2Var).leftMargin) - this.f1033l;
                }
                g(canvas, left2);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.f1033l;
                    right = left - i10;
                }
            } else {
                a2 a2Var2 = (a2) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) a2Var2).leftMargin;
                    i10 = this.f1033l;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) a2Var2).rightMargin;
                }
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1022a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1023b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1032k) {
            return;
        }
        this.f1032k = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f1033l = drawable.getIntrinsicWidth();
            this.f1034m = drawable.getIntrinsicHeight();
        } else {
            this.f1033l = 0;
            this.f1034m = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1036o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1026e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1026e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1026e;
        if ((8388615 & i12) != i11) {
            this.f1026e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1029h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1025d != i10) {
            this.f1025d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1035n) {
            requestLayout();
        }
        this.f1035n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1026e;
        if ((i12 & 112) != i11) {
            this.f1026e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1028g = Math.max(g.f34069a, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1022a = true;
        this.f1023b = -1;
        this.f1024c = 0;
        this.f1026e = 8388659;
        int[] iArr = g.a.f16362n;
        h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
        n1.m(this, context, iArr, attributeSet, (TypedArray) cVar.f17584c, i10);
        int z10 = cVar.z(1, -1);
        if (z10 >= 0) {
            setOrientation(z10);
        }
        int z11 = cVar.z(0, -1);
        if (z11 >= 0) {
            setGravity(z11);
        }
        boolean q10 = cVar.q(2, true);
        if (!q10) {
            setBaselineAligned(q10);
        }
        this.f1028g = ((TypedArray) cVar.f17584c).getFloat(4, -1.0f);
        this.f1023b = cVar.z(3, -1);
        this.f1029h = cVar.q(7, false);
        setDividerDrawable(cVar.v(5));
        this.f1035n = cVar.z(8, 0);
        this.f1036o = cVar.u(6, 0);
        cVar.R();
    }
}
