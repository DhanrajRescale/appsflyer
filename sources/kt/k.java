package kt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class k extends AtomicReference implements at.b, ct.b, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23514a;

    /* renamed from: b, reason: collision with root package name */
    public final ft.e f23515b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final at.a f23516c;

    /* JADX WARN: Type inference failed for: r1v1, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    public k(at.a aVar, at.b bVar) {
        this.f23514a = bVar;
        this.f23516c = aVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
        ft.e eVar = this.f23515b;
        eVar.getClass();
        ft.b.b(eVar);
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.b
    public final void onComplete() {
        this.f23514a.onComplete();
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        this.f23514a.onError(th2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23516c.a(this);
    }
}
