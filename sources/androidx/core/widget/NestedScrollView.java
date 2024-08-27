package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import d4.b0;
import d4.c0;
import d4.i;
import d4.n1;
import d4.v0;
import d4.y;
import d4.z;
import h.c;
import h.h;
import h4.f;
import h4.j;
import h4.k;
import h4.l;
import h4.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import qu.i0;
import s0.g;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements b0, y {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final j D = new j(0);
    public static final int[] E = {R.attr.fillViewport};
    public l A;
    public final i B;

    /* renamed from: a, reason: collision with root package name */
    public final float f1517a;

    /* renamed from: b, reason: collision with root package name */
    public long f1518b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1519c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f1520d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1521e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1522f;

    /* renamed from: g, reason: collision with root package name */
    public int f1523g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1524h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1525i;

    /* renamed from: j, reason: collision with root package name */
    public View f1526j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1527k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1528l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1529m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1530n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1531o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1532p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1533q;

    /* renamed from: r, reason: collision with root package name */
    public int f1534r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1535s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1536t;

    /* renamed from: u, reason: collision with root package name */
    public int f1537u;

    /* renamed from: v, reason: collision with root package name */
    public int f1538v;

    /* renamed from: w, reason: collision with root package name */
    public m f1539w;

    /* renamed from: x, reason: collision with root package name */
    public final c0 f1540x;

    /* renamed from: y, reason: collision with root package name */
    public final z f1541y;

    /* renamed from: z, reason: collision with root package name */
    public float f1542z;

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.assetgro.stockgro.prod.R.attr.nestedScrollViewStyle);
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && l((View) parent, view2)) {
            return true;
        }
        return false;
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f1519c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(b(rect), 0, 1, true);
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!m(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int b(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    @Override // d4.b0
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // d4.a0
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f1541y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f1541y.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f1541y.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f1541y.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1521e;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (k.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (k.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1522f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (k.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = getPaddingLeft();
            }
            if (k.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, g.f34069a);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = n1.f13788a;
                v0.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // d4.a0
    public final boolean e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // d4.a0
    public final void f(View view, View view2, int i10, int i11) {
        this.f1540x.d(i10, i11);
        w(2, i11);
    }

    @Override // d4.a0
    public final void g(View view, int i10) {
        c0 c0Var = this.f1540x;
        if (i10 == 1) {
            c0Var.f13728b = 0;
        } else {
            c0Var.f13727a = 0;
        }
        y(i10);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return g.f34069a;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.f1540x;
        return c0Var.f13728b | c0Var.f13727a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return g.f34069a;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1542z == g.f34069a) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f1542z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1542z;
    }

    @Override // d4.a0
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        this.f1541y.c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1541y.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1519c.setEmpty();
        int i10 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                        q(130);
                                        return false;
                                    }
                                    q(33);
                                    return false;
                                }
                                return k(130);
                            }
                            return k(33);
                        }
                        if (keyEvent.isShiftPressed()) {
                            i10 = 33;
                        }
                        q(i10);
                        return false;
                    }
                    if (keyEvent.isAltPressed()) {
                        return k(130);
                    }
                    return a(130);
                }
                if (keyEvent.isAltPressed()) {
                    return k(33);
                }
                return a(33);
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1541y.f13868d;
    }

    public final void j(int i10) {
        if (getChildCount() > 0) {
            this.f1520d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            w(2, 1);
            this.f1538v = getScrollY();
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
    }

    public final boolean k(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f1519c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.f1519c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1541y.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1534r) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f1523g = (int) motionEvent.getY(i10);
            this.f1534r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1528l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1525i = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float f10;
        if (motionEvent.getAction() == 8 && !this.f1527k) {
            if (yk.j.f1(motionEvent, 2)) {
                i10 = 9;
                f10 = motionEvent.getAxisValue(9);
                i11 = (int) motionEvent.getX();
            } else if (yk.j.f1(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i11 = getWidth() / 2;
                i10 = 26;
                f10 = axisValue;
            } else {
                i10 = 0;
                i11 = 0;
                f10 = 0.0f;
            }
            if (f10 != g.f34069a) {
                s(-((int) (getVerticalScrollFactorCompat() * f10)), i11, 1, yk.j.f1(motionEvent, 8194));
                if (i10 != 0) {
                    this.B.a(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f1527k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f1534r;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f1523g) > this.f1531o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1527k = true;
                                this.f1523g = y10;
                                if (this.f1528l == null) {
                                    this.f1528l = VelocityTracker.obtain();
                                }
                                this.f1528l.addMovement(motionEvent);
                                this.f1537u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f1527k = false;
            this.f1534r = -1;
            VelocityTracker velocityTracker = this.f1528l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1528l = null;
            }
            if (this.f1520d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.k(this);
            }
            y(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.f1523g = y11;
                    this.f1534r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1528l;
                    if (velocityTracker2 == null) {
                        this.f1528l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1528l.addMovement(motionEvent);
                    this.f1520d.computeScrollOffset();
                    if (!x(motionEvent) && this.f1520d.isFinished()) {
                        z10 = false;
                    }
                    this.f1527k = z10;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.f1520d.isFinished()) {
                z10 = false;
            }
            this.f1527k = z10;
            VelocityTracker velocityTracker3 = this.f1528l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1528l = null;
            }
        }
        return this.f1527k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f1524h = false;
        View view = this.f1526j;
        if (view != null && l(view, this)) {
            View view2 = this.f1526j;
            Rect rect = this.f1519c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.f1526j = null;
        if (!this.f1525i) {
            if (this.f1539w != null) {
                scrollTo(getScrollX(), this.f1539w.f17980a);
                this.f1539w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1525i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1529m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!z10) {
            dispatchNestedFling(g.f34069a, f11, true);
            j((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f1541y.c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ m(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f1539w = mVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, h4.m] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f17980a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        l lVar = this.A;
        if (lVar != null) {
            c cVar = (c) lVar;
            h.b(this, (View) cVar.f17583b, (View) cVar.f17584c);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i13)) {
            Rect rect = this.f1519c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                if (this.f1530n) {
                    u(0, b10, false);
                } else {
                    scrollBy(0, b10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1528l == null) {
            this.f1528l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1537u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = this.f1537u;
        float f11 = g.f34069a;
        obtain.offsetLocation(g.f34069a, f10);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1522f;
            EdgeEffect edgeEffect2 = this.f1521e;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                o(motionEvent);
                                this.f1523g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1534r));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f1523g = (int) motionEvent.getY(actionIndex);
                            this.f1534r = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f1527k && getChildCount() > 0 && this.f1520d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            WeakHashMap weakHashMap = n1.f13788a;
                            v0.k(this);
                        }
                        this.f1534r = -1;
                        this.f1527k = false;
                        VelocityTracker velocityTracker = this.f1528l;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f1528l = null;
                        }
                        y(0);
                        this.f1521e.onRelease();
                        this.f1522f.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1534r);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f1534r + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(findPointerIndex);
                        int i10 = this.f1523g - y10;
                        float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i10 / getHeight();
                        if (i0.v(edgeEffect2) != g.f34069a) {
                            float f12 = -i0.D(edgeEffect2, -height, x10);
                            if (i0.v(edgeEffect2) == g.f34069a) {
                                edgeEffect2.onRelease();
                            }
                            f11 = f12;
                        } else if (i0.v(edgeEffect) != g.f34069a) {
                            float D2 = i0.D(edgeEffect, height, 1.0f - x10);
                            if (i0.v(edgeEffect) == g.f34069a) {
                                edgeEffect.onRelease();
                            }
                            f11 = D2;
                        }
                        int round = Math.round(f11 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i11 = i10 - round;
                        if (!this.f1527k && Math.abs(i11) > this.f1531o) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1527k = true;
                            i11 = i11 > 0 ? i11 - this.f1531o : i11 + this.f1531o;
                        }
                        if (this.f1527k) {
                            int s7 = s(i11, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f1523g = y10 - s7;
                            this.f1537u += s7;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f1528l;
                velocityTracker2.computeCurrentVelocity(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, this.f1533q);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f1534r);
                if (Math.abs(yVelocity) >= this.f1532p) {
                    if (i0.v(edgeEffect2) != g.f34069a) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (i0.v(edgeEffect) != g.f34069a) {
                        int i12 = -yVelocity;
                        if (t(edgeEffect, i12)) {
                            edgeEffect.onAbsorb(i12);
                        } else {
                            j(i12);
                        }
                    } else {
                        int i13 = -yVelocity;
                        float f13 = i13;
                        if (!dispatchNestedPreFling(g.f34069a, f13)) {
                            dispatchNestedFling(g.f34069a, f13, true);
                            j(i13);
                        }
                    }
                } else if (this.f1520d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap2 = n1.f13788a;
                    v0.k(this);
                }
                this.f1534r = -1;
                this.f1527k = false;
                VelocityTracker velocityTracker3 = this.f1528l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1528l = null;
                }
                y(0);
                this.f1521e.onRelease();
                this.f1522f.onRelease();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1527k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1520d.isFinished()) {
                this.f1520d.abortAnimation();
                y(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1523g = y11;
            this.f1534r = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1528l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 > 0 || i11 < 0) {
            i11 = 0;
            z10 = true;
        } else {
            z10 = false;
        }
        if (i14 <= i13) {
            if (i14 < 0) {
                i13 = 0;
            } else {
                i13 = i14;
                z11 = false;
                if (z11 && !this.f1541y.g(1)) {
                    this.f1520d.springBack(i11, i13, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i11, i13, z10, z11);
                if (z10 && !z11) {
                    return false;
                }
            }
        }
        z11 = true;
        if (z11) {
            this.f1520d.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i13, z10, z11);
        return z10 ? true : true;
    }

    public final void q(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f1519c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            s(i13, 0, 1, true);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1524h) {
            Rect rect = this.f1519c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.f1526j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        if (b10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                u(0, b10, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f1528l) != null) {
            velocityTracker.recycle();
            this.f1528l = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1524h = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            w(2, i12);
        }
        boolean c10 = this.f1541y.c(0, i10, i12, this.f1536t, this.f1535s);
        int[] iArr = this.f1536t;
        int[] iArr2 = this.f1535s;
        if (c10) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (p(i13, 0, scrollY, scrollRange) && !this.f1541y.g(i12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1541y.e(0, scrollY2, 0, i13 - scrollY2, this.f1535s, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f1522f;
        EdgeEffect edgeEffect2 = this.f1521e;
        if (i17 < 0) {
            if (z11) {
                i0.D(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            i0.D(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            if (z12 && i12 == 0 && (velocityTracker = this.f1528l) != null) {
                velocityTracker.clear();
            }
        } else {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
        if (i12 == 1) {
            y(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
            } else {
                i10 = 0;
            }
            if (height < height2 && i11 >= 0) {
                if (height + i11 > height2) {
                    i11 = height2 - height;
                }
            } else {
                i11 = 0;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1529m) {
            this.f1529m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f1541y.h(z10);
    }

    public void setOnScrollChangeListener(l lVar) {
        this.A = lVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1530n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f1541y.i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float v10 = i0.v(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1517a * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = C;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f10)) < v10) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1518b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1520d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f1538v = getScrollY();
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        } else {
            if (!this.f1520d.isFinished()) {
                this.f1520d.abortAnimation();
                y(1);
            }
            scrollBy(i10, i11);
        }
        this.f1518b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i10) {
        u(0 - getScrollX(), i10 - getScrollY(), false);
    }

    public final boolean w(int i10, int i11) {
        return this.f1541y.i(2, i11);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1521e;
        if (i0.v(edgeEffect) != g.f34069a) {
            i0.D(edgeEffect, g.f34069a, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1522f;
        if (i0.v(edgeEffect2) != g.f34069a) {
            i0.D(edgeEffect2, g.f34069a, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void y(int i10) {
        this.f1541y.j(i10);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [d4.c0, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1519c = new Rect();
        this.f1524h = true;
        this.f1525i = false;
        this.f1526j = null;
        this.f1527k = false;
        this.f1530n = true;
        this.f1534r = -1;
        this.f1535s = new int[2];
        this.f1536t = new int[2];
        this.B = new i(getContext(), new hr.c(this, 11));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = f.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1521e = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = f.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1522f = edgeEffect2;
        this.f1517a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1520d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1531o = viewConfiguration.getScaledTouchSlop();
        this.f1532p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1533q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1540x = new Object();
        this.f1541y = new z(this);
        setNestedScrollingEnabled(true);
        n1.n(this, D);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
