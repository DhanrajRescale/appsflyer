package lp;

/* loaded from: classes2.dex */
public final class w1 extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f25074d;

    public w1(Object obj) {
        obj.getClass();
        this.f25074d = obj;
    }

    @Override // lp.v0, lp.i0
    public final o0 b() {
        return o0.v(this.f25074d);
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25074d.equals(obj);
    }

    @Override // lp.i0
    public final int e(int i10, Object[] objArr) {
        objArr[i10] = this.f25074d;
        return i10 + 1;
    }

    @Override // lp.v0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25074d.hashCode();
    }

    @Override // lp.i0
    public final boolean k() {
        return false;
    }

    @Override // lp.i0
    /* renamed from: m */
    public final y1 iterator() {
        return new x0(this.f25074d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f25074d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
