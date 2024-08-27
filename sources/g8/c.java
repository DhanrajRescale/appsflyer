package g8;

import androidx.work.u;
import j8.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17168a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f17169b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.d f17170c;

    /* renamed from: d, reason: collision with root package name */
    public b f17171d;

    public c(h8.d dVar) {
        this.f17170c = dVar;
    }

    public abstract boolean a(k kVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f17168a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (a(kVar)) {
                this.f17168a.add(kVar.f21074a);
            }
        }
        if (this.f17168a.isEmpty()) {
            this.f17170c.b(this);
        } else {
            h8.d dVar = this.f17170c;
            synchronized (dVar.f18045c) {
                try {
                    if (dVar.f18046d.add(this)) {
                        if (dVar.f18046d.size() == 1) {
                            dVar.f18047e = dVar.a();
                            u.w().u(h8.d.f18042f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f18047e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f18047e;
                        this.f17169b = obj;
                        d(this.f17171d, obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(this.f17171d, this.f17169b);
    }

    public final void d(b bVar, Object obj) {
        if (!this.f17168a.isEmpty() && bVar != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.f17168a;
                f8.c cVar = (f8.c) bVar;
                synchronized (cVar.f15986c) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (cVar.a(str)) {
                                u.w().u(f8.c.f15983d, String.format("Constraints met for %s", str), new Throwable[0]);
                                arrayList2.add(str);
                            }
                        }
                        f8.b bVar2 = cVar.f15984a;
                        if (bVar2 != null) {
                            bVar2.e(arrayList2);
                        }
                    } finally {
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.f17168a;
            f8.c cVar2 = (f8.c) bVar;
            synchronized (cVar2.f15986c) {
                f8.b bVar3 = cVar2.f15984a;
                if (bVar3 != null) {
                    bVar3.d(arrayList3);
                }
            }
        }
    }
}
