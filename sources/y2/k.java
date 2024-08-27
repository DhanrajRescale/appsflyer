package y2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.t;
import c2.e1;
import c2.r1;
import c2.s1;
import c2.t1;
import com.assetgro.stockgro.prod.R;
import d2.a0;
import d2.e4;
import d2.w0;
import d2.y;
import d2.y0;
import d4.b0;
import d4.c0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import t0.v;
import x1.d0;
import x1.g0;

/* loaded from: classes.dex */
public abstract class k extends ViewGroup implements b0, t0.l, s1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f41091w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w1.d f41092a;

    /* renamed from: b, reason: collision with root package name */
    public final View f41093b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f41094c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f41095d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41096e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f41097f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f41098g;

    /* renamed from: h, reason: collision with root package name */
    public g1.o f41099h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f41100i;

    /* renamed from: j, reason: collision with root package name */
    public w2.b f41101j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f41102k;

    /* renamed from: l, reason: collision with root package name */
    public t f41103l;

    /* renamed from: m, reason: collision with root package name */
    public o7.f f41104m;

    /* renamed from: n, reason: collision with root package name */
    public final j f41105n;

    /* renamed from: o, reason: collision with root package name */
    public final j f41106o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f41107p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f41108q;

    /* renamed from: r, reason: collision with root package name */
    public int f41109r;

    /* renamed from: s, reason: collision with root package name */
    public int f41110s;

    /* renamed from: t, reason: collision with root package name */
    public final c0 f41111t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41112u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.compose.ui.node.a f41113v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d4.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function1, x1.g0] */
    public k(Context context, v vVar, int i10, w1.d dVar, View view, r1 r1Var) {
        super(context);
        this.f41092a = dVar;
        this.f41093b = view;
        this.f41094c = r1Var;
        if (vVar != null) {
            LinkedHashMap linkedHashMap = e4.f13411a;
            setTag(R.id.androidx_compose_ui_view_composition_context, vVar);
        }
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        this.f41095d = i.f41087d;
        this.f41097f = i.f41086c;
        this.f41098g = i.f41085b;
        g1.l lVar = g1.l.f16404b;
        this.f41099h = lVar;
        this.f41101j = yk.j.o();
        q qVar = (q) this;
        int i12 = 1;
        this.f41105n = new j(qVar, i12);
        this.f41106o = new j(qVar, i11);
        int i13 = 2;
        this.f41108q = new int[2];
        this.f41109r = Integer.MIN_VALUE;
        this.f41110s = Integer.MIN_VALUE;
        this.f41111t = new Object();
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(3, false, 0);
        aVar.f1409j = this;
        g1.o a10 = h2.l.a(androidx.compose.ui.input.nestedscroll.a.a(lVar, m.f41114a, dVar), true, d.f41070d);
        x1.c0 c0Var = new x1.c0();
        c0Var.f39832b = new d0(qVar, i11);
        ?? obj = new Object();
        g0 g0Var = c0Var.f39833c;
        if (g0Var != null) {
            g0Var.f39853a = null;
        }
        c0Var.f39833c = obj;
        obj.f39853a = c0Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(obj);
        g1.o k10 = androidx.compose.ui.layout.a.k(androidx.compose.ui.draw.a.d(a10.g(c0Var), new c.g(23, this, aVar, this)), new e(this, aVar, i13));
        aVar.Z(this.f41099h.g(k10));
        int i14 = 9;
        this.f41100i = new y0(i14, aVar, k10);
        aVar.W(this.f41101j);
        this.f41102k = new e1(aVar, i14);
        aVar.C = new e(this, aVar, i11);
        aVar.D = new d0(qVar, i12);
        aVar.Y(new f(qVar, aVar));
        this.f41113v = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t1 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((a0) this.f41094c).getSnapshotObserver();
        }
        t0.t.C0("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    public static final int k(k kVar, int i10, int i11, int i12) {
        kVar.getClass();
        if (i12 < 0 && i10 != i11) {
            if (i12 == -2 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
            }
            if (i12 == -1 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.d.f(i12, i10, i11), 1073741824);
    }

    @Override // t0.l
    public final void a() {
        this.f41098g.mo2invoke();
    }

    @Override // t0.l
    public final void b() {
        this.f41097f.mo2invoke();
        removeAllViewsInLayout();
    }

    @Override // d4.b0
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        long j10;
        if (!this.f41093b.isNestedScrollingEnabled()) {
            return;
        }
        float f10 = i10;
        float f11 = -1;
        long g10 = t0.t.g(f10 * f11, i11 * f11);
        long g11 = t0.t.g(i12 * f11, i13 * f11);
        if (i14 == 0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        w1.g d10 = this.f41092a.d();
        if (d10 != null) {
            j10 = d10.l0(i15, g10, g11);
        } else {
            j10 = m1.c.f27233b;
        }
        iArr[0] = w0.f(m1.c.d(j10));
        iArr[1] = w0.f(m1.c.e(j10));
    }

    @Override // d4.a0
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (!this.f41093b.isNestedScrollingEnabled()) {
            return;
        }
        float f10 = i10;
        float f11 = -1;
        long g10 = t0.t.g(f10 * f11, i11 * f11);
        long g11 = t0.t.g(i12 * f11, i13 * f11);
        if (i14 == 0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        int i16 = i15;
        w1.g d10 = this.f41092a.d();
        if (d10 != null) {
            d10.l0(i16, g10, g11);
        } else {
            int i17 = m1.c.f27236e;
        }
    }

    @Override // d4.a0
    public final boolean e(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // d4.a0
    public final void f(View view, View view2, int i10, int i11) {
        this.f41111t.d(i10, i11);
    }

    @Override // d4.a0
    public final void g(View view, int i10) {
        c0 c0Var = this.f41111t;
        if (i10 == 1) {
            c0Var.f13728b = 0;
        } else {
            c0Var.f13727a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f41108q;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final w2.b getDensity() {
        return this.f41101j;
    }

    public final View getInteropView() {
        return this.f41093b;
    }

    @NotNull
    public final androidx.compose.ui.node.a getLayoutNode() {
        return this.f41113v;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f41093b.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final t getLifecycleOwner() {
        return this.f41103l;
    }

    @NotNull
    public final g1.o getModifier() {
        return this.f41099h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.f41111t;
        return c0Var.f13728b | c0Var.f13727a;
    }

    public final Function1<w2.b, Unit> getOnDensityChanged$ui_release() {
        return this.f41102k;
    }

    public final Function1<g1.o, Unit> getOnModifierChanged$ui_release() {
        return this.f41100i;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f41107p;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.f41098g;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f41097f;
    }

    public final o7.f getSavedStateRegistryOwner() {
        return this.f41104m;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.f41095d;
    }

    @NotNull
    public final View getView() {
        return this.f41093b;
    }

    @Override // d4.a0
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        long j10;
        if (!this.f41093b.isNestedScrollingEnabled()) {
            return;
        }
        float f10 = i10;
        float f11 = -1;
        long g10 = t0.t.g(f10 * f11, i11 * f11);
        if (i12 == 0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w1.g d10 = this.f41092a.d();
        if (d10 != null) {
            j10 = d10.I(i13, g10);
        } else {
            j10 = m1.c.f27233b;
        }
        iArr[0] = w0.f(m1.c.d(j10));
        iArr[1] = w0.f(m1.c.e(j10));
    }

    @Override // t0.l
    public final void i() {
        View view = this.f41093b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f41097f.mo2invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.f41112u) {
            this.f41093b.postOnAnimation(new y(this.f41106o, 1));
            return null;
        }
        this.f41113v.x();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f41093b.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41105n.mo2invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.f41112u) {
            this.f41093b.postOnAnimation(new y(this.f41106o, 1));
        } else {
            this.f41113v.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:4:0x000e, B:6:0x0016, B:9:0x007a, B:12:0x0084, B:14:0x0087, B:16:0x0097, B:18:0x008c, B:22:0x0029, B:25:0x0035, B:27:0x004a, B:29:0x0056, B:31:0x0060, B:33:0x006d, B:39:0x0075, B:42:0x009b), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            c2.t1 r0 = r22.getSnapshotObserver()
            e1.v r0 = r0.f7840a
            v0.h r2 = r0.f14937f
            monitor-enter(r2)
            v0.h r0 = r0.f14937f     // Catch: java.lang.Throwable -> L95
            int r3 = r0.f37655c     // Catch: java.lang.Throwable -> L95
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r3) goto L9b
            java.lang.Object[] r7 = r0.f37653a     // Catch: java.lang.Throwable -> L95
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L95
            e1.u r7 = (e1.u) r7     // Catch: java.lang.Throwable -> L95
            t.z r8 = r7.f14925f     // Catch: java.lang.Throwable -> L95
            java.lang.Object r8 = r8.i(r1)     // Catch: java.lang.Throwable -> L95
            t.y r8 = (t.y) r8     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L7a
        L29:
            java.lang.Object[] r9 = r8.f34926b     // Catch: java.lang.Throwable -> L95
            int[] r10 = r8.f34927c     // Catch: java.lang.Throwable -> L95
            long[] r8 = r8.f34925a     // Catch: java.lang.Throwable -> L95
            int r11 = r8.length     // Catch: java.lang.Throwable -> L95
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L95
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L95
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L73
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L95
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L71
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6d
            int r18 = r12 << 3
            int r18 = r18 + r15
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L95
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L95
            r7.d(r1, r5)     // Catch: java.lang.Throwable -> L95
            r5 = 8
        L6d:
            long r13 = r13 >> r5
            int r15 = r15 + 1
            goto L54
        L71:
            if (r4 != r5) goto L7a
        L73:
            if (r12 == r11) goto L7a
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L7a:
            t.z r4 = r7.f14925f     // Catch: java.lang.Throwable -> L95
            int r4 = r4.f34935e     // Catch: java.lang.Throwable -> L95
            r5 = 1
            if (r4 == 0) goto L83
            r4 = r5
            goto L84
        L83:
            r4 = 0
        L84:
            r4 = r4 ^ r5
            if (r4 == 0) goto L8a
            int r6 = r6 + 1
            goto L97
        L8a:
            if (r6 <= 0) goto L97
            java.lang.Object[] r4 = r0.f37653a     // Catch: java.lang.Throwable -> L95
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L95
            r4[r5] = r7     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r0 = move-exception
            goto La8
        L97:
            int r5 = r16 + 1
            goto L14
        L9b:
            java.lang.Object[] r4 = r0.f37653a     // Catch: java.lang.Throwable -> L95
            int r5 = r3 - r6
            vt.t.k(r5, r3, r4)     // Catch: java.lang.Throwable -> L95
            r0.f37655c = r5     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r0 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)
            return
        La8:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.k.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f41093b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f41093b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f41109r = i10;
        this.f41110s = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f41093b.isNestedScrollingEnabled()) {
            return false;
        }
        yk.g.H(this.f41092a.c(), null, null, new g(z10, this, hl.f.n(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f41093b.isNestedScrollingEnabled()) {
            return false;
        }
        yk.g.H(this.f41092a.c(), null, null, new h(this, hl.f.n(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // c2.s1
    public final boolean r() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        Function1 function1 = this.f41107p;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(@NotNull w2.b bVar) {
        if (bVar != this.f41101j) {
            this.f41101j = bVar;
            Function1 function1 = this.f41102k;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }
    }

    public final void setLifecycleOwner(t tVar) {
        if (tVar != this.f41103l) {
            this.f41103l = tVar;
            yk.j.r1(this, tVar);
        }
    }

    public final void setModifier(@NotNull g1.o oVar) {
        if (oVar != this.f41099h) {
            this.f41099h = oVar;
            Function1 function1 = this.f41100i;
            if (function1 != null) {
                function1.invoke(oVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super w2.b, Unit> function1) {
        this.f41102k = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super g1.o, Unit> function1) {
        this.f41100i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.f41107p = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.f41098g = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.f41097f = function0;
    }

    public final void setSavedStateRegistryOwner(o7.f fVar) {
        if (fVar != this.f41104m) {
            this.f41104m = fVar;
            yk.g.Z(this, fVar);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.f41095d = function0;
        this.f41096e = true;
        this.f41105n.mo2invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
