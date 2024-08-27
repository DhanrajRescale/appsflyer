package ft;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import pt.w;
import zq.f;

/* loaded from: classes2.dex */
public final class d implements ct.b, a {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f16244a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f16245b;

    @Override // ct.b
    public final void a() {
        if (this.f16245b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16245b) {
                    return;
                }
                this.f16245b = true;
                LinkedList linkedList = this.f16244a;
                ArrayList arrayList = null;
                this.f16244a = null;
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        try {
                            ((ct.b) it.next()).a();
                        } catch (Throwable th2) {
                            f.l0(th2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th2);
                        }
                    }
                    if (arrayList != null) {
                        if (arrayList.size() == 1) {
                            throw rt.b.b((Throwable) arrayList.get(0));
                        }
                        throw new CompositeException(arrayList);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ft.a
    public final boolean b(ct.b bVar) {
        if (d(bVar)) {
            ((w) bVar).a();
            return true;
        }
        return false;
    }

    @Override // ft.a
    public final boolean c(ct.b bVar) {
        if (!this.f16245b) {
            synchronized (this) {
                try {
                    if (!this.f16245b) {
                        LinkedList linkedList = this.f16244a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f16244a = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.a();
        return false;
    }

    @Override // ft.a
    public final boolean d(ct.b bVar) {
        if (bVar != null) {
            if (this.f16245b) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f16245b) {
                        return false;
                    }
                    LinkedList linkedList = this.f16244a;
                    if (linkedList != null && linkedList.remove(bVar)) {
                        return true;
                    }
                    return false;
                } finally {
                }
            }
        }
        throw new NullPointerException("Disposable item is null");
    }
}
