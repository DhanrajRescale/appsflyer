package m9;

import android.graphics.Path;
import android.graphics.PointF;
import d2.f1;

/* loaded from: classes.dex */
public final class n extends x9.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f27660q;

    /* renamed from: r, reason: collision with root package name */
    public final x9.a f27661r;

    public n(j9.i iVar, x9.a aVar) {
        super(iVar, (PointF) aVar.f40115b, (PointF) aVar.f40116c, aVar.f40117d, aVar.f40118e, aVar.f40119f, aVar.f40120g, aVar.f40121h);
        this.f27661r = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        Object obj;
        Object obj2 = this.f40116c;
        Object obj3 = this.f40115b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj3 != null && (obj = this.f40116c) != null && !z10) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            x9.a aVar = this.f27661r;
            PointF pointF3 = aVar.f40128o;
            PointF pointF4 = aVar.f40129p;
            f1 f1Var = w9.f.f38892a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != s0.g.f34069a || pointF4.length() != s0.g.f34069a)) {
                float f10 = pointF3.x + pointF.x;
                float f11 = pointF.y + pointF3.y;
                float f12 = pointF2.x;
                float f13 = f12 + pointF4.x;
                float f14 = pointF2.y;
                path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f27660q = path;
        }
    }
}
