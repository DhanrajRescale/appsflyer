package pt;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class a extends AtomicReference implements ct.b {

    /* renamed from: c, reason: collision with root package name */
    public static final FutureTask f31334c;

    /* renamed from: d, reason: collision with root package name */
    public static final FutureTask f31335d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f31336a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f31337b;

    static {
        gt.b bVar = gt.e.f17569a;
        f31334c = new FutureTask(bVar, null);
        f31335d = new FutureTask(bVar, null);
    }

    public a(Runnable runnable) {
        this.f31336a = runnable;
    }

    @Override // ct.b
    public final void a() {
        FutureTask futureTask;
        boolean z10;
        Future future = (Future) get();
        if (future != f31334c && future != (futureTask = f31335d) && compareAndSet(future, futureTask) && future != null) {
            if (this.f31337b != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            future.cancel(z10);
        }
    }

    public final void b(Future future) {
        Future future2;
        boolean z10;
        do {
            future2 = (Future) get();
            if (future2 != f31334c) {
                if (future2 == f31335d) {
                    if (this.f31337b != Thread.currentThread()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    future.cancel(z10);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
