package nt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g extends AtomicReference implements at.n, ct.b, Runnable {
    private static final long serialVersionUID = 3528003840217436037L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29138a;

    /* renamed from: b, reason: collision with root package name */
    public final at.l f29139b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29140c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f29141d;

    public g(at.n nVar, at.l lVar) {
        this.f29138a = nVar;
        this.f29139b = lVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        if (ft.b.e(this, bVar)) {
            this.f29138a.c(this);
        }
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f29141d = th2;
        ft.b.d(this, this.f29139b.b(this));
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        this.f29140c = obj;
        ft.b.d(this, this.f29139b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2 = this.f29141d;
        at.n nVar = this.f29138a;
        if (th2 != null) {
            nVar.onError(th2);
        } else {
            nVar.onSuccess(this.f29140c);
        }
    }
}
