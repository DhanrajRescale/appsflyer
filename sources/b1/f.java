package b1;

import t0.a0;
import t0.l3;
import y0.r;

/* loaded from: classes.dex */
public final class f extends y0.f {

    /* renamed from: f, reason: collision with root package name */
    public g f3081f;

    /* JADX WARN: Type inference failed for: r0v0, types: [a1.b, java.lang.Object] */
    public f(g gVar) {
        this.f41023a = new Object();
        this.f41024b = gVar.f41018d;
        this.f41027e = gVar.d();
        this.f3081f = gVar;
    }

    @Override // y0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        return super.containsKey((a0) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof l3)) {
            return false;
        }
        return super.containsValue((l3) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0.d] */
    public final g g() {
        r rVar = this.f41024b;
        g gVar = this.f3081f;
        r rVar2 = gVar.f41018d;
        g gVar2 = gVar;
        if (rVar != rVar2) {
            this.f41023a = new Object();
            gVar2 = new y0.d(this.f41024b, d());
        }
        this.f3081f = gVar2;
        return gVar2;
    }

    @Override // y0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof a0)) {
            return null;
        }
        return (l3) super.get((a0) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof a0)) {
            return obj2;
        }
        return (l3) super.getOrDefault((a0) obj, (l3) obj2);
    }

    @Override // y0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof a0)) {
            return null;
        }
        return (l3) super.remove((a0) obj);
    }
}
