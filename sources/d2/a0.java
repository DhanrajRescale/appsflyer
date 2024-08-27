package d2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import ut.t;

/* loaded from: classes.dex */
public final class a0 extends ViewGroup implements c2.r1, c2.y1, x1.f0, androidx.lifecycle.e {
    public static Class N0;
    public static Method O0;
    public boolean A;
    public final b2.e A0;
    public m1 B;
    public final d1 B0;
    public y1 C;
    public MotionEvent C0;
    public w2.a D;
    public long D0;
    public boolean E;
    public final p3 E0;
    public final c2.x0 F;
    public final v0.h F0;
    public final l1 G;
    public final h.q0 G0;
    public long H;
    public final androidx.activity.b H0;
    public final int[] I;
    public boolean I0;
    public final float[] J;
    public final x J0;
    public final n1 K0;
    public boolean L0;
    public final w M0;

    /* renamed from: a, reason: collision with root package name */
    public long f13300a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13301b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.j0 f13302c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f13303d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.focus.b f13304e;

    /* renamed from: e0, reason: collision with root package name */
    public final float[] f13305e0;

    /* renamed from: f, reason: collision with root package name */
    public CoroutineContext f13306f;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f13307f0;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f13308g;

    /* renamed from: g0, reason: collision with root package name */
    public long f13309g0;

    /* renamed from: h, reason: collision with root package name */
    public final r3 f13310h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13311h0;

    /* renamed from: i, reason: collision with root package name */
    public final e.l f13312i;

    /* renamed from: i0, reason: collision with root package name */
    public long f13313i0;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.ui.node.a f13314j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13315j0;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f13316k;

    /* renamed from: k0, reason: collision with root package name */
    public final t0.n1 f13317k0;

    /* renamed from: l, reason: collision with root package name */
    public final h2.p f13318l;

    /* renamed from: l0, reason: collision with root package name */
    public final t0.j0 f13319l0;

    /* renamed from: m, reason: collision with root package name */
    public final r0 f13320m;

    /* renamed from: m0, reason: collision with root package name */
    public Function1 f13321m0;

    /* renamed from: n, reason: collision with root package name */
    public i1.c f13322n;
    public final m n0;

    /* renamed from: o, reason: collision with root package name */
    public final k f13323o;

    /* renamed from: o0, reason: collision with root package name */
    public final n f13324o0;

    /* renamed from: p, reason: collision with root package name */
    public final h1.g f13325p;

    /* renamed from: p0, reason: collision with root package name */
    public final o f13326p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f13327q;

    /* renamed from: q0, reason: collision with root package name */
    public final p2.g0 f13328q0;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f13329r;

    /* renamed from: r0, reason: collision with root package name */
    public final p2.d0 f13330r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13331s;

    /* renamed from: s0, reason: collision with root package name */
    public final AtomicReference f13332s0;

    /* renamed from: t, reason: collision with root package name */
    public final x1.g f13333t;

    /* renamed from: t0, reason: collision with root package name */
    public final u1 f13334t0;

    /* renamed from: u, reason: collision with root package name */
    public final x1.x f13335u;

    /* renamed from: u0, reason: collision with root package name */
    public final b2 f13336u0;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f13337v;

    /* renamed from: v0, reason: collision with root package name */
    public final t0.n1 f13338v0;

    /* renamed from: w, reason: collision with root package name */
    public final h1.a f13339w;

    /* renamed from: w0, reason: collision with root package name */
    public int f13340w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13341x;

    /* renamed from: x0, reason: collision with root package name */
    public final t0.n1 f13342x0;

    /* renamed from: y, reason: collision with root package name */
    public final l f13343y;

    /* renamed from: y0, reason: collision with root package name */
    public final t1.b f13344y0;

    /* renamed from: z, reason: collision with root package name */
    public final c2.t1 f13345z;

    /* renamed from: z0, reason: collision with root package name */
    public final u1.c f13346z0;

    /* JADX WARN: Type inference failed for: r13v12, types: [d2.b2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [d2.m] */
    /* JADX WARN: Type inference failed for: r13v5, types: [d2.n] */
    /* JADX WARN: Type inference failed for: r13v6, types: [d2.o] */
    /* JADX WARN: Type inference failed for: r15v0, types: [iu.h, d2.u] */
    /* JADX WARN: Type inference failed for: r4v1, types: [iu.u, d2.v] */
    public a0(Context context, CoroutineContext coroutineContext) {
        super(context);
        h1.a aVar;
        int i10;
        int i11;
        n1 p1Var;
        this.f13300a = m1.c.f27235d;
        int i12 = 1;
        this.f13301b = true;
        this.f13302c = new c2.j0();
        w2.d n10 = yk.j.n(context);
        t0.g2 g2Var = t0.g2.f35024a;
        this.f13303d = t0.t.n0(n10, g2Var);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f1440b;
        this.f13304e = new androidx.compose.ui.focus.b(new i0.g2(this, 2), new iu.h(2, this, a0.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new l1.d(this, 3), new iu.u(this, a0.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        x1 x1Var = new x1();
        this.f13306f = coroutineContext;
        this.f13308g = x1Var;
        this.f13310h = new r3();
        g1.o c10 = androidx.compose.ui.input.key.a.c(new r(this, i12));
        g1.o a10 = androidx.compose.ui.input.rotary.a.a();
        int i13 = 7;
        this.f13312i = new e.l(7);
        int i14 = 0;
        androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(3, false, 0);
        aVar2.Y(a2.e1.f58b);
        aVar2.W(getDensity());
        aVar2.Z(emptySemanticsElement.g(a10).g(c10).g(((androidx.compose.ui.focus.b) getFocusOwner()).f1366g).g(x1Var.f13681c));
        this.f13314j = aVar2;
        this.f13316k = this;
        this.f13318l = new h2.p(getRoot());
        r0 r0Var = new r0(this);
        this.f13320m = r0Var;
        this.f13322n = new i1.c(this, new l1.d(this, 2));
        this.f13323o = new k(context);
        this.f13325p = new h1.g();
        this.f13327q = new ArrayList();
        this.f13333t = new x1.g();
        this.f13335u = new x1.x(getRoot());
        this.f13337v = s.f13605c;
        w2.k kVar = null;
        if (j()) {
            aVar = new h1.a(this, getAutofillTree());
        } else {
            aVar = null;
        }
        this.f13339w = aVar;
        this.f13343y = new l(context);
        this.f13345z = new c2.t1(new r(this, 2));
        this.F = new c2.x0(getRoot());
        this.G = new l1(ViewConfiguration.get(context));
        this.H = hl.f.j(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.I = new int[]{0, 0};
        float[] fArr = {1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
        this.J = fArr;
        this.f13305e0 = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
        this.f13307f0 = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
        this.f13309g0 = -1L;
        this.f13313i0 = m1.c.f27234c;
        this.f13315j0 = true;
        t0.o3 o3Var = t0.o3.f35116a;
        this.f13317k0 = t0.t.n0(null, o3Var);
        this.f13319l0 = t0.t.N(new x(this, i12));
        this.n0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: d2.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                a0.this.H();
            }
        };
        this.f13324o0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: d2.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                a0.this.H();
            }
        };
        this.f13326p0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: d2.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                int i15;
                u1.c cVar = a0.this.f13346z0;
                if (z10) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                cVar.getClass();
                cVar.f36666b.setValue(new u1.a(i15));
            }
        };
        p2.g0 g0Var = new p2.g0(getView(), this);
        this.f13328q0 = g0Var;
        this.f13330r0 = new p2.d0((p2.x) s.f13610h.invoke(g0Var));
        this.f13332s0 = new AtomicReference(null);
        this.f13334t0 = new u1(getTextInputService());
        this.f13336u0 = new Object();
        this.f13338v0 = t0.t.n0(w0.h(context), g2Var);
        Configuration configuration = context.getResources().getConfiguration();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            i10 = configuration.fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        this.f13340w0 = i10;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        w2.k kVar2 = w2.k.f38799a;
        if (layoutDirection != 0) {
            if (layoutDirection == 1) {
                kVar = w2.k.f38800b;
            }
        } else {
            kVar = kVar2;
        }
        this.f13342x0 = t0.t.n0(kVar != null ? kVar : kVar2, o3Var);
        this.f13344y0 = new t1.b(this);
        if (isInTouchMode()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f13346z0 = new u1.c(i11, new r(this, i14));
        this.A0 = new b2.e(this);
        this.B0 = new d1(this);
        this.E0 = new p3();
        this.F0 = new v0.h(new Function0[16]);
        this.G0 = new h.q0(this, 4);
        this.H0 = new androidx.activity.b(this, i13);
        this.J0 = new x(this, i14);
        if (i15 < 29) {
            p1Var = new o1(fArr);
        } else {
            p1Var = new p1();
        }
        this.K0 = p1Var;
        addOnAttachStateChangeListener(this.f13322n);
        setWillNotDraw(false);
        setFocusable(true);
        if (i15 >= 26) {
            v0.f13652a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        d4.n1.n(this, r0Var);
        setOnDragListener(x1Var);
        getRoot().c(this);
        if (i15 >= 29) {
            s0.f13615a.a(this);
        }
        this.M0 = new w(this);
    }

    public static final void e(a0 a0Var, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        r0 r0Var = a0Var.f13320m;
        if (Intrinsics.a(str, r0Var.E)) {
            Integer num2 = (Integer) r0Var.C.g(i10);
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (Intrinsics.a(str, r0Var.F) && (num = (Integer) r0Var.D.g(i10)) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    @ut.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q get_viewTreeOwners() {
        return (q) this.f13317k0.getValue();
    }

    public static final boolean i(a0 a0Var, l1.b bVar, m1.d dVar) {
        Integer num;
        a0Var.getClass();
        Rect rect = null;
        int i10 = 130;
        if (bVar != null) {
            int i11 = bVar.f23884a;
            if (l1.b.a(i11, 5)) {
                num = 33;
            } else if (l1.b.a(i11, 6)) {
                num = 130;
            } else if (l1.b.a(i11, 3)) {
                num = 17;
            } else if (l1.b.a(i11, 4)) {
                num = 66;
            } else if (l1.b.a(i11, 1)) {
                num = 2;
            } else if (l1.b.a(i11, 2)) {
                num = 1;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            }
        }
        if (dVar != null) {
            rect = new Rect((int) dVar.f27239a, (int) dVar.f27240b, (int) dVar.f27241c, (int) dVar.f27242d);
        }
        return super.requestFocus(i10, rect);
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void k(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof a0) {
                ((a0) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt);
            }
        }
    }

    public static long l(int i10) {
        long j10;
        long j11;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    j11 = size;
                    t.Companion companion = ut.t.INSTANCE;
                    j10 = j11 << 32;
                    return j10 | j11;
                }
                throw new IllegalStateException();
            }
            t.Companion companion2 = ut.t.INSTANCE;
            j10 = 0 << 32;
            size = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } else {
            t.Companion companion3 = ut.t.INSTANCE;
            j10 = 0 << 32;
        }
        j11 = size;
        return j10 | j11;
    }

    public static View m(View view, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (Intrinsics.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View m10 = m(viewGroup.getChildAt(i11), i10);
                    if (m10 != null) {
                        return m10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void o(androidx.compose.ui.node.a aVar) {
        aVar.y();
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                o((androidx.compose.ui.node.a) objArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            d2.j2 r0 = d2.j2.f13469a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a0.q(android.view.MotionEvent):boolean");
    }

    private void setDensity(w2.b bVar) {
        this.f13303d.setValue(bVar);
    }

    private void setFontFamilyResolver(o2.r rVar) {
        this.f13338v0.setValue(rVar);
    }

    private void setLayoutDirection(w2.k kVar) {
        this.f13342x0.setValue(kVar);
    }

    private final void set_viewTreeOwners(q qVar) {
        this.f13317k0.setValue(qVar);
    }

    public final void A() {
        r0 r0Var = this.f13320m;
        r0Var.f13599y = true;
        if (r0Var.x() && !r0Var.J) {
            r0Var.J = true;
            r0Var.f13586l.post(r0Var.K);
        }
        i1.c cVar = this.f13322n;
        cVar.f19319h = true;
        if (cVar.i() && !cVar.f19327p) {
            cVar.f19327p = true;
            cVar.f19322k.post(cVar.f19328q);
        }
    }

    public final void B() {
        if (!this.f13311h0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f13309g0) {
                this.f13309g0 = currentAnimationTimeMillis;
                n1 n1Var = this.K0;
                float[] fArr = this.f13305e0;
                n1Var.a(this, fArr);
                t0.t.Y(fArr, this.f13307f0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.I;
                view.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                view.getLocationInWindow(iArr);
                this.f13313i0 = t0.t.g(f10 - iArr[0], f11 - iArr[1]);
            }
        }
    }

    public final void C(androidx.compose.ui.node.a aVar) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (aVar != null) {
                while (aVar != null && aVar.f1423x.f7827o.f7783k == 1) {
                    if (!this.E) {
                        androidx.compose.ui.node.a q10 = aVar.q();
                        if (q10 == null) {
                            break;
                        }
                        long j10 = q10.f1422w.f7655b.f32d;
                        if (w2.a.f(j10) && w2.a.e(j10)) {
                            break;
                        }
                    }
                    aVar = aVar.q();
                }
                if (aVar == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    public final long D(long j10) {
        B();
        float d10 = m1.c.d(j10) - m1.c.d(this.f13313i0);
        float e10 = m1.c.e(j10) - m1.c.e(this.f13313i0);
        return n1.k0.a(t0.t.g(d10, e10), this.f13307f0);
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        int i10 = 0;
        if (this.L0) {
            this.L0 = false;
            int metaState = motionEvent.getMetaState();
            this.f13310h.getClass();
            r3.f13602b.setValue(new x1.e0(metaState));
        }
        x1.g gVar = this.f13333t;
        x1.v a10 = gVar.a(motionEvent, this);
        x1.x xVar = this.f13335u;
        if (a10 != null) {
            List list = a10.f39925a;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i11 = size - 1;
                    obj = list.get(size);
                    if (((x1.w) obj).f39931e) {
                        break;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
            obj = null;
            x1.w wVar = (x1.w) obj;
            if (wVar != null) {
                this.f13300a = wVar.f39930d;
            }
            i10 = xVar.a(a10, this, r(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i10 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                gVar.f39849c.delete(pointerId);
                gVar.f39848b.delete(pointerId);
            }
        } else {
            xVar.b();
        }
        return i10;
    }

    public final void F(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int i11;
        int buttonState;
        long downTime;
        int i12;
        int actionMasked = motionEvent.getActionMasked();
        int i13 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i13 = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            i13 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i13 >= 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = pointerCount - i11;
        if (i14 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
        }
        for (int i17 = 0; i17 < i14; i17++) {
            if (i13 >= 0 && i17 >= i13) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i18 = i12 + i17;
            motionEvent.getPointerProperties(i18, pointerPropertiesArr[i17]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
            motionEvent.getPointerCoords(i18, pointerCoords);
            long t10 = t(t0.t.g(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = m1.c.d(t10);
            pointerCoords.y = m1.c.e(t10);
        }
        if (z10) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j10;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j10, i10, i14, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        x1.v a10 = this.f13333t.a(obtain, this);
        Intrinsics.c(a10);
        this.f13335u.a(a10, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(j0.i r6, yt.a r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d2.z
            if (r0 == 0) goto L13
            r0 = r7
            d2.z r0 = (d2.z) r0
            int r1 = r0.f13695c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13695c = r1
            goto L18
        L13:
            d2.z r0 = new d2.z
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13693a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f13695c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            ut.n.b(r7)
            goto L49
        L2f:
            ut.n.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f13332s0
            d2.r r2 = new d2.r
            r4 = 3
            r2.<init>(r5, r4)
            r0.f13695c = r3
            g1.s r3 = new g1.s
            r4 = 0
            r3.<init>(r7, r4, r2, r6)
            java.lang.Object r6 = hl.f.P(r3, r0)
            if (r6 != r1) goto L49
            return
        L49:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a0.G(j0.i, yt.a):void");
    }

    public final void H() {
        int[] iArr = this.I;
        getLocationOnScreen(iArr);
        long j10 = this.H;
        int i10 = w2.h.f38792c;
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        boolean z10 = false;
        int i13 = iArr[0];
        if (i11 != i13 || i12 != iArr[1]) {
            this.H = hl.f.j(i13, iArr[1]);
            if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
                getRoot().f1423x.f7827o.B0();
                z10 = true;
            }
        }
        this.F.a(z10);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        h1.a aVar;
        if (j() && (aVar = this.f13339w) != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                AutofillValue l10 = h1.b.l(sparseArray.get(keyAt));
                h1.e eVar = h1.e.f17806a;
                if (eVar.d(l10)) {
                    eVar.i(l10).toString();
                    a3.a.u(aVar.f17803b.f17808a.get(Integer.valueOf(keyAt)));
                } else if (!eVar.b(l10)) {
                    if (!eVar.c(l10)) {
                        if (eVar.e(l10)) {
                            Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", "message");
                            throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for list", "message");
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for date", "message");
                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.t tVar) {
        setShowLayoutBounds(p1.l.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f13320m.m(i10, this.f13300a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f13320m.m(i10, this.f13300a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            o(getRoot());
        }
        u(true);
        yq.b.m();
        this.f13331s = true;
        e.l lVar = this.f13312i;
        n1.c cVar = (n1.c) lVar.f14641b;
        Canvas canvas2 = cVar.f28123a;
        cVar.f28123a = canvas;
        getRoot().h(cVar);
        ((n1.c) lVar.f14641b).f28123a = canvas2;
        ArrayList arrayList = this.f13327q;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c2.p1) arrayList.get(i10)).k();
            }
        }
        if (l3.f13503t) {
            int save = canvas.save();
            canvas.clipRect(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.f13331s = false;
        ArrayList arrayList2 = this.f13329r;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v20, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r14v11, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r14v12, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float a10;
        float a11;
        z1.a aVar;
        int size;
        c2.b1 b1Var;
        c2.o oVar;
        c2.b1 b1Var2;
        if (motionEvent.getActionMasked() == 8) {
            if (!q(motionEvent) && isAttachedToWindow()) {
                if (motionEvent.isFromSource(4194304)) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    float f10 = -motionEvent.getAxisValue(26);
                    Context context = getContext();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 26) {
                        Method method = d4.r1.f13811a;
                        a10 = d4.o1.b(viewConfiguration);
                    } else {
                        a10 = d4.r1.a(viewConfiguration, context);
                    }
                    float f11 = a10 * f10;
                    Context context2 = getContext();
                    if (i10 >= 26) {
                        a11 = d4.o1.a(viewConfiguration);
                    } else {
                        a11 = d4.r1.a(viewConfiguration, context2);
                    }
                    z1.c cVar = new z1.c(f11, a11 * f10, motionEvent.getEventTime(), motionEvent.getDeviceId());
                    androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
                    if (!bVar.f1364e.a()) {
                        l1.t f12 = androidx.compose.ui.focus.a.f(bVar.f1363d);
                        if (f12 != null) {
                            g1.n nVar = f12.f16405a;
                            if (nVar.f16417m) {
                                g1.n nVar2 = nVar.f16409e;
                                androidx.compose.ui.node.a y10 = c2.g.y(f12);
                                loop0: while (true) {
                                    if (y10 != null) {
                                        if ((y10.f1422w.f7658e.f16408d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            while (nVar2 != null) {
                                                if ((nVar2.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                    ?? r72 = 0;
                                                    oVar = nVar2;
                                                    while (oVar != 0) {
                                                        if (oVar instanceof z1.a) {
                                                            break loop0;
                                                        }
                                                        if ((oVar.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (oVar instanceof c2.o)) {
                                                            g1.n nVar3 = oVar.f7801o;
                                                            int i11 = 0;
                                                            oVar = oVar;
                                                            r72 = r72;
                                                            while (nVar3 != null) {
                                                                if ((nVar3.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                                    i11++;
                                                                    r72 = r72;
                                                                    if (i11 == 1) {
                                                                        oVar = nVar3;
                                                                    } else {
                                                                        if (r72 == 0) {
                                                                            r72 = new v0.h(new g1.n[16]);
                                                                        }
                                                                        if (oVar != 0) {
                                                                            r72.b(oVar);
                                                                            oVar = 0;
                                                                        }
                                                                        r72.b(nVar3);
                                                                    }
                                                                }
                                                                nVar3 = nVar3.f16410f;
                                                                oVar = oVar;
                                                                r72 = r72;
                                                            }
                                                            if (i11 == 1) {
                                                            }
                                                        }
                                                        oVar = c2.g.f(r72);
                                                    }
                                                }
                                                nVar2 = nVar2.f16409e;
                                            }
                                        }
                                        y10 = y10.q();
                                        if (y10 != null && (b1Var2 = y10.f1422w) != null) {
                                            nVar2 = b1Var2.f7657d;
                                        } else {
                                            nVar2 = null;
                                        }
                                    } else {
                                        oVar = 0;
                                        break;
                                    }
                                }
                                aVar = (z1.a) oVar;
                            } else {
                                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                            }
                        } else {
                            aVar = null;
                        }
                        if (aVar == null) {
                            return false;
                        }
                        g1.n nVar4 = (g1.n) aVar;
                        g1.n nVar5 = nVar4.f16405a;
                        if (nVar5.f16417m) {
                            g1.n nVar6 = nVar5.f16409e;
                            androidx.compose.ui.node.a y11 = c2.g.y(aVar);
                            ArrayList arrayList = null;
                            while (y11 != null) {
                                if ((y11.f1422w.f7658e.f16408d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    while (nVar6 != null) {
                                        if ((nVar6.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            g1.n nVar7 = nVar6;
                                            v0.h hVar = null;
                                            while (nVar7 != null) {
                                                if (nVar7 instanceof z1.a) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(nVar7);
                                                } else if ((nVar7.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (nVar7 instanceof c2.o)) {
                                                    int i12 = 0;
                                                    for (g1.n nVar8 = ((c2.o) nVar7).f7801o; nVar8 != null; nVar8 = nVar8.f16410f) {
                                                        if ((nVar8.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                nVar7 = nVar8;
                                                            } else {
                                                                if (hVar == null) {
                                                                    hVar = new v0.h(new g1.n[16]);
                                                                }
                                                                if (nVar7 != null) {
                                                                    hVar.b(nVar7);
                                                                    nVar7 = null;
                                                                }
                                                                hVar.b(nVar8);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                nVar7 = c2.g.f(hVar);
                                            }
                                        }
                                        nVar6 = nVar6.f16409e;
                                    }
                                }
                                y11 = y11.q();
                                if (y11 != null && (b1Var = y11.f1422w) != null) {
                                    nVar6 = b1Var.f7657d;
                                } else {
                                    nVar6 = null;
                                }
                            }
                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i13 = size - 1;
                                    Function1 function1 = ((z1.b) ((z1.a) arrayList.get(size))).f41900o;
                                    if (function1 != null && ((Boolean) function1.invoke(cVar)).booleanValue()) {
                                        break;
                                    }
                                    if (i13 < 0) {
                                        break;
                                    }
                                    size = i13;
                                }
                            }
                            c2.o oVar2 = nVar4.f16405a;
                            ?? r52 = 0;
                            while (true) {
                                if (oVar2 != 0) {
                                    if (oVar2 instanceof z1.a) {
                                        Function1 function12 = ((z1.b) ((z1.a) oVar2)).f41900o;
                                        if (function12 != null && ((Boolean) function12.invoke(cVar)).booleanValue()) {
                                            break;
                                        }
                                    } else if ((oVar2.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (oVar2 instanceof c2.o)) {
                                        g1.n nVar9 = oVar2.f7801o;
                                        int i14 = 0;
                                        oVar2 = oVar2;
                                        r52 = r52;
                                        while (nVar9 != null) {
                                            if ((nVar9.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                i14++;
                                                r52 = r52;
                                                if (i14 == 1) {
                                                    oVar2 = nVar9;
                                                } else {
                                                    if (r52 == 0) {
                                                        r52 = new v0.h(new g1.n[16]);
                                                    }
                                                    if (oVar2 != 0) {
                                                        r52.b(oVar2);
                                                        oVar2 = 0;
                                                    }
                                                    r52.b(nVar9);
                                                }
                                            }
                                            nVar9 = nVar9.f16410f;
                                            oVar2 = oVar2;
                                            r52 = r52;
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    oVar2 = c2.g.f(r52);
                                } else {
                                    c2.o oVar3 = nVar4.f16405a;
                                    ?? r02 = 0;
                                    while (true) {
                                        if (oVar3 != 0) {
                                            if (oVar3 instanceof z1.a) {
                                                Function1 function13 = ((z1.b) ((z1.a) oVar3)).f41899n;
                                                if (function13 != null && ((Boolean) function13.invoke(cVar)).booleanValue()) {
                                                    break;
                                                }
                                            } else if ((oVar3.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (oVar3 instanceof c2.o)) {
                                                g1.n nVar10 = oVar3.f7801o;
                                                int i15 = 0;
                                                r02 = r02;
                                                oVar3 = oVar3;
                                                while (nVar10 != null) {
                                                    if ((nVar10.f16407c & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                        i15++;
                                                        r02 = r02;
                                                        if (i15 == 1) {
                                                            oVar3 = nVar10;
                                                        } else {
                                                            if (r02 == 0) {
                                                                r02 = new v0.h(new g1.n[16]);
                                                            }
                                                            if (oVar3 != 0) {
                                                                r02.b(oVar3);
                                                                oVar3 = 0;
                                                            }
                                                            r02.b(nVar10);
                                                        }
                                                    }
                                                    nVar10 = nVar10.f16410f;
                                                    r02 = r02;
                                                    oVar3 = oVar3;
                                                }
                                                if (i15 == 1) {
                                                }
                                            }
                                            oVar3 = c2.g.f(r02);
                                        } else {
                                            if (arrayList == null) {
                                                return false;
                                            }
                                            int size2 = arrayList.size();
                                            for (int i16 = 0; i16 < size2; i16++) {
                                                Function1 function14 = ((z1.b) ((z1.a) arrayList.get(i16))).f41899n;
                                                if (function14 == null || !((Boolean) function14.invoke(cVar)).booleanValue()) {
                                                }
                                            }
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                    } else {
                        throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
                    }
                } else if ((n(motionEvent) & 1) == 0) {
                    return false;
                }
                return true;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int i11;
        boolean z11 = this.I0;
        androidx.activity.b bVar = this.H0;
        if (z11) {
            removeCallbacks(bVar);
            bVar.run();
        }
        if (q(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        r0 r0Var = this.f13320m;
        AccessibilityManager accessibilityManager = r0Var.f13581g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int action = motionEvent.getAction();
            a0 a0Var = r0Var.f13578d;
            if (action != 7 && action != 9) {
                if (action == 10) {
                    int i12 = r0Var.f13579e;
                    if (i12 != Integer.MIN_VALUE) {
                        if (i12 != Integer.MIN_VALUE) {
                            r0Var.f13579e = Integer.MIN_VALUE;
                            r0.H(r0Var, Integer.MIN_VALUE, 128, null, 12);
                            r0.H(r0Var, i12, 256, null, 12);
                        }
                    } else {
                        a0Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                a0Var.u(true);
                c2.v vVar = new c2.v();
                androidx.compose.ui.node.a root = a0Var.getRoot();
                long g10 = t0.t.g(x10, y10);
                c2.b1 b1Var = root.f1422w;
                b1Var.f7656c.Z0(c2.i1.H, b1Var.f7656c.T0(g10), vVar, true, true);
                for (int f10 = vt.y.f(vVar); -1 < f10; f10--) {
                    Object obj = vVar.f7856a[f10];
                    Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                    androidx.compose.ui.node.a y11 = c2.g.y((g1.n) obj);
                    if (a0Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(y11) != null) {
                        break;
                    }
                    if (y11.f1422w.d(8)) {
                        int D = r0Var.D(y11.f1401b);
                        if (c3.e(w0.a(y11, false))) {
                            i11 = D;
                            break;
                        }
                    }
                }
                i11 = Integer.MIN_VALUE;
                a0Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i13 = r0Var.f13579e;
                if (i13 != i11) {
                    r0Var.f13579e = i11;
                    r0.H(r0Var, i11, 128, null, 12);
                    r0.H(r0Var, i13, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked != 10 || !r(motionEvent)) {
                i10 = 1;
            } else {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.C0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.C0 = MotionEvent.obtainNoHistory(motionEvent);
                this.I0 = true;
                post(bVar);
                return false;
            }
        } else {
            i10 = 1;
            if (!s(motionEvent)) {
                return false;
            }
        }
        if ((n(motionEvent) & i10) == 0) {
            return false;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:354:0x00c3, code lost:
    
        if (((((~r11) << 6) & r11) & (-9187201950435737472L)) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00c5, code lost:
    
        r3 = r7.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00cb, code lost:
    
        if (r7.f34918e != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0262, code lost:
    
        if (r7 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x00df, code lost:
    
        if (((r7.f34914a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x00e2, code lost:
    
        r3 = r7.f34916c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00e6, code lost:
    
        if (r3 <= 8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00e8, code lost:
    
        r4 = r7.f34917d;
        r6 = ut.t.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x00fe, code lost:
    
        if (java.lang.Long.compare((r4 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0100, code lost:
    
        r7.f(t.f0.b(r7.f34916c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0113, code lost:
    
        r3 = r7.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x010a, code lost:
    
        r7.f(t.f0.b(r7.f34916c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0117, code lost:
    
        r6 = r3;
        r7.f34917d++;
        r3 = r7.f34918e;
        r4 = r7.f34914a;
        r5 = r6 >> 3;
        r10 = r4[r5];
        r8 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0133, code lost:
    
        if (((r10 >> r8) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0135, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0138, code lost:
    
        r7.f34918e = r3 - r12;
        r4[r5] = ((~(255 << r8)) & r10) | (r13 << r8);
        r2 = r7.f34916c;
        r3 = ((r6 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r2] = (r4[r2] & (~(255 << r3))) | (r13 << r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0137, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01e2, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01e4, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04f5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x037f  */
    /* JADX WARN: Type inference failed for: r1v17, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v18, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v19, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v20, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r37) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a0.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        c2.b1 b1Var;
        if (isFocused()) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            if (!bVar.f1364e.a()) {
                l1.t f10 = androidx.compose.ui.focus.a.f(bVar.f1363d);
                if (f10 != null) {
                    g1.n nVar = f10.f16405a;
                    if (nVar.f16417m) {
                        g1.n nVar2 = nVar.f16409e;
                        androidx.compose.ui.node.a y10 = c2.g.y(f10);
                        while (y10 != null) {
                            if ((y10.f1422w.f7658e.f16408d & 131072) != 0) {
                                while (nVar2 != null) {
                                    if ((nVar2.f16407c & 131072) != 0) {
                                        g1.n nVar3 = nVar2;
                                        v0.h hVar = null;
                                        while (nVar3 != null) {
                                            if ((nVar3.f16407c & 131072) != 0 && (nVar3 instanceof c2.o)) {
                                                int i10 = 0;
                                                for (g1.n nVar4 = ((c2.o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                                    if ((nVar4.f16407c & 131072) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            nVar3 = nVar4;
                                                        } else {
                                                            if (hVar == null) {
                                                                hVar = new v0.h(new g1.n[16]);
                                                            }
                                                            if (nVar3 != null) {
                                                                hVar.b(nVar3);
                                                                nVar3 = null;
                                                            }
                                                            hVar.b(nVar4);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            nVar3 = c2.g.f(hVar);
                                        }
                                    }
                                    nVar2 = nVar2.f16409e;
                                }
                            }
                            y10 = y10.q();
                            if (y10 != null && (b1Var = y10.f1422w) != null) {
                                nVar2 = b1Var.f7657d;
                            } else {
                                nVar2 = null;
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
            } else {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.".toString());
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I0) {
            androidx.activity.b bVar = this.H0;
            removeCallbacks(bVar);
            MotionEvent motionEvent2 = this.C0;
            Intrinsics.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.I0 = false;
            } else {
                bVar.run();
            }
        }
        if (q(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !s(motionEvent)) {
            return false;
        }
        int n10 = n(motionEvent);
        if ((n10 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((n10 & 1) == 0) {
            return false;
        }
        return true;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = m(this, i10);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.View
    public final View focusSearch(int i10) {
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f1363d.R0().ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                View focusSearch = super.focusSearch(i10);
                if (focusSearch != null) {
                    return focusSearch;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i10 == 1 || i10 == 2) {
            clearFocus();
        }
        return this;
    }

    @NotNull
    public k getAccessibilityManager() {
        return this.f13323o;
    }

    @NotNull
    public final m1 getAndroidViewsHandler$ui_release() {
        if (this.B == null) {
            m1 m1Var = new m1(getContext());
            this.B = m1Var;
            addView(m1Var);
        }
        m1 m1Var2 = this.B;
        Intrinsics.c(m1Var2);
        return m1Var2;
    }

    public h1.c getAutofill() {
        return this.f13339w;
    }

    @NotNull
    public h1.g getAutofillTree() {
        return this.f13325p;
    }

    @NotNull
    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public l m23getClipboardManager() {
        return this.f13343y;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.f13337v;
    }

    @NotNull
    public final i1.c getContentCaptureManager$ui_release() {
        return this.f13322n;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f13306f;
    }

    @NotNull
    public w2.b getDensity() {
        return (w2.b) this.f13303d.getValue();
    }

    @NotNull
    public j1.b getDragAndDropManager() {
        return this.f13308g;
    }

    @NotNull
    public l1.f getFocusOwner() {
        return this.f13304e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        m1.d dVar;
        l1.t f10 = androidx.compose.ui.focus.a.f(((androidx.compose.ui.focus.b) getFocusOwner()).f1363d);
        Unit unit = null;
        if (f10 != null) {
            dVar = androidx.compose.ui.focus.a.i(f10);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            rect.left = Math.round(dVar.f27239a);
            rect.top = Math.round(dVar.f27240b);
            rect.right = Math.round(dVar.f27241c);
            rect.bottom = Math.round(dVar.f27242d);
            unit = Unit.f23355a;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @NotNull
    public o2.r getFontFamilyResolver() {
        return (o2.r) this.f13338v0.getValue();
    }

    @NotNull
    public o2.p getFontLoader() {
        return this.f13336u0;
    }

    @NotNull
    public t1.a getHapticFeedBack() {
        return this.f13344y0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.F.f7874b.b();
    }

    @NotNull
    public u1.b getInputModeManager() {
        return this.f13346z0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f13309g0;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public w2.k getLayoutDirection() {
        return (w2.k) this.f13342x0.getValue();
    }

    public long getMeasureIteration() {
        c2.x0 x0Var = this.F;
        if (x0Var.f7875c) {
            return x0Var.f7878f;
        }
        t0.t.A0("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    @NotNull
    public b2.e getModifierLocalManager() {
        return this.A0;
    }

    @NotNull
    public a2.z0 getPlacementScope() {
        int i10 = a2.b1.f38b;
        return new a2.j0(this, 1);
    }

    @NotNull
    public x1.q getPointerIconService() {
        return this.M0;
    }

    @NotNull
    public androidx.compose.ui.node.a getRoot() {
        return this.f13314j;
    }

    @NotNull
    public c2.y1 getRootForTest() {
        return this.f13316k;
    }

    @NotNull
    public h2.p getSemanticsOwner() {
        return this.f13318l;
    }

    @NotNull
    public c2.j0 getSharedDrawScope() {
        return this.f13302c;
    }

    public boolean getShowLayoutBounds() {
        return this.A;
    }

    @NotNull
    public c2.t1 getSnapshotObserver() {
        return this.f13345z;
    }

    @NotNull
    public d3 getSoftwareKeyboardController() {
        return this.f13334t0;
    }

    @NotNull
    public p2.d0 getTextInputService() {
        return this.f13330r0;
    }

    @NotNull
    public e3 getTextToolbar() {
        return this.B0;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @NotNull
    public j3 getViewConfiguration() {
        return this.G;
    }

    public final q getViewTreeOwners() {
        return (q) this.f13319l0.getValue();
    }

    @NotNull
    public q3 getWindowInfo() {
        return this.f13310h;
    }

    public final int n(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        float[] fArr = this.f13305e0;
        removeCallbacks(this.G0);
        try {
            this.f13309g0 = AnimationUtils.currentAnimationTimeMillis();
            this.K0.a(this, fArr);
            t0.t.Y(fArr, this.f13307f0);
            long a10 = n1.k0.a(t0.t.g(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f13313i0 = t0.t.g(motionEvent.getRawX() - m1.c.d(a10), motionEvent.getRawY() - m1.c.e(a10));
            boolean z11 = true;
            this.f13311h0 = true;
            u(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.C0;
                if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z10) {
                            F(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    this.f13335u.b();
                }
                if (motionEvent.getToolType(0) != 3) {
                    z11 = false;
                }
                if (!z10 && z11 && actionMasked2 != 3 && actionMasked2 != 9 && r(motionEvent)) {
                    F(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.C0 = MotionEvent.obtainNoHistory(motionEvent);
                int E = E(motionEvent);
                Trace.endSection();
                return E;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } finally {
            this.f13311h0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.translation.ViewTranslationCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.t tVar;
        androidx.lifecycle.o lifecycle;
        int i10;
        androidx.lifecycle.o oVar;
        androidx.lifecycle.t tVar2;
        androidx.lifecycle.t tVar3;
        h1.a aVar;
        super.onAttachedToWindow();
        this.f13310h.f13603a.setValue(Boolean.valueOf(hasWindowFocus()));
        p(getRoot());
        o(getRoot());
        e1.v vVar = getSnapshotObserver().f7840a;
        vVar.f14938g = yq.b.k(vVar.f14935d);
        if (j() && (aVar = this.f13339w) != null) {
            h1.f.f17807a.a(aVar);
        }
        androidx.lifecycle.t W0 = yk.j.W0(this);
        o7.f w10 = yk.g.w(this);
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (W0 != null && w10 != null && (W0 != (tVar3 = viewTreeOwners.f13569a) || w10 != tVar3))) {
            if (W0 != null) {
                if (w10 != null) {
                    if (viewTreeOwners != null && (tVar = viewTreeOwners.f13569a) != null && (lifecycle = tVar.getLifecycle()) != null) {
                        lifecycle.c(this);
                    }
                    W0.getLifecycle().a(this);
                    q qVar = new q(W0, w10);
                    set_viewTreeOwners(qVar);
                    Function1 function1 = this.f13321m0;
                    if (function1 != null) {
                        function1.invoke(qVar);
                    }
                    this.f13321m0 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        if (isInTouchMode()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        u1.c cVar = this.f13346z0;
        cVar.getClass();
        cVar.f36666b.setValue(new u1.a(i10));
        q viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (tVar2 = viewTreeOwners2.f13569a) != null) {
            oVar = tVar2.getLifecycle();
        } else {
            oVar = null;
        }
        if (oVar != null) {
            oVar.a(this);
            oVar.a(this.f13322n);
            getViewTreeObserver().addOnGlobalLayoutListener(this.n0);
            getViewTreeObserver().addOnScrollChangedListener(this.f13324o0);
            getViewTreeObserver().addOnTouchModeChangeListener(this.f13326p0);
            if (Build.VERSION.SDK_INT >= 31) {
                t0.f13644a.b(this, new Object());
                return;
            }
            return;
        }
        t0.t.D0("No lifecycle owner exists");
        throw null;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        g1.r rVar = (g1.r) this.f13332s0.get();
        Object obj2 = null;
        if (rVar != null) {
            obj = rVar.f16421b;
        } else {
            obj = null;
        }
        c1 c1Var = (c1) obj;
        if (c1Var == null) {
            return this.f13328q0.f30562d;
        }
        g1.r rVar2 = (g1.r) c1Var.f13383d.get();
        if (rVar2 != null) {
            obj2 = rVar2.f16421b;
        }
        if (((c2) obj2) == null || !(!r1.f13388e)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        setDensity(yk.j.n(getContext()));
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 >= 31) {
            i10 = configuration.fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        if (i10 != this.f13340w0) {
            if (i11 >= 31) {
                i12 = configuration.fontWeightAdjustment;
            }
            this.f13340w0 = i12;
            setFontFamilyResolver(w0.h(getContext()));
        }
        this.f13337v.invoke(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r6 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [p2.r] */
    /* JADX WARN: Type inference failed for: r3v5, types: [p2.r] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a0.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        i1.c cVar = this.f13322n;
        cVar.getClass();
        i1.a.f19306a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.lifecycle.o oVar;
        h1.a aVar;
        androidx.lifecycle.t tVar;
        super.onDetachedFromWindow();
        e1.v vVar = getSnapshotObserver().f7840a;
        e1.h hVar = vVar.f14938g;
        if (hVar != null) {
            hVar.a();
        }
        vVar.b();
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (tVar = viewTreeOwners.f13569a) != null) {
            oVar = tVar.getLifecycle();
        } else {
            oVar = null;
        }
        if (oVar != null) {
            oVar.c(this.f13322n);
            oVar.c(this);
            if (j() && (aVar = this.f13339w) != null) {
                h1.f.f17807a.b(aVar);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.n0);
            getViewTreeObserver().removeOnScrollChangedListener(this.f13324o0);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.f13326p0);
            if (Build.VERSION.SDK_INT >= 31) {
                t0.f13644a.a(this);
                return;
            }
            return;
        }
        t0.t.D0("No lifecycle owner exists");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) getFocusOwner();
            l1.u uVar = bVar.f1365f;
            boolean z11 = uVar.f23927c;
            l1.t tVar = bVar.f1363d;
            if (z11) {
                androidx.compose.ui.focus.a.d(tVar, true, true);
                return;
            }
            try {
                uVar.f23927c = true;
                androidx.compose.ui.focus.a.d(tVar, true, true);
            } finally {
                l1.u.b(uVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.F.h(this.J0);
        this.D = null;
        H();
        if (this.B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        c2.x0 x0Var = this.F;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                p(getRoot());
            }
            long l10 = l(i10);
            t.Companion companion = ut.t.INSTANCE;
            long l11 = l(i11);
            long b10 = hl.f.b((int) (l10 >>> 32), (int) (l10 & 4294967295L), (int) (l11 >>> 32), (int) (4294967295L & l11));
            w2.a aVar = this.D;
            if (aVar == null) {
                this.D = new w2.a(b10);
                this.E = false;
            } else if (!w2.a.b(aVar.f38776a, b10)) {
                this.E = true;
            }
            x0Var.r(b10);
            x0Var.j();
            setMeasuredDimension(getRoot().f1423x.f7827o.f29a, getRoot().f1423x.f7827o.f30b);
            if (this.B != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f1423x.f7827o.f29a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f1423x.f7827o.f30b, 1073741824));
            }
            Unit unit = Unit.f23355a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        h1.a aVar;
        if (j() && viewStructure != null && (aVar = this.f13339w) != null) {
            h1.d dVar = h1.d.f17805a;
            h1.g gVar = aVar.f17803b;
            int a10 = dVar.a(viewStructure, gVar.f17808a.size());
            for (Map.Entry entry : gVar.f17808a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                a3.a.u(entry.getValue());
                ViewStructure b10 = dVar.b(viewStructure, a10);
                if (b10 == null) {
                    a10++;
                } else {
                    h1.e eVar = h1.e.f17806a;
                    AutofillId a11 = eVar.a(viewStructure);
                    Intrinsics.c(a11);
                    eVar.g(b10, a11, intValue);
                    dVar.d(b10, intValue, aVar.f17802a.getContext().getPackageName(), null, null);
                    eVar.h(b10, 1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        w2.k kVar;
        if (this.f13301b) {
            w2.k kVar2 = w2.k.f38799a;
            if (i10 != 0) {
                if (i10 != 1) {
                    kVar = null;
                } else {
                    kVar = w2.k.f38800b;
                }
            } else {
                kVar = kVar2;
            }
            if (kVar != null) {
                kVar2 = kVar;
            }
            setLayoutDirection(kVar2);
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        i1.c cVar = this.f13322n;
        cVar.getClass();
        i1.a.f19306a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean a10;
        this.f13310h.f13603a.setValue(Boolean.valueOf(z10));
        this.L0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a10 = p1.l.a())) {
            setShowLayoutBounds(a10);
            o(getRoot());
        }
    }

    public final void p(androidx.compose.ui.node.a aVar) {
        int i10 = 0;
        this.F.q(aVar, false);
        v0.h u10 = aVar.u();
        int i11 = u10.f37655c;
        if (i11 > 0) {
            Object[] objArr = u10.f37653a;
            do {
                p((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    public final boolean r(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (s0.g.f34069a <= x10 && x10 <= getWidth() && s0.g.f34069a <= y10 && y10 <= getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        boolean z10;
        l1.b bVar;
        int i11;
        int ordinal = ((androidx.compose.ui.focus.b) getFocusOwner()).f1363d.R0().ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                z10 = false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        l1.f focusOwner = getFocusOwner();
        m1.d dVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                bVar = null;
                            } else {
                                bVar = new l1.b(6);
                            }
                        } else {
                            bVar = new l1.b(4);
                        }
                    } else {
                        bVar = new l1.b(5);
                    }
                } else {
                    bVar = new l1.b(3);
                }
            } else {
                bVar = new l1.b(1);
            }
        } else {
            bVar = new l1.b(2);
        }
        if (bVar != null) {
            i11 = bVar.f23884a;
        } else {
            i11 = 7;
        }
        if (rect != null) {
            dVar = new m1.d(rect.left, rect.top, rect.right, rect.bottom);
        }
        return ((androidx.compose.ui.focus.b) focusOwner).d(i11, dVar);
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.C0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f13320m.f13582h = j10;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        this.f13337v = function1;
    }

    public final void setContentCaptureManager$ui_release(@NotNull i1.c cVar) {
        this.f13322n = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [c2.n, g1.n] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        int i10;
        int i11;
        this.f13306f = coroutineContext;
        ?? r14 = getRoot().f1422w.f7658e;
        if (r14 instanceof x1.i0) {
            ((x1.o0) ((x1.i0) r14)).S0();
        }
        g1.n nVar = r14.f16405a;
        if (nVar.f16417m) {
            g1.n nVar2 = nVar.f16410f;
            androidx.compose.ui.node.a y10 = c2.g.y(r14);
            int[] iArr = new int[16];
            v0.h[] hVarArr = new v0.h[16];
            int i12 = 0;
            while (y10 != null) {
                if (nVar2 == null) {
                    nVar2 = y10.f1422w.f7658e;
                }
                if ((nVar2.f16408d & 16) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f16407c & 16) != 0) {
                            c2.o oVar = nVar2;
                            ?? r92 = 0;
                            while (oVar != 0) {
                                if (oVar instanceof c2.w1) {
                                    c2.w1 w1Var = (c2.w1) oVar;
                                    if (w1Var instanceof x1.i0) {
                                        ((x1.o0) ((x1.i0) w1Var)).S0();
                                    }
                                } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof c2.o)) {
                                    g1.n nVar3 = oVar.f7801o;
                                    int i13 = 0;
                                    oVar = oVar;
                                    r92 = r92;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16407c & 16) != 0) {
                                            i13++;
                                            r92 = r92;
                                            if (i13 == 1) {
                                                oVar = nVar3;
                                            } else {
                                                if (r92 == 0) {
                                                    r92 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r92.b(oVar);
                                                    oVar = 0;
                                                }
                                                r92.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f16410f;
                                        oVar = oVar;
                                        r92 = r92;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                oVar = c2.g.f(r92);
                            }
                        }
                        nVar2 = nVar2.f16410f;
                    }
                }
                v0.h u10 = y10.u();
                if (!u10.k()) {
                    if (i12 >= iArr.length) {
                        iArr = Arrays.copyOf(iArr, iArr.length * 2);
                        Intrinsics.checkNotNullExpressionValue(iArr, "copyOf(this, newSize)");
                        Object[] copyOf = Arrays.copyOf(hVarArr, hVarArr.length * 2);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        hVarArr = (v0.h[]) copyOf;
                    }
                    iArr[i12] = u10.f37655c - 1;
                    hVarArr[i12] = u10;
                    i12++;
                }
                if (i12 > 0 && (i11 = iArr[i12 - 1]) >= 0) {
                    if (i12 > 0) {
                        v0.h hVar = hVarArr[i10];
                        Intrinsics.c(hVar);
                        if (i11 > 0) {
                            iArr[i10] = iArr[i10] - 1;
                        } else if (i11 == 0) {
                            hVarArr[i10] = null;
                            i12--;
                        }
                        y10 = (androidx.compose.ui.node.a) hVar.f37653a[i11];
                    } else {
                        throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
                    }
                } else {
                    y10 = null;
                }
                nVar2 = null;
            }
            return;
        }
        t0.t.C0("visitSubtree called on an unattached node");
        throw null;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f13309g0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super q, Unit> function1) {
        q viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f13321m0 = function1;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.A = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j10) {
        B();
        long a10 = n1.k0.a(j10, this.f13305e0);
        return t0.t.g(m1.c.d(this.f13313i0) + m1.c.d(a10), m1.c.e(this.f13313i0) + m1.c.e(a10));
    }

    public final void u(boolean z10) {
        x xVar;
        c2.x0 x0Var = this.F;
        if (x0Var.f7874b.b() || x0Var.f7876d.f7805a.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    xVar = this.J0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                xVar = null;
            }
            if (x0Var.h(xVar)) {
                requestLayout();
            }
            x0Var.a(false);
            Unit unit = Unit.f23355a;
            Trace.endSection();
        }
    }

    public final void v(androidx.compose.ui.node.a aVar, long j10) {
        c2.x0 x0Var = this.F;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            x0Var.i(aVar, j10);
            if (!x0Var.f7874b.b()) {
                x0Var.a(false);
            }
            Unit unit = Unit.f23355a;
        } finally {
            Trace.endSection();
        }
    }

    public final void w(c2.p1 p1Var, boolean z10) {
        ArrayList arrayList = this.f13327q;
        if (!z10) {
            if (!this.f13331s) {
                arrayList.remove(p1Var);
                ArrayList arrayList2 = this.f13329r;
                if (arrayList2 != null) {
                    arrayList2.remove(p1Var);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f13331s) {
            arrayList.add(p1Var);
            return;
        }
        ArrayList arrayList3 = this.f13329r;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f13329r = arrayList3;
        }
        arrayList3.add(p1Var);
    }

    public final void x() {
        boolean z10;
        if (this.f13341x) {
            e1.v vVar = getSnapshotObserver().f7840a;
            synchronized (vVar.f14937f) {
                try {
                    v0.h hVar = vVar.f14937f;
                    int i10 = hVar.f37655c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        e1.u uVar = (e1.u) hVar.f37653a[i12];
                        uVar.e();
                        if (uVar.f14925f.f34935e != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = hVar.f37653a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    vt.t.k(i13, i10, hVar.f37653a);
                    hVar.f37655c = i13;
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13341x = false;
        }
        m1 m1Var = this.B;
        if (m1Var != null) {
            k(m1Var);
        }
        while (this.F0.l()) {
            int i14 = this.F0.f37655c;
            for (int i15 = 0; i15 < i14; i15++) {
                v0.h hVar2 = this.F0;
                Function0 function0 = (Function0) hVar2.f37653a[i15];
                hVar2.p(i15, null);
                if (function0 != null) {
                    function0.mo2invoke();
                }
            }
            this.F0.o(0, i14);
        }
    }

    public final void y(androidx.compose.ui.node.a aVar) {
        r0 r0Var = this.f13320m;
        r0Var.f13599y = true;
        if (r0Var.x()) {
            r0Var.z(aVar);
        }
        i1.c cVar = this.f13322n;
        cVar.f19319h = true;
        if (cVar.i() && cVar.f19320i.add(aVar)) {
            cVar.f19321j.o(Unit.f23355a);
        }
    }

    public final void z(androidx.compose.ui.node.a aVar, boolean z10, boolean z11, boolean z12) {
        c2.x0 x0Var = this.F;
        if (z10) {
            if (x0Var.o(aVar, z11) && z12) {
                C(aVar);
                return;
            }
            return;
        }
        if (x0Var.q(aVar, z11) && z12) {
            C(aVar);
        }
    }
}
