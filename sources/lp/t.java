package lp;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class t extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f25057b;

    public t(r rVar, int i10) {
        this.f25056a = i10;
        if (i10 != 1) {
            this.f25057b = rVar;
        } else {
            this.f25057b = rVar;
        }
    }

    public final void b() {
        ((r) this.f25057b).b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f25056a) {
            case 0:
                ((r) this.f25057b).b();
                return;
            default:
                b();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f25056a) {
            case 0:
                Iterator it = ((z) this.f25057b.a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return e(obj);
        }
    }

    public final boolean e(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f25057b.a().get(key);
        if (collection == null || !collection.contains(value)) {
            return false;
        }
        return true;
    }

    public final boolean g(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f25057b.a().get(key);
        if (collection == null || !collection.remove(value)) {
            return false;
        }
        return true;
    }

    public final int h() {
        return ((r) this.f25057b).f25047e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f25056a;
        u uVar = this.f25057b;
        switch (i10) {
            case 0:
                r rVar = (r) uVar;
                rVar.getClass();
                return new d(rVar, 0);
            default:
                r rVar2 = (r) uVar;
                rVar2.getClass();
                return new d(rVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f25056a) {
            case 1:
                return g(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f25056a) {
            case 0:
                return ((r) this.f25057b).f25047e;
            default:
                return h();
        }
    }
}
