package c2;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f7805a = new v0.h(new androidx.compose.ui.node.a[16]);

    /* renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.node.a[] f7806b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void a(androidx.compose.ui.node.a aVar) {
        q0 q0Var = aVar.f1423x;
        int i10 = 0;
        if (q0Var.f7815c == 5 && !q0Var.f7817e && !q0Var.f7816d && !aVar.F && aVar.D()) {
            g1.n nVar = aVar.f1422w.f7658e;
            if ((nVar.f16408d & 256) != 0) {
                while (nVar != null) {
                    if ((nVar.f16407c & 256) != 0) {
                        o oVar = nVar;
                        ?? r62 = 0;
                        while (oVar != 0) {
                            if (oVar instanceof t) {
                                t tVar = (t) oVar;
                                tVar.C0(g.x(tVar, 256));
                            } else if ((oVar.f16407c & 256) != 0 && (oVar instanceof o)) {
                                g1.n nVar2 = oVar.f7801o;
                                int i11 = 0;
                                oVar = oVar;
                                r62 = r62;
                                while (nVar2 != null) {
                                    if ((nVar2.f16407c & 256) != 0) {
                                        i11++;
                                        r62 = r62;
                                        if (i11 == 1) {
                                            oVar = nVar2;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new v0.h(new g1.n[16]);
                                            }
                                            if (oVar != 0) {
                                                r62.b(oVar);
                                                oVar = 0;
                                            }
                                            r62.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f16410f;
                                    oVar = oVar;
                                    r62 = r62;
                                }
                                if (i11 == 1) {
                                }
                            }
                            oVar = g.f(r62);
                        }
                    }
                    if ((nVar.f16408d & 256) == 0) {
                        break;
                    } else {
                        nVar = nVar.f16410f;
                    }
                }
            }
        }
        aVar.E = false;
        v0.h u10 = aVar.u();
        int i12 = u10.f37655c;
        if (i12 > 0) {
            Object[] objArr = u10.f37653a;
            do {
                a((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i12);
        }
    }
}
