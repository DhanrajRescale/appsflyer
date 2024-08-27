package lp;

/* loaded from: classes2.dex */
public final class m1 extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient s0 f25011d;

    /* renamed from: e, reason: collision with root package name */
    public final transient o0 f25012e;

    public m1(s0 s0Var, n1 n1Var) {
        this.f25011d = s0Var;
        this.f25012e = n1Var;
    }

    @Override // lp.v0, lp.i0
    public final o0 b() {
        return this.f25012e;
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f25011d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // lp.i0
    public final int e(int i10, Object[] objArr) {
        return this.f25012e.e(i10, objArr);
    }

    @Override // lp.i0
    public final boolean k() {
        return true;
    }

    @Override // lp.i0
    /* renamed from: m */
    public final y1 iterator() {
        return this.f25012e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((o1) this.f25011d).f25029f;
    }
}
