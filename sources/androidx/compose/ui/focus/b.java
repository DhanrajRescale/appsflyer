package androidx.compose.ui.focus;

import c2.b1;
import c2.y0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.v;
import g1.n;
import g1.o;
import i0.g2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.d;
import l1.e;
import l1.f;
import l1.g;
import l1.i;
import l1.l;
import l1.t;
import l1.u;
import t.w;
import v0.h;
import w.k;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f1360a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f1361b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f1362c;

    /* renamed from: e, reason: collision with root package name */
    public final e f1364e;

    /* renamed from: h, reason: collision with root package name */
    public w f1367h;

    /* renamed from: d, reason: collision with root package name */
    public final t f1363d = new n();

    /* renamed from: f, reason: collision with root package name */
    public final u f1365f = new u();

    /* renamed from: g, reason: collision with root package name */
    public final o f1366g = new FocusPropertiesElement(new l()).g(new y0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // c2.y0
        public final n d() {
            return b.this.f1363d;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // c2.y0
        public final int hashCode() {
            return b.this.f1363d.hashCode();
        }

        @Override // c2.y0
        public final /* bridge */ /* synthetic */ void j(n nVar) {
        }
    });

    /* JADX WARN: Type inference failed for: r2v1, types: [g1.n, l1.t] */
    public b(g2 g2Var, d2.u uVar, d dVar, v vVar) {
        this.f1360a = uVar;
        this.f1361b = dVar;
        this.f1362c = vVar;
        this.f1364e = new e(new d(this, 1), g2Var);
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        boolean d10;
        int e10;
        u uVar = this.f1365f;
        g gVar = g.f23892a;
        try {
            if (uVar.f23927c) {
                u.a(uVar);
            }
            uVar.f23927c = true;
            uVar.f23926b.b(gVar);
            t tVar = this.f1363d;
            if (!z10 && ((e10 = k.e(a.v(tVar, 8))) == 1 || e10 == 2 || e10 == 3)) {
                d10 = false;
                if (!d10 && z12) {
                    this.f1361b.mo2invoke();
                    return;
                }
            }
            d10 = a.d(tVar, z10, z11);
            if (!d10) {
            }
        } finally {
            u.b(uVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Boolean b(int i10, m1.d dVar, Function1 function1) {
        t tVar;
        boolean a10;
        t tVar2;
        b1 b1Var;
        l1.o oVar;
        l1.o oVar2;
        t tVar3 = this.f1363d;
        t f10 = a.f(tVar3);
        int i11 = 4;
        Function0 function0 = this.f1362c;
        if (f10 != null) {
            w2.k kVar = (w2.k) function0.mo2invoke();
            l1.k Q0 = f10.Q0();
            if (l1.b.a(i10, 1)) {
                oVar = Q0.f23902b;
            } else if (l1.b.a(i10, 2)) {
                oVar = Q0.f23903c;
            } else if (l1.b.a(i10, 5)) {
                oVar = Q0.f23904d;
            } else if (l1.b.a(i10, 6)) {
                oVar = Q0.f23905e;
            } else if (l1.b.a(i10, 3)) {
                int ordinal = kVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        oVar2 = Q0.f23909i;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    oVar2 = Q0.f23908h;
                }
                if (oVar2 == l1.o.f23914b) {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    oVar = Q0.f23906f;
                }
                oVar = oVar2;
            } else if (l1.b.a(i10, 4)) {
                int ordinal2 = kVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        oVar2 = Q0.f23908h;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    oVar2 = Q0.f23909i;
                }
                if (oVar2 == l1.o.f23914b) {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    oVar = Q0.f23907g;
                }
                oVar = oVar2;
            } else if (l1.b.a(i10, 7)) {
                oVar = (l1.o) Q0.f23910j.invoke(new l1.b(i10));
            } else if (l1.b.a(i10, 8)) {
                oVar = (l1.o) Q0.f23911k.invoke(new l1.b(i10));
            } else {
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            if (Intrinsics.a(oVar, l1.o.f23915c)) {
                return null;
            }
            tVar = null;
            if (!Intrinsics.a(oVar, l1.o.f23914b)) {
                return Boolean.valueOf(oVar.a(function1));
            }
        } else {
            tVar = null;
            f10 = null;
        }
        w2.k kVar2 = (w2.k) function0.mo2invoke();
        c.g gVar = new c.g(21, f10, this, function1);
        if (l1.b.a(i10, 1) || l1.b.a(i10, 2)) {
            if (l1.b.a(i10, 1)) {
                a10 = a.k(tVar3, gVar);
            } else if (l1.b.a(i10, 2)) {
                a10 = a.a(tVar3, gVar);
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            return Boolean.valueOf(a10);
        }
        if (l1.b.a(i10, 3) || l1.b.a(i10, 4) || l1.b.a(i10, 5) || l1.b.a(i10, 6)) {
            return a.J(i10, tVar3, dVar, gVar);
        }
        if (l1.b.a(i10, 7)) {
            int ordinal3 = kVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i11 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            t f11 = a.f(tVar3);
            if (f11 != null) {
                return a.J(i11, f11, dVar, gVar);
            }
            return tVar;
        }
        if (l1.b.a(i10, 8)) {
            t f12 = a.f(tVar3);
            boolean z10 = false;
            if (f12 != null) {
                n nVar = f12.f16405a;
                if (nVar.f16417m) {
                    n nVar2 = nVar.f16409e;
                    androidx.compose.ui.node.a y10 = c2.g.y(f12);
                    loop0: while (y10 != null) {
                        if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            while (nVar2 != null) {
                                if ((nVar2.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    n nVar3 = nVar2;
                                    ?? r62 = tVar;
                                    while (nVar3 != null) {
                                        if (nVar3 instanceof t) {
                                            t tVar4 = (t) nVar3;
                                            if (tVar4.Q0().f23901a) {
                                                tVar2 = tVar4;
                                                break loop0;
                                            }
                                        } else if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar3 instanceof c2.o)) {
                                            n nVar4 = ((c2.o) nVar3).f7801o;
                                            int i12 = 0;
                                            r62 = r62;
                                            while (nVar4 != null) {
                                                if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                    i12++;
                                                    r62 = r62;
                                                    if (i12 == 1) {
                                                        nVar3 = nVar4;
                                                    } else {
                                                        if (r62 == 0) {
                                                            r62 = new h(new n[16]);
                                                        }
                                                        if (nVar3 != null) {
                                                            r62.b(nVar3);
                                                            nVar3 = tVar;
                                                        }
                                                        r62.b(nVar4);
                                                    }
                                                }
                                                nVar4 = nVar4.f16410f;
                                                r62 = r62;
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        nVar3 = c2.g.f(r62);
                                    }
                                }
                                nVar2 = nVar2.f16409e;
                            }
                        }
                        y10 = y10.q();
                        if (y10 != null && (b1Var = y10.f1422w) != null) {
                            nVar2 = b1Var.f7657d;
                        } else {
                            nVar2 = tVar;
                        }
                    }
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            tVar2 = tVar;
            if (tVar2 != null && !Intrinsics.a(tVar2, tVar3)) {
                z10 = ((Boolean) gVar.invoke(tVar2)).booleanValue();
            }
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) l1.b.b(i10))).toString());
    }

    public final boolean c(int i10) {
        Boolean b10 = b(i10, null, new i(i10, 0));
        if (b10 == null) {
            return false;
        }
        boolean booleanValue = b10.booleanValue();
        if (!booleanValue && (l1.b.a(i10, 1) || l1.b.a(i10, 2))) {
            a(false, true, false);
            return d(i10, null);
        }
        return booleanValue;
    }

    public final boolean d(int i10, m1.d dVar) {
        u uVar = this.f1365f;
        boolean z10 = false;
        int i11 = 1;
        if (uVar.f23927c) {
            Boolean b10 = b(i10, dVar, new i(i10, i11));
            if (b10 == null) {
                return false;
            }
            return b10.booleanValue();
        }
        try {
            uVar.f23927c = true;
            Boolean b11 = b(i10, dVar, new i(i10, i11));
            if (b11 != null) {
                z10 = b11.booleanValue();
            }
            return z10;
        } finally {
            u.b(uVar);
        }
    }
}
