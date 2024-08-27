package u9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final tr.e f37024a = tr.e.y("k");

    public static ArrayList a(v9.c cVar, j9.i iVar, float f10, i0 i0Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.x() == 6) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.b();
        while (cVar.g()) {
            if (cVar.H(f37024a) != 0) {
                cVar.J();
            } else if (cVar.x() == 1) {
                cVar.a();
                if (cVar.x() == 7) {
                    arrayList.add(q.b(cVar, iVar, f10, i0Var, false, z10));
                } else {
                    while (cVar.g()) {
                        arrayList.add(q.b(cVar, iVar, f10, i0Var, true, z10));
                    }
                }
                cVar.c();
            } else {
                arrayList.add(q.b(cVar, iVar, f10, i0Var, false, z10));
            }
        }
        cVar.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            x9.a aVar = (x9.a) arrayList.get(i11);
            i11++;
            x9.a aVar2 = (x9.a) arrayList.get(i11);
            aVar.f40121h = Float.valueOf(aVar2.f40120g);
            if (aVar.f40116c == null && (obj = aVar2.f40115b) != null) {
                aVar.f40116c = obj;
                if (aVar instanceof m9.n) {
                    ((m9.n) aVar).d();
                }
            }
        }
        x9.a aVar3 = (x9.a) arrayList.get(i10);
        if ((aVar3.f40115b == null || aVar3.f40116c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
