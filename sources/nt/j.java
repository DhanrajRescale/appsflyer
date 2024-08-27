package nt;

import at.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements at.n, ct.b, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29147a;

    /* renamed from: b, reason: collision with root package name */
    public final ft.e f29148b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final o f29149c;

    /* JADX WARN: Type inference failed for: r1v1, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    public j(at.n nVar, o oVar) {
        this.f29147a = nVar;
        this.f29149c = oVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
        ft.e eVar = this.f29148b;
        eVar.getClass();
        ft.b.b(eVar);
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f29147a.onError(th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        this.f29147a.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((at.m) this.f29149c).a(this);
    }
}
