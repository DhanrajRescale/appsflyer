package u9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f37034a = new Object();

    @Override // u9.i0
    public final Object i(v9.c cVar, float f10) {
        int x10 = cVar.x();
        if (x10 == 1) {
            return p.b(cVar, f10);
        }
        if (x10 == 3) {
            return p.b(cVar, f10);
        }
        if (x10 == 7) {
            PointF pointF = new PointF(((float) cVar.l()) * f10, ((float) cVar.l()) * f10);
            while (cVar.g()) {
                cVar.J();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(v.e.A(x10)));
    }
}
