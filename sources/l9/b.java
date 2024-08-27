package l9;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements m9.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final y f24238e;

    /* renamed from: f, reason: collision with root package name */
    public final s9.b f24239f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f24241h;

    /* renamed from: i, reason: collision with root package name */
    public final k9.a f24242i;

    /* renamed from: j, reason: collision with root package name */
    public final m9.i f24243j;

    /* renamed from: k, reason: collision with root package name */
    public final m9.e f24244k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24245l;

    /* renamed from: m, reason: collision with root package name */
    public final m9.i f24246m;

    /* renamed from: n, reason: collision with root package name */
    public m9.u f24247n;

    /* renamed from: o, reason: collision with root package name */
    public m9.e f24248o;

    /* renamed from: p, reason: collision with root package name */
    public float f24249p;

    /* renamed from: q, reason: collision with root package name */
    public final m9.h f24250q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f24234a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24235b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24236c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f24237d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f24240g = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v5, types: [k9.a, android.graphics.Paint] */
    public b(y yVar, s9.b bVar, Paint.Cap cap, Paint.Join join, float f10, bk.c cVar, q9.a aVar, List list, q9.a aVar2) {
        ?? paint = new Paint(1);
        this.f24242i = paint;
        this.f24249p = s0.g.f34069a;
        this.f24238e = yVar;
        this.f24239f = bVar;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f10);
        this.f24244k = cVar.a();
        this.f24243j = (m9.i) aVar.a();
        if (aVar2 == null) {
            this.f24246m = null;
        } else {
            this.f24246m = (m9.i) aVar2.a();
        }
        this.f24245l = new ArrayList(list.size());
        this.f24241h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f24245l.add(((q9.a) list.get(i10)).a());
        }
        bVar.g(this.f24244k);
        bVar.g(this.f24243j);
        for (int i11 = 0; i11 < this.f24245l.size(); i11++) {
            bVar.g((m9.e) this.f24245l.get(i11));
        }
        m9.i iVar = this.f24246m;
        if (iVar != null) {
            bVar.g(iVar);
        }
        this.f24244k.a(this);
        this.f24243j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((m9.e) this.f24245l.get(i12)).a(this);
        }
        m9.i iVar2 = this.f24246m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.m() != null) {
            m9.e a10 = ((q9.a) bVar.m().f18690b).a();
            this.f24248o = a10;
            a10.a(this);
            bVar.g(this.f24248o);
        }
        if (bVar.n() != null) {
            this.f24250q = new m9.h(this, bVar, bVar.n());
        }
    }

    @Override // m9.a
    public final void a() {
        this.f24238e.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        u uVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList2.get(size);
            if (dVar instanceof u) {
                u uVar2 = (u) dVar;
                if (uVar2.f24371c == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f24240g;
            if (size2 < 0) {
                break;
            }
            d dVar2 = (d) list2.get(size2);
            if (dVar2 instanceof u) {
                u uVar3 = (u) dVar2;
                if (uVar3.f24371c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(uVar3);
                    uVar3.c(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(uVar);
                }
                aVar.f24232a.add((n) dVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // p9.f
    public void c(x9.c cVar, Object obj) {
        if (obj == b0.f21108d) {
            this.f24244k.k(cVar);
            return;
        }
        if (obj == b0.f21123s) {
            this.f24243j.k(cVar);
            return;
        }
        ColorFilter colorFilter = b0.K;
        s9.b bVar = this.f24239f;
        if (obj == colorFilter) {
            m9.u uVar = this.f24247n;
            if (uVar != null) {
                bVar.p(uVar);
            }
            if (cVar == null) {
                this.f24247n = null;
                return;
            }
            m9.u uVar2 = new m9.u(cVar, null);
            this.f24247n = uVar2;
            uVar2.a(this);
            bVar.g(this.f24247n);
            return;
        }
        if (obj == b0.f21114j) {
            m9.e eVar = this.f24248o;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            m9.u uVar3 = new m9.u(cVar, null);
            this.f24248o = uVar3;
            uVar3.a(this);
            bVar.g(this.f24248o);
            return;
        }
        Integer num = b0.f21109e;
        m9.h hVar = this.f24250q;
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

    @Override // l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f24235b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24240g;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                for (int i11 = 0; i11 < aVar.f24232a.size(); i11++) {
                    path.addPath(((n) aVar.f24232a.get(i11)).i(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.f24237d;
                path.computeBounds(rectF2, false);
                float l10 = this.f24243j.l() / 2.0f;
                rectF2.set(rectF2.left - l10, rectF2.top - l10, rectF2.right + l10, rectF2.bottom + l10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                kp.j.M();
                return;
            }
        }
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l9.f
    public void h(Canvas canvas, Matrix matrix, int i10) {
        float[] fArr;
        float floatValue;
        int i11;
        float f10;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        b bVar = this;
        float[] fArr2 = (float[]) w9.f.f38895d.get();
        boolean z10 = false;
        fArr2[0] = 0.0f;
        int i12 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            m9.k kVar = (m9.k) bVar.f24244k;
            float l10 = (i10 / 255.0f) * kVar.l(kVar.b(), kVar.d());
            float f13 = 100.0f;
            PointF pointF = w9.e.f38891a;
            int max = Math.max(0, Math.min(255, (int) ((l10 / 100.0f) * 255.0f)));
            k9.a aVar = bVar.f24242i;
            aVar.setAlpha(max);
            aVar.setStrokeWidth(w9.f.d(matrix) * bVar.f24243j.l());
            if (aVar.getStrokeWidth() <= s0.g.f34069a) {
                kp.j.M();
                return;
            }
            ArrayList arrayList = bVar.f24245l;
            if (arrayList.isEmpty()) {
                kp.j.M();
            } else {
                float d10 = w9.f.d(matrix);
                int i13 = 0;
                while (true) {
                    int size = arrayList.size();
                    fArr = bVar.f24241h;
                    if (i13 >= size) {
                        break;
                    }
                    float floatValue2 = ((Float) ((m9.e) arrayList.get(i13)).f()).floatValue();
                    fArr[i13] = floatValue2;
                    if (i13 % 2 == 0) {
                        if (floatValue2 < 1.0f) {
                            fArr[i13] = 1.0f;
                        }
                    } else if (floatValue2 < 0.1f) {
                        fArr[i13] = 0.1f;
                    }
                    fArr[i13] = fArr[i13] * d10;
                    i13++;
                }
                m9.i iVar = bVar.f24246m;
                if (iVar == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) iVar.f()).floatValue() * d10;
                }
                aVar.setPathEffect(new DashPathEffect(fArr, floatValue));
                kp.j.M();
            }
            m9.u uVar = bVar.f24247n;
            if (uVar != null) {
                aVar.setColorFilter((ColorFilter) uVar.f());
            }
            m9.e eVar = bVar.f24248o;
            if (eVar != null) {
                float floatValue3 = ((Float) eVar.f()).floatValue();
                if (floatValue3 == s0.g.f34069a) {
                    aVar.setMaskFilter(null);
                } else if (floatValue3 != bVar.f24249p) {
                    s9.b bVar2 = bVar.f24239f;
                    if (bVar2.A == floatValue3) {
                        blurMaskFilter = bVar2.B;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        bVar2.B = blurMaskFilter2;
                        bVar2.A = floatValue3;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    aVar.setMaskFilter(blurMaskFilter);
                }
                bVar.f24249p = floatValue3;
            }
            m9.h hVar = bVar.f24250q;
            if (hVar != null) {
                hVar.b(aVar);
            }
            int i14 = 0;
            while (true) {
                ArrayList arrayList2 = bVar.f24240g;
                if (i14 < arrayList2.size()) {
                    a aVar2 = (a) arrayList2.get(i14);
                    u uVar2 = aVar2.f24233b;
                    Path path = bVar.f24235b;
                    ArrayList arrayList3 = aVar2.f24232a;
                    if (uVar2 != null) {
                        path.reset();
                        for (int size2 = arrayList3.size() - i12; size2 >= 0; size2--) {
                            path.addPath(((n) arrayList3.get(size2)).i(), matrix);
                        }
                        u uVar3 = aVar2.f24233b;
                        float floatValue4 = ((Float) uVar3.f24372d.f()).floatValue() / f13;
                        float floatValue5 = ((Float) uVar3.f24373e.f()).floatValue() / f13;
                        float floatValue6 = ((Float) uVar3.f24374f.f()).floatValue() / 360.0f;
                        if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                            canvas.drawPath(path, aVar);
                            kp.j.M();
                        } else {
                            PathMeasure pathMeasure = bVar.f24234a;
                            pathMeasure.setPath(path, z10);
                            float length = pathMeasure.getLength();
                            while (pathMeasure.nextContour()) {
                                length = pathMeasure.getLength() + length;
                            }
                            float f14 = floatValue6 * length;
                            float f15 = (floatValue4 * length) + f14;
                            float min = Math.min((floatValue5 * length) + f14, (f15 + length) - 1.0f);
                            int size3 = arrayList3.size() - i12;
                            float f16 = 0.0f;
                            while (size3 >= 0) {
                                Path path2 = bVar.f24236c;
                                path2.set(((n) arrayList3.get(size3)).i());
                                path2.transform(matrix);
                                pathMeasure.setPath(path2, z10);
                                float length2 = pathMeasure.getLength();
                                if (min > length) {
                                    float f17 = min - length;
                                    if (f17 < f16 + length2 && f16 < f17) {
                                        if (f15 > length) {
                                            f12 = (f15 - length) / length2;
                                        } else {
                                            f12 = 0.0f;
                                        }
                                        w9.f.a(path2, f12, Math.min(f17 / length2, 1.0f), s0.g.f34069a);
                                        canvas.drawPath(path2, aVar);
                                        f16 += length2;
                                        size3--;
                                        bVar = this;
                                        z10 = false;
                                    }
                                }
                                float f18 = f16 + length2;
                                if (f18 >= f15 && f16 <= min) {
                                    if (f18 <= min && f15 < f16) {
                                        canvas.drawPath(path2, aVar);
                                    } else {
                                        if (f15 < f16) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = (f15 - f16) / length2;
                                        }
                                        if (min > f18) {
                                            f11 = 1.0f;
                                        } else {
                                            f11 = (min - f16) / length2;
                                        }
                                        w9.f.a(path2, f10, f11, s0.g.f34069a);
                                        canvas.drawPath(path2, aVar);
                                    }
                                }
                                f16 += length2;
                                size3--;
                                bVar = this;
                                z10 = false;
                            }
                            kp.j.M();
                        }
                        i11 = 1;
                    } else {
                        path.reset();
                        i11 = 1;
                        for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                            path.addPath(((n) arrayList3.get(size4)).i(), matrix);
                        }
                        kp.j.M();
                        canvas.drawPath(path, aVar);
                        kp.j.M();
                    }
                    i14++;
                    bVar = this;
                    i12 = i11;
                    z10 = false;
                    f13 = 100.0f;
                } else {
                    kp.j.M();
                    return;
                }
            }
        } else {
            kp.j.M();
        }
    }
}
