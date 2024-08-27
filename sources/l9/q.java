package l9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class q implements f, n, k, m9.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f24345a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24346b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final y f24347c;

    /* renamed from: d, reason: collision with root package name */
    public final s9.b f24348d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24349e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24350f;

    /* renamed from: g, reason: collision with root package name */
    public final m9.i f24351g;

    /* renamed from: h, reason: collision with root package name */
    public final m9.i f24352h;

    /* renamed from: i, reason: collision with root package name */
    public final m9.t f24353i;

    /* renamed from: j, reason: collision with root package name */
    public e f24354j;

    public q(y yVar, s9.b bVar, r9.i iVar) {
        this.f24347c = yVar;
        this.f24348d = bVar;
        int i10 = iVar.f33506a;
        this.f24349e = iVar.f33507b;
        this.f24350f = iVar.f33509d;
        m9.e a10 = iVar.f33508c.a();
        this.f24351g = (m9.i) a10;
        bVar.g(a10);
        a10.a(this);
        m9.e a11 = ((q9.a) iVar.f33510e).a();
        this.f24352h = (m9.i) a11;
        bVar.g(a11);
        a11.a(this);
        q9.d dVar = (q9.d) iVar.f33511f;
        dVar.getClass();
        m9.t tVar = new m9.t(dVar);
        this.f24353i = tVar;
        tVar.a(bVar);
        tVar.b(this);
    }

    @Override // m9.a
    public final void a() {
        this.f24347c.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        this.f24354j.b(list, list2);
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        if (this.f24353i.c(cVar, obj)) {
            return;
        }
        if (obj == b0.f21125u) {
            this.f24351g.k(cVar);
        } else if (obj == b0.f21126v) {
            this.f24352h.k(cVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24349e;
    }

    @Override // l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f24354j.e(rectF, matrix, z10);
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
        for (int i11 = 0; i11 < this.f24354j.f24259h.size(); i11++) {
            d dVar = (d) this.f24354j.f24259h.get(i11);
            if (dVar instanceof l) {
                w9.e.e(eVar, i10, arrayList, eVar2, (l) dVar);
            }
        }
    }

    @Override // l9.k
    public final void g(ListIterator listIterator) {
        if (this.f24354j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f24354j = new e(this.f24347c, this.f24348d, "Repeater", this.f24350f, arrayList, null);
    }

    @Override // l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f24351g.f()).floatValue();
        float floatValue2 = ((Float) this.f24352h.f()).floatValue();
        m9.t tVar = this.f24353i;
        float floatValue3 = ((Float) tVar.f27690m.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) tVar.f27691n.f()).floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f24345a;
            matrix2.set(matrix);
            float f10 = i11;
            matrix2.preConcat(tVar.f(f10 + floatValue2));
            this.f24354j.h(canvas, matrix2, (int) (w9.e.d(floatValue3, floatValue4, f10 / floatValue) * i10));
        }
    }

    @Override // l9.n
    public final Path i() {
        Path i10 = this.f24354j.i();
        Path path = this.f24346b;
        path.reset();
        float floatValue = ((Float) this.f24351g.f()).floatValue();
        float floatValue2 = ((Float) this.f24352h.f()).floatValue();
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix = this.f24345a;
            matrix.set(this.f24353i.f(i11 + floatValue2));
            path.addPath(i10, matrix);
        }
        return path;
    }
}
