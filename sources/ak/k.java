package ak;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object f517a;

    /* renamed from: b, reason: collision with root package name */
    public Object f518b;

    /* renamed from: c, reason: collision with root package name */
    public Object f519c;

    public k(xj.c cVar, Object obj, xj.k kVar) {
        this.f517a = cVar;
        this.f518b = obj;
        this.f519c = kVar;
    }

    public final void a(q qVar, xj.k kVar) {
        try {
            qVar.a().a((xj.g) this.f517a, new k((xj.n) this.f518b, (d0) this.f519c, kVar));
        } finally {
            ((d0) this.f519c).a();
        }
    }

    public k(r rVar, nk.f fVar, v vVar) {
        this.f519c = rVar;
        this.f518b = fVar;
        this.f517a = vVar;
    }
}
