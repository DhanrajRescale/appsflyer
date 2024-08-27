package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.api.Api;
import d4.a0;
import d4.b0;
import d4.c0;
import d4.d3;
import d4.n1;
import d4.u2;
import d4.v0;
import d4.z0;
import e.l;
import h.x0;
import iu.j;
import java.util.WeakHashMap;
import l.o;
import m.e;
import m.f;
import m.g;
import m.l1;
import m.m1;
import m.n;
import m.s3;
import m.w3;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements l1, a0, b0 {
    public static final int[] B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final c0 A;

    /* renamed from: a, reason: collision with root package name */
    public int f951a;

    /* renamed from: b, reason: collision with root package name */
    public int f952b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f953c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f954d;

    /* renamed from: e, reason: collision with root package name */
    public m1 f955e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f957g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f958h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f959i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f960j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f961k;

    /* renamed from: l, reason: collision with root package name */
    public int f962l;

    /* renamed from: m, reason: collision with root package name */
    public int f963m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f964n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f965o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f966p;

    /* renamed from: q, reason: collision with root package name */
    public d3 f967q;

    /* renamed from: r, reason: collision with root package name */
    public d3 f968r;

    /* renamed from: s, reason: collision with root package name */
    public d3 f969s;

    /* renamed from: t, reason: collision with root package name */
    public d3 f970t;

    /* renamed from: u, reason: collision with root package name */
    public f f971u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f972v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f973w;

    /* renamed from: x, reason: collision with root package name */
    public final m.d f974x;

    /* renamed from: y, reason: collision with root package name */
    public final e f975y;

    /* renamed from: z, reason: collision with root package name */
    public final e f976z;

    /* JADX WARN: Type inference failed for: r2v1, types: [d4.c0, java.lang.Object] */
    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f952b = 0;
        this.f964n = new Rect();
        this.f965o = new Rect();
        this.f966p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        d3 d3Var = d3.f13730b;
        this.f967q = d3Var;
        this.f968r = d3Var;
        this.f969s = d3Var;
        this.f970t = d3Var;
        this.f974x = new m.d(this, 0);
        this.f975y = new e(this, 0);
        this.f976z = new e(this, 1);
        i(context);
        this.A = new Object();
    }

    public static boolean a(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        g gVar = (g) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.f975y);
        removeCallbacks(this.f976z);
        ViewPropertyAnimator viewPropertyAnimator = this.f973w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // d4.b0
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        d(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // d4.a0
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f956f != null && !this.f957g) {
            if (this.f954d.getVisibility() == 0) {
                i10 = (int) (this.f954d.getTranslationY() + this.f954d.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f956f.setBounds(0, i10, getWidth(), this.f956f.getIntrinsicHeight() + i10);
            this.f956f.draw(canvas);
        }
    }

    @Override // d4.a0
    public final boolean e(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // d4.a0
    public final void f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // d4.a0
    public final void g(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f954d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.A;
        return c0Var.f13728b | c0Var.f13727a;
    }

    public CharSequence getTitle() {
        k();
        return ((w3) this.f955e).f25780a.getTitle();
    }

    @Override // d4.a0
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public final void i(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        boolean z11 = false;
        this.f951a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f956f = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f957g = z11;
        this.f972v = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            } else {
                ((w3) this.f955e).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((w3) this.f955e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        m1 wrapper;
        if (this.f953c == null) {
            this.f953c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f954d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof m1) {
                wrapper = (m1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f955e = wrapper;
        }
    }

    public final void l(o oVar, t9.c cVar) {
        k();
        w3 w3Var = (w3) this.f955e;
        n nVar = w3Var.f25792m;
        Toolbar toolbar = w3Var.f25780a;
        if (nVar == null) {
            n nVar2 = new n(toolbar.getContext());
            w3Var.f25792m = nVar2;
            nVar2.f25639i = R.id.action_menu_presenter;
        }
        n nVar3 = w3Var.f25792m;
        nVar3.f25635e = cVar;
        if (oVar != null || toolbar.f1107a != null) {
            toolbar.f();
            o oVar2 = toolbar.f1107a.f977p;
            if (oVar2 != oVar) {
                if (oVar2 != null) {
                    oVar2.r(toolbar.f1114f0);
                    oVar2.r(toolbar.f1116g0);
                }
                if (toolbar.f1116g0 == null) {
                    toolbar.f1116g0 = new s3(toolbar);
                }
                nVar3.f25648r = true;
                if (oVar != null) {
                    oVar.b(nVar3, toolbar.f1121j);
                    oVar.b(toolbar.f1116g0, toolbar.f1121j);
                } else {
                    nVar3.j(toolbar.f1121j, null);
                    toolbar.f1116g0.j(toolbar.f1121j, null);
                    nVar3.d(true);
                    toolbar.f1116g0.d(true);
                }
                toolbar.f1107a.setPopupTheme(toolbar.f1123k);
                toolbar.f1107a.setPresenter(nVar3);
                toolbar.f1114f0 = nVar3;
                toolbar.x();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.k()
            d4.d3 r7 = d4.d3.g(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f954d
            r2 = 0
            boolean r0 = a(r1, r0, r2)
            java.util.WeakHashMap r1 = d4.n1.f13788a
            android.graphics.Rect r1 = r6.f964n
            d4.b1.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            d4.b3 r7 = r7.f13731a
            d4.d3 r2 = r7.m(r2, r3, r4, r5)
            r6.f967q = r2
            d4.d3 r3 = r6.f968r
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            d4.d3 r0 = r6.f967q
            r6.f968r = r0
            r0 = 1
        L47:
            android.graphics.Rect r2 = r6.f965o
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L53
            r2.set(r1)
            goto L55
        L53:
            if (r0 == 0) goto L58
        L55:
            r6.requestLayout()
        L58:
            d4.d3 r7 = r7.a()
            d4.b3 r7 = r7.f13731a
            d4.d3 r7 = r7.c()
            d4.b3 r7 = r7.f13731a
            d4.d3 r7 = r7.b()
            android.view.WindowInsets r7 = r7.f()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = n1.f13788a;
        z0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        k();
        measureChildWithMargins(this.f954d, i10, 0, i11, 0);
        g gVar = (g) this.f954d.getLayoutParams();
        int max = Math.max(0, this.f954d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int max2 = Math.max(0, this.f954d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f954d.getMeasuredState());
        WeakHashMap weakHashMap = n1.f13788a;
        if ((v0.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f951a;
            if (this.f959i && this.f954d.getTabContainer() != null) {
                measuredHeight += this.f951a;
            }
        } else {
            measuredHeight = this.f954d.getVisibility() != 8 ? this.f954d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f964n;
        Rect rect2 = this.f966p;
        rect2.set(rect);
        d3 d3Var = this.f967q;
        this.f969s = d3Var;
        if (!this.f958h && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f969s = d3Var.f13731a.m(0, measuredHeight, 0, 0);
        } else {
            u3.c b10 = u3.c.b(d3Var.b(), this.f969s.d() + measuredHeight, this.f969s.c(), this.f969s.a());
            l lVar = new l(this.f969s);
            ((u2) lVar.f14641b).g(b10);
            this.f969s = lVar.K();
        }
        a(this.f953c, rect2, true);
        if (!this.f970t.equals(this.f969s)) {
            d3 d3Var2 = this.f969s;
            this.f970t = d3Var2;
            n1.b(this.f953c, d3Var2);
        }
        measureChildWithMargins(this.f953c, i10, 0, i11, 0);
        g gVar2 = (g) this.f953c.getLayoutParams();
        int max3 = Math.max(max, this.f953c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
        int max4 = Math.max(max2, this.f953c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f953c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f960j && z10) {
            this.f972v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (this.f972v.getFinalY() > this.f954d.getHeight()) {
                b();
                this.f976z.run();
            } else {
                b();
                this.f975y.run();
            }
            this.f961k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f962l + i11;
        this.f962l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        x0 x0Var;
        k.l lVar;
        this.A.d(i10, 0);
        this.f962l = getActionBarHideOffset();
        b();
        f fVar = this.f971u;
        if (fVar != null && (lVar = (x0Var = (x0) fVar).f17784z) != null) {
            lVar.a();
            x0Var.f17784z = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f954d.getVisibility() == 0) {
            return this.f960j;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f960j && !this.f961k) {
            if (this.f962l <= this.f954d.getHeight()) {
                b();
                postDelayed(this.f975y, 600L);
            } else {
                b();
                postDelayed(this.f976z, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.f963m ^ i10;
        this.f963m = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f fVar = this.f971u;
        if (fVar != null) {
            ((x0) fVar).f17779u = !z11;
            if (!z10 && z11) {
                x0 x0Var = (x0) fVar;
                if (!x0Var.f17781w) {
                    x0Var.f17781w = true;
                    x0Var.w0(true);
                }
            } else {
                x0 x0Var2 = (x0) fVar;
                if (x0Var2.f17781w) {
                    x0Var2.f17781w = false;
                    x0Var2.w0(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.f971u != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            z0.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f952b = i10;
        f fVar = this.f971u;
        if (fVar != null) {
            ((x0) fVar).f17778t = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.f954d.setTranslationY(-Math.max(0, Math.min(i10, this.f954d.getHeight())));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.f971u = fVar;
        if (getWindowToken() != null) {
            ((x0) this.f971u).f17778t = this.f952b;
            int i10 = this.f963m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = n1.f13788a;
                z0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f959i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f960j) {
            this.f960j = z10;
            if (!z10) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        k();
        w3 w3Var = (w3) this.f955e;
        w3Var.f25783d = i10 != 0 ? j.m(w3Var.f25780a.getContext(), i10) : null;
        w3Var.c();
    }

    public void setLogo(int i10) {
        Drawable drawable;
        k();
        w3 w3Var = (w3) this.f955e;
        if (i10 != 0) {
            drawable = j.m(w3Var.f25780a.getContext(), i10);
        } else {
            drawable = null;
        }
        w3Var.f25784e = drawable;
        w3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f958h = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f957g = z11;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // m.l1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((w3) this.f955e).f25790k = callback;
    }

    @Override // m.l1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        w3 w3Var = (w3) this.f955e;
        if (!w3Var.f25786g) {
            w3Var.f25787h = charSequence;
            if ((w3Var.f25781b & 8) != 0) {
                Toolbar toolbar = w3Var.f25780a;
                toolbar.setTitle(charSequence);
                if (w3Var.f25786g) {
                    n1.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        w3 w3Var = (w3) this.f955e;
        w3Var.f25783d = drawable;
        w3Var.c();
    }
}
