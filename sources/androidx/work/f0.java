package androidx.work;

/* loaded from: classes.dex */
public final class f0 implements at.n, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final l8.j f2562a;

    /* renamed from: b, reason: collision with root package name */
    public ct.b f2563b;

    /* JADX WARN: Type inference failed for: r0v0, types: [l8.h, l8.j, java.lang.Object] */
    public f0() {
        ?? obj = new Object();
        this.f2562a = obj;
        obj.a(this, RxWorker.INSTANT_EXECUTOR);
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        this.f2563b = bVar;
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f2562a.k(th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        this.f2562a.j(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ct.b bVar;
        if ((this.f2562a.f24227a instanceof l8.a) && (bVar = this.f2563b) != null) {
            bVar.a();
        }
    }
}
