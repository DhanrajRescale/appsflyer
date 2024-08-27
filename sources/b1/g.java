package b1;

import t0.a0;
import t0.l3;
import t0.r1;
import y0.r;

/* loaded from: classes.dex */
public final class g extends y0.d implements r1 {

    /* renamed from: g, reason: collision with root package name */
    public static final g f3082g = new y0.d(r.f41041e, 0);

    @Override // y0.d, vt.g, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        return super.containsKey((a0) obj);
    }

    @Override // vt.g, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof l3)) {
            return false;
        }
        return super.containsValue((l3) obj);
    }

    @Override // y0.d, vt.g, java.util.Map
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
}
