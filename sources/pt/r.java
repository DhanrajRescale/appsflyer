package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class r extends at.k {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f31393a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f31394b;

    public r(ThreadFactory threadFactory) {
        boolean z10 = x.f31404a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (x.f31404a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            x.f31407d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f31393a = newScheduledThreadPool;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f31394b) {
            this.f31394b = true;
            this.f31393a.shutdownNow();
        }
    }

    @Override // at.k
    public final ct.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (this.f31394b) {
            return ft.c.f16242a;
        }
        return e(runnable, j10, timeUnit, null);
    }

    public final w e(Runnable runnable, long j10, TimeUnit timeUnit, ft.a aVar) {
        Future schedule;
        if (runnable != null) {
            w wVar = new w(runnable, aVar);
            if (aVar != null && !aVar.c(wVar)) {
                return wVar;
            }
            ScheduledExecutorService scheduledExecutorService = this.f31393a;
            try {
                if (j10 <= 0) {
                    schedule = scheduledExecutorService.submit((Callable) wVar);
                } else {
                    schedule = scheduledExecutorService.schedule((Callable) wVar, j10, timeUnit);
                }
                wVar.b(schedule);
            } catch (RejectedExecutionException e10) {
                if (aVar != null) {
                    aVar.b(wVar);
                }
                yk.g.M(e10);
            }
            return wVar;
        }
        throw new NullPointerException("run is null");
    }
}
