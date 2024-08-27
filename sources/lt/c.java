package lt;

/* loaded from: classes2.dex */
public final class c implements at.g, gv.a {

    /* renamed from: a, reason: collision with root package name */
    public final at.d f25374a;

    /* renamed from: b, reason: collision with root package name */
    public ct.b f25375b;

    public c(at.d dVar) {
        this.f25374a = dVar;
    }

    @Override // at.g
    public final void b(Object obj) {
        this.f25374a.b(obj);
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        this.f25375b = bVar;
        this.f25374a.c(this);
    }

    @Override // gv.a
    public final void cancel() {
        this.f25375b.a();
    }

    @Override // at.g
    public final void onComplete() {
        this.f25374a.onComplete();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        this.f25374a.onError(th2);
    }

    @Override // gv.a
    public final void request() {
    }
}
