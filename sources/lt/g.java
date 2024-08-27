package lt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g extends AtomicInteger implements at.d, gv.a {
    private static final long serialVersionUID = 163080509307634843L;

    /* renamed from: a, reason: collision with root package name */
    public final at.d f25381a;

    /* renamed from: b, reason: collision with root package name */
    public gv.a f25382b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f25383c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f25384d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f25385e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f25386f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f25387g = new AtomicReference();

    public g(at.d dVar) {
        this.f25381a = dVar;
    }

    public final boolean a(boolean z10, boolean z11, at.d dVar, AtomicReference atomicReference) {
        if (this.f25385e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (z10) {
            Throwable th2 = this.f25384d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                dVar.onError(th2);
                return true;
            }
            if (z11) {
                dVar.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // at.d
    public final void b(Object obj) {
        this.f25387g.lazySet(obj);
        d();
    }

    @Override // at.d
    public final void c(gv.a aVar) {
        if (qt.c.a(this.f25382b, aVar)) {
            this.f25382b = aVar;
            this.f25381a.c(this);
            aVar.request();
        }
    }

    @Override // gv.a
    public final void cancel() {
        if (!this.f25385e) {
            this.f25385e = true;
            this.f25382b.cancel();
            if (getAndIncrement() == 0) {
                this.f25387g.lazySet(null);
            }
        }
    }

    public final void d() {
        boolean z10;
        boolean z11;
        if (getAndIncrement() != 0) {
            return;
        }
        at.d dVar = this.f25381a;
        AtomicLong atomicLong = this.f25386f;
        AtomicReference atomicReference = this.f25387g;
        int i10 = 1;
        do {
            long j10 = 0;
            while (true) {
                z10 = false;
                if (j10 == atomicLong.get()) {
                    break;
                }
                boolean z12 = this.f25383c;
                Object andSet = atomicReference.getAndSet(null);
                if (andSet == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (a(z12, z11, dVar, atomicReference)) {
                    return;
                }
                if (z11) {
                    break;
                }
                dVar.b(andSet);
                j10++;
            }
            if (j10 == atomicLong.get()) {
                boolean z13 = this.f25383c;
                if (atomicReference.get() == null) {
                    z10 = true;
                }
                if (a(z13, z10, dVar, atomicReference)) {
                    return;
                }
            }
            if (j10 != 0) {
                yk.g.O(atomicLong, j10);
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
    }

    @Override // at.d
    public final void onComplete() {
        this.f25383c = true;
        d();
    }

    @Override // at.d
    public final void onError(Throwable th2) {
        this.f25384d = th2;
        this.f25383c = true;
        d();
    }

    @Override // gv.a
    public final void request() {
        yk.g.b(this.f25386f);
        d();
    }
}
