package k3;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22012a = new Object();

    public static boolean a(j3.d dVar) {
        j3.e eVar;
        boolean z10;
        boolean z11;
        int[] iArr = dVar.f20882r0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        j3.d dVar2 = dVar.V;
        if (dVar2 != null) {
            eVar = (j3.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i12 = eVar.f20882r0[0];
        }
        if (eVar != null) {
            int i13 = eVar.f20882r0[1];
        }
        if (i10 != 1 && !dVar.C() && i10 != 2 && ((i10 != 3 || dVar.f20884t != 0 || dVar.Y != s0.g.f34069a || !dVar.v(0)) && (i10 != 3 || dVar.f20884t != 1 || !dVar.w(0, dVar.s())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i11 != 1 && !dVar.D() && i11 != 2 && ((i11 != 3 || dVar.f20885u != 0 || dVar.Y != s0.g.f34069a || !dVar.v(1)) && (i11 != 3 || dVar.f20885u != 1 || !dVar.w(1, dVar.m())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (dVar.Y > s0.g.f34069a && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, k3.b] */
    public static void b(int i10, j3.d dVar, c cVar, boolean z10) {
        boolean z11;
        j3.c cVar2;
        j3.c cVar3;
        char c10;
        j3.c cVar4;
        j3.c cVar5;
        if (dVar.f20875o) {
            return;
        }
        if (!(dVar instanceof j3.e) && dVar.B() && a(dVar)) {
            j3.e.c0(dVar, cVar, new Object());
        }
        j3.c k10 = dVar.k(2);
        j3.c k11 = dVar.k(4);
        int d10 = k10.d();
        int d11 = k11.d();
        HashSet hashSet = k10.f20839a;
        char c11 = 0;
        if (hashSet != null && k10.f20841c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j3.c cVar6 = (j3.c) it.next();
                j3.d dVar2 = cVar6.f20842d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.B() && a10) {
                    j3.e.c0(dVar2, cVar, new Object());
                }
                j3.c cVar7 = dVar2.K;
                j3.c cVar8 = dVar2.M;
                if ((cVar6 == cVar7 && (cVar5 = cVar8.f20844f) != null && cVar5.f20841c) || (cVar6 == cVar8 && (cVar4 = cVar7.f20844f) != null && cVar4.f20841c)) {
                    c10 = 1;
                } else {
                    c10 = c11;
                }
                int i12 = dVar2.f20882r0[c11];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.f20888x >= 0 && dVar2.f20887w >= 0 && ((dVar2.f20865i0 == 8 || (dVar2.f20884t == 0 && dVar2.Y == s0.g.f34069a)) && !dVar2.z() && !dVar2.H && c10 != 0 && !dVar2.z())) {
                        d(i11, dVar, cVar, dVar2, z10);
                    }
                } else if (!dVar2.B()) {
                    if (cVar6 == cVar7 && cVar8.f20844f == null) {
                        int e10 = cVar7.e() + d10;
                        dVar2.M(e10, dVar2.s() + e10);
                        b(i11, dVar2, cVar, z10);
                    } else if (cVar6 == cVar8 && cVar7.f20844f == null) {
                        int e11 = d10 - cVar8.e();
                        dVar2.M(e11 - dVar2.s(), e11);
                        b(i11, dVar2, cVar, z10);
                    } else if (c10 != 0 && !dVar2.z()) {
                        c(i11, dVar2, cVar, z10);
                    }
                }
                c11 = 0;
            }
        }
        if (dVar instanceof j3.h) {
            return;
        }
        HashSet hashSet2 = k11.f20839a;
        if (hashSet2 != null && k11.f20841c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                j3.c cVar9 = (j3.c) it2.next();
                j3.d dVar3 = cVar9.f20842d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.B() && a11) {
                    j3.e.c0(dVar3, cVar, new Object());
                }
                j3.c cVar10 = dVar3.K;
                j3.c cVar11 = dVar3.M;
                if ((cVar9 == cVar10 && (cVar3 = cVar11.f20844f) != null && cVar3.f20841c) || (cVar9 == cVar11 && (cVar2 = cVar10.f20844f) != null && cVar2.f20841c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = dVar3.f20882r0[0];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.f20888x >= 0 && dVar3.f20887w >= 0) {
                        if (dVar3.f20865i0 != 8) {
                            if (dVar3.f20884t == 0) {
                                if (dVar3.Y == s0.g.f34069a) {
                                }
                            }
                        }
                        if (!dVar3.z() && !dVar3.H && z11 && !dVar3.z()) {
                            d(i13, dVar, cVar, dVar3, z10);
                        }
                    }
                } else if (!dVar3.B()) {
                    if (cVar9 == cVar10 && cVar11.f20844f == null) {
                        int e12 = cVar10.e() + d11;
                        dVar3.M(e12, dVar3.s() + e12);
                        b(i13, dVar3, cVar, z10);
                    } else if (cVar9 == cVar11 && cVar10.f20844f == null) {
                        int e13 = d11 - cVar11.e();
                        dVar3.M(e13 - dVar3.s(), e13);
                        b(i13, dVar3, cVar, z10);
                    } else if (z11 && !dVar3.z()) {
                        c(i13, dVar3, cVar, z10);
                    }
                }
            }
        }
        dVar.f20875o = true;
    }

    public static void c(int i10, j3.d dVar, c cVar, boolean z10) {
        float f10;
        float f11 = dVar.f20859f0;
        j3.c cVar2 = dVar.K;
        int d10 = cVar2.f20844f.d();
        j3.c cVar3 = dVar.M;
        int d11 = cVar3.f20844f.d();
        int e10 = cVar2.e() + d10;
        int e11 = d11 - cVar3.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int s7 = dVar.s();
        int i11 = (d11 - d10) - s7;
        if (d10 > d11) {
            i11 = (d10 - d11) - s7;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + s7;
        if (d10 > d11) {
            i13 = i12 - s7;
        }
        dVar.M(i12, i13);
        b(i10 + 1, dVar, cVar, z10);
    }

    public static void d(int i10, j3.d dVar, c cVar, j3.d dVar2, boolean z10) {
        int s7;
        float f10 = dVar2.f20859f0;
        j3.c cVar2 = dVar2.K;
        int e10 = cVar2.e() + cVar2.f20844f.d();
        j3.c cVar3 = dVar2.M;
        int d10 = cVar3.f20844f.d() - cVar3.e();
        if (d10 >= e10) {
            int s10 = dVar2.s();
            if (dVar2.f20865i0 != 8) {
                int i11 = dVar2.f20884t;
                if (i11 == 2) {
                    if (dVar instanceof j3.e) {
                        s7 = dVar.s();
                    } else {
                        s7 = dVar.V.s();
                    }
                    s10 = (int) (dVar2.f20859f0 * 0.5f * s7);
                } else if (i11 == 0) {
                    s10 = d10 - e10;
                }
                s10 = Math.max(dVar2.f20887w, s10);
                int i12 = dVar2.f20888x;
                if (i12 > 0) {
                    s10 = Math.min(i12, s10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - s10)) + 0.5f));
            dVar2.M(i13, s10 + i13);
            b(i10 + 1, dVar2, cVar, z10);
        }
    }

    public static void e(int i10, j3.d dVar, c cVar) {
        float f10;
        float f11 = dVar.f20861g0;
        j3.c cVar2 = dVar.L;
        int d10 = cVar2.f20844f.d();
        j3.c cVar3 = dVar.N;
        int d11 = cVar3.f20844f.d();
        int e10 = cVar2.e() + d10;
        int e11 = d11 - cVar3.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int m10 = dVar.m();
        int i11 = (d11 - d10) - m10;
        if (d10 > d11) {
            i11 = (d10 - d11) - m10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + m10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - m10;
        }
        dVar.N(i13, i14);
        g(i10 + 1, dVar, cVar);
    }

    public static void f(int i10, j3.d dVar, c cVar, j3.d dVar2) {
        int m10;
        float f10 = dVar2.f20861g0;
        j3.c cVar2 = dVar2.L;
        int e10 = cVar2.e() + cVar2.f20844f.d();
        j3.c cVar3 = dVar2.N;
        int d10 = cVar3.f20844f.d() - cVar3.e();
        if (d10 >= e10) {
            int m11 = dVar2.m();
            if (dVar2.f20865i0 != 8) {
                int i11 = dVar2.f20885u;
                if (i11 == 2) {
                    if (dVar instanceof j3.e) {
                        m10 = dVar.m();
                    } else {
                        m10 = dVar.V.m();
                    }
                    m11 = (int) (f10 * 0.5f * m10);
                } else if (i11 == 0) {
                    m11 = d10 - e10;
                }
                m11 = Math.max(dVar2.f20890z, m11);
                int i12 = dVar2.A;
                if (i12 > 0) {
                    m11 = Math.min(i12, m11);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - m11)) + 0.5f));
            dVar2.N(i13, m11 + i13);
            g(i10 + 1, dVar2, cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, k3.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k3.b] */
    public static void g(int i10, j3.d dVar, c cVar) {
        j3.c cVar2;
        boolean z10;
        j3.c cVar3;
        j3.c cVar4;
        boolean z11;
        j3.c cVar5;
        j3.c cVar6;
        if (dVar.f20877p) {
            return;
        }
        if (!(dVar instanceof j3.e) && dVar.B() && a(dVar)) {
            j3.e.c0(dVar, cVar, new Object());
        }
        j3.c k10 = dVar.k(3);
        j3.c k11 = dVar.k(5);
        int d10 = k10.d();
        int d11 = k11.d();
        HashSet hashSet = k10.f20839a;
        if (hashSet != null && k10.f20841c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j3.c cVar7 = (j3.c) it.next();
                j3.d dVar2 = cVar7.f20842d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.B() && a10) {
                    j3.e.c0(dVar2, cVar, new Object());
                }
                j3.c cVar8 = dVar2.L;
                j3.c cVar9 = dVar2.N;
                if ((cVar7 == cVar8 && (cVar6 = cVar9.f20844f) != null && cVar6.f20841c) || (cVar7 == cVar9 && (cVar5 = cVar8.f20844f) != null && cVar5.f20841c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = dVar2.f20882r0[1];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.A >= 0 && dVar2.f20890z >= 0 && (dVar2.f20865i0 == 8 || (dVar2.f20885u == 0 && dVar2.Y == s0.g.f34069a))) {
                        if (!dVar2.A() && !dVar2.H && z11 && !dVar2.A()) {
                            f(i11, dVar, cVar, dVar2);
                        }
                    }
                } else if (!dVar2.B()) {
                    if (cVar7 == cVar8 && cVar9.f20844f == null) {
                        int e10 = cVar8.e() + d10;
                        dVar2.N(e10, dVar2.m() + e10);
                        g(i11, dVar2, cVar);
                    } else if (cVar7 == cVar9 && cVar8.f20844f == null) {
                        int e11 = d10 - cVar9.e();
                        dVar2.N(e11 - dVar2.m(), e11);
                        g(i11, dVar2, cVar);
                    } else if (z11 && !dVar2.A()) {
                        e(i11, dVar2, cVar);
                    }
                }
            }
        }
        if (dVar instanceof j3.h) {
            return;
        }
        HashSet hashSet2 = k11.f20839a;
        if (hashSet2 != null && k11.f20841c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                j3.c cVar10 = (j3.c) it2.next();
                j3.d dVar3 = cVar10.f20842d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.B() && a11) {
                    j3.e.c0(dVar3, cVar, new Object());
                }
                j3.c cVar11 = dVar3.L;
                j3.c cVar12 = dVar3.N;
                if ((cVar10 == cVar11 && (cVar4 = cVar12.f20844f) != null && cVar4.f20841c) || (cVar10 == cVar12 && (cVar3 = cVar11.f20844f) != null && cVar3.f20841c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = dVar3.f20882r0[1];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.A >= 0 && dVar3.f20890z >= 0) {
                        if (dVar3.f20865i0 != 8) {
                            if (dVar3.f20885u == 0) {
                                if (dVar3.Y == s0.g.f34069a) {
                                }
                            }
                        }
                        if (!dVar3.A() && !dVar3.H && z10 && !dVar3.A()) {
                            f(i13, dVar, cVar, dVar3);
                        }
                    }
                } else if (!dVar3.B()) {
                    if (cVar10 == cVar11 && cVar12.f20844f == null) {
                        int e12 = cVar11.e() + d11;
                        dVar3.N(e12, dVar3.m() + e12);
                        g(i13, dVar3, cVar);
                    } else if (cVar10 == cVar12 && cVar11.f20844f == null) {
                        int e13 = d11 - cVar12.e();
                        dVar3.N(e13 - dVar3.m(), e13);
                        g(i13, dVar3, cVar);
                    } else if (z10 && !dVar3.A()) {
                        e(i13, dVar3, cVar);
                    }
                }
            }
        }
        j3.c k12 = dVar.k(6);
        if (k12.f20839a != null && k12.f20841c) {
            int d12 = k12.d();
            Iterator it3 = k12.f20839a.iterator();
            while (it3.hasNext()) {
                j3.c cVar13 = (j3.c) it3.next();
                j3.d dVar4 = cVar13.f20842d;
                int i15 = i10 + 1;
                boolean a12 = a(dVar4);
                if (dVar4.B() && a12) {
                    j3.e.c0(dVar4, cVar, new Object());
                }
                if (dVar4.f20882r0[1] != 3 || a12) {
                    if (!dVar4.B() && cVar13 == (cVar2 = dVar4.O)) {
                        int e14 = cVar13.e() + d12;
                        if (dVar4.G) {
                            int i16 = e14 - dVar4.f20853c0;
                            int i17 = dVar4.X + i16;
                            dVar4.f20851b0 = i16;
                            dVar4.L.l(i16);
                            dVar4.N.l(i17);
                            cVar2.l(e14);
                            dVar4.f20874n = true;
                        }
                        g(i15, dVar4, cVar);
                    }
                }
            }
        }
        dVar.f20877p = true;
    }
}
