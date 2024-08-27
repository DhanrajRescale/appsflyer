package m9;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final b f27641c;

    /* renamed from: e, reason: collision with root package name */
    public x9.c f27643e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f27639a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f27640b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f27642d = s0.g.f34069a;

    /* renamed from: f, reason: collision with root package name */
    public Object f27644f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f27645g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f27646h = -1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(List list) {
        b cVar;
        b bVar;
        if (list.isEmpty()) {
            bVar = new Object();
        } else {
            if (list.size() == 1) {
                cVar = new d(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f27641c = bVar;
    }

    public final void a(a aVar) {
        this.f27639a.add(aVar);
    }

    public final x9.a b() {
        x9.a h10 = this.f27641c.h();
        kp.j.M();
        return h10;
    }

    public float c() {
        if (this.f27646h == -1.0f) {
            this.f27646h = this.f27641c.t();
        }
        return this.f27646h;
    }

    public final float d() {
        x9.a b10 = b();
        if (b10 != null && !b10.c()) {
            return b10.f40117d.getInterpolation(e());
        }
        return s0.g.f34069a;
    }

    public final float e() {
        if (this.f27640b) {
            return s0.g.f34069a;
        }
        x9.a b10 = b();
        if (b10.c()) {
            return s0.g.f34069a;
        }
        return (this.f27642d - b10.b()) / (b10.a() - b10.b());
    }

    public Object f() {
        Object g10;
        Interpolator interpolator;
        float e10 = e();
        if (this.f27643e == null && this.f27641c.g(e10)) {
            return this.f27644f;
        }
        x9.a b10 = b();
        Interpolator interpolator2 = b10.f40118e;
        if (interpolator2 != null && (interpolator = b10.f40119f) != null) {
            g10 = h(b10, e10, interpolator2.getInterpolation(e10), interpolator.getInterpolation(e10));
        } else {
            g10 = g(b10, d());
        }
        this.f27644f = g10;
        return g10;
    }

    public abstract Object g(x9.a aVar, float f10);

    public Object h(x9.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27639a;
            if (i10 < arrayList.size()) {
                ((a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public void j(float f10) {
        b bVar = this.f27641c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f27645g == -1.0f) {
            this.f27645g = bVar.w();
        }
        float f11 = this.f27645g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f27645g = bVar.w();
            }
            f10 = this.f27645g;
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f27642d) {
            return;
        }
        this.f27642d = f10;
        if (bVar.i(f10)) {
            i();
        }
    }

    public final void k(x9.c cVar) {
        x9.c cVar2 = this.f27643e;
        if (cVar2 != null) {
            cVar2.f40139c = null;
        }
        this.f27643e = cVar;
        if (cVar != null) {
            cVar.f40139c = this;
        }
    }
}
