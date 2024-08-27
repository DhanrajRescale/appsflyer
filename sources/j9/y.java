package j9;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class y extends Drawable implements Drawable.Callback, Animatable {
    public k9.a A;
    public Rect B;
    public Rect C;
    public RectF D;
    public RectF E;
    public Matrix F;
    public Matrix G;
    public boolean H;
    public int I;

    /* renamed from: a, reason: collision with root package name */
    public i f21224a;

    /* renamed from: b, reason: collision with root package name */
    public final w9.c f21225b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21226c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21227d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21228e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21229f;

    /* renamed from: g, reason: collision with root package name */
    public o9.a f21230g;

    /* renamed from: h, reason: collision with root package name */
    public String f21231h;

    /* renamed from: i, reason: collision with root package name */
    public m.w f21232i;

    /* renamed from: j, reason: collision with root package name */
    public Map f21233j;

    /* renamed from: k, reason: collision with root package name */
    public String f21234k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21235l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21236m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21237n;

    /* renamed from: o, reason: collision with root package name */
    public s9.c f21238o;

    /* renamed from: p, reason: collision with root package name */
    public int f21239p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21240q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21241r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21242s;

    /* renamed from: t, reason: collision with root package name */
    public g0 f21243t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21244u;

    /* renamed from: v, reason: collision with root package name */
    public final Matrix f21245v;

    /* renamed from: w, reason: collision with root package name */
    public Bitmap f21246w;

    /* renamed from: x, reason: collision with root package name */
    public Canvas f21247x;

    /* renamed from: y, reason: collision with root package name */
    public Rect f21248y;

    /* renamed from: z, reason: collision with root package name */
    public RectF f21249z;

    public y() {
        w9.c cVar = new w9.c();
        this.f21225b = cVar;
        this.f21226c = true;
        this.f21227d = false;
        this.f21228e = false;
        this.I = 1;
        this.f21229f = new ArrayList();
        w wVar = new w(this, 0);
        this.f21236m = false;
        this.f21237n = true;
        this.f21239p = 255;
        this.f21243t = g0.f21155a;
        this.f21244u = false;
        this.f21245v = new Matrix();
        this.H = false;
        cVar.addUpdateListener(wVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final p9.e eVar, final Object obj, final x9.c cVar) {
        s9.c cVar2 = this.f21238o;
        if (cVar2 == null) {
            this.f21229f.add(new x() { // from class: j9.u
                @Override // j9.x
                public final void run() {
                    y.this.a(eVar, obj, cVar);
                }
            });
            return;
        }
        if (eVar == p9.e.f30793c) {
            cVar2.c(cVar, obj);
        } else {
            p9.f fVar = eVar.f30795b;
            if (fVar != null) {
                fVar.c(cVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f21238o.f(eVar, 0, arrayList, new p9.e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((p9.e) arrayList.get(i10)).f30795b.c(cVar, obj);
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == b0.E) {
            x(this.f21225b.d());
        }
    }

    public final boolean b() {
        return this.f21226c || this.f21227d;
    }

    public final void c() {
        i iVar = this.f21224a;
        if (iVar == null) {
            return;
        }
        tr.e eVar = u9.s.f37025a;
        Rect rect = iVar.f21175j;
        s9.c cVar = new s9.c(this, new s9.e(Collections.emptyList(), iVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new q9.d(null, null, null, null, null, null, null, null, null), 0, 0, 0, s0.g.f34069a, s0.g.f34069a, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null), iVar.f21174i, iVar);
        this.f21238o = cVar;
        if (this.f21241r) {
            cVar.r(true);
        }
        this.f21238o.H = this.f21237n;
    }

    public final void d() {
        w9.c cVar = this.f21225b;
        if (cVar.f38888m) {
            cVar.cancel();
            if (!isVisible()) {
                this.I = 1;
            }
        }
        this.f21224a = null;
        this.f21238o = null;
        this.f21230g = null;
        cVar.f38887l = null;
        cVar.f38885j = -2.1474836E9f;
        cVar.f38886k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f21228e) {
            try {
                if (this.f21244u) {
                    k(canvas, this.f21238o);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused) {
                w9.b.f38875a.getClass();
            }
        } else if (this.f21244u) {
            k(canvas, this.f21238o);
        } else {
            g(canvas);
        }
        this.H = false;
        kp.j.M();
    }

    public final void e() {
        i iVar = this.f21224a;
        if (iVar == null) {
            return;
        }
        g0 g0Var = this.f21243t;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = iVar.f21179n;
        int i11 = iVar.f21180o;
        int ordinal = g0Var.ordinal();
        boolean z11 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z10 && i10 < 28) || i11 > 4 || i10 <= 25))) {
            z11 = true;
        }
        this.f21244u = z11;
    }

    public final void g(Canvas canvas) {
        s9.c cVar = this.f21238o;
        i iVar = this.f21224a;
        if (cVar != null && iVar != null) {
            Matrix matrix = this.f21245v;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preScale(r3.width() / iVar.f21175j.width(), r3.height() / iVar.f21175j.height());
                matrix.preTranslate(r3.left, r3.top);
            }
            cVar.h(canvas, matrix, this.f21239p);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21239p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.f21224a;
        if (iVar == null) {
            return -1;
        }
        return iVar.f21175j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.f21224a;
        if (iVar == null) {
            return -1;
        }
        return iVar.f21175j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m.w, java.lang.Object] */
    public final m.w h() {
        Object obj = null;
        if (getCallback() == null) {
            return null;
        }
        if (this.f21232i == null) {
            Drawable.Callback callback = getCallback();
            ?? obj2 = new Object();
            obj2.f25760a = new tr.e(27, obj);
            obj2.f25761b = new HashMap();
            obj2.f25762c = new HashMap();
            obj2.f25765f = ".ttf";
            obj2.f25764e = null;
            if (!(callback instanceof View)) {
                w9.b.b("LottieDrawable must be inside of a view for images to work.");
                obj2.f25763d = null;
            } else {
                obj2.f25763d = ((View) callback).getContext().getAssets();
            }
            this.f21232i = obj2;
            String str = this.f21234k;
            if (str != null) {
                obj2.f25765f = str;
            }
        }
        return this.f21232i;
    }

    public final void i() {
        this.f21229f.clear();
        w9.c cVar = this.f21225b;
        cVar.m(true);
        Iterator it = cVar.f38878c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(cVar);
        }
        if (!isVisible()) {
            this.I = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        w9.c cVar = this.f21225b;
        if (cVar == null) {
            return false;
        }
        return cVar.f38888m;
    }

    public final void j() {
        float f10;
        float e10;
        if (this.f21238o == null) {
            this.f21229f.add(new s(this, 1));
            return;
        }
        e();
        boolean b10 = b();
        w9.c cVar = this.f21225b;
        if (b10 || cVar.getRepeatCount() == 0) {
            if (isVisible()) {
                cVar.f38888m = true;
                boolean h10 = cVar.h();
                Iterator it = cVar.f38877b.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(cVar, h10);
                    } else {
                        animatorListener.onAnimationStart(cVar);
                    }
                }
                if (cVar.h()) {
                    f10 = cVar.e();
                } else {
                    f10 = cVar.f();
                }
                cVar.r((int) f10);
                cVar.f38881f = 0L;
                cVar.f38884i = 0;
                if (cVar.f38888m) {
                    cVar.m(false);
                    Choreographer.getInstance().postFrameCallback(cVar);
                }
                this.I = 1;
            } else {
                this.I = 2;
            }
        }
        if (!b()) {
            if (cVar.f38879d < s0.g.f34069a) {
                e10 = cVar.f();
            } else {
                e10 = cVar.e();
            }
            n((int) e10);
            cVar.m(true);
            cVar.i(cVar.h());
            if (!isVisible()) {
                this.I = 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e7, code lost:
    
        if ((!((android.view.ViewGroup) r3).getClipChildren()) != false) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v32, types: [k9.a, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r10, s9.c r11) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.y.k(android.graphics.Canvas, s9.c):void");
    }

    public final void l() {
        float e10;
        if (this.f21238o == null) {
            this.f21229f.add(new s(this, 0));
            return;
        }
        e();
        boolean b10 = b();
        w9.c cVar = this.f21225b;
        if (b10 || cVar.getRepeatCount() == 0) {
            if (isVisible()) {
                cVar.f38888m = true;
                cVar.m(false);
                Choreographer.getInstance().postFrameCallback(cVar);
                cVar.f38881f = 0L;
                if (cVar.h() && cVar.f38883h == cVar.f()) {
                    cVar.r(cVar.e());
                } else if (!cVar.h() && cVar.f38883h == cVar.e()) {
                    cVar.r(cVar.f());
                }
                Iterator it = cVar.f38878c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(cVar);
                }
                this.I = 1;
            } else {
                this.I = 3;
            }
        }
        if (!b()) {
            if (cVar.f38879d < s0.g.f34069a) {
                e10 = cVar.f();
            } else {
                e10 = cVar.e();
            }
            n((int) e10);
            cVar.m(true);
            cVar.i(cVar.h());
            if (!isVisible()) {
                this.I = 1;
            }
        }
    }

    public final boolean m(i iVar) {
        boolean z10 = false;
        if (this.f21224a == iVar) {
            return false;
        }
        this.H = true;
        d();
        this.f21224a = iVar;
        c();
        w9.c cVar = this.f21225b;
        if (cVar.f38887l == null) {
            z10 = true;
        }
        cVar.f38887l = iVar;
        if (z10) {
            cVar.t(Math.max(cVar.f38885j, iVar.f21176k), Math.min(cVar.f38886k, iVar.f21177l));
        } else {
            cVar.t((int) iVar.f21176k, (int) iVar.f21177l);
        }
        float f10 = cVar.f38883h;
        cVar.f38883h = s0.g.f34069a;
        cVar.f38882g = s0.g.f34069a;
        cVar.r((int) f10);
        cVar.j();
        x(cVar.getAnimatedFraction());
        ArrayList arrayList = this.f21229f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar != null) {
                xVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        iVar.f21166a.f21141a = this.f21240q;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void n(int i10) {
        if (this.f21224a == null) {
            this.f21229f.add(new r(this, i10, 2));
        } else {
            this.f21225b.r(i10);
        }
    }

    public final void o(int i10) {
        if (this.f21224a == null) {
            this.f21229f.add(new r(this, i10, 1));
            return;
        }
        w9.c cVar = this.f21225b;
        cVar.t(cVar.f38885j, i10 + 0.99f);
    }

    public final void p(String str) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new t(this, str, 0));
            return;
        }
        p9.h c10 = iVar.c(str);
        if (c10 != null) {
            o((int) (c10.f30799b + c10.f30800c));
            return;
        }
        throw new IllegalArgumentException(nn.d.k("Cannot find marker with name ", str, "."));
    }

    public final void q(float f10) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new p(this, f10, 2));
            return;
        }
        float d10 = w9.e.d(iVar.f21176k, iVar.f21177l, f10);
        w9.c cVar = this.f21225b;
        cVar.t(cVar.f38885j, d10);
    }

    public final void r(final int i10, final int i11) {
        if (this.f21224a == null) {
            this.f21229f.add(new x() { // from class: j9.v
                @Override // j9.x
                public final void run() {
                    y.this.r(i10, i11);
                }
            });
        } else {
            this.f21225b.t(i10, i11 + 0.99f);
        }
    }

    public final void s(String str) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new t(this, str, 2));
            return;
        }
        p9.h c10 = iVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f30799b;
            r(i10, ((int) c10.f30800c) + i10);
            return;
        }
        throw new IllegalArgumentException(nn.d.k("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f21239p = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        w9.b.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.I;
            if (i10 == 2) {
                j();
            } else if (i10 == 3) {
                l();
            }
        } else if (this.f21225b.f38888m) {
            i();
            this.I = 3;
        } else if (!z12) {
            this.I = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21229f.clear();
        w9.c cVar = this.f21225b;
        cVar.m(true);
        cVar.i(cVar.h());
        if (!isVisible()) {
            this.I = 1;
        }
    }

    public final void t(final float f10, final float f11) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new x() { // from class: j9.q
                @Override // j9.x
                public final void run() {
                    y.this.t(f10, f11);
                }
            });
            return;
        }
        int d10 = (int) w9.e.d(iVar.f21176k, iVar.f21177l, f10);
        i iVar2 = this.f21224a;
        r(d10, (int) w9.e.d(iVar2.f21176k, iVar2.f21177l, f11));
    }

    public final void u(int i10) {
        if (this.f21224a == null) {
            this.f21229f.add(new r(this, i10, 0));
        } else {
            this.f21225b.t(i10, (int) r0.f38886k);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(String str) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new t(this, str, 1));
            return;
        }
        p9.h c10 = iVar.c(str);
        if (c10 != null) {
            u((int) c10.f30799b);
            return;
        }
        throw new IllegalArgumentException(nn.d.k("Cannot find marker with name ", str, "."));
    }

    public final void w(float f10) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new p(this, f10, 1));
        } else {
            u((int) w9.e.d(iVar.f21176k, iVar.f21177l, f10));
        }
    }

    public final void x(float f10) {
        i iVar = this.f21224a;
        if (iVar == null) {
            this.f21229f.add(new p(this, f10, 0));
            return;
        }
        this.f21225b.r(w9.e.d(iVar.f21176k, iVar.f21177l, f10));
        kp.j.M();
    }
}
