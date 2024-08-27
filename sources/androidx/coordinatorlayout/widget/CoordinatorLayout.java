package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import c2.p;
import c4.f;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.messaging.t;
import d4.a0;
import d4.b0;
import d4.b1;
import d4.c0;
import d4.d3;
import d4.n1;
import d4.o;
import d4.v0;
import d4.w0;
import d4.y0;
import d4.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n3.a;
import o3.b;
import o3.c;
import o3.d;
import o3.e;
import o3.g;
import o3.h;
import r3.k;
import t.j0;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements a0, b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final String f1466t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f1467u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1468v;

    /* renamed from: w, reason: collision with root package name */
    public static final p f1469w;

    /* renamed from: x, reason: collision with root package name */
    public static final f f1470x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1471a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1472b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1473c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1474d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1475e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1476f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1477g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1478h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1479i;

    /* renamed from: j, reason: collision with root package name */
    public View f1480j;

    /* renamed from: k, reason: collision with root package name */
    public View f1481k;

    /* renamed from: l, reason: collision with root package name */
    public o3.f f1482l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1483m;

    /* renamed from: n, reason: collision with root package name */
    public d3 f1484n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1485o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1486p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1487q;

    /* renamed from: r, reason: collision with root package name */
    public eb.f f1488r;

    /* renamed from: s, reason: collision with root package name */
    public final c0 f1489s;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f1466t = str;
        f1469w = new p(2);
        f1467u = new Class[]{Context.class, AttributeSet.class};
        f1468v = new ThreadLocal();
        f1470x = new f(12);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [d4.c0, java.lang.Object] */
    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1471a = new ArrayList();
        this.f1472b = new t(3);
        this.f1473c = new ArrayList();
        this.f1474d = new ArrayList();
        this.f1475e = new int[2];
        this.f1476f = new int[2];
        this.f1489s = new Object();
        int[] iArr = a.f28233a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1479i = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f1479i[i10] = (int) (r1[i10] * f10);
            }
        }
        this.f1486p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.c(this) == 0) {
            v0.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f1470x.c();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void m(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int width;
        int height;
        int i13 = eVar.f29546c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.f29547d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e o(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f29545b) {
            if (view instanceof o3.a) {
                b behavior = ((o3.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f29545b = true;
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.b((b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                eVar.f29545b = true;
            }
        }
        return eVar;
    }

    public static void w(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f29552i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = n1.f13788a;
            view.offsetLeftAndRight(i10 - i11);
            eVar.f29552i = i10;
        }
    }

    public static void x(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f29553j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = n1.f13788a;
            view.offsetTopAndBottom(i10 - i11);
            eVar.f29553j = i10;
        }
    }

    public final void b(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    @Override // d4.b0
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (bVar = eVar.f29544a) != null) {
                    int[] iArr2 = this.f1475e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // d4.a0
    public void d(View view, int i10, int i11, int i12, int i13, int i14) {
        c(view, i10, i11, i12, i13, 0, this.f1476f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b bVar = ((e) view.getLayoutParams()).f29544a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1486p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // d4.a0
    public boolean e(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f29544a;
                if (bVar != null) {
                    boolean p10 = bVar.p(this, childAt, view, i10, i11);
                    z10 |= p10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            eVar.f29558o = p10;
                        }
                    } else {
                        eVar.f29557n = p10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        eVar.f29558o = false;
                    }
                } else {
                    eVar.f29557n = false;
                }
            }
        }
        return z10;
    }

    @Override // d4.a0
    public final void f(View view, View view2, int i10, int i11) {
        this.f1489s.d(i10, i11);
        this.f1481k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // d4.a0
    public void g(View view, int i10) {
        c0 c0Var = this.f1489s;
        if (i10 == 1) {
            c0Var.f13728b = 0;
        } else {
            c0Var.f13727a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                b bVar = eVar.f29544a;
                if (bVar != null) {
                    bVar.q(this, childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        eVar.f29558o = false;
                    }
                } else {
                    eVar.f29557n = false;
                }
                eVar.f29559p = false;
            }
        }
        this.f1481k = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1471a);
    }

    public final d3 getLastWindowInsets() {
        return this.f1484n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.f1489s;
        return c0Var.f13728b | c0Var.f13727a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1486p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // d4.a0
    public void h(View view, int i10, int i11, int[] iArr, int i12) {
        b bVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (bVar = eVar.f29544a) != null) {
                    int[] iArr2 = this.f1475e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1475e;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr3[1]);
                    } else {
                        min2 = Math.min(i14, iArr3[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            q(1);
        }
    }

    public final void i(View view) {
        List list = (List) ((j0) this.f1472b.f11783c).get(view);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                b bVar = ((e) view2.getLayoutParams()).f29544a;
                if (bVar != null) {
                    bVar.d(this, view2, view);
                }
            }
        }
    }

    public final void j(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                l(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList k(View view) {
        t tVar = this.f1472b;
        int i10 = ((j0) tVar.f11783c).f34873c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((j0) tVar.f11783c).j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((j0) tVar.f11783c).f(i11));
            }
        }
        ArrayList arrayList3 = this.f1474d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = h.f29564a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f29564a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f29565b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i10) {
        int[] iArr = this.f1479i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        v(false);
        if (this.f1483m) {
            if (this.f1482l == null) {
                this.f1482l = new o3.f(this, i10);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1482l);
        }
        if (this.f1484n == null) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (v0.b(this)) {
                z0.c(this);
            }
        }
        this.f1478h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f1483m && this.f1482l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1482l);
        }
        View view = this.f1481k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1478h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f1485o && this.f1486p != null) {
            d3 d3Var = this.f1484n;
            if (d3Var != null) {
                i10 = d3Var.d();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f1486p.setBounds(0, 0, getWidth(), i10);
                this.f1486p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b bVar;
        WeakHashMap weakHashMap = n1.f13788a;
        int d10 = w0.d(this);
        ArrayList arrayList = this.f1471a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f29544a) == null || !bVar.h(this, view, d10))) {
                r(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0190, code lost:
    
        if (r0.i(r30, r19, r25, r20, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f29544a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        b bVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f29544a) != null) {
                    z10 |= bVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        h(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f22040a);
        SparseArray sparseArray = gVar.f29563c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVar = o(childAt).f29544a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, k4.b, o3.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        ?? bVar = new k4.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVar2 = ((e) childAt.getLayoutParams()).f29544a;
            if (id2 != -1 && bVar2 != null && (o10 = bVar2.o(childAt)) != null) {
                sparseArray.append(id2, o10);
            }
        }
        bVar.f29563c = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1480j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1480j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            o3.e r6 = (o3.e) r6
            o3.b r6 = r6.f29544a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1480j
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f1480j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i10, int i11) {
        f fVar = f1470x;
        Rect a10 = a();
        l(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            fVar.b(a10);
        }
    }

    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        e eVar;
        ArrayList arrayList2;
        int i20;
        Rect rect2;
        int i21;
        View view;
        f fVar;
        e eVar2;
        int i22;
        boolean z13;
        b bVar;
        WeakHashMap weakHashMap = n1.f13788a;
        int d10 = w0.d(this);
        ArrayList arrayList3 = this.f1471a;
        int size = arrayList3.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i23 = 0;
        while (true) {
            f fVar2 = f1470x;
            if (i23 < size) {
                View view2 = (View) arrayList3.get(i23);
                e eVar3 = (e) view2.getLayoutParams();
                if (i10 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = a12;
                    i11 = i23;
                } else {
                    int i24 = 0;
                    while (i24 < i23) {
                        if (eVar3.f29555l == ((View) arrayList3.get(i24))) {
                            e eVar4 = (e) view2.getLayoutParams();
                            if (eVar4.f29554k != null) {
                                Rect a13 = a();
                                Rect a14 = a();
                                arrayList2 = arrayList3;
                                Rect a15 = a();
                                i19 = i24;
                                l(eVar4.f29554k, a13);
                                j(view2, a14, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i20 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i21 = i23;
                                eVar = eVar3;
                                view = view2;
                                rect2 = a12;
                                fVar = fVar2;
                                m(d10, a13, a15, eVar4, measuredWidth, measuredHeight);
                                if (a15.left == a14.left && a15.top == a14.top) {
                                    eVar2 = eVar4;
                                    i22 = measuredWidth;
                                    z13 = false;
                                } else {
                                    eVar2 = eVar4;
                                    i22 = measuredWidth;
                                    z13 = true;
                                }
                                b(eVar2, a15, i22, measuredHeight);
                                int i25 = a15.left - a14.left;
                                int i26 = a15.top - a14.top;
                                if (i25 != 0) {
                                    WeakHashMap weakHashMap2 = n1.f13788a;
                                    view.offsetLeftAndRight(i25);
                                }
                                if (i26 != 0) {
                                    WeakHashMap weakHashMap3 = n1.f13788a;
                                    view.offsetTopAndBottom(i26);
                                }
                                if (z13 && (bVar = eVar2.f29544a) != null) {
                                    bVar.d(this, view, eVar2.f29554k);
                                }
                                a13.setEmpty();
                                fVar.b(a13);
                                a14.setEmpty();
                                fVar.b(a14);
                                a15.setEmpty();
                                fVar.b(a15);
                                i24 = i19 + 1;
                                fVar2 = fVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i20;
                                i23 = i21;
                                eVar3 = eVar;
                                a12 = rect2;
                            }
                        }
                        i19 = i24;
                        eVar = eVar3;
                        arrayList2 = arrayList3;
                        i20 = size;
                        rect2 = a12;
                        i21 = i23;
                        view = view2;
                        fVar = fVar2;
                        i24 = i19 + 1;
                        fVar2 = fVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i20;
                        i23 = i21;
                        eVar3 = eVar;
                        a12 = rect2;
                    }
                    e eVar5 = eVar3;
                    ArrayList arrayList4 = arrayList3;
                    int i27 = size;
                    Rect rect3 = a12;
                    i11 = i23;
                    View view3 = view2;
                    c4.e eVar6 = fVar2;
                    j(view3, a11, true);
                    if (eVar5.f29550g != 0 && !a11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f29550g, d10);
                        int i28 = absoluteGravity & 112;
                        if (i28 != 48) {
                            if (i28 == 80) {
                                a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                            }
                        } else {
                            a10.top = Math.max(a10.top, a11.bottom);
                        }
                        int i29 = absoluteGravity & 7;
                        if (i29 != 3) {
                            if (i29 == 5) {
                                a10.right = Math.max(a10.right, getWidth() - a11.left);
                            }
                        } else {
                            a10.left = Math.max(a10.left, a11.right);
                        }
                    }
                    if (eVar5.f29551h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = n1.f13788a;
                        if (y0.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            e eVar7 = (e) view3.getLayoutParams();
                            b bVar2 = eVar7.f29544a;
                            Rect a16 = a();
                            Rect a17 = a();
                            a17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (bVar2 != null && bVar2.a(view3, a16)) {
                                if (!a17.contains(a16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a16.toShortString() + " | Bounds:" + a17.toShortString());
                                }
                            } else {
                                a16.set(a17);
                            }
                            a17.setEmpty();
                            eVar6.b(a17);
                            if (a16.isEmpty()) {
                                a16.setEmpty();
                                eVar6.b(a16);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar7.f29551h, d10);
                                if ((absoluteGravity2 & 48) == 48 && (i17 = (a16.top - ((ViewGroup.MarginLayoutParams) eVar7).topMargin) - eVar7.f29553j) < (i18 = a10.top)) {
                                    x(view3, i18 - i17);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin) + eVar7.f29553j) < (i16 = a10.bottom)) {
                                    x(view3, height - i16);
                                } else if (!z11) {
                                    x(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i14 = (a16.left - ((ViewGroup.MarginLayoutParams) eVar7).leftMargin) - eVar7.f29552i) < (i15 = a10.left)) {
                                    w(view3, i15 - i14);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - ((ViewGroup.MarginLayoutParams) eVar7).rightMargin) + eVar7.f29552i) < (i13 = a10.right)) {
                                    w(view3, width - i13);
                                } else if (!z12) {
                                    w(view3, 0);
                                }
                                a16.setEmpty();
                                eVar6.b(a16);
                            }
                        }
                    }
                    if (i10 != 2) {
                        rect = rect3;
                        rect.set(((e) view3.getLayoutParams()).f29560q);
                        if (rect.equals(a11)) {
                            arrayList = arrayList4;
                            i12 = i27;
                        } else {
                            ((e) view3.getLayoutParams()).f29560q.set(a11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i30 = i11 + 1;
                    i12 = i27;
                    while (true) {
                        arrayList = arrayList4;
                        if (i30 >= i12) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i30);
                        e eVar8 = (e) view4.getLayoutParams();
                        b bVar3 = eVar8.f29544a;
                        if (bVar3 != null && bVar3.b(view4, view3)) {
                            if (i10 == 0 && eVar8.f29559p) {
                                eVar8.f29559p = false;
                            } else {
                                if (i10 != 2) {
                                    z10 = bVar3.d(this, view4, view3);
                                } else {
                                    bVar3.e(this, view3);
                                    z10 = true;
                                }
                                if (i10 == 1) {
                                    eVar8.f29559p = z10;
                                }
                            }
                        }
                        i30++;
                        arrayList4 = arrayList;
                    }
                }
                i23 = i11 + 1;
                a12 = rect;
                size = i12;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a12;
                a10.setEmpty();
                fVar2.b(a10);
                a11.setEmpty();
                fVar2.b(a11);
                rect4.setEmpty();
                fVar2.b(rect4);
                return;
            }
        }
    }

    public final void r(View view, int i10) {
        Rect a10;
        Rect a11;
        int i11;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f29554k;
        if (view2 == null && eVar.f29549f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        f fVar = f1470x;
        if (view2 != null) {
            a10 = a();
            a11 = a();
            try {
                l(view2, a10);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i10, a10, a11, eVar2, measuredWidth, measuredHeight);
                b(eVar2, a11, measuredWidth, measuredHeight);
                view.layout(a11.left, a11.top, a11.right, a11.bottom);
                return;
            } finally {
                a10.setEmpty();
                fVar.b(a10);
                a11.setEmpty();
                fVar.b(a11);
            }
        }
        int i12 = eVar.f29548e;
        if (i12 >= 0) {
            e eVar3 = (e) view.getLayoutParams();
            int i13 = eVar3.f29546c;
            if (i13 == 0) {
                i13 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
            int i14 = absoluteGravity & 7;
            int i15 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i10 == 1) {
                i12 = width - i12;
            }
            int n10 = n(i12) - measuredWidth2;
            if (i14 != 1) {
                if (i14 == 5) {
                    n10 += measuredWidth2;
                }
            } else {
                n10 += measuredWidth2 / 2;
            }
            if (i15 != 16) {
                if (i15 != 80) {
                    i11 = 0;
                } else {
                    i11 = measuredHeight2;
                }
            } else {
                i11 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, Math.min(n10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin);
        if (this.f1484n != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (v0.b(this) && !v0.b(view)) {
                a10.left = this.f1484n.b() + a10.left;
                a10.top = this.f1484n.d() + a10.top;
                a10.right -= this.f1484n.c();
                a10.bottom -= this.f1484n.a();
            }
        }
        a11 = a();
        int i16 = eVar4.f29546c;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        o.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b bVar = ((e) view.getLayoutParams()).f29544a;
        if (bVar != null && bVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1477g) {
            v(false);
            this.f1477g = true;
        }
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1487q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f1486p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1486p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1486p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1486p;
                WeakHashMap weakHashMap = n1.f13788a;
                v3.c.b(drawable4, w0.d(this));
                Drawable drawable5 = this.f1486p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f1486p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = k.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.f1486p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f1486p.setVisible(z10, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1473c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        p pVar = f1469w;
        if (pVar != null) {
            Collections.sort(arrayList, pVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            e eVar = (e) view.getLayoutParams();
            b bVar = eVar.f29544a;
            if ((z11 || z12) && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, s0.g.f34069a, s0.g.f34069a, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            bVar.r(this, view, motionEvent2);
                        }
                    } else {
                        bVar.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && bVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = bVar.r(this, view, motionEvent);
                        }
                    } else {
                        z11 = bVar.g(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f1480j = view;
                    }
                }
                if (eVar.f29544a == null) {
                    eVar.f29556m = false;
                }
                boolean z13 = eVar.f29556m;
                if (z13) {
                    z10 = true;
                } else {
                    eVar.f29556m = z13;
                    z10 = z13;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r6.f29551h, r10) & r11) == r11) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = ((e) childAt.getLayoutParams()).f29544a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, s0.g.f34069a, s0.g.f34069a, 0);
                if (z10) {
                    bVar.g(this, childAt, obtain);
                } else {
                    bVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).f29556m = false;
        }
        this.f1480j = null;
        this.f1477g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1486p) {
            return false;
        }
        return true;
    }

    public final void y() {
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.b(this)) {
            if (this.f1488r == null) {
                this.f1488r = new eb.f(this, 1);
            }
            b1.u(this, this.f1488r);
            setSystemUiVisibility(1280);
            return;
        }
        b1.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }
}
