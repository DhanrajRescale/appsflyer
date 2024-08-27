package l9;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements f, m9.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24271a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.a f24272b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.b f24273c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24274d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24275e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24276f;

    /* renamed from: g, reason: collision with root package name */
    public final m9.e f24277g;

    /* renamed from: h, reason: collision with root package name */
    public final m9.e f24278h;

    /* renamed from: i, reason: collision with root package name */
    public m9.u f24279i;

    /* renamed from: j, reason: collision with root package name */
    public final y f24280j;

    /* renamed from: k, reason: collision with root package name */
    public m9.e f24281k;

    /* renamed from: l, reason: collision with root package name */
    public float f24282l;

    /* renamed from: m, reason: collision with root package name */
    public final m9.h f24283m;

    /* JADX WARN: Type inference failed for: r1v0, types: [k9.a, android.graphics.Paint] */
    public h(y yVar, s9.b bVar, r9.l lVar) {
        bk.c cVar;
        Path path = new Path();
        this.f24271a = path;
        this.f24272b = new Paint(1);
        this.f24276f = new ArrayList();
        this.f24273c = bVar;
        this.f24274d = lVar.f33518c;
        this.f24275e = lVar.f33521f;
        this.f24280j = yVar;
        if (bVar.m() != null) {
            m9.e a10 = ((q9.a) bVar.m().f18690b).a();
            this.f24281k = a10;
            a10.a(this);
            bVar.g(this.f24281k);
        }
        if (bVar.n() != null) {
            this.f24283m = new m9.h(this, bVar, bVar.n());
        }
        bk.c cVar2 = lVar.f33519d;
        if (cVar2 != null && (cVar = lVar.f33520e) != null) {
            path.setFillType(lVar.f33517b);
            m9.e a11 = cVar2.a();
            this.f24277g = a11;
            a11.a(this);
            bVar.g(a11);
            m9.e a12 = cVar.a();
            this.f24278h = a12;
            a12.a(this);
            bVar.g(a12);
            return;
        }
        this.f24277g = null;
        this.f24278h = null;
    }

    @Override // m9.a
    public final void a() {
        this.f24280j.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = (d) list2.get(i10);
            if (dVar instanceof n) {
                this.f24276f.add((n) dVar);
            }
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        if (obj == b0.f21105a) {
            this.f24277g.k(cVar);
            return;
        }
        if (obj == b0.f21108d) {
            this.f24278h.k(cVar);
            return;
        }
        ColorFilter colorFilter = b0.K;
        s9.b bVar = this.f24273c;
        if (obj == colorFilter) {
            m9.u uVar = this.f24279i;
            if (uVar != null) {
                bVar.p(uVar);
            }
            if (cVar == null) {
                this.f24279i = null;
                return;
            }
            m9.u uVar2 = new m9.u(cVar, null);
            this.f24279i = uVar2;
            uVar2.a(this);
            bVar.g(this.f24279i);
            return;
        }
        if (obj == b0.f21114j) {
            m9.e eVar = this.f24281k;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            m9.u uVar3 = new m9.u(cVar, null);
            this.f24281k = uVar3;
            uVar3.a(this);
            bVar.g(this.f24281k);
            return;
        }
        Integer num = b0.f21109e;
        m9.h hVar = this.f24283m;
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
        return this.f24274d;
    }

    @Override // l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f24271a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24276f;
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

    @Override // l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f24275e) {
            return;
        }
        m9.f fVar = (m9.f) this.f24277g;
        int l10 = fVar.l(fVar.b(), fVar.d());
        PointF pointF = w9.e.f38891a;
        int i11 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f24278h.f()).intValue()) / 100.0f) * 255.0f))) << 24) | (l10 & 16777215);
        k9.a aVar = this.f24272b;
        aVar.setColor(max);
        m9.u uVar = this.f24279i;
        if (uVar != null) {
            aVar.setColorFilter((ColorFilter) uVar.f());
        }
        m9.e eVar = this.f24281k;
        if (eVar != null) {
            float floatValue = ((Float) eVar.f()).floatValue();
            if (floatValue == s0.g.f34069a) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f24282l) {
                s9.b bVar = this.f24273c;
                if (bVar.A == floatValue) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f24282l = floatValue;
        }
        m9.h hVar = this.f24283m;
        if (hVar != null) {
            hVar.b(aVar);
        }
        Path path = this.f24271a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f24276f;
            if (i11 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i11)).i(), matrix);
                i11++;
            } else {
                canvas.drawPath(path, aVar);
                kp.j.M();
                return;
            }
        }
    }
}
