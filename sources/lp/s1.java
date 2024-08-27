package lp;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class s1 extends v1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f25054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f25055c;

    public s1(v0 v0Var, v0 v0Var2) {
        this.f25054b = v0Var;
        this.f25055c = v0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f25054b.contains(obj) && this.f25055c.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.f25054b.containsAll(collection) && this.f25055c.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f25055c, this.f25054b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f25054b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f25055c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
