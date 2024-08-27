package nt;

import at.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e extends AtomicReference implements at.n, ct.b {
    private static final long serialVersionUID = 3258103020495908596L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29133a;

    /* renamed from: b, reason: collision with root package name */
    public final et.d f29134b;

    public e(at.n nVar, et.d dVar) {
        this.f29133a = nVar;
        this.f29134b = dVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    public final boolean b() {
        return ft.b.c((ct.b) get());
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        if (ft.b.e(this, bVar)) {
            this.f29133a.c(this);
        }
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f29133a.onError(th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        at.n nVar = this.f29133a;
        try {
            Object apply = this.f29134b.apply(obj);
            gt.e.a(apply, "The single returned by the mapper is null");
            o oVar = (o) apply;
            if (!b()) {
                ((at.m) oVar).a(new a(this, nVar, 2));
            }
        } catch (Throwable th2) {
            zq.f.l0(th2);
            nVar.onError(th2);
        }
    }
}
