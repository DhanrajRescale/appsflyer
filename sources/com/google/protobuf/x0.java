package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class x0 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final x0 f11996d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11997b;

    /* renamed from: c, reason: collision with root package name */
    public int f11998c;

    static {
        x0 x0Var = new x0(new Object[0], 0);
        f11996d = x0Var;
        x0Var.f11897a = false;
    }

    public x0(Object[] objArr, int i10) {
        this.f11997b = objArr;
        this.f11998c = i10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f11998c;
        Object[] objArr = this.f11997b;
        if (i10 == objArr.length) {
            this.f11997b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11997b;
        int i11 = this.f11998c;
        this.f11998c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 >= 0 && i10 < this.f11998c) {
            return;
        }
        StringBuilder n10 = a3.a.n("Index:", i10, ", Size:");
        n10.append(this.f11998c);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.y
    public final y f(int i10) {
        if (i10 >= this.f11998c) {
            return new x0(Arrays.copyOf(this.f11997b, i10), this.f11998c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f11997b[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f11997b;
        Object obj = objArr[i10];
        if (i10 < this.f11998c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f11998c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f11997b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11998c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f11998c)) {
            Object[] objArr = this.f11997b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[v.e.b(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f11997b, i10, objArr2, i10 + 1, this.f11998c - i10);
                this.f11997b = objArr2;
            }
            this.f11997b[i10] = obj;
            this.f11998c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = a3.a.n("Index:", i10, ", Size:");
        n10.append(this.f11998c);
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
