package kt;

/* loaded from: classes2.dex */
public final class e implements at.n {

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23494a;

    public e(at.b bVar) {
        this.f23494a = bVar;
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        this.f23494a.c(bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f23494a.onError(th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        this.f23494a.onComplete();
    }
}
