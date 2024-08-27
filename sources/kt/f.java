package kt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f extends AtomicReference implements at.b, ct.b, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23495a;

    /* renamed from: b, reason: collision with root package name */
    public final at.l f23496b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f23497c;

    public f(at.b bVar, at.l lVar) {
        this.f23495a = bVar;
        this.f23496b = lVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        if (ft.b.e(this, bVar)) {
            this.f23495a.c(this);
        }
    }

    @Override // at.b
    public final void onComplete() {
        ft.b.d(this, this.f23496b.b(this));
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        this.f23497c = th2;
        ft.b.d(this, this.f23496b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2 = this.f23497c;
        at.b bVar = this.f23495a;
        if (th2 != null) {
            this.f23497c = null;
            bVar.onError(th2);
        } else {
            bVar.onComplete();
        }
    }
}
