package nt;

import at.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l extends AtomicReference implements at.n, Runnable, ct.b {
    private static final long serialVersionUID = 37497744973048446L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29151a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f29152b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final k f29153c;

    /* renamed from: d, reason: collision with root package name */
    public o f29154d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29155e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f29156f;

    public l(at.n nVar, o oVar, long j10, TimeUnit timeUnit) {
        this.f29151a = nVar;
        this.f29154d = oVar;
        this.f29155e = j10;
        this.f29156f = timeUnit;
        if (oVar != null) {
            this.f29153c = new k(nVar);
        } else {
            this.f29153c = null;
        }
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
        ft.b.b(this.f29152b);
        k kVar = this.f29153c;
        if (kVar != null) {
            ft.b.b(kVar);
        }
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        ct.b bVar = (ct.b) get();
        ft.b bVar2 = ft.b.f16240a;
        if (bVar != bVar2 && compareAndSet(bVar, bVar2)) {
            ft.b.b(this.f29152b);
            this.f29151a.onError(th2);
        } else {
            yk.g.M(th2);
        }
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        ct.b bVar = (ct.b) get();
        ft.b bVar2 = ft.b.f16240a;
        if (bVar != bVar2 && compareAndSet(bVar, bVar2)) {
            ft.b.b(this.f29152b);
            this.f29151a.onSuccess(obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ct.b bVar = (ct.b) get();
        ft.b bVar2 = ft.b.f16240a;
        if (bVar != bVar2 && compareAndSet(bVar, bVar2)) {
            if (bVar != null) {
                bVar.a();
            }
            o oVar = this.f29154d;
            if (oVar == null) {
                this.f29151a.onError(new TimeoutException(rt.b.a(this.f29155e, this.f29156f)));
            } else {
                this.f29154d = null;
                ((at.m) oVar).a(this.f29153c);
            }
        }
    }
}
