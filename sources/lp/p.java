package lp;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class p extends f implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f25030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i10) {
        super(qVar, ((List) qVar.f25021b).listIterator(i10));
        this.f25030e = qVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        q qVar = this.f25030e;
        boolean isEmpty = qVar.isEmpty();
        b().add(obj);
        qVar.f25041f.f25047e++;
        if (isEmpty) {
            qVar.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f24974b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(qVar);
        this.f25030e = qVar;
    }
}
