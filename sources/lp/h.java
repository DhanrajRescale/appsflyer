package lp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f24983a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24984b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f24985c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f24986d = y0.f25085a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f24987e;

    public h(r rVar) {
        this.f24987e = rVar;
        this.f24983a = rVar.f25046d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f24983a.hasNext() && !this.f24986d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f24986d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f24983a.next();
            this.f24984b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f24985c = collection;
            this.f24986d = collection.iterator();
        }
        Object obj = this.f24984b;
        Object next = this.f24986d.next();
        switch (((d) this).f24964f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24986d.remove();
        Collection collection = this.f24985c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f24983a.remove();
        }
        r rVar = this.f24987e;
        rVar.f25047e--;
    }
}
