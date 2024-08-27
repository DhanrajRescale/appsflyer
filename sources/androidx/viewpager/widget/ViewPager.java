package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import c2.p;
import com.google.android.material.tabs.TabLayout;
import d4.b1;
import d4.n1;
import d4.v0;
import h.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import jr.h;
import l4.d;
import m.f2;
import r3.k;
import s0.g;
import x7.a;
import x7.b;
import x7.c;
import x7.e;
import x7.f;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f2469q0 = {R.attr.layout_gravity};

    /* renamed from: r0, reason: collision with root package name */
    public static final p f2470r0 = new p(5);

    /* renamed from: s0, reason: collision with root package name */
    public static final d f2471s0 = new d(4);
    public int A;
    public final int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public final int I;
    public final int J;

    /* renamed from: a, reason: collision with root package name */
    public int f2472a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2473b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2474c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2475d;

    /* renamed from: e, reason: collision with root package name */
    public a f2476e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f2477e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2478f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f2479f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2480g;

    /* renamed from: g0, reason: collision with root package name */
    public final EdgeEffect f2481g0;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f2482h;

    /* renamed from: h0, reason: collision with root package name */
    public final EdgeEffect f2483h0;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f2484i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2485i0;

    /* renamed from: j, reason: collision with root package name */
    public final Scroller f2486j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2487j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2488k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2489k0;

    /* renamed from: l, reason: collision with root package name */
    public f2 f2490l;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayList f2491l0;

    /* renamed from: m, reason: collision with root package name */
    public int f2492m;

    /* renamed from: m0, reason: collision with root package name */
    public f f2493m0;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2494n;
    public ArrayList n0;

    /* renamed from: o, reason: collision with root package name */
    public int f2495o;

    /* renamed from: o0, reason: collision with root package name */
    public final q0 f2496o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2497p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2498p0;

    /* renamed from: q, reason: collision with root package name */
    public float f2499q;

    /* renamed from: r, reason: collision with root package name */
    public float f2500r;

    /* renamed from: s, reason: collision with root package name */
    public int f2501s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2502t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2503u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2504v;

    /* renamed from: w, reason: collision with root package name */
    public int f2505w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2506x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2507y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2508z;

    /* JADX WARN: Type inference failed for: r5v2, types: [x7.c, java.lang.Object] */
    public ViewPager(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2473b = new ArrayList();
        this.f2474c = new Object();
        this.f2475d = new Rect();
        this.f2480g = -1;
        this.f2482h = null;
        this.f2484i = null;
        this.f2499q = -3.4028235E38f;
        this.f2500r = Float.MAX_VALUE;
        this.f2505w = 1;
        this.G = -1;
        this.f2485i0 = true;
        this.f2496o0 = new q0(this, 12);
        this.f2498p0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f2486j = new Scroller(context2, f2471s0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f10);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2481g0 = new EdgeEffect(context2);
        this.f2483h0 = new EdgeEffect(context2);
        this.f2477e0 = (int) (25.0f * f10);
        this.f2479f0 = (int) (2.0f * f10);
        this.f2508z = (int) (f10 * 16.0f);
        n1.n(this, new e(this, 0));
        if (v0.c(this) == 0) {
            v0.s(this, 1);
        }
        b1.u(this, new w6.e(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f2503u != z10) {
            this.f2503u = z10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x7.c, java.lang.Object] */
    public final c a(int i10, int i11) {
        ?? obj = new Object();
        obj.f40076b = i10;
        obj.f40075a = this.f2476e.d(i10, this);
        this.f2476e.getClass();
        obj.f40078d = 1.0f;
        ArrayList arrayList = this.f2473b;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, obj);
        } else {
            arrayList.add(obj);
        }
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c i12;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (i12 = i(childAt)) != null && i12.f40076b == this.f2478f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i10 = i(childAt)) != null && i10.f40076b == this.f2478f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        x7.d dVar = (x7.d) layoutParams;
        boolean z11 = dVar.f40080a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f40080a = z12;
        if (this.f2502t) {
            if (!z12) {
                dVar.f40083d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(f fVar) {
        if (this.f2491l0 == null) {
            this.f2491l0 = new ArrayList();
        }
        this.f2491l0.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.f2475d
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.h(r1, r6)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r0, r6)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.f2478f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f2504v = r3
            r7.v(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.h(r1, r6)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r0, r6)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.n()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.n()
            goto Lcf
        Lc2:
            int r0 = r7.f2478f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f2504v = r3
            r7.v(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f2476e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.f2499q))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.f2500r))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof x7.d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f2488k = true;
        if (!this.f2486j.isFinished() && this.f2486j.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f2486j.getCurrX();
            int currY = this.f2486j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!o(currX)) {
                    this.f2486j.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
            return;
        }
        e(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L63
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L62
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L62
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L5f
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L62
            boolean r6 = r5.c(r1)
            goto L5f
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.n()
            goto L5f
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L5f
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L59
            int r6 = r5.f2478f
            if (r6 <= 0) goto L62
            int r6 = r6 - r1
            r5.f2504v = r2
            r5.v(r6, r2, r1, r2)
            goto L63
        L59:
            r6 = 17
            boolean r6 = r5.c(r6)
        L5f:
            if (r6 == 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c i10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i10 = i(childAt)) != null && i10.f40076b == this.f2478f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f2476e) == null || aVar.c() <= 1)) {
            this.f2481g0.finish();
            this.f2483h0.finish();
            return;
        }
        if (!this.f2481g0.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.f2499q * width);
            this.f2481g0.setSize(height, width);
            z10 = this.f2481g0.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        if (!this.f2483h0.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f2500r + 1.0f)) * width2);
            this.f2483h0.setSize(height2, width2);
            z10 |= this.f2483h0.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z10) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2494n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f2498p0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f2486j.isFinished()) {
                this.f2486j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2486j.getCurrX();
                int currY = this.f2486j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.f2504v = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2473b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f40077c) {
                cVar.f40077c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            q0 q0Var = this.f2496o0;
            if (z10) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.m(this, q0Var);
            } else {
                q0Var.run();
            }
        }
    }

    public final void f() {
        boolean z10;
        int c10 = this.f2476e.c();
        this.f2472a = c10;
        ArrayList arrayList = this.f2473b;
        if (arrayList.size() < (this.f2505w * 2) + 1 && arrayList.size() < c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f2478f;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar = (c) arrayList.get(i11);
            a aVar = this.f2476e;
            Object obj = cVar.f40075a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f2470r0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                x7.d dVar = (x7.d) getChildAt(i12).getLayoutParams();
                if (!dVar.f40080a) {
                    dVar.f40082c = g.f34069a;
                }
            }
            v(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i10) {
        f fVar = this.f2493m0;
        if (fVar != null) {
            fVar.b(i10);
        }
        ArrayList arrayList = this.f2491l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f2491l0.get(i11);
                if (fVar2 != null) {
                    fVar2.b(i10);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x7.d, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f40082c = g.f34069a;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f2476e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2478f;
    }

    public int getOffscreenPageLimit() {
        return this.f2505w;
    }

    public int getPageMargin() {
        return this.f2492m;
    }

    public final Rect h(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final c i(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2473b;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (this.f2476e.e(view, cVar.f40075a)) {
                    return cVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final c j() {
        float f10;
        float f11;
        c cVar;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = g.f34069a;
        if (clientWidth > 0) {
            f10 = getScrollX() / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.f2492m / clientWidth;
        } else {
            f11 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        c cVar2 = null;
        int i12 = -1;
        float f13 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f2473b;
            if (i11 < arrayList.size()) {
                c cVar3 = (c) arrayList.get(i11);
                if (!z10 && cVar3.f40076b != (i10 = i12 + 1)) {
                    float f14 = f12 + f13 + f11;
                    c cVar4 = this.f2474c;
                    cVar4.f40079e = f14;
                    cVar4.f40076b = i10;
                    this.f2476e.getClass();
                    cVar4.f40078d = 1.0f;
                    i11--;
                    cVar = cVar4;
                } else {
                    cVar = cVar3;
                }
                f12 = cVar.f40079e;
                float f15 = cVar.f40078d + f12 + f11;
                if (!z10 && f10 < f12) {
                    return cVar2;
                }
                if (f10 < f15 || i11 == arrayList.size() - 1) {
                    break;
                }
                int i13 = cVar.f40076b;
                float f16 = cVar.f40078d;
                i11++;
                z10 = false;
                c cVar5 = cVar;
                i12 = i13;
                f13 = f16;
                cVar2 = cVar5;
            } else {
                return cVar2;
            }
        }
        return cVar;
    }

    public final c k(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2473b;
            if (i11 < arrayList.size()) {
                c cVar = (c) arrayList.get(i11);
                if (cVar.f40076b == i10) {
                    return cVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f2489k0
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            x7.d r8 = (x7.d) r8
            boolean r9 = r8.f40080a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f40081b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            x7.f r14 = r11.f2493m0
            if (r14 == 0) goto L73
            r14.c(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.f2491l0
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.f2491l0
            java.lang.Object r2 = r2.get(r0)
            x7.f r2 = (x7.f) r2
            if (r2 == 0) goto L8a
            r2.c(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.f2487j0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.C = motionEvent.getX(i10);
            this.G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        a aVar = this.f2476e;
        if (aVar == null || this.f2478f >= aVar.c() - 1) {
            return false;
        }
        int i10 = this.f2478f + 1;
        this.f2504v = false;
        v(i10, 0, true, false);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f2473b.size() == 0) {
            if (this.f2485i0) {
                return false;
            }
            this.f2487j0 = false;
            l(0, g.f34069a, 0);
            if (this.f2487j0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        c j10 = j();
        int clientWidth = getClientWidth();
        int i11 = this.f2492m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = j10.f40076b;
        float f11 = ((i10 / f10) - j10.f40079e) / (j10.f40078d + (i11 / f10));
        this.f2487j0 = false;
        l(i13, f11, (int) (i12 * f11));
        if (this.f2487j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2485i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2496o0);
        Scroller scroller = this.f2486j;
        if (scroller != null && !scroller.isFinished()) {
            this.f2486j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        ArrayList arrayList;
        float f11;
        super.onDraw(canvas);
        if (this.f2492m > 0 && this.f2494n != null) {
            ArrayList arrayList2 = this.f2473b;
            if (arrayList2.size() > 0 && this.f2476e != null) {
                int scrollX = getScrollX();
                float width = getWidth();
                float f12 = this.f2492m / width;
                int i11 = 0;
                c cVar = (c) arrayList2.get(0);
                float f13 = cVar.f40079e;
                int size = arrayList2.size();
                int i12 = cVar.f40076b;
                int i13 = ((c) arrayList2.get(size - 1)).f40076b;
                while (i12 < i13) {
                    while (true) {
                        i10 = cVar.f40076b;
                        if (i12 <= i10 || i11 >= size) {
                            break;
                        }
                        i11++;
                        cVar = (c) arrayList2.get(i11);
                    }
                    if (i12 == i10) {
                        float f14 = cVar.f40079e;
                        float f15 = cVar.f40078d;
                        f10 = (f14 + f15) * width;
                        f13 = f14 + f15 + f12;
                    } else {
                        this.f2476e.getClass();
                        f10 = (f13 + 1.0f) * width;
                        f13 = 1.0f + f12 + f13;
                    }
                    if (this.f2492m + f10 > scrollX) {
                        arrayList = arrayList2;
                        f11 = f12;
                        this.f2494n.setBounds(Math.round(f10), this.f2495o, Math.round(this.f2492m + f10), this.f2497p);
                        this.f2494n.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        f11 = f12;
                    }
                    if (f10 <= scrollX + r3) {
                        i12++;
                        arrayList2 = arrayList;
                        f12 = f11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f2506x) {
                    return true;
                }
                if (this.f2507y) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m(motionEvent);
                    }
                } else {
                    int i10 = this.G;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.C;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.F);
                        if (f11 != g.f34069a) {
                            float f12 = this.C;
                            if ((f12 >= this.A || f11 <= g.f34069a) && ((f12 <= getWidth() - this.A || f11 >= g.f34069a) && d((int) f11, (int) x10, (int) y10, this, false))) {
                                this.C = x10;
                                this.D = y10;
                                this.f2507y = true;
                                return false;
                            }
                        }
                        float f13 = this.B;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.f2506x = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.E;
                            float f15 = this.B;
                            if (f11 > g.f34069a) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.C = f10;
                            this.D = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.f2507y = true;
                        }
                        if (this.f2506x && p(x10)) {
                            WeakHashMap weakHashMap = n1.f13788a;
                            v0.k(this);
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.E = x11;
                this.C = x11;
                float y11 = motionEvent.getY();
                this.F = y11;
                this.D = y11;
                this.G = motionEvent.getPointerId(0);
                this.f2507y = false;
                this.f2488k = true;
                this.f2486j.computeScrollOffset();
                if (this.f2498p0 == 2 && Math.abs(this.f2486j.getFinalX() - this.f2486j.getCurrX()) > this.f2479f0) {
                    this.f2486j.abortAnimation();
                    this.f2504v = false;
                    q();
                    this.f2506x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.f2506x = false;
                }
            }
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent);
            return this.f2506x;
        }
        t();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        x7.d dVar;
        x7.d dVar2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.f2508z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (dVar2 = (x7.d) childAt.getLayoutParams()) != null && dVar2.f40080a) {
                int i15 = dVar2.f40081b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f2501s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f2502t = true;
        q();
        this.f2502t = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((dVar = (x7.d) childAt2.getLayoutParams()) == null || !dVar.f40080a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.f40082c), 1073741824), this.f2501s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c i14;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i14 = i(childAt)) != null && i14.f40076b == this.f2478f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x7.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x7.g gVar = (x7.g) parcelable;
        super.onRestoreInstanceState(gVar.f22040a);
        a aVar = this.f2476e;
        ClassLoader classLoader = gVar.f40089e;
        if (aVar != null) {
            aVar.f(gVar.f40088d, classLoader);
            v(gVar.f40087c, 0, false, true);
        } else {
            this.f2480g = gVar.f40087c;
            this.f2482h = gVar.f40088d;
            this.f2484i = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, k4.b, x7.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        bVar.f40087c = this.f2478f;
        a aVar = this.f2476e;
        if (aVar != null) {
            bVar.f40088d = aVar.g();
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f2492m;
            s(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.C - f10;
        this.C = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f2499q * clientWidth;
        float f13 = this.f2500r * clientWidth;
        ArrayList arrayList = this.f2473b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) h.l(arrayList, 1);
        if (cVar.f40076b != 0) {
            f12 = cVar.f40079e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f40076b != this.f2476e.c() - 1) {
            f13 = cVar2.f40079e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f2481g0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f2483h0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.C = (scrollX - i10) + this.C;
        scrollTo(i10, getScrollY());
        o(i10);
        return z12;
    }

    public final void q() {
        r(this.f2478f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r10 == r11) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r18) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f2502t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 > 0 && !this.f2473b.isEmpty()) {
            if (!this.f2486j.isFinished()) {
                this.f2486j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        c k10 = k(this.f2478f);
        if (k10 != null) {
            f10 = Math.min(k10.f40079e, this.f2500r);
        } else {
            f10 = g.f34069a;
        }
        int paddingLeft = (int) (f10 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.f2476e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f40074b = null;
            }
            this.f2476e.i(this);
            int i10 = 0;
            while (true) {
                arrayList = this.f2473b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i10);
                this.f2476e.a(cVar.f40076b, cVar.f40075a);
                i10++;
            }
            this.f2476e.b();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((x7.d) getChildAt(i11).getLayoutParams()).f40080a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f2478f = 0;
            scrollTo(0, 0);
        }
        this.f2476e = aVar;
        this.f2472a = 0;
        if (aVar != null) {
            if (this.f2490l == null) {
                this.f2490l = new f2(this, 2);
            }
            a aVar3 = this.f2476e;
            f2 f2Var = this.f2490l;
            synchronized (aVar3) {
                aVar3.f40074b = f2Var;
            }
            this.f2504v = false;
            boolean z10 = this.f2485i0;
            this.f2485i0 = true;
            this.f2472a = this.f2476e.c();
            if (this.f2480g >= 0) {
                this.f2476e.f(this.f2482h, this.f2484i);
                v(this.f2480g, 0, false, true);
                this.f2480g = -1;
                this.f2482h = null;
                this.f2484i = null;
            } else if (!z10) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.n0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.n0.size();
            for (int i12 = 0; i12 < size; i12++) {
                yo.b bVar = (yo.b) this.n0.get(i12);
                TabLayout tabLayout = bVar.f41745b;
                if (tabLayout.f11453i0 == this) {
                    tabLayout.n(aVar, bVar.f41744a);
                }
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.f2504v = false;
        v(i10, 0, !this.f2485i0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f2505w) {
            this.f2505w = i10;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.f2493m0 = fVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f2492m;
        this.f2492m = i10;
        int width = getWidth();
        s(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2494n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f2498p0 == i10) {
            return;
        }
        this.f2498p0 = i10;
        f fVar = this.f2493m0;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.f2491l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f2491l0.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
    }

    public final boolean t() {
        this.G = -1;
        this.f2506x = false;
        this.f2507y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.f2481g0.onRelease();
        this.f2483h0.onRelease();
        if (!this.f2481g0.isFinished() && !this.f2483h0.isFinished()) {
            return false;
        }
        return true;
    }

    public final void u(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        int scrollX;
        int abs;
        c k10 = k(i10);
        if (k10 != null) {
            i12 = (int) (Math.max(this.f2499q, Math.min(k10.f40079e, this.f2500r)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f2486j;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f2488k) {
                        scrollX = this.f2486j.getCurrX();
                    } else {
                        scrollX = this.f2486j.getStartX();
                    }
                    this.f2486j.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    e(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f10 = clientWidth;
                    float f11 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f2476e.getClass();
                        abs = (int) (((Math.abs(i14) / ((f10 * 1.0f) + this.f2492m)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f2488k = false;
                    this.f2486j.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap weakHashMap = n1.f13788a;
                    v0.k(this);
                }
            }
            if (z11) {
                g(i10);
                return;
            }
            return;
        }
        if (z11) {
            g(i10);
        }
        e(false);
        scrollTo(i12, 0);
        o(i12);
    }

    public final void v(int i10, int i11, boolean z10, boolean z11) {
        a aVar = this.f2476e;
        boolean z12 = false;
        if (aVar != null && aVar.c() > 0) {
            ArrayList arrayList = this.f2473b;
            if (!z11 && this.f2478f == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f2476e.c()) {
                i10 = this.f2476e.c() - 1;
            }
            int i12 = this.f2505w;
            int i13 = this.f2478f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((c) arrayList.get(i14)).f40077c = true;
                }
            }
            if (this.f2478f != i10) {
                z12 = true;
            }
            if (this.f2485i0) {
                this.f2478f = i10;
                if (z12) {
                    g(i10);
                }
                requestLayout();
                return;
            }
            r(i10);
            u(i10, i11, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2494n) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x7.d, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f40082c = g.f34069a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2469q0);
        layoutParams.f40081b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(k.getDrawable(getContext(), i10));
    }
}
