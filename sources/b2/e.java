package b2;

import c2.o;
import c2.r1;
import d2.a0;
import g1.n;
import java.util.HashSet;
import t0.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.h f3091b = new v0.h(new c2.d[16]);

    /* renamed from: c, reason: collision with root package name */
    public final v0.h f3092c = new v0.h(new c[16]);

    /* renamed from: d, reason: collision with root package name */
    public final v0.h f3093d = new v0.h(new androidx.compose.ui.node.a[16]);

    /* renamed from: e, reason: collision with root package name */
    public final v0.h f3094e = new v0.h(new c[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f3095f;

    public e(r1 r1Var) {
        this.f3090a = r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [g1.n] */
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
    public static void b(n nVar, c cVar, HashSet hashSet) {
        n nVar2 = nVar.f16405a;
        if (nVar2.f16417m) {
            v0.h hVar = new v0.h(new n[16]);
            n nVar3 = nVar2.f16410f;
            if (nVar3 == null) {
                c2.g.b(hVar, nVar2);
            } else {
                hVar.b(nVar3);
            }
            while (hVar.l()) {
                n nVar4 = (n) hVar.n(hVar.f37655c - 1);
                if ((nVar4.f16408d & 32) != 0) {
                    for (n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f16410f) {
                        if ((nVar5.f16407c & 32) != 0) {
                            ?? r62 = 0;
                            o oVar = nVar5;
                            while (oVar != 0) {
                                if (oVar instanceof f) {
                                    f fVar = (f) oVar;
                                    if (fVar instanceof c2.d) {
                                        c2.d dVar = (c2.d) fVar;
                                        if ((dVar.f7668n instanceof d) && dVar.f7670p.contains(cVar)) {
                                            hashSet.add(fVar);
                                        }
                                    }
                                    if (!(!fVar.V().G(cVar))) {
                                        break;
                                    }
                                } else if ((oVar.f16407c & 32) != 0 && (oVar instanceof o)) {
                                    n nVar6 = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r62 = r62;
                                    while (nVar6 != null) {
                                        if ((nVar6.f16407c & 32) != 0) {
                                            i10++;
                                            r62 = r62;
                                            if (i10 == 1) {
                                                oVar = nVar6;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new v0.h(new n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r62.b(oVar);
                                                    oVar = 0;
                                                }
                                                r62.b(nVar6);
                                            }
                                        }
                                        nVar6 = nVar6.f16410f;
                                        oVar = oVar;
                                        r62 = r62;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = c2.g.f(r62);
                            }
                        }
                    }
                }
                c2.g.b(hVar, nVar4);
            }
            return;
        }
        t.C0("visitSubtreeIf called on an unattached node");
        throw null;
    }

    public final void a() {
        if (!this.f3095f) {
            this.f3095f = true;
            x.a aVar = new x.a(this, 27);
            v0.h hVar = ((a0) this.f3090a).F0;
            if (!hVar.h(aVar)) {
                hVar.b(aVar);
            }
        }
    }
}
