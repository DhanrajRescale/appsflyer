package b2;

import c2.b1;
import c2.n;
import c2.o;
import t0.t;

/* loaded from: classes.dex */
public interface f extends h, n {
    default kp.j V() {
        return b.f3088e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [c2.n, b2.f] */
    @Override // b2.h
    default Object c(i iVar) {
        b1 b1Var;
        g1.n nVar = ((g1.n) this).f16405a;
        boolean z10 = nVar.f16417m;
        if (z10) {
            if (z10) {
                g1.n nVar2 = nVar.f16409e;
                androidx.compose.ui.node.a y10 = c2.g.y(this);
                while (y10 != null) {
                    if ((y10.f1422w.f7658e.f16408d & 32) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f16407c & 32) != 0) {
                                o oVar = nVar2;
                                ?? r42 = 0;
                                while (oVar != 0) {
                                    if (oVar instanceof f) {
                                        f fVar = (f) oVar;
                                        if (fVar.V().G(iVar)) {
                                            return fVar.V().P(iVar);
                                        }
                                    } else if ((oVar.f16407c & 32) != 0 && (oVar instanceof o)) {
                                        g1.n nVar3 = oVar.f7801o;
                                        int i10 = 0;
                                        oVar = oVar;
                                        r42 = r42;
                                        while (nVar3 != null) {
                                            if ((nVar3.f16407c & 32) != 0) {
                                                i10++;
                                                r42 = r42;
                                                if (i10 == 1) {
                                                    oVar = nVar3;
                                                } else {
                                                    if (r42 == 0) {
                                                        r42 = new v0.h(new g1.n[16]);
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
                                        if (i10 == 1) {
                                        }
                                    }
                                    oVar = c2.g.f(r42);
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
                return iVar.f3089a.mo2invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        t.A0("ModifierLocal accessed from an unattached node");
        throw null;
    }
}
