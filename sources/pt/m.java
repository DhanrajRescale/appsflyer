package pt;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f31373a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f31374b;

    /* renamed from: c, reason: collision with root package name */
    public final ct.a f31375c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f31376d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f31377e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadFactory f31378f;

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, ct.a] */
    public m(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
        long j11;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        if (timeUnit != null) {
            j11 = timeUnit.toNanos(j10);
        } else {
            j11 = 0;
        }
        long j12 = j11;
        this.f31373a = j12;
        this.f31374b = new ConcurrentLinkedQueue();
        this.f31375c = new Object();
        this.f31378f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, p.f31385d);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j12, j12, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f31376d = scheduledExecutorService;
        this.f31377e = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f31374b;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.f31383c <= nanoTime) {
                    if (concurrentLinkedQueue.remove(oVar)) {
                        this.f31375c.b(oVar);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
