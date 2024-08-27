package lp;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class q extends o implements List {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f25041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Object obj, List list, o oVar) {
        super(rVar, obj, list, oVar);
        this.f25041f = rVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        e();
        boolean isEmpty = this.f25021b.isEmpty();
        ((List) this.f25021b).add(i10, obj);
        this.f25041f.f25047e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f25021b).addAll(i10, collection);
        if (addAll) {
            this.f25041f.f25047e += this.f25021b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e();
        return ((List) this.f25021b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        e();
        return ((List) this.f25021b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        return ((List) this.f25021b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        e();
        return new p(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        e();
        Object remove = ((List) this.f25021b).remove(i10);
        r rVar = this.f25041f;
        rVar.f25047e--;
        g();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        e();
        return ((List) this.f25021b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        e();
        List subList = ((List) this.f25021b).subList(i10, i11);
        o oVar = this.f25022c;
        if (oVar == null) {
            oVar = this;
        }
        r rVar = this.f25041f;
        rVar.getClass();
        boolean z10 = subList instanceof RandomAccess;
        Object obj = this.f25020a;
        if (z10) {
            return new q(rVar, obj, subList, oVar);
        }
        return new q(rVar, obj, subList, oVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        e();
        return new p(this, i10);
    }
}
