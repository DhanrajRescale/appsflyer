package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l implements Callable, ct.b {

    /* renamed from: f, reason: collision with root package name */
    public static final FutureTask f31367f = new FutureTask(gt.e.f17569a, null);

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f31368a;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f31371d;

    /* renamed from: e, reason: collision with root package name */
    public Thread f31372e;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f31370c = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f31369b = new AtomicReference();

    public l(mt.i iVar, ScheduledExecutorService scheduledExecutorService) {
        this.f31368a = iVar;
        this.f31371d = scheduledExecutorService;
    }

    @Override // ct.b
    public final void a() {
        boolean z10;
        AtomicReference atomicReference = this.f31370c;
        FutureTask futureTask = f31367f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z11 = false;
        if (future != null && future != futureTask) {
            if (this.f31372e != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            future.cancel(z10);
        }
        Future future2 = (Future) this.f31369b.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.f31372e != Thread.currentThread()) {
                z11 = true;
            }
            future2.cancel(z11);
        }
    }

    public final void b(Future future) {
        boolean z10;
        while (true) {
            AtomicReference atomicReference = this.f31370c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f31367f) {
                if (this.f31372e != Thread.currentThread()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                future.cancel(z10);
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z10;
        this.f31372e = Thread.currentThread();
        try {
            this.f31368a.run();
            Future submit = this.f31371d.submit(this);
            loop0: while (true) {
                AtomicReference atomicReference = this.f31369b;
                Future future = (Future) atomicReference.get();
                if (future == f31367f) {
                    if (this.f31372e != Thread.currentThread()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    submit.cancel(z10);
                }
                while (!atomicReference.compareAndSet(future, submit)) {
                    if (atomicReference.get() != future) {
                        break;
                    }
                }
            }
            this.f31372e = null;
        } catch (Throwable th2) {
            this.f31372e = null;
            yk.g.M(th2);
        }
        return null;
    }
}
