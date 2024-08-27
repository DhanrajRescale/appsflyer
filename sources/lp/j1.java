package lp;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class j1 extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public static final j1 f24998e = new j1(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f24999c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f25000d;

    public j1(Object[] objArr, int i10) {
        this.f24999c = objArr;
        this.f25000d = i10;
    }

    @Override // lp.o0, lp.i0
    public final int e(int i10, Object[] objArr) {
        Object[] objArr2 = this.f24999c;
        int i11 = this.f25000d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // lp.i0
    public final Object[] g() {
        return this.f24999c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        dp.b.S0(i10, this.f25000d);
        Object obj = this.f24999c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // lp.i0
    public final int h() {
        return this.f25000d;
    }

    @Override // lp.i0
    public final int i() {
        return 0;
    }

    @Override // lp.i0
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25000d;
    }
}
