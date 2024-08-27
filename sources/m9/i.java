package m9;

/* loaded from: classes.dex */
public final class i extends l {
    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(x9.a aVar, float f10) {
        Float f11;
        if (aVar.f40115b != null && aVar.f40116c != null) {
            x9.c cVar = this.f27643e;
            Object obj = aVar.f40115b;
            if (cVar != null && (f11 = (Float) cVar.n(aVar.f40120g, aVar.f40121h.floatValue(), (Float) obj, (Float) aVar.f40116c, f10, e(), this.f27642d)) != null) {
                return f11.floatValue();
            }
            if (aVar.f40122i == -3987645.8f) {
                aVar.f40122i = ((Float) obj).floatValue();
            }
            float f12 = aVar.f40122i;
            if (aVar.f40123j == -3987645.8f) {
                aVar.f40123j = ((Float) aVar.f40116c).floatValue();
            }
            return w9.e.d(f12, aVar.f40123j, f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
