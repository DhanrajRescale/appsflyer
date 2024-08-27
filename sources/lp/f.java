package lp;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24973a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f24974b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24976d;

    public f(o oVar) {
        Iterator it;
        this.f24976d = oVar;
        Collection collection = oVar.f25021b;
        this.f24975c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f24974b = it;
    }

    public final void a() {
        Object obj = this.f24976d;
        ((o) obj).e();
        if (((o) obj).f25021b == ((Collection) this.f24975c)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f24973a;
        Iterator it = this.f24974b;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                a();
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f24973a;
        Iterator it = this.f24974b;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f24975c = (Collection) entry.getValue();
                return ((g) this.f24976d).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f24975c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f24973a;
        Object obj = this.f24976d;
        Iterator it = this.f24974b;
        switch (i10) {
            case 0:
                if (((Collection) this.f24975c) != null) {
                    it.remove();
                    ((g) obj).f24981d.f25047e -= ((Collection) this.f24975c).size();
                    ((Collection) this.f24975c).clear();
                    this.f24975c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Object obj2 = this.f24975c;
                if (((Map.Entry) obj2) != null) {
                    Collection collection = (Collection) ((Map.Entry) obj2).getValue();
                    it.remove();
                    ((i) obj).f24993c.f25047e -= collection.size();
                    collection.clear();
                    this.f24975c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                it.remove();
                o oVar = (o) obj;
                r rVar = oVar.f25024e;
                rVar.f25047e--;
                oVar.g();
                return;
        }
    }

    public f(o oVar, ListIterator listIterator) {
        this.f24976d = oVar;
        this.f24975c = oVar.f25021b;
        this.f24974b = listIterator;
    }

    public f(i iVar, Iterator it) {
        this.f24976d = iVar;
        this.f24974b = it;
    }

    public f(g gVar) {
        this.f24976d = gVar;
        this.f24974b = gVar.f24980c.entrySet().iterator();
    }
}
