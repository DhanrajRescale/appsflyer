package d2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l3 extends View implements c2.p1 {

    /* renamed from: p, reason: collision with root package name */
    public static final o0.j f13499p = new o0.j(1);

    /* renamed from: q, reason: collision with root package name */
    public static Method f13500q;

    /* renamed from: r, reason: collision with root package name */
    public static Field f13501r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f13502s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f13503t;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f13504a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f13505b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f13506c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f13507d;

    /* renamed from: e, reason: collision with root package name */
    public final k2 f13508e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13509f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f13510g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13511h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13512i;

    /* renamed from: j, reason: collision with root package name */
    public final e.l f13513j;

    /* renamed from: k, reason: collision with root package name */
    public final h2 f13514k;

    /* renamed from: l, reason: collision with root package name */
    public long f13515l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13516m;

    /* renamed from: n, reason: collision with root package name */
    public final long f13517n;

    /* renamed from: o, reason: collision with root package name */
    public int f13518o;

    public l3(a0 a0Var, y1 y1Var, c2.e1 e1Var, c2.p0 p0Var) {
        super(a0Var.getContext());
        Function1 function1;
        this.f13504a = a0Var;
        this.f13505b = y1Var;
        this.f13506c = e1Var;
        this.f13507d = p0Var;
        e1.i h10 = yq.b.h();
        if (h10 != null) {
            function1 = h10.f();
        } else {
            function1 = null;
        }
        e1.i i10 = yq.b.i(h10);
        try {
            k2 k2Var = new k2(a0Var.getDensity());
            yq.b.l(h10, i10, function1);
            this.f13508e = k2Var;
            this.f13513j = new e.l(7);
            this.f13514k = new h2(q0.f13574e);
            this.f13515l = n1.b1.f28120b;
            this.f13516m = true;
            setWillNotDraw(false);
            y1Var.addView(this);
            this.f13517n = View.generateViewId();
        } catch (Throwable th2) {
            yq.b.l(h10, i10, function1);
            throw th2;
        }
    }

    private final n1.p0 getManualClipPath() {
        if (getClipToOutline()) {
            k2 k2Var = this.f13508e;
            if (!(!k2Var.f13481i)) {
                k2Var.e();
                return k2Var.f13479g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f13511h) {
            this.f13511h = z10;
            this.f13504a.w(this, z10);
        }
    }

    @Override // c2.p1
    public final void a(float[] fArr) {
        n1.k0.d(fArr, this.f13514k.b(this));
    }

    @Override // c2.p1
    public final void b() {
        p3 p3Var;
        Reference poll;
        v0.h hVar;
        setInvalidated(false);
        a0 a0Var = this.f13504a;
        a0Var.f13341x = true;
        this.f13506c = null;
        this.f13507d = null;
        do {
            p3Var = a0Var.E0;
            poll = p3Var.f13568b.poll();
            hVar = p3Var.f13567a;
            if (poll != null) {
                hVar.m(poll);
            }
        } while (poll != null);
        hVar.b(new WeakReference(this, p3Var.f13568b));
        this.f13505b.removeViewInLayout(this);
    }

    @Override // c2.p1
    public final void c(n1.u0 u0Var, w2.k kVar, w2.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Function0 function0;
        o0.j jVar;
        boolean z13;
        int i10 = u0Var.f28181a | this.f13518o;
        if ((i10 & 4096) != 0) {
            long j10 = u0Var.f28194n;
            this.f13515l = j10;
            int i11 = n1.b1.f28121c;
            setPivotX(Float.intBitsToFloat((int) (j10 >> 32)) * getWidth());
            setPivotY(Float.intBitsToFloat((int) (this.f13515l & 4294967295L)) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(u0Var.f28182b);
        }
        if ((i10 & 2) != 0) {
            setScaleY(u0Var.f28183c);
        }
        if ((i10 & 4) != 0) {
            setAlpha(u0Var.f28184d);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(u0Var.f28185e);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(u0Var.f28186f);
        }
        if ((i10 & 32) != 0) {
            setElevation(u0Var.f28187g);
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            setRotation(u0Var.f28192l);
        }
        if ((i10 & 256) != 0) {
            setRotationX(u0Var.f28190j);
        }
        if ((i10 & 512) != 0) {
            setRotationY(u0Var.f28191k);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(u0Var.f28193m);
        }
        boolean z14 = true;
        if (getManualClipPath() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z15 = u0Var.f28196p;
        n1.r0 r0Var = n1.s0.f28162a;
        if (z15 && u0Var.f28195o != r0Var) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 24576) != 0) {
            if (z15 && u0Var.f28195o == r0Var) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f13509f = z13;
            m();
            setClipToOutline(z11);
        }
        boolean d10 = this.f13508e.d(u0Var.f28195o, u0Var.f28184d, z11, u0Var.f28187g, kVar, bVar);
        k2 k2Var = this.f13508e;
        if (k2Var.f13480h) {
            if (k2Var.b() != null) {
                jVar = f13499p;
            } else {
                jVar = null;
            }
            setOutlineProvider(jVar);
        }
        if (getManualClipPath() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12 || (z12 && d10)) {
            invalidate();
        }
        if (!this.f13512i && getElevation() > s0.g.f34069a && (function0 = this.f13507d) != null) {
            function0.mo2invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f13514k.c();
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = i10 & 64;
            n3 n3Var = n3.f13556a;
            if (i13 != 0) {
                n3Var.a(this, androidx.compose.ui.graphics.a.y(u0Var.f28188h));
            }
            if ((i10 & 128) != 0) {
                n3Var.b(this, androidx.compose.ui.graphics.a.y(u0Var.f28189i));
            }
        }
        if (i12 >= 31 && (131072 & i10) != 0) {
            o3.f13562a.a(this, null);
        }
        if ((i10 & 32768) != 0) {
            int i14 = u0Var.f28197q;
            if (n1.s0.c(i14, 1)) {
                setLayerType(2, null);
            } else if (n1.s0.c(i14, 2)) {
                setLayerType(0, null);
                z14 = false;
            } else {
                setLayerType(0, null);
            }
            this.f13516m = z14;
        }
        this.f13518o = u0Var.f28181a;
    }

    @Override // c2.p1
    public final void d(m1.b bVar, boolean z10) {
        h2 h2Var = this.f13514k;
        if (z10) {
            float[] a10 = h2Var.a(this);
            if (a10 != null) {
                n1.k0.b(a10, bVar);
                return;
            }
            bVar.f27229a = s0.g.f34069a;
            bVar.f27230b = s0.g.f34069a;
            bVar.f27231c = s0.g.f34069a;
            bVar.f27232d = s0.g.f34069a;
            return;
        }
        n1.k0.b(h2Var.b(this), bVar);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        e.l lVar = this.f13513j;
        Object obj = lVar.f14641b;
        Canvas canvas2 = ((n1.c) obj).f28123a;
        ((n1.c) obj).f28123a = canvas;
        n1.c cVar = (n1.c) obj;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            cVar.h();
            this.f13508e.a(cVar);
            z10 = true;
        }
        Function1 function1 = this.f13506c;
        if (function1 != null) {
            function1.invoke(cVar);
        }
        if (z10) {
            cVar.s();
        }
        ((n1.c) lVar.f14641b).f28123a = canvas2;
        setInvalidated(false);
    }

    @Override // c2.p1
    public final boolean e(long j10) {
        float d10 = m1.c.d(j10);
        float e10 = m1.c.e(j10);
        if (this.f13509f) {
            if (s0.g.f34069a <= d10 && d10 < getWidth() && s0.g.f34069a <= e10 && e10 < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.f13508e.c(j10);
    }

    @Override // c2.p1
    public final long f(long j10, boolean z10) {
        h2 h2Var = this.f13514k;
        if (z10) {
            float[] a10 = h2Var.a(this);
            if (a10 != null) {
                return n1.k0.a(j10, a10);
            }
            int i10 = m1.c.f27236e;
            return m1.c.f27234c;
        }
        return n1.k0.a(j10, h2Var.b(this));
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // c2.p1
    public final void g(n1.r rVar) {
        boolean z10;
        if (getElevation() > s0.g.f34069a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13512i = z10;
        if (z10) {
            rVar.t();
        }
        this.f13505b.a(rVar, this, getDrawingTime());
        if (this.f13512i) {
            rVar.j();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final y1 getContainer() {
        return this.f13505b;
    }

    public long getLayerId() {
        return this.f13517n;
    }

    @NotNull
    public final a0 getOwnerView() {
        return this.f13504a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return k3.a(this.f13504a);
        }
        return -1L;
    }

    @Override // c2.p1
    public final void h(long j10) {
        o0.j jVar;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 != getWidth() || i11 != getHeight()) {
            long j11 = this.f13515l;
            int i12 = n1.b1.f28121c;
            float f10 = i10;
            setPivotX(Float.intBitsToFloat((int) (j11 >> 32)) * f10);
            float f11 = i11;
            setPivotY(Float.intBitsToFloat((int) (4294967295L & this.f13515l)) * f11);
            long j12 = t0.t.j(f10, f11);
            k2 k2Var = this.f13508e;
            if (!m1.f.b(k2Var.f13476d, j12)) {
                k2Var.f13476d = j12;
                k2Var.f13480h = true;
            }
            if (k2Var.b() != null) {
                jVar = f13499p;
            } else {
                jVar = null;
            }
            setOutlineProvider(jVar);
            layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
            m();
            this.f13514k.c();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f13516m;
    }

    @Override // c2.p1
    public final void i(float[] fArr) {
        float[] a10 = this.f13514k.a(this);
        if (a10 != null) {
            n1.k0.d(fArr, a10);
        }
    }

    @Override // android.view.View, c2.p1
    public final void invalidate() {
        if (!this.f13511h) {
            setInvalidated(true);
            super.invalidate();
            this.f13504a.invalidate();
        }
    }

    @Override // c2.p1
    public final void j(long j10) {
        int i10 = w2.h.f38792c;
        int i11 = (int) (j10 >> 32);
        int left = getLeft();
        h2 h2Var = this.f13514k;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            h2Var.c();
        }
        int i12 = (int) (j10 & 4294967295L);
        if (i12 != getTop()) {
            offsetTopAndBottom(i12 - getTop());
            h2Var.c();
        }
    }

    @Override // c2.p1
    public final void k() {
        if (this.f13511h && !f13503t) {
            mt.p.F(this);
            setInvalidated(false);
        }
    }

    @Override // c2.p1
    public final void l(c2.p0 p0Var, c2.e1 e1Var) {
        this.f13505b.addView(this);
        this.f13509f = false;
        this.f13512i = false;
        this.f13515l = n1.b1.f28120b;
        this.f13506c = e1Var;
        this.f13507d = p0Var;
    }

    public final void m() {
        Rect rect;
        if (this.f13509f) {
            Rect rect2 = this.f13510g;
            if (rect2 == null) {
                this.f13510g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f13510g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
