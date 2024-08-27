package u9;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final tr.e f37020a = tr.e.y("x", "y");

    public static int a(v9.c cVar) {
        cVar.a();
        int l10 = (int) (cVar.l() * 255.0d);
        int l11 = (int) (cVar.l() * 255.0d);
        int l12 = (int) (cVar.l() * 255.0d);
        while (cVar.g()) {
            cVar.J();
        }
        cVar.c();
        return Color.argb(255, l10, l11, l12);
    }

    public static PointF b(v9.c cVar, float f10) {
        int e10 = w.k.e(cVar.x());
        if (e10 != 0) {
            if (e10 != 2) {
                if (e10 == 6) {
                    float l10 = (float) cVar.l();
                    float l11 = (float) cVar.l();
                    while (cVar.g()) {
                        cVar.J();
                    }
                    return new PointF(l10 * f10, l11 * f10);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(v.e.A(cVar.x())));
            }
            cVar.b();
            float f11 = s0.g.f34069a;
            float f12 = 0.0f;
            while (cVar.g()) {
                int H = cVar.H(f37020a);
                if (H != 0) {
                    if (H != 1) {
                        cVar.I();
                        cVar.J();
                    } else {
                        f12 = d(cVar);
                    }
                } else {
                    f11 = d(cVar);
                }
            }
            cVar.d();
            return new PointF(f11 * f10, f12 * f10);
        }
        cVar.a();
        float l12 = (float) cVar.l();
        float l13 = (float) cVar.l();
        while (cVar.x() != 2) {
            cVar.J();
        }
        cVar.c();
        return new PointF(l12 * f10, l13 * f10);
    }

    public static ArrayList c(v9.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.x() == 1) {
            cVar.a();
            arrayList.add(b(cVar, f10));
            cVar.c();
        }
        cVar.c();
        return arrayList;
    }

    public static float d(v9.c cVar) {
        int x10 = cVar.x();
        int e10 = w.k.e(x10);
        if (e10 != 0) {
            if (e10 == 6) {
                return (float) cVar.l();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(v.e.A(x10)));
        }
        cVar.a();
        float l10 = (float) cVar.l();
        while (cVar.g()) {
            cVar.J();
        }
        cVar.c();
        return l10;
    }
}
