package l9;

import android.graphics.Path;
import android.graphics.PointF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements n, m9.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f24264b;

    /* renamed from: c, reason: collision with root package name */
    public final y f24265c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.e f24266d;

    /* renamed from: e, reason: collision with root package name */
    public final m9.e f24267e;

    /* renamed from: f, reason: collision with root package name */
    public final r9.a f24268f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24270h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24263a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f24269g = new c(0);

    public g(y yVar, s9.b bVar, r9.a aVar) {
        this.f24264b = aVar.f33461a;
        this.f24265c = yVar;
        m9.e a10 = aVar.f33463c.a();
        this.f24266d = a10;
        m9.e a11 = aVar.f33462b.a();
        this.f24267e = a11;
        this.f24268f = aVar;
        bVar.g(a10);
        bVar.g(a11);
        a10.a(this);
        a11.a(this);
    }

    @Override // m9.a
    public final void a() {
        this.f24270h = false;
        this.f24265c.invalidateSelf();
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
                        this.f24269g.f24251a.add(uVar);
                        uVar.c(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        if (obj == b0.f21115k) {
            this.f24266d.k(cVar);
        } else if (obj == b0.f21118n) {
            this.f24267e.k(cVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24264b;
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l9.n
    public final Path i() {
        boolean z10 = this.f24270h;
        Path path = this.f24263a;
        if (z10) {
            return path;
        }
        path.reset();
        r9.a aVar = this.f24268f;
        if (aVar.f33465e) {
            this.f24270h = true;
            return path;
        }
        PointF pointF = (PointF) this.f24266d.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f33464d) {
            float f14 = -f11;
            path.moveTo(s0.g.f34069a, f14);
            float f15 = s0.g.f34069a - f12;
            float f16 = -f10;
            float f17 = s0.g.f34069a - f13;
            path.cubicTo(f15, f14, f16, f17, f16, s0.g.f34069a);
            float f18 = f13 + s0.g.f34069a;
            path.cubicTo(f16, f18, f15, f11, s0.g.f34069a, f11);
            float f19 = f12 + s0.g.f34069a;
            path.cubicTo(f19, f11, f10, f18, f10, s0.g.f34069a);
            path.cubicTo(f10, f17, f19, f14, s0.g.f34069a, f14);
        } else {
            float f20 = -f11;
            path.moveTo(s0.g.f34069a, f20);
            float f21 = f12 + s0.g.f34069a;
            float f22 = s0.g.f34069a - f13;
            path.cubicTo(f21, f20, f10, f22, f10, s0.g.f34069a);
            float f23 = f13 + s0.g.f34069a;
            path.cubicTo(f10, f23, f21, f11, s0.g.f34069a, f11);
            float f24 = s0.g.f34069a - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, s0.g.f34069a);
            path.cubicTo(f25, f22, f24, f20, s0.g.f34069a, f20);
        }
        PointF pointF2 = (PointF) this.f24267e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f24269g.b(path);
        this.f24270h = true;
        return path;
    }
}
