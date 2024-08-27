package lt;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class e extends AtomicLong implements at.d, gv.a {
    private static final long serialVersionUID = -3176480756392482682L;

    /* renamed from: a, reason: collision with root package name */
    public final at.d f25377a;

    /* renamed from: b, reason: collision with root package name */
    public gv.a f25378b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25379c;

    public e(at.d dVar) {
        this.f25377a = dVar;
    }

    @Override // at.d
    public final void b(Object obj) {
        if (this.f25379c) {
            return;
        }
        if (get() != 0) {
            this.f25377a.b(obj);
            yk.g.O(this, 1L);
        } else {
            onError(new RuntimeException("could not emit value due to lack of requests"));
        }
    }

    @Override // at.d
    public final void c(gv.a aVar) {
        if (qt.c.a(this.f25378b, aVar)) {
            this.f25378b = aVar;
            this.f25377a.c(this);
            aVar.request();
        }
    }

    @Override // gv.a
    public final void cancel() {
        this.f25378b.cancel();
    }

    @Override // at.d
    public final void onComplete() {
        if (this.f25379c) {
            return;
        }
        this.f25379c = true;
        this.f25377a.onComplete();
    }

    @Override // at.d
    public final void onError(Throwable th2) {
        if (this.f25379c) {
            yk.g.M(th2);
        } else {
            this.f25379c = true;
            this.f25377a.onError(th2);
        }
    }

    @Override // gv.a
    public final void request() {
        yk.g.b(this);
    }
}
