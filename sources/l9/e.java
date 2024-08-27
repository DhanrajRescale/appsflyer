package l9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import d2.f1;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements f, n, m9.a, p9.f {

    /* renamed from: a, reason: collision with root package name */
    public final k9.a f24252a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f24253b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f24254c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f24255d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f24256e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24257f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24258g;

    /* renamed from: h, reason: collision with root package name */
    public final List f24259h;

    /* renamed from: i, reason: collision with root package name */
    public final y f24260i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f24261j;

    /* renamed from: k, reason: collision with root package name */
    public final m9.t f24262k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(j9.y r8, s9.b r9, r9.m r10, j9.i r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f33522a
            boolean r4 = r10.f33524c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r10 = r10.f33523b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            r9.b r2 = (r9.b) r2
            l9.d r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L40
            java.lang.Object r11 = r10.get(r0)
            r9.b r11 = (r9.b) r11
            boolean r1 = r11 instanceof q9.d
            if (r1 == 0) goto L3d
            q9.d r11 = (q9.d) r11
            r6 = r11
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.<init>(j9.y, s9.b, r9.m, j9.i):void");
    }

    @Override // m9.a
    public final void a() {
        this.f24260i.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f24259h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) list3.get(size2);
            dVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(dVar);
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        m9.t tVar = this.f24262k;
        if (tVar != null) {
            tVar.c(cVar, obj);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24257f;
    }

    @Override // l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f24254c;
        matrix2.set(matrix);
        m9.t tVar = this.f24262k;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
        }
        RectF rectF2 = this.f24256e;
        rectF2.set(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
        List list = this.f24259h;
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = (d) list.get(size);
            if (dVar instanceof f) {
                ((f) dVar).e(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        String str = this.f24257f;
        if (!eVar.c(i10, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            p9.e eVar3 = new p9.e(eVar2);
            eVar3.f30794a.add(str);
            if (eVar.a(i10, str)) {
                p9.e eVar4 = new p9.e(eVar3);
                eVar4.f30795b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i10, str)) {
            int b10 = eVar.b(i10, str) + i10;
            int i11 = 0;
            while (true) {
                List list = this.f24259h;
                if (i11 < list.size()) {
                    d dVar = (d) list.get(i11);
                    if (dVar instanceof p9.f) {
                        ((p9.f) dVar).f(eVar, b10, arrayList, eVar2);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final List g() {
        if (this.f24261j == null) {
            this.f24261j = new ArrayList();
            int i10 = 0;
            while (true) {
                List list = this.f24259h;
                if (i10 >= list.size()) {
                    break;
                }
                d dVar = (d) list.get(i10);
                if (dVar instanceof n) {
                    this.f24261j.add((n) dVar);
                }
                i10++;
            }
        }
        return this.f24261j;
    }

    @Override // l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        int intValue;
        if (this.f24258g) {
            return;
        }
        Matrix matrix2 = this.f24254c;
        matrix2.set(matrix);
        m9.t tVar = this.f24262k;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
            m9.e eVar = tVar.f27687j;
            if (eVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) eVar.f()).intValue();
            }
            i10 = (int) ((((intValue / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f24260i.f21242s;
        boolean z11 = false;
        List list = this.f24259h;
        if (z10) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if ((list.get(i11) instanceof f) && (i12 = i12 + 1) >= 2) {
                    if (i10 != 255) {
                        z11 = true;
                    }
                } else {
                    i11++;
                }
            }
        }
        if (z11) {
            RectF rectF = this.f24253b;
            rectF.set(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
            e(rectF, matrix2, true);
            k9.a aVar = this.f24252a;
            aVar.setAlpha(i10);
            f1 f1Var = w9.f.f38892a;
            canvas.saveLayer(rectF, aVar);
            kp.j.M();
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof f) {
                ((f) obj).h(canvas, matrix2, i10);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // l9.n
    public final Path i() {
        Matrix matrix = this.f24254c;
        matrix.reset();
        m9.t tVar = this.f24262k;
        if (tVar != null) {
            matrix.set(tVar.e());
        }
        Path path = this.f24255d;
        path.reset();
        if (this.f24258g) {
            return path;
        }
        List list = this.f24259h;
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = (d) list.get(size);
            if (dVar instanceof n) {
                path.addPath(((n) dVar).i(), matrix);
            }
        }
        return path;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k9.a, android.graphics.Paint] */
    public e(y yVar, s9.b bVar, String str, boolean z10, ArrayList arrayList, q9.d dVar) {
        this.f24252a = new Paint();
        this.f24253b = new RectF();
        this.f24254c = new Matrix();
        this.f24255d = new Path();
        this.f24256e = new RectF();
        this.f24257f = str;
        this.f24260i = yVar;
        this.f24258g = z10;
        this.f24259h = arrayList;
        if (dVar != null) {
            m9.t tVar = new m9.t(dVar);
            this.f24262k = tVar;
            tVar.a(bVar);
            tVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar2 = (d) arrayList.get(size);
            if (dVar2 instanceof k) {
                arrayList2.add((k) dVar2);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }
}
