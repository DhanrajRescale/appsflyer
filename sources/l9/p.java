package l9;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements m9.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f24336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24337d;

    /* renamed from: e, reason: collision with root package name */
    public final y f24338e;

    /* renamed from: f, reason: collision with root package name */
    public final m9.e f24339f;

    /* renamed from: g, reason: collision with root package name */
    public final m9.e f24340g;

    /* renamed from: h, reason: collision with root package name */
    public final m9.i f24341h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24344k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24334a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f24335b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f24342i = new c(0);

    /* renamed from: j, reason: collision with root package name */
    public m9.e f24343j = null;

    public p(y yVar, s9.b bVar, r9.i iVar) {
        int i10 = iVar.f33506a;
        this.f24336c = iVar.f33507b;
        this.f24337d = iVar.f33509d;
        this.f24338e = yVar;
        m9.e a10 = iVar.f33510e.a();
        this.f24339f = a10;
        m9.e a11 = ((q9.e) iVar.f33511f).a();
        this.f24340g = a11;
        m9.e a12 = iVar.f33508c.a();
        this.f24341h = (m9.i) a12;
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // m9.a
    public final void a() {
        this.f24344k = false;
        this.f24338e.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                d dVar = (d) arrayList.get(i10);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f24371c == 1) {
                        this.f24342i.f24251a.add(uVar);
                        uVar.c(this);
                        i10++;
                    }
                }
                if (dVar instanceof r) {
                    this.f24343j = ((r) dVar).f24356b;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        if (obj == b0.f21116l) {
            this.f24340g.k(cVar);
        } else if (obj == b0.f21118n) {
            this.f24339f.k(cVar);
        } else if (obj == b0.f21117m) {
            this.f24341h.k(cVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24336c;
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l9.n
    public final Path i() {
        float l10;
        m9.e eVar;
        boolean z10 = this.f24344k;
        Path path = this.f24334a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f24337d) {
            this.f24344k = true;
            return path;
        }
        PointF pointF = (PointF) this.f24340g.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        m9.i iVar = this.f24341h;
        if (iVar == null) {
            l10 = 0.0f;
        } else {
            l10 = iVar.l();
        }
        if (l10 == s0.g.f34069a && (eVar = this.f24343j) != null) {
            l10 = Math.min(((Float) eVar.f()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (l10 > min) {
            l10 = min;
        }
        PointF pointF2 = (PointF) this.f24339f.f();
        path.moveTo(pointF2.x + f10, (pointF2.y - f11) + l10);
        path.lineTo(pointF2.x + f10, (pointF2.y + f11) - l10);
        RectF rectF = this.f24335b;
        if (l10 > s0.g.f34069a) {
            float f12 = pointF2.x + f10;
            float f13 = l10 * 2.0f;
            float f14 = pointF2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, s0.g.f34069a, 90.0f, false);
        }
        path.lineTo((pointF2.x - f10) + l10, pointF2.y + f11);
        if (l10 > s0.g.f34069a) {
            float f15 = pointF2.x - f10;
            float f16 = pointF2.y + f11;
            float f17 = l10 * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f10, (pointF2.y - f11) + l10);
        if (l10 > s0.g.f34069a) {
            float f18 = pointF2.x - f10;
            float f19 = pointF2.y - f11;
            float f20 = l10 * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f10) - l10, pointF2.y - f11);
        if (l10 > s0.g.f34069a) {
            float f21 = pointF2.x + f10;
            float f22 = l10 * 2.0f;
            float f23 = pointF2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f24342i.b(path);
        this.f24344k = true;
        return path;
    }
}
