package u9;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f36988a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final tr.e f36989b = tr.e.y("c", "v", "i", "o");

    @Override // u9.i0
    public final Object i(v9.c cVar, float f10) {
        if (cVar.x() == 1) {
            cVar.a();
        }
        cVar.b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (cVar.g()) {
            int H = cVar.H(f36989b);
            if (H != 0) {
                if (H != 1) {
                    if (H != 2) {
                        if (H != 3) {
                            cVar.I();
                            cVar.J();
                        } else {
                            arrayList3 = p.c(cVar, f10);
                        }
                    } else {
                        arrayList2 = p.c(cVar, f10);
                    }
                } else {
                    arrayList = p.c(cVar, f10);
                }
            } else {
                z10 = cVar.j();
            }
        }
        cVar.d();
        if (cVar.x() == 2) {
            cVar.c();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new r9.k(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new p9.a(w9.e.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), w9.e.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new p9.a(w9.e.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), w9.e.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new r9.k(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
