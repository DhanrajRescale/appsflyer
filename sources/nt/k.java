package nt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class k extends AtomicReference implements at.n {
    private static final long serialVersionUID = 2071387740092105509L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29150a;

    public k(at.n nVar) {
        this.f29150a = nVar;
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f29150a.onError(th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        this.f29150a.onSuccess(obj);
    }
}
