package androidx.compose.ui.focus;

import a2.f;
import b2.i;
import c2.b1;
import c2.g;
import c2.i1;
import c2.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.j;
import d0.m;
import d2.a0;
import g1.n;
import i0.d1;
import iu.z;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.c;
import l1.s;
import l1.t;
import l1.u;
import l1.v;
import m1.d;
import v0.h;
import w.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final boolean A(t tVar, Function1 function1) {
        Object[] objArr = new t[16];
        n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            h hVar = new h(new n[16]);
            n nVar2 = nVar.f16410f;
            if (nVar2 == null) {
                g.b(hVar, nVar);
            } else {
                hVar.b(nVar2);
            }
            int i10 = 0;
            while (hVar.l()) {
                n nVar3 = (n) hVar.n(hVar.f37655c - 1);
                if ((nVar3.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    g.b(hVar, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            h hVar2 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof t) {
                                    t tVar2 = (t) nVar3;
                                    int i11 = i10 + 1;
                                    if (objArr.length < i11) {
                                        objArr = Arrays.copyOf(objArr, Math.max(i11, objArr.length * 2));
                                        Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                    }
                                    objArr[i10] = tVar2;
                                    i10 = i11;
                                } else if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar3 instanceof o)) {
                                    int i12 = 0;
                                    for (n nVar4 = ((o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (hVar2 == null) {
                                                    hVar2 = new h(new n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    hVar2.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                hVar2.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                nVar3 = g.f(hVar2);
                            }
                        } else {
                            nVar3 = nVar3.f16410f;
                        }
                    }
                }
            }
            v comparator = v.f23928a;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            Arrays.sort(objArr, 0, i10, comparator);
            if (i10 <= 0) {
                return false;
            }
            int i13 = 0;
            do {
                t tVar3 = (t) objArr[i13];
                if (t(tVar3) && k(tVar3, function1)) {
                    return true;
                }
                i13++;
            } while (i13 < i10);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [v0.h] */
    public static final void B(t tVar) {
        b1 b1Var;
        n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            androidx.compose.ui.node.a y10 = g.y(tVar);
            n nVar2 = nVar;
            while (y10 != null) {
                if ((y10.f1422w.f7658e.f16408d & 5120) != 0) {
                    while (nVar2 != null) {
                        int i10 = nVar2.f16407c;
                        if ((i10 & 5120) != 0) {
                            if (nVar2 == nVar || (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                if ((i10 & 4096) != 0) {
                                    o oVar = nVar2;
                                    ?? r42 = 0;
                                    while (oVar != 0) {
                                        if (oVar instanceof c) {
                                            c cVar = (c) oVar;
                                            cVar.i(p(cVar));
                                        } else if ((oVar.f16407c & 4096) != 0 && (oVar instanceof o)) {
                                            n nVar3 = oVar.f7801o;
                                            int i11 = 0;
                                            oVar = oVar;
                                            r42 = r42;
                                            while (nVar3 != null) {
                                                if ((nVar3.f16407c & 4096) != 0) {
                                                    i11++;
                                                    r42 = r42;
                                                    if (i11 == 1) {
                                                        oVar = nVar3;
                                                    } else {
                                                        if (r42 == 0) {
                                                            r42 = new h(new n[16]);
                                                        }
                                                        if (oVar != 0) {
                                                            r42.b(oVar);
                                                            oVar = 0;
                                                        }
                                                        r42.b(nVar3);
                                                    }
                                                }
                                                nVar3 = nVar3.f16410f;
                                                oVar = oVar;
                                                r42 = r42;
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        oVar = g.f(r42);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        nVar2 = nVar2.f16409e;
                    }
                }
                y10 = y10.q();
                if (y10 != null && (b1Var = y10.f1422w) != null) {
                    nVar2 = b1Var.f7657d;
                } else {
                    nVar2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean C(t tVar) {
        Boolean D = D(tVar, 7);
        if (D != null) {
            return D.booleanValue();
        }
        return false;
    }

    public static final Boolean D(t tVar, int i10) {
        Boolean valueOf;
        u F = F(tVar);
        try {
            if (F.f23927c) {
                u.a(F);
            }
            F.f23927c = true;
            int e10 = k.e(x(tVar, i10));
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2) {
                        if (e10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        valueOf = Boolean.TRUE;
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(y(tVar));
            }
            return valueOf;
        } finally {
            u.b(F);
        }
    }

    public static final boolean E(t tVar, t tVar2) {
        n nVar;
        n nVar2;
        b1 b1Var;
        b1 b1Var2;
        n nVar3 = tVar2.f16405a;
        if (nVar3.f16417m) {
            n nVar4 = nVar3.f16409e;
            androidx.compose.ui.node.a y10 = g.y(tVar2);
            loop0: while (true) {
                if (y10 != null) {
                    if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        while (nVar4 != null) {
                            if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                nVar = nVar4;
                                h hVar = null;
                                while (nVar != null) {
                                    if (nVar instanceof t) {
                                        break loop0;
                                    }
                                    if ((nVar.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar instanceof o)) {
                                        int i10 = 0;
                                        for (n nVar5 = ((o) nVar).f7801o; nVar5 != null; nVar5 = nVar5.f16410f) {
                                            if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nVar = nVar5;
                                                } else {
                                                    if (hVar == null) {
                                                        hVar = new h(new n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        hVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    hVar.b(nVar5);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    nVar = g.f(hVar);
                                }
                            }
                            nVar4 = nVar4.f16409e;
                        }
                    }
                    y10 = y10.q();
                    if (y10 != null && (b1Var2 = y10.f1422w) != null) {
                        nVar4 = b1Var2.f7657d;
                    } else {
                        nVar4 = null;
                    }
                } else {
                    nVar = null;
                    break;
                }
            }
            if (Intrinsics.a(nVar, tVar)) {
                int ordinal = tVar.R0().ordinal();
                s sVar = s.f23919b;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return false;
                        }
                        if (ordinal == 3) {
                            n nVar6 = tVar.f16405a;
                            if (nVar6.f16417m) {
                                n nVar7 = nVar6.f16409e;
                                androidx.compose.ui.node.a y11 = g.y(tVar);
                                loop4: while (true) {
                                    if (y11 != null) {
                                        if ((y11.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            while (nVar7 != null) {
                                                if ((nVar7.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                    nVar2 = nVar7;
                                                    h hVar2 = null;
                                                    while (nVar2 != null) {
                                                        if (nVar2 instanceof t) {
                                                            break loop4;
                                                        }
                                                        if ((nVar2.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar2 instanceof o)) {
                                                            int i11 = 0;
                                                            for (n nVar8 = ((o) nVar2).f7801o; nVar8 != null; nVar8 = nVar8.f16410f) {
                                                                if ((nVar8.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                    i11++;
                                                                    if (i11 == 1) {
                                                                        nVar2 = nVar8;
                                                                    } else {
                                                                        if (hVar2 == null) {
                                                                            hVar2 = new h(new n[16]);
                                                                        }
                                                                        if (nVar2 != null) {
                                                                            hVar2.b(nVar2);
                                                                            nVar2 = null;
                                                                        }
                                                                        hVar2.b(nVar8);
                                                                    }
                                                                }
                                                            }
                                                            if (i11 == 1) {
                                                            }
                                                        }
                                                        nVar2 = g.f(hVar2);
                                                    }
                                                }
                                                nVar7 = nVar7.f16409e;
                                            }
                                        }
                                        y11 = y11.q();
                                        if (y11 != null && (b1Var = y11.f1422w) != null) {
                                            nVar7 = b1Var.f7657d;
                                        } else {
                                            nVar7 = null;
                                        }
                                    } else {
                                        nVar2 = null;
                                        break;
                                    }
                                }
                                t tVar3 = (t) nVar2;
                                if (tVar3 == null && ((Boolean) ((b) ((a0) g.z(tVar)).getFocusOwner()).f1360a.invoke(null, null)).booleanValue()) {
                                    tVar.V0(s.f23918a);
                                    return E(tVar, tVar2);
                                }
                                if (tVar3 == null || !E(tVar3, tVar)) {
                                    return false;
                                }
                                boolean E = E(tVar, tVar2);
                                if (tVar.R0() == sVar) {
                                    if (E) {
                                        B(tVar3);
                                        return E;
                                    }
                                    return E;
                                }
                                throw new IllegalStateException("Deactivated node is focused".toString());
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (o(tVar) != null) {
                        t o10 = o(tVar);
                        if (o10 != null && !d(o10, false, true)) {
                            return false;
                        }
                        q(tVar2);
                    } else {
                        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
                    }
                } else {
                    q(tVar2);
                    tVar.V0(sVar);
                }
                return true;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final u F(t tVar) {
        return ((b) ((a0) g.z(tVar)).getFocusOwner()).f1365f;
    }

    public static final Object G(t tVar, int i10, d1 d1Var) {
        int i11;
        Object obj;
        n nVar;
        d0.o oVar;
        int g10;
        b1 b1Var;
        n nVar2 = tVar.f16405a;
        if (nVar2.f16417m) {
            n nVar3 = nVar2.f16409e;
            androidx.compose.ui.node.a y10 = g.y(tVar);
            loop0: while (true) {
                i11 = 1;
                obj = null;
                if (y10 != null) {
                    if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                nVar = nVar3;
                                h hVar = null;
                                while (nVar != null) {
                                    if (nVar instanceof t) {
                                        break loop0;
                                    }
                                    if ((nVar.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar instanceof o)) {
                                        int i12 = 0;
                                        for (n nVar4 = ((o) nVar).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                            if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    nVar = nVar4;
                                                } else {
                                                    if (hVar == null) {
                                                        hVar = new h(new n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        hVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    hVar.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    nVar = g.f(hVar);
                                }
                            }
                            nVar3 = nVar3.f16409e;
                        }
                    }
                    y10 = y10.q();
                    if (y10 != null && (b1Var = y10.f1422w) != null) {
                        nVar3 = b1Var.f7657d;
                    } else {
                        nVar3 = null;
                    }
                } else {
                    nVar = null;
                    break;
                }
            }
            t tVar2 = (t) nVar;
            if (tVar2 != null) {
                i iVar = a2.h.f66a;
                if (Intrinsics.a((f) tVar2.c(iVar), (f) tVar.c(iVar))) {
                    return null;
                }
            }
            f fVar = (f) tVar.c(a2.h.f66a);
            if (fVar == null) {
                return null;
            }
            int i13 = 5;
            if (!l1.b.a(i10, 5)) {
                i13 = 6;
                if (!l1.b.a(i10, 6)) {
                    i13 = 3;
                    if (!l1.b.a(i10, 3)) {
                        i13 = 4;
                        if (!l1.b.a(i10, 4)) {
                            if (l1.b.a(i10, 1)) {
                                i11 = 2;
                            } else if (!l1.b.a(i10, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                            d0.n nVar5 = (d0.n) fVar;
                            oVar = nVar5.f13185b;
                            if (oVar.c() <= 0 && oVar.f()) {
                                if (nVar5.j(i11)) {
                                    g10 = oVar.d();
                                } else {
                                    g10 = oVar.g();
                                }
                                z zVar = new z();
                                d0.k kVar = nVar5.f13186c;
                                kVar.getClass();
                                j jVar = new j(g10, g10);
                                h hVar2 = kVar.f13174a;
                                hVar2.b(jVar);
                                zVar.f20560a = jVar;
                                while (obj == null && nVar5.d((j) zVar.f20560a, i11)) {
                                    j jVar2 = (j) zVar.f20560a;
                                    int i14 = jVar2.f13169a;
                                    boolean j10 = nVar5.j(i11);
                                    int i15 = jVar2.f13170b;
                                    if (j10) {
                                        i15++;
                                    } else {
                                        i14--;
                                    }
                                    j jVar3 = new j(i14, i15);
                                    hVar2.b(jVar3);
                                    hVar2.m((j) zVar.f20560a);
                                    zVar.f20560a = jVar3;
                                    oVar.e();
                                    obj = d1Var.invoke(new m(nVar5, zVar, i11));
                                }
                                hVar2.m((j) zVar.f20560a);
                                oVar.e();
                                return obj;
                            }
                            return d1Var.invoke(d0.n.f13184g);
                        }
                    }
                }
            }
            i11 = i13;
            d0.n nVar52 = (d0.n) fVar;
            oVar = nVar52.f13185b;
            if (oVar.c() <= 0) {
            }
            return d1Var.invoke(d0.n.f13184g);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean H(int i10, t tVar, d dVar, Function1 function1) {
        t g10;
        h hVar = new h(new t[16]);
        n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            h hVar2 = new h(new n[16]);
            n nVar2 = nVar.f16410f;
            if (nVar2 == null) {
                g.b(hVar2, nVar);
            } else {
                hVar2.b(nVar2);
            }
            while (hVar2.l()) {
                n nVar3 = (n) hVar2.n(hVar2.f37655c - 1);
                if ((nVar3.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    g.b(hVar2, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            h hVar3 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof t) {
                                    hVar.b((t) nVar3);
                                } else if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar3 instanceof o)) {
                                    int i11 = 0;
                                    for (n nVar4 = ((o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (hVar3 == null) {
                                                    hVar3 = new h(new n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    hVar3.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                hVar3.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                nVar3 = g.f(hVar3);
                            }
                        } else {
                            nVar3 = nVar3.f16410f;
                        }
                    }
                }
            }
            while (hVar.l() && (g10 = g(hVar, dVar, i10)) != null) {
                if (g10.Q0().f23901a) {
                    return ((Boolean) function1.invoke(g10)).booleanValue();
                }
                if (m(i10, g10, dVar, function1)) {
                    return true;
                }
                hVar.m(g10);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final boolean I(t tVar, t tVar2, int i10, Function1 function1) {
        n nVar;
        b1 b1Var;
        if (tVar.R0() == s.f23919b) {
            Object[] objArr = new t[16];
            n nVar2 = tVar.f16405a;
            if (nVar2.f16417m) {
                h hVar = new h(new n[16]);
                n nVar3 = nVar2.f16410f;
                if (nVar3 == null) {
                    g.b(hVar, nVar2);
                } else {
                    hVar.b(nVar3);
                }
                int i11 = 0;
                while (hVar.l()) {
                    n nVar4 = (n) hVar.n(hVar.f37655c - 1);
                    if ((nVar4.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                        g.b(hVar, nVar4);
                    } else {
                        while (true) {
                            if (nVar4 == null) {
                                break;
                            }
                            if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                h hVar2 = null;
                                while (nVar4 != null) {
                                    if (nVar4 instanceof t) {
                                        t tVar3 = (t) nVar4;
                                        int i12 = i11 + 1;
                                        if (objArr.length < i12) {
                                            objArr = Arrays.copyOf(objArr, Math.max(i12, objArr.length * 2));
                                            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                        }
                                        objArr[i11] = tVar3;
                                        i11 = i12;
                                    } else if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar4 instanceof o)) {
                                        int i13 = 0;
                                        for (n nVar5 = ((o) nVar4).f7801o; nVar5 != null; nVar5 = nVar5.f16410f) {
                                            if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    nVar4 = nVar5;
                                                } else {
                                                    if (hVar2 == null) {
                                                        hVar2 = new h(new n[16]);
                                                    }
                                                    if (nVar4 != null) {
                                                        hVar2.b(nVar4);
                                                        nVar4 = null;
                                                    }
                                                    hVar2.b(nVar5);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    nVar4 = g.f(hVar2);
                                }
                            } else {
                                nVar4 = nVar4.f16410f;
                            }
                        }
                    }
                }
                v comparator = v.f23928a;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                Intrinsics.checkNotNullParameter(comparator, "comparator");
                Arrays.sort(objArr, 0, i11, comparator);
                if (l1.b.a(i10, 1)) {
                    int i14 = new kotlin.ranges.c(0, i11 - 1, 1).f23382b;
                    if (i14 >= 0) {
                        boolean z10 = false;
                        int i15 = 0;
                        while (true) {
                            if (z10) {
                                t tVar4 = (t) objArr[i15];
                                if (t(tVar4) && k(tVar4, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.a(objArr[i15], tVar2)) {
                                z10 = true;
                            }
                            if (i15 == i14) {
                                break;
                            }
                            i15++;
                        }
                    }
                } else if (l1.b.a(i10, 2)) {
                    int i16 = new kotlin.ranges.c(0, i11 - 1, 1).f23382b;
                    if (i16 >= 0) {
                        boolean z11 = false;
                        while (true) {
                            if (z11) {
                                t tVar5 = (t) objArr[i16];
                                if (t(tVar5) && a(tVar5, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.a(objArr[i16], tVar2)) {
                                z11 = true;
                            }
                            if (i16 == 0) {
                                break;
                            }
                            i16--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (!l1.b.a(i10, 1) && tVar.Q0().f23901a) {
                    n nVar6 = tVar.f16405a;
                    if (nVar6.f16417m) {
                        n nVar7 = nVar6.f16409e;
                        androidx.compose.ui.node.a y10 = g.y(tVar);
                        loop5: while (true) {
                            if (y10 != null) {
                                if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    while (nVar7 != null) {
                                        if ((nVar7.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            n nVar8 = nVar7;
                                            h hVar3 = null;
                                            while (nVar8 != null) {
                                                if (nVar8 instanceof t) {
                                                    nVar = nVar8;
                                                    break loop5;
                                                }
                                                if ((nVar8.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar8 instanceof o)) {
                                                    int i17 = 0;
                                                    for (n nVar9 = ((o) nVar8).f7801o; nVar9 != null; nVar9 = nVar9.f16410f) {
                                                        if ((nVar9.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                            i17++;
                                                            if (i17 == 1) {
                                                                nVar8 = nVar9;
                                                            } else {
                                                                if (hVar3 == null) {
                                                                    hVar3 = new h(new n[16]);
                                                                }
                                                                if (nVar8 != null) {
                                                                    hVar3.b(nVar8);
                                                                    nVar8 = null;
                                                                }
                                                                hVar3.b(nVar9);
                                                            }
                                                        }
                                                    }
                                                    if (i17 == 1) {
                                                    }
                                                }
                                                nVar8 = g.f(hVar3);
                                            }
                                        }
                                        nVar7 = nVar7.f16409e;
                                    }
                                }
                                y10 = y10.q();
                                if (y10 != null && (b1Var = y10.f1422w) != null) {
                                    nVar7 = b1Var.f7657d;
                                } else {
                                    nVar7 = null;
                                }
                            } else {
                                nVar = null;
                                break;
                            }
                        }
                        if (nVar != null) {
                            return ((Boolean) function1.invoke(tVar)).booleanValue();
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
                return false;
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    public static final Boolean J(int i10, t tVar, d dVar, c.g gVar) {
        int ordinal = tVar.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (tVar.Q0().f23901a) {
                            return (Boolean) gVar.invoke(tVar);
                        }
                        if (dVar == null) {
                            return Boolean.valueOf(h(tVar, i10, gVar));
                        }
                        return Boolean.valueOf(H(i10, tVar, dVar, gVar));
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    int ordinal2 = o10.R0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else {
                            Boolean J = J(i10, o10, dVar, gVar);
                            if (!Intrinsics.a(J, Boolean.FALSE)) {
                                return J;
                            }
                            if (o10.R0() == s.f23919b) {
                                t f10 = f(o10);
                                if (f10 != null) {
                                    return Boolean.valueOf(m(i10, tVar, i(f10), gVar));
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
                        }
                    }
                    return Boolean.valueOf(m(i10, tVar, i(o10), gVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return Boolean.valueOf(h(tVar, i10, gVar));
    }

    public static final boolean a(t tVar, Function1 function1) {
        int ordinal = tVar.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!z(tVar, function1) && (!tVar.Q0().f23901a || !((Boolean) function1.invoke(tVar)).booleanValue())) {
                            return false;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    int ordinal2 = o10.R0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else if (!a(o10, function1) && !n(tVar, o10, 2, function1) && (!o10.Q0().f23901a || !((Boolean) function1.invoke(o10)).booleanValue())) {
                            return false;
                        }
                    }
                    return n(tVar, o10, 2, function1);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            return true;
        }
        return z(tVar, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (l1.b.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (l1.b.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (l1.b.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f27241c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(s0.g.f34069a, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (l1.b.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (l1.b.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (l1.b.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (l1.b.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (l1.b.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f27239a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (l1.b.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f27242d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (l1.b.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f27240b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(m1.d r16, m1.d r17, m1.d r18, int r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.b(m1.d, m1.d, m1.d, int):boolean");
    }

    public static final boolean c(int i10, d dVar, d dVar2) {
        if (l1.b.a(i10, 3) || l1.b.a(i10, 4)) {
            if (dVar.f27242d <= dVar2.f27240b || dVar.f27240b >= dVar2.f27242d) {
                return false;
            }
        } else if (l1.b.a(i10, 5) || l1.b.a(i10, 6)) {
            if (dVar.f27241c <= dVar2.f27239a || dVar.f27239a >= dVar2.f27241c) {
                return false;
            }
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        return true;
    }

    public static final boolean d(t tVar, boolean z10, boolean z11) {
        boolean z12;
        int ordinal = tVar.R0().ordinal();
        s sVar = s.f23920c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (z10) {
                        tVar.V0(sVar);
                        if (z11) {
                            B(tVar);
                            return z10;
                        }
                        return z10;
                    }
                    return z10;
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    z12 = d(o10, z10, z11);
                } else {
                    z12 = true;
                }
                if (z12) {
                    tVar.V0(sVar);
                    if (z11) {
                        B(tVar);
                    }
                } else {
                    return false;
                }
            }
        } else {
            tVar.V0(sVar);
            if (z11) {
                B(tVar);
            }
        }
        return true;
    }

    public static final void e(c2.n nVar, h hVar) {
        n nVar2 = ((n) nVar).f16405a;
        if (nVar2.f16417m) {
            h hVar2 = new h(new n[16]);
            n nVar3 = nVar2.f16410f;
            if (nVar3 == null) {
                g.b(hVar2, nVar2);
            } else {
                hVar2.b(nVar3);
            }
            while (hVar2.l()) {
                n nVar4 = (n) hVar2.n(hVar2.f37655c - 1);
                if ((nVar4.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    g.b(hVar2, nVar4);
                } else {
                    while (true) {
                        if (nVar4 == null) {
                            break;
                        }
                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            h hVar3 = null;
                            while (nVar4 != null) {
                                if (nVar4 instanceof t) {
                                    t tVar = (t) nVar4;
                                    if (tVar.f16417m && !g.y(tVar).F) {
                                        if (tVar.Q0().f23901a) {
                                            hVar.b(tVar);
                                        } else {
                                            e(tVar, hVar);
                                        }
                                    }
                                } else if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar4 instanceof o)) {
                                    int i10 = 0;
                                    for (n nVar5 = ((o) nVar4).f7801o; nVar5 != null; nVar5 = nVar5.f16410f) {
                                        if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVar4 = nVar5;
                                            } else {
                                                if (hVar3 == null) {
                                                    hVar3 = new h(new n[16]);
                                                }
                                                if (nVar4 != null) {
                                                    hVar3.b(nVar4);
                                                    nVar4 = null;
                                                }
                                                hVar3.b(nVar5);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVar4 = g.f(hVar3);
                            }
                        } else {
                            nVar4 = nVar4.f16410f;
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.t f(l1.t r8) {
        /*
            l1.s r0 = r8.R0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lb1
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto Lb1
            r8 = 3
            if (r0 != r8) goto L15
            return r2
        L15:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L1b:
            g1.n r8 = r8.f16405a
            boolean r0 = r8.f16417m
            if (r0 == 0) goto La5
            v0.h r0 = new v0.h
            r3 = 16
            g1.n[] r4 = new g1.n[r3]
            r0.<init>(r4)
            g1.n r4 = r8.f16410f
            if (r4 != 0) goto L32
            c2.g.b(r0, r8)
            goto L35
        L32:
            r0.b(r4)
        L35:
            boolean r8 = r0.l()
            if (r8 == 0) goto La4
            int r8 = r0.f37655c
            int r8 = r8 - r1
            java.lang.Object r8 = r0.n(r8)
            g1.n r8 = (g1.n) r8
            int r4 = r8.f16408d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4e
            c2.g.b(r0, r8)
            goto L35
        L4e:
            if (r8 == 0) goto L35
            int r4 = r8.f16407c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La1
            r4 = r2
        L57:
            if (r8 == 0) goto L35
            boolean r5 = r8 instanceof l1.t
            if (r5 == 0) goto L66
            l1.t r8 = (l1.t) r8
            l1.t r8 = f(r8)
            if (r8 == 0) goto L9c
            return r8
        L66:
            int r5 = r8.f16407c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9c
            boolean r5 = r8 instanceof c2.o
            if (r5 == 0) goto L9c
            r5 = r8
            c2.o r5 = (c2.o) r5
            g1.n r5 = r5.f7801o
            r6 = 0
        L76:
            if (r5 == 0) goto L99
            int r7 = r5.f16407c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L96
            int r6 = r6 + 1
            if (r6 != r1) goto L84
            r8 = r5
            goto L96
        L84:
            if (r4 != 0) goto L8d
            v0.h r4 = new v0.h
            g1.n[] r7 = new g1.n[r3]
            r4.<init>(r7)
        L8d:
            if (r8 == 0) goto L93
            r4.b(r8)
            r8 = r2
        L93:
            r4.b(r5)
        L96:
            g1.n r5 = r5.f16410f
            goto L76
        L99:
            if (r6 != r1) goto L9c
            goto L57
        L9c:
            g1.n r8 = c2.g.f(r4)
            goto L57
        La1:
            g1.n r8 = r8.f16410f
            goto L4e
        La4:
            return r2
        La5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.f(l1.t):l1.t");
    }

    public static final t g(h hVar, d dVar, int i10) {
        d f10;
        if (l1.b.a(i10, 3)) {
            f10 = dVar.f(dVar.c() + 1, s0.g.f34069a);
        } else if (l1.b.a(i10, 4)) {
            f10 = dVar.f(-(dVar.c() + 1), s0.g.f34069a);
        } else if (l1.b.a(i10, 5)) {
            f10 = dVar.f(s0.g.f34069a, dVar.b() + 1);
        } else if (l1.b.a(i10, 6)) {
            f10 = dVar.f(s0.g.f34069a, -(dVar.b() + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        int i11 = hVar.f37655c;
        t tVar = null;
        if (i11 > 0) {
            Object[] objArr = hVar.f37653a;
            int i12 = 0;
            do {
                t tVar2 = (t) objArr[i12];
                if (t(tVar2)) {
                    d i13 = i(tVar2);
                    if (r(i10, i13, dVar) && (!r(i10, f10, dVar) || b(dVar, i13, f10, i10) || (!b(dVar, f10, i13, i10) && s(i10, dVar, i13) < s(i10, dVar, f10)))) {
                        tVar = tVar2;
                        f10 = i13;
                    }
                }
                i12++;
            } while (i12 < i11);
        }
        return tVar;
    }

    public static final boolean h(t tVar, int i10, Function1 function1) {
        d dVar;
        Object obj;
        h hVar = new h(new t[16]);
        e(tVar, hVar);
        if (hVar.f37655c <= 1) {
            if (hVar.k()) {
                obj = null;
            } else {
                obj = hVar.f37653a[0];
            }
            t tVar2 = (t) obj;
            if (tVar2 == null) {
                return false;
            }
            return ((Boolean) function1.invoke(tVar2)).booleanValue();
        }
        if (l1.b.a(i10, 7)) {
            i10 = 4;
        }
        if (l1.b.a(i10, 4) || l1.b.a(i10, 6)) {
            d i11 = i(tVar);
            float f10 = i11.f27240b;
            float f11 = i11.f27239a;
            dVar = new d(f11, f10, f11, f10);
        } else if (l1.b.a(i10, 3) || l1.b.a(i10, 5)) {
            d i12 = i(tVar);
            float f12 = i12.f27242d;
            float f13 = i12.f27241c;
            dVar = new d(f13, f12, f13, f12);
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        t g10 = g(hVar, dVar, i10);
        if (g10 == null) {
            return false;
        }
        return ((Boolean) function1.invoke(g10)).booleanValue();
    }

    public static final d i(t tVar) {
        d i10;
        i1 i1Var = tVar.f16412h;
        if (i1Var == null || (i10 = androidx.compose.ui.layout.a.e(i1Var).i(i1Var, false)) == null) {
            return d.f27238e;
        }
        return i10;
    }

    public static final g1.o j(g1.o oVar, l1.o oVar2) {
        return oVar.g(new FocusRequesterElement(oVar2));
    }

    public static final boolean k(t tVar, Function1 function1) {
        int ordinal = tVar.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (tVar.Q0().f23901a) {
                            return ((Boolean) function1.invoke(tVar)).booleanValue();
                        }
                        return A(tVar, function1);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    if (k(o10, function1) || n(tVar, o10, 1, function1)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return A(tVar, function1);
    }

    public static final boolean l(t tVar) {
        u F = F(tVar);
        try {
            if (F.f23927c) {
                u.a(F);
            }
            boolean z10 = true;
            F.f23927c = true;
            int ordinal = tVar.R0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        tVar.V0(s.f23918a);
                        B(tVar);
                    }
                }
                z10 = false;
            }
            u.b(F);
            return z10;
        } catch (Throwable th2) {
            u.b(F);
            throw th2;
        }
    }

    public static final boolean m(int i10, t tVar, d dVar, Function1 function1) {
        if (H(i10, tVar, dVar, function1)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i10, new d1(tVar, dVar, i10, function1, 5));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(t tVar, t tVar2, int i10, Function1 function1) {
        if (I(tVar, tVar2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i10, new d1(tVar, tVar2, i10, function1, 4));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.t o(l1.t r8) {
        /*
            g1.n r8 = r8.f16405a
            boolean r0 = r8.f16417m
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L9f
            v0.h r0 = new v0.h
            r2 = 16
            g1.n[] r3 = new g1.n[r2]
            r0.<init>(r3)
            g1.n r3 = r8.f16410f
            if (r3 != 0) goto L1b
            c2.g.b(r0, r8)
            goto L1e
        L1b:
            r0.b(r3)
        L1e:
            boolean r8 = r0.l()
            if (r8 == 0) goto L9e
            int r8 = r0.f37655c
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.n(r8)
            g1.n r8 = (g1.n) r8
            int r4 = r8.f16408d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L38
            c2.g.b(r0, r8)
            goto L1e
        L38:
            if (r8 == 0) goto L1e
            int r4 = r8.f16407c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9b
            r4 = r1
        L41:
            if (r8 == 0) goto L1e
            boolean r5 = r8 instanceof l1.t
            if (r5 == 0) goto L60
            l1.t r8 = (l1.t) r8
            g1.n r5 = r8.f16405a
            boolean r5 = r5.f16417m
            if (r5 == 0) goto L96
            l1.s r5 = r8.R0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L5f
            r6 = 2
            if (r5 == r6) goto L5f
            goto L96
        L5f:
            return r8
        L60:
            int r5 = r8.f16407c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L96
            boolean r5 = r8 instanceof c2.o
            if (r5 == 0) goto L96
            r5 = r8
            c2.o r5 = (c2.o) r5
            g1.n r5 = r5.f7801o
            r6 = 0
        L70:
            if (r5 == 0) goto L93
            int r7 = r5.f16407c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            int r6 = r6 + 1
            if (r6 != r3) goto L7e
            r8 = r5
            goto L90
        L7e:
            if (r4 != 0) goto L87
            v0.h r4 = new v0.h
            g1.n[] r7 = new g1.n[r2]
            r4.<init>(r7)
        L87:
            if (r8 == 0) goto L8d
            r4.b(r8)
            r8 = r1
        L8d:
            r4.b(r5)
        L90:
            g1.n r5 = r5.f16410f
            goto L70
        L93:
            if (r6 != r3) goto L96
            goto L41
        L96:
            g1.n r8 = c2.g.f(r4)
            goto L41
        L9b:
            g1.n r8 = r8.f16410f
            goto L38
        L9e:
            return r1
        L9f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.o(l1.t):l1.t");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.s p(l1.c r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.p(l1.c):l1.s");
    }

    public static final void q(t tVar) {
        g.w(tVar, new x.a(tVar, 22));
        int ordinal = tVar.R0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            tVar.V0(s.f23918a);
        }
    }

    public static final boolean r(int i10, d dVar, d dVar2) {
        boolean a10 = l1.b.a(i10, 3);
        float f10 = dVar.f27239a;
        float f11 = dVar.f27241c;
        if (a10) {
            float f12 = dVar2.f27241c;
            float f13 = dVar2.f27239a;
            if ((f12 <= f11 && f13 < f11) || f13 <= f10) {
                return false;
            }
        } else if (l1.b.a(i10, 4)) {
            float f14 = dVar2.f27239a;
            float f15 = dVar2.f27241c;
            if ((f14 >= f10 && f15 > f10) || f15 >= f11) {
                return false;
            }
        } else {
            boolean a11 = l1.b.a(i10, 5);
            float f16 = dVar.f27240b;
            float f17 = dVar.f27242d;
            if (a11) {
                float f18 = dVar2.f27242d;
                float f19 = dVar2.f27240b;
                if ((f18 <= f17 && f19 < f17) || f19 <= f16) {
                    return false;
                }
            } else if (l1.b.a(i10, 6)) {
                float f20 = dVar2.f27240b;
                float f21 = dVar2.f27242d;
                if ((f20 >= f16 && f21 > f16) || f21 >= f17) {
                    return false;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return true;
    }

    public static final long s(int i10, d dVar, d dVar2) {
        float f10;
        float f11;
        float f12;
        float b10;
        float b11;
        boolean a10 = l1.b.a(i10, 3);
        float f13 = dVar2.f27240b;
        float f14 = dVar2.f27239a;
        if (a10) {
            f11 = dVar.f27239a;
            f12 = dVar2.f27241c;
        } else {
            if (l1.b.a(i10, 4)) {
                f10 = f14 - dVar.f27241c;
            } else if (l1.b.a(i10, 5)) {
                f11 = dVar.f27240b;
                f12 = dVar2.f27242d;
            } else if (l1.b.a(i10, 6)) {
                f10 = f13 - dVar.f27242d;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            long abs = Math.abs(Math.max(s0.g.f34069a, f10));
            if (l1.b.a(i10, 3) || l1.b.a(i10, 4)) {
                float f15 = 2;
                b10 = (dVar.b() / f15) + dVar.f27240b;
                b11 = (dVar2.b() / f15) + f13;
            } else if (l1.b.a(i10, 5) || l1.b.a(i10, 6)) {
                float f16 = 2;
                b10 = (dVar.c() / f16) + dVar.f27239a;
                b11 = (dVar2.c() / f16) + f14;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            long abs2 = Math.abs(b10 - b11);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f10 = f11 - f12;
        long abs3 = Math.abs(Math.max(s0.g.f34069a, f10));
        if (l1.b.a(i10, 3)) {
            if (l1.b.a(i10, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f162 = 2;
            b10 = (dVar.c() / f162) + dVar.f27239a;
            b11 = (dVar2.c() / f162) + f14;
            long abs22 = Math.abs(b10 - b11);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f152 = 2;
        b10 = (dVar.b() / f152) + dVar.f27240b;
        b11 = (dVar2.b() / f152) + f13;
        long abs222 = Math.abs(b10 - b11);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean t(t tVar) {
        androidx.compose.ui.node.a aVar;
        i1 i1Var;
        androidx.compose.ui.node.a aVar2;
        i1 i1Var2 = tVar.f16412h;
        if (i1Var2 != null && (aVar = i1Var2.f7721k) != null && aVar.D() && (i1Var = tVar.f16412h) != null && (aVar2 = i1Var.f7721k) != null && aVar2.C()) {
            return true;
        }
        return false;
    }

    public static final g1.o u(g1.o oVar, Function1 function1) {
        return oVar.g(new FocusChangedElement(function1));
    }

    public static final int v(t tVar, int i10) {
        int ordinal = tVar.R0().ordinal();
        int i11 = 1;
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 1;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            t o10 = o(tVar);
            if (o10 != null) {
                int v10 = v(o10, i10);
                if (v10 == 1) {
                    v10 = 0;
                }
                if (v10 == 0) {
                    if (tVar.f23922n) {
                        return 1;
                    }
                    tVar.f23922n = true;
                    try {
                        l1.o oVar = (l1.o) tVar.Q0().f23911k.invoke(new l1.b(i10));
                        if (oVar != l1.o.f23914b) {
                            if (oVar != l1.o.f23915c) {
                                if (oVar.a(l1.h.f23896e)) {
                                    i11 = 3;
                                } else {
                                    i11 = 4;
                                }
                            }
                        }
                        return i11;
                    } finally {
                        tVar.f23922n = false;
                    }
                }
                return v10;
            }
            throw new IllegalArgumentException("ActiveParent with no focused child".toString());
        }
        return 2;
    }

    public static final int w(t tVar, int i10) {
        int i11;
        if (!tVar.f23923o) {
            tVar.f23923o = true;
            try {
                l1.o oVar = (l1.o) tVar.Q0().f23910j.invoke(new l1.b(i10));
                if (oVar != l1.o.f23914b) {
                    if (oVar == l1.o.f23915c) {
                        tVar.f23923o = false;
                        return 2;
                    }
                    if (oVar.a(l1.h.f23896e)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                    return i11;
                }
            } finally {
                tVar.f23923o = false;
            }
        }
        return 1;
    }

    public static final int x(t tVar, int i10) {
        n nVar;
        int i11;
        b1 b1Var;
        int ordinal = tVar.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        n nVar2 = tVar.f16405a;
                        if (nVar2.f16417m) {
                            n nVar3 = nVar2.f16409e;
                            androidx.compose.ui.node.a y10 = g.y(tVar);
                            loop0: while (true) {
                                nVar = null;
                                if (y10 == null) {
                                    break;
                                }
                                if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    while (nVar3 != null) {
                                        if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            n nVar4 = nVar3;
                                            h hVar = null;
                                            while (nVar4 != null) {
                                                if (nVar4 instanceof t) {
                                                    nVar = nVar4;
                                                    break loop0;
                                                }
                                                if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar4 instanceof o)) {
                                                    int i12 = 0;
                                                    for (n nVar5 = ((o) nVar4).f7801o; nVar5 != null; nVar5 = nVar5.f16410f) {
                                                        if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                nVar4 = nVar5;
                                                            } else {
                                                                if (hVar == null) {
                                                                    hVar = new h(new n[16]);
                                                                }
                                                                if (nVar4 != null) {
                                                                    hVar.b(nVar4);
                                                                    nVar4 = null;
                                                                }
                                                                hVar.b(nVar5);
                                                            }
                                                        }
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                nVar4 = g.f(hVar);
                                            }
                                        }
                                        nVar3 = nVar3.f16409e;
                                    }
                                }
                                y10 = y10.q();
                                if (y10 != null && (b1Var = y10.f1422w) != null) {
                                    nVar3 = b1Var.f7657d;
                                } else {
                                    nVar3 = null;
                                }
                            }
                            t tVar2 = (t) nVar;
                            if (tVar2 == null) {
                                return 1;
                            }
                            int ordinal2 = tVar2.R0().ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 == 2) {
                                        return 2;
                                    }
                                    if (ordinal2 == 3) {
                                        int x10 = x(tVar2, i10);
                                        if (x10 == 1) {
                                            i11 = 0;
                                        } else {
                                            i11 = x10;
                                        }
                                        if (i11 == 0) {
                                            return w(tVar2, i10);
                                        }
                                        return i11;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return x(tVar2, i10);
                            }
                            return w(tVar2, i10);
                        }
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    return v(o10, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
        }
        return 1;
    }

    public static final boolean y(t tVar) {
        boolean z10;
        n nVar;
        b1 b1Var;
        int ordinal = tVar.R0().ordinal();
        boolean z11 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        n nVar2 = tVar.f16405a;
                        if (nVar2.f16417m) {
                            n nVar3 = nVar2.f16409e;
                            androidx.compose.ui.node.a y10 = g.y(tVar);
                            loop0: while (true) {
                                if (y10 != null) {
                                    if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        while (nVar3 != null) {
                                            if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                nVar = nVar3;
                                                h hVar = null;
                                                while (nVar != null) {
                                                    if (nVar instanceof t) {
                                                        break loop0;
                                                    }
                                                    if ((nVar.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar instanceof o)) {
                                                        int i10 = 0;
                                                        for (n nVar4 = ((o) nVar).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                                            if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                i10++;
                                                                if (i10 == 1) {
                                                                    nVar = nVar4;
                                                                } else {
                                                                    if (hVar == null) {
                                                                        hVar = new h(new n[16]);
                                                                    }
                                                                    if (nVar != null) {
                                                                        hVar.b(nVar);
                                                                        nVar = null;
                                                                    }
                                                                    hVar.b(nVar4);
                                                                }
                                                            }
                                                        }
                                                        if (i10 == 1) {
                                                        }
                                                    }
                                                    nVar = g.f(hVar);
                                                }
                                            }
                                            nVar3 = nVar3.f16409e;
                                        }
                                    }
                                    y10 = y10.q();
                                    if (y10 != null && (b1Var = y10.f1422w) != null) {
                                        nVar3 = b1Var.f7657d;
                                    } else {
                                        nVar3 = null;
                                    }
                                } else {
                                    nVar = null;
                                    break;
                                }
                            }
                            t tVar2 = (t) nVar;
                            if (tVar2 != null) {
                                s R0 = tVar2.R0();
                                z11 = E(tVar2, tVar);
                                if (z11 && R0 != tVar2.R0()) {
                                    B(tVar2);
                                }
                            } else {
                                if (((Boolean) ((b) ((a0) g.z(tVar)).getFocusOwner()).f1360a.invoke(null, null)).booleanValue()) {
                                    q(tVar);
                                }
                                z11 = false;
                            }
                        } else {
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                t o10 = o(tVar);
                if (o10 != null) {
                    z10 = d(o10, false, true);
                } else {
                    z10 = true;
                }
                if (z10) {
                    q(tVar);
                }
                z11 = false;
            }
        }
        if (z11) {
            B(tVar);
        }
        return z11;
    }

    public static final boolean z(t tVar, Function1 function1) {
        Object[] objArr = new t[16];
        n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            h hVar = new h(new n[16]);
            n nVar2 = nVar.f16410f;
            if (nVar2 == null) {
                g.b(hVar, nVar);
            } else {
                hVar.b(nVar2);
            }
            int i10 = 0;
            while (hVar.l()) {
                n nVar3 = (n) hVar.n(hVar.f37655c - 1);
                if ((nVar3.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    g.b(hVar, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            h hVar2 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof t) {
                                    t tVar2 = (t) nVar3;
                                    int i11 = i10 + 1;
                                    if (objArr.length < i11) {
                                        objArr = Arrays.copyOf(objArr, Math.max(i11, objArr.length * 2));
                                        Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                    }
                                    objArr[i10] = tVar2;
                                    i10 = i11;
                                } else if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar3 instanceof o)) {
                                    int i12 = 0;
                                    for (n nVar4 = ((o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (hVar2 == null) {
                                                    hVar2 = new h(new n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    hVar2.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                hVar2.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                nVar3 = g.f(hVar2);
                            }
                        } else {
                            nVar3 = nVar3.f16410f;
                        }
                    }
                }
            }
            v comparator = v.f23928a;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            Arrays.sort(objArr, 0, i10, comparator);
            if (i10 > 0) {
                int i13 = i10 - 1;
                do {
                    t tVar3 = (t) objArr[i13];
                    if (t(tVar3) && a(tVar3, function1)) {
                        return true;
                    }
                    i13--;
                } while (i13 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }
}
