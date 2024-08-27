package m9;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f27662i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f27663j;

    /* renamed from: k, reason: collision with root package name */
    public final PathMeasure f27664k;

    /* renamed from: l, reason: collision with root package name */
    public n f27665l;

    public o(List list) {
        super(list);
        this.f27662i = new PointF();
        this.f27663j = new float[2];
        this.f27664k = new PathMeasure();
    }

    @Override // m9.e
    public final Object g(x9.a aVar, float f10) {
        PointF pointF;
        n nVar = (n) aVar;
        Path path = nVar.f27660q;
        if (path == null) {
            return (PointF) aVar.f40115b;
        }
        x9.c cVar = this.f27643e;
        if (cVar == null || (pointF = (PointF) cVar.n(nVar.f40120g, nVar.f40121h.floatValue(), (PointF) nVar.f40115b, (PointF) nVar.f40116c, e(), f10, this.f27642d)) == null) {
            n nVar2 = this.f27665l;
            PathMeasure pathMeasure = this.f27664k;
            if (nVar2 != nVar) {
                pathMeasure.setPath(path, false);
                this.f27665l = nVar;
            }
            float length = pathMeasure.getLength() * f10;
            float[] fArr = this.f27663j;
            pathMeasure.getPosTan(length, fArr, null);
            PointF pointF2 = this.f27662i;
            pointF2.set(fArr[0], fArr[1]);
            return pointF2;
        }
        return pointF;
    }
}
