package c2;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f7654a;

    /* renamed from: b, reason: collision with root package name */
    public final x f7655b;

    /* renamed from: c, reason: collision with root package name */
    public i1 f7656c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f7657d;

    /* renamed from: e, reason: collision with root package name */
    public g1.n f7658e;

    /* renamed from: f, reason: collision with root package name */
    public v0.h f7659f;

    /* renamed from: g, reason: collision with root package name */
    public v0.h f7660g;

    /* renamed from: h, reason: collision with root package name */
    public a1 f7661h;

    public b1(androidx.compose.ui.node.a aVar) {
        this.f7654a = aVar;
        x xVar = new x(aVar);
        this.f7655b = xVar;
        this.f7656c = xVar;
        a2 a2Var = xVar.I;
        this.f7657d = a2Var;
        this.f7658e = a2Var;
    }

    public static final void a(b1 b1Var, g1.n nVar, i1 i1Var) {
        x xVar;
        b1Var.getClass();
        for (g1.n nVar2 = nVar.f16409e; nVar2 != null; nVar2 = nVar2.f16409e) {
            if (nVar2 == androidx.compose.ui.node.b.f1426a) {
                androidx.compose.ui.node.a q10 = b1Var.f7654a.q();
                if (q10 != null) {
                    xVar = q10.f1422w.f7655b;
                } else {
                    xVar = null;
                }
                i1Var.f7723m = xVar;
                b1Var.f7656c = i1Var;
                return;
            }
            if ((nVar2.f16407c & 2) == 0) {
                nVar2.P0(i1Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g1.n, c2.d] */
    public static g1.n b(g1.m mVar, g1.n nVar) {
        g1.n nVar2;
        if (mVar instanceof y0) {
            nVar2 = ((y0) mVar).d();
            nVar2.f16407c = g.n(nVar2);
        } else {
            ?? nVar3 = new g1.n();
            nVar3.f16407c = g.l(mVar);
            nVar3.f7668n = mVar;
            nVar3.f7670p = new HashSet();
            nVar2 = nVar3;
        }
        if (!nVar2.f16417m) {
            nVar2.f16413i = true;
            g1.n nVar4 = nVar.f16410f;
            if (nVar4 != null) {
                nVar4.f16409e = nVar2;
                nVar2.f16410f = nVar4;
            }
            nVar.f16410f = nVar2;
            nVar2.f16409e = nVar;
            return nVar2;
        }
        t0.t.C0("A ModifierNodeElement cannot return an already attached node from create() ");
        throw null;
    }

    public static g1.n c(g1.n nVar) {
        boolean z10 = nVar.f16417m;
        if (z10) {
            if (z10) {
                g.i(nVar, -1, 2);
                nVar.N0();
                nVar.H0();
            } else {
                t0.t.C0("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
        }
        g1.n nVar2 = nVar.f16410f;
        g1.n nVar3 = nVar.f16409e;
        if (nVar2 != null) {
            nVar2.f16409e = nVar3;
            nVar.f16410f = null;
        }
        if (nVar3 != null) {
            nVar3.f16410f = nVar2;
            nVar.f16409e = null;
        }
        Intrinsics.c(nVar3);
        return nVar3;
    }

    public static void h(g1.m mVar, g1.m mVar2, g1.n nVar) {
        if ((mVar instanceof y0) && (mVar2 instanceof y0)) {
            c1 c1Var = androidx.compose.ui.node.b.f1426a;
            Intrinsics.d(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((y0) mVar2).j(nVar);
            if (nVar.f16417m) {
                g.k(nVar);
                return;
            } else {
                nVar.f16414j = true;
                return;
            }
        }
        if (nVar instanceof d) {
            d dVar = (d) nVar;
            if (dVar.f16417m) {
                dVar.R0();
            }
            dVar.f7668n = mVar2;
            dVar.f16407c = g.l(mVar2);
            if (dVar.f16417m) {
                dVar.Q0(false);
            }
            if (nVar.f16417m) {
                g.k(nVar);
                return;
            } else {
                nVar.f16414j = true;
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type".toString());
    }

    public final boolean d(int i10) {
        if ((i10 & this.f7658e.f16408d) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        for (g1.n nVar = this.f7658e; nVar != null; nVar = nVar.f16410f) {
            nVar.M0();
            if (nVar.f16413i) {
                g.h(nVar);
            }
            if (nVar.f16414j) {
                g.k(nVar);
            }
            nVar.f16413i = false;
            nVar.f16414j = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:c2.a1) from 0x001e: IPUT (r11v13 ?? I:c2.a1), (r29v0 'this' ?? I:c2.b1 A[IMMUTABLE_TYPE, THIS]) (LINE:31) c2.b1.h c2.a1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:c2.a1) from 0x001e: IPUT (r11v13 ?? I:c2.a1), (r29v0 'this' ?? I:c2.b1 A[IMMUTABLE_TYPE, THIS]) (LINE:31) c2.b1.h c2.a1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void g() {
        androidx.compose.ui.node.a aVar;
        x xVar;
        d0 d0Var;
        g1.n nVar = this.f7657d.f16409e;
        i1 i1Var = this.f7655b;
        g1.n nVar2 = nVar;
        while (true) {
            aVar = this.f7654a;
            if (nVar2 == null) {
                break;
            }
            c0 g10 = g.g(nVar2);
            if (g10 != null) {
                i1 i1Var2 = nVar2.f16412h;
                if (i1Var2 != null) {
                    d0 d0Var2 = (d0) i1Var2;
                    c0 c0Var = d0Var2.I;
                    d0Var2.I = g10;
                    d0Var = d0Var2;
                    if (c0Var != nVar2) {
                        p1 p1Var = d0Var2.C;
                        d0Var = d0Var2;
                        if (p1Var != null) {
                            p1Var.invalidate();
                            d0Var = d0Var2;
                        }
                    }
                } else {
                    d0 d0Var3 = new d0(aVar, g10);
                    nVar2.P0(d0Var3);
                    d0Var = d0Var3;
                }
                i1Var.f7723m = d0Var;
                d0Var.f7722l = i1Var;
                i1Var = d0Var;
            } else {
                nVar2.P0(i1Var);
            }
            nVar2 = nVar2.f16409e;
        }
        androidx.compose.ui.node.a q10 = aVar.q();
        if (q10 != null) {
            xVar = q10.f1422w.f7655b;
        } else {
            xVar = null;
        }
        i1Var.f7723m = xVar;
        this.f7656c = i1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        g1.n nVar = this.f7658e;
        a2 a2Var = this.f7657d;
        if (nVar != a2Var) {
            while (true) {
                if (nVar == null || nVar == a2Var) {
                    break;
                }
                sb2.append(String.valueOf(nVar));
                if (nVar.f16410f == a2Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                nVar = nVar.f16410f;
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
