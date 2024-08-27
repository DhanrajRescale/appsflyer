package g1;

import c2.i1;
import c2.m1;
import d2.a0;
import qu.c0;
import qu.f0;
import qu.o1;
import qu.q1;
import w.z0;

/* loaded from: classes.dex */
public abstract class n implements c2.n {

    /* renamed from: b, reason: collision with root package name */
    public vu.f f16406b;

    /* renamed from: c, reason: collision with root package name */
    public int f16407c;

    /* renamed from: e, reason: collision with root package name */
    public n f16409e;

    /* renamed from: f, reason: collision with root package name */
    public n f16410f;

    /* renamed from: g, reason: collision with root package name */
    public m1 f16411g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f16412h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16413i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16414j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16415k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16416l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16417m;

    /* renamed from: a, reason: collision with root package name */
    public n f16405a = this;

    /* renamed from: d, reason: collision with root package name */
    public int f16408d = -1;

    public final f0 E0() {
        vu.f fVar = this.f16406b;
        if (fVar == null) {
            vu.f d10 = hl.f.d(((a0) c2.g.z(this)).getCoroutineContext().l(new q1((o1) ((a0) c2.g.z(this)).getCoroutineContext().g(c0.f32192b))));
            this.f16406b = d10;
            return d10;
        }
        return fVar;
    }

    public boolean F0() {
        return !(this instanceof k1.j);
    }

    public void G0() {
        boolean z10;
        if (!this.f16417m) {
            if (this.f16412h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f16417m = true;
                this.f16415k = true;
                return;
            } else {
                t0.t.C0("attach invoked on a node without a coordinator");
                throw null;
            }
        }
        t0.t.C0("node attached multiple times");
        throw null;
    }

    public void H0() {
        if (this.f16417m) {
            if (!this.f16415k) {
                if (!this.f16416l) {
                    this.f16417m = false;
                    vu.f fVar = this.f16406b;
                    if (fVar != null) {
                        hl.f.A(fVar, new z0(3));
                        this.f16406b = null;
                        return;
                    }
                    return;
                }
                t0.t.C0("Must run runDetachLifecycle() before markAsDetached()");
                throw null;
            }
            t0.t.C0("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        t0.t.C0("Cannot detach a node that is not attached");
        throw null;
    }

    public void I0() {
    }

    public void J0() {
    }

    public void K0() {
    }

    public void L0() {
        if (this.f16417m) {
            K0();
        } else {
            t0.t.C0("reset() called on an unattached node");
            throw null;
        }
    }

    public void M0() {
        if (this.f16417m) {
            if (this.f16415k) {
                this.f16415k = false;
                I0();
                this.f16416l = true;
                return;
            }
            t0.t.C0("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        t0.t.C0("Must run markAsAttached() prior to runAttachLifecycle");
        throw null;
    }

    public void N0() {
        boolean z10;
        if (this.f16417m) {
            if (this.f16412h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f16416l) {
                    this.f16416l = false;
                    J0();
                    return;
                } else {
                    t0.t.C0("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                    throw null;
                }
            }
            t0.t.C0("detach invoked on a node without a coordinator");
            throw null;
        }
        t0.t.C0("node detached multiple times");
        throw null;
    }

    public void O0(n nVar) {
        this.f16405a = nVar;
    }

    public void P0(i1 i1Var) {
        this.f16412h = i1Var;
    }
}
