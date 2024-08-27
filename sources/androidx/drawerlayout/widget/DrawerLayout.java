package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.main.MainActivity;
import d4.b1;
import d4.d3;
import d4.n1;
import d4.v0;
import d4.w0;
import e.l;
import h4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import l4.e;
import n4.a;
import o4.b;
import o4.c;
import o4.d;
import o4.f;
import r3.k;
import s0.g;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] D = {R.attr.colorPrimaryDark};
    public static final int[] E = {R.attr.layout_gravity};
    public static final boolean F;
    public static final boolean G;
    public static final boolean H;
    public Rect A;
    public Matrix B;
    public final l C;

    /* renamed from: a, reason: collision with root package name */
    public final j f1547a;

    /* renamed from: b, reason: collision with root package name */
    public float f1548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1549c;

    /* renamed from: d, reason: collision with root package name */
    public int f1550d;

    /* renamed from: e, reason: collision with root package name */
    public float f1551e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1552f;

    /* renamed from: g, reason: collision with root package name */
    public final e f1553g;

    /* renamed from: h, reason: collision with root package name */
    public final e f1554h;

    /* renamed from: i, reason: collision with root package name */
    public final f f1555i;

    /* renamed from: j, reason: collision with root package name */
    public final f f1556j;

    /* renamed from: k, reason: collision with root package name */
    public int f1557k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1558l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1559m;

    /* renamed from: n, reason: collision with root package name */
    public int f1560n;

    /* renamed from: o, reason: collision with root package name */
    public int f1561o;

    /* renamed from: p, reason: collision with root package name */
    public int f1562p;

    /* renamed from: q, reason: collision with root package name */
    public int f1563q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1564r;

    /* renamed from: s, reason: collision with root package name */
    public c f1565s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f1566t;

    /* renamed from: u, reason: collision with root package name */
    public float f1567u;

    /* renamed from: v, reason: collision with root package name */
    public float f1568v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1569w;

    /* renamed from: x, reason: collision with root package name */
    public Object f1570x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1571y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1572z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        F = true;
        G = true;
        H = i10 >= 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.assetgro.stockgro.prod.R.attr.drawerLayoutStyle);
        this.f1547a = new j(1);
        this.f1550d = -1728053248;
        this.f1552f = new Paint();
        this.f1559m = true;
        this.f1560n = 3;
        this.f1561o = 3;
        this.f1562p = 3;
        this.f1563q = 3;
        this.C = new l(this, 14);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f1549c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        f fVar = new f(this, 3);
        this.f1555i = fVar;
        f fVar2 = new f(this, 5);
        this.f1556j = fVar2;
        e eVar = new e(getContext(), this, fVar);
        eVar.f23956b = (int) (eVar.f23956b * 1.0f);
        this.f1553g = eVar;
        eVar.f23971q = 1;
        eVar.f23968n = f11;
        fVar.f29578c = eVar;
        e eVar2 = new e(getContext(), this, fVar2);
        eVar2.f23956b = (int) (1.0f * eVar2.f23956b);
        this.f1554h = eVar2;
        eVar2.f23971q = 2;
        eVar2.f23968n = f11;
        fVar2.f29578c = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(this, 1);
        n1.n(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (v0.b(this)) {
            setOnApplyWindowInsetsListener(new Object());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(D);
            try {
                this.f1569w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f28235a, com.assetgro.stockgro.prod.R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1548b = obtainStyledAttributes2.getDimension(0, g.f34069a);
            } else {
                this.f1548b = getResources().getDimension(com.assetgro.stockgro.prod.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f1572z = new ArrayList();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String j(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        if ((i10 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i10);
    }

    public static boolean k(View view) {
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.c(view) != 4 && v0.c(view) != 2) {
            return true;
        }
        return false;
    }

    public static boolean l(View view) {
        if (((d) view.getLayoutParams()).f29568a == 0) {
            return true;
        }
        return false;
    }

    public static boolean m(View view) {
        if (n(view)) {
            if ((((d) view.getLayoutParams()).f29571d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean n(View view) {
        int i10 = ((d) view.getLayoutParams()).f29568a;
        WeakHashMap weakHashMap = n1.f13788a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, w0.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view, int i10) {
        if ((i(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.f1572z;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (n(childAt)) {
                if (m(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (f() == null && !n(view)) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.s(view, 1);
        } else {
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.s(view, 4);
        }
        if (!F) {
            n1.n(view, this.f1547a);
        }
    }

    public final void b(int i10) {
        View e10 = e(i10);
        if (e10 != null) {
            c(e10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + j(i10));
        }
    }

    public final void c(View view) {
        if (n(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.f1559m) {
                dVar.f29569b = g.f34069a;
                dVar.f29571d = 0;
            } else {
                dVar.f29571d |= 4;
                if (a(view, 3)) {
                    this.f1553g.s(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1554h.s(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = g.f34069a;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((d) getChildAt(i10).getLayoutParams()).f29569b);
        }
        this.f1551e = f10;
        boolean g10 = this.f1553g.g();
        boolean g11 = this.f1554h.g();
        if (g10 || g11) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
    }

    public final void d(boolean z10) {
        boolean s7;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            if (n(childAt) && (!z10 || dVar.f29570c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    s7 = this.f1553g.s(childAt, -width, childAt.getTop());
                } else {
                    s7 = this.f1554h.s(childAt, getWidth(), childAt.getTop());
                }
                z11 |= s7;
                dVar.f29570c = false;
            }
        }
        f fVar = this.f1555i;
        fVar.f29580e.removeCallbacks(fVar.f29579d);
        f fVar2 = this.f1556j;
        fVar2.f29580e.removeCallbacks(fVar2.f29579d);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f1551e > g.f34069a) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (this.A == null) {
                        this.A = new Rect();
                    }
                    childAt.getHitRect(this.A);
                    if (this.A.contains((int) x10, (int) y10) && !l(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(scrollX, scrollY);
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.B == null) {
                                    this.B = new Matrix();
                                }
                                matrix.invert(this.B);
                                obtain.transform(this.B);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX2 = getScrollX() - childAt.getLeft();
                            float scrollY2 = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX2, scrollY2);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX2, -scrollY2);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable background;
        int height = getHeight();
        boolean l10 = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (l10) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && n(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f1551e;
        if (f10 > g.f34069a && l10) {
            int i13 = this.f1550d;
            Paint paint = this.f1552f;
            paint.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, g.f34069a, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i10) {
        WeakHashMap weakHashMap = n1.f13788a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, w0.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((d) childAt.getLayoutParams()).f29571d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((d) childAt.getLayoutParams()).f29569b > g.f34069a) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o4.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.f29568a = 0;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o4.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o4.d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o4.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) dVar);
            marginLayoutParams.f29568a = 0;
            marginLayoutParams.f29568a = dVar.f29568a;
            return marginLayoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.f29568a = 0;
            return marginLayoutParams2;
        }
        ?? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams3.f29568a = 0;
        return marginLayoutParams3;
    }

    public float getDrawerElevation() {
        return G ? this.f1548b : g.f34069a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1569w;
    }

    public final int h(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (n(view)) {
            int i14 = ((d) view.getLayoutParams()).f29568a;
            WeakHashMap weakHashMap = n1.f13788a;
            int d10 = w0.d(this);
            if (i14 != 3) {
                if (i14 != 5) {
                    if (i14 != 8388611) {
                        if (i14 == 8388613) {
                            int i15 = this.f1563q;
                            if (i15 == 3) {
                                if (d10 == 0) {
                                    i13 = this.f1561o;
                                } else {
                                    i13 = this.f1560n;
                                }
                                if (i13 != 3) {
                                    return i13;
                                }
                            } else {
                                return i15;
                            }
                        }
                    } else {
                        int i16 = this.f1562p;
                        if (i16 == 3) {
                            if (d10 == 0) {
                                i12 = this.f1560n;
                            } else {
                                i12 = this.f1561o;
                            }
                            if (i12 != 3) {
                                return i12;
                            }
                        } else {
                            return i16;
                        }
                    }
                } else {
                    int i17 = this.f1561o;
                    if (i17 == 3) {
                        if (d10 == 0) {
                            i11 = this.f1563q;
                        } else {
                            i11 = this.f1562p;
                        }
                        if (i11 != 3) {
                            return i11;
                        }
                    } else {
                        return i17;
                    }
                }
            } else {
                int i18 = this.f1560n;
                if (i18 == 3) {
                    if (d10 == 0) {
                        i10 = this.f1562p;
                    } else {
                        i10 = this.f1563q;
                    }
                    if (i10 != 3) {
                        return i10;
                    }
                } else {
                    return i18;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int i(View view) {
        int i10 = ((d) view.getLayoutParams()).f29568a;
        WeakHashMap weakHashMap = n1.f13788a;
        return Gravity.getAbsoluteGravity(i10, w0.d(this));
    }

    public final void o(View view) {
        if (n(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.f1559m) {
                dVar.f29569b = 1.0f;
                dVar.f29571d = 1;
                s(view, true);
                r(view);
            } else {
                dVar.f29571d |= 2;
                if (a(view, 3)) {
                    this.f1553g.s(view, 0, view.getTop());
                } else {
                    this.f1554h.s(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1559m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1559m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f1571y && this.f1569w != null) {
            Object obj = this.f1570x;
            if (obj != null) {
                i10 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f1569w.setBounds(0, 0, getWidth(), i10);
                this.f1569w.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            l4.e r1 = r8.f1553g
            boolean r2 = r1.r(r9)
            l4.e r3 = r8.f1554h
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f23958d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f23965k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f23960f
            r5 = r5[r0]
            float[] r6 = r1.f23958d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f23961g
            r6 = r6[r0]
            float[] r7 = r1.f23959e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f23956b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            o4.f r9 = r8.f1555i
            h.q0 r0 = r9.f29579d
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f29580e
            r9.removeCallbacks(r0)
            o4.f r9 = r8.f1556j
            h.q0 r0 = r9.f29579d
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f29580e
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.d(r3)
            r8.f1564r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f1567u = r0
            r8.f1568v = r9
            float r5 = r8.f1551e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = l(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f1564r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o4.d r1 = (o4.d) r1
            boolean r1 = r1.f29570c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f1564r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && g() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View g10 = g();
            if (g10 != null && h(g10) == 0) {
                d(false);
            }
            if (g10 == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11;
        int i15;
        boolean z12 = true;
        this.f1558l = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (dVar.f29569b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i16 - r11) / f12;
                        i14 = i16 - ((int) (dVar.f29569b * f12));
                    }
                    if (f10 != dVar.f29569b) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    int i19 = dVar.f29568a & 112;
                    if (i19 != 16) {
                        if (i19 != 80) {
                            int i20 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                            childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                        } else {
                            int i21 = i13 - i11;
                            childAt.layout(i14, (i21 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i21 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        }
                    } else {
                        int i22 = i13 - i11;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = i22 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i25 > i26) {
                                i23 = i26 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i23, measuredWidth + i14, measuredHeight + i23);
                    }
                    if (z11) {
                        q(childAt, f10);
                    }
                    if (dVar.f29569b > g.f34069a) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (H && (rootWindowInsets = getRootWindowInsets()) != null) {
            u3.c j10 = d3.g(null, rootWindowInsets).f13731a.j();
            e eVar = this.f1553g;
            eVar.f23969o = Math.max(eVar.f23970p, j10.f36704a);
            e eVar2 = this.f1554h;
            eVar2.f23969o = Math.max(eVar2.f23970p, j10.f36706c);
        }
        this.f1558l = false;
        this.f1559m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e10;
        if (!(parcelable instanceof o4.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o4.e eVar = (o4.e) parcelable;
        super.onRestoreInstanceState(eVar.f22040a);
        int i10 = eVar.f29572c;
        if (i10 != 0 && (e10 = e(i10)) != null) {
            o(e10);
        }
        int i11 = eVar.f29573d;
        if (i11 != 3) {
            p(i11, 3);
        }
        int i12 = eVar.f29574e;
        if (i12 != 3) {
            p(i12, 5);
        }
        int i13 = eVar.f29575f;
        if (i13 != 3) {
            p(i13, 8388611);
        }
        int i14 = eVar.f29576g;
        if (i14 != 3) {
            p(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (!G) {
            WeakHashMap weakHashMap = n1.f13788a;
            w0.d(this);
            w0.d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, k4.b, o4.e] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? bVar = new k4.b(super.onSaveInstanceState());
        bVar.f29572c = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            d dVar = (d) getChildAt(i10).getLayoutParams();
            int i11 = dVar.f29571d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                bVar.f29572c = dVar.f29568a;
                break;
            }
        }
        bVar.f29573d = this.f1560n;
        bVar.f29574e = this.f1561o;
        bVar.f29575f = this.f1562p;
        bVar.f29576g = this.f1563q;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (h(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            l4.e r0 = r6.f1553g
            r0.k(r7)
            l4.e r1 = r6.f1554h
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.d(r3)
            r6.f1564r = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = l(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f1567u
            float r1 = r1 - r4
            float r4 = r6.f1568v
            float r7 = r7 - r4
            int r0 = r0.f23956b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L54
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.d(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1567u = r0
            r6.f1568v = r7
            r6.f1564r = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10, int i11) {
        View e10;
        e eVar;
        WeakHashMap weakHashMap = n1.f13788a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, w0.d(this));
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        this.f1563q = i10;
                    }
                } else {
                    this.f1562p = i10;
                }
            } else {
                this.f1561o = i10;
            }
        } else {
            this.f1560n = i10;
        }
        if (i10 != 0) {
            if (absoluteGravity == 3) {
                eVar = this.f1553g;
            } else {
                eVar = this.f1554h;
            }
            eVar.a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (e10 = e(absoluteGravity)) != null) {
                o(e10);
                return;
            }
            return;
        }
        View e11 = e(absoluteGravity);
        if (e11 != null) {
            c(e11);
        }
    }

    public final void q(View drawerView, float f10) {
        d dVar = (d) drawerView.getLayoutParams();
        if (f10 == dVar.f29569b) {
            return;
        }
        dVar.f29569b = f10;
        ArrayList arrayList = this.f1566t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((nf.g) ((c) this.f1566t.get(size))).getClass();
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            }
        }
    }

    public final void r(View view) {
        e4.f fVar = e4.f.f14981n;
        n1.k(view, fVar.a());
        n1.h(view, 0);
        if (m(view) && h(view) != 2) {
            n1.l(view, fVar, this.C);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f1558l) {
            super.requestLayout();
        }
    }

    public final void s(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((!z10 && !n(childAt)) || (z10 && childAt == view)) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.s(childAt, 1);
            } else {
                WeakHashMap weakHashMap2 = n1.f13788a;
                v0.s(childAt, 4);
            }
        }
    }

    public void setDrawerElevation(float f10) {
        this.f1548b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (n(childAt)) {
                float f11 = this.f1548b;
                WeakHashMap weakHashMap = n1.f13788a;
                b1.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f1565s;
        if (cVar2 != null && (arrayList = this.f1566t) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.f1566t == null) {
                this.f1566t = new ArrayList();
            }
            this.f1566t.add(cVar);
        }
        this.f1565s = cVar;
    }

    public void setDrawerLockMode(int i10) {
        p(i10, 3);
        p(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f1550d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1569w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f1569w = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(View drawerView, int i10) {
        int i11;
        View rootView;
        int i12 = this.f1553g.f23955a;
        int i13 = this.f1554h.f23955a;
        if (i12 != 1 && i13 != 1) {
            i11 = 2;
            if (i12 != 2 && i13 != 2) {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        if (drawerView != null && i10 == 0) {
            float f10 = ((d) drawerView.getLayoutParams()).f29569b;
            if (f10 == g.f34069a) {
                d dVar = (d) drawerView.getLayoutParams();
                if ((dVar.f29571d & 1) == 1) {
                    dVar.f29571d = 0;
                    ArrayList arrayList = this.f1566t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((nf.g) ((c) this.f1566t.get(size))).getClass();
                            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                        }
                    }
                    s(drawerView, false);
                    r(drawerView);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                d dVar2 = (d) drawerView.getLayoutParams();
                if ((dVar2.f29571d & 1) == 0) {
                    dVar2.f29571d = 1;
                    ArrayList arrayList2 = this.f1566t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            nf.g gVar = (nf.g) ((c) this.f1566t.get(size2));
                            gVar.getClass();
                            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                            AnalyticEvent analyticEvent = new AnalyticEvent("app_hamburger_menu", new HashMap());
                            MainActivity mainActivity = gVar.f28644a;
                            mainActivity.A(analyticEvent);
                            mainActivity.D(analyticEvent);
                        }
                    }
                    s(drawerView, true);
                    r(drawerView);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f1557k) {
            this.f1557k = i11;
            ArrayList arrayList3 = this.f1566t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) this.f1566t.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f1569w = i10 != 0 ? k.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o4.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f29568a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E);
        marginLayoutParams.f29568a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }
}
