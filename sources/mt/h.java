package mt;

/* loaded from: classes2.dex */
public final class h implements at.g, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final at.b f28017a;

    /* renamed from: b, reason: collision with root package name */
    public ct.b f28018b;

    public h(at.b bVar) {
        this.f28017a = bVar;
    }

    @Override // ct.b
    public final void a() {
        this.f28018b.a();
    }

    @Override // at.g
    public final void b(Object obj) {
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        this.f28018b = bVar;
        this.f28017a.c(this);
    }

    @Override // at.g
    public final void onComplete() {
        this.f28017a.onComplete();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        this.f28017a.onError(th2);
    }
}
