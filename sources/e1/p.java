package e1;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.i3;
import t0.q3;
import vt.i0;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final i3 f14904a = new i3();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14905b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static n f14906c;

    /* renamed from: d, reason: collision with root package name */
    public static int f14907d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f14908e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f14909f;

    /* renamed from: g, reason: collision with root package name */
    public static List f14910g;

    /* renamed from: h, reason: collision with root package name */
    public static List f14911h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f14912i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f14913j;

    /* renamed from: k, reason: collision with root package name */
    public static final t0.g f14914k;

    /* JADX WARN: Type inference failed for: r0v8, types: [t0.g, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, e1.w] */
    static {
        n nVar = n.f14896e;
        f14906c = nVar;
        f14907d = 1;
        ?? obj = new Object();
        obj.f14886b = new int[16];
        obj.f14887c = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        obj.f14888d = iArr;
        f14908e = obj;
        ?? obj2 = new Object();
        obj2.f14943b = new int[16];
        obj2.f14944c = new q3[16];
        f14909f = obj2;
        i0 i0Var = i0.f38321a;
        f14910g = i0Var;
        f14911h = i0Var;
        int i12 = f14907d;
        f14907d = i12 + 1;
        b bVar = new b(i12, nVar);
        f14906c = f14906c.i(bVar.f14881b);
        AtomicReference atomicReference = new AtomicReference(bVar);
        f14912i = atomicReference;
        f14913j = (i) atomicReference.get();
        f14914k = new AtomicInteger(0);
    }

    public static final Function1 a(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && !Intrinsics.a(function1, function12)) {
            return new a(function1, function12, 3);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final HashMap b(c cVar, c cVar2, n nVar) {
        a0 q10;
        v0.c w10 = cVar2.w();
        int d10 = cVar.d();
        if (w10 == null) {
            return null;
        }
        n h10 = cVar2.e().i(cVar2.d()).h(cVar2.f14852k);
        Object[] objArr = w10.f37645b;
        int i10 = w10.f37644a;
        HashMap hashMap = null;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            y yVar = (y) obj;
            a0 b10 = yVar.b();
            a0 q11 = q(b10, d10, nVar);
            if (q11 != null && (q10 = q(b10, d10, h10)) != null && !Intrinsics.a(q11, q10)) {
                a0 q12 = q(b10, cVar2.d(), cVar2.e());
                if (q12 != null) {
                    a0 h11 = yVar.h(q10, q11, q12);
                    if (h11 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(q11, h11);
                    hashMap = hashMap;
                } else {
                    p();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void c(i iVar) {
        c cVar;
        Object obj;
        int i10;
        if (!f14906c.g(iVar.d())) {
            StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
            sb2.append(iVar.d());
            sb2.append(", disposed=");
            sb2.append(iVar.f14882c);
            sb2.append(", applied=");
            if (iVar instanceof c) {
                cVar = (c) iVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                obj = Boolean.valueOf(cVar.f14855n);
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (f14905b) {
                l lVar = f14908e;
                if (lVar.f14885a > 0) {
                    i10 = lVar.f14886b[0];
                } else {
                    i10 = -1;
                }
            }
            sb2.append(i10);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final n d(int i10, int i11, n nVar) {
        while (i10 < i11) {
            nVar = nVar.i(i10);
            i10++;
        }
        return nVar;
    }

    public static final Object e(Function1 function1) {
        Object obj;
        v0.c cVar;
        Object t10;
        i iVar = f14913j;
        Intrinsics.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f14905b) {
            try {
                obj = f14912i.get();
                cVar = ((b) obj).f14850i;
                if (cVar != null) {
                    f14914k.addAndGet(1);
                }
                t10 = t((i) obj, function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            try {
                List list = f14910g;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Function2) list.get(i10)).invoke(cVar, obj);
                }
            } finally {
                f14914k.addAndGet(-1);
            }
        }
        synchronized (f14905b) {
            try {
                f();
                if (cVar != null) {
                    Object[] objArr = cVar.f37645b;
                    int i11 = cVar.f37644a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        Object obj2 = objArr[i12];
                        Intrinsics.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        o((y) obj2);
                    }
                    Unit unit = Unit.f23355a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t10;
    }

    public static final void f() {
        w wVar = f14909f;
        int i10 = wVar.f14942a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            Object obj = null;
            if (i11 >= i10) {
                break;
            }
            q3 q3Var = wVar.f14944c[i11];
            if (q3Var != null) {
                obj = q3Var.get();
            }
            if (obj != null && !(!n((y) obj))) {
                if (i12 != i11) {
                    wVar.f14944c[i12] = q3Var;
                    int[] iArr = wVar.f14943b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            wVar.f14944c[i13] = null;
            wVar.f14943b[i13] = 0;
        }
        if (i12 != i10) {
            wVar.f14942a = i12;
        }
    }

    public static final i g(i iVar, Function1 function1, boolean z10) {
        c cVar;
        boolean z11 = iVar instanceof c;
        if (!z11 && iVar != null) {
            return new e0(iVar, function1, z10);
        }
        if (z11) {
            cVar = (c) iVar;
        } else {
            cVar = null;
        }
        return new d0(cVar, function1, null, false, z10);
    }

    public static final a0 h(a0 a0Var) {
        a0 q10;
        i i10 = i();
        a0 q11 = q(a0Var, i10.d(), i10.e());
        if (q11 == null) {
            synchronized (f14905b) {
                i i11 = i();
                q10 = q(a0Var, i11.d(), i11.e());
            }
            if (q10 != null) {
                return q10;
            }
            p();
            throw null;
        }
        return q11;
    }

    public static final i i() {
        i iVar = (i) f14904a.a();
        if (iVar == null) {
            return (i) f14912i.get();
        }
        return iVar;
    }

    public static final Function1 j(Function1 function1, Function1 function12, boolean z10) {
        if (!z10) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !Intrinsics.a(function1, function12)) {
            return new a(function1, function12, 2);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e1.a0 k(e1.a0 r12, e1.y r13) {
        /*
            e1.a0 r0 = r13.b()
            int r1 = e1.p.f14907d
            e1.l r2 = e1.p.f14908e
            int r3 = r2.f14885a
            r4 = 0
            if (r3 <= 0) goto L11
            int[] r1 = r2.f14886b
            r1 = r1[r4]
        L11:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L15:
            if (r0 == 0) goto L57
            int r6 = r0.f14841a
            if (r6 != 0) goto L1d
        L1b:
            r3 = r0
            goto L57
        L1d:
            if (r6 == 0) goto L54
            if (r6 > r1) goto L54
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L35
            if (r6 >= r11) goto L35
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L44
        L33:
            r6 = r2
            goto L45
        L35:
            if (r6 < r11) goto L44
            r11 = 128(0x80, float:1.8E-43)
            if (r6 >= r11) goto L44
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L44
            goto L33
        L44:
            r6 = r4
        L45:
            if (r6 != 0) goto L54
            if (r5 != 0) goto L4b
            r5 = r0
            goto L54
        L4b:
            int r1 = r0.f14841a
            int r2 = r5.f14841a
            if (r1 >= r2) goto L52
            goto L1b
        L52:
            r3 = r5
            goto L57
        L54:
            e1.a0 r0 = r0.f14842b
            goto L15
        L57:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L5f
            r3.f14841a = r0
            goto L6e
        L5f:
            e1.a0 r3 = r12.b()
            r3.f14841a = r0
            e1.a0 r12 = r13.b()
            r3.f14842b = r12
            r13.e(r3)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.p.k(e1.a0, e1.y):e1.a0");
    }

    public static final void l(i iVar, y yVar) {
        iVar.s(iVar.h() + 1);
        Function1 i10 = iVar.i();
        if (i10 != null) {
            i10.invoke(yVar);
        }
    }

    public static final a0 m(a0 a0Var, y yVar, i iVar, a0 a0Var2) {
        a0 k10;
        if (iVar.g()) {
            iVar.n(yVar);
        }
        int d10 = iVar.d();
        if (a0Var2.f14841a == d10) {
            return a0Var2;
        }
        synchronized (f14905b) {
            k10 = k(a0Var, yVar);
        }
        k10.f14841a = d10;
        iVar.n(yVar);
        return k10;
    }

    public static final boolean n(y yVar) {
        a0 a0Var;
        int i10 = f14907d;
        l lVar = f14908e;
        if (lVar.f14885a > 0) {
            i10 = lVar.f14886b[0];
        }
        a0 a0Var2 = null;
        a0 a0Var3 = null;
        int i11 = 0;
        for (a0 b10 = yVar.b(); b10 != null; b10 = b10.f14842b) {
            int i12 = b10.f14841a;
            if (i12 != 0) {
                if (i12 < i10) {
                    if (a0Var2 == null) {
                        i11++;
                        a0Var2 = b10;
                    } else {
                        if (i12 < a0Var2.f14841a) {
                            a0Var = a0Var2;
                            a0Var2 = b10;
                        } else {
                            a0Var = b10;
                        }
                        if (a0Var3 == null) {
                            a0Var3 = yVar.b();
                            a0 a0Var4 = a0Var3;
                            while (true) {
                                if (a0Var3 != null) {
                                    int i13 = a0Var3.f14841a;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (a0Var4.f14841a < i13) {
                                        a0Var4 = a0Var3;
                                    }
                                    a0Var3 = a0Var3.f14842b;
                                } else {
                                    a0Var3 = a0Var4;
                                    break;
                                }
                            }
                        }
                        a0Var2.f14841a = 0;
                        a0Var2.a(a0Var3);
                        a0Var2 = a0Var;
                    }
                } else {
                    i11++;
                }
            }
        }
        if (i11 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(y yVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (n(yVar)) {
            w wVar = f14909f;
            int i10 = wVar.f14942a;
            int identityHashCode = System.identityHashCode(yVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = wVar.f14942a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = wVar.f14943b[i14];
                        if (i15 < identityHashCode) {
                            i13 = i14 + 1;
                        } else if (i15 > identityHashCode) {
                            i12 = i14 - 1;
                        } else {
                            q3 q3Var = wVar.f14944c[i14];
                            if (q3Var != null) {
                                obj = q3Var.get();
                            } else {
                                obj = null;
                            }
                            if (yVar == obj) {
                                i11 = i14;
                            } else {
                                int i16 = i14 - 1;
                                while (-1 < i16 && wVar.f14943b[i16] == identityHashCode) {
                                    q3 q3Var2 = wVar.f14944c[i16];
                                    if (q3Var2 != null) {
                                        obj3 = q3Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == yVar) {
                                        break;
                                    } else {
                                        i16--;
                                    }
                                }
                                int i17 = wVar.f14942a;
                                i16 = i14 + 1;
                                while (true) {
                                    if (i16 < i17) {
                                        if (wVar.f14943b[i16] != identityHashCode) {
                                            i16 = -(i16 + 1);
                                            break;
                                        }
                                        q3 q3Var3 = wVar.f14944c[i16];
                                        if (q3Var3 != null) {
                                            obj2 = q3Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == yVar) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    } else {
                                        i16 = -(wVar.f14942a + 1);
                                        break;
                                    }
                                }
                                i11 = i16;
                            }
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            q3[] q3VarArr = wVar.f14944c;
            int length = q3VarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                q3[] q3VarArr2 = new q3[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                vt.t.f(q3VarArr, i20, q3VarArr2, i18, i10);
                vt.t.h(wVar.f14944c, q3VarArr2, 0, i18, 6);
                vt.t.c(i20, i18, i10, wVar.f14943b, iArr);
                vt.t.g(wVar.f14943b, iArr, 0, i18, 6);
                wVar.f14944c = q3VarArr2;
                wVar.f14943b = iArr;
            } else {
                int i21 = i18 + 1;
                vt.t.f(q3VarArr, i21, q3VarArr, i18, i10);
                int[] iArr2 = wVar.f14943b;
                vt.t.c(i21, i18, i10, iArr2, iArr2);
            }
            wVar.f14944c[i18] = new WeakReference(yVar);
            wVar.f14943b[i18] = identityHashCode;
            wVar.f14942a++;
        }
    }

    public static final void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final a0 q(a0 a0Var, int i10, n nVar) {
        a0 a0Var2 = null;
        while (a0Var != null) {
            int i11 = a0Var.f14841a;
            if (i11 != 0 && i11 <= i10 && !nVar.g(i11) && (a0Var2 == null || a0Var2.f14841a < a0Var.f14841a)) {
                a0Var2 = a0Var;
            }
            a0Var = a0Var.f14842b;
        }
        if (a0Var2 == null) {
            return null;
        }
        return a0Var2;
    }

    public static final a0 r(a0 a0Var, y yVar) {
        a0 q10;
        i i10 = i();
        Function1 f10 = i10.f();
        if (f10 != null) {
            f10.invoke(yVar);
        }
        a0 q11 = q(a0Var, i10.d(), i10.e());
        if (q11 == null) {
            synchronized (f14905b) {
                i i11 = i();
                a0 b10 = yVar.b();
                Intrinsics.d(b10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                q10 = q(b10, i11.d(), i11.e());
                if (q10 == null) {
                    p();
                    throw null;
                }
            }
            return q10;
        }
        return q11;
    }

    public static final void s(int i10) {
        int i11;
        l lVar = f14908e;
        int i12 = lVar.f14888d[i10];
        lVar.b(i12, lVar.f14885a - 1);
        lVar.f14885a--;
        int[] iArr = lVar.f14886b;
        int i13 = iArr[i12];
        int i14 = i12;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (iArr[i15] <= i13) {
                break;
            }
            lVar.b(i15, i14);
            i14 = i15;
        }
        int[] iArr2 = lVar.f14886b;
        int i16 = lVar.f14885a >> 1;
        while (i12 < i16) {
            int i17 = (i12 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < lVar.f14885a && (i11 = iArr2[i17]) < iArr2[i18]) {
                if (i11 >= iArr2[i12]) {
                    break;
                }
                lVar.b(i17, i12);
                i12 = i17;
            } else {
                if (iArr2[i18] >= iArr2[i12]) {
                    break;
                }
                lVar.b(i18, i12);
                i12 = i18;
            }
        }
        lVar.f14888d[i10] = lVar.f14889e;
        lVar.f14889e = i10;
    }

    public static final Object t(i iVar, Function1 function1) {
        Object invoke = function1.invoke(f14906c.e(iVar.d()));
        synchronized (f14905b) {
            int i10 = f14907d;
            f14907d = i10 + 1;
            n e10 = f14906c.e(iVar.d());
            f14906c = e10;
            f14912i.set(new b(i10, e10));
            iVar.c();
            f14906c = f14906c.i(i10);
            Unit unit = Unit.f23355a;
        }
        return invoke;
    }

    public static final a0 u(r rVar, y yVar, i iVar) {
        a0 k10;
        if (iVar.g()) {
            iVar.n(yVar);
        }
        a0 q10 = q(rVar, iVar.d(), iVar.e());
        if (q10 != null) {
            if (q10.f14841a == iVar.d()) {
                return q10;
            }
            synchronized (f14905b) {
                k10 = k(q10, yVar);
                k10.a(q10);
                k10.f14841a = iVar.d();
            }
            iVar.n(yVar);
            return k10;
        }
        p();
        throw null;
    }
}
