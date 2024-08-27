package x0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import t.m0;
import t0.t;
import vt.l;

/* loaded from: classes.dex */
public final class f extends l implements Collection, ju.b {

    /* renamed from: a, reason: collision with root package name */
    public w0.c f39803a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f39804b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f39805c;

    /* renamed from: d, reason: collision with root package name */
    public int f39806d;

    /* renamed from: e, reason: collision with root package name */
    public a1.b f39807e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f39808f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f39809g;

    /* renamed from: h, reason: collision with root package name */
    public int f39810h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a1.b, java.lang.Object] */
    public f(w0.c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f39803a = cVar;
        this.f39804b = objArr;
        this.f39805c = objArr2;
        this.f39806d = i10;
        this.f39808f = objArr;
        this.f39809g = objArr2;
        this.f39810h = ((vt.b) cVar).size();
    }

    public static void h(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] A(Object[] objArr, int i10, int i11, Iterator it) {
        boolean z10;
        if (it.hasNext()) {
            if (i11 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 == 0) {
                    return (Object[]) it.next();
                }
                Object[] r10 = r(objArr);
                int V = t.V(i10, i11);
                int i12 = i11 - 5;
                r10[V] = A((Object[]) r10[V], i10, i12, it);
                while (true) {
                    V++;
                    if (V >= 32 || !it.hasNext()) {
                        break;
                    }
                    r10[V] = A((Object[]) r10[V], 0, i12, it);
                }
                return r10;
            }
            al.d.e1("negative shift");
            throw null;
        }
        al.d.e1("invalid buffersIterator");
        throw null;
    }

    public final Object[] B(Object[] objArr, int i10, Object[][] objArr2) {
        Object[] r10;
        m0 U = zq.f.U(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f39806d;
        if (i11 < (1 << i12)) {
            r10 = A(objArr, i10, i12, U);
        } else {
            r10 = r(objArr);
        }
        while (U.hasNext()) {
            this.f39806d += 5;
            r10 = u(r10);
            int i13 = this.f39806d;
            A(r10, 1 << i13, i13, U);
        }
        return r10;
    }

    public final void C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f39810h;
        int i11 = i10 >> 5;
        int i12 = this.f39806d;
        if (i11 > (1 << i12)) {
            this.f39808f = D(this.f39806d + 5, u(objArr), objArr2);
            this.f39809g = objArr3;
            this.f39806d += 5;
            this.f39810h++;
            return;
        }
        if (objArr == null) {
            this.f39808f = objArr2;
            this.f39809g = objArr3;
            this.f39810h = i10 + 1;
        } else {
            this.f39808f = D(i12, objArr, objArr2);
            this.f39809g = objArr3;
            this.f39810h++;
        }
    }

    public final Object[] D(int i10, Object[] objArr, Object[] objArr2) {
        int V = t.V(getF38332c() - 1, i10);
        Object[] r10 = r(objArr);
        if (i10 == 5) {
            r10[V] = objArr2;
        } else {
            r10[V] = D(i10 - 5, (Object[]) r10[V], objArr2);
        }
        return r10;
    }

    public final int E(b bVar, Object[] objArr, int i10, int i11, e4.k kVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] t10;
        if (p(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = kVar.f14993a;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) bVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    if (!arrayList.isEmpty()) {
                        t10 = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        t10 = t();
                    }
                    objArr3 = t10;
                    i11 = 0;
                }
                objArr3[i11] = obj2;
                i11++;
            }
        }
        kVar.f14993a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int F(b bVar, Object[] objArr, int i10, e4.k kVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = r(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        kVar.f14993a = objArr2;
        return i11;
    }

    public final int G(b bVar, int i10, e4.k kVar) {
        int F = F(bVar, this.f39809g, i10, kVar);
        if (F == i10) {
            return i10;
        }
        Object obj = kVar.f14993a;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, F, i10, (Object) null);
        this.f39809g = objArr;
        this.f39810h -= i10 - F;
        return F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (G(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(x0.b r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.f.H(x0.b):boolean");
    }

    public final Object[] I(Object[] objArr, int i10, int i11, e4.k kVar) {
        int V = t.V(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            Object obj = objArr[V];
            Object[] r10 = r(objArr);
            vt.t.f(objArr, V, r10, V + 1, 32);
            r10[31] = kVar.f14993a;
            kVar.f14993a = obj;
            return r10;
        }
        if (objArr[31] == null) {
            i12 = t.V(K() - 1, i10);
        }
        Object[] r11 = r(objArr);
        int i13 = i10 - 5;
        int i14 = V + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj2 = r11[i12];
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                r11[i12] = I((Object[]) obj2, i13, 0, kVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj3 = r11[V];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r11[V] = I((Object[]) obj3, i13, i11, kVar);
        return r11;
    }

    public final Object J(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f39810h - i10;
        if (i13 == 1) {
            Object obj = this.f39809g[0];
            y(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f39809g;
        Object obj2 = objArr2[i12];
        Object[] r10 = r(objArr2);
        vt.t.f(objArr2, i12, r10, i12 + 1, i13);
        r10[i13 - 1] = null;
        this.f39808f = objArr;
        this.f39809g = r10;
        this.f39810h = (i10 + i13) - 1;
        this.f39806d = i11;
        return obj2;
    }

    public final int K() {
        int i10 = this.f39810h;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] L(Object[] objArr, int i10, int i11, Object obj, e4.k kVar) {
        int V = t.V(i11, i10);
        Object[] r10 = r(objArr);
        if (i10 == 0) {
            if (r10 != objArr) {
                ((AbstractList) this).modCount++;
            }
            kVar.f14993a = r10[V];
            r10[V] = obj;
            return r10;
        }
        Object obj2 = r10[V];
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r10[V] = L((Object[]) obj2, i10 - 5, i11, obj, kVar);
        return r10;
    }

    public final void M(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] t10;
        if (i12 >= 1) {
            Object[] r10 = r(objArr);
            objArr2[0] = r10;
            int i13 = i10 & 31;
            int size = ((collection.size() + i10) - 1) & 31;
            int i14 = (i11 - i13) + size;
            if (i14 < 32) {
                vt.t.f(r10, size + 1, objArr3, i13, i11);
            } else {
                int i15 = i14 - 31;
                if (i12 == 1) {
                    t10 = r10;
                } else {
                    t10 = t();
                    i12--;
                    objArr2[i12] = t10;
                }
                int i16 = i11 - i15;
                vt.t.f(r10, 0, objArr3, i16, i11);
                vt.t.f(r10, size + 1, t10, i13, i16);
                objArr3 = t10;
            }
            Iterator it = collection.iterator();
            h(r10, i13, it);
            for (int i17 = 1; i17 < i12; i17++) {
                Object[] t11 = t();
                h(t11, 0, it);
                objArr2[i17] = t11;
            }
            h(objArr3, 0, it);
            return;
        }
        al.d.e1("requires at least one nullBuffer");
        throw null;
    }

    public final int N() {
        int i10 = this.f39810h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        al.d.W(i10, getF38332c());
        if (i10 == getF38332c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int K = K();
        if (i10 >= K) {
            o(obj, this.f39808f, i10 - K);
            return;
        }
        e4.k kVar = new e4.k(null);
        Object[] objArr = this.f39808f;
        Intrinsics.c(objArr);
        o(kVar.f14993a, m(objArr, this.f39806d, i10, obj, kVar), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int N = N();
        Iterator it = collection.iterator();
        if (32 - N >= collection.size()) {
            Object[] r10 = r(this.f39809g);
            h(r10, N, it);
            this.f39809g = r10;
            this.f39810h = collection.size() + this.f39810h;
        } else {
            int size = ((collection.size() + N) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] r11 = r(this.f39809g);
            h(r11, N, it);
            objArr[0] = r11;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] t10 = t();
                h(t10, 0, it);
                objArr[i10] = t10;
            }
            this.f39808f = B(this.f39808f, K(), objArr);
            Object[] t11 = t();
            h(t11, 0, it);
            this.f39809g = t11;
            this.f39810h = collection.size() + this.f39810h;
        }
        return true;
    }

    @Override // vt.l
    /* renamed from: b */
    public final int getF38332c() {
        return this.f39810h;
    }

    @Override // vt.l
    public final Object e(int i10) {
        al.d.U(i10, getF38332c());
        ((AbstractList) this).modCount++;
        int K = K();
        if (i10 >= K) {
            return J(this.f39808f, K, this.f39806d, i10 - K);
        }
        e4.k kVar = new e4.k(this.f39809g[0]);
        Object[] objArr = this.f39808f;
        Intrinsics.c(objArr);
        J(I(objArr, this.f39806d, i10, kVar), K, this.f39806d, 0);
        return kVar.f14993a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a1.b, java.lang.Object] */
    public final w0.c g() {
        w0.c eVar;
        Object[] objArr = this.f39808f;
        if (objArr == this.f39804b && this.f39809g == this.f39805c) {
            eVar = this.f39803a;
        } else {
            this.f39807e = new Object();
            this.f39804b = objArr;
            Object[] objArr2 = this.f39809g;
            this.f39805c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    eVar = j.f39818c;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f39809g, getF38332c());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    eVar = new j(copyOf);
                }
            } else {
                Object[] objArr3 = this.f39808f;
                Intrinsics.c(objArr3);
                eVar = new e(getF38332c(), this.f39806d, objArr3, this.f39809g);
            }
        }
        this.f39803a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        al.d.U(i10, getF38332c());
        if (K() <= i10) {
            objArr = this.f39809g;
        } else {
            objArr = this.f39808f;
            Intrinsics.c(objArr);
            for (int i11 = this.f39806d; i11 > 0; i11 -= 5) {
                Object obj = objArr[t.V(i10, i11)];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f39808f != null) {
            int i13 = i10 >> 5;
            a q10 = q(K() >> 5);
            int i14 = i12;
            Object[] objArr3 = objArr2;
            while (q10.f39794a - 1 != i13) {
                Object[] objArr4 = (Object[]) q10.previous();
                vt.t.f(objArr4, 0, objArr3, 32 - i11, 32);
                objArr3 = s(i11, objArr4);
                i14--;
                objArr[i14] = objArr3;
            }
            Object[] objArr5 = (Object[]) q10.previous();
            int K = i12 - (((K() >> 5) - 1) - i13);
            if (K < i12) {
                objArr2 = objArr[K];
                Intrinsics.c(objArr2);
            }
            M(collection, i10, objArr5, 32, objArr, K, objArr2);
            return;
        }
        throw new IllegalStateException("root is null".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        al.d.W(i10, getF38332c());
        return new h(this, i10);
    }

    public final Object[] m(Object[] objArr, int i10, int i11, Object obj, e4.k kVar) {
        Object obj2;
        int V = t.V(i11, i10);
        if (i10 == 0) {
            kVar.f14993a = objArr[31];
            Object[] r10 = r(objArr);
            vt.t.f(objArr, V + 1, r10, V, 31);
            r10[V] = obj;
            return r10;
        }
        Object[] r11 = r(objArr);
        int i12 = i10 - 5;
        Object obj3 = r11[V];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r11[V] = m((Object[]) obj3, i12, i11, obj, kVar);
        while (true) {
            V++;
            if (V >= 32 || (obj2 = r11[V]) == null) {
                break;
            }
            r11[V] = m((Object[]) obj2, i12, 0, kVar.f14993a, kVar);
        }
        return r11;
    }

    public final void o(Object obj, Object[] objArr, int i10) {
        int N = N();
        Object[] r10 = r(this.f39809g);
        if (N < 32) {
            vt.t.f(this.f39809g, i10 + 1, r10, i10, N);
            r10[i10] = obj;
            this.f39808f = objArr;
            this.f39809g = r10;
            this.f39810h++;
            return;
        }
        Object[] objArr2 = this.f39809g;
        Object obj2 = objArr2[31];
        vt.t.f(objArr2, i10 + 1, r10, i10, 31);
        r10[i10] = obj;
        C(objArr, r10, u(obj2));
    }

    public final boolean p(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f39807e) {
            return true;
        }
        return false;
    }

    public final a q(int i10) {
        Object[] objArr = this.f39808f;
        if (objArr != null) {
            int K = K() >> 5;
            al.d.W(i10, K);
            int i11 = this.f39806d;
            if (i11 == 0) {
                return new i(objArr, i10);
            }
            return new k(objArr, i10, K, i11 / 5);
        }
        throw new IllegalStateException("Invalid root".toString());
    }

    public final Object[] r(Object[] objArr) {
        if (objArr == null) {
            return t();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] t10 = t();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        vt.t.h(objArr, t10, 0, length, 6);
        return t10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return H(new b(1, collection));
    }

    public final Object[] s(int i10, Object[] objArr) {
        if (p(objArr)) {
            vt.t.f(objArr, i10, objArr, 0, 32 - i10);
            return objArr;
        }
        Object[] t10 = t();
        vt.t.f(objArr, i10, t10, 0, 32 - i10);
        return t10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        al.d.U(i10, getF38332c());
        if (K() <= i10) {
            Object[] r10 = r(this.f39809g);
            if (r10 != this.f39809g) {
                ((AbstractList) this).modCount++;
            }
            int i11 = i10 & 31;
            Object obj2 = r10[i11];
            r10[i11] = obj;
            this.f39809g = r10;
            return obj2;
        }
        e4.k kVar = new e4.k(null);
        Object[] objArr = this.f39808f;
        Intrinsics.c(objArr);
        this.f39808f = L(objArr, this.f39806d, i10, obj, kVar);
        return kVar.f14993a;
    }

    public final Object[] t() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f39807e;
        return objArr;
    }

    public final Object[] u(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f39807e;
        return objArr;
    }

    public final Object[] v(int i10, int i11, Object[] objArr) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 == 0) {
                return objArr;
            }
            int V = t.V(i10, i11);
            Object obj = objArr[V];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object v10 = v(i10, i11 - 5, (Object[]) obj);
            if (V < 31) {
                int i12 = V + 1;
                if (objArr[i12] != null) {
                    if (p(objArr)) {
                        Intrinsics.checkNotNullParameter(objArr, "<this>");
                        Arrays.fill(objArr, i12, 32, (Object) null);
                    }
                    Object[] t10 = t();
                    vt.t.f(objArr, 0, t10, 0, i12);
                    objArr = t10;
                }
            }
            if (v10 != objArr[V]) {
                Object[] r10 = r(objArr);
                r10[V] = v10;
                return r10;
            }
            return objArr;
        }
        al.d.e1("shift should be positive");
        throw null;
    }

    public final Object[] w(Object[] objArr, int i10, int i11, e4.k kVar) {
        Object[] w10;
        int V = t.V(i11 - 1, i10);
        if (i10 == 5) {
            kVar.f14993a = objArr[V];
            w10 = null;
        } else {
            Object obj = objArr[V];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            w10 = w((Object[]) obj, i10 - 5, i11, kVar);
        }
        if (w10 == null && V == 0) {
            return null;
        }
        Object[] r10 = r(objArr);
        r10[V] = w10;
        return r10;
    }

    public final void y(int i10, int i11, Object[] objArr) {
        Object obj = null;
        if (i11 == 0) {
            this.f39808f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f39809g = objArr;
            this.f39810h = i10;
            this.f39806d = i11;
            return;
        }
        e4.k kVar = new e4.k(obj);
        Intrinsics.c(objArr);
        Object[] w10 = w(objArr, i11, i10, kVar);
        Intrinsics.c(w10);
        Object obj2 = kVar.f14993a;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f39809g = (Object[]) obj2;
        this.f39810h = i10;
        if (w10[1] == null) {
            this.f39808f = (Object[]) w10[0];
            this.f39806d = i11 - 5;
        } else {
            this.f39808f = w10;
            this.f39806d = i11;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int N = N();
        if (N < 32) {
            Object[] r10 = r(this.f39809g);
            r10[N] = obj;
            this.f39809g = r10;
            this.f39810h = getF38332c() + 1;
        } else {
            C(this.f39808f, this.f39809g, u(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Object[] t10;
        al.d.W(i10, this.f39810h);
        if (i10 == this.f39810h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f39810h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f39809g;
            Object[] r10 = r(objArr);
            vt.t.f(objArr, size2 + 1, r10, i12, N());
            h(r10, i12, collection.iterator());
            this.f39809g = r10;
            this.f39810h = collection.size() + this.f39810h;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int N = N();
        int size3 = collection.size() + this.f39810h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= K()) {
            t10 = t();
            M(collection, i10, this.f39809g, N, objArr2, size, t10);
        } else if (size3 > N) {
            int i13 = size3 - N;
            t10 = s(i13, this.f39809g);
            k(collection, i10, i13, objArr2, size, t10);
        } else {
            Object[] objArr3 = this.f39809g;
            t10 = t();
            int i14 = N - size3;
            vt.t.f(objArr3, 0, t10, i14, N);
            int i15 = 32 - i14;
            Object[] s7 = s(i15, this.f39809g);
            int i16 = size - 1;
            objArr2[i16] = s7;
            k(collection, i10, i15, objArr2, i16, s7);
        }
        this.f39808f = B(this.f39808f, i11, objArr2);
        this.f39809g = t10;
        this.f39810h = collection.size() + this.f39810h;
        return true;
    }
}
