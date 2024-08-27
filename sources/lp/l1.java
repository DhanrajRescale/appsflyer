package lp;

import java.util.Map;

/* loaded from: classes2.dex */
public final class l1 extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient s0 f25004d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f25005e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f25006f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f25007g;

    public l1(s0 s0Var, Object[] objArr, int i10) {
        this.f25004d = s0Var;
        this.f25005e = objArr;
        this.f25007g = i10;
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f25004d.get(key))) {
            return false;
        }
        return true;
    }

    @Override // lp.i0
    public final int e(int i10, Object[] objArr) {
        return b().e(i10, objArr);
    }

    @Override // lp.i0
    public final boolean k() {
        return true;
    }

    @Override // lp.i0
    /* renamed from: m */
    public final y1 iterator() {
        return b().listIterator(0);
    }

    @Override // lp.v0
    public final o0 r() {
        return new k1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25007g;
    }
}
