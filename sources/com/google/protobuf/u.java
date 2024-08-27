package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u extends c implements w, RandomAccess, v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final u f11989d;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11990b;

    /* renamed from: c, reason: collision with root package name */
    public int f11991c;

    static {
        u uVar = new u(new int[0], 0);
        f11989d = uVar;
        uVar.f11897a = false;
    }

    public u(int[] iArr, int i10) {
        this.f11990b = iArr;
        this.f11991c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f11991c)) {
            int[] iArr = this.f11990b;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[v.e.b(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f11990b, i10, iArr2, i10 + 1, this.f11991c - i10);
                this.f11990b = iArr2;
            }
            this.f11990b[i10] = intValue;
            this.f11991c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder n10 = a3.a.n("Index:", i10, ", Size:");
        n10.append(this.f11991c);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = z.f12003a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f11991c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11991c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f11990b;
            if (i12 > iArr.length) {
                this.f11990b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(uVar.f11990b, 0, this.f11990b, this.f11991c, uVar.f11991c);
            this.f11991c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(int i10) {
        b();
        int i11 = this.f11991c;
        int[] iArr = this.f11990b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[v.e.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11990b = iArr2;
        }
        int[] iArr3 = this.f11990b;
        int i12 = this.f11991c;
        this.f11991c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f11991c != uVar.f11991c) {
            return false;
        }
        int[] iArr = uVar.f11990b;
        for (int i10 = 0; i10 < this.f11991c; i10++) {
            if (this.f11990b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.y
    public final y f(int i10) {
        if (i10 >= this.f11991c) {
            return new u(Arrays.copyOf(this.f11990b, i10), this.f11991c);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i10) {
        if (i10 >= 0 && i10 < this.f11991c) {
            return;
        }
        StringBuilder n10 = a3.a.n("Index:", i10, ", Size:");
        n10.append(this.f11991c);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(h(i10));
    }

    public final int h(int i10) {
        g(i10);
        return this.f11990b[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11991c; i11++) {
            i10 = (i10 * 31) + this.f11990b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f11991c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11990b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        g(i10);
        int[] iArr = this.f11990b;
        int i11 = iArr[i10];
        if (i10 < this.f11991c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f11991c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f11990b;
            System.arraycopy(iArr, i11, iArr, i10, this.f11991c - i11);
            this.f11991c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        g(i10);
        int[] iArr = this.f11990b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11991c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
