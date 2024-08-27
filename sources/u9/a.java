package u9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tr.e f36981a = tr.e.y("k", "x", "y");

    public static q9.b a(v9.d dVar, j9.i iVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (dVar.x() == 1) {
            dVar.a();
            while (dVar.g()) {
                if (dVar.x() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new m9.n(iVar, q.b(dVar, iVar, w9.f.c(), v.f37033a, z10, false)));
            }
            dVar.c();
            r.b(arrayList);
        } else {
            arrayList.add(new x9.a(p.b(dVar, w9.f.c())));
        }
        return new q9.b(arrayList);
    }

    public static q9.e b(v9.d dVar, j9.i iVar) {
        dVar.b();
        q9.b bVar = null;
        q9.a aVar = null;
        boolean z10 = false;
        q9.a aVar2 = null;
        while (dVar.x() != 4) {
            int H = dVar.H(f36981a);
            if (H != 0) {
                if (H != 1) {
                    if (H != 2) {
                        dVar.I();
                        dVar.J();
                    } else if (dVar.x() == 6) {
                        dVar.J();
                        z10 = true;
                    } else {
                        aVar = bl.j.Q(dVar, iVar, true);
                    }
                } else if (dVar.x() == 6) {
                    dVar.J();
                    z10 = true;
                } else {
                    aVar2 = bl.j.Q(dVar, iVar, true);
                }
            } else {
                bVar = a(dVar, iVar);
            }
        }
        dVar.d();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        if (bVar != null) {
            return bVar;
        }
        return new q9.c(aVar2, aVar);
    }
}
