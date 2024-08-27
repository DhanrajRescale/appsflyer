package nt;

/* loaded from: classes2.dex */
public final class c implements at.n {

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29128a;

    /* renamed from: b, reason: collision with root package name */
    public final et.c f29129b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29130c;

    public c(at.n nVar, et.c cVar) {
        this.f29128a = nVar;
        this.f29129b = cVar;
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        at.n nVar = this.f29128a;
        try {
            this.f29129b.b(bVar);
            nVar.c(bVar);
        } catch (Throwable th2) {
            zq.f.l0(th2);
            this.f29130c = true;
            bVar.a();
            nVar.c(ft.c.f16242a);
            nVar.onError(th2);
        }
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        if (this.f29130c) {
            yk.g.M(th2);
        } else {
            this.f29128a.onError(th2);
        }
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        if (this.f29130c) {
            return;
        }
        this.f29128a.onSuccess(obj);
    }
}
