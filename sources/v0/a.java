package v0;

import vt.t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f37640a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public Object[] f37641b = new Object[16];

    /* renamed from: c, reason: collision with root package name */
    public int f37642c;

    public final int a(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i10 = this.f37642c - 1;
        Object[] objArr = this.f37640a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i12;
                    }
                    Object[] objArr2 = this.f37640a;
                    int i13 = this.f37642c;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i14;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 != obj) {
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                return -(i15 + 1);
                            }
                        } else {
                            return i15;
                        }
                    }
                    return -(i13 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final Object b(Object obj) {
        int a10 = a(obj);
        if (a10 >= 0) {
            return this.f37641b[a10];
        }
        return null;
    }

    public final void c(Object obj, c cVar) {
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3 = this.f37640a;
        Object[] objArr4 = this.f37641b;
        int i10 = this.f37642c;
        int a10 = a(obj);
        if (a10 >= 0) {
            objArr4[a10] = cVar;
            return;
        }
        int i11 = -(a10 + 1);
        if (i10 == objArr3.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            objArr = new Object[i10 * 2];
        } else {
            objArr = objArr3;
        }
        int i12 = i11 + 1;
        t.f(objArr3, i12, objArr, i11, i10);
        if (z10) {
            t.h(objArr3, objArr, 0, i11, 6);
        }
        objArr[i11] = obj;
        this.f37640a = objArr;
        if (z10) {
            objArr2 = new Object[i10 * 2];
        } else {
            objArr2 = objArr4;
        }
        t.f(objArr4, i12, objArr2, i11, i10);
        if (z10) {
            t.h(objArr4, objArr2, 0, i11, 6);
        }
        objArr2[i11] = cVar;
        this.f37641b = objArr2;
        this.f37642c++;
    }
}
