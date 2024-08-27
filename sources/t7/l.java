package t7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.x1;
import h.m0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends x1 {
    @Override // androidx.fragment.app.x1
    public final void a(View view, Object obj) {
        ((p) obj).b(view);
    }

    @Override // androidx.fragment.app.x1
    public final void b(Object obj, ArrayList arrayList) {
        p pVar;
        p pVar2 = (p) obj;
        if (pVar2 == null) {
            return;
        }
        int i10 = 0;
        if (pVar2 instanceof u) {
            u uVar = (u) pVar2;
            int size = uVar.f35529x.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < uVar.f35529x.size()) {
                    pVar = (p) uVar.f35529x.get(i10);
                } else {
                    pVar = null;
                }
                b(pVar, arrayList);
                i10++;
            }
            return;
        }
        if (x1.h(pVar2.f35507e) && x1.h(null) && x1.h(null) && x1.h(pVar2.f35508f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                pVar2.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.x1
    public final void c(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (p) obj);
    }

    @Override // androidx.fragment.app.x1
    public final boolean e(Object obj) {
        return obj instanceof p;
    }

    @Override // androidx.fragment.app.x1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((p) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x1
    public final Object i(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        p pVar3 = (p) obj3;
        if (pVar != null && pVar2 != null) {
            u uVar = new u();
            uVar.I(pVar);
            uVar.I(pVar2);
            uVar.L(1);
            pVar = uVar;
        } else if (pVar == null) {
            if (pVar2 != null) {
                pVar = pVar2;
            } else {
                pVar = null;
            }
        }
        if (pVar3 != null) {
            u uVar2 = new u();
            if (pVar != null) {
                uVar2.I(pVar);
            }
            uVar2.I(pVar3);
            return uVar2;
        }
        return pVar;
    }

    @Override // androidx.fragment.app.x1
    public final Object j(Object obj, Object obj2) {
        u uVar = new u();
        if (obj != null) {
            uVar.I((p) obj);
        }
        uVar.I((p) obj2);
        return uVar;
    }

    @Override // androidx.fragment.app.x1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((p) obj).a(new i(view, arrayList));
    }

    @Override // androidx.fragment.app.x1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((p) obj).a(new j(this, obj2, arrayList, obj3, arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vl.b] */
    @Override // androidx.fragment.app.x1
    public final void m(View view, Object obj) {
        if (view != null) {
            x1.g(view, new Rect());
            ((p) obj).B(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vl.b] */
    @Override // androidx.fragment.app.x1
    public final void n(Object obj, Rect rect) {
        ((p) obj).B(new Object());
    }

    @Override // androidx.fragment.app.x1
    public final void o(Object obj, y3.g gVar, m0 m0Var) {
        p pVar = (p) obj;
        gVar.a(new tr.e(this, pVar, 25));
        pVar.a(new k(m0Var));
    }

    @Override // androidx.fragment.app.x1
    public final void p(Object obj, View view, ArrayList arrayList) {
        u uVar = (u) obj;
        ArrayList arrayList2 = uVar.f35508f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x1.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(uVar, arrayList);
    }

    @Override // androidx.fragment.app.x1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        u uVar = (u) obj;
        if (uVar != null) {
            ArrayList arrayList3 = uVar.f35508f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(uVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        u uVar = new u();
        uVar.I((p) obj);
        return uVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        p pVar;
        p pVar2 = (p) obj;
        int i10 = 0;
        if (pVar2 instanceof u) {
            u uVar = (u) pVar2;
            int size2 = uVar.f35529x.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < uVar.f35529x.size()) {
                    pVar = (p) uVar.f35529x.get(i10);
                } else {
                    pVar = null;
                }
                s(pVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (x1.h(pVar2.f35507e) && x1.h(null) && x1.h(null)) {
            ArrayList arrayList3 = pVar2.f35508f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    pVar2.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    pVar2.x((View) arrayList.get(size3));
                }
            }
        }
    }
}
