package m9;

/* loaded from: classes.dex */
public final class f extends l {
    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(x9.a aVar, float f10) {
        Integer num;
        if (aVar.f40115b != null && aVar.f40116c != null) {
            x9.c cVar = this.f27643e;
            Object obj = aVar.f40115b;
            if (cVar != null && (num = (Integer) cVar.n(aVar.f40120g, aVar.f40121h.floatValue(), (Integer) obj, (Integer) aVar.f40116c, f10, e(), this.f27642d)) != null) {
                return num.intValue();
            }
            return bl.j.y(((Integer) obj).intValue(), w9.e.b(f10, s0.g.f34069a, 1.0f), ((Integer) aVar.f40116c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
