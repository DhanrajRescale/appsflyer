package lp;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class n1 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f25017c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f25018d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f25019e;

    public n1(Object[] objArr, int i10, int i11) {
        this.f25017c = objArr;
        this.f25018d = i10;
        this.f25019e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        dp.b.S0(i10, this.f25019e);
        Object obj = this.f25017c[(i10 * 2) + this.f25018d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // lp.i0
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25019e;
    }
}
