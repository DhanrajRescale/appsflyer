package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import d4.b1;
import d4.c0;
import d4.n1;
import d4.v0;
import d4.y;
import d4.z;
import h4.i;
import java.util.WeakHashMap;
import r3.k;
import r7.a;
import r7.d;
import r7.e;
import r7.f;
import r7.g;
import r7.h;
import r7.j;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements y {
    public static final int[] I = {R.attr.enabled};
    public g A;
    public h B;
    public h C;
    public boolean D;
    public int E;
    public final f F;
    public final g G;
    public final g H;

    /* renamed from: a, reason: collision with root package name */
    public View f2442a;

    /* renamed from: b, reason: collision with root package name */
    public j f2443b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2445d;

    /* renamed from: e, reason: collision with root package name */
    public float f2446e;

    /* renamed from: f, reason: collision with root package name */
    public float f2447f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f2448g;

    /* renamed from: h, reason: collision with root package name */
    public final z f2449h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2450i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2451j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2452k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2453l;

    /* renamed from: m, reason: collision with root package name */
    public int f2454m;

    /* renamed from: n, reason: collision with root package name */
    public float f2455n;

    /* renamed from: o, reason: collision with root package name */
    public float f2456o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2457p;

    /* renamed from: q, reason: collision with root package name */
    public int f2458q;

    /* renamed from: r, reason: collision with root package name */
    public final DecelerateInterpolator f2459r;

    /* renamed from: s, reason: collision with root package name */
    public final a f2460s;

    /* renamed from: t, reason: collision with root package name */
    public int f2461t;

    /* renamed from: u, reason: collision with root package name */
    public int f2462u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2463v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2464w;

    /* renamed from: x, reason: collision with root package name */
    public int f2465x;

    /* renamed from: y, reason: collision with root package name */
    public final e f2466y;

    /* renamed from: z, reason: collision with root package name */
    public g f2467z;

    /* JADX WARN: Type inference failed for: r1v14, types: [d4.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.widget.ImageView, android.view.View, r7.a] */
    public SwipeRefreshLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2444c = false;
        this.f2446e = -1.0f;
        this.f2450i = new int[2];
        this.f2451j = new int[2];
        this.f2458q = -1;
        this.f2461t = -1;
        this.F = new f(this, 0);
        this.G = new g(this, 2);
        this.H = new g(this, 3);
        this.f2445d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2453l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f2459r = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.E = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f10 = imageView.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = n1.f13788a;
        b1.s(imageView, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        v0.q(imageView, shapeDrawable);
        this.f2460s = imageView;
        e eVar = new e(getContext());
        this.f2466y = eVar;
        eVar.c(1);
        this.f2460s.setImageDrawable(this.f2466y);
        this.f2460s.setVisibility(8);
        addView(this.f2460s);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f2464w = i10;
        this.f2446e = i10;
        this.f2448g = new Object();
        this.f2449h = new z(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.E;
        this.f2454m = i11;
        this.f2463v = i11;
        e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f2460s.getBackground().setAlpha(i10);
        this.f2466y.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f2442a;
        if (view instanceof ListView) {
            return i.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f2442a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f2460s)) {
                    this.f2442a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f2446e) {
            g(true, true);
            return;
        }
        this.f2444c = false;
        e eVar = this.f2466y;
        d dVar = eVar.f33436a;
        dVar.f33416e = s0.g.f34069a;
        dVar.f33417f = s0.g.f34069a;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.f2462u = this.f2454m;
        g gVar = this.H;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f2459r);
        a aVar = this.f2460s;
        aVar.f33406a = fVar;
        aVar.clearAnimation();
        this.f2460s.startAnimation(gVar);
        e eVar2 = this.f2466y;
        d dVar2 = eVar2.f33436a;
        if (dVar2.f33425n) {
            dVar2.f33425n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f10) {
        h hVar;
        h hVar2;
        e eVar = this.f2466y;
        d dVar = eVar.f33436a;
        if (!dVar.f33425n) {
            dVar.f33425n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.f2446e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f2446e;
        int i10 = this.f2465x;
        if (i10 <= 0) {
            i10 = this.f2464w;
        }
        float f11 = i10;
        double max2 = Math.max(s0.g.f34069a, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f2463v + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f2460s.getVisibility() != 0) {
            this.f2460s.setVisibility(0);
        }
        this.f2460s.setScaleX(1.0f);
        this.f2460s.setScaleY(1.0f);
        if (f10 < this.f2446e) {
            if (this.f2466y.f33436a.f33431t > 76 && ((hVar2 = this.B) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f2466y.f33436a.f33431t, 76);
                hVar3.setDuration(300L);
                a aVar = this.f2460s;
                aVar.f33406a = null;
                aVar.clearAnimation();
                this.f2460s.startAnimation(hVar3);
                this.B = hVar3;
            }
        } else if (this.f2466y.f33436a.f33431t < 255 && ((hVar = this.C) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f2466y.f33436a.f33431t, 255);
            hVar4.setDuration(300L);
            a aVar2 = this.f2460s;
            aVar2.f33406a = null;
            aVar2.clearAnimation();
            this.f2460s.startAnimation(hVar4);
            this.C = hVar4;
        }
        e eVar2 = this.f2466y;
        float min2 = Math.min(0.8f, max * 0.8f);
        d dVar2 = eVar2.f33436a;
        dVar2.f33416e = s0.g.f34069a;
        dVar2.f33417f = min2;
        eVar2.invalidateSelf();
        e eVar3 = this.f2466y;
        float min3 = Math.min(1.0f, max);
        d dVar3 = eVar3.f33436a;
        if (min3 != dVar3.f33427p) {
            dVar3.f33427p = min3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f2466y;
        eVar4.f33436a.f33418g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f2454m);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2449h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2449h.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f2449h.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2449h.e(i10, i11, i12, i13, iArr, 0, null);
    }

    public final void e(float f10) {
        setTargetOffsetTopAndBottom((this.f2462u + ((int) ((this.f2463v - r0) * f10))) - this.f2460s.getTop());
    }

    public final void f() {
        this.f2460s.clearAnimation();
        this.f2466y.stop();
        this.f2460s.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f2463v - this.f2454m);
        this.f2454m = this.f2460s.getTop();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f2444c != z10) {
            this.D = z11;
            b();
            this.f2444c = z10;
            f fVar = this.F;
            if (z10) {
                this.f2462u = this.f2454m;
                g gVar = this.G;
                gVar.reset();
                gVar.setDuration(200L);
                gVar.setInterpolator(this.f2459r);
                if (fVar != null) {
                    this.f2460s.f33406a = fVar;
                }
                this.f2460s.clearAnimation();
                this.f2460s.startAnimation(gVar);
                return;
            }
            g gVar2 = new g(this, 1);
            this.A = gVar2;
            gVar2.setDuration(150L);
            a aVar = this.f2460s;
            aVar.f33406a = fVar;
            aVar.clearAnimation();
            this.f2460s.startAnimation(this.A);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f2461t;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.f2448g;
        return c0Var.f13728b | c0Var.f13727a;
    }

    public int getProgressCircleDiameter() {
        return this.E;
    }

    public int getProgressViewEndOffset() {
        return this.f2464w;
    }

    public int getProgressViewStartOffset() {
        return this.f2463v;
    }

    public final void h(float f10) {
        float f11 = this.f2456o;
        float f12 = f10 - f11;
        int i10 = this.f2445d;
        if (f12 > i10 && !this.f2457p) {
            this.f2455n = f11 + i10;
            this.f2457p = true;
            this.f2466y.setAlpha(76);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2449h.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2449h.f13868d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f2444c || this.f2452k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f2458q) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f2458q = motionEvent.getPointerId(i10);
                            }
                        }
                    }
                } else {
                    int i11 = this.f2458q;
                    if (i11 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                }
            }
            this.f2457p = false;
            this.f2458q = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f2463v - this.f2460s.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f2458q = pointerId;
            this.f2457p = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f2456o = motionEvent.getY(findPointerIndex2);
        }
        return this.f2457p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f2442a == null) {
            b();
        }
        View view = this.f2442a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f2460s.getMeasuredWidth();
        int measuredHeight2 = this.f2460s.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f2454m;
        this.f2460s.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2442a == null) {
            b();
        }
        View view = this.f2442a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f2460s.measure(View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), View.MeasureSpec.makeMeasureSpec(this.E, 1073741824));
        this.f2461t = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f2460s) {
                this.f2461t = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f2447f;
            if (f10 > s0.g.f34069a) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f2447f = s0.g.f34069a;
                } else {
                    this.f2447f = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f2447f);
            }
        }
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int[] iArr2 = this.f2450i;
        if (dispatchNestedPreScroll(i12, i13, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f2451j);
        if (i13 + this.f2451j[1] < 0 && !a()) {
            float abs = this.f2447f + Math.abs(r11);
            this.f2447f = abs;
            d(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f2448g.d(i10, 0);
        startNestedScroll(i10 & 2);
        this.f2447f = s0.g.f34069a;
        this.f2452k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (isEnabled() && !this.f2444c && (i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f2448g.f13727a = 0;
        this.f2452k = false;
        float f10 = this.f2447f;
        if (f10 > s0.g.f34069a) {
            c(f10);
            this.f2447f = s0.g.f34069a;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f2444c || this.f2452k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f2458q) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f2458q = motionEvent.getPointerId(i10);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f2458q = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2458q);
                    if (findPointerIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y10 = motionEvent.getY(findPointerIndex);
                    h(y10);
                    if (this.f2457p) {
                        float f10 = (y10 - this.f2455n) * 0.5f;
                        if (f10 <= s0.g.f34069a) {
                            return false;
                        }
                        d(f10);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f2458q);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f2457p) {
                    float y11 = (motionEvent.getY(findPointerIndex2) - this.f2455n) * 0.5f;
                    this.f2457p = false;
                    c(y11);
                }
                this.f2458q = -1;
                return false;
            }
        } else {
            this.f2458q = motionEvent.getPointerId(0);
            this.f2457p = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f2442a;
        if (view != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (!b1.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.f2460s.setScaleX(f10);
        this.f2460s.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        e eVar = this.f2466y;
        d dVar = eVar.f33436a;
        dVar.f33420i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = k.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f2446e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            f();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2449h.h(z10);
    }

    public void setOnChildScrollUpCallback(r7.i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f2443b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f2460s.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(k.getColor(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (z10 && this.f2444c != z10) {
            this.f2444c = z10;
            setTargetOffsetTopAndBottom((this.f2464w + this.f2463v) - this.f2454m);
            this.D = false;
            f fVar = this.F;
            this.f2460s.setVisibility(0);
            this.f2466y.setAlpha(255);
            g gVar = new g(this, 0);
            this.f2467z = gVar;
            gVar.setDuration(this.f2453l);
            if (fVar != null) {
                this.f2460s.f33406a = fVar;
            }
            this.f2460s.clearAnimation();
            this.f2460s.startAnimation(this.f2467z);
            return;
        }
        g(z10, false);
    }

    public void setSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i10 == 0) {
            this.E = (int) (displayMetrics.density * 56.0f);
        } else {
            this.E = (int) (displayMetrics.density * 40.0f);
        }
        this.f2460s.setImageDrawable(null);
        this.f2466y.c(i10);
        this.f2460s.setImageDrawable(this.f2466y);
    }

    public void setSlingshotDistance(int i10) {
        this.f2465x = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f2460s.bringToFront();
        a aVar = this.f2460s;
        WeakHashMap weakHashMap = n1.f13788a;
        aVar.offsetTopAndBottom(i10);
        this.f2454m = this.f2460s.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f2449h.i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f2449h.j(0);
    }
}
