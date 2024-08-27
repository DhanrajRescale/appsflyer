package q9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m9.j;
import m9.o;
import xj.n;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List f31867a;

    public b() {
        this.f31867a = new ArrayList();
    }

    public static void d(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.a.u(it.next());
        throw null;
    }

    @Override // q9.e
    public m9.e a() {
        List list = this.f31867a;
        if (((x9.a) list.get(0)).c()) {
            return new j(1, list);
        }
        return new o(list);
    }

    @Override // q9.e
    public List b() {
        return this.f31867a;
    }

    @Override // q9.e
    public boolean c() {
        List list = this.f31867a;
        if (list.size() != 1 || !((x9.a) list.get(0)).c()) {
            return false;
        }
        return true;
    }

    public synchronized n e(Class cls) {
        int size = this.f31867a.size();
        for (int i10 = 0; i10 < size; i10++) {
            mk.d dVar = (mk.d) this.f31867a.get(i10);
            if (dVar.f27819a.isAssignableFrom(cls)) {
                return dVar.f27820b;
            }
        }
        return null;
    }

    public synchronized ArrayList f(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (kk.b bVar : this.f31867a) {
            if (bVar.f23233a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f23234b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public b(ArrayList arrayList) {
        this.f31867a = arrayList;
    }

    public /* synthetic */ b(int i10) {
        if (i10 == 1) {
            this.f31867a = new ArrayList();
        } else if (i10 != 2) {
            this.f31867a = new CopyOnWriteArrayList();
        } else {
            this.f31867a = new ArrayList();
        }
    }
}
