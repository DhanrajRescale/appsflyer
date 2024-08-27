package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o extends g1.n {

    /* renamed from: n, reason: collision with root package name */
    public final int f7800n = g.m(this);

    /* renamed from: o, reason: collision with root package name */
    public g1.n f7801o;

    @Override // g1.n
    public final void G0() {
        super.G0();
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.P0(this.f16412h);
            if (!nVar.f16417m) {
                nVar.G0();
            }
        }
    }

    @Override // g1.n
    public final void H0() {
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.H0();
        }
        super.H0();
    }

    @Override // g1.n
    public final void L0() {
        super.L0();
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.L0();
        }
    }

    @Override // g1.n
    public final void M0() {
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.M0();
        }
        super.M0();
    }

    @Override // g1.n
    public final void N0() {
        super.N0();
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.N0();
        }
    }

    @Override // g1.n
    public final void O0(g1.n nVar) {
        this.f16405a = nVar;
        for (g1.n nVar2 = this.f7801o; nVar2 != null; nVar2 = nVar2.f16410f) {
            nVar2.O0(nVar);
        }
    }

    @Override // g1.n
    public final void P0(i1 i1Var) {
        this.f16412h = i1Var;
        for (g1.n nVar = this.f7801o; nVar != null; nVar = nVar.f16410f) {
            nVar.P0(i1Var);
        }
    }

    public final void Q0(n nVar) {
        g1.n nVar2;
        g1.n nVar3 = ((g1.n) nVar).f16405a;
        g1.n nVar4 = null;
        if (nVar3 != nVar) {
            if (nVar instanceof g1.n) {
                nVar2 = (g1.n) nVar;
            } else {
                nVar2 = null;
            }
            if (nVar2 != null) {
                nVar4 = nVar2.f16409e;
            }
            if (nVar3 == this.f16405a && Intrinsics.a(nVar4, this)) {
                return;
            } else {
                throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
            }
        }
        if (!nVar3.f16417m) {
            nVar3.O0(this.f16405a);
            int i10 = this.f16407c;
            int n10 = g.n(nVar3);
            nVar3.f16407c = n10;
            int i11 = this.f16407c;
            int i12 = n10 & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof c0)) {
                t0.t.C0("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar3);
                throw null;
            }
            nVar3.f16410f = this.f7801o;
            this.f7801o = nVar3;
            nVar3.f16409e = this;
            S0(n10 | i11, false);
            if (this.f16417m) {
                if (i12 != 0 && (i10 & 2) == 0) {
                    b1 b1Var = g.y(this).f1422w;
                    this.f16405a.P0(null);
                    b1Var.g();
                } else {
                    P0(this.f16412h);
                }
                nVar3.G0();
                nVar3.M0();
                g.h(nVar3);
                return;
            }
            return;
        }
        t0.t.C0("Cannot delegate to an already attached node");
        throw null;
    }

    public final void R0(n nVar) {
        g1.n nVar2 = null;
        for (g1.n nVar3 = this.f7801o; nVar3 != null; nVar3 = nVar3.f16410f) {
            if (nVar3 == nVar) {
                boolean z10 = nVar3.f16417m;
                if (z10) {
                    if (z10) {
                        g.i(nVar3, -1, 2);
                        nVar3.N0();
                        nVar3.H0();
                    } else {
                        t0.t.C0("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                }
                nVar3.O0(nVar3);
                nVar3.f16408d = 0;
                if (nVar2 == null) {
                    this.f7801o = nVar3.f16410f;
                } else {
                    nVar2.f16410f = nVar3.f16410f;
                }
                nVar3.f16410f = null;
                nVar3.f16409e = null;
                int i10 = this.f16407c;
                int n10 = g.n(this);
                S0(n10, true);
                if (this.f16417m && (i10 & 2) != 0 && (n10 & 2) == 0) {
                    b1 b1Var = g.y(this).f1422w;
                    this.f16405a.P0(null);
                    b1Var.g();
                    return;
                }
                return;
            }
            nVar2 = nVar3;
        }
        throw new IllegalStateException(("Could not find delegate: " + nVar).toString());
    }

    public final void S0(int i10, boolean z10) {
        int i11;
        g1.n nVar;
        int i12 = this.f16407c;
        this.f16407c = i10;
        if (i12 != i10) {
            g1.n nVar2 = this.f16405a;
            if (nVar2 == this) {
                this.f16408d = i10;
            }
            if (this.f16417m) {
                g1.n nVar3 = this;
                while (nVar3 != null) {
                    i10 |= nVar3.f16407c;
                    nVar3.f16407c = i10;
                    if (nVar3 == nVar2) {
                        break;
                    } else {
                        nVar3 = nVar3.f16409e;
                    }
                }
                if (z10 && nVar3 == nVar2) {
                    i10 = g.n(nVar2);
                    nVar2.f16407c = i10;
                }
                if (nVar3 != null && (nVar = nVar3.f16410f) != null) {
                    i11 = nVar.f16408d;
                } else {
                    i11 = 0;
                }
                int i13 = i10 | i11;
                while (nVar3 != null) {
                    i13 |= nVar3.f16407c;
                    nVar3.f16408d = i13;
                    nVar3 = nVar3.f16409e;
                }
            }
        }
    }
}
