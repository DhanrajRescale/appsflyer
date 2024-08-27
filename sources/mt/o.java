package mt;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class o extends AtomicInteger implements ht.a, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28043a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28044b;

    public o(at.g gVar, Object obj) {
        this.f28043a = gVar;
        this.f28044b = obj;
    }

    @Override // ct.b
    public final void a() {
        set(3);
    }

    @Override // ht.c
    public final void clear() {
        lazySet(3);
    }

    @Override // ht.b
    public final int d() {
        lazySet(1);
        return 1;
    }

    @Override // ht.c
    public final Object i() {
        if (get() == 1) {
            lazySet(3);
            return this.f28044b;
        }
        return null;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        if (get() != 1) {
            return true;
        }
        return false;
    }

    @Override // ht.c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f28044b;
            at.g gVar = this.f28043a;
            gVar.b(obj);
            if (get() == 2) {
                lazySet(3);
                gVar.onComplete();
            }
        }
    }
}
