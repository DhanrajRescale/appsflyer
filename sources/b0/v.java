package b0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.d f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3022b;

    public v(g1.d dVar, boolean z10) {
        this.f3021a = dVar;
        this.f3022b = z10;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        long a10;
        a2.n0 n0;
        int i10;
        int i11;
        p pVar;
        p pVar2;
        p pVar3;
        int max;
        int max2;
        a2.a1 a1Var;
        a2.n0 n02;
        a2.n0 n03;
        if (list.isEmpty()) {
            n03 = o0Var.n0(w2.a.j(j10), w2.a.i(j10), vt.p0.d(), q.f2975c);
            return n03;
        }
        if (this.f3022b) {
            a10 = j10;
        } else {
            a10 = w2.a.a(j10, 0, 0, 0, 0, 10);
        }
        if (list.size() == 1) {
            a2.l0 l0Var = (a2.l0) list.get(0);
            Object a11 = l0Var.a();
            if (a11 instanceof p) {
                pVar3 = (p) a11;
            } else {
                pVar3 = null;
            }
            if (pVar3 != null && pVar3.f2970o) {
                int j11 = w2.a.j(j10);
                int i12 = w2.a.i(j10);
                int j12 = w2.a.j(j10);
                int i13 = w2.a.i(j10);
                if (j12 >= 0 && i13 >= 0) {
                    max = j11;
                    max2 = i12;
                    a1Var = l0Var.E(hl.f.Q(j12, j12, i13, i13));
                } else {
                    yk.j.A1("width(" + j12 + ") and height(" + i13 + ") must be >= 0");
                    throw null;
                }
            } else {
                a2.a1 E = l0Var.E(a10);
                max = Math.max(w2.a.j(j10), E.f29a);
                max2 = Math.max(w2.a.i(j10), E.f30b);
                a1Var = E;
            }
            n02 = o0Var.n0(max, max2, vt.p0.d(), new t(a1Var, l0Var, o0Var, max, max2, this));
            return n02;
        }
        a2.a1[] a1VarArr = new a2.a1[list.size()];
        iu.x xVar = new iu.x();
        xVar.f20558a = w2.a.j(j10);
        iu.x xVar2 = new iu.x();
        xVar2.f20558a = w2.a.i(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            a2.l0 l0Var2 = (a2.l0) list.get(i14);
            Object a12 = l0Var2.a();
            if (a12 instanceof p) {
                pVar2 = (p) a12;
            } else {
                pVar2 = null;
            }
            if (pVar2 != null && pVar2.f2970o) {
                z10 = true;
            } else {
                a2.a1 E2 = l0Var2.E(a10);
                a1VarArr[i14] = E2;
                xVar.f20558a = Math.max(xVar.f20558a, E2.f29a);
                xVar2.f20558a = Math.max(xVar2.f20558a, E2.f30b);
            }
        }
        if (z10) {
            int i15 = xVar.f20558a;
            if (i15 != Integer.MAX_VALUE) {
                i10 = i15;
            } else {
                i10 = 0;
            }
            int i16 = xVar2.f20558a;
            if (i16 != Integer.MAX_VALUE) {
                i11 = i16;
            } else {
                i11 = 0;
            }
            long b10 = hl.f.b(i10, i15, i11, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                a2.l0 l0Var3 = (a2.l0) list.get(i17);
                Object a13 = l0Var3.a();
                if (a13 instanceof p) {
                    pVar = (p) a13;
                } else {
                    pVar = null;
                }
                if (pVar != null && pVar.f2970o) {
                    a1VarArr[i17] = l0Var3.E(b10);
                }
            }
        }
        n0 = o0Var.n0(xVar.f20558a, xVar2.f20558a, vt.p0.d(), new u(a1VarArr, list, o0Var, xVar, xVar2, this, 0));
        return n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.a(this.f3021a, vVar.f3021a) && this.f3022b == vVar.f3022b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3022b) + (this.f3021a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f3021a);
        sb2.append(", propagateMinConstraints=");
        return v.e.k(sb2, this.f3022b, ')');
    }
}
