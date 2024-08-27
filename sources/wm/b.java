package wm;

import cn.g;
import java.util.ArrayList;
import um.h;
import um.i;

/* loaded from: classes2.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final xm.b f39305a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39306b = new ArrayList();

    public b(xm.b bVar) {
        this.f39305a = bVar;
    }

    public static float c(ArrayList arrayList, float f10, int i10) {
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f39313g == i10) {
                float abs = Math.abs(cVar.f39310d - f10);
                if (abs < f11) {
                    f11 = abs;
                }
            }
        }
        return f11;
    }

    public um.d a() {
        return this.f39305a.getData();
    }

    public float b(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f10 - f12, f11 - f13);
    }

    @Override // wm.d
    public c f(float f10, float f11) {
        float f12;
        um.d dVar;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        i h10;
        g m10 = ((sm.a) this.f39305a).m(1);
        m10.getClass();
        cn.c cVar = (cn.c) cn.c.f8243d.b();
        cVar.f8244b = 0.0d;
        cVar.f8245c = 0.0d;
        m10.b(f10, f11, cVar);
        float f13 = (float) cVar.f8244b;
        cn.c.b(cVar);
        ArrayList arrayList3 = this.f39306b;
        arrayList3.clear();
        um.d a10 = a();
        xm.b bVar = this.f39305a;
        if (a10 != null) {
            int c10 = a10.c();
            int i11 = 0;
            while (i11 < c10) {
                h hVar = (h) a10.b(i11);
                if (!hVar.f37261e) {
                    f12 = f13;
                    arrayList2 = arrayList3;
                    dVar = a10;
                    i10 = i11;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<i> f14 = hVar.f(f13);
                    if (f14.size() == 0 && (h10 = hVar.h(f13, Float.NaN, 3)) != null) {
                        f14 = hVar.f(h10.b());
                    }
                    if (f14.size() == 0) {
                        f12 = f13;
                        arrayList2 = arrayList3;
                        dVar = a10;
                        arrayList = arrayList4;
                        i10 = i11;
                    } else {
                        for (i iVar : f14) {
                            cn.c a11 = ((sm.a) bVar).m(hVar.f37260d).a(iVar.b(), iVar.a());
                            float f15 = f13;
                            ArrayList arrayList5 = arrayList4;
                            arrayList5.add(new c(iVar.b(), iVar.a(), (float) a11.f8244b, (float) a11.f8245c, i11, hVar.f37260d));
                            arrayList4 = arrayList5;
                            hVar = hVar;
                            arrayList3 = arrayList3;
                            a10 = a10;
                            f13 = f15;
                        }
                        f12 = f13;
                        ArrayList arrayList6 = arrayList3;
                        dVar = a10;
                        arrayList = arrayList4;
                        i10 = i11;
                        arrayList2 = arrayList6;
                    }
                    arrayList2.addAll(arrayList);
                }
                i11 = i10 + 1;
                arrayList3 = arrayList2;
                a10 = dVar;
                f13 = f12;
            }
        }
        ArrayList arrayList7 = arrayList3;
        c cVar2 = null;
        if (!arrayList7.isEmpty()) {
            int i12 = 1;
            if (c(arrayList7, f11, 1) >= c(arrayList7, f11, 2)) {
                i12 = 2;
            }
            float maxHighlightDistance = bVar.getMaxHighlightDistance();
            for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                c cVar3 = (c) arrayList7.get(i13);
                if (cVar3.f39313g == i12) {
                    float b10 = b(f10, f11, cVar3.f39309c, cVar3.f39310d);
                    if (b10 < maxHighlightDistance) {
                        cVar2 = cVar3;
                        maxHighlightDistance = b10;
                    }
                }
            }
        }
        return cVar2;
    }
}
