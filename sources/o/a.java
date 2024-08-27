package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f29324e = new HashMap();

    @Override // o.g
    public final c b(Object obj) {
        return (c) this.f29324e.get(obj);
    }

    @Override // o.g
    public final Object e(Object obj, Object obj2) {
        c b10 = b(obj);
        if (b10 != null) {
            return b10.f29327b;
        }
        HashMap hashMap = this.f29324e;
        c cVar = new c(obj, obj2);
        this.f29338d++;
        c cVar2 = this.f29336b;
        if (cVar2 == null) {
            this.f29335a = cVar;
            this.f29336b = cVar;
        } else {
            cVar2.f29328c = cVar;
            cVar.f29329d = cVar2;
            this.f29336b = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }

    @Override // o.g
    public final Object g(Object obj) {
        Object g10 = super.g(obj);
        this.f29324e.remove(obj);
        return g10;
    }
}
