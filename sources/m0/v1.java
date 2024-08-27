package m0;

/* loaded from: classes.dex */
public final class v1 extends c2.o implements c2.m, c2.l1 {

    /* renamed from: p, reason: collision with root package name */
    public final a0.k f26931p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f26932q;

    /* renamed from: r, reason: collision with root package name */
    public final float f26933r;

    /* renamed from: s, reason: collision with root package name */
    public final n1.x f26934s;

    /* renamed from: t, reason: collision with root package name */
    public q0.z f26935t;

    public v1(a0.k kVar, boolean z10, float f10, n1.x xVar) {
        this.f26931p = kVar;
        this.f26932q = z10;
        this.f26933r = f10;
        this.f26934s = xVar;
    }

    @Override // g1.n
    public final void I0() {
        c2.g.w(this, new u1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [q0.b, q0.z] */
    public final void T0() {
        q0.d dVar;
        if (!((m5) c2.g.p(this, n5.f26535b)).f26492a) {
            c2.n nVar = this.f26935t;
            if (nVar != null) {
                R0(nVar);
                return;
            }
            return;
        }
        if (this.f26935t == null) {
            t1 t1Var = new t1(this, 0);
            u1 u1Var = new u1(this, 0);
            a0.k kVar = this.f26931p;
            boolean z10 = this.f26932q;
            float f10 = this.f26933r;
            w.x1 x1Var = q0.x.f31552a;
            if (q0.d0.f31478a) {
                dVar = new q0.d(kVar, z10, f10, t1Var, u1Var);
            } else {
                ?? zVar = new q0.z(kVar, z10, f10, t1Var, u1Var);
                zVar.f31468w = m1.f.f27251b;
                dVar = zVar;
            }
            Q0(dVar);
            this.f26935t = dVar;
        }
    }

    @Override // c2.l1
    public final void j0() {
        T0();
    }
}
