package sm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import bn.k;
import cn.d;
import cn.g;
import cn.h;
import cn.i;
import java.util.Iterator;
import java.util.List;
import tm.e;
import tm.j;

/* loaded from: classes2.dex */
public abstract class a extends b implements xm.b {
    public final cn.c A0;
    public final cn.c B0;
    public final float[] C0;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f34674e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f34675f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f34676g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f34677h0;

    /* renamed from: i0, reason: collision with root package name */
    public Paint f34678i0;

    /* renamed from: j0, reason: collision with root package name */
    public Paint f34679j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f34680k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f34681l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f34682m0;
    public float n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f34683o0;

    /* renamed from: p0, reason: collision with root package name */
    public j f34684p0;

    /* renamed from: q0, reason: collision with root package name */
    public j f34685q0;

    /* renamed from: r0, reason: collision with root package name */
    public k f34686r0;

    /* renamed from: s0, reason: collision with root package name */
    public k f34687s0;

    /* renamed from: t0, reason: collision with root package name */
    public g f34688t0;

    /* renamed from: u0, reason: collision with root package name */
    public g f34689u0;

    /* renamed from: v0, reason: collision with root package name */
    public bn.j f34690v0;

    /* renamed from: w0, reason: collision with root package name */
    public long f34691w0;

    /* renamed from: x0, reason: collision with root package name */
    public long f34692x0;

    /* renamed from: y0, reason: collision with root package name */
    public final RectF f34693y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Matrix f34694z0;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 100;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = true;
        this.f34674e0 = true;
        this.f34675f0 = true;
        this.f34676g0 = true;
        this.f34677h0 = true;
        this.f34680k0 = false;
        this.f34681l0 = false;
        this.f34682m0 = false;
        this.n0 = 15.0f;
        this.f34683o0 = false;
        this.f34691w0 = 0L;
        this.f34692x0 = 0L;
        this.f34693y0 = new RectF();
        this.f34694z0 = new Matrix();
        new Matrix();
        cn.c cVar = (cn.c) cn.c.f8243d.b();
        cVar.f8244b = 0.0d;
        cVar.f8245c = 0.0d;
        this.A0 = cVar;
        cn.c cVar2 = (cn.c) cn.c.f8243d.b();
        cVar2.f8244b = 0.0d;
        cVar2.f8245c = 0.0d;
        this.B0 = cVar2;
        this.C0 = new float[2];
    }

    @Override // sm.b
    public final void b() {
        RectF rectF = this.f34693y0;
        rectF.left = s0.g.f34069a;
        rectF.right = s0.g.f34069a;
        rectF.top = s0.g.f34069a;
        rectF.bottom = s0.g.f34069a;
        e eVar = this.f34706l;
        i iVar = this.f34713s;
        if (eVar != null && eVar.f36180a && !eVar.f36191j) {
            int e10 = w.k.e(eVar.f36190i);
            if (e10 != 0) {
                if (e10 == 1) {
                    int e11 = w.k.e(this.f34706l.f36188g);
                    if (e11 != 0) {
                        if (e11 != 1) {
                            if (e11 == 2) {
                                float f10 = rectF.right;
                                e eVar2 = this.f34706l;
                                rectF.right = Math.min(eVar2.f36201t, iVar.f8276c * eVar2.f36200s) + this.f34706l.f36181b + f10;
                            }
                        } else {
                            int e12 = w.k.e(this.f34706l.f36189h);
                            if (e12 != 0) {
                                if (e12 == 2) {
                                    float f11 = rectF.bottom;
                                    e eVar3 = this.f34706l;
                                    rectF.bottom = Math.min(eVar3.f36202u, iVar.f8277d * eVar3.f36200s) + this.f34706l.f36182c + f11;
                                }
                            } else {
                                float f12 = rectF.top;
                                e eVar4 = this.f34706l;
                                rectF.top = Math.min(eVar4.f36202u, iVar.f8277d * eVar4.f36200s) + this.f34706l.f36182c + f12;
                            }
                        }
                    } else {
                        float f13 = rectF.left;
                        e eVar5 = this.f34706l;
                        rectF.left = Math.min(eVar5.f36201t, iVar.f8276c * eVar5.f36200s) + this.f34706l.f36181b + f13;
                    }
                }
            } else {
                int e13 = w.k.e(this.f34706l.f36189h);
                if (e13 != 0) {
                    if (e13 == 2) {
                        float f14 = rectF.bottom;
                        e eVar6 = this.f34706l;
                        rectF.bottom = Math.min(eVar6.f36202u, iVar.f8277d * eVar6.f36200s) + this.f34706l.f36182c + f14;
                    }
                } else {
                    float f15 = rectF.top;
                    e eVar7 = this.f34706l;
                    rectF.top = Math.min(eVar7.f36202u, iVar.f8277d * eVar7.f36200s) + this.f34706l.f36182c + f15;
                }
            }
        }
        float f16 = rectF.left + s0.g.f34069a;
        float f17 = rectF.top + s0.g.f34069a;
        float f18 = rectF.right + s0.g.f34069a;
        float f19 = rectF.bottom + s0.g.f34069a;
        j jVar = this.f34684p0;
        if (jVar.f36180a && jVar.f36174u && jVar.N == 1) {
            f16 += jVar.f(this.f34686r0.f7138f);
        }
        j jVar2 = this.f34685q0;
        if (jVar2.f36180a && jVar2.f36174u && jVar2.N == 1) {
            f18 += jVar2.f(this.f34687s0.f7138f);
        }
        tm.i iVar2 = this.f34703i;
        if (iVar2.f36180a && iVar2.f36174u) {
            float f20 = iVar2.G + iVar2.f36182c;
            int i10 = iVar2.I;
            if (i10 == 2) {
                f19 += f20;
            } else {
                if (i10 != 1) {
                    if (i10 == 3) {
                        f19 += f20;
                    }
                }
                f17 += f20;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f17;
        float extraRightOffset = getExtraRightOffset() + f18;
        float extraBottomOffset = getExtraBottomOffset() + f19;
        float extraLeftOffset = getExtraLeftOffset() + f16;
        float c10 = h.c(this.n0);
        iVar.f8275b.set(Math.max(c10, extraLeftOffset), Math.max(c10, extraTopOffset), iVar.f8276c - Math.max(c10, extraRightOffset), iVar.f8277d - Math.max(c10, extraBottomOffset));
        if (this.f34695a) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder("Content: ");
            sb2.append(iVar.f8275b.toString());
            Log.i("MPAndroidChart", sb2.toString());
        }
        g gVar = this.f34689u0;
        this.f34685q0.getClass();
        gVar.f();
        g gVar2 = this.f34688t0;
        this.f34684p0.getClass();
        gVar2.f();
        if (this.f34695a) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.f34703i.E + ", xmax: " + this.f34703i.D + ", xdelta: " + this.f34703i.F);
        }
        g gVar3 = this.f34689u0;
        tm.i iVar3 = this.f34703i;
        float f21 = iVar3.E;
        float f22 = iVar3.F;
        j jVar3 = this.f34685q0;
        gVar3.g(f21, f22, jVar3.F, jVar3.E);
        g gVar4 = this.f34688t0;
        tm.i iVar4 = this.f34703i;
        float f23 = iVar4.E;
        float f24 = iVar4.F;
        j jVar4 = this.f34684p0;
        gVar4.g(f23, f24, jVar4.F, jVar4.E);
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f10;
        float f11;
        an.b bVar = this.f34708n;
        if (bVar instanceof an.a) {
            an.a aVar = (an.a) bVar;
            d dVar = aVar.f780p;
            if (dVar.f8247b != s0.g.f34069a || dVar.f8248c != s0.g.f34069a) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f12 = dVar.f8247b;
                b bVar2 = aVar.f786d;
                a aVar2 = (a) bVar2;
                dVar.f8247b = aVar2.getDragDecelerationFrictionCoef() * f12;
                float dragDecelerationFrictionCoef = aVar2.getDragDecelerationFrictionCoef() * dVar.f8248c;
                dVar.f8248c = dragDecelerationFrictionCoef;
                float f13 = ((float) (currentAnimationTimeMillis - aVar.f778n)) / 1000.0f;
                float f14 = dVar.f8247b * f13;
                float f15 = dragDecelerationFrictionCoef * f13;
                d dVar2 = aVar.f779o;
                float f16 = dVar2.f8247b + f14;
                dVar2.f8247b = f16;
                float f17 = dVar2.f8248c + f15;
                dVar2.f8248c = f17;
                MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f16, f17, 0);
                boolean z10 = aVar2.f34674e0;
                d dVar3 = aVar.f771g;
                if (z10) {
                    f10 = dVar2.f8247b - dVar3.f8247b;
                } else {
                    f10 = s0.g.f34069a;
                }
                if (aVar2.f34675f0) {
                    f11 = dVar2.f8248c - dVar3.f8248c;
                } else {
                    f11 = s0.g.f34069a;
                }
                aVar.f769e.set(aVar.f770f);
                ((a) aVar.f786d).getOnChartGestureListener();
                aVar.b();
                aVar.f769e.postTranslate(f10, f11);
                obtain.recycle();
                i viewPortHandler = aVar2.getViewPortHandler();
                Matrix matrix = aVar.f769e;
                viewPortHandler.f(matrix, bVar2, false);
                aVar.f769e = matrix;
                aVar.f778n = currentAnimationTimeMillis;
                if (Math.abs(dVar.f8247b) < 0.01d && Math.abs(dVar.f8248c) < 0.01d) {
                    aVar2.b();
                    aVar2.postInvalidate();
                    d dVar4 = aVar.f780p;
                    dVar4.f8247b = s0.g.f34069a;
                    dVar4.f8248c = s0.g.f34069a;
                    return;
                }
                DisplayMetrics displayMetrics = h.f8264a;
                bVar2.postInvalidateOnAnimation();
            }
        }
    }

    public j getAxisLeft() {
        return this.f34684p0;
    }

    public j getAxisRight() {
        return this.f34685q0;
    }

    @Override // sm.b, xm.c, xm.b
    public /* bridge */ /* synthetic */ um.d getData() {
        return (um.d) super.getData();
    }

    public an.e getDrawListener() {
        return null;
    }

    @Override // xm.b
    public float getHighestVisibleX() {
        g m10 = m(1);
        RectF rectF = this.f34713s.f8275b;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        cn.c cVar = this.B0;
        m10.b(f10, f11, cVar);
        return (float) Math.min(this.f34703i.D, cVar.f8244b);
    }

    @Override // xm.b
    public float getLowestVisibleX() {
        g m10 = m(1);
        RectF rectF = this.f34713s.f8275b;
        float f10 = rectF.left;
        float f11 = rectF.bottom;
        cn.c cVar = this.A0;
        m10.b(f10, f11, cVar);
        return (float) Math.max(this.f34703i.E, cVar.f8244b);
    }

    @Override // sm.b, xm.c
    public int getMaxVisibleCount() {
        return this.F;
    }

    public float getMinOffset() {
        return this.n0;
    }

    public k getRendererLeftYAxis() {
        return this.f34686r0;
    }

    public k getRendererRightYAxis() {
        return this.f34687s0;
    }

    public bn.j getRendererXAxis() {
        return this.f34690v0;
    }

    @Override // android.view.View
    public float getScaleX() {
        i iVar = this.f34713s;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f8282i;
    }

    @Override // android.view.View
    public float getScaleY() {
        i iVar = this.f34713s;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f8283j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // sm.b, xm.c
    public float getYChartMax() {
        return Math.max(this.f34684p0.D, this.f34685q0.D);
    }

    @Override // sm.b, xm.c
    public float getYChartMin() {
        return Math.min(this.f34684p0.E, this.f34685q0.E);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bn.a, bn.j] */
    /* JADX WARN: Type inference failed for: r0v8, types: [an.b, an.a] */
    @Override // sm.b
    public void h() {
        super.h();
        this.f34684p0 = new j(1);
        this.f34685q0 = new j(2);
        i iVar = this.f34713s;
        this.f34688t0 = new g(iVar);
        this.f34689u0 = new g(iVar);
        this.f34686r0 = new k(iVar, this.f34684p0, this.f34688t0);
        this.f34687s0 = new k(iVar, this.f34685q0, this.f34689u0);
        tm.i iVar2 = this.f34703i;
        ?? aVar = new bn.a(iVar, this.f34688t0, iVar2);
        aVar.f7191j = new Path();
        aVar.f7192k = new float[2];
        aVar.f7193l = new RectF();
        aVar.f7194m = new float[2];
        aVar.f7195n = new RectF();
        aVar.f7196o = new float[4];
        aVar.f7197p = new Path();
        aVar.f7190i = iVar2;
        aVar.f7138f.setColor(-16777216);
        aVar.f7138f.setTextAlign(Paint.Align.CENTER);
        aVar.f7138f.setTextSize(h.c(10.0f));
        this.f34690v0 = aVar;
        setHighlighter(new wm.b(this));
        Matrix matrix = iVar.f8274a;
        ?? bVar = new an.b(this);
        bVar.f769e = new Matrix();
        bVar.f770f = new Matrix();
        bVar.f771g = d.b(s0.g.f34069a, s0.g.f34069a);
        bVar.f772h = d.b(s0.g.f34069a, s0.g.f34069a);
        bVar.f773i = 1.0f;
        bVar.f774j = 1.0f;
        bVar.f775k = 1.0f;
        bVar.f778n = 0L;
        bVar.f779o = d.b(s0.g.f34069a, s0.g.f34069a);
        bVar.f780p = d.b(s0.g.f34069a, s0.g.f34069a);
        bVar.f769e = matrix;
        bVar.f781q = h.c(3.0f);
        bVar.f782r = h.c(3.5f);
        this.f34708n = bVar;
        Paint paint = new Paint();
        this.f34678i0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f34678i0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f34679j0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f34679j0.setColor(-16777216);
        this.f34679j0.setStrokeWidth(h.c(1.0f));
    }

    @Override // sm.b
    public final void i() {
        if (this.f34696b == null) {
            if (this.f34695a) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f34695a) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        bn.d dVar = this.f34711q;
        if (dVar != null) {
            dVar.m();
        }
        l();
        k kVar = this.f34686r0;
        j jVar = this.f34684p0;
        kVar.h(jVar.E, jVar.D);
        k kVar2 = this.f34687s0;
        j jVar2 = this.f34685q0;
        kVar2.h(jVar2.E, jVar2.D);
        bn.j jVar3 = this.f34690v0;
        tm.i iVar = this.f34703i;
        jVar3.h(iVar.E, iVar.D);
        if (this.f34706l != null) {
            this.f34710p.h(this.f34696b);
        }
        b();
    }

    public void l() {
        tm.i iVar = this.f34703i;
        um.d dVar = (um.d) this.f34696b;
        iVar.b(dVar.f37251d, dVar.f37250c);
        this.f34684p0.b(((um.d) this.f34696b).h(1), ((um.d) this.f34696b).g(1));
        this.f34685q0.b(((um.d) this.f34696b).h(2), ((um.d) this.f34696b).g(2));
    }

    public final g m(int i10) {
        return i10 == 1 ? this.f34688t0 : this.f34689u0;
    }

    public final void n(float f10) {
        g m10 = m(1);
        zm.a aVar = (zm.a) zm.a.f42572h.b();
        i iVar = this.f34713s;
        aVar.f42574c = iVar;
        aVar.f42575d = f10;
        aVar.f42576e = s0.g.f34069a;
        aVar.f42577f = m10;
        aVar.f42578g = this;
        if (iVar.f8277d > s0.g.f34069a && iVar.f8276c > s0.g.f34069a) {
            post(aVar);
        } else {
            this.D.add(aVar);
        }
    }

    @Override // sm.b, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint;
        super.onDraw(canvas);
        if (this.f34696b == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f34680k0;
        i iVar = this.f34713s;
        if (z10) {
            canvas.drawRect(iVar.f8275b, this.f34678i0);
        }
        if (this.f34681l0) {
            canvas.drawRect(iVar.f8275b, this.f34679j0);
        }
        if (this.G) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            um.d dVar = (um.d) this.f34696b;
            Iterator it = dVar.f37256i.iterator();
            while (it.hasNext()) {
                um.h hVar = (um.h) ((ym.b) it.next());
                List list = hVar.f37272p;
                if (list != null && !list.isEmpty()) {
                    hVar.f37273q = -3.4028235E38f;
                    hVar.f37274r = Float.MAX_VALUE;
                    int i11 = hVar.i(highestVisibleX, Float.NaN, 1);
                    for (int i12 = hVar.i(lowestVisibleX, Float.NaN, 2); i12 <= i11; i12++) {
                        hVar.d((um.i) hVar.f37272p.get(i12));
                    }
                }
            }
            dVar.a();
            tm.i iVar2 = this.f34703i;
            um.d dVar2 = (um.d) this.f34696b;
            iVar2.b(dVar2.f37251d, dVar2.f37250c);
            j jVar = this.f34684p0;
            if (jVar.f36180a) {
                jVar.b(((um.d) this.f34696b).h(1), ((um.d) this.f34696b).g(1));
            }
            j jVar2 = this.f34685q0;
            if (jVar2.f36180a) {
                jVar2.b(((um.d) this.f34696b).h(2), ((um.d) this.f34696b).g(2));
            }
            b();
        }
        j jVar3 = this.f34684p0;
        if (jVar3.f36180a) {
            this.f34686r0.h(jVar3.E, jVar3.D);
        }
        j jVar4 = this.f34685q0;
        if (jVar4.f36180a) {
            this.f34687s0.h(jVar4.E, jVar4.D);
        }
        tm.i iVar3 = this.f34703i;
        if (iVar3.f36180a) {
            this.f34690v0.h(iVar3.E, iVar3.D);
        }
        bn.j jVar5 = this.f34690v0;
        tm.i iVar4 = jVar5.f7190i;
        if (iVar4.f36173t && iVar4.f36180a) {
            Paint paint2 = jVar5.f7139g;
            paint2.setColor(iVar4.f36162i);
            paint2.setStrokeWidth(iVar4.f36163j);
            paint2.setPathEffect(null);
            int i13 = iVar4.I;
            if (i13 != 1 && i13 != 4 && i13 != 3) {
                i10 = 3;
                paint = paint2;
            } else {
                RectF rectF = ((i) jVar5.f3178b).f8275b;
                float f10 = rectF.left;
                float f11 = rectF.top;
                i10 = 3;
                paint = paint2;
                canvas.drawLine(f10, f11, rectF.right, f11, paint);
            }
            int i14 = iVar4.I;
            if (i14 == 2 || i14 == 5 || i14 == i10) {
                RectF rectF2 = ((i) jVar5.f3178b).f8275b;
                float f12 = rectF2.left;
                float f13 = rectF2.bottom;
                canvas.drawLine(f12, f13, rectF2.right, f13, paint);
            }
        }
        this.f34686r0.l(canvas);
        this.f34687s0.l(canvas);
        if (this.f34703i.f36178y) {
            this.f34690v0.k(canvas);
        }
        if (this.f34684p0.f36178y) {
            this.f34686r0.m(canvas);
        }
        if (this.f34685q0.f36178y) {
            this.f34687s0.m(canvas);
        }
        tm.i iVar5 = this.f34703i;
        if (iVar5.f36180a && iVar5.f36177x) {
            this.f34690v0.l(canvas);
        }
        j jVar6 = this.f34684p0;
        if (jVar6.f36180a && jVar6.f36177x) {
            this.f34686r0.n(canvas);
        }
        j jVar7 = this.f34685q0;
        if (jVar7.f36180a && jVar7.f36177x) {
            this.f34687s0.n(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(iVar.f8275b);
        this.f34711q.i(canvas);
        if (!this.f34703i.f36178y) {
            this.f34690v0.k(canvas);
        }
        if (!this.f34684p0.f36178y) {
            this.f34686r0.m(canvas);
        }
        if (!this.f34685q0.f36178y) {
            this.f34687s0.m(canvas);
        }
        if (k()) {
            this.f34711q.k(canvas, this.f34720z);
        }
        canvas.restoreToCount(save);
        this.f34711q.j(canvas);
        tm.i iVar6 = this.f34703i;
        if (iVar6.f36180a && !iVar6.f36177x) {
            this.f34690v0.l(canvas);
        }
        j jVar8 = this.f34684p0;
        if (jVar8.f36180a && !jVar8.f36177x) {
            this.f34686r0.n(canvas);
        }
        j jVar9 = this.f34685q0;
        if (jVar9.f36180a && !jVar9.f36177x) {
            this.f34687s0.n(canvas);
        }
        bn.j jVar10 = this.f34690v0;
        tm.i iVar7 = jVar10.f7190i;
        if (iVar7.f36180a && iVar7.f36174u) {
            float f14 = iVar7.f36182c;
            Paint paint3 = jVar10.f7138f;
            paint3.setTypeface(null);
            paint3.setTextSize(iVar7.f36183d);
            paint3.setColor(iVar7.f36184e);
            d b10 = d.b(s0.g.f34069a, s0.g.f34069a);
            int i15 = iVar7.I;
            if (i15 == 1) {
                b10.f8247b = 0.5f;
                b10.f8248c = 1.0f;
                jVar10.j(canvas, ((i) jVar10.f3178b).f8275b.top - f14, b10);
            } else if (i15 == 4) {
                b10.f8247b = 0.5f;
                b10.f8248c = 1.0f;
                jVar10.j(canvas, ((i) jVar10.f3178b).f8275b.top + f14 + iVar7.G, b10);
            } else if (i15 == 2) {
                b10.f8247b = 0.5f;
                b10.f8248c = s0.g.f34069a;
                jVar10.j(canvas, ((i) jVar10.f3178b).f8275b.bottom + f14, b10);
            } else if (i15 == 5) {
                b10.f8247b = 0.5f;
                b10.f8248c = s0.g.f34069a;
                jVar10.j(canvas, (((i) jVar10.f3178b).f8275b.bottom - f14) - iVar7.G, b10);
            } else {
                b10.f8247b = 0.5f;
                b10.f8248c = 1.0f;
                jVar10.j(canvas, ((i) jVar10.f3178b).f8275b.top - f14, b10);
                b10.f8247b = 0.5f;
                b10.f8248c = s0.g.f34069a;
                jVar10.j(canvas, ((i) jVar10.f3178b).f8275b.bottom + f14, b10);
            }
            d.c(b10);
        }
        this.f34686r0.k(canvas);
        this.f34687s0.k(canvas);
        if (this.f34682m0) {
            int save2 = canvas.save();
            canvas.clipRect(iVar.f8275b);
            this.f34711q.l(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.f34711q.l(canvas);
        }
        this.f34710p.j(canvas);
        c(canvas);
        d(canvas);
        if (this.f34695a) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j10 = this.f34691w0 + currentTimeMillis2;
            this.f34691w0 = j10;
            long j11 = this.f34692x0 + 1;
            this.f34692x0 = j11;
            Log.i("MPAndroidChart", "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j10 / j11) + " ms, cycles: " + this.f34692x0);
        }
    }

    @Override // sm.b, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float[] fArr = this.C0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z10 = this.f34683o0;
        i iVar = this.f34713s;
        if (z10) {
            RectF rectF = iVar.f8275b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            m(1).d(fArr);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f34683o0) {
            m(1).e(fArr);
            iVar.a(this, fArr);
        } else {
            iVar.f(iVar.f8274a, this, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        an.b bVar = this.f34708n;
        if (bVar == null || this.f34696b == null || !this.f34704j) {
            return false;
        }
        return bVar.onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z10) {
        this.G = z10;
    }

    public void setBorderColor(int i10) {
        this.f34679j0.setColor(i10);
    }

    public void setBorderWidth(float f10) {
        this.f34679j0.setStrokeWidth(h.c(f10));
    }

    public void setClipValuesToContent(boolean z10) {
        this.f34682m0 = z10;
    }

    public void setDoubleTapToZoomEnabled(boolean z10) {
        this.I = z10;
    }

    public void setDragEnabled(boolean z10) {
        this.f34674e0 = z10;
        this.f34675f0 = z10;
    }

    public void setDragOffsetX(float f10) {
        i iVar = this.f34713s;
        iVar.getClass();
        iVar.f8285l = h.c(f10);
    }

    public void setDragOffsetY(float f10) {
        i iVar = this.f34713s;
        iVar.getClass();
        iVar.f8286m = h.c(f10);
    }

    public void setDragXEnabled(boolean z10) {
        this.f34674e0 = z10;
    }

    public void setDragYEnabled(boolean z10) {
        this.f34675f0 = z10;
    }

    public void setDrawBorders(boolean z10) {
        this.f34681l0 = z10;
    }

    public void setDrawGridBackground(boolean z10) {
        this.f34680k0 = z10;
    }

    public void setGridBackgroundColor(int i10) {
        this.f34678i0.setColor(i10);
    }

    public void setHighlightPerDragEnabled(boolean z10) {
        this.J = z10;
    }

    public void setKeepPositionOnRotation(boolean z10) {
        this.f34683o0 = z10;
    }

    public void setMaxVisibleValueCount(int i10) {
        this.F = i10;
    }

    public void setMinOffset(float f10) {
        this.n0 = f10;
    }

    public void setOnDrawListener(an.e eVar) {
    }

    public void setPinchZoom(boolean z10) {
        this.H = z10;
    }

    public void setRendererLeftYAxis(k kVar) {
        this.f34686r0 = kVar;
    }

    public void setRendererRightYAxis(k kVar) {
        this.f34687s0 = kVar;
    }

    public void setScaleEnabled(boolean z10) {
        this.f34676g0 = z10;
        this.f34677h0 = z10;
    }

    public void setScaleXEnabled(boolean z10) {
        this.f34676g0 = z10;
    }

    public void setScaleYEnabled(boolean z10) {
        this.f34677h0 = z10;
    }

    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.f34703i.F / f10;
        i iVar = this.f34713s;
        iVar.getClass();
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        iVar.f8280g = f11;
        iVar.e(iVar.f8274a, iVar.f8275b);
    }

    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.f34703i.F / f10;
        i iVar = this.f34713s;
        iVar.getClass();
        if (f11 == s0.g.f34069a) {
            f11 = Float.MAX_VALUE;
        }
        iVar.f8281h = f11;
        iVar.e(iVar.f8274a, iVar.f8275b);
    }

    public void setXAxisRenderer(bn.j jVar) {
        this.f34690v0 = jVar;
    }
}
