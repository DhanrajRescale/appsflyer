package p9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f30768a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f30769b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f30770c;

    public a() {
        this.f30768a = new PointF();
        this.f30769b = new PointF();
        this.f30770c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f30770c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f30768a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f30769b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f30768a = pointF;
        this.f30769b = pointF2;
        this.f30770c = pointF3;
    }
}
