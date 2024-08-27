package h2;

import c2.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f17866a;

    public p(androidx.compose.ui.node.a aVar) {
        this.f17866a = aVar;
    }

    public final o a() {
        androidx.compose.ui.node.a aVar = this.f17866a;
        g1.n nVar = aVar.f1422w.f7658e;
        c2.n nVar2 = null;
        if ((nVar.f16408d & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f16407c & 8) != 0) {
                    g1.n nVar3 = nVar;
                    v0.h hVar = null;
                    while (nVar3 != null) {
                        if (nVar3 instanceof z1) {
                            nVar2 = nVar3;
                            break loop0;
                        }
                        if ((nVar3.f16407c & 8) != 0 && (nVar3 instanceof c2.o)) {
                            int i10 = 0;
                            for (g1.n nVar4 = ((c2.o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                if ((nVar4.f16407c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVar3 = nVar4;
                                    } else {
                                        if (hVar == null) {
                                            hVar = new v0.h(new g1.n[16]);
                                        }
                                        if (nVar3 != null) {
                                            hVar.b(nVar3);
                                            nVar3 = null;
                                        }
                                        hVar.b(nVar4);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVar3 = c2.g.f(hVar);
                    }
                }
                if ((nVar.f16408d & 8) == 0) {
                    break;
                }
                nVar = nVar.f16410f;
            }
        }
        Intrinsics.c(nVar2);
        return new o(((g1.n) ((z1) nVar2)).f16405a, false, aVar, new j());
    }
}
