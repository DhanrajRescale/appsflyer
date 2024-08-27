package m9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class k extends l {
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
            if (aVar.f40124k == 784923401) {
                aVar.f40124k = ((Integer) obj).intValue();
            }
            int i10 = aVar.f40124k;
            if (aVar.f40125l == 784923401) {
                aVar.f40125l = ((Integer) aVar.f40116c).intValue();
            }
            int i11 = aVar.f40125l;
            PointF pointF = w9.e.f38891a;
            return (int) ((f10 * (i11 - i10)) + i10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
