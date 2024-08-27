package l9;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements f, m9.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f24284a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24285b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.b f24286c;

    /* renamed from: d, reason: collision with root package name */
    public final t.o f24287d = new t.o((Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final t.o f24288e = new t.o((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public final Path f24289f;

    /* renamed from: g, reason: collision with root package name */
    public final k9.a f24290g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f24291h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24292i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24293j;

    /* renamed from: k, reason: collision with root package name */
    public final m9.e f24294k;

    /* renamed from: l, reason: collision with root package name */
    public final m9.e f24295l;

    /* renamed from: m, reason: collision with root package name */
    public final m9.e f24296m;

    /* renamed from: n, reason: collision with root package name */
    public final m9.e f24297n;

    /* renamed from: o, reason: collision with root package name */
    public m9.u f24298o;

    /* renamed from: p, reason: collision with root package name */
    public m9.u f24299p;

    /* renamed from: q, reason: collision with root package name */
    public final y f24300q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24301r;

    /* renamed from: s, reason: collision with root package name */
    public m9.e f24302s;

    /* renamed from: t, reason: collision with root package name */
    public float f24303t;

    /* renamed from: u, reason: collision with root package name */
    public final m9.h f24304u;

    /* JADX WARN: Type inference failed for: r1v1, types: [k9.a, android.graphics.Paint] */
    public i(y yVar, j9.i iVar, s9.b bVar, r9.d dVar) {
        Path path = new Path();
        this.f24289f = path;
        this.f24290g = new Paint(1);
        this.f24291h = new RectF();
        this.f24292i = new ArrayList();
        this.f24303t = s0.g.f34069a;
        this.f24286c = bVar;
        this.f24284a = dVar.f33474g;
        this.f24285b = dVar.f33475h;
        this.f24300q = yVar;
        this.f24293j = dVar.f33468a;
        path.setFillType(dVar.f33469b);
        this.f24301r = (int) (iVar.b() / 32.0f);
        m9.e a10 = dVar.f33470c.a();
        this.f24294k = a10;
        a10.a(this);
        bVar.g(a10);
        m9.e a11 = dVar.f33471d.a();
        this.f24295l = a11;
        a11.a(this);
        bVar.g(a11);
        m9.e a12 = dVar.f33472e.a();
        this.f24296m = a12;
        a12.a(this);
        bVar.g(a12);
        m9.e a13 = dVar.f33473f.a();
        this.f24297n = a13;
        a13.a(this);
        bVar.g(a13);
        if (bVar.m() != null) {
            m9.e a14 = ((q9.a) bVar.m().f18690b).a();
            this.f24302s = a14;
            a14.a(this);
            bVar.g(this.f24302s);
        }
        if (bVar.n() != null) {
            this.f24304u = new m9.h(this, bVar, bVar.n());
        }
    }

    @Override // m9.a
    public final void a() {
        this.f24300q.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = (d) list2.get(i10);
            if (dVar instanceof n) {
                this.f24292i.add((n) dVar);
            }
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        if (obj == b0.f21108d) {
            this.f24295l.k(cVar);
            return;
        }
        ColorFilter colorFilter = b0.K;
        s9.b bVar = this.f24286c;
        if (obj == colorFilter) {
            m9.u uVar = this.f24298o;
            if (uVar != null) {
                bVar.p(uVar);
            }
            if (cVar == null) {
                this.f24298o = null;
                return;
            }
            m9.u uVar2 = new m9.u(cVar, null);
            this.f24298o = uVar2;
            uVar2.a(this);
            bVar.g(this.f24298o);
            return;
        }
        if (obj == b0.L) {
            m9.u uVar3 = this.f24299p;
            if (uVar3 != null) {
                bVar.p(uVar3);
            }
            if (cVar == null) {
                this.f24299p = null;
                return;
            }
            this.f24287d.a();
            this.f24288e.a();
            m9.u uVar4 = new m9.u(cVar, null);
            this.f24299p = uVar4;
            uVar4.a(this);
            bVar.g(this.f24299p);
            return;
        }
        if (obj == b0.f21114j) {
            m9.e eVar = this.f24302s;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            m9.u uVar5 = new m9.u(cVar, null);
            this.f24302s = uVar5;
            uVar5.a(this);
            bVar.g(this.f24302s);
            return;
        }
        Integer num = b0.f21109e;
        m9.h hVar = this.f24304u;
        if (obj == num && hVar != null) {
            hVar.f27649b.k(cVar);
            return;
        }
        if (obj == b0.G && hVar != null) {
            hVar.c(cVar);
            return;
        }
        if (obj == b0.H && hVar != null) {
            hVar.f27651d.k(cVar);
            return;
        }
        if (obj == b0.I && hVar != null) {
            hVar.f27652e.k(cVar);
        } else if (obj == b0.J && hVar != null) {
            hVar.f27653f.k(cVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24284a;
    }

    @Override // l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f24289f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24292i;
            if (i10 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i10)).i(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
    }

    public final int[] g(int[] iArr) {
        m9.u uVar = this.f24299p;
        if (uVar != null) {
            Integer[] numArr = (Integer[]) uVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f24285b) {
            return;
        }
        Path path = this.f24289f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24292i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i11)).i(), matrix);
            i11++;
        }
        path.computeBounds(this.f24291h, false);
        int i12 = this.f24293j;
        m9.e eVar = this.f24294k;
        m9.e eVar2 = this.f24297n;
        m9.e eVar3 = this.f24296m;
        if (i12 == 1) {
            long j10 = j();
            t.o oVar = this.f24287d;
            shader = (LinearGradient) oVar.c(j10);
            if (shader == null) {
                PointF pointF = (PointF) eVar3.f();
                PointF pointF2 = (PointF) eVar2.f();
                r9.c cVar = (r9.c) eVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(cVar.f33467b), cVar.f33466a, Shader.TileMode.CLAMP);
                oVar.g(j10, shader);
            }
        } else {
            long j11 = j();
            t.o oVar2 = this.f24288e;
            shader = (RadialGradient) oVar2.c(j11);
            if (shader == null) {
                PointF pointF3 = (PointF) eVar3.f();
                PointF pointF4 = (PointF) eVar2.f();
                r9.c cVar2 = (r9.c) eVar.f();
                int[] g10 = g(cVar2.f33467b);
                float[] fArr = cVar2.f33466a;
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (hypot <= s0.g.f34069a) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f10, f11, hypot, g10, fArr, Shader.TileMode.CLAMP);
                oVar2.g(j11, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        k9.a aVar = this.f24290g;
        aVar.setShader(shader);
        m9.u uVar = this.f24298o;
        if (uVar != null) {
            aVar.setColorFilter((ColorFilter) uVar.f());
        }
        m9.e eVar4 = this.f24302s;
        if (eVar4 != null) {
            float floatValue = ((Float) eVar4.f()).floatValue();
            if (floatValue == s0.g.f34069a) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f24303t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f24303t = floatValue;
        }
        m9.h hVar = this.f24304u;
        if (hVar != null) {
            hVar.b(aVar);
        }
        PointF pointF5 = w9.e.f38891a;
        aVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f24295l.f()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar);
        kp.j.M();
    }

    public final int j() {
        int i10;
        float f10 = this.f24296m.f27642d;
        int i11 = this.f24301r;
        int round = Math.round(f10 * i11);
        int round2 = Math.round(this.f24297n.f27642d * i11);
        int round3 = Math.round(this.f24294k.f27642d * i11);
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
