package kt;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class m implements at.b {

    /* renamed from: a, reason: collision with root package name */
    public final ct.a f23518a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23519b;

    /* renamed from: c, reason: collision with root package name */
    public final at.b f23520c;

    public m(ct.a aVar, AtomicBoolean atomicBoolean, at.b bVar) {
        this.f23518a = aVar;
        this.f23519b = atomicBoolean;
        this.f23520c = bVar;
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        this.f23518a.c(bVar);
    }

    @Override // at.b
    public final void onComplete() {
        if (this.f23519b.compareAndSet(false, true)) {
            this.f23518a.a();
            this.f23520c.onComplete();
        }
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        if (this.f23519b.compareAndSet(false, true)) {
            this.f23518a.a();
            this.f23520c.onError(th2);
        } else {
            yk.g.M(th2);
        }
    }
}
