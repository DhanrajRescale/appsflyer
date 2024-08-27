package y0;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends vt.g {

    /* renamed from: f, reason: collision with root package name */
    public static final d f41017f = new d(r.f41041e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final r f41018d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41019e;

    public d(r rVar, int i10) {
        this.f41018d = rVar;
        this.f41019e = i10;
    }

    @Override // vt.g
    public final Set b() {
        return new m(this);
    }

    @Override // vt.g
    public final Set c() {
        return new o(this);
    }

    @Override // vt.g, java.util.Map
    public boolean containsKey(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f41018d.d(i10, 0, obj);
    }

    @Override // vt.g
    public final int d() {
        return this.f41019e;
    }

    @Override // vt.g
    public final Collection e() {
        return new p(this);
    }

    public final d g(Object obj, z0.a aVar) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        q u10 = this.f41018d.u(obj, i10, 0, aVar);
        if (u10 == null) {
            return this;
        }
        return new d(u10.f41039a, size() + u10.f41040b);
    }

    @Override // vt.g, java.util.Map
    public Object get(Object obj) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f41018d.g(i10, 0, obj);
    }
}
