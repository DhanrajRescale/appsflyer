package i5;

/* loaded from: classes.dex */
public final class l implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f19538a;

    /* renamed from: b, reason: collision with root package name */
    public final k f19539b;

    /* renamed from: c, reason: collision with root package name */
    public f f19540c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f19541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19542e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19543f;

    public l(k kVar, e5.b bVar) {
        this.f19539b = kVar;
        this.f19538a = new k1(bVar);
    }

    @Override // i5.o0
    public final void a(b5.u0 u0Var) {
        o0 o0Var = this.f19541d;
        if (o0Var != null) {
            o0Var.a(u0Var);
            u0Var = this.f19541d.d();
        }
        this.f19538a.a(u0Var);
    }

    @Override // i5.o0
    public final long b() {
        if (this.f19542e) {
            return this.f19538a.b();
        }
        o0 o0Var = this.f19541d;
        o0Var.getClass();
        return o0Var.b();
    }

    @Override // i5.o0
    public final b5.u0 d() {
        o0 o0Var = this.f19541d;
        if (o0Var != null) {
            return o0Var.d();
        }
        return this.f19538a.f19537e;
    }
}
