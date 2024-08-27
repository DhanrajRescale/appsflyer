package m9;

/* loaded from: classes.dex */
public final class s extends l {
    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        Object obj;
        float floatValue;
        p9.b bVar;
        x9.c cVar = this.f27643e;
        Object obj2 = aVar.f40115b;
        if (cVar != null) {
            float f11 = aVar.f40120g;
            Float f12 = aVar.f40121h;
            if (f12 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f12.floatValue();
            }
            p9.b bVar2 = (p9.b) obj2;
            Object obj3 = aVar.f40116c;
            if (obj3 == null) {
                bVar = bVar2;
            } else {
                bVar = (p9.b) obj3;
            }
            return (p9.b) cVar.n(f11, floatValue, bVar2, bVar, f10, d(), this.f27642d);
        }
        if (f10 == 1.0f && (obj = aVar.f40116c) != null) {
            return (p9.b) obj;
        }
        return (p9.b) obj2;
    }
}
