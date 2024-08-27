package x0;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f39799b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f39800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39801d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39802e;

    public e(int i10, int i11, Object[] objArr, Object[] objArr2) {
        boolean z10;
        this.f39799b = objArr;
        this.f39800c = objArr2;
        this.f39801d = i10;
        this.f39802e = i11;
        if (b() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = objArr2.length;
            return;
        }
        al.d.e1("Trie-based persistent vector should have at least 33 elements, got " + b());
        throw null;
    }

    public static Object[] g(Object[] objArr, int i10, int i11, Object obj, e4.k kVar) {
        Object[] copyOf;
        int V = t.V(i11, i10);
        if (i10 == 0) {
            if (V == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            vt.t.f(objArr, V + 1, copyOf, V, 31);
            kVar.f14993a = objArr[31];
            copyOf[V] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[V];
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[V] = g((Object[]) obj2, i12, i11, obj, kVar);
        while (true) {
            V++;
            if (V >= 32 || copyOf2[V] == null) {
                break;
            }
            Object obj3 = objArr[V];
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[V] = g((Object[]) obj3, i12, 0, kVar.f14993a, kVar);
        }
        return copyOf2;
    }

    public static Object[] i(Object[] objArr, int i10, int i11, e4.k kVar) {
        Object[] i12;
        int V = t.V(i11, i10);
        if (i10 == 5) {
            kVar.f14993a = objArr[V];
            i12 = null;
        } else {
            Object obj = objArr[V];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            i12 = i((Object[]) obj, i10 - 5, i11, kVar);
        }
        if (i12 == null && V == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[V] = i12;
        return copyOf;
    }

    public static Object[] r(int i10, int i11, Object obj, Object[] objArr) {
        int V = t.V(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[V] = obj;
        } else {
            Object obj2 = copyOf[V];
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[V] = r(i10 - 5, i11, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    @Override // w0.c
    public final w0.c a(b bVar) {
        f l10 = l();
        l10.H(bVar);
        return l10.g();
    }

    @Override // java.util.Collection, java.util.List, w0.c
    public final w0.c add(Object obj) {
        int q10 = q();
        int i10 = this.f39801d;
        int i11 = i10 - q10;
        Object[] objArr = this.f39799b;
        Object[] objArr2 = this.f39800c;
        if (i11 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i11] = obj;
            return new e(i10 + 1, this.f39802e, objArr, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return k(objArr, objArr2, objArr3);
    }

    @Override // vt.b
    public final int b() {
        return this.f39801d;
    }

    @Override // w0.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f l() {
        return new f(this, this.f39799b, this.f39800c, this.f39802e);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        al.d.U(i10, b());
        if (q() <= i10) {
            objArr = this.f39800c;
        } else {
            objArr = this.f39799b;
            for (int i11 = this.f39802e; i11 > 0; i11 -= 5) {
                Object obj = objArr[t.V(i10, i11)];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final e h(Object obj, Object[] objArr, int i10) {
        int q10 = q();
        int i11 = this.f39801d;
        int i12 = i11 - q10;
        Object[] objArr2 = this.f39800c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i12 < 32) {
            vt.t.f(objArr2, i10 + 1, copyOf, i10, i12);
            copyOf[i10] = obj;
            return new e(i11 + 1, this.f39802e, objArr, copyOf);
        }
        Object obj2 = objArr2[31];
        vt.t.f(objArr2, i10 + 1, copyOf, i10, i12 - 1);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return k(objArr, copyOf, objArr3);
    }

    @Override // w0.c
    public final w0.c j(int i10) {
        al.d.U(i10, this.f39801d);
        int q10 = q();
        Object[] objArr = this.f39799b;
        int i11 = this.f39802e;
        if (i10 >= q10) {
            return p(objArr, q10, i11, i10 - q10);
        }
        return p(o(objArr, i11, i10, new e4.k(this.f39800c[0])), q10, i11, 0);
    }

    public final e k(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f39801d;
        int i11 = i10 >> 5;
        int i12 = this.f39802e;
        if (i11 > (1 << i12)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i13 = i12 + 5;
            return new e(i10 + 1, i13, m(i13, objArr4, objArr2), objArr3);
        }
        return new e(i10 + 1, i12, m(i12, objArr, objArr2), objArr3);
    }

    @Override // vt.d, java.util.List
    public final ListIterator listIterator(int i10) {
        al.d.W(i10, b());
        return new g(this.f39799b, i10, this.f39800c, b(), (this.f39802e / 5) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] m(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.b()
            int r0 = r0 + (-1)
            int r0 = t0.t.V(r0, r4)
            r1 = 32
            if (r5 == 0) goto L19
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            if (r5 != 0) goto L1b
        L19:
            java.lang.Object[] r5 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r4 != r1) goto L21
            r5[r0] = r6
            goto L2c
        L21:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r4 = r3.m(r4, r2, r6)
            r5[r0] = r4
        L2c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.m(int, java.lang.Object[], java.lang.Object[]):java.lang.Object[]");
    }

    public final Object[] o(Object[] objArr, int i10, int i11, e4.k kVar) {
        Object[] copyOf;
        int V = t.V(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            if (V == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            vt.t.f(objArr, V, copyOf, V + 1, 32);
            copyOf[31] = kVar.f14993a;
            kVar.f14993a = objArr[V];
            return copyOf;
        }
        if (objArr[31] == null) {
            i12 = t.V(q() - 1, i10);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        int i14 = V + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj = copyOf2[i12];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i12] = o((Object[]) obj, i13, 0, kVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf2[V];
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[V] = o((Object[]) obj2, i13, i11, kVar);
        return copyOf2;
    }

    public final c p(Object[] objArr, int i10, int i11, int i12) {
        e eVar;
        int i13 = this.f39801d - i10;
        Object obj = null;
        if (i13 == 1) {
            if (i11 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                }
                return new j(objArr);
            }
            e4.k kVar = new e4.k(obj);
            Object[] i14 = i(objArr, i11, i10 - 1, kVar);
            Intrinsics.c(i14);
            Object obj2 = kVar.f14993a;
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj2;
            if (i14[1] == null) {
                Object obj3 = i14[0];
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                eVar = new e(i10, i11 - 5, (Object[]) obj3, objArr2);
            } else {
                eVar = new e(i10, i11, i14, objArr2);
            }
            return eVar;
        }
        Object[] objArr3 = this.f39800c;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int i15 = i13 - 1;
        if (i12 < i15) {
            vt.t.f(objArr3, i12, copyOf, i12 + 1, i13);
        }
        copyOf[i15] = null;
        return new e((i10 + i13) - 1, i11, objArr, copyOf);
    }

    public final int q() {
        return (this.f39801d - 1) & (-32);
    }

    @Override // vt.d, java.util.List
    public final w0.c set(int i10, Object obj) {
        int i11 = this.f39801d;
        al.d.U(i10, i11);
        int q10 = q();
        Object[] objArr = this.f39799b;
        Object[] objArr2 = this.f39800c;
        int i12 = this.f39802e;
        if (q10 <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i10 & 31] = obj;
            return new e(i11, i12, objArr, copyOf);
        }
        return new e(i11, i12, r(i12, i10, obj, objArr), objArr2);
    }

    @Override // java.util.List, w0.c
    public final w0.c add(int i10, Object obj) {
        int i11 = this.f39801d;
        al.d.W(i10, i11);
        if (i10 == i11) {
            return add(obj);
        }
        int q10 = q();
        Object[] objArr = this.f39799b;
        if (i10 >= q10) {
            return h(obj, objArr, i10 - q10);
        }
        e4.k kVar = new e4.k(null);
        return h(kVar.f14993a, g(objArr, this.f39802e, i10, obj, kVar), 0);
    }
}
